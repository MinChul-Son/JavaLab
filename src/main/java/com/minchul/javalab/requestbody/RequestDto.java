package com.minchul.javalab.requestbody;

import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter
public class RequestDto {
    private String name;
    private Long age;

    private RequestDto(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public static RequestDto of(final String name, final Long age) {
        return new RequestDto(name, age);
    }

}
