public class Intern extends Employee{
    // 新增属性
    private Double hourlyWage;  // 时薪(元/小时)
    private Double workHours;   // 工作时长(小时)
    private Double internAllowance; // 实习补贴

    public Intern(String empId, String name, String department, String empType, Double hourlyWage, Double workHours, Double internAllowance) {
        super(empId, name, department, "实习生");
        if(hourlyWage == null || hourlyWage <= 0.0){
            throw new IllegalArgumentException("员工时薪不能小于0");
        }
        if(workHours == null || workHours <= 0.0){
            throw new IllegalArgumentException("员工工作时长不能小于0");
        }
        if(workHours > 160.0){
            throw new IllegalArgumentException("实习生每月工作时长不能超过160小时，当前输入：" + workHours + "小时");
        }
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
        this.internAllowance = internAllowance;
    }

    // 实现抽象方法
    @Override
    public Double calculateSalary() {
        return this.hourlyWage * this.workHours + this.internAllowance;
    }

    @Override
    public void showInfo() {
        System.out.println("【实习生信息】");
        System.out.println("员工编号：" + this.getEmpId());
        System.out.println("员工姓名：" + this.getName());
        System.out.println("所属部门：" + this.getDepartment());
        System.out.println("员工类型：" + this.getEmpType());
        System.out.println("员工时薪：" + this.hourlyWage+"元/小时");
        System.out.println("员工工作时长：" + this.workHours+"小时");
        System.out.println("员工实习补贴：" + this.internAllowance+"元");
        System.out.println("员工实发工资：" + calculateSalary()+"元");
        System.out.println("----------------------------------");
    }
}
