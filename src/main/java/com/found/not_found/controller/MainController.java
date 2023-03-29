package com.found.not_found.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //JSON(데이터)을 반환하는 컨트롤러
public class MainController {

    @GetMapping("/main") //HTTP Method인 GET 요청을 받을 수 있는 어노테이션
    public String main() {
        return "Not Found Yet!";
    }
}
