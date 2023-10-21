
| Curso | BOOTCAMP SANTANDER 2023 - DIO  |
| -------------  |--------------------------------|
| Nome        | **Ganhando_produtividade_com_Stream_API_Java**  
| Tecnologias | Java, Collections, Intellij, Stream                 
| URL         | https://github.com/Thamyresmya/Santander_Bootcamp_Back-End-Java-Stream_API


![](geral/Capa.png)


# Curso: Ganhando Produtividade com Stream API Java


<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  
  <a href="#-conteudo">Conteúdo</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;  
  <a href="#-tecnica">Técnicas</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</p>

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- Java
- Stream
- Collections
- Intellij
- Git e Github


## 💻 Conteúdo

A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.

Combinada com as Expressões Lambda e Method reference, eles proporcionam uma forma diferente de lidar com conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.

As operações na Stream API podem ser classificadas em duas categorias principais:

1 - "Operações Intermediárias": são aquelas que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados. São elas:

* `filter(Predicate<T> predicate)`: Filtra os elementos da Stream com base em um predicado. Retorna uma nova Stream contendo apenas os elementos que atendem ao critério do predicado. Exemplo: `stream.filter(n -> n > 5)`
* `map(Function<T, R> mapper)`: Transforma cada elemento da Stream usando a função especificada e retorna uma nova Stream contendo os elementos resultantes. Exemplo: `stream.map(s -> s.toUpperCase())`
* `sorted()`: Classifica os elementos da Stream em ordem natural (se os elementos forem comparáveis) ou de acordo com um comparador fornecido. Exemplo: `stream.sorted()`
* `distinct()`: Remove elementos duplicados da Stream, considerando a implementação do método equals() para comparação. Exemplo: `stream.distinct()`
* `limit(long maxSize)`: Limita o número de elementos da Stream aos maxSize primeiros elementos Exemplo: `stream.limit(10)`
* `skip(long n)`: Pula os primeiros n elementos da Stream e retorna uma nova Stream sem eles. Exemplo: `stream.skip(5)`

2 - "Operações Terminais": são aquelas que encerram o pipeline e produzem um resultado final. São elas:

* `forEach(Consumer<T> action)`: Executa uma ação para cada elemento da Stream. Exemplo: `stream.forEach(System.out::println)`
* `toArray()`: Converte a Stream em um array contendo os elementos da Stream Exemplo: `stream.toArray()`
* `collect(Collector<T, A, R> collector)`: Coleta os elementos da Stream em uma estrutura de dados específica, como uma lista ou um mapa. Exemplo: `stream.collect(Collectors.toList())`
* `count()`: Retorna o número de elementos na Stream. Exemplo: `stream.count()`
* `anyMatch(Predicate<T> predicate)`: Verifica se algum elemento da Stream atende ao predicado especificado. Exemplo: `stream.anyMatch(s -> s.startsWith("A"))`
* `allMatch(Predicate<T> predicate)`: Verifica se todos os elementos da Stream atendem ao predicado especificado. Exemplo: `stream.allMatch(n -> n > 0)`
* `noneMatch(Predicate<T> predicate)`: Verifica se nenhum elemento da Stream atende ao predicado especificado. Exemplo: `stream.noneMatch(s -> s.isEmpty())`
* `min(Comparator<T> comparator) e max(Comparator<T> comparator)`: Encontra o elemento mínimo e máximo da Stream, respectivamente, de acordo com o comparador fornecido. Exemplo: `stream.min(Comparator.naturalOrder()) ou stream.max(Comparator.naturalOrder())`
* `reduce(T identity, BinaryOperator<T> accumulator)`: Combina os elementos da Stream usando o acumulador especificado e retorna o resultado final. Exemplo: `stream.reduce(0, (a, b) -> a + b)`


## 📁 Acesso ao projeto
É possível acessar o código através deste [Link](https://github.com/Thamyresmya/Santander_Bootcamp_Back-End-Java-Stream_API).

Neste repositório você tem acesso a todo o material desenvolvido.


## ✔️ Técnicas e tecnologias utilizadas

- `JAVA`:  A linguagem de programação Java é objetivada principalmente na orientação a objeto, independência de plataforma, recursos de rede, carga dinâmica de código e segurança, além disso, é uma linguagem copilada.

- `Collection Framework`: Qualquer grupo de objetos individuais representados como uma única unidade é conhecido como coleção de objetos. Em Java, uma estrutura separada chamada “Collection Framework” foi definida no JDK 1.2, que contém todas as classes de coleção e interface nela. Em Java, a interface Collection ( java.util.Collection ) e a interface Map ( java.util.Map ) são as duas principais interfaces “raiz” das classes de coleção Java.

- `Stream API`: A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.

- `Lambda`: As expressões lambda permitem representar interfaces funcionais (interfaces com um único método abstrato) de forma mais concisa e possibilitam escrever código no estilo funcional.

- `Method Reference`: Method Reference é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.


## 🔗 Me siga nas redes sociais:
- [Linkedin](https://www.linkedin.com/in/thamyrescavalcante/)
- [Instagran](https://www.instagram.com/thamyres__cavalcante/)

<br>

---

### Direitos reservado de 💜 Camila Cavalcante | Dio.me