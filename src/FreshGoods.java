public class FreshGoods extends PhysicalGoods {
    protected int shelfLife;
    protected String orgin;

    public FreshGoods(long id, String name, Double price, Double weight, Double freightPerKg, int shelfLife,
            String orgin) {
        super(id, name, price, weight, freightPerKg);
        this.shelfLife = shelfLife;
        this.orgin = orgin;
    }

    @Override
    public Double calculatePrice() {
        Double freshBasePrice = super.calculatePrice();
        Double fruitFinalPrice = shelfLife <= 3 ? freshBasePrice * 0.8 : freshBasePrice;
        return fruitFinalPrice;
        // if(shelfLife <=3){
        // this.price = this.price * 0.8;
        // System.out.print("水果最终价格为：" + this.price + "\n");
        // }else{
        // System.out.print("水果最终价格为：" + this.price + "\n");
        // }
    }

    public void showFreshInfo() {
        System.out.print("生鲜商品信息：保质期=" + shelfLife + "天，产地=" + orgin + "\n");
    }
}
