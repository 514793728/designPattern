package 观察者模式.milk;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 20:56
 * Description:
 */
public interface Subject {
    void addObserver(Observer observer); //登记
    void deleteObserver(Observer observer); //删除
    void notifyObservers(); //通知(拉取的方式，只通知Observer有更新，具体数据由Observer自己拉取)
    void notifyObservers(Object object); //通知(推送的方式，将具体数据推送给用户)
}
