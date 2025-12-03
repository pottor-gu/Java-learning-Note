public class Manager extends Employee{
    // 新增属性
    private Double basicSalary;
    private int teamSize;
    private Double managerBonus;

    // 构造方法
    public Manager(String empId, String name, String department, String empType, Double basicSalary, int teamSize){
        // 调用父类构造方法
        super(empId, name, department, "经理");
        if(basicSalary == null || basicSalary <= 0.0){
            throw new IllegalArgumentException("基本工资不能为空");
        }
        if(teamSize <= 0){
            throw new IllegalArgumentException("团队人数不能为空");
        }
        this.basicSalary = basicSalary;
        this.teamSize = teamSize;
    }

    @Override
    public Double calculateSalary(){
        // 计算经理的工资
        this.managerBonus = teamSize * 500.0;
        return this.basicSalary + this.managerBonus;
    }

    @Override
    public void showInfo(){
        System.out.println("【经理人员信息】");
        System.out.println("员工编号：" + getEmpId());
        System.out.println("员工姓名：" + getName());
        System.out.println("所属部门：" + getDepartment());
        System.out.println("员工类型：" + getEmpType());
        System.out.println("基本工资：" + basicSalary);
        System.out.println("团队人数：" + teamSize);
        System.out.println("经理奖金：" + managerBonus);
        System.out.println("实发工资：" + calculateSalary());
        System.out.println("----------------------------------");
    }

}
