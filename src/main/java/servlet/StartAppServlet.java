package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;


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

		String result = null;
		int time = 0;
		App app = null;

		if (name != null && !name.isEmpty()) {

			if (appType.equals("トランプ")) {
				app = new CardGameApp("トランプ");
			}
			else if(appType.equals("ダーツ")) {
				app = new DartsGameApp("ダーツ");
			}
			else if(appType.equals("時計")) {
				app = new ClockApp();
				result = app.start(name);
			}
			else {
				result = "アプリの実行に失敗しました。";
			}

			if(app instanceof GameApp) {
				GameApp gameApp = (GameApp)app;
				result = gameApp.start(name)+"<br>"+"実行時間：" + gameApp.getPlayTime(time) + "分";
			}				

			request.setAttribute("result", result);
		}
		request.getRequestDispatcher("appStart.jsp").forward(request, response);
	}
}
