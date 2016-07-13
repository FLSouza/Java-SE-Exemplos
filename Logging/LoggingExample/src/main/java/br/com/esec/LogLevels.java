package br.com.esec;

import org.apache.log4j.Logger;

// Este exemplo apresenta os diferente níveis do Log
public class LogLevels{
	
	final static Logger logger = Logger.getLogger(LogLevels.class);
	
	public static void main(String[] args) {
	
		LogLevels obj = new LogLevels();
		obj.runMe("esec");
		
	}
	
	private void runMe(String parameter){
		
		//Informações refinadas que são úteis para debugar a aplicação
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		
		if(logger.isInfoEnabled()){
			//Mensagens informacionais que destacam o progresso da aplicação
			logger.info("This is info : " + parameter);
		}
		
		//Potencialmente perigoso, mas ainda permite que aplicação continue funcionando
		logger.warn("This is warn : " + parameter);
		//Eventos de erro que ainda irão deixar a aplicação funcionando
		logger.error("This is error : " + parameter);
		//É um erro severo, provavelmente irá abortar a aplicação
		logger.fatal("This is fatal : " + parameter);
		
	}
	
}