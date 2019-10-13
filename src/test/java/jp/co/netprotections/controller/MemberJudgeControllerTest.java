package jp.co.netprotections.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class MemberJudgeControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
	MemberJudgeController targetController;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(targetController).build();
	}
	
	@Test
	public void judgeMemberTest() throws Exception {
		mockMvc.perform(post("judgemember"))
		.andExpect(status().isOk());
		
	}
}
