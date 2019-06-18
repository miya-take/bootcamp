package jp.co.netprotections.service.impl;

import java.util.ArrayList;
import java.util.List;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.InputCheckService;

/**
 * 入力チェックサービス実装クラス
 */
public class InputCheckServiceImpl  implements InputCheckService {

	  public boolean isExpectedParameter(MemberJudgeRequestDto candidate) {
	    // 名前がnullもしくは入力されていないか確認する判定
	    if (
	        candidate.getMemberName().equals(null)
	        || candidate.getMemberName().equals("")
	        ) {
	      return false;
	    }
	    /* 能力値の入力値を判定
	     * 1. 空ではないか
	     * 2. int型で入力されているか
	     * 3. 能力値が、0 ~ 5 の間で入力されているか
	     */
	    // 能力値をリストで追加
	    List<Integer> candidateParameterList = new ArrayList<Integer>();
	    candidateParameterList.add(candidate.getCogitation());
	    candidateParameterList.add(candidate.getCoodination());
	    candidateParameterList.add(candidate.getEventPlanning());
	    candidateParameterList.add(candidate.getInfrastructureKnowledge());
	    candidateParameterList.add(candidate.getProgrammingAbility());

	    for (int i = 0; i < candidateParameterList.size(); i++) {
	      if (
	          candidateParameterList.get(i) == 0
	          || candidateParameterList.get(i) != (int)candidateParameterList.get(i)
	          || (candidateParameterList.get(i) < 0 || 5 < candidateParameterList.get(i))
	          ) {
	        return false;
	      }
	    }
	    // 上記の入力値判定にかからなければ。正しい入力値として以下を返却
	    return true;
	  }
}
