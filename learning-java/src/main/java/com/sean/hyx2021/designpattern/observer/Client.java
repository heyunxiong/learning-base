package com.sean.hyx2021.designpattern.observer;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Client {
    public static void main(String[] args) {
        WeatherSubjectStation weatherSubjectStation = new WeatherSubjectStation();
        ConditionsObserver conditionsObserver = new ConditionsObserver();
        ConditionsObserver_extention conditionsObserver_extention = new ConditionsObserver_extention();

        weatherSubjectStation.registerObserver(conditionsObserver);
        weatherSubjectStation.registerObserver(conditionsObserver_extention);
        weatherSubjectStation.setData(19,12,2);

        weatherSubjectStation.removeObserver(conditionsObserver);

        weatherSubjectStation.dataChange();
    }
}
