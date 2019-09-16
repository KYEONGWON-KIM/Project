package goods.view;

import java.util.ArrayList;

import goods.model.dto.GoodsPromotion;
import net.sf.json.JSON;

public class EndView {
	
	//특정 프로젝트 출력 
	public static void promotionListView(GoodsPromotion promotion){
		System.out.println(promotion);		
	}
		
	//모든 프로젝트 출력
	public static void promotionListView(ArrayList<GoodsPromotion> allGoodsPromotion){
		for(int index = 0; index < allGoodsPromotion.size(); index++){			
			System.out.println("[고객 " + (index+1) + "]\n" + allGoodsPromotion.get(index) +"\n");
		}
	}
	
	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}
	//JSON 출력
	public static void JSONView(JSON jsonArray) {
		System.out.println(jsonArray);
	}
}





