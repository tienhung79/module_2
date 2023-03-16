package case_study.model;

import case_study.model.abstractClass.Facility;

public class Villa extends Facility {
    private String standardsRoomVilla;
    private int areaSwimPooll;
    private int numberOfFloorsVilla;

    public Villa() {
    }

    public Villa(String standardsRoom, int areaSwimPooll, int numberOfFloorsVilla) {
        this.standardsRoomVilla = standardsRoom;
        this.areaSwimPooll = areaSwimPooll;
        this.numberOfFloorsVilla = numberOfFloorsVilla;
    }

    public Villa(String serviceName, int areaUse, int price, int peopleMax, String date, String standardsRoom, int areaSwimPooll, int numberOfFloorsVilla) {
        super(serviceName, areaUse, price, peopleMax, date);
        this.standardsRoomVilla= standardsRoom;
        this.areaSwimPooll = areaSwimPooll;
        this.numberOfFloorsVilla = numberOfFloorsVilla;
    }

    public String getStandardsRoom() {
        return standardsRoomVilla;
    }

    public void setStandardsRoom(String standardsRoom) {
        this.standardsRoomVilla = standardsRoom;
    }

    public int getAreaSwimPooll() {
        return areaSwimPooll;
    }

    public void setAreaSwimPooll(int areaSwimPooll) {
        this.areaSwimPooll = areaSwimPooll;
    }

    public int getNumberOfFloors() {
        return numberOfFloorsVilla;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloorsVilla = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardsRoom='" + standardsRoomVilla + '\'' +
                ", areaSwimPooll=" + areaSwimPooll +
                ", numberOfFloors=" + numberOfFloorsVilla +super.toString()+
                '}';
    }
    public String toWriteCSV(){
        return super.toWriteCSV()+","+getStandardsRoom()+","+getAreaSwimPooll()+","+getNumberOfFloors();
    }
}
