package template.template;

import java.util.logging.Logger;

public abstract class HouseTemplate {
	Logger logger = Logger.getLogger(App.class.getName());
	//template method, final so subclasses can't override
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		logger.info("House is built.");
	}

	//default implementation
	private void buildWindows() {
		logger.info("Building Glass Windows");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		logger.info("Building foundation with cement,iron rods and sand");
	}
}
