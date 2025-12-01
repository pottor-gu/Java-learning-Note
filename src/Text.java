public class Text {
    public static void main(String[] args) {
        // 手机商品测试
        PhoneGoods phone = new PhoneGoods(1001, "小米14", 4999.0, 0.2,
                10.0, 2, "小米", "12GB+512GB", 5400);

        System.out.print("===== 手机商品信息 =====\n");
        phone.showBasicInfo();
        phone.showPhysicalInfo();
        phone.showDigitalInfo();
        phone.showPhoneInfo();
        Double phoneFinalPrice = phone.calculatePrice();
        System.out.println("手机最终价格：" + String.format("%.2f", phoneFinalPrice) + "元\n");

        // 水果商品测试
        FruitGoods fruit = new FruitGoods(2001, "红富士苹果", 9.9, 5.0,
                2.0, 7, "山东烟台", "红富士", 250.0);
        System.out.print("===== 水果商品信息 =====\n");
        fruit.showBasicInfo();
        fruit.showPhysicalInfo();
        fruit.showFreshInfo();
        fruit.showFruitInfo();
        // fruit.calculatePrice();
        Double fruitFinalPrice = fruit.calculatePrice();
        System.out.println("手机最终价格：" + String.format("%.2f", fruitFinalPrice) + "元\n");

        System.out.print("===== 多态演示 =====\n");
        Goods phoneGoods = phone;
        Goods fruitGoods = fruit;
        System.out.print("Goods类型指向手机\n");
        phoneGoods.showBasicInfo();
        System.out.println("最终价格：" + String.format("%.2f", phoneGoods.calculatePrice()) + "元\n");

        System.out.print("Goods类型指向水果\n");
        fruitGoods.showBasicInfo();
        System.out.println("最终价格：" + String.format("%.2f", fruitGoods.calculatePrice()) + "元\n");

        // Double fruitFinalPrice = fruitGoods.calculatePrice();
        // System.out.println("手机最终价格：" + String.format("%.2f", fruitFinalPrice) +
        // "元\n");
    }
}
