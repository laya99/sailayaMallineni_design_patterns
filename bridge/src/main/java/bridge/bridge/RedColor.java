package bridge.bridge;
import java.util.logging.Logger;
public class RedColor implements Color{
	Logger logger = Logger.getLogger(App.class.getName());
	public void applyColor(){
		logger.info("red.");
	}
}
