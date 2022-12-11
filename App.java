package week5Assignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		logger.log("Nice Job!");
		logger.error("Failed");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Very good");
		spacedLogger.error("Not good");
	}

}
