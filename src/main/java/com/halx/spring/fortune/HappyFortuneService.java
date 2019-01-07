package com.halx.spring.fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String provideFortune() {
        return "This is your lucky day !";
    }
}
