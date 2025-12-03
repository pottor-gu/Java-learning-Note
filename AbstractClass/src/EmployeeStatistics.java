import java.util.List;

public class EmployeeStatistics {
    public static void statistics(List<Employee> employeesList) {
        if(employeesList == null || employeesList.isEmpty()){
            System.out.println("=== 员工列表汇总 ===");
            System.out.println("总员工人数：0人");
            return;
        }
        int employeeCount = employeesList.size();
        Double totalSalary = 0.0;
        Double maxSalary = 0.0;
        String maxSalaryEmp = "";
        Double minSalary = Double.MAX_VALUE;
        String minSalaryEmp = "";
        Double avgSalary = 0.0;
        // 遍历员工列表
        for (Employee employee : employeesList) {
            // 月薪总额
            Double salary = employee.calculateSalary();
            totalSalary += salary;
            // 最高工资
            if(salary > maxSalary){
                maxSalary = salary;
                maxSalaryEmp = employee.getName();
            }
            // 最低工资
            if(salary < minSalary){
                minSalary = salary;
                minSalaryEmp = employee.getName();
            }
            // 平均工资
            avgSalary = totalSalary / employeeCount;
        }

        // 打印汇总信息
        System.out.println("=== 员工列表汇总 ===");
        System.out.println("总员工数量：" + employeeCount + "人");
        System.out.println("月薪总额：" + totalSalary + "元");
        System.out.println("平均工资：" + avgSalary);
        System.out.println("最高工资员工：" + maxSalaryEmp+"，工资：" + maxSalary);
        System.out.println("最低工资员工：" + minSalaryEmp+"，工资：" + minSalary);
    }
}
