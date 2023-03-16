package case_study.model;

import case_study.model.abstractClass.Facility;
import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

public class House extends Facility {
    private String standardsRoomHouse;
    private int numberOfFloorsHouse;

    public House() {
    }

    public House(String standardsRoomHouse, int numberOfFloorsHouse) {
        this.standardsRoomHouse = standardsRoomHouse;
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    public House(String serviceName, int areaUse, int price, int peopleMax, String date, String standardsRoomHouse, int numberOfFloorsHouse) {
        super(serviceName, areaUse, price, peopleMax, date);
        this.standardsRoomHouse = standardsRoomHouse;
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    public String getStandardsRoomHouse() {
        return standardsRoomHouse;
    }

    public void setStandardsRoomHouse(String standardsRoomHouse) {
        this.standardsRoomHouse = standardsRoomHouse;
    }

    public int getNumberOfFloorsHouse() {
        return numberOfFloorsHouse;
    }

    public void setNumberOfFloorsHouse(int numberOfFloorsHouse) {
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardsRoomHouse='" + standardsRoomHouse + '\'' +
                ", numberOfFloorsHouse=" + numberOfFloorsHouse + super.toString()+
                '}';
    }
    public String toWriteCSV(){
        return super.toWriteCSV()+","+getStandardsRoomHouse()+","+getNumberOfFloorsHouse();
    }
}
