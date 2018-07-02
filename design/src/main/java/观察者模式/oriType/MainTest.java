package 观察者模式.oriType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:25
 * Description:
 */
public class MainTest {
    public static void main(String[] args){
        CurrentConditions currentConditions;
        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        weatherData = new WeatherData(currentConditions);

        weatherData.setData(36,150,60);
    }
}
