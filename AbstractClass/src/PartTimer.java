public class PartTimer extends Employee{
    // 新增属性
    private Double hourlyWage;  // 时薪(元/小时)
    private Double workHours;   // 工作时长(小时)
    private Double trafficAllowance;   //交通补贴

    public PartTimer(String empId, String name, String department, String empType, Double hourlyWage, Double workHours, Double trafficAllowance) {
        super(empId, name, department, "兼职员工");
        if(hourlyWage == null || hourlyWage <= 0.0){
            throw new IllegalArgumentException("员工时薪不能为0或小于0");
        }
        if(workHours == null || workHours <= 0.0){
            throw new IllegalArgumentException("员工工作时长不能小于0");
        }
        if(trafficAllowance == null || trafficAllowance < 0.0){
            throw new IllegalArgumentException("员工交通补贴不能小于0");
        }
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
        this.trafficAllowance = trafficAllowance;
    }

    // 抽象方法
    @Override
    public Double calculateSalary() {
        return this.hourlyWage * this.workHours + this.trafficAllowance;
    }

    @Override
    public void showInfo() {
    System.out.println("【兼职员工信息】");
    System.out.println("员工编号：" + this.getEmpId());
    System.out.println("员工姓名：" + this.getName());
    System.out.println("所属部门：" + this.getDepartment());
    System.out.println("员工类型：" + this.getEmpType());
    System.out.println("员工时薪：" + this.hourlyWage+"元/小时");
    System.out.println("员工工作时长：" + this.workHours+"小时");
    System.out.println("员工交通补贴：" + this.trafficAllowance+"元");
    System.out.println("员工实发工资：" + calculateSalary()+"元");
    System.out.println("----------------------------------");
    }
}
