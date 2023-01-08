grammar Expr;

@header {
    package org.dersbian;
}

prog: (decl | expr)+ EOF  # Program;

decl : ID ':' INT_TYPE '=' NUM # Declaration;

expr
    : expr '*' expr     # Multiplication
    | expr '+' expr     # Addition
    | ID                # Variable
    | NUM               # Number
    ;

/* Tokens */
ID : [a-z][a-zA-Z0-9_]*;
NUM
    : '0' ('x' | 'X') HEX_DIGIT+
    | '0' ('b' | 'B') BIN_DIGIT+
    | '0' OCT_DIGIT+
    | '-'?[1-9][0-9]*
    ;

HEX_DIGIT : [0-9a-fA-F] ;

BIN_DIGIT : [01];

OCT_DIGIT : [0-7] ;
INT_TYPE : 'INT';
COMENT : '//' ~[\r\n]* -> skip;
WS : [ \t\n]+ -> skip;
