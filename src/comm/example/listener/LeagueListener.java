package comm.example.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import comm.example.model.League;

public class LeagueListener implements ServletContextListener {

	String str=null;

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		str=null;
		System.out.println("context destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext context= sce.getServletContext();
		List l= new ArrayList<>();
		str=context.getInitParameter("leagues-file");
		System.out.println(str);
		String arr[]=str.split(",");
		League newLeague= new League(arr[0],Integer.parseInt(arr[1]),arr[2]);
		l.add(newLeague);
		context.setAttribute("leaguelist", l);
		
	}
	
}
