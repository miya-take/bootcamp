package jp.co.netprotections.service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

/**
 * 入力チェックサービス
 * @author s.nozaki
 *
 */
public interface InputCheckService {

	/**
	 * 引数が期待した入力であることを確認する
	 * @param candidate 隊員候補情報
	 * @return 判定結果
	 */
    public boolean isExpectedParameter(MemberJudgeRequestDto candidate);
}
