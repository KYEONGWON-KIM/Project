package controller;

import model.BaseballTeamModel;
import step04_miniProject.BaseballTeam;
import view.EndView;

public class BaseballTeamController {

	public static void request(int reqNumber) {
		if (reqNumber == 1) {
			EndView.printAll(BaseballTeamModel.getAll());

		} else if (reqNumber == 2) {
			EndView.printOne("삼성");

		} else if (reqNumber == 3) {
			boolean r = BaseballTeamModel.insert(new BaseballTeam("한화", 0.381, 0.248));
			if (r) {
				EndView.printSuccess("팀  추가 완료했습니다");
			} else {
				EndView.printFail("팀 추가 실패했습니다");
			}

		} else if (reqNumber == 4) {
			BaseballTeamModel.delete("한화");
			EndView.printDelete("팀 삭제 완료 했습니다");
		} else if (reqNumber == 5) {
			EndView.printAvg("삼성", 0.311);
		} else if (reqNumber == 6) {
			EndView.printWinrate("삼성", 0.477);
		} else {
			EndView.printFail("요청하신 정보는 서비스 할 수 없습니다.");

		}

	}
}
