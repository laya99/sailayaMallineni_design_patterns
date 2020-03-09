package template.template;

import java.util.logging.Logger;

public class GlassHouse extends HouseTemplate {
	Logger logger = Logger.getLogger(App.class.getName());
	@Override
	public void buildWalls() {
		logger.info("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		logger.info("Building Pillars with glass coating");
	}

}
