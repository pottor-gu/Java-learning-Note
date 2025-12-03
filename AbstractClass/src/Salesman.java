public class Salesman extends Employee{
    // 新增属性
    private Double basicSalary;
    private Double salesPerformance;
    private Double commission;

    public Salesman(String empId, String name, String department, String empType, Double basicSalary, Double salesPerformance) {
        super(empId, name, department, "销售人员");
        if(basicSalary == null || basicSalary <= 0.0){
            throw new IllegalArgumentException("基本工资不能为0");
        }
        if(salesPerformance == null || salesPerformance < 0.0){
            throw new IllegalArgumentException("销售业绩不能为负数，当前输入：" + salesPerformance);
        }
        this.basicSalary = basicSalary;
        this.salesPerformance = salesPerformance;
        this.commission = this.salesPerformance * 0.5;
    }

    // 实现抽象方法
    @Override
    public Double calculateSalary() {
        return this.basicSalary + this.commission;
    }

    @Override
    public void showInfo() {
        System.out.println("【销售人员信息】");
        System.out.println("员工编号：" + this.getEmpId());
        System.out.println("员工姓名：" + this.getName());
        System.out.println("所属部门：" + this.getDepartment());
        System.out.println("员工类型：" + this.getEmpType());
        System.out.println("基本工资：" + this.basicSalary);
        System.out.println("销售业绩：" + this.salesPerformance);
        System.out.println("销售提成：" + this.commission);
        System.out.println("本月实发工资：" + calculateSalary());
        System.out.println("----------------------------------");
    }
}
