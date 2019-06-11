package jp.co.netprotections.dto;
/*
 * 様々なプロパティに対するgetter/setterメソッドを備えている
 */
public class MemberJudgeResponseDto {
	private String memberName;
	private boolean enlistedPropriety;
	private String errorMessage;

	public MemberJudgeResponseDto (String memberName){
		this.memberName = memberName;
	}

	public MemberJudgeResponseDto (String memberName, String errorMessage) {
		this(memberName);
		this.errorMessage = errorMessage;
	}

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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
