package view;

import model.BaseballTeamModel;
import step04_miniProject.BaseballTeam;

public class EndView {

	public static void printAll(BaseballTeam[] all) {
		for (BaseballTeam v : all) {
			if (v != null) {
				System.out.println(v.toString());
			}
		}
	}

	public static void printOne(String name) {
		BaseballTeam v = BaseballTeamModel.getBaseballTeam(name);
		if (v != null) {
			System.out.println(v);
		} else {
			System.out.println("검색결과가 없습니다.");
		}

	}

	public static void printWinrate(String name, double winrate) {
		BaseballTeam v = BaseballTeamModel.winrateChange(name, winrate);
		if (v != null) {
			System.out.println(v);
		} else {
			System.out.println("수정할 수 없습니다");
		}
	}

	public static void printAvg(String name, double avg) {
		BaseballTeam v = BaseballTeamModel.avgChange(name, avg);
		if (v != null) {
			System.out.println(v);
		} else {
			System.out.println("수정할 수 없습니다");
		}

	}

	public static void printDelete(String msg) {
		System.out.println(msg);

	}

	public static void printSuccess(String msg) {
		System.out.println(msg);

	}

	public static void printFail(String msg) {
		System.out.println(msg);

	}

}
