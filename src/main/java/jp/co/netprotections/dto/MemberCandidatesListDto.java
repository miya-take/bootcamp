package jp.co.netprotections.dto;

import java.util.List;


public class MemberCandidatesListDto {
	private List<MemberJudgeRequestDto> memberCandidatesList;

	public List<MemberJudgeRequestDto> getMemberCandidateList() {
		return this.memberCandidatesList;
	}

	public void setMemberCandidatesList (List<MemberJudgeRequestDto> memberCandidatesList) {
		this.memberCandidatesList = memberCandidatesList;
	}


	public void addMemberJudgeRequest(MemberJudgeRequestDto judgedMember) {
		memberCandidatesList.add(judgedMember);
	}

	public int getMemberJudgeRequestNumber() {
		return memberCandidatesList.size();
	}

	public Object getEachCandidate(int i) {
		return memberCandidatesList.get(i);
	}

}
