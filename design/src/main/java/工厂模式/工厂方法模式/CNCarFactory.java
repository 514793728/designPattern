package 工厂模式.工厂方法模式;

import org.apache.commons.lang3.StringUtils;

/**
 * author:Ben_sir.
 * Date : 2018/6/24/024 13:44
 * Description:
 */
public class CNCarFactory implements IFactory {
    @Override
    public Car getCar(String type) {
        if(StringUtils.isBlank(type))
            throw new RuntimeException("参数异常");
        if("BMW".equals(type))
            return new CNBMWCar();
        else if("AUTO".equals(type))
            return new CNAutoCar();
        return null;
    }
}
