package br.com.esec.deadlock;

public class TarefaAcessaBancoProcedimento implements Runnable {
	private PoolDeConexao pool;
	private GerenciadorDeTransacao gerenciador;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao gerenciador) {
		this.pool = pool;
		this.gerenciador = gerenciador;
	}

	@Override
	public void run() {
		synchronized (gerenciador) {
			System.out.println("Peguei a chave do gerenciador");
			gerenciador.begin();

			synchronized (pool) {
				System.out.println("Peguei a chave do pool");
				pool.getConnection();
			}
		}
	}

}
