
package template.template;

import java.util.logging.Logger;

public class WoodenHouse extends HouseTemplate {
	Logger logger = Logger.getLogger(App.class.getName());
	@Override
	public void buildWalls() {
		logger.info("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		logger.info("Building Pillars with Wood coating");
	}

}
