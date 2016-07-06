package br.com.esec.deadlock;

public class Main {
	public static void main(String[] args) {
		GerenciadorDeTransacao gerenciadorDeTransacao = new GerenciadorDeTransacao();
		PoolDeConexao poolDeConexao = new PoolDeConexao();
		
		new Thread(new TarefaAcessaBanco(poolDeConexao, gerenciadorDeTransacao)).start();
		new Thread(new TarefaAcessaBancoProcedimento(poolDeConexao, gerenciadorDeTransacao)).start();
	}
}
