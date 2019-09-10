package jp.co.netprotections.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.impl.InputCheckServiceImpl;

public class InputCheckServiceTest {
	
	@Test
	public void checkNameTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(true, testMethod.checkName("eclipse"));
	}
	
	@Test
	public void checkNullNameTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(false, testMethod.checkName(null));
	}
	
	@Test
	public void emptyNameTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(false, testMethod.checkName(""));
	}
	
	@Test
	public void ablityTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(true, testMethod.checkEachAbility(3));
	}
	
	@Test
	public void minusAblityTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(false, testMethod.checkEachAbility(-1));
	}

	
	@Test
	public void zeroAblityTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(false, testMethod.checkEachAbility(0));
		
	}
	
	@Test
	public void fiveParamterTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(true, testMethod.checkEachAbility(5));
	}
	
	@Test
	public void overFiveParameterTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		assertEquals(false, testMethod.checkEachAbility(100));
	}
	@Test
	public void isExpectedParameterTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("Junit", 3, 3, 3, 3, 3);
		assertEquals(true, testMethod.isExpectedParameter(testMember));
	}
	
	@Test
	public void nullMemberNameTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto(null, 3, 3, 3, 3, 3);
		assertEquals(false, testMethod.isExpectedParameter(testMember));
	}
	
	@Test
	public void emptyMemberNameTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("", 3, 3, 3, 3, 3);
		assertEquals(false, testMethod.isExpectedParameter(testMember));
	}
	
	@Test
	public void minusMemberParamTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("Junit", -1, 3, 3, 3, 3);
		assertEquals(false, testMethod.isExpectedParameter(testMember));
	}
	
	@Test
	public void zeroMemberParamTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("Junit", 0, 3, 3, 3, 3);
		assertEquals(false, testMethod.isExpectedParameter(testMember));
	}
	
	@Test
	public void overFiveParamaterTest() {
		InputCheckServiceImpl testMethod = new InputCheckServiceImpl();
		MemberJudgeRequestDto testMember = new MemberJudgeRequestDto("Junit", 6, 3, 3, 3, 3);
		assertEquals(false, testMethod.isExpectedParameter(testMember));
	}
}
