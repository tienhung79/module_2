package case_study.model;

import case_study.model.abstractClass.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String id,String serviceName, int areaUse, int price, int peopleMax, String date, String serviceFree) {
        super(id,serviceName, areaUse, price, peopleMax, date);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString()+","+
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
    public String toWriteCSV(){
        return super.toWriteCSV()+","+getServiceFree();
    }
}
