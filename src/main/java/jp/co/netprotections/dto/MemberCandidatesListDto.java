package jp.co.netprotections.dto;

import java.util.List;

import lombok.Data;

/**
 * @author t.miyazawa 入退社候補者リストのDTO
 */
@Data
public class MemberCandidatesListDto {
	private List<MemberJudgeRequestDto> memberCandidatesList;
}
