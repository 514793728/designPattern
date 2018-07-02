package 观察者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:45
 * Description:
 */
public class CurrentConditions implements Observer {

    private float mTemperature; //温度
    private float mPressure;    //气压
    private float mHumidity;    //湿度


    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("今天的温度："+mTemperature);
        System.out.println("今天的气压："+mPressure);
        System.out.println("今天的湿度："+mHumidity);
    }
}
