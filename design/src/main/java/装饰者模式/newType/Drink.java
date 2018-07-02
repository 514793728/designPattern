package 装饰者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 22:28
 * Description:
 */
public abstract class Drink {
    private String desc = "";
    private float price = 0.0f;

    public String getDesc() {
        return "desc- " + desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   public abstract float cost();
}
