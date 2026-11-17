package com.calculator;

import com.calculator.Lexer.LexerUtils;

public class Main {
    public static void main(String[] args) {
        String a = LexerUtils.stripWhiteSpace("3 * x^2 + 5 * x - 10");
        System.out.println(a);
    }
}
