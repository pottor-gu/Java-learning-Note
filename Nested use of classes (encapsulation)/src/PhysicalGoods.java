// extends 继承父类
public class PhysicalGoods extends Goods {

    // protected 修饰符，变量可由子类访问
    private Double weight;
    private Double freightPerKg;
    private Double physicalBasePrice;

    // 构造函数
    public PhysicalGoods(long id, String name, Double price, Double weight, Double freightPerKg) {
        super(id, name, price);
        this.weight = weight < 0 ? 0 : weight;
        this.freightPerKg = freightPerKg < 0 ? 0 : freightPerKg;
    }

    // 重构父类方法，原价等于重量*单价
    @Override
    public Double calculatePrice() {
        // 获取父类原价
        super.calculatePrice();
        Double originPrice = super.getPrice();
        this.physicalBasePrice = originPrice + (this.weight * this.freightPerKg);
        return this.physicalBasePrice;
    }

    public Double getPhysicalBasePrice() {
        return this.physicalBasePrice;
    }

    public void showPhysicalInfo() {
        System.out.print("实体商品信息：重量=" + weight + "kg，运费单价=" + freightPerKg + "元/kg\n");
    }
}
