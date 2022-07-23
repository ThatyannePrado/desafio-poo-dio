# Desafio de Orientação a Objetos Java

Programa responsável pela inscrição de devs em bootcamps na classe 'Main'.<br><br>
A classe 'Conteudo' é responsável por prover atributos essenciais dos materiais do bootcamp, como título, descrição e o método de cálculo da XP.<br><br>
Há dois tipos de conteúdos, que são definidos como classes-filhas de 'Conteudo':
<br>
1) Curso: que possui o atributo 'cargaHoraria';
2) Mentoria:que possui o atributo 'data'.

A classe 'Dev' define quem será inscrito no bootcamp. Possui como atributos:
<br>
1) nome;
2) conteudosInscritos;
3) conteudosConcluidos.

Já os métodos de 'Dev' são:
1) inscreverBootcamp: responsável por inscrever o dev no bootcamp desejado;
2) progredir: adiciona o primeiro conteúdo da lista de 'conteudosInscritos' na lista de 'conteudosConcluidos';
3) calcularTotalXp: realiza a chamada do método 'calculaXP' de 'Conteudos.'

A classe 'Bootcamp' contém os elementos essenciais para a realização de tal atividade:
<br>
1) nome;
2) descricao;
3) dataInicial: que é definida como sendo a data de criação da instância;
4) dataFinal: definida como 45 dias após a data inicial;
5) devsInscritos: set contendo os Devs;
6) conteudos: set contendo os Conteúdos (cursos e mentorias).

<br><br>
<b> Programa desenvolvido no Santander Code Girls 2022, da DIO.