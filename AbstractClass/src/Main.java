import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 薪酬管理系统运行结果 ===");

        // 创建员工列表
        List<Employee> employeesList = new ArrayList<>();
        Manager manager = new Manager("M001", "张三", "开发部", "经理", 5000.0, 10);
        Developer developer = new Developer("D001", "李四", "开发部", "开发工程师", 5000.0, 5000.0, 500.0);
        Salesman salesman = new Salesman("S001", "王五", "销售部", "销售人员", 5000.0, 5000.0);
        Intern intern = new Intern("I001", "赵六", "实习部", "实习生", 10.0, 10.0, 500.0);
        PartTimer partTimer = new PartTimer("P001", "孙七", "开发部", "兼职员工", 10.0, 10.0, 500.0);

        // 添加到员工列表
        employeesList.add(manager);
        employeesList.add(developer);
        employeesList.add(salesman);
        employeesList.add(intern);
        employeesList.add(partTimer);
        EmployeeStatistics.statistics(employeesList);

        // 显示所有员工信息
        manager.showInfo();
        developer.showInfo();
        salesman.showInfo();
        intern.showInfo();
        partTimer.showInfo();

        // 多态运行测试
        System.out.println("=== 多态运行测试 ===");
        System.out.println("通过Employee抽象类引用调用各子类方法");
        for (Employee employee : employeesList){
            System.out.println(employee.getName()+"的工资是："+employee.calculateSalary()+"元");
        }
        System.out.println();

        // 异常处理测试
        System.out.println("=== 异常处理测试 ===");
        // 异常1：实习生超时工作
        try{
            new Intern("I002", "王八", "实习部", "实习生", 10.0, 20.0, 500.0);
        }catch (IllegalArgumentException e){
            System.out.println("【异常情况1 - 实习生超时工作】");
            System.out.println("错误" + e.getMessage() + "\n");
        }

        // 异常2：销售业绩为负
        try{
            new Salesman("S002", "王九", "销售部", "销售人员", -5000.0, 5000.0);
        }catch (IllegalArgumentException e){
            System.out.println("【异常情况2 - 销售业绩为负】");
            System.out.println("错误" + e.getMessage() + "\n");
        }
        System.out.println();

        // 员工列表汇总
        EmployeeStatistics.statistics(employeesList);

        System.out.println("=== 运行结束 ===");
    }
}