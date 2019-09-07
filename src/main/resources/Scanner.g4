lexer grammar Scanner;

@header {
	package br.ufla.compiladores.antlr;
}

// palavras reservadas
DELIMITADOR: ':';
ALGORITMO: 'ALGORITMO';
DECLARACOES: 'DECLARACOES';

// declara��o de simbolos que podem existir na linguagem
LETRA: ('a' .. 'z');
DIGITO: ('0'..'9');

// operadores de atribui��o e i/o
ATRIBUIR: 'ATRIBUIR';
A: 'A';
LER: 'LER';
IMPRIMIR: 'IMPRIMIR';

// declara��o de estruturas condicionais e de repeti��o
ENQUANTO: 'ENQUANTO';
FACA: 'faca';
SE: 'SE';
SENAO: 'SENAO';
ENTAO: 'ENTAO';

// declara��o de escopo de blocos de c�digo
INICIO: 'INICIO';
FIM: 'FIM';

//declara��o de n�meros constantes
NUMERO_INTEIRO: DIGITO+;
NUMERO_REAL: DIGITO* '.' DIGITO*;

// declara��o de tipos
INTEIRO: 'INT';
REAL: 'real';

// encontro de par�nteses
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';

OPERADOR_RELACIONAL: '>' | '>=' | '<' | '<=' | '=' | '<>';
OPERADOR_ARITMETICO: '+' | '-' | '*' | '/';

// aceita todos os tipos de nomes de vari�veis que come�am obrigatoriamente com uma letra ou underscore
IDENTIFICADOR: (LETRA | '_') (LETRA | DIGITO | '_')*;

// ignora novas linhas, espa�os e tabula��es
NEW_LINE: ('\r' ? '\n') -> skip;
WHITE_SKEEP: [ \t]+ -> skip;

// ignora coment�rios
COMENTARIOS: '%' ~[\r\n]* -> skip;