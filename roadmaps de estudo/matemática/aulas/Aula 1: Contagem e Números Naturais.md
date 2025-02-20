## Aula 1: Contagem e Números Naturais

### 1. Título do Assunto:

Contagem e Números Naturais: O Fundamento da Matemática e os Axiomas de Peano

### 2. Teoria:

#### 2.1. Contagem: A Origem dos Números e a Correspondência Biunívoca

A matemática, como a conhecemos, emerge da necessidade intrínseca e universal dos seres humanos de quantificar e ordenar o mundo ao seu redor. A contagem é anterior à própria escrita e está profundamente enraizada na história da humanidade.

**Contexto Histórico e Antropológico:**

- **Pastoreio Primitivo:** O exemplo do pastor de ovelhas é arquetípico, mas não isolado. Diversas culturas, antes do desenvolvimento de sistemas numéricos formais, utilizavam métodos de correspondência biunívoca (ou bijeção). Em vez de pedras, poderiam ser usados nós em cordas, marcas em ossos (como o Osso de Ishango, encontrado na África Central e datado de cerca de 20.000 a.C., que sugere um sistema de contagem), ou outros artefatos.
- **Civilizações Antigas:** Babilônios, egípcios, gregos e romanos desenvolveram sistemas numéricos mais sofisticados, mas a ideia fundamental de correspondência biunívoca permaneceu. Os babilônios, por exemplo, usavam um sistema sexagesimal (base 60), que ainda influencia nossa medição do tempo (60 segundos em um minuto, 60 minutos em uma hora). Os egípcios tinham hieróglifos para representar números, e os romanos, seu famoso sistema de numeração (I, II, III, IV, V, etc.).

**Correspondência Biunívoca (Bijeção): A Essência da Contagem**

A correspondência biunívoca é um conceito crucial. Ela estabelece que contar é, fundamentalmente, criar uma _relação_ precisa entre dois conjuntos:

1.  **Conjunto dos Objetos a Serem Contados:** Ovelhas, pedras, frutas, pessoas, etc.
2.  **Conjunto dos "Marcadores" ou "Símbolos de Contagem":** Inicialmente, objetos físicos (pedras, nós), e posteriormente, símbolos abstratos (números).

A correspondência é _biunívoca_ porque:

- **Cada objeto do primeiro conjunto corresponde a _exatamente um_ marcador do segundo conjunto.** (Não podemos contar a mesma ovelha duas vezes).
- **Cada marcador do segundo conjunto corresponde a _exatamente um_ objeto do primeiro conjunto.** (Não podemos usar a mesma pedra para representar duas ovelhas diferentes).

**A Abstração do Número:**

A grande revolução cognitiva ocorreu quando os humanos passaram a usar _símbolos abstratos_ para representar quantidades, independentemente dos objetos específicos sendo contados. "Três" não se refere apenas a três ovelhas, mas a _qualquer_ conjunto com três elementos. Essa abstração é a base do conceito de número natural.

#### 2.2. Números Naturais: O Primeiro Conjunto Numérico e suas Propriedades

Os números naturais ($\mathbb{N}$) são o conjunto mais fundamental de números, usado para contagem e ordenação. Sua definição formal é crucial para a construção rigorosa da matemática.

$\mathbb{N} = \{1, 2, 3, 4, 5, ...\}$

**Propriedades Fundamentais (Intuitivas):**

- **Infinitude:** O conjunto dos números naturais é infinito. Não existe um "maior número natural". Sempre podemos adicionar 1 a qualquer número natural e obter um número natural maior.
- **Ordenação:** Os números naturais podem ser ordenados de forma crescente: $1 < 2 < 3 < 4 < ...$ Dados dois números naturais quaisquer, sempre podemos dizer qual é o menor e qual é o maior (ou se são iguais).
- **Sucessor:** Cada número natural tem um sucessor único, que é o próximo número na sequência. O sucessor de $n$ é $n+1$.
- **Zero (Discussão):** A inclusão ou exclusão do zero no conjunto dos números naturais é uma questão de convenção.
  - **Teoria dos Números (Convenção Adotada):** Em teoria dos números, é mais comum _não_ incluir o zero nos naturais. Isso simplifica algumas formulações e demonstrações. Seguiremos essa convenção.
  - **Teoria dos Conjuntos e Lógica:** Em teoria dos conjuntos e lógica, é frequentemente mais conveniente incluir o zero nos naturais. Isso se alinha com a construção dos números naturais a partir dos conjuntos, onde o conjunto vazio corresponde ao zero.
  - **Importante:** É fundamental estar ciente da convenção adotada em cada contexto. Se a inclusão ou exclusão do zero for relevante, isso será explicitamente mencionado.

