public class Developer extends Employee{
    // 新增属性
    private Double basicSalary;
    private Double projectBonus;
    private Double teachAllowance;

    // 构造方法
    public Developer(String empId, String name, String department, String empType, Double basicSalary, Double projectBonus, Double teachAllowance) {
        super(empId, name, department, "开发工程师");
        // 参数判空验证
        if(basicSalary == null || basicSalary < 0){
            throw new IllegalArgumentException("员工基本工资不能小于0");
        }
        if(projectBonus == null || projectBonus < 0){
            throw new IllegalArgumentException("员工项目奖金不能小于0");
        }
        if(teachAllowance == null || teachAllowance < 0){
            throw new IllegalArgumentException("员工技术津贴不能小于0");
        }

        this.basicSalary = basicSalary;
        this.projectBonus = projectBonus;
        this.teachAllowance = teachAllowance;
    }
    @Override
    public Double calculateSalary() {
        return this.basicSalary + this.projectBonus + this.teachAllowance;
    }

    @Override
    public void showInfo() {
        System.out.println("【开发人员信息】");
        System.out.println("员工编号：" + this.getEmpId());
        System.out.println("员工姓名：" + this.getName());
        System.out.println("所属部门：" + this.getDepartment());
        System.out.println("员工类型：" + this.getEmpType());
        System.out.println("基本工资：" + this.basicSalary);
        System.out.println("项目奖金：" + this.projectBonus);
        System.out.println("技术津贴：" + this.teachAllowance);
        System.out.println("本月实发工资：" + calculateSalary());
        System.out.println("----------------------------------");
    }
}
