package jp.co.netprotections.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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

// JUnit上でもSpringのDI機能を利用するために、下のannotationを追加
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MemberJudgeControllerTest {
	private MockMvc mockMvc;
	
	// @Autowiredでテスト対象のクラスをDIコンテナに登録
	@Autowired
	MemberJudgeController targetController;
	
	// MockMvcBuilders.standaloneSetupで、springMVCの動作を再現するための準備	
	// mockMvcインスタンスを利用して下層のリクエストを発生させ、テストを実行する
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(targetController).build();
	}
	
	
	/**
	 * レスポンスのHTTPステータスコードのテスト -> status 200
	 * @return true
	 * @throws Exception
	 */
	@Test
	public void judgeMemberTest() throws Exception {
		mockMvc.perform(post("/judgemember"))
		.andExpect(status().isOk());
		
	}
	
	@Test
	public void getTest() throws Exception {
		mockMvc.perform(get("/judgemember"))
		.andExpect(status().isNotFound());
	}
	
}
