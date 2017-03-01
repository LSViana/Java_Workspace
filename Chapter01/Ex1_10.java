package chapter1;

public class Ex1_10 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 1.10
 * 
 * Objeto a ser discutido: RELÓGIO
 * 
 * Palavras:
 * 
 * • Objeto: é um objeto que informa o usuário sobre as horas, data e informações adicionais e opcionais
 * 
 * • Atributo: o relógio pode ser de plástico, ferro, prata, ouro, vidro, pode ser ou não à prova d'água, pode ter ponteiros fluorescentes e pode ter diversas cores ao fundo dos ponteiros e números, pode ser digital ou analógico, ou mesmo uma mescla de ambos e por aí vai
 * 
 * • Comportamentos: o relógio pode ter um comportamento variado em certas horas do dia, pode ter algum botão de tornar os mostradores visíveis em locais escuros, pode ter um comportamento diferenciado quando submerso ou em grandes altitudes e até mesmo pode apitar quando horários de alarmes forem atingidos
 * 
 * • Classe: provém de uma categoria de produtos especializados em informar ao usuário as horas, a data e informações adicionais e opcionais, como altitude, localização através de bússola e entre outras coisas
 * 
 * • Herança: herdou características por exemplo do relógio convencional, que costumamos pôr à cabeceira de nossas camas e também dos antigos relógios usados por fidalgos em seu dia a dia. E algumas ações, como soar o alarme em determinadas horas, também foram herdadas, bem como caraterísticas, por exemplo, aos analógicos, a distribuição de 12 horas e 60 minutos na organização do relógio
 * 
 * • Abstração: objeto utilizado para informar a hora e data
 * 
 * • Modelagem: contém ponteiros para horas e minutos, e para informações adicionais, contém os números, se analógicos, distribuidos em 12 horas equidistantes ao longo da circunferência do relógio e possui uma pulseira adaptativa ou não ao pulso do usuário
 * 
 * • Mensagens: o relógio se comunica com seu usuário através de mudanças na organização, provocadas pelo uso de botões e afins e também através de sons, por exemplo, o soar do alarme.
 * 
 * • Encapsulamento: relógios analógicos possuem manivelas no lado exterior que são travadas e quando são puxadas entram em contato com os ponteiros e alteram a hora mostrada, isto é um exemplo de método, representado pela manivela, público e acessível ao usuário, e atributos, representados pelas horas marcadas nos ponteiros, que não são acessíveis diretamente ao usuário, sendo modificados somente, em uso diário, pelas manivelas. Nos relógios digitais o processo é análogo, mas os atributos, obviamente, não são os ponteiros e sim os mostradores digitais que são alterados através de sequências predefinidas de botões, e não mais manivelas.
 * 
 * • Interface: // Não estudei.
 *
 * • Ocultamento de Informações: como dito no tópico de encapsulamento, o atributo somente é alterado pelo método respectivo a ele, sendo assim, não é necessário que o método saiba a todo momento qual é a informação armazenada no atributo, bem como, não é necessário que a manivela ou o botão do relógio saiba sempre qual é a hora atual, somente quando for manuseá-la, por assim dizer, é claro, sabemos que a manivela ou botão não precisa saber a hora exata, pois eles fazem somente incrementações ou decrementações no horário marcado, e não necessitam armazenar o dado inicial, a hora marcada antes de o usuário solicitar ao relógio a sua alteração, em lugar algum.
 *  
 */

// TÓPICOS DO 'Fazendo a Diferença' FORAM POSTOS EM SEGUNDO PLANO, THE KNOWLEDGE IS THE TOP.
 