package 工厂模式.简单工厂模式;

import org.apache.commons.lang3.StringUtils;

/**
 * author:Ben_sir.
 * Date : 2018/6/24/024 13:39
 * Description:
 */
public class CarFactory {
    public static Car getCar(String type) {
        if(StringUtils.isBlank(type))
            throw new RuntimeException("参数异常");
        if("BMW".equals(type))
            return new BMWCar();
        else if("AUTO".equals(type))
            return new AUTOCar();
        return null;
    }

}
