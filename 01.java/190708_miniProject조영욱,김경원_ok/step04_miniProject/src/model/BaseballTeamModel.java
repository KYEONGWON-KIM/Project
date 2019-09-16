package model;

import step04_miniProject.BaseballTeam;

public class BaseballTeamModel {

	private static BaseballTeam[] allData = new BaseballTeam[10];
	private static int index;

	static {
		allData[0] = new BaseballTeam("SK", 0.682, 0.269);
		allData[1] = new BaseballTeam("NC", 0.512, 0.282);
		allData[2] = new BaseballTeam("·Ôµ¥", 0.373, 0.261);
		allData[3] = new BaseballTeam("»ï¼º", 0.417, 0.269);
		index = 4;
	}

	public static boolean insert(BaseballTeam v) {
		if (index < 10) {
			allData[index++] = v;
			return true;
		} else {
			return false;
		}
	}

	public static boolean delete(String name) {
		BaseballTeam v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}

		return false;
	}

	public static BaseballTeam winrateChange(String name, double change) {
		BaseballTeam v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				allData[i].setWinrate(change);
				return allData[i];
			}
		}
		return null;
	}

	public static BaseballTeam avgChange(String name, double change) {
		BaseballTeam v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				allData[i].setAvg(change);
				return allData[i];
			}
		}
		return null;
	}

	public static BaseballTeam[] getAll() {
		return allData;

	}

	public static BaseballTeam getBaseballTeam(String name) {
		BaseballTeam v = null;
		for (int i = 0; i < allData.length; i++) {
			v = allData[i];
			if (v != null && v.getName().equals(name)) {
				return allData[i];
			}
		}
		return null;
	}

}
