package 策略模式.demo;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 20:25
 * Description:
 */
public abstract class Duck {
    IQuack iQuack;
    IFly iFly;

    public void quack(){
        iQuack.quack();
    }

    public void fly() {
        iFly.fly();
    }

    //提供动态设置的方法
    public void setiQuack(IQuack iQuack) {
        this.iQuack = iQuack;
    }

    //提供动态设置的方法
    public void setiFly(IFly iFly) {
        this.iFly = iFly;
    }
}
