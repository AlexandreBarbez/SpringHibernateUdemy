package com.halx.fortune;

import org.springframework.stereotype.Component;

@Component
public class MotivationalFortuneService implements FortuneService {
    @Override
    public String provideFortune() {
        return "Go Go Go ! You can do it !";
    }
}
