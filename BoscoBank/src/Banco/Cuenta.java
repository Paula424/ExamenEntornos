package Banco;

import java.io.Serializable;

/**
 *
 * @author Paula
 */
public class Cuenta implements Serializable, Operable {

	private String iban;
	private String titular;
	private double saldo;
	public String dni;

	public Cuenta(String iban, String titular, String dni) {
		this.setIban(iban);
		this.setTitular(titular);
		this.setSaldo(0);
		this.dni = dni;
	}

	public Cuenta() {
		this.setIban("");
		this.setTitular("");
		this.setSaldo(0);
		this.dni = "";
	}

	@Override
	public void ingresar(double cantidad) {
		this.setSaldo(this.getSaldo() + cantidad);
	}

	@Override
	public void retirar(double cantidad) {
		this.setSaldo(this.getSaldo() - cantidad);
	}

	@Override
	public String toString() {
		return String.format("%-24s %-30s %9s %10.2f", this.getIban(), this.getTitular(), this.dni, this.getSaldo());
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

}
