package 策略模式.newType.duck;

import 策略模式.newType.fly.IFly;
import 策略模式.newType.quack.IQuack;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 22:35
 * Description:鸭子抽象类
 */
public abstract class Duck {
    IFly iFly;
    IQuack iQuack;

    public void fly() {
        iFly.fly();
    }

    public void quack() {
        iQuack.quack();
    }

    public abstract void display();


    public void setiFly(IFly iFly) {
        this.iFly = iFly;
    }

    public void setiQuack(IQuack iQuack) {
        this.iQuack = iQuack;
    }
}
