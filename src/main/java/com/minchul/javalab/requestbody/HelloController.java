package com.minchul.javalab.requestbody;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/requestBody")
public class HelloController {

    @PostMapping("/modelAttribute")
    public String modelAttributeNoSetter(@ModelAttribute final RequestDto requestDto) {
        log.info("저장 로직 실행!!");
        log.info("이름={}, 나이={}, ", requestDto.getName(), requestDto.getAge());
        return "OK!";
    }

}