#### 2.3. Axiomas de Peano: A Definição Formal, Rigorosa e suas Implicações

Os Axiomas de Peano, propostos por Giuseppe Peano (1858-1932), fornecem uma base axiomática para os números naturais. Eles são um conjunto de cinco postulados que definem os números naturais de forma precisa e não ambígua. Esses axiomas são o alicerce da aritmética.

1.  **Axioma 1: 1 é um número natural.**

    - **Justificativa:** Este é o _axioma fundamental_. Ele estabelece a existência de um elemento inicial no conjunto dos números naturais. Sem esse ponto de partida, não teríamos como construir o conjunto.
    - **Implicação:** Garante que o conjunto dos números naturais não é vazio.

2.  **Axioma 2: Todo número natural tem um sucessor, que também é um número natural.**

    - **Notação:** A função sucessor é geralmente denotada por $S(n)$ ou, mais comumente, $n+1$.
    - **Justificativa:** Este axioma garante a _infinitude_ dos números naturais. Dado qualquer número natural, sempre podemos encontrar um número natural maior (seu sucessor).
    - **Implicação:** Não existe um "maior número natural". A operação de sucessor é _sempre_ possível.
    - **Demonstração algébrica:** $S(n) = n + 1$. Esta é a definição da função sucessor. Por exemplo, $S(3) = 3 + 1 = 4$.

3.  **Axioma 3: 1 não é sucessor de nenhum número natural.**

    - **Justificativa:** Este axioma garante que a sequência dos números naturais tem um _início_ definido em 1. Ele impede que a sequência seja cíclica.
    - **Implicação:** Não existe um número natural "anterior" a 1. 1 é o menor número natural.
    - **Exemplo:** Não existe um número de ovelhas que, ao adicionarmos mais uma, resulte em apenas uma ovelha.

4.  **Axioma 4: Se dois números naturais têm o mesmo sucessor, então eles são iguais.** (Função Sucessor Injetiva)

    - **Justificativa:** Este axioma garante que a função sucessor é _injetiva_. Isso significa que cada número natural tem um sucessor _único_, e números diferentes têm sucessores diferentes.
    - **Implicação:** A sequência dos números naturais não se "ramifica". Não há dois números naturais diferentes que "convergem" para o mesmo sucessor.
    - **Demonstração (Contrapositiva):** A afirmação contrapositiva é: "Se dois números naturais são diferentes, então seus sucessores são diferentes". Isso é equivalente ao axioma e, muitas vezes, mais fácil de usar em demonstrações.
    - **Demonstração algébrica:** Se $S(a) = S(b)$, então $a + 1 = b + 1$. Subtraindo 1 de ambos os lados (operação válida nos números naturais), obtemos $a = b$.

