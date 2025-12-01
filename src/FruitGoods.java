public class FruitGoods extends FreshGoods {
    private String varirty;
    private Double singleFruitWeight;

    public FruitGoods(long id, String name, Double price, Double weight, Double freightPerKg, int shelfLife, String orgin, String varirty, Double singleFruitWeight){
        super(id, name, price, weight, freightPerKg, shelfLife, orgin);
        this.varirty = varirty;
        this.singleFruitWeight = singleFruitWeight;
    }

    @Override
    public void showBasicInfo(){
        System.out.print("商品类型：水果\n");
        super.showBasicInfo();
    }

    public void showFruitInfo(){
        System.out.print("水果商品信息：品种="+varirty+"，单果重量="+singleFruitWeight+"\n");
    }
}


