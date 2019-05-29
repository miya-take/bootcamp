package jp.co.netprotections.dto;
/*
 * 様々なプロパティに対するgetter/setterメソッドを備えている
 */
public class MemberJudgeResponseDto {
	private String memberName;
	private boolean enlistedPropriety;

//	public MemberJudgeResponseDto (String memberName, boolean enlistedPropriety){
//		this.memberName = memberName;
//		this.enlistedPropriety = enlistedPropriety;
//	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public boolean getEnlistedPropriety() {
		return enlistedPropriety;
	}

	public void setEnlistedPropriety(boolean enlistedPropriety) {
		this.enlistedPropriety = enlistedPropriety;
	}
}
