package chapter1;

public class Ex1_10 {
	public static void main(String[] args) {
		System.out.println("See the comments.");
	}
}

/* 1.10
 * 
 * Objeto a ser discutido: REL�GIO
 * 
 * Palavras:
 * 
 * � Objeto: � um objeto que informa o usu�rio sobre as horas, data e informa��es adicionais e opcionais
 * 
 * � Atributo: o rel�gio pode ser de pl�stico, ferro, prata, ouro, vidro, pode ser ou n�o � prova d'�gua, pode ter ponteiros fluorescentes e pode ter diversas cores ao fundo dos ponteiros e n�meros, pode ser digital ou anal�gico, ou mesmo uma mescla de ambos e por a� vai
 * 
 * � Comportamentos: o rel�gio pode ter um comportamento variado em certas horas do dia, pode ter algum bot�o de tornar os mostradores vis�veis em locais escuros, pode ter um comportamento diferenciado quando submerso ou em grandes altitudes e at� mesmo pode apitar quando hor�rios de alarmes forem atingidos
 * 
 * � Classe: prov�m de uma categoria de produtos especializados em informar ao usu�rio as horas, a data e informa��es adicionais e opcionais, como altitude, localiza��o atrav�s de b�ssola e entre outras coisas
 * 
 * � Heran�a: herdou caracter�sticas por exemplo do rel�gio convencional, que costumamos p�r � cabeceira de nossas camas e tamb�m dos antigos rel�gios usados por fidalgos em seu dia a dia. E algumas a��es, como soar o alarme em determinadas horas, tamb�m foram herdadas, bem como carater�sticas, por exemplo, aos anal�gicos, a distribui��o de 12 horas e 60 minutos na organiza��o do rel�gio
 * 
 * � Abstra��o: objeto utilizado para informar a hora e data
 * 
 * � Modelagem: cont�m ponteiros para horas e minutos, e para informa��es adicionais, cont�m os n�meros, se anal�gicos, distribuidos em 12 horas equidistantes ao longo da circunfer�ncia do rel�gio e possui uma pulseira adaptativa ou n�o ao pulso do usu�rio
 * 
 * � Mensagens: o rel�gio se comunica com seu usu�rio atrav�s de mudan�as na organiza��o, provocadas pelo uso de bot�es e afins e tamb�m atrav�s de sons, por exemplo, o soar do alarme.
 * 
 * � Encapsulamento: rel�gios anal�gicos possuem manivelas no lado exterior que s�o travadas e quando s�o puxadas entram em contato com os ponteiros e alteram a hora mostrada, isto � um exemplo de m�todo, representado pela manivela, p�blico e acess�vel ao usu�rio, e atributos, representados pelas horas marcadas nos ponteiros, que n�o s�o acess�veis diretamente ao usu�rio, sendo modificados somente, em uso di�rio, pelas manivelas. Nos rel�gios digitais o processo � an�logo, mas os atributos, obviamente, n�o s�o os ponteiros e sim os mostradores digitais que s�o alterados atrav�s de sequ�ncias predefinidas de bot�es, e n�o mais manivelas.
 * 
 * � Interface: // N�o estudei.
 *
 * � Ocultamento de Informa��es: como dito no t�pico de encapsulamento, o atributo somente � alterado pelo m�todo respectivo a ele, sendo assim, n�o � necess�rio que o m�todo saiba a todo momento qual � a informa��o armazenada no atributo, bem como, n�o � necess�rio que a manivela ou o bot�o do rel�gio saiba sempre qual � a hora atual, somente quando for manuse�-la, por assim dizer, � claro, sabemos que a manivela ou bot�o n�o precisa saber a hora exata, pois eles fazem somente incrementa��es ou decrementa��es no hor�rio marcado, e n�o necessitam armazenar o dado inicial, a hora marcada antes de o usu�rio solicitar ao rel�gio a sua altera��o, em lugar algum.
 *  
 */

// T�PICOS DO 'Fazendo a Diferen�a' FORAM POSTOS EM SEGUNDO PLANO, THE KNOWLEDGE IS THE TOP.
 