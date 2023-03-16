package case_study.model.abstractClass;

import java.util.Date;

public class Facility {
  private String serviceName;
  private int areaUse;
  private int price;
  private int peopleMax;
  private String date;

  public Facility() {
  }

  public Facility(String serviceName, int areaUse, int price, int peopleMax, String date) {
    this.serviceName = serviceName;
    this.areaUse = areaUse;
    this.price = price;
    this.peopleMax = peopleMax;
    this.date = date;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public int getAreaUse() {
    return areaUse;
  }

  public void setAreaUse(int areaUse) {
    this.areaUse = areaUse;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPeopleMax() {
    return peopleMax;
  }

  public void setPeopleMax(int peopleMax) {
    this.peopleMax = peopleMax;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return
            "serviceName='" + serviceName + '\'' +
            ", areaUse=" + areaUse +
            ", price=" + price +
            ", peopleMax=" + peopleMax +
            ", date='" + date + '\'' ;
  }
  public String toWriteCSV(){
    return getServiceName()+","+getAreaUse()+","+getPrice()+","+getPeopleMax()+","+getDate();
  }
}
