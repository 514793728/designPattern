package 观察者模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:17
 * Description: 气象站公告板
 */
public class CurrentConditions {

    private float mTemperature; //温度
    private float mPressure;    //气压
    private float mHumidity;    //湿度

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
