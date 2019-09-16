package step04_miniProject;

public class Log4J {
	// ?
	private static Log4J instance = new Log4J();

	private Log4J() {
	}

	public static Log4J getInstance() {
		return instance;
	}

	public String info() {
		return "관리자님 환영합니다";
	}

	public String warn() {
		return "id가 틀렸습니다";
	}
}
