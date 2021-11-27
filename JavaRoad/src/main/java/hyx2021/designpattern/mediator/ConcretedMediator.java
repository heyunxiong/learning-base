package hyx2021.designpattern.mediator;

import java.util.HashMap;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class ConcretedMediator extends Mediator {

    private HashMap<String,Appliance> applianceHashMap;
    private HashMap<String,String> interMap;

    public ConcretedMediator(HashMap<String, Appliance> applianceHashMap, HashMap<String, String> interMap) {
        this.applianceHashMap = applianceHashMap;
        this.interMap = interMap;
    }

    @Override
    public void register(String name, Appliance appliance) {
        applianceHashMap.put(name,appliance);
        if(appliance instanceof  Alarm){
            interMap.put("Alarm", name);
        }else if(appliance instanceof  TV){
            interMap.put("TV", name);
        }
    }

    @Override
    public void getMessage(int stateChange, String name) {
        if(applianceHashMap.get(name) instanceof  Alarm){
            if(stateChange == 0){
                Alarm alrm = (Alarm)applianceHashMap.get(interMap.get("Alarm"));

                TV tv = (TV)applianceHashMap.get(interMap.get("TV"));
                tv.startTV();
            }else if(stateChange == 1) {
                TV tv = (TV)applianceHashMap.get(interMap.get("TV"));
                tv.stopTV();

            }
        }
    }

    @Override
    void sendMessage() {

    }
}
