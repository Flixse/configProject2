package com.felix.config.confixplay;

import com.felix.config.confixplay.config.GlobalConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by Felix Porres on 18/01/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class MockMvcTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    GlobalConfiguration myConfig;

    @Test
    public void testTimeout() throws Exception{
        System.out.println("the connection time out is : " + myConfig.getConnectionTimeout());
        this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk()).andReturn();

    }
}
