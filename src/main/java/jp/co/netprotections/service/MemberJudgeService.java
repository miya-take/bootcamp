package jp.co.netprotections.service;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;

/**
 * 隊員判定サービス
 */
public interface MemberJudgeService {

	public boolean judgeEachMember(MemberJudgeRequestDto candidate);

    public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto> judgedList);

    /**
     * 隊員の入隊可否を判定する（サンプルメソッドなので参考までに）
     * @param list 隊員候補リスト
     * @return 判定結果リスト
     */
    public List<MemberJudgeResponseDto> judge(List<MemberJudgeRequestDto> list);
}
