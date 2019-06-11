package jp.co.netprotections.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import jp.co.netprotections.dto.JudgedCandidatesResultListDto;
import jp.co.netprotections.dto.MemberCandidatesListDto;
import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.InputCheckServiceImpl;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RestController // WebAPIの機能を追加するアノテーション
public class MemberJudgeController {
	// validation
	InputCheckServiceImpl checkInput = new InputCheckServiceImpl();
	// 能力判定logic
	MemberJudgeServiceImpl judgeStandard = new MemberJudgeServiceImpl();
	//Bodyから受け付ける
	@RequestMapping(
			value = "/judgemember",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE
			)
	@ResponseBody
	public JudgedCandidatesResultListDto execute(@RequestBody MemberCandidatesListDto dto) throws JsonProcessingException{
		// 最終的に返却する候補者リスト
		JudgedCandidatesResultListDto resultList = new JudgedCandidatesResultListDto();
		// 一時的に判定結果を保存するリスト
		List<MemberJudgeResponseDto> judgedList = new ArrayList<MemberJudgeResponseDto>();
		// 候補者メンバーそれぞれを判定する
		for(int i = 0; i< dto.getMemberJudgeRequestNumber(); i++) {
				// 候補者インスタンス
				MemberJudgeRequestDto candidate = (MemberJudgeRequestDto) dto.getEachCandidate(i);
//				System.out.println(new ObjectMapper().writeValueAsString(candidate.getMemberName().getClass()));
				MemberJudgeResponseDto judgedCandidate = new MemberJudgeResponseDto(candidate.getMemberName(),"判定成功");

				if (checkInput.CheckEachParameter(candidate)) {
				// 入力にエラーがないときの処理
					judgedCandidate.setMemberName(candidate.getMemberName());
					judgedCandidate.setEnlistedPropriety(judgeStandard.JudgeEachMember(candidate));
					judgedList.add(judgedCandidate);
				} else {
					// 入力にエラーがあったときの処理
					judgedCandidate.setMemberName(null);
					judgedCandidate.setErrorMessage("入力した値に誤りがあります");
					judgedCandidate.setEnlistedPropriety(false);
					judgedList.add(judgedCandidate);
				}
		}
		judgeStandard.sortCandidatesByEnlistedPropriety(judgedList);
		resultList.setJudgeCandidatesResultList(judgedList);
		return resultList;
	}
}
