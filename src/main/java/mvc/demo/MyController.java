package mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController  {
	
	@RequestMapping("hello")
	public void hello()//to print in front end change from void to String return type
	{
		System.out.println("Hello");
	}
	@RequestMapping("bye")
	@ResponseBody
	public String bye()//to print in front end change from void to String return type
	{
		return "byee";//we 404 error in the front end because we need to write or anootate woith @ResponseBody
	}

}
//THIS IS XML WAY
//1.create servlet project 
//2.Add dependencies -spring context and spring web mvc dependencies
//3.In the web.xml map every request('/') to dispatcherservlet (this dispatcher servlet given by servlet not us)
// org.springframework.web.servlet.DispatcherServlet-url pattern /pkg name
//4.create xml file with the name any name and here no need of writing the application context for obj creation and xml file also it will
//only create thee every thing.
//5.create xml file in the WEB-INF-servlet_name-servlet.xml example abc-servlet.xml and in xml file write <bean> tag and <context-Scan>
//6.create @controller class and create methods and map