package br.com.alura.servidor;

import java.io.PrintStream;

import javax.management.RuntimeErrorException;

public class ComandoC2 implements Runnable {

	private PrintStream saidaCliente;

	public ComandoC2(PrintStream saidaCliente) {
		this.saidaCliente = saidaCliente;
	}

	@Override
	public void run() {
		System.out.println("Exercutando comando c2");
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		saidaCliente.println("Comando c2 exercutado com Sucesso!");
		

	}

}
