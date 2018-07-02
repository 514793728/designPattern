package 观察者模式.milk;

import java.util.HashSet;
import java.util.Set;

/**
 * author:Ben_sir.
 * Date : 2018/6/21/021 21:13
 * Description:
 */
public class MilkEnterprise implements Subject {

    private Milk milk;
    private Set<Observer> set = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        if(!set.contains(observer))
            set.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if(set.contains(observer))
            set.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : set) {
            observer.update(null);
        }
    }

    @Override
    public void notifyObservers(Object object) {
        Milk milk = (Milk) object;
        for (Observer observer : set) {
            observer.update(milk);
        }
    }

    //设置更新数据
    public void setData(Object object) {
        this.milk = (Milk) object;
        notifyObservers(this.milk);
    }

}
