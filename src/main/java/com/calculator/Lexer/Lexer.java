package com.calculator.Lexer;

import java.util.ArrayList;
import java.util.List;

/**
 * Consumes Tokens and outputs 
 * Lexer
 */
public class Lexer {

    /**
     * Consumes a string, parses it, and returns a list of Tokens
     * @param input
     * @return
     */
    public static List<Token> scanner(String input) {
        List<Token> tokenList = new ArrayList<Token>();


        char[] inputCharArray = input.toCharArray();

        for (char c : inputCharArray) {
            
        }

        return tokenList;
    }

}
