package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class JenkinsControllerTest {

	private MockMvc mockMvc;

	//JenkinsController target;

	@Autowired
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new JenkinsController()).build();
	}

	@Test
	public void indexTest() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("/index.html"))
				.andExpect(model().hasNoErrors());
	}
}
