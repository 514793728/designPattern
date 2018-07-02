package 观察者模式.newType;

/**
 * date : 2018/6/19/019 23:42
 * description :被依赖者
 */
public interface Subject {
    //注册
    void registObserver(Observer observer);

    //移除
    void removeObserver(Observer observer);

    //通知
    void nodifyObservers();
}
