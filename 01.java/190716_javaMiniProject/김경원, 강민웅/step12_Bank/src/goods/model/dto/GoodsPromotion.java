package goods.model.dto;

public class GoodsPromotion {

	private String goodsPromotionName; // 진행되는 실제 프로젝트 이름
	private Goods goods; // 기부 내용
	private Deposit deposit; // 입금
	private Withdraw withdraw; // 인출
	private String promotionContent; // 내용

	public GoodsPromotion() {
	}

	public GoodsPromotion(String goodsPromotionName, Goods goods, Deposit deposit, Withdraw withdraw,
			String promotionContent) {
		this.goodsPromotionName = goodsPromotionName;
		this.goods = goods;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.promotionContent = promotionContent;
	}

	public String getgoodsPromotionName() {
		return goodsPromotionName;
	}

	public void setgoodsPromotionName(String goodsPromotionName) {
		this.goodsPromotionName = goodsPromotionName;
	}

	public Goods getgoods() {
		return goods;
	}

	public void setgoods(Goods goods) {
		this.goods = goods;
	}

	public Deposit getdeposit() {
		return deposit;
	}

	public void setdeposit(Deposit deposit) {
		this.deposit = deposit;
	}

	public Withdraw getwithraw() {
		return withdraw;
	}

	public void setwithraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}

	public String getpromotionContent() {
		return promotionContent;
	}

	public void setpromotionContent(String promotionContent) {
		this.promotionContent = promotionContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 상품명 : ");
		builder.append(goodsPromotionName);
		builder.append("\n2. 상품 정보 : ");
		builder.append(goods);
		builder.append("\n3. 예금 정보: ");
		builder.append(deposit);
		builder.append("\n4. 인출 정보: ");
		builder.append(withdraw);
		builder.append("\n5. 인적사항 내용 : ");
		builder.append(promotionContent);
		return builder.toString();
	}
}
