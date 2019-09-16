package controller;

import model.BaseballTeamModel;
import step04_miniProject.BaseballTeam;
import view.EndView;

public class BaseballTeamController {

	public static void request(int reqNumber) {
		if (reqNumber == 1) {
			EndView.printAll(BaseballTeamModel.getAll());

		} else if (reqNumber == 2) {
			EndView.printOne("�Ｚ");

		} else if (reqNumber == 3) {
			boolean r = BaseballTeamModel.insert(new BaseballTeam("��ȭ", 0.381, 0.248));
			if (r) {
				EndView.printSuccess("��  �߰� �Ϸ��߽��ϴ�");
			} else {
				EndView.printFail("�� �߰� �����߽��ϴ�");
			}

		} else if (reqNumber == 4) {
			BaseballTeamModel.delete("��ȭ");
			EndView.printDelete("�� ���� �Ϸ� �߽��ϴ�");
		} else if (reqNumber == 5) {
			EndView.printAvg("�Ｚ", 0.311);
		} else if (reqNumber == 6) {
			EndView.printWinrate("�Ｚ", 0.477);
		} else {
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�.");

		}

	}
}
