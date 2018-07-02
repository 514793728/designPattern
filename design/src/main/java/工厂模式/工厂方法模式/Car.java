package 工厂模式.工厂方法模式;

public abstract class Car {
    public abstract void display();
    public static Car getCar(IFactory iFactory,String type) {
        return iFactory.getCar(type);
    }
}
