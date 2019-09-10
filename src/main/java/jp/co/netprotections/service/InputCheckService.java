package jp.co.netprotections.service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
/** test
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
    /**
     * 名前が適正であるかどうか確認する
     * @param name
     * @return 
     */
    public boolean checkName(String name);
    /**
     * それぞれの能力値が条件を満たしているか確認する
     * @param eachParamater
     * @return
     */
    public boolean checkEachAbility(int eachParamater);
}
