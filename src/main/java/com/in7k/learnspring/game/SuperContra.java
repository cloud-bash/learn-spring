package com.in7k.learnspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole {
    @Override
    public void up() {
        System.out.println("SC: up");
    }

    @Override
    public void down() {
        System.out.println("SC: down");
    }

    @Override
    public void left() {
        System.out.println("SC: left");
    }

    @Override
    public void right() {
        System.out.println("SC: right");
    }
}
