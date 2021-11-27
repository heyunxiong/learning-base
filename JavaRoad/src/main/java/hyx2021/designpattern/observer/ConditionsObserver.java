package hyx2021.designpattern.observer;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class ConditionsObserver implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    void display() {
        System.out.println("temperature is " + getTemperature());
        System.out.println("pressure is " + getPressure());
        System.out.println("humidity is " + getHumidity());

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


}
