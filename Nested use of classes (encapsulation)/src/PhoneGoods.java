public class PhoneGoods extends DigitalGoods {
    private String memory;
    private int battery;

    // 手机商品，继承父类属性，并添加手机商品特有属性
    public PhoneGoods(long id, String name, Double price, Double weight, Double freightPerKg, int warranty,
            String brand, String memory, int battery) {
        super(id, name, price, weight, freightPerKg, warranty, brand);
        this.memory = memory;
        this.battery = battery;
    }

    // 手机商品特有计算价格方法
    @Override
    public Double calculatePrice() {
        super.calculatePrice();
        Double totelPrice = super.getDigitalPrice();
        Double phoneFinalPrice = this.battery >= 5000 ? totelPrice * 1.02 : totelPrice;
        return phoneFinalPrice;
    }

    @Override
    public void showBasicInfo() {
        // TODO Auto-generated method stub
        System.out.print("商品类型：手机\n");
        super.showBasicInfo();
    }

    public void showPhoneInfo() {
        System.out.print("手机商品信息：内存=" + memory + "，电池容量=" + battery + "mAh\n");
    }
}
