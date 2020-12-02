package oppgave5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StemmeController
 */
@WebServlet("/StemmeController")
public class StemmeController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Quiz quiz = (Quiz)getServletContext().getAttribute("quiz");
		if(quiz == null) {
			response.sendRedirect("WEB-INF/IngenAktivQuiz.html");
		}
		
		request.setAttribute("quiz", quiz);
		String sistQuizStemtPaa = (String)request.getSession().getAttribute("sistQuizStemtPaa");
		
		if(sistQuizStemtPaa == null || !sistQuizStemtPaa.equals(quiz.getId())) {
			request.getRequestDispatcher("WEB-INF/Stemmeskjema.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("WEB-INF/Kvittering.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Quiz quiz = (Quiz)getServletContext().getAttribute("quiz");
		if(quiz == null) {
			response.sendRedirect("WEB-INF/IngenAktivQuiz.html");
		}
		
		String stemme = request.getParameter("stemme");
		
		if(stemme != null) {
			synchronized(quiz) {
				quiz.giStemmeTil(stemme);
			}
			request.getSession().setAttribute("stemme", stemme);
			request.getSession().setAttribute("sistQuizStemtPaa", quiz.getId());
		}
		
		response.sendRedirect("StemmeController");
	}

}