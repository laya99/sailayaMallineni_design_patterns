package bridge.bridge;
import java.util.logging.Logger;
public class Pentagon extends Shape{
	Logger logger = Logger.getLogger(App.class.getName());
	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Pentagon filled with color ");
		color.applyColor();
	} 

}
