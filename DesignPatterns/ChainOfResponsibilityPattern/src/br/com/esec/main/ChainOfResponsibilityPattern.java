package br.com.esec.main;

import br.com.esec.loggers.AbstractLogger;
import br.com.esec.loggers.ConsoleLogger;
import br.com.esec.loggers.ErrorLogger;
import br.com.esec.loggers.FileLogger;

public class ChainOfResponsibilityPattern {
	private static AbstractLogger getChainOfLoggers() {
		// Nesse exemplo cada logger checa o level da mensagem de acordo com seu level.
		// Se a mensagem estive de acordo com seu level a mensagem é tratada,
		// caso contrário a mensagem não é escrita e é passada para o próximo logger.
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
