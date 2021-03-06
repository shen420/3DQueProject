package com.threeDQUE.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// Spring MockMvc handles the incoming HTTP request and sends it to controller
// so that the code is called in exactly the same way as if it were processing a real HTTP request
// but without starting the server
@SpringBootTest
@AutoConfigureMockMvc
public class ErrorHandlerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Test for case where URL is wrong, should return 404
    @Test
    public void error() throws Exception {

        this.mockMvc.perform(get("/badurl"))
                .andDo(print()).andExpect(status().is4xxClientError());
    }


}