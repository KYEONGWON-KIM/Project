package view;

import controller.BaseballTeamController;
import step04_miniProject.Log4J;

//1 ����� �˻� //2
public class StartView {

	public static void main(String[] args) {

		System.out.println("�߱���Ͻǿ� ���Ű� ȯ���մϴ�");
		System.out.println("ID�� �Է��ϼ��� ");
		// id �Է�
		String Id = "admin";
		if (Id.equals("admin")) {
			System.out.println(Log4J.getInstance().info());
			StartView.menu();
		} else {
			System.out.println(Log4J.getInstance().warn());
		}
	}

	public static void menu() {
		System.out.println("---��ΰ˻� �� �� �߰�----");
		BaseballTeamController.request(1);
		BaseballTeamController.request(3);
		System.out.println("---��ΰ˻� �� �� ����----");
		BaseballTeamController.request(1);
		BaseballTeamController.request(4);
		System.out.println("---�� Ÿ�� ����----");
		BaseballTeamController.request(5);
		System.out.println("---�� �·� ����----");
		BaseballTeamController.request(6);
		System.out.println("---�� �Ｚ �˻�----");
		BaseballTeamController.request(2);

	}

}
