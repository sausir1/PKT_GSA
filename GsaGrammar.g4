grammar GsaGrammar;

@header{
package antlr;
}

prog : (decl | expr | statement)+ EOF
     ;

decl : INT ID ASSIGN NUM
     | STRING ID ASSIGN STRG
     | BOOLEAN ID ASSIGN BOOL
     ;

expr : expr MULT expr        # Multiplication
     | expr DIV expr         # Division
     | expr ADD expr         # Addition
     | expr SUBT expr        # Subtraction
     | ID                    # Variable
     | NUM                   # Number
     | STRG                  # String
     | BOOL                  # Bool
     | expr EQ expr          # Equals
     | expr GT expr          # GreaterThen
     | expr LT expr          # LessThen
     | expr EQGT expr        # EqualsOrGreaterThen
     | expr EQLT expr        # EqualsOrLessThen
     | expr ASSIGN expr      # Assignment
     ;

statement : conditionalStatement
          | iterationStatement
          ;

conditionalStatement : IF PARANTESSES1 expr PARANTESSES2 expr
                     | IF PARANTESSES1 expr PARANTESSES2 expr ELIF PARANTESSES1 expr PARANTESSES2 expr
                     ;

iterationStatement : FOR PARANTESSES1 NUM TO NUM PARANTESSES2 expr
                   | FOR PARANTESSES1 UNTIL NUM PARANTESSES2 expr
                   ;

/* TOKENAI */
ASSIGN : '=';


INT : 'int';
STRING : 'string';
BOOLEAN : 'bool';

NUM : '0' | '-'?[1-9][0-9]*;
STRG : ["][a-zA-Z0-9]*["];
BOOL : 'true' | 'false';

MULT : '*';
DIV : '/';
ADD : '+';
SUBT : '-';

EQ : '==';
GT : '>';
LT : '<';
EQGT : '>=';
EQLT : '<=';

PARANTESSES1 : '(';
PARANTESSES2 : ')';


IF : 'if';
ELIF : 'elif';

FOR: 'for';
TO: 'to';
UNTIL: 'until';

ID : [a-zA-Z0-9]+;
WS : [ \t\n\r]+ -> skip;
