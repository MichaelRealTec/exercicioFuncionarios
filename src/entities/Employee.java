package entities;

public class Employee {
	// Atributos
	public String name;
	public double grossSalary;
	public double tax;
	
	// Métodos
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
