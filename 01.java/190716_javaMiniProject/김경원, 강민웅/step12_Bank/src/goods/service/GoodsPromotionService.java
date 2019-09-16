package goods.service;

import java.util.ArrayList;

import goods.exception.NotExistException;
import goods.model.GoodsModelVirtualDB;
import goods.model.dto.Deposit;
import goods.model.dto.GoodsPromotion;
import goods.model.dto.Personaldata;
import goods.model.dto.Withdraw;
import net.sf.json.JSONArray;

public class GoodsPromotionService {

	private static GoodsPromotionService instance = new GoodsPromotionService();
	private GoodsModelVirtualDB PromotionVirtualData = GoodsModelVirtualDB.getInstance();

	private GoodsPromotionService() {
	}

	public static GoodsPromotionService getInstance() {
		return instance;
	}

	// 모든 Promotion 반환
	public ArrayList<GoodsPromotion> getAllPromotions() {
		return PromotionVirtualData.getPromotionList();
	}

	// Promotion 검색
	public GoodsPromotion getGoodsPromotion(String PromotionName) {
		GoodsPromotion Promotion = null;
		ArrayList<GoodsPromotion> allPromotions = PromotionVirtualData.getPromotionList();
		for (GoodsPromotion p : allPromotions) {
			if (p != null && p.getgoodsPromotionName().equals(PromotionName)) {
				return p;
			}
		}
		return Promotion;
	}

	// Promotion 추가
	public void PromotionInsert(GoodsPromotion newpromotion) {
		PromotionVirtualData.insertPromotion(newpromotion);
	}

	// Promotion 수정
	public void PromotionUpdate(String PromotionName, Personaldata personaldata) throws NotExistException {
		GoodsPromotion Promotion = getGoodsPromotion(PromotionName);
		if (Promotion == null) {
			throw new NotExistException("xxxxxxx 수정하고자 하는 Promotion가 미 존재합니다. xxxxxxx\n");
		} else if (personaldata instanceof Deposit) {// personaldata -> 수혜자
			Promotion.setdeposit((Deposit) personaldata);
//
		} else if (personaldata instanceof Withdraw) {// personaldata -> 기부자
			Promotion.setwithraw((Withdraw) personaldata);
//
		}
	}

	// Promotion 삭제
	public void PromotionDelete(String PromotionName) throws NotExistException {

		GoodsPromotion Promotion = getGoodsPromotion(PromotionName);
		if (Promotion == null) {
			try {

			} catch (Exception e) {

			}
			throw new NotExistException("xxxxxxx 삭제하고자 하는 Promotion가 미 존재합니다. xxxxxxx\n");
		}
		PromotionVirtualData.deletePromotion(Promotion);
	}

//JSON 프로젝트 변환
	public JSONArray PromotionJSON() {
		JSONArray j = JSONArray.fromObject(PromotionVirtualData.getPromotionList());
		return j;

	}
}