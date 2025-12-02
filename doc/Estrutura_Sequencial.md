# Estrutura Sequencial
* Expressões aritmétricas:
- Operadores: + - * / %
- Procedência : % / * + -
- Uso de parêntesis nas expressões.
* Variável
- É um porção de memória(RAM) utilizada para ormazenar dados durante a execução dos programas.
- Uma variável possuir:
    * Nome bem de definido e unica no programa;
    * Tipo;
    * Valor
    * Endereço
* Regras para Nomenclatura de Variáveis:
    1. Usar sempre letras, _(underline), $ ou números de 0 a 9;
    2. Sempre iniciar por uma letra e _;
    3. Não pode ter espaços em branco;
    4. Não usar acentos ou til;
    5. Use o "camelCase" em variáveis de nome Composto.

* Tipos Primitivos
- Números Inteiros: byte, short, int long.
- Números Flutuantes: float e double.
- Caracter unicode: char.
- Lógicos: boolean.
- Conjunto de Caracteres: String.
* Saída de dados
- Comando básico:
- "System.out.println(""");"
-Sem quebra de linha e com quebra.
    -print
    -println
- Para imprimir numero flutuante
- ("%.2f");
- ("%.4f%n");
- Concatenando varias variáveis ou elementos usamos:
  - "+" = Geral
  - "%f" = Número Flutuantes
  - "%d" = Número Inteiros
  - "%s" = Strings
  - "%n" = Quebra de linha
*Processamento de Dados
  - É feito pelo meio da comando de Atribuição (=);
  - - Casting
    - É um conversão explicita de tipo de dados.
  *Entrada de dados
    - É quando o usúario informa dados para o programa.
    - - Scanner
    - É uma classe que permite capturar dados digitados pelo usúario.
    1º Importa a classe
      - import java.util.Scanner;
    2º Criar o Objeto
      - Scanner sc = new Scanner(System.in);
    3º Quando não precisar do objeto
      - sc.close();
    4º Para ler os tipos de dados
      - String = sc.next();
      - Int = sc.nextInt();
      - Double = sc.nextDouble();
      - Char = sc.next().charAt(0);
    