public class ServiceHandler extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  { 		
		try {			
			request.setAttribute("timeStamp", new Date().getTime() );			
			getServletConfig().getServletContext().getRequestDispatcher("/hello.jsp").forward(request,response);			
		} catch (Exception e) {
			System.err.println("Fatal Servlet Error");
			e.printStackTrace();
		}			
	}
	
}