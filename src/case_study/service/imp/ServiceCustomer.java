package case_study.service.imp;

import case_study.format.FormatDate;
import case_study.format.FormatName;
import case_study.format.FormatNameFacility;
import case_study.format.PhoneNumber;
import case_study.model.Customer;
import case_study.repository.IRepositoryCutomer;
import case_study.repository.imp.RepositoryCustomer;
import case_study.service.IServiceCustomer;

import java.util.List;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    String path = "src/case_study/data/dataCustomer.csv";
    IRepositoryCutomer iRepositoryCustomer = new RepositoryCustomer();


    @Override
    public void disPlay() {
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        if (customerList.size() == 0) {
            System.out.println("Không có danh sách");
        } else {
            for (Customer temp : customerList
            ) {
                System.out.println(temp);
            }
        }

    }

    public boolean checkID(int id) {
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("id đã tồn tại");
                return true;
            }
        }
        return false;
    }

    public boolean checkIDCMND(int idCMND) {
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdCMND() == idCMND) {
                System.out.println("idCMND đã tồn tại");
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        int id = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id: ");
                    id = Integer.parseInt(sc.nextLine());
                } while (checkID(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phải là số dương ");
                    flag = false;
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
        String name;
        do {
            System.out.println("Nhập tên: ");
            name = sc.nextLine();
            if (FormatName.validateName(name)){
                break;
            }
            System.out.println("Viết hoa kí tự đầu của tên ");
        }while (true);
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        int idCNMD = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id chứng minh nhân dân: ");
                    idCNMD = Integer.parseInt(sc.nextLine());
                } while (checkIDCMND(idCNMD));
                Boolean idCNMDFlag = true;
                if (idCNMD <= 0) {
                    System.out.println("id phải là số dương");
                    idCNMDFlag = false;
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
        String numberOfPhone = null;
        do {
            try {
                boolean flag1 = false;
                System.out.println("Nhập số điện thoại: ");
                numberOfPhone = sc.nextLine();
                if (PhoneNumber.validateNumberOfPhone(numberOfPhone)) {
                    flag1 = true;
                }
                if (flag1) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nhập sai. Yêu cầu nhập lại");
            }
        } while (true);

        System.out.println("Nhập email");
        String email = sc.nextLine();
        String kindOfCustomer;
        System.out.println("Nhập loại khách hàng:");
        kindOfCustomer = sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCNMD, numberOfPhone, email, kindOfCustomer, address);
        customerList.add(customer);
        iRepositoryCustomer.addCustomer(path, customerList);
    }

    public boolean checkIdSame(int id) {
        List<Customer> customerlist = iRepositoryCustomer.disPlay();
        for (int i = 0; i < customerlist.size(); i++) {
            if (customerlist.get(i).getId() == id) {
                return false;
            }
        }
        System.out.println("id này không tồn tại");
        return true;
    }

    public boolean checkIdCMNDSame(int id) {
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("id này không tồn tại");
                return true;
            }
        }
        return false;
    }

    @Override
    public void edit() {
        List<Customer> customerList = iRepositoryCustomer.disPlay();
        Scanner sc = new Scanner(System.in);
        int id =0 ;
        do {
            try {
                do {
                    System.out.println("Nhập id: ");
                    id = Integer.parseInt(sc.nextLine());
                } while (checkIdSame(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phải là số dương");
                    flag = false;
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

        Customer customer = new Customer();
        String name;
        do {
            System.out.println("Sửa tên: ");
            customer.setName(name = sc.nextLine());
            if (FormatName.validateName(name)){
                break;
            }
            System.out.println("Viết hoa kĩ tự đầu của tên");
        }while (true);
        String dateOfBirth = null;
        do {
            boolean flag = true;
            System.out.println("Sửa ngày sinh nhật");
            customer.setDateOfBirth(dateOfBirth = sc.nextLine());
            if (FormatDate.formatDate(dateOfBirth)) {
                break;
            }
        } while (true);

        System.out.println("Sửa giới tính");
        customer.setGender(sc.nextLine());
        int idCMND = 0;
        do {
            try {
                do {
                    System.out.println("Sửa id chứng minh nhân dân");
                    customer.setIdCMND(idCMND = Integer.parseInt(sc.nextLine()));
                } while (checkIdCMNDSame(idCMND));
                boolean flag = true;
                if (idCMND <= 0) {
                    System.out.println("idCMND phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số");
            }
        } while (true);
        String numberOfPhone = null;
        do {
            try {
                boolean flag = false;
                System.out.println("Nhập số điện thoại: ");
                customer.setNumberOfPhone(numberOfPhone = sc.nextLine());
                if (PhoneNumber.validateNumberOfPhone(numberOfPhone)) {
                    flag = true;
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
        System.out.println("Sửa email");
        customer.setEmail(sc.nextLine());
        System.out.println("Sửa loại khách hàng");
        customer.setKindOfCustomer(sc.nextLine());
        System.out.println("Sửa địa chỉ");
        customer.setAddress(sc.nextLine());
        customer = new Customer(id, customer.getName(), customer.getDateOfBirth(), customer.getGender(), customer.getIdCMND(), customer.getNumberOfPhone(), customer.getEmail(), customer.getKindOfCustomer(), customer.getAddress());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                iRepositoryCustomer.repairCustomer(i, customerList, path, customer);
                return;
            }

        }
    }

}

