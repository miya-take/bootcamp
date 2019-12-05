package jp.co.netprotections.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RunWith(JUnit4.class)

public class MemberJudgeServiceTest {
	@Test
	public void OkTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 2, 3, 4, 5, 5);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(true));
	}

	@Test
	public void minusCogitationTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, -1, 4, 5, 5);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));
	}

	@Test
	public void onePointCogitaionTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, 1, 4, 5, 5);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));

	}

	@Test
	public void minusCoodinationTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, 2, -3, 5, 5);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));
	}

	@Test
	public void onePointCoodinationTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, 2, 1, 5, 5);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));
	}

	@Test
	public void totalNinePointTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, 2, 3, 2, 1);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));
	}

	@Test
	public void totalTenPointTestTest() {
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("testMember", 1, 2, 3, 3, 1);
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		boolean result = main.judgeEachMember(testMember);
		assertThat(result, is(false));
	}
	
	
	@Test
	public void sortByBooleanResultTest() {
		List<MemberJudgeResponseDto> judgedList= new ArrayList<MemberJudgeResponseDto>(); 
		MemberJudgeResponseDto testMember1 = new MemberJudgeResponseDto();
		testMember1.setMemberName("one");
		testMember1.setEnlistedPropriety(false);
		
		MemberJudgeResponseDto testMember2 = new MemberJudgeResponseDto();
		testMember2.setMemberName("two");
		testMember2.setEnlistedPropriety(true);

		MemberJudgeResponseDto testMember3 = new MemberJudgeResponseDto();
		testMember3.setMemberName("three");
		testMember3.setEnlistedPropriety(false);
		judgedList.add(testMember1);
		judgedList.add(testMember2);
		judgedList.add(testMember3);
		
		MemberJudgeServiceImpl main = new MemberJudgeServiceImpl();
		main.sortCandidatesByEnlistedPropriety(judgedList);
		assertEquals("two", judgedList.get(0).getMemberName());
		assertEquals("one", judgedList.get(1).getMemberName());
		assertEquals("three", judgedList.get(2).getMemberName());
		
	}
	
}
