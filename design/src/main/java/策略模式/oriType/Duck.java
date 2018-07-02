package 策略模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 21:57
 * Description:鸭子抽象类
 *
 * 超类里面挖的一个坑，每个子类都要来填，增加工作量，复杂度是O(N^2),不是好的设计方式
 */
public  abstract class Duck {
    public Duck() {

    }

    /**
     * return : 叫声
     * date : 2018/6/19/019 22:00
     * description : 
     */
    public void quack() {
        System.out.println("嘎嘎~~`");
    }
    
    /**
     * return : 游泳
     * date : 2018/6/19/019 22:00
     * description : 
     */
    public void swim() {
        System.out.println("im swim");
    }

    /**
     * return : 外形
     * date : 2018/6/19/019 22:01
     * description : 
     */
    public abstract void display();
    
    /**
     * return : 飞行（这里有个问题，不是所有的鸭子都会飞）
     * date : 2018/6/19/019 22:06
     * description : 
     */
    public void fly() {
        System.out.println("im fly");
    }


}