5.  **Axioma 5 (Princípio da Indução Matemática):** Seja P um conjunto de números naturais. Se:

    - (i) 1 pertence a P, **E**
    - (ii) Sempre que um número natural $n$ pertence a P, o sucessor de $n$ ($n+1$) também pertence a P,

    então P contém _todos_ os números naturais (P = $\mathbb{N}$).

    - **Justificativa:** Este é o axioma mais poderoso e fundamental. Ele permite provar que uma propriedade é válida para _todos_ os números naturais, verificando apenas dois casos: o caso base (a propriedade vale para 1) e o passo indutivo (se a propriedade vale para um número, ela vale para o seu sucessor).
    - **Analogia dos Dominós (Aprofundada):**
      - **Base (i):** Derrubar o primeiro dominó. Isso corresponde a mostrar que a propriedade é válida para o número 1.
      - **Passo Indutivo (ii):** Garantir que cada dominó, ao cair, derruba o próximo. Isso corresponde a mostrar que _se_ a propriedade é válida para um número natural $n$, então ela também é válida para o sucessor de $n$ ($n+1$).
      - **Conclusão:** Se ambas as condições forem satisfeitas, então _todos_ os dominós cairão. Isso significa que a propriedade é válida para _todos_ os números naturais.
      - **Importância:** O Princípio da Indução evita a necessidade de verificar a propriedade para cada número natural individualmente (o que seria impossível, já que são infinitos). O passo indutivo garante a "propagação" da propriedade.
    - **Exemplo Formal (Detalhado com Ênfase na Lógica):**
      - **Proposição:** Prove que a soma dos $n$ primeiros números naturais ímpares é igual a $n^2$.
      - **Definição do Conjunto P:** Seja P o conjunto de todos os números naturais $n$ para os quais a proposição é verdadeira. Queremos provar que P = $\mathbb{N}$.
      - **Base (i):** Para $n = 1$, a soma do primeiro número natural ímpar é 1, e $1^2 = 1$. Portanto, 1 pertence a P.
      - **Passo Indutivo (ii):**
        - **Hipótese Indutiva:** Suponha que a proposição seja verdadeira para algum número natural $k$. Ou seja, suponha que: $1 + 3 + 5 + ... + (2k - 1) = k^2$
        - **Tese Indutiva:** Precisamos mostrar que a proposição também é verdadeira para $k+1$. Ou seja, precisamos mostrar que: $1 + 3 + 5 + ... + (2k - 1) + (2(k+1) - 1) = (k+1)^2$
        - **Demonstração:**
          - Partimos do lado esquerdo da equação e usamos a hipótese indutiva:
            $1 + 3 + 5 + ... + (2k - 1) + (2(k+1) - 1) = k^2 + (2(k+1) - 1)$
          - Simplificamos a expressão:
            $k^2 + (2k + 2 - 1) = k^2 + 2k + 1$
          - Fatoramos a expressão:
            $k^2 + 2k + 1 = (k + 1)^2$
          - Isso é exatamente o lado direito da equação que queríamos provar.
      - **Conclusão (Pelo Princípio da Indução):** Como as condições (i) e (ii) do Princípio da Indução foram satisfeitas, o conjunto P contém todos os números naturais (P = $\mathbb{N}$). Portanto, a proposição "a soma dos $n$ primeiros números naturais ímpares é igual a $n^2$" é verdadeira para todos os números naturais $n$.

- **Contraexemplo Detalhado (Falácia da Indução):**

  - **Afirmação Falsa:** "Todos os alunos de uma turma tirarão a mesma nota na prova."
  - **"Prova" (FALSA):**
    - **Base:** Se a turma tem apenas um aluno, todos os alunos (o único aluno) tiram a mesma nota.
    - **Passo Indutivo (FALSO):** Suponha que em qualquer turma com $k$ alunos, todos tirem a mesma nota. Considere uma turma com $k+1$ alunos. Retire um aluno. Os $k$ alunos restantes tiram a mesma nota (pela hipótese indutiva). Agora, coloque esse aluno de volta e retire outro. Novamente, os $k$ alunos restantes tiram a mesma nota. Portanto, todos os $k+1$ alunos tiram a mesma nota.
  - **Erro Lógico:** O erro está, novamente, no passo indutivo quando aplicado a casos pequenos. Quando k=1 (turma com 2 alunos), retirar um aluno deixa um conjunto com apenas _um_ aluno. A hipótese indutiva não garante que os _dois_ alunos originais tirem a mesma nota. O passo indutivo precisa ser válido para _todos_ os valores de $k$, inclusive os menores.

#### 2.4. Representação dos Números Naturais: Além dos Símbolos

Embora usemos símbolos (1, 2, 3, ...) para representar os números naturais, é importante entender que esses símbolos são apenas _representações_. O conceito de número natural é abstrato.

- **Representações Comuns:**

  - **Símbolos Indo-Arábicos:** 1, 2, 3, 4, 5, ... (sistema decimal, base 10)
  - **Palavras:** Um, dois, três, quatro, cinco, ...
  - **Numeração Romana:** I, II, III, IV, V, ...
  - **Outros Sistemas:** Sistemas de numeração de outras culturas (ex: babilônico, egípcio, maia).

- **Reta Numérica:** A reta numérica é uma representação _geométrica_ dos números naturais. Ela é uma ferramenta poderosa para visualizar as propriedades dos números naturais, como ordem e sucessor.

  ```
      1   2   3   4   5   6   ...
      •---•---•---•---•---•---...
  ```

  - **Construção:**

    1.  Desenhamos uma linha reta horizontal.
    2.  Escolhemos um ponto para representar o número 1.
    3.  Marcamos pontos à direita de 1, com distâncias iguais entre eles.
    4.  Cada ponto corresponde a um número natural, na ordem crescente.

  - **Importância:** A reta numérica ajuda a visualizar:
    - **Ordenação:** Números maiores estão à direita de números menores.
    - **Sucessor:** O sucessor de um número é o ponto imediatamente à sua direita.
    - **Adição:** Adicionar <span class="math-inline">n</span> a um número corresponde a "andar" <span class="math-inline">n</span> unidades para a direita na reta numérica.

