package org.wanfan.showcase.memo.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 对Spring MVC的Controller进行单元测试
 * @author andy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
//测试环境使用，用来表示测试环境使用的ApplicationContext将是WebApplicationContext类型的；value指定web应用的根；
@ContextConfiguration(locations = {"classpath:spring/application.xml", "file:src/main/webapp/WEB-INF/memo.xml"})
@ActiveProfiles("dev")
public class MemoControllerTest {
	private MockMvc mockMvc;  
	@Autowired  
    private WebApplicationContext wac;
	
	@Before
	public void setUp() {
		//通过MockMvcBuilders.webAppContextSetup(wac).build()创建一个MockMvc进行测试；
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
	}
	
    @Test
    public void testView() throws Exception {
    	// request请求（默认为Get）
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/memo/list"))
                // 期待返回的view
        		.andExpect(MockMvcResultMatchers.view().name("memo/list"))
                // 期待返回的模型中的数据
        		.andExpect(MockMvcResultMatchers.model().attributeExists("memos"))
                // 输入结果
        		.andDo(MockMvcResultHandlers.print())
                .andReturn();
        
        assertThat(result.getModelAndView().getModel().get("memos")).isNotNull();
    }
}
