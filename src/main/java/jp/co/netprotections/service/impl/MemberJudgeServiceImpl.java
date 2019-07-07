package jp.co.netprotections.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.MemberJudgeService;
import jp.co.netprotections.service.InputCheckService;

/**
 * 隊員判定サービス実装クラス
 */
@Service
public class MemberJudgeServiceImpl implements MemberJudgeService {
  @Autowired
  private InputCheckService inputCheckService;

  /**
   * 入隊可否の判定メソッド
   */
  @Override
  public boolean judgeEachMember(MemberJudgeRequestDto candidate) {
    // CogitationとCoodinationが1点以下か判定
    if (candidate.getCogitation() <= 1) {
      return false;
    }
    if (candidate.getCoodination() <= 1) {
      return false;
    }
    // 能力値の合計が10点以下であるか判定
    if ((
        candidate.getEventPlanning()
        + candidate.getCogitation()
        + candidate.getCoodination()
        + candidate.getProgrammingAbility()
        + candidate.getInfrastructureKnowledge()
        ) <= 10) {
      return false;
    } else {
      return true;
    }
  }

  /**
   *  判定結果を、入隊結果でソートするメソッド
   */
  @Override
  public void sortCandidatesByEnlistedPropriety(List<MemberJudgeResponseDto> judgedList) {
    Collections.sort(judgedList, new Comparator<MemberJudgeResponseDto>() {
      public int compare(MemberJudgeResponseDto candidateSecond, MemberJudgeResponseDto candidateFirst) {
        return Boolean.compare(
          candidateFirst.getEnlistedPropriety(),
          candidateSecond.getEnlistedPropriety()
          );
      }
    });
  }

    /**
     * 例えば、リストで受け取ってリストで返却するならこんな感じ
     */
	/**
	 * メンバーを判定するメソッド。上記の judgeEachMemberを呼び出し、候補者一人ひとりに適用
	 * @author t.miyazawa
	 * @param 候補者のリスト
	 * @return 判定結果リスト　
	 */
	@Override
	public List<MemberJudgeResponseDto> judge(List<MemberJudgeRequestDto> list) {
		List<MemberJudgeResponseDto> res = new ArrayList<>();
		for(MemberJudgeRequestDto elm : list) {
			MemberJudgeResponseDto result = new MemberJudgeResponseDto();
			 if (inputCheckService.isExpectedParameter(elm)) {
			        // 入力にエラーがないときの処理
				 	result.setEnlistedPropriety(this.judgeEachMember(elm));
					result.setMemberName(elm.getMemberName());
			      } else {
			        // 入力にエラーがあったときの処理
			        result.setMemberName(null);
			        result.setEnlistedPropriety(false);
			      } 
				res.add(result);
		}
		return res;
	}
}