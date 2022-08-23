package com.centit.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(JavaConfig.class);
        AwareService bean = an.getBean(AwareService.class);
        bean.output();

    }
}
