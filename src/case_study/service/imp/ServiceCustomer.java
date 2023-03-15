package case_study.service.imp;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.IRepositoryCutomer;
import case_study.repository.imp.RepositoryCustomer;
import case_study.service.IServiceCustomer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    String path = "src/case_study/data/dataCustomer.csv";
    IRepositoryCutomer iRepositoryCutomer = new RepositoryCustomer();

    public boolean checkID(int id) {
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("id đã tồn tại");
                return false;
            }
        }
        return true;
    }

    public boolean checkIDCMND(int idCMND) {
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCMND() == idCMND) {
                System.out.println("idCMND đã tồn tại");
                return true;
            }
        }
//        if (flag){
//            return false;
//        }
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
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        int id = 0;
        do {
            try {
                boolean flag = true;
                System.out.println("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
//                if (checkID(id)) {
//                    flag =false;
//                }
                if (checkID(id)) {
                    System.out.println("id đã tồn tại");
                    if (id <= 0) {
                        System.out.println("id phải là số dương ");
                        flag = false;
                    }
                }
                if (flag) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        } while (true);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        int idCNMD = 0;
        do {
            try {
                Boolean idCNMDFlag = true;
                System.out.println("Nhập id chứng minh nhân dân: ");
                idCNMD = Integer.parseInt(sc.nextLine());
                if (idCNMD <= 0) {
                    System.out.println("id phải là số dương");
                    idCNMDFlag = false;
                }
                if (checkIDCMND(idCNMD)) {

                }

                if (idCNMDFlag) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        } while (true);
        int numberOfPhone = 0;
        do {
            try {
                boolean flag = true;
                System.out.println("Nhập số điện thoại: ");
                numberOfPhone = Integer.parseInt(sc.nextLine());
                if (numberOfPhone <= 0) {
                    System.out.println("Số điện thoại phải lớn hơn không");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số");
            } catch (Exception e) {
                System.out.println("Nhập sai. Yêu cầu nhập lại");
            }
        } while (true);

        System.out.println("Nhập email");
        String email = sc.nextLine();
        String kindOfCustomer;
        System.out.println("Nhập loại khách hàng:");
        System.out.println("a = Diamond");
        System.out.println("b = Platinium");
        System.out.println("c = Gold");
        System.out.println("d = Silver");
        System.out.println("e = Member");
        Customer kind = new Customer();
        kindOfCustomer = sc.nextLine();
        switch (kindOfCustomer) {
            case "a":
                kind.getA();
                break;
            case "b":
                kind.getB();
                break;
            case "c":
                kind.getC();
                break;
            case "d":
                kind.getD();
                break;
            case "e":
                kind.getE();
                break;
            default:
                System.out.println("Không có loại khách hàng này");
                break;
        }
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCNMD, numberOfPhone, email, kindOfCustomer, address);
        customerList.add(customer);
        iRepositoryCutomer.addCustomer(path, customerList);
    }

    public boolean checkIdSame(int id) {
        List<Customer> employeeList = iRepositoryCutomer.disPlay();
        boolean flag = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
//                System.out.println("id này không tồn tại");
                flag = false;
            }
            if (flag){
                return false;
            }
        }
        return true;
    }

    @Override
    public void edit() {
        List<Customer> customerList = iRepositoryCutomer.disPlay();
        Scanner sc = new Scanner(System.in);
        int id = 0;
        do {
            try {
                boolean flag = true;
                System.out.println("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
                if (id <= 0) {
                    System.out.println("id phải là số dương");
                    flag = false;
                }
                if (checkIdSame(id)) {
                    System.out.println("id này không tồn tại");
                }
                if (flag) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        } while (true);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                Customer customer = new Customer();
                System.out.println("Sửa tên");
                customer.setName(sc.nextLine());
                System.out.println("Sửa ngày sinh nhật");
                customer.setDateOfBirth(sc.nextLine());
                System.out.println("Sửa giới tính");
                customer.setGender(sc.nextLine());
                System.out.println("Sửa id chứng minh nhân dân");
                customer.setIdCMND(Integer.parseInt(sc.nextLine()));
                System.out.println("Sửa số điện thoại");
                customer.setNumberOfPhone(Integer.parseInt(sc.nextLine()));
                System.out.println("Sửa email");
                customer.setEmail(sc.nextLine());
                System.out.println("Sửa loại khách hàng");
                customer.setKindOfCustomer(sc.nextLine());
                System.out.println("Sửa địa chỉ");
                customer.setAddress(sc.nextLine());
                customer = new Customer(id, customer.getName(), customer.getDateOfBirth(), customer.getGender(), customer.getIdCMND(), customer.getNumberOfPhone(), customer.getEmail(), customer.getKindOfCustomer(), customer.getAddress());
                iRepositoryCutomer.repairCustomer(i, customerList, path, customer);
                return;
            }
        }

    }
}
