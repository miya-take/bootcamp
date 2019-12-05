package jp.co.netprotections.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 入退社候補者の判定結果のDTO
 * 
 * @author t.miyazawa
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberJudgeResponseDto {
	private String memberName;
	private boolean enlistedPropriety;
}
