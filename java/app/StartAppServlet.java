package app;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StartAppServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 入力値取得
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String appType = request.getParameter("radiobutton");
		String result = "";

		if (name != null && !name.isEmpty()) {
			GameApp app;
			ClockApp clock;


			if (appType.equals("トランプ")) {
				app = new CardGameApp("トランプ");
				result = app.start(name) + app.play();
			}
			else if(appType.equals("ダーツ")) {
				app = new DartsGameApp("ダーツ");
				result = app.start(name) + app.play();
			}
			else if(appType.equals("時計")) {
				clock = new ClockApp();
				result = clock.start(name);
			}
			else {
				result = "アプリの実行に失敗しました。";
			}

			request.setAttribute("result", result);

		}
		request.getRequestDispatcher("appStart.jsp").forward(request, response);
	}
}
