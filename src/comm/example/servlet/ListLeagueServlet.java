package comm.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

/**
 * Servlet implementation class ListLeagueServlet
 */
@WebServlet("/list_leagues.view")
public class ListLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   private List<League> leagueList=null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		leagueList= (List<League>) getServletContext().getAttribute("leaguelist");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		/*LeagueList.add(new League("whatsapp",2019,"social"));
		LeagueList.add(new League("instagram",2019,"application"));
		LeagueList.add(new League("snapchat",2019,"social application"));*/
		out.println("<html><head><title>List All Socail Apps</title></head><body>");
		Iterator<League> items=  leagueList.iterator();
		out.println("<table border='1' cellspacing='0' cellpadding='5' >");
		out.println("<tr align='center' valign='center'>");
		out.println("<td><h3>Title</h3></td>");
		out.println("<td><h3>year</h3></td>");
		out.println("<td><h3>season</h3></td></tr>");
		
		
		while(items.hasNext()) {
			League league= items.next();
			out.println("<tr><td>"+league.getTitle()+"</td>"+"<td>"+league.getYear()+"</td>"+"<td>"+league.getSeason()+"</td></tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	}

}