#### 2.5. Contexto Histórico e Motivação: Quem, Quando e Por Quê

- **Quem (Contribuições de Diversas Culturas):**

  - **Civilizações Antigas:** A necessidade de contar e quantificar surgiu em diversas culturas independentes, muito antes da formalização da matemática. Babilônios, egípcios, gregos, romanos, hindus, chineses e maias, entre outros, desenvolveram seus próprios sistemas de numeração e métodos de contagem.
  - **Giuseppe Peano (1858-1932):** Matemático italiano que formalizou os números naturais através dos Axiomas de Peano. Seu trabalho foi fundamental para o desenvolvimento da lógica matemática e da teoria dos conjuntos.

- **Quando:**

  - **Contagem Primitiva:** A contagem é uma das práticas matemáticas mais antigas, datando de dezenas de milhares de anos atrás (possivelmente antes da linguagem escrita).
  - **Sistemas Numéricos:** Sistemas numéricos mais sofisticados surgiram com as primeiras civilizações, há cerca de 5.000 a 6.000 anos.
  - **Axiomas de Peano:** Publicados em 1889, no livro "Arithmetices principia, nova methodo exposita" ("Os princípios da aritmética, apresentados por um novo método").

- **Por Quê (Necessidades e Motivações):**
  - **Necessidades Práticas:**
    - **Controle de Recursos:** Contar rebanhos, alimentos, objetos, pessoas, dias, etc., era essencial para a sobrevivência e organização das primeiras comunidades.
    - **Comércio:** A troca de bens exigia um sistema para quantificar e comparar valores.
    - **Astronomia e Calendário:** A observação dos astros e a criação de calendários exigiam medições precisas do tempo e das posições dos corpos celestes.
  - **Fundamentação da Matemática:**
    - **Rigor e Precisão:** Os Axiomas de Peano foram criados para dar uma base lógica _sólida_ e _rigorosa_ para a aritmética. Antes de Peano, a aritmética era baseada em noções intuitivas, o que poderia levar a inconsistências.
    - **Desenvolvimento da Lógica Matemática:** O trabalho de Peano foi um marco no desenvolvimento da lógica matemática e influenciou profundamente a matemática do século XX. Ele mostrou que era possível construir a matemática a partir de um pequeno conjunto de axiomas e regras de inferência.

### 3. Prática (Aplicação da Teoria):

#### 3.1. Exemplo 1: Contagem Simples e Correspondência Biunívoca

**Problema:** Um agricultor tem um cesto com maçãs e quer saber quantas maçãs ele tem. Ele não sabe contar usando números, mas tem um saco com pedrinhas. Como ele pode determinar a quantidade de maçãs?

**Solução:**

O agricultor pode usar o princípio da correspondência biunívoca (bijeção):

1.  **Esvaziar o Cesto:** Ele começa com o cesto de maçãs e o saco de pedrinhas.
2.  **Correspondência Um-para-Um:** Para _cada_ maçã que ele retira do cesto, ele coloca _uma_ pedrinha no saco.
3.  **Resultado:** Quando o cesto estiver vazio, o número de pedrinhas no saco _corresponderá exatamente_ ao número de maçãs que estavam no cesto. Mesmo sem usar números, ele estabeleceu uma relação quantitativa.

**Explicação (Conexão com a Teoria):**

- O agricultor criou uma _bijeção_ entre o conjunto das maçãs e o conjunto das pedrinhas.
- Cada maçã corresponde a uma única pedrinha, e cada pedrinha corresponde a uma única maçã.
- Essa bijeção permite determinar a quantidade de maçãs _sem_ a necessidade de símbolos numéricos abstratos.

#### 3.2. Exemplo 2: Usando o Princípio da Indução (Demonstração Formal)

**Problema:** Prove, usando o Princípio da Indução Matemática, que a soma dos $n$ primeiros números pares positivos é igual a $n(n+1)$.

**Solução (Passo a Passo, com Ênfase na Estrutura Lógica):**

