package playground;
public class ch3_2 {
	/*static*/ int a;
	static int b;
	public static void main(String[] args) {
		ch3_2 a = new ch3_2();
		System.out.println("a: " + a.a);
		System.out.println("b: " + ch3_2.b);
		a.change(5);
		ch3_2 c = new ch3_2();
		System.out.println("b: " + ch3_2.b);
		System.out.println("a: " + c.a);
		// b.main(null); // Recursividade de métodos
	}
	public void change(int number) {
		b = number;
	}
}

// Variáveis de instância STATIC são inicializadas automaticamente e podem ser utilizadas sem a necessidade de um objeto
// Variáveis de instância NON-STATIC (não estáticas) não são possíveis de serem utilizadas sem um objeto, sendo assim, não são inicializadas automaticamente, a menos que haja um objeto
