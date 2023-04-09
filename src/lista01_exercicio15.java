import java.util.Scanner;

public class lista01_exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double imposto, inss, sindicato, salarioliquido, salariobruto;
		
		System.out.print("Quanto você ganha por hora? R$");
		double salario_hora = sc.nextInt();
		
		System.out.print("Quantas horas você trabalha por dia? ");
		int hora_trabalhada = sc.nextInt();
	
		salariobruto = salario_hora * (hora_trabalhada * 30);
	
		
		// Descontos do salário
		imposto = (100 * 11) / 100;
		inss = (100 * 8) / 100;
		sindicato = (100 * 5) / 100;
		
		salarioliquido = salariobruto - (imposto + inss + sindicato);
		
		System.out.printf("Seu salário BRUTO é R$%.2f e por conta dos descontos do impost, INSS e Sindicato, seu salário LÍQUIDO é igual a R$%.2f%n", salariobruto, salarioliquido);
		

	}

}