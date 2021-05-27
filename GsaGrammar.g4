grammar GsaGrammar;

@header{
package antlr;
}

prog : (decl | expr | statement | methodInvocation)+ EOF # Program
     ;

decl: INT ID ASSIGN NUM         #   IntDeclaration
     | STRING ID ASSIGN STRG    #   StringDeclaration
     | BOOLEAN ID ASSIGN BOOL   #   BoolDeclaration
     | CHAR_T ID ASSIGN CHAR    #   CharDeclaration
     | DEFINE ID method         #   MethodDeclaration
     ;

expr : expr MULT expr        # Multiplication
     | expr DIV expr         # Division
     | expr ADD expr         # Addition
     | expr SUBT expr        # Subtraction
     | ID                    # Variable
     | NUM                   # Number
     | STRG                  # String
     | CHAR                  # Char
     | BOOL                  # Bool
     | expr EQ expr          # Equals
     | expr GT expr          # GreaterThan
     | expr LT expr          # LessThan
     | expr EQGT expr        # EqualsOrGreaterThan
     | expr EQLT expr        # EqualsOrLessThan
     | expr ASSIGN expr      # Assignment
     ;

statement : conditionalStatement    #   Condition
          | iterationStatement      #   Iteration
          | returnStatement         #   Return
          ;

conditionalStatement : ifStmt             # OnlyIfStatement
                     | ifStmt  elseStmt?  # IfElseStatement
                     | ifStmt+ elifStmt elseStmt?    # IfElifStatement
                     ;
ifStmt: IF conditionBlock   ifBody  #IfStatement;
elifStmt: ELIF PARANTESSES1 expr PARANTESSES2 CURLYBRACKET1 (expr | statement)? CURLYBRACKET2   #ElifStatement;
elseStmt: ELSE ifBody  #ElseStatement;
ifBody: CURLYBRACKET1 (expr | statement | decl)* CURLYBRACKET2 #ConditionBody;

conditionBlock: PARANTESSES1 expr PARANTESSES2;

iterationStatement : FOR PARANTESSES1 NUM TO NUM PARANTESSES2 CURLYBRACKET1 (expr | statement)? CURLYBRACKET2 #ForToStatement
                   | FOR PARANTESSES1 UNTIL NUM PARANTESSES2 CURLYBRACKET1 (expr | statement)? CURLYBRACKET2  #ForUntilStatement
                   ;

blockStatement : (expr | decl | statement | methodInvocation)+     #LocalStatement
                ;
blockStatements: blockStatement                     #UnoStatement
                | blockStatements blockStatement    #HierarcyStatements
                ;

block: CURLYBRACKET1 blockStatements? CURLYBRACKET2    #LocalStatements;
methodArgs: PARANTESSES1 args? PARANTESSES2            #MethodArguments;
methodArg: INT ID          #IntArg
         | STRING ID       #StringArg
         | CHAR_T ID       #CharArg
         | BOOLEAN ID      #BoolArg
         ;
args: methodArg                         #SingleArg
    | (methodArg COMMA)+ methodArg      #MultipleArgs
    ;
argumentList: argument                      #SingleArgument
            | (argument COMMA)+ argument    #MultipleArguments
            ;
argument: ID
        | expr
        ;
method: methodArgs block                #MethodDefinition;

returnStatement: RETURN expr        #ReturnExpression
               ;
methodInvocation: ID PARANTESSES1 argumentList* PARANTESSES2;


/* TOKENAI */
ASSIGN : '=';


INT : 'int';
STRING : 'string';
BOOLEAN : 'bool';
CHAR_T: 'char';
DEFINE: 'def';


NUM : '0' | '-'?[1-9][0-9]*;
STRG : ["][a-zA-Z0-9]*["];
CHAR: ['][a-zA-Z0-9]['];
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
CURLYBRACKET1 : '{';
CURLYBRACKET2 : '}';
COMMA : ',';
RETURN: 'return';


IF : 'if';
ELIF : 'elif';
ELSE : 'else';

FOR: 'for';
TO: 'to';
UNTIL: 'until';

ID : [a-zA-Z0-9]+;
WS : [ \t\n\r]+ -> skip;
