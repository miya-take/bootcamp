package jp.co.netprotections.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RunWith(JUnit4.class)

public class MemberJudgeServiceImplTest {
  @Test
  public void test001() {
    MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 2, 3, 4, 5, 5);
    MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();

    boolean result = main.judgeEachMember(testMember);
    assertThat(result, is(true));


  }

}
