package 装饰者模式.demo;

public abstract class Goods {
    private String desc; //描述
    private float weight; //重量

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public abstract float weighting(); //称重
}
