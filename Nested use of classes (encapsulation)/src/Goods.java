public class Goods {
    private long id;
    private String name;
    private Double price;

    public Goods(long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showBasicInfo() {
        System.out.print("商品基础信息：id=" + id + "，名称=" + name + "，价格=" + price + ",\n");
    }

    public Double calculatePrice() {
        // 直接返回原价
        return this.price;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
