package 观察者模式.milk;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 21:09
 * Description:
 */
public class Milk {
    private String type;    //牛奶品种
    private float price;    //牛奶价格

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Milk(String type, float price) {
        this.type = type;
        this.price = price;
    }
}
