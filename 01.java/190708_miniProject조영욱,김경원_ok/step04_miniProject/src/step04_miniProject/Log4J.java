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
		return "�����ڴ� ȯ���մϴ�";
	}

	public String warn() {
		return "id�� Ʋ�Ƚ��ϴ�";
	}
}
