package jp.co.netprotections.service;

import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.dto.JudgedCandidatesResultListDto;
import jp.co.netprotections.dto.MemberCandidatesListDto;

/**
 * @author t.miyazawa
 * 隊員判定サービス
 * 
 */
public interface MemberJudgeService {

	/**
	 * 候補者一人ひとりを判定する
	 * @param candidate
	 * @return　入退社可否結果
	 */
	public boolean judgeEachMember(MemberJudgeRequestDto candidate);

    /**
     * 判定結果をもとに、隊員をソートする
     * @param list 判定結果リスト（ソート前）
     * @return list 判定結果リスト（ソート後）
     */
    public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto> judgedList);

    /**
     * 隊員の入隊可否を判定する（サンプルメソッドなので参考までに）
     * @param list 隊員候補リスト
     * @return 判定結果リスト
     */
    public List<MemberJudgeResponseDto> judge(List<MemberJudgeRequestDto> list);
    
    /**
     * @param candidateList
     * @return 判定結果リスト
     */
    public JudgedCandidatesResultListDto judgeAll(MemberCandidatesListDto candidateList);
}
