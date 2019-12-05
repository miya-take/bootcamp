package jp.co.netprotections.dto;

import lombok.Data;

/**
 * @author t.miyazawa 一人一人の隊員の判定結果のDTO
 */
@Data
public class MemberJudgeResponseDto {
	private String memberName;
	private boolean enlistedPropriety;
}
