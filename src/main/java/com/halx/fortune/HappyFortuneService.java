package com.halx.fortune;

public class HappyFortuneService implements FortuneService {
    @Override
    public String provideFortune() {
        return "This is your lucky day !";
    }
}
