package jp.co.netprotections.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class JudgedCandidatesResultListDto {
	@Autowired
	List<MemberJudgeResponseDto> judgeCandidatesResultList = new ArrayList<MemberJudgeResponseDto>();

	public List<MemberJudgeResponseDto> getMemberJudgeResponse() {
		return judgeCandidatesResultList;
	}

	public void addMemberJudgeResponse(MemberJudgeResponseDto judgedMember) {
		judgeCandidatesResultList.add(judgedMember);
	}

//	public void setMemberJudgeResponse(ArrayList judgeCandidatesResultList) {
//		this.judgeCandidatesResultList = judgeCandidatesResultList;
//	}


}