1.  **Definição da Proposição:** Seja P(n) a proposição "a soma dos $n$ primeiros números pares positivos é igual a $n(n+1)$". Queremos provar que P(n) é verdadeira para todos os números naturais $n$.

2.  **Base (n=1):**

    - A soma do primeiro número par positivo é 2.
    - $1(1+1) = 1(2) = 2$.
    - Portanto, P(1) é verdadeira.

3.  **Passo Indutivo:**

    - **Hipótese Indutiva:** Suponha que P(k) seja verdadeira para algum número natural $k$ ≥ 1. Ou seja, suponha que:
      $2 + 4 + 6 + ... + 2k = k(k+1)$
    - **Tese Indutiva:** Precisamos mostrar que P(k+1) também é verdadeira. Ou seja, precisamos mostrar que:
      $2 + 4 + 6 + ... + 2k + 2(k+1) = (k+1)(k+2)$
    - **Demonstração (Usando a Hipótese Indutiva):**
      - Partimos do lado esquerdo da equação em P(k+1) e aplicamos a hipótese indutiva:
        $2 + 4 + 6 + ... + 2k + 2(k+1) = k(k+1) + 2(k+1)$
      - Colocamos (k+1) em evidência:
        $k(k+1) + 2(k+1) = (k+1)(k + 2)$
      - Isso é exatamente o lado direito da equação em P(k+1).

4.  **Conclusão (Aplicação do Princípio da Indução):**
    - A base (P(1) é verdadeira) foi verificada.
    - O passo indutivo (se P(k) é verdadeira, então P(k+1) é verdadeira) foi demonstrado.
    - Portanto, pelo Princípio da Indução Matemática, a proposição P(n) é verdadeira para _todos_ os números naturais $n$. Ou seja, a soma dos $n$ primeiros números pares positivos é sempre igual a $n(n+1)$.

#### 3.3. Exemplo 3: Aplicação na Vida Real - Combinações

**Problema:** Uma sorveteria oferece 3 sabores de sorvete: chocolate, morango e creme. Você pode escolher uma ou duas bolas de sorvete. Quantas combinações diferentes você pode fazer?

**Solução:**

- **Uma Bola:** Você pode escolher chocolate, morango ou creme (3 opções).
- **Duas Bolas (Sabores Iguais):** Você pode escolher chocolate-chocolate, morango-morango ou creme-creme (3 opções).
- **Duas Bolas (Sabores Diferentes):** Você pode escolher chocolate-morango, chocolate-creme ou morango-creme (3 opções).

**Total:** 3 + 3 + 3 = 9 combinações diferentes.

**Conexão com a Teoria:** Este problema envolve contagem de combinações. Embora não usemos diretamente os Axiomas de Peano aqui, a ideia fundamental de _enumerar sistematicamente_ todas as possibilidades está relacionada à contagem.

### 4. Exercícios:

#### 4.1. Nível Fácil:

1.  Conte quantos livros há em uma estante da sua casa. Explique como você usou a correspondência biunívoca nesse processo.
2.  Escreva os números naturais de 1 a 15 em ordem crescente e, em seguida, em ordem decrescente.
3.  Desenhe uma reta numérica e marque os números naturais de 3 a 12.
4.  Se você tem 4 frutas diferentes (maçã, banana, laranja, uva), quantas maneiras diferentes você tem de escolher uma fruta?
5.  (Novo) Quantos dias tem uma semana? Represente os dias da semana como um conjunto.

#### 4.2. Nível Médio:

1.  **Combinações:** Se você tem 4 calças e 5 camisas, quantas combinações diferentes de roupa você pode fazer? Explique seu raciocínio.
2.  **Usando os Axiomas de Peano (Desafio):** Prove que $3 + 2 = 5$. (Dica: Use a definição de sucessor e os Axiomas de Peano, como no exemplo $2+2=4$ da Teoria.)
3.  **Soma dos Naturais:** Use o Princípio da Indução para provar que $1 + 2 + 3 + ... + n = n(n+1)/2$. (Este é o exemplo da Teoria, mas tente fazer sem consultar a solução.)
4.  (Novo) Uma loja vende sanduíches com 3 opções de pão (francês, integral, italiano) e 4 opções de recheio (frango, queijo, presunto, vegetariano). Quantos tipos diferentes de sanduíche a loja oferece?
5.  (Novo) Explique com suas palavras o que significa o Princípio da Indução Matemática. Use a analogia dos dominós.

#### 4.3. Nível Difícil:

