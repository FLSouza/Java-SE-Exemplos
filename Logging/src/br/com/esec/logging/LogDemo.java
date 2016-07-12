package br.com.esec.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//Nesse exemplo são apresentados o diversos níveis de log disponíveis na API
public class LogDemo {
	private static Log logger = LogFactory.getLog(LogDemo.class);

	public static void main(String[] args) {
		logger.info("Test info");
		logger.debug("Test info");

		logger.warn("Test info");
		logger.error("Test info");
		logger.fatal("Test info");

	}
}
