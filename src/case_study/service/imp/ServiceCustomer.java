package case_study.service.imp;

import case_study.model.Customer;
import case_study.repository.IRepositoryCutomer;
import case_study.repository.imp.RepositoryCustomer;
import case_study.service.IServiceCustomer;

import java.util.List;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    String path = "src/case_study/data/dataCustomer.csv";
    IRepositoryCutomer iRepositoryCutomer = new RepositoryCustomer();
    public boolean checkID(int id){
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        for (int i = 0; i <customerList.size() ; i++) {
            if (customerList.get(i).getId() ==id){
                return true;
            }
        }
        return false;
    }
    public boolean checkIDCMND(int idCMND){
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCMND()==idCMND){
                return true;
            }
        }
        return false;
    }
    @Override
    public void disPlay() {
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        if (customerList.size() == 0) {
            System.out.println("Không có danh sách");
        } else {
            for (Customer temp : customerList
            ) {
                System.out.println(temp);
            }
        }

    }

    @Override
    public void addNew() {
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int id;
        do {
            try {
                System.out.println("Nhập id: ");
                 id = Integer.parseInt(sc.nextLine());
                if (id<=0){
                    System.out.println("id phải là số dương");
                    flag = false;
                }
                if (flag){
                    break;
                }
                if (checkID(id)){
                    System.out.println("id đã tồn tại");
                }
            }catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        }while (flag);
        System.out.println("Nhập tên: ");
        String name =sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String tempGender = sc.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")){
            gender= true;
        }else if (tempGender.equals("Nữ")){
            gender=false;
        }else gender = null;
       Boolean idCNMDFlag =true;
       int idCNMD;
        do {
           try {
               System.out.println("Nhập id chứng minh nhân dân: ");
               idCNMD = Integer.parseInt(sc.nextLine());
               if (idCNMD<=0){
                   System.out.println("id phải là số dương");
                   idCNMDFlag= false;
               }
               if (idCNMDFlag){
                   break;
               }
               if (checkIDCMND(idCNMD)){
                   System.out.println("idCMND đã tồn tại");
               }
           }catch (NumberFormatException e) {
               System.out.println("Bạn nhập không phải là số.");
           } catch (Exception e) {
               System.out.println("Nhập sai. yêu cầu nhập lại ");
           }
        }while (idCNMDFlag);
        System.out.println("Nhập số điện thoại: ");
        int numberOfPhone = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email");
    }

    @Override
    public void edit() {

    }
}
