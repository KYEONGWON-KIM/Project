package view;

import controller.BaseballTeamController;
import step04_miniProject.Log4J;

//1 모든팀 검색 //2
public class StartView {

	public static void main(String[] args) {

		System.out.println("야구기록실에 오신걸 환영합니다");
		System.out.println("ID를 입력하세요 ");
		// id 입력
		String Id = "admin";
		if (Id.equals("admin")) {
			System.out.println(Log4J.getInstance().info());
			StartView.menu();
		} else {
			System.out.println(Log4J.getInstance().warn());
		}
	}

	public static void menu() {
		System.out.println("---모두검색 후 팀 추가----");
		BaseballTeamController.request(1);
		BaseballTeamController.request(3);
		System.out.println("---모두검색 후 팀 삭제----");
		BaseballTeamController.request(1);
		BaseballTeamController.request(4);
		System.out.println("---팀 타율 수정----");
		BaseballTeamController.request(5);
		System.out.println("---팀 승률 수정----");
		BaseballTeamController.request(6);
		System.out.println("---팀 삼성 검색----");
		BaseballTeamController.request(2);

	}

}
