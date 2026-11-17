package com.calculator.Lexer;

public enum TokenType {
    // Numbers and Variables
    NUMBER,         // e.g. 1, 5, 2.3, 0.676769
    VARIABLE,       // e.g. x, y, z, p, q

    // Operators
    PLUS,           // +
    MINUS,          // -
    MULTIPLY,       // *
    DIVIDE,         // /
    EXPONENT,       // ^

    // Sussy groping and punctuation
    LPAREN,         // (
    RPAREN,         // )
    COMMA,          // ,

    // Special
    EOF,
    ERROR,
}
