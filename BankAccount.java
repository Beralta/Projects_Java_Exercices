package SectionNinePOO.Constructor.newExercice;

public class BankAccount {
	private int numberAccount;
	private String nameTitular;
	private Double valor;
	
	public BankAccount() {
		
	}
	
public BankAccount(int numberaccount, String nametitular, Double valor) {
		this.numberAccount = numberaccount;
		this.nameTitular = nametitular;
		this.valor = valor;
	}

public BankAccount(int numberaccount, String nametitular) {
		this.numberAccount = numberaccount;
		this.nameTitular = nametitular;
		this.valor = 0.00;
	}

public int getNumberAccount() {
	return numberAccount;
}

public void setNumberAccount(int numberAccount) {
	this.numberAccount = numberAccount;
}

public String getNameTitular() {
	return nameTitular;
}

public void setNameTitular(String nameTitular) {
	this.nameTitular = nameTitular;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

public Double Update(Double update) {
	return valor = this.valor + update;
}

public Double Withdraw(Double withdraw) {
	return valor = (this.valor - withdraw) - 5;
}

@Override
public String toString() {
	return "Account data:\nAccount "
			+ getNumberAccount() 
			+ ", Holder: " 
			+ getNameTitular() 
			+ ", Balance: $ " 
			+ getValor();
}


}
