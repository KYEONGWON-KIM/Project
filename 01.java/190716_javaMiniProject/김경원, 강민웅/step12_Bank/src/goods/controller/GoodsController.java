package goods.controller;

import java.util.ArrayList;

import goods.exception.NotExistException;
import goods.model.dto.GoodsPromotion;
import goods.model.dto.Personaldata;
import goods.service.GoodService;
import goods.service.GoodsPromotionService;
import goods.view.EndView;
import goods.view.FailView;



public class GoodsController {

	private static GoodsController instance = new GoodsController();
	private GoodsPromotionService service = GoodsPromotionService.getInstance();

	private GoodsController() {
	}

	public static GoodsController getInstance() {
		return instance;
	}

	// 모든
	public void promotionListView() {
		ArrayList<GoodsPromotion> promotionList = service.getAllPromotions();
		if (promotionList.size() != 0) {
			EndView.promotionListView(promotionList);
			GoodService.getInstance().InfoLog();
		} else {
			EndView.messageView("찾으시는 자료가 없습니다.");
			GoodService.getInstance().ErrLog();
		}
	}
    //특정 검색
	public void promotionView(String GoodsName) {
		ArrayList<GoodsPromotion> promotionList = service.getAllPromotions(); 
		
		for (GoodsPromotion promotion : promotionList) {
			
			if (promotion != null && promotion.getgoodsPromotionName().equals(GoodsName)) {
				EndView.promotionListView(promotion);
				GoodService.getInstance().InfoLog();

				return;
			}
		}
		EndView.messageView("찾으시는 자료가 없습니다.");
		GoodService.getInstance().WarnLog();
	}
    //추가
	public void insertpromotion(GoodsPromotion newpromotion) {
		service.PromotionInsert(newpromotion);
	}
    //수정
	public void updatepromotion(String promotionName, Personaldata people) {
		try {
			service.PromotionUpdate(promotionName, people);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			GoodService.getInstance().ErrLog();
			// e.printStackTrace();
		}
	}
    //예외
	public void deletepromotion(String promotionName) {
		ArrayList<GoodsPromotion> promotionList = service.getAllPromotions();
		//
		for (GoodsPromotion promotion : promotionList) {
			//
			if (promotion != null && promotion.getgoodsPromotionName().equals(promotionName)) {
				try {
					service.PromotionDelete(promotionName);
				} catch (NotExistException e) {
					FailView.failMessageView(e.getMessage());
					// e.printStackTrace();
				}
				return;
			}
		}
		EndView.messageView("찾으시는 자료가 없습니다.");
		GoodService.getInstance().ErrLog();

	}
    //제이슨
	public void JsongetAllpromotions() {
		if (service.PromotionJSON().size() != 0) {
			EndView.JSONView(service.PromotionJSON());
			GoodService.getInstance().InfoLog();
		}
	}

}
