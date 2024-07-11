package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
public class Program {

	public static void main(String[] args) {
		// Exercicio dos funcionarios - DevSuperior
		/*
Nome: Joao Silva
Salário bruto: 6000.00
Imposto: 1000.00
Funcionário: Joao Silva, $ 5000.00
Qual a porcentagem para aumentar o salário? 10.0
Dados atualizados: Joao Silva, $ 5600.00
		 */
		
		Employee employee = new Employee();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		
		System.out.print("Funcionário: " + employee.toString());
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Dados atualizados: " + employee.toString());
		
		sc.close();
	}

}
