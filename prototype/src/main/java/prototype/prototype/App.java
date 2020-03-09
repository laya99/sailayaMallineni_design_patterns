
package prototype.prototype;

import java.util.List;
import java.util.logging.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Logger logger = Logger.getLogger(App.class.getName());
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		logger.info("emps List: "+emps.getEmpList());
		logger.info("empsNew List: "+list);
		logger.info("empsNew1 List: "+list1);
	}
}
