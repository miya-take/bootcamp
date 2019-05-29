package jp.co.netprotections.dto;

import java.util.List;


public class MemberCandidatesListDto {
	private List<MemberJudgeRequestDto> memberCandidatesList;

//	MemberCandidatesListDto(){
//		memberCandidatesList = new ArrayList<MemberJudgeRequestDto>();
//	}

	public List<MemberJudgeRequestDto> getMemberCandidateList() {
		return this.memberCandidatesList;
	}

	public void setMemberCandidatesList (List<MemberJudgeRequestDto> memberCandidatesList) {
		this.memberCandidatesList = memberCandidatesList;
	}


	public void addMemberJudgeRequest(MemberJudgeRequestDto judgedMember) {
		memberCandidatesList.add(judgedMember);
	}

	public String getEachMember(List<MemberJudgeRequestDto> memberCandidatesList) {
		String result = memberCandidatesList[1];
		return result;
	}

	public int getMemberJudgeRequestNumber() {
		return memberCandidatesList.size();
	}


//	public void setmemberCandidateList(List memberCandidateList) {
//		this.memberCandidatesList = memberCandidateList;
//	}

}
