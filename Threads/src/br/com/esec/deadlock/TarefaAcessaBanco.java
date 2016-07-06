package br.com.esec.deadlock;

public class TarefaAcessaBanco implements Runnable {
	private PoolDeConexao pool;
	private GerenciadorDeTransacao gerenciador;

	public TarefaAcessaBanco(PoolDeConexao pool, GerenciadorDeTransacao gerenciador) {
		this.pool = pool;
		this.gerenciador = gerenciador;
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("Peguei a chave do pool");
			pool.getConnection();

			synchronized (gerenciador) {
				System.out.println("Peguei a chave do gerenciador");
				gerenciador.begin();
			}
		}
	}

}
