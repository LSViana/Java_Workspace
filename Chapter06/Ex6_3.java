package chapter6;
public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("\tTesting method's calls in Math class\n");
		// Static method 'abs' of Math class
		System.out.printf("%-8s\t%-30s\t%8s\t%15f\n", "abs(x)", "Valor absoluto de x", "abs(23.7)", Math.abs(23.7));
		System.out.printf("%48s%-8s\t%15f\n", "", "abs(0.0)", Math.abs(0.0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "abs(-23.7)", Math.abs(-23.7));
		// Static method 'ceil' of Math class
		System.out.printf("%-8s\t%-30s\t%8s\t%15f\n", "ceil(x)", "Valor inteiro acima de x", "ceil(9.2)", Math.ceil(9.2));
		System.out.printf("%48s%-8s\t%15f\n", "", "ceil(0.0)", Math.ceil(0.0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "ceil(-9.8)", Math.ceil(-9.8));
		// Static method 'cos' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "cos(x)", "Cosseno trigonométrico de x", "cos(0)", Math.cos(0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "cos(PI)", Math.cos(Math.PI));
		// Static method 'exp' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "exp(1)", "Potência de e^x", "exp(1)", Math.exp(1));
		System.out.printf("%48s%-8s\t%15f\n", "", "exp(2)", Math.exp(2));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "exp(0)", Math.exp(0));
		// Static method 'floor' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "floor(x)", "Valor inteiro abaixo de x", "floor(9.2)", Math.floor(9.2));
		System.out.printf("%48s%-8s\t%15f\n", "", "floor(0.0)", Math.floor(0.0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "floor(-9.8)", Math.floor(-9.8));
		// Static method 'log' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "log(x)", "Logaritmo natural de x", "log(E)", Math.log(Math.E));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "log(E*E)", Math.log(Math.E * Math.E));
		// Static method 'max' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "max(x, y)", "Maior valor entre x e y", "max(2.3, 12.7)", Math.max(2.3, 12.7));
		System.out.printf("%48s%-8s%15f\n\n", "", "max(-2.3, -12.7)", Math.max(-2.3, -12.7));
		// Static method 'min' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "min(x, y)", "Menor valor entre x e y", "min(2.3, 12.7)", Math.min(2.3, 12.7));
		System.out.printf("%48s%-8s%15f\n\n", "", "min(-2.3, -12.7)", Math.min(-2.3, -12.7));
		// Static method 'pow' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "pow(x, y)", "x elevado à potência y", "pow(2.0, 7.0)", Math.pow(2.0, 7.0));
		System.out.printf("%48s%-8s\t%15f\n", "", "pow(9.0, 0.5)", Math.pow(9.0, 0.5));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "pow(16.0, 0.0)", Math.pow(16.0, 0.0));
		// Static method 'sin' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "sin(x)", "Seno trigonométrico de x", "sin(0)", Math.sin(0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "sin(PI / 2)", Math.sin(Math.PI / 2));
		// Static method 'sqrt' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "sqrt(x)", "Raiz quadrada de x", "sqrt(900.0)", Math.sqrt(900.0));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "sqrt(9.0)", Math.sqrt(9.0));
		// Static method 'tan' of Math class
		System.out.printf("%-8s\t%-30s\t%-8s\t%15f\n", "tan(x)", "Tangente trigonométrica de x", "tan(0)", Math.tan(0));
		System.out.printf("%48s%-8s\t%15f\n", "", "tan(PI / 4)", Math.tan(Math.PI / 4));
		System.out.printf("%48s%-8s\t%15f\n\n", "", "tan(3 * PI / 4)", Math.tan(3 * Math.PI));
	}
}

// As saídas não foram exatamente iguais, o valor das saídas foram equivalentes, mas os números foram gerados com 6 números decimais após a vírgula, como foi dito ser o padrão adotado pela JVM ao compilar os aplicativos
