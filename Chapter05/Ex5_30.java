package chapter5;
import java.util.Scanner;
public class Ex5_30 {
	public static void main(String[] args) {
		System.out.println("\tGLOBAL WARMING QUIZ\n");
		System.out.println("The questions have 4 alternatives, just one is correct, put the number of that you think is right.");
		int answer = 0;
		for(int i = 1; i <= 5; i++) {
			answer += question(i);
		} switch (answer) {
			case 5: System.out.println("\nYou've got an excellent result, congratulations!"); break;
			case 4: System.out.println("\nVery good, you really know about global warming!"); break;
			default: System.out.println("\nIt's time to improve your knowledge about global warming."); break;
		}
		System.out.println("Information from 'https://www.skepticalscience.com/argument.php'.");
	}
	public static int question(int number) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		switch(number) {
			case 1: 
				System.out.print("\nIs the sun the responsable by the global warming?\n1 - Yes, of course\n2 - No, but he has been doing a lot for this\n3 - No, it's been doing little for this, the responsable are the humans\n4 - No, the responsable are the animals\n\nYour answer: ");
				result = input.nextInt(); if(result == 3) return 1; else return 0;
			case 2:
				System.out.print("\nIs there a consensus about global warming?\n1 - Yes, 97% of the climate experts agree humans are causing it\n2 - No, but we're almost\n3 - No, the science is undecided about it\n4 - Yes, the climate experts agree animals are causing it\n\nYour answer: ");
				result = input.nextInt(); if(result == 1) return 1; else return 0;
			case 3:
				System.out.print("\nIs CO2 lagging temperature?\n1 - Yes, it has always done it\n2 - No, it has never done it\n3 - Yes, but just actually, with its levels increasing rapidly\n4 - No, it doesn't matter for global warming\n\nYour answer: ");
				result = input.nextInt(); if(result == 3) return 1; else return 0;	
			case 4:
				System.out.print("\nGlaciers are growing.\n1 - True, Antarctica has been growing rapidly\n2 - True, the ice sheets in the world are getting bigger\n3 - False, Antarctica is retreating, but it doesn't matter for humans because we don't live there\n4 - True, Antarctica is retreating, it's a serious problem for who rely on glaciers for water\n\nYour answer: ");
				result = input.nextInt(); if(result == 4) return 1; else return 0;
			case 5:
				System.out.print("\nThe world is cooling.\n1 - True, Africa is getting cold\n2 - True, oceans around the world are getting cold\n3 - False, the world is getting hot in the last years\n4 - True, Amazonia is getting cold\n\nYour answer: ");
				result = input.nextInt(); if(result == 3) return 1; else return 0;
			default: System.out.println("The question hasn't found. We're sorry!");
		}
		input.close();
		return 0;
	}
}
