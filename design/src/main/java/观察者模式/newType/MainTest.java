package 观察者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:58
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();
        WeatherDataSt weatherDataSt = new WeatherDataSt();

        weatherDataSt.registObserver(currentConditions);
        weatherDataSt.registObserver(forcastConditions);

        weatherDataSt.setData(10,20,30);

        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setData(20,30,40);
    }
}
