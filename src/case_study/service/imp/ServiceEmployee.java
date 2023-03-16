package case_study.service.imp;

import case_study.format.PhoneNumber;
import case_study.model.Employee;
import case_study.repository.IRepositoryEmployee;
import case_study.repository.imp.RepositoryEmployee;
import case_study.service.IServiceEmployee;

import java.util.List;
import java.util.Scanner;

public class ServiceEmployee implements IServiceEmployee {
    String path = "src/case_study/data/dataEmployees.csv";
    IRepositoryEmployee iRepositoryEmployee = new RepositoryEmployee();

    @Override
    public void disPlay() {
        List<Employee> employeeList = iRepositoryEmployee.getAll();
        if (employeeList.size() == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            for (Employee temp : employeeList
            ) {
                System.out.println(temp);
            }
        }
    }

    public boolean checkId(int id) {
        List<Employee> employeeList = iRepositoryEmployee.getAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("id này đã tồn tại");
                return true;
            }
        }
        return false;
    }
    @Override
    public void addNew() {
        List<Employee> employeeList = iRepositoryEmployee.getAll();
        Scanner sc = new Scanner(System.in);
        int id = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id");
                    id = Integer.parseInt(sc.nextLine());
                }while (checkId(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("id phải là số ");
            } catch (Exception e) {
                System.out.println("Nhập sai yêu cầu nhập lại");
            }
        } while (true);
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dataOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = sc.nextLine();
        int idCMND = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id chứng minh nhân dân");
                    idCMND = Integer.parseInt(sc.nextLine());
                }while (checkId(idCMND));
                boolean flag = true;
                if (idCMND <= 0) {
                    System.out.println("id chứng minh nhân dân phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số");
            } catch (Exception e) {
                System.out.println("Yêu cầu nhập lại");
            }
        } while (true);
        String numberOfPhone = null;
        do {
            try {
                boolean flag = true;
                System.out.println("Nhập sdt");
                numberOfPhone = sc.nextLine();
                if (PhoneNumber.validateNumberOfPhone(String.valueOf(numberOfPhone))) {
                    System.out.println("Vui lòng nhập số điện thoại bắt đầu từ số 0 và có 8 số");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui Lòng nhập số ");
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (true);
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập trình độ:");
        String level = sc.nextLine();
        System.out.println("Nhập vị trí làm việc:");
        String option = sc.nextLine();
        int salary = 0;
        do {
            try {
                boolean flag = true;
                System.out.println("Nhập lương: ");
                salary = Integer.parseInt(sc.nextLine());
                if (salary <= 0) {
                    System.out.println("Lương phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lương là số");
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (true);
        Employee employee = new Employee(id, name, dataOfBirth, gender, idCMND, numberOfPhone, email, level, option, salary);
        employeeList.add(employee);
        iRepositoryEmployee.addNew(path, employeeList);
    }

    public boolean checkIdSame(int id) {
        List<Employee> employeeList = iRepositoryEmployee.getAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return false;
            }
        }
        System.out.println("id này không tồn tại");
        return true;
    }
    @Override
    public void edit() {
        List<Employee> employeeList = iRepositoryEmployee.getAll();
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        int id = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id muốn sửa");
                    id = Integer.parseInt(sc.nextLine());
                }while (checkIdSame(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("id phải là số ");
            } catch (Exception e) {
                System.out.println("Nhập sai yêu cầu nhập lại");
            }
        } while (true);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                System.out.println("Nhập tên: ");
                employee.setName(sc.nextLine());
                System.out.println("Nhập ngày tháng năm sinh");
                employee.setDateOfBirth(sc.nextLine());
                System.out.println("Nhập giới tính: ");
                employee.setGender(sc.nextLine());
                int idCMND=0;
                do {
                    try {
                        do {
                            System.out.println("Nhập id CMND");
                            employee.setIdCMND(idCMND=Integer.parseInt(sc.nextLine()));
                        }while (checkId(idCMND));
                        boolean flag = true;
                        if (idCMND<=0){
                            System.out.println("idCMND phải là số dương");
                            flag = false;
                        }
                        if (flag){
                            break;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Không phải là số");
                    }

                }while (true);

                String numberOfPhone = null;
                do {
                    try {
                        boolean flag = true;
                        System.out.println("Nhập sdt");
                        employee.setNumberOfPhone(sc.nextLine());
                        if (PhoneNumber.validateNumberOfPhone(numberOfPhone)) {
                            System.out.println("Vui lòng nhập số điện thoại bắt đầu từ số 0 và có 8 số");
                            flag = false;
                        }
                        if (flag) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui Lòng nhập số ");
                    } catch (Exception e) {
                        System.out.println("Vui lòng nhập lại");
                    }
                } while (true);
                System.out.println("Nhập email:");
                employee.setEmail(sc.nextLine());
                System.out.println("Nhập trình độ:");
                employee.setLevel(sc.nextLine());
                System.out.println("Nhập vị trí làm việc:");
                employee.setOptions(sc.nextLine());
                int salary = 0;
                do {
                    try {
                        boolean flag = true;
                        System.out.println("Nhập lương: ");
                        salary = Integer.parseInt(sc.nextLine());
                        if (salary <= 0) {
                            System.out.println("Lương phải là số dương");
                            flag = false;
                        }
                        if (flag) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập lương là số");
                    } catch (Exception e) {
                        System.out.println("Vui lòng nhập lại");
                    }
                } while (true);
                employee = new Employee(id, employee.getName(), employee.getDateOfBirth(), employee.getGender(), employee.getIdCMND(), numberOfPhone, employee.getEmail(), employee.getLevel(), employee.getOptions(), salary);
                iRepositoryEmployee.edit(i,employee,employeeList,path);
            }
        }
    }
}
