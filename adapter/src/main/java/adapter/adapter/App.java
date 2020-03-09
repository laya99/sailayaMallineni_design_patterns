package adapter.adapter;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
public static void main(String[] args) {
		
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		Logger logger = Logger.getLogger(App.class.getName());
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		logger.info("v3 volts using Object Adapter="+v3.getVolts());
		logger.info("v12 volts using Object Adapter="+v12.getVolts());
		logger.info("v120 volts using Object Adapter="+v120.getVolts());
	}

	private static void testClassAdapter() {
		Logger logger = Logger.getLogger(App.class.getName());
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		logger.info("v3 volts using Class Adapter="+v3.getVolts());
		logger.info("v12 volts using Class Adapter="+v12.getVolts());
		logger.info("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
