package 命令模式.遥控器例子;

/**
 * author:Ben_sir.
 * Date : 2018/7/2/002 22:06
 * Description:
 */
public class Light {
    private String location;

    public String getLocation() {
        return location;
    }

    public Light(String location) {
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + "开灯");
    }

    public void off() {
        System.out.println(this.location + "关灯");
    }
}
