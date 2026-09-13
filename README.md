#Docentes: Augusto César Oliveira e Domingos Savio de Oliveira Santos Junior.
#Discente: Clarissa Rayane Aguiar Aurino Silva.
#Disciplina: Paradigmas de Linguagens de Programação.
#Curso: 5º S.I.
  

#Resostas:

#1.Isso acontece por causa da composição e do encapsulamento. O zoológico tem uma lista de animais dentro dele, mas o zoológico em si não é uma lista. Se a gente fizesse a classe Zoologico herdar direto de ArrayList, ela ia deixar expostos vários métodos de lista que não fazem sentido para o zoológico. Deixando a lista privada dentro da classe, a gente garante que só os métodos do zoológico mexem nos animais do jeito certo.

#2.O Java não deixa uma classe herdar de duas classes ao mesmo tempo para evitar confusão de código (o famoso problema do diamante, quando duas classes pai têm métodos iguais e o Java não sabe qual usar). Já com interfaces não tem esse problema, porque elas só dizem o que precisa ser feito, sem guardar código pronto nem atributos. Como o próprio Pato é quem escreve o código de nadar() e voar(), não dá conflito.

#3.Por conta do polimorfismo. No loop, a variável foi criada como Animal, mas na hora que o programa roda, o Java olha qual é o objeto de verdade que está salvo ali na memória (se é um Cachorro, um Gato, etc.) e chama o método emitirSom() específico daquela classe.