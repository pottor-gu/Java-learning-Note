public class DigitalGoods extends PhysicalGoods {

    // 数字商品特有属性，保修年限和品牌，protected 使子类可访问
    protected int warranty;
    protected String brand;

    // 构造方法，继承父类属性，定义数字商品特有属性
    public DigitalGoods(long id, String name, Double price, Double weight, Double freightPerKg, int warranty,
            String brand) {
        super(id, name, price, weight, freightPerKg);
        this.warranty = warranty;
        this.brand = brand;
    }

    // 重写父类方法，计算价格
    @Override
    public Double calculatePrice() {
        Double physicalBasePrice = super.calculatePrice();
        // 数字商品，基础价格打95折
        Double digitalPrice = physicalBasePrice * 0.95;
        return digitalPrice;  
    }

    public void showDigitalInfo() {
        System.out.print("数码商品信息：品牌=" + brand + "，保修年限=" + warranty + "年\n");
    }
}
