package com.sean.hyx2021.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */

//气象站
public class WeatherSubjectStation implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherSubjectStation() {
        observers = new ArrayList<Observer>();
    }
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public void dataChange() {
        notifyObserver();
    }
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    // 维护观察者
    private List<Observer> observers = null;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (Observer o :
                observers) {
            o.update(getTemperature(),getPressure(),getHumidity());
        }
    }

}
