package step04_miniProject;

public class BaseballTeam {

	private String name;
	private double winrate;
	private double avg;

	public BaseballTeam() {

	}

	public BaseballTeam(String name, double winrate, double avg) {
		this.name = name;
		this.winrate = winrate;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWinrate() {
		return winrate;
	}

	public void setWinrate(double winrate) {
		if (winrate > 0) {
			this.winrate = winrate;
		} else {
			System.out.println("���� ���� �ʽ��ϴ�");
		}
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		if (avg > 0) {
			this.avg = avg;
		} else {
			System.out.println("���� ���� �ʽ��ϴ�");
		}
	}

	public String toString() {
		return "�� �̸� " + name + "  �·� " + winrate + " Ÿ��  " + avg;
	}

}
