package 观察者模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:18
 * Description:气象数据  （这种设计方案，其他第三方公司接入气象站扩展性很差）
 */
public class WeatherData {
    private float mTemperature; //温度
    private float mPressure;    //气压
    private float mHumidity;    //湿度

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    /**
     * return : 数据变化时，外部调用该方法变更
     * date : 2018/6/19/019 23:20
     * description : 
     */
    public void dataChange() {
        currentConditions.update(mTemperature,mPressure,mHumidity);
    }

    /**
     * return : 有新数据时通知变更
     * date : 2018/6/19/019 23:28
     * description : 
     */
    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
}
