package jp.co.netprotections.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberCandidatesListDto;

@RestController // WebAPIの機能を追加するアノテーション
public class MemberJudgeController {
	//Bodyから受け付ける
	@RequestMapping(
			value = "/judgemember",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE
			)
	@ResponseBody
	public String getListNumber(@RequestBody MemberCandidatesListDto dto){
		return dto[1];
		int test =  dto.getMemberJudgeRequestNumber();

	}
//	public MemberJudgeResponseDto execute(@RequestBody MemberJudgeRequestDto dto) {
//////		System.out.println(ObjectMapper());
//		MemberJudgeResponseDto response = new MemberJudgeResponseDto();
//		// 判定インスタンス
//		MemberJudgeServiceImpl judgeMember = new MemberJudgeServiceImpl();
//		Boolean judgeResult =  judgeMember.JudgeTotalAbility(dto.getEventPlanning(), dto.getCogitation(), dto.getCoodination(), dto.getProgrammingAbility(), dto.getInfrastructureKnowledge());
//		response.setMemberName(dto.getMemberName());
//		response.setEnlistedPropriety(judgeResult);
//		return response;
//	}
}
