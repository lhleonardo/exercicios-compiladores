lexer grammar Scanner;

@header {
	package br.ufla.compiladores.antlr;
}

// palavras reservadas
DELIMITADOR: ':';
ALGORITMO: 'ALGORITMO';
DECLARACOES: 'DECLARACOES';

// declaração de simbolos que podem existir na linguagem
LETRA: ('a' .. 'z');
DIGITO: ('0'..'9');

// operadores de atribuição e i/o
ATRIBUIR: 'ATRIBUIR';
A: 'A';
LER: 'LER';
IMPRIMIR: 'IMPRIMIR';

// declaração de estruturas condicionais e de repetição
ENQUANTO: 'ENQUANTO';
FACA: 'faca';
SE: 'SE';
SENAO: 'SENAO';
ENTAO: 'ENTAO';

// declaração de escopo de blocos de código
INICIO: 'INICIO';
FIM: 'FIM';

//declaração de números constantes
NUMERO_INTEIRO: DIGITO+;
NUMERO_REAL: DIGITO* '.' DIGITO*;

// declaração de tipos
INTEIRO: 'INT';
REAL: 'real';

// encontro de parênteses
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';

OPERADOR_RELACIONAL: '>' | '>=' | '<' | '<=' | '=' | '<>';
OPERADOR_ARITMETICO: '+' | '-' | '*' | '/';

// aceita todos os tipos de nomes de variáveis que começam obrigatoriamente com uma letra ou underscore
IDENTIFICADOR: (LETRA | '_') (LETRA | DIGITO | '_')*;

// ignora novas linhas, espaços e tabulações
NEW_LINE: ('\r' ? '\n') -> skip;
WHITE_SKEEP: [ \t]+ -> skip;

// ignora comentários
COMENTARIOS: '%' ~[\r\n]* -> skip;