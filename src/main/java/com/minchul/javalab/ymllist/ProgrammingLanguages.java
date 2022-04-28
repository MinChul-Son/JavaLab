package com.minchul.javalab.ymllist;

import org.springframework.beans.factory.annotation.Value;

public class ProgrammingLanguages {

    @Value("${programming.language[0]:}")
    private String language; // C

    @Value("${programming.language[1]:}")
    private String language1; // Java

    @Value("${programming.language[2]:}")
    private String language2; // Python

    @Value("${programming.language[3]:}")
    private String language3; // JavaScript

}
