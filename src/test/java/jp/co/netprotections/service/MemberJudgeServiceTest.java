package jp.co.netprotections.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;


@RunWith(JUnit4.class)
public class MemberJudgeServiceTest {
	@Before
	protected void setUp() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto (
				"test", 1, 2, 3, 4, 5
				);		
	}
	@Autowired
	MemberJudgeService memberJudgeService;
	
	@Test
	public void testMemberJudge(MemberJudgeRequestDto testMember) {
		boolean test = memberJudgeService.judgeEachMember(testMember);
	}
	

}
