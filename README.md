# avaliacao-design-patterns-java
:clipboard: Repositório com a resolução da avaliação bimestral sobre design patters em Java.

## :pushpin: Questão 1
Elabore um adaptador (Chromecast), para transformar uma Televisão antiga em uma Televisão Smart.

## :pushpin: Questão 2
Construa um programa JAVA para uma loja de equipamentos eletrônicos, que contenha o seguintes métodos: comprar, vender e visualizarLucro. 

Dados importantes: 

* Existem várias lojas no mercado (concorrentes). 
* Todas as lojas fazem as mesmas operações (métodos).
* Existem várias maneiras de interagir com essa loja (Ex: Loja física e virtual). 

Utilizando o padrão Proxy desenvolva uma codificação, onde a Loja Física implementa a interface da Loja Virtual.
Cada Proxy deverá acessar a Loja por meio de uma fachada (Facade).

## :pushpin: Questão 3
Com o padrão Observer em mente, crie uma classe abstrata com nome "InformacoesInternas", que será utilizada para enviar atualização de informações, aos alunos, professores e técnicos, sobre tudo que acontece no IFMS durante o período de pandemia. Os objetos dessa classe devem ser responsáveis pelo monitoramento de uma fonte de informações (Reitoria) e quando surgir uma nova notícia, irá ser chamado um método abstrato da própria classe chamado:

**public abstract void novaInformacao(String tipo, String titulo, String texto, int dia, int mes);**

O parâmetro tipo definirá qual será o tipo de informação (informações de administrativas ou informações de ensino). 

Posteriormente terá que ser criado pelo menos duas classes que herdam as informações internas e consomem a noticia. Sugestão de nomes Alunos e Professores.

Deverá ser criado também uma classe que irá representar a fonte de informações, que deverá ter uma lista de "InformacoesInternas", seus atributos e métodos necessários para o funcionamento e dois métodos um para anexar as informações e outro para notificar todos os envolvidos.

Por fim na classe principal deverá ser testado se o pattern funciona, por isso deve ser instanciado a fonte de informações e as duas classes que irão consumir a notícia passando como parâmetro a mesma fonte. Logo deverá ser setada os atributos da fonte e enviado a todos as informações.

## Licença :page_facing_up:

[MIT](/LICENSE) &copy; Carlos Henrique da Costa Silva

<p align="center" style="margin-top: 20px; border-top: 1px solid #eee; padding-top: 20px;">Feito com :brown_heart: por <strong> Carlos Henrique da Costa Silva </strong> </p>
