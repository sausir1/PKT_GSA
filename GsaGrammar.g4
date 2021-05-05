grammar GsaGrammar;

@header{
package antlr;
}

prog:(decl|expr)+ EOF  # Program
    ;

decl: INT_TYPE ID '=' NUM # Declaration
    ;

expr: expr '*' expr     # Multiplication
    | expr '+' expr     # Addition
    | ID                # Variable
    | NUM               # Number
    ;

/* TOKENAI */
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'int';
ID : [a-z][a-zA-Z0-9]*;
WS : [ \t\n\r]+ -> skip;
