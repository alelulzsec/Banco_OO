import java.util.Scanner;

public class TesteConta{

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		Conta c = new Conta();
		
		System.out.printf("Numero da conta: ");
		c.setNumeroConta(teclado.nextInt()); teclado.nextLine();
		
		System.out.printf("Titular: ");
		c.setTitular(teclado.nextLine());
		
		System.out.printf("Limite: ");
		c.setLimite(teclado.nextFloat()); teclado.nextLine();
		
		System.out.printf("O numero da conta eh: %d\n", c.getNumeroConta());
		
		int op=0;
		while(op!=4){
			System.out.printf("1 - Saque\n");
			System.out.printf("2 - Deposito\n");
			System.out.printf("3 - Ver Saldo\n");
			System.out.printf("4 - Sair\n");
			op=teclado.nextInt(); teclado.nextLine();
			switch(op){
				case 1:
					System.out.printf("Valor: ");
					if(c.saque(teclado.nextFloat())){
						System.out.printf("Saque realizado com sucesso\n");
					} else {
						System.out.printf("ERRO - Saldo insuficiente\n");
					}
					teclado.nextLine();
					break;
				case 2:
					System.out.printf("Valor: ");
					c.deposito(teclado.nextFloat()); teclado.nextLine();
					break;
				case 3:
					System.out.printf("Saldo: %.2f\n", c.getSaldo());
			}
		}
	}

}
