package jp.co.netprotections.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 入退社判定候補者のDTO
 * 
 * @author t.miyazawa
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberJudgeRequestDto {
	private String memberName;
	private int eventPlanning;
	private int cogitation;
	private int coodination;
	private int programmingAbility;
	private int infrastructureKnowledge;

}