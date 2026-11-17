package com.calculator.Lexer;

/**
 * Utilities for the Lexer
 */
public class LexerUtils {

    /**
     * Strips all whitespaces from string.
     * @param string
     * @return new {@code String} with no whitespaces.
     */
    public static String stripWhiteSpace(String string) {
        StringBuilder sb = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
