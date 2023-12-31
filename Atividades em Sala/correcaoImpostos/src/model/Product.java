package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double costPrice;
	private double profit;
	private List<Tax>taxes;
	
	public Product (String name , double costPrice, double profit) throws Exception {
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		this.taxes = new ArrayList<>();
		
	}
	
	public boolean addTax(Tax tax ) throws Exception {
		
		if (tax == null) throw new Exception("Imposto não pode ser nulo.");
		
		if (taxes.contains(tax))
			return false;
		else taxes.add(tax);
			return true;
	}
	
	public void calculateSalePrice() {
		// calcular os impostos
		double taxesSum = 0;
		
		//somar ao preço de custo
		//calcular o valor final
	}
	
	
	
	private void setCostPrice (double costPrice) throws Exception {
		if (costPrice <= 0) throw new Exception("Preço de custo está invalido.");
		this.costPrice = costPrice;
	}
	
	private void setProfit(double profit)throws Exception {
		if (profit <= 0) throw new Exception("Margem está Invalida");
		
		this.profit = profit/100;
	}
	
	private void setName (String name) throws Exception {
		if (name == null || name.equals("")) throw new Exception ("Nome Inválido");
		this.name = name;
	}
	
}
