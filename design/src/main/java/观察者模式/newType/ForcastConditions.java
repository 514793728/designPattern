package 观察者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:49
 * Description:
 */
public class ForcastConditions implements Observer {

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
        System.out.println("明天的温度：" + mTemperature + Math.random());
        System.out.println("明天的气压：" + mPressure + 10 * Math.random());
        System.out.println("明天的湿度：" + mHumidity + Math.random());
    }
}
