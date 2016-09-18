package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import servise.CustomerServise;



/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId");
		
		
		//Perform business logic. Return a bean as a result.
		CustomerServise servise = new CustomerServise();
		Customer customer = servise.findCustomer(customerId);
		request.setAttribute("custmer", customer);
		
		//We can iterate over lists using forEach in JSTL
		
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("id006", "Kim","kim@hansung.ac.kr"));
		customers.add(new Customer("id007", "Lee","klee@hansung.ac.kr"));
		customers.add(new Customer("id008", "Park","park@hansung.ac.kr"));
		request.setAttribute("customerList", customers);
		
		String page;
		if(customer == null)
			page ="/view/error.jsp";
		else
			page ="/view/success.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

			
	}

}
