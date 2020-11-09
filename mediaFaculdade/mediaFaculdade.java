package Java;
import java.util.Scanner;


public class mediaFaculdade {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double prova1, prova2, prova3, projeto1, projeto2, projeto3, exercicio1, exercicio2, exercicio3, trabalho1, trabalho2, trabalho3;
		System.out.print("Digite a nota da sua primeira prova: ");
		prova1 = sn.nextDouble();
		System.out.print("Digite a nota do seu primeiro projeto: ");
		projeto1 = sn.nextDouble();
		System.out.print("Digite a nota do seu primeiro exercicio: ");
		exercicio1 = sn.nextDouble();
		System.out.print("Digite a nota do seu primeiro trabalho: ");
		trabalho1 = sn.nextDouble();
		System.out.print("Digite a nota da sua segunda prova: ");
		prova2 = sn.nextDouble();
		System.out.print("Digite a nota do seu segundo projeto: ");
		projeto2 = sn.nextDouble();
		System.out.print("Digite a nota do seu segundo exercicio: ");
		exercicio2 = sn.nextDouble();
		System.out.print("Digite a nota do seu segundo trabalho: ");
		trabalho2 = sn.nextDouble();
		System.out.print("Digite a nota da sua terceira prova: ");
		prova3 = sn.nextDouble();
		System.out.print("Digite a nota do seu terceiro projeto: ");
		projeto3 = sn.nextDouble();
		System.out.print("Digite a nota do seu terceiro exercicio: ");
		exercicio3 = sn.nextDouble();
		System.out.print("Digite a nota do seu terceiro trabalho: ");
		trabalho3 = sn.nextDouble();

		double b1, b2, b3;
		b1 = ((prova1 * 3) + (projeto1 * 3) + (exercicio1 * 2) + (trabalho1 * 3)) / 11;
		b2 = ((prova2 * 3) + (projeto2 * 3) + (exercicio2 * 2) + (trabalho2 * 3)) / 11;
		b3 = ((prova3 * 3) + (projeto3 * 3) + (exercicio3 * 2) + (trabalho3 * 3)) / 11;
		
		double mediaSemestre = (b1 + b2 + b3) / 3;
//		System.out.print("Sua média semestral é: " + mediaSemestre);
		double AF = 10.00 - mediaSemestre;
		
		if (mediaSemestre >= 8) {
			System.out.print("O aluno foi aprovado!");
		} else if (mediaSemestre < 8) {
			System.out.print("O aluno está reprovado! \n");
			System.out.print("Para o aluno ter aprovação, é necessário ele tirar, " + AF + " na avaliação final.");
		}
		
		
		
	}

}
