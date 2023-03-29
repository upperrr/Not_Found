package com.found.not_found.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(SpringExtension.class)              //Test 진행시 JUnit에 내장된 실행자 외에 다른 실행자를 실행
@WebMvcTest(controllers = MainController.class) //Web에 집중할 수 있는 어노테이션
public class MainControllerTest {

    @Autowired
    private MockMvc mvc; //Web API test시 사용

    @Test
    public void main_Test() throws Exception{
        String main = "Not Found Yet!";

        mvc.perform(get("/main"))
                .andExpect(status().isOk())         //HTTP Header의 상태코드
                .andExpect(content().string(main)); //mvc.perform의 결과를 검증

    }
}
