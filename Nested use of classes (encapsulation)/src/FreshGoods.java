public class FreshGoods extends PhysicalGoods {
    protected int shelfLife;
    protected String orgin;
    private Double freshPrice;

    public FreshGoods(long id, String name, Double price, Double weight, Double freightPerKg, int shelfLife,
            String orgin) {
        super(id, name, price, weight, freightPerKg);
        this.shelfLife = shelfLife;
        this.orgin = orgin;
    }

    @Override
    public Double calculatePrice() {
        super.calculatePrice();
        Double freshBasePrice = super.getPhysicalBasePrice();
        this.freshPrice = shelfLife <= 3 ? freshBasePrice * 0.8 : freshBasePrice;
        return this.freshPrice;
    }

    public Double getFreshPrice() {
        return this.freshPrice;
    }

    public void showFreshInfo() {
        System.out.print("生鲜商品信息：保质期=" + shelfLife + "天，产地=" + orgin + "\n");
    }
}