1.  **(OBMEP - Adaptada):** Uma escola tem 1000 alunos e 1000 armários numerados de 1 a 1000. Inicialmente, todos os armários estão fechados. Os alunos fazem o seguinte:

    - O primeiro aluno passa e abre todos os armários.
    - O segundo aluno passa e fecha os armários de número par (2, 4, 6, ...).
    - O terceiro aluno passa e inverte o estado dos armários múltiplos de 3 (abre os fechados e fecha os abertos).
    - E assim por diante, até o milésimo aluno.
      Quais armários ficarão abertos no final? (Dica: Pense nos divisores de um número.)

2.  **Indução (Desafio):** Prove, usando o Princípio da Indução, que para todo $n$ natural, $n^3 - n$ é divisível por 3.

3.  (Novo, Vestibular ITA) Quantos números naturais de 3 algarismos distintos existem?

4.  (Novo, Vestibular FUVEST) Uma pessoa segura em cada uma das mãos duas bolas coloridas, que podem ser verdes, amarelas ou vermelhas. Quantas são as diferentes configurações que essas quatro bolas podem apresentar?

5.  (Novo, Desafio - Generalização) Generalize o resultado do Exemplo 2 da seção "Prática". Ou seja, prove que a soma dos n primeiros termos de uma progressão aritmética é dada por:
    $S = n/2 * [2a + (n-1)r]$
    Onde:
    - S é a soma dos $n$ primeiros termos
    - a é o primeiro termo da progressão
    - r é a razão da progressão.

### 5. Fontes:

- IEZZI, Gelson; DOLCE, Osvaldo; DEGENSZAJN, David; PÉRIGO, Roberto. _Matemática_. Volume único. São Paulo: Atual, 1997. (ABNT: IEZZI, Gelson et al. **Matemática**. Volume único. São Paulo: Atual, 1997.)

- LIMA, Elon Lages. _Números e Funções Reais_. Rio de Janeiro: SBM, 2013. (ABNT: LIMA, Elon Lages. **Números e Funções Reais**. Rio de Janeiro: SBM, 2013.)

- HEFEZ, Abramo. _Elementos de Aritmética_. Rio de Janeiro: SBM, 2006. (ABNT: HEFEZ, Abramo. **Elementos de Aritmética**. Rio de Janeiro: SBM, 2006.)

- APOSTOL, Tom M. _Calculus, Volume 1_. 2nd ed. Waltham, Mass.: Blaisdell Publishing Company, 1967. (ABNT: APOSTOL, Tom M. **Calculus, Volume 1**. 2nd ed. Waltham, Mass.: Blaisdell Publishing Company, 1967.)

- NIVEN, Ivan; ZUCKERMAN, Herbert S.; MONTGOMERY, Hugh L. _An Introduction to the Theory of Numbers_. 5th ed. New York: John Wiley & Sons, 1991. (ABNT: NIVEN, Ivan; ZUCKERMAN, Herbert S.; MONTGOMERY, Hugh L. **An Introduction to the Theory of Numbers**. 5th ed. New York: John Wiley & Sons, 1991.)

---

**Gabarito:**

**4.1 Nível Fácil**

1.  Resposta pessoal (contagem dos livros). A correspondência biunívoca é usada ao associar cada livro a um número natural (ou a um "contador", como um dedo ou um risco em um papel).
2.  Crescente: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15. Decrescente: 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1.
3.  Resposta pessoal (desenho da reta numérica).
4.  4 maneiras (uma para cada fruta).
5.  7 dias. Conjunto: {Segunda-feira, Terça-feira, Quarta-feira, Quinta-feira, Sexta-feira, Sábado, Domingo}

**4.2 Nível Médio**

1.  4 calças \* 5 camisas = 20 combinações. Para cada calça, há 5 opções de camisa, e como há 4 calças, multiplicamos as possibilidades.
2.  1.  $3 + 2 = 3 + S(1)$ (Definição de 2)
    2.  $3 + S(1) = S(3 + 1)$ (Adição e Sucessor)
    3.  $3+1 = S(2+1) = S(S(1+1)) = S(S(2)) = S(3)$
    4.  Substituindo, $3+2 = S(3+1) = S(S(3))$
    5.  $S(S(3)) = S(4)$
    6.  $S(4) = 5$
        Portanto, $3+2=5$.

