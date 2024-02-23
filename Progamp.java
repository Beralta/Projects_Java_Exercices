package SectionNinePOO.Constructor.newExercice;
import java.util.Scanner;

public class Progamp {

	public static void main(String[] args) {
		
		BankAccount bankaccount = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		bankaccount.setNumberAccount(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		bankaccount.setNameTitular(sc.nextLine());
		
		System.out.print("Is there na initial deposit? (y-n): ");
		String input = sc.nextLine();
		
		if(input.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			bankaccount.setValor(sc.nextDouble());
			sc.nextLine();
			System.out.println();
			
			System.out.println(bankaccount);
			System.out.println();
			
			System.out.print("Enter a deposit value: ");
			bankaccount.Update(sc.nextDouble());
			System.out.println(bankaccount);
			System.out.println();
			
			System.out.print("Enter a withdraw value ($5 fee to withdraw): ");
			bankaccount.Withdraw(sc.nextDouble());
			System.out.print(bankaccount);
			System.out.print("Finished");
			
			
			sc.close();
		} else {
			System.out.println("Registred!");
		}
		
		
	}

}
