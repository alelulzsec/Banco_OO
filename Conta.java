/*
 * Modificar a classe Conta para que cada vez que uma Conta
 * for criada, gerar um número sequencial para usar como 
 * número da conta.
 * 
 * */

public class Conta
{
	private int numero;
	private String titular;
	private float saldo;
	private float limite;
	
	public boolean saque(float valor){
		if(limite+saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}
	
	public void deposito(float valor){
		saldo+=valor;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setNumeroConta(int n) {
		numero = n;
	}
	public int getNumeroConta() {
		return numero;
	}
	
	public void setTitular(String t){
		titular = t;
	}
	public String getTitular(){
		return titular;
	}
	
	public void setLimite(float l){
		limite = l;
	}
	public float getLimite(){
		return limite;
	}
}