3.  Ver Exemplo 2 da seção "Prática" da Teoria.
4.  3 pães \* 4 recheios = 12 tipos de sanduíche.
5.  O Princípio da Indução Matemática é uma forma de provar que uma afirmação é verdadeira para todos os números naturais. É como uma fileira de dominós: se você derrubar o primeiro dominó (caso base) e cada dominó derrubar o próximo (passo indutivo), então todos os dominós cairão.

**4.3 Nível Difícil**

1.  Os armários que ficarão abertos são aqueles cujo número tem uma quantidade _ímpar_ de divisores. Isso acontece com os quadrados perfeitos (1, 4, 9, 16, 25, ..., 961). Por exemplo, o armário 16 será tocado pelos alunos 1, 2, 4, 8 e 16 (5 divisores). Já o armário 12 será tocado pelos alunos 1, 2, 3, 4, 6 e 12 (6 divisores). Portanto, os armários abertos são aqueles correspondentes aos quadrados perfeitos de 1 a 31 (já que $31^2 = 961$ e $32^2 = 1024$, que é maior que 1000)

2.  **Base:** Para n=1, $1^3 - 1 = 0$, que é divisível por 3.
    **Hipótese:** Suponha que $k^3 - k$ seja divisível por 3 para algum k natural.
    **Passo Indutivo:** Precisamos mostrar que $(k+1)^3 - (k+1)$ também é divisível por 3.
    $(k+1)^3 - (k+1) = k^3 + 3k^2 + 3k + 1 - k - 1 = (k^3 - k) + 3k^2 + 3k$
    Pela hipótese indutiva, $k^3 - k$ é divisível por 3. $3k^2$ e $3k$ também são divisíveis por 3. A soma de termos divisíveis por 3 é divisível por 3. Portanto, $(k+1)^3 - (k+1)$ é divisível por 3.
    **Conclusão:** Pelo Princípio da Indução, $n^3 - n$ é divisível por 3 para todo $n$ natural.

3.  O primeiro algarismo pode ser escolhido de 9 maneiras (não pode ser 0). O segundo algarismo pode ser escolhido de 9 maneiras (qualquer algarismo menos o que já foi usado). O terceiro algarismo pode ser escolhido de 8 maneiras (qualquer algarismo menos os dois já usados). Portanto, há $9 * 9 * 8 = 648$ números naturais de 3 algarismos distintos.

4.  Para a primeira bola na mão esquerda, há 3 opções de cores. Para a segunda bola na mão esquerda, também há 3 opções. O mesmo vale para as bolas na mão direita. Portanto, há $3 * 3 * 3 * 3 = 81$ configurações diferentes.

5.  **Demonstração por Indução:**

    - **Caso Base (n=1):**

      - $S = 1/2 * [2a + (1-1)r] = 1/2 * 2a = a$. A fórmula é válida para n=1.

    - **Hipótese Indutiva:** Suponha que a fórmula seja válida para algum $k$ ≥ 1. Ou seja, suponha que:

      - $S_k = k/2 * [2a + (k-1)r]$

    - **Passo Indutivo:** Precisamos mostrar que a fórmula é válida para $k+1$. Ou seja, precisamos mostrar que:

      - $S_(k+1) = (k+1)/2 * [2a + ((k+1)-1)r] = (k+1)/2 * [2a + kr]$

    - **Demonstração:**

      - $S_(k+1) = S_k + a_(k+1)$ (A soma dos $k+1$ primeiros termos é a soma dos $k$ primeiros mais o $(k+1)$-ésimo termo)
      - O $(k+1)$-ésimo termo de uma PA é dado por $a_(k+1) = a + kr$.
      - Substituindo $S_k$ pela hipótese indutiva e $a_(k+1)$ pela fórmula:
        - $S_(k+1) = k/2 * [2a + (k-1)r] + a + kr$
      - Expandindo e simplificando:

        - $S_(k+1) = ka + k^2r/2 - kr/2 + a + kr$
        - $S_(k+1) = (2ka + k^2r - kr + 2a + 2kr) / 2$
        - $S_(k+1) = (2ka + 2a + k^2r + kr) / 2$
        - $S_(k+1) = [2a(k+1) + kr(k+1)] / 2$
        - $S_(k+1) = (k+1)(2a + kr) / 2$

      - Isso é exatamente o que queríamos provar.

    - **Conclusão:** Pelo Princípio da Indução, a fórmula $S = n/2 * [2a + (n-1)r]$ é válida para todos os números naturais $n$.
