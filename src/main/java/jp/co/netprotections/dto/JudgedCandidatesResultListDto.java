package jp.co.netprotections.dto;

import java.util.List;

import lombok.Data;

/**
 * @author t.miyazawa 入退判定結果リストのDTO
 *
 */
@Data
public class JudgedCandidatesResultListDto {
	private List<MemberJudgeResponseDto> judgeCandidatesResultList;
}
