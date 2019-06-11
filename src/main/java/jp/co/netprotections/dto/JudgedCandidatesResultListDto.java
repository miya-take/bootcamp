package jp.co.netprotections.dto;

import java.util.List;

public class JudgedCandidatesResultListDto {
	private List<MemberJudgeResponseDto> judgeCandidatesResultList;

	public List<MemberJudgeResponseDto> getJudgeCandidatesResultList() {
		return this.judgeCandidatesResultList;
	}

	public void setJudgeCandidatesResultList (List<MemberJudgeResponseDto> judgeCandidatesResultList) {
		this.judgeCandidatesResultList = judgeCandidatesResultList;
	}

	/*
	 * memo add で直接に追加することはできない
	 * 結果を格納するリストインスタンスを生成。
	 * そのリストを上のsetterで導入する
	 *
	 * なぜ、下のaddでは、それぞれの候補者の結果を挿入できないのか。＾
	 * また、addの方法に固執せず、一度リストを生成し、それで挿入する方法を考えつかなかったのか
	 *
	 */
	public void addEachCandidateResult(MemberJudgeResponseDto judgedCandidate) {
		judgeCandidatesResultList.add(judgedCandidate);
	}


//	public void setMemberJudgeResponse(ArrayList judgeCandidatesResultList) {
//		this.judgeCandidatesResultList = judgeCandidatesResultList;
//	}


}
