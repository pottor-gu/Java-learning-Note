public abstract class Employee {
    private String empId;
    private String name;
    private String department;
    private String empType;

    // 构造方法
    public Employee(String empId, String name, String department, String empType) {
        // 参数判空验证
        if(empId == null || empId.trim().isEmpty()){
            throw new IllegalArgumentException("员工编号不能为空");
        }
        if(name == null || name.trim().isEmpty()){
            throw  new IllegalArgumentException("员工姓名不能为空");
        }
        if(department == null || department.trim().isEmpty()){
            throw new IllegalArgumentException("所属部门不能为空");
        }
        if(empType == null || empType.trim().isEmpty()){
            throw new IllegalArgumentException("员工类型不能为空");
        }
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.empType = empType ;
    }
    // getter方法
    public String getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmpType() {
        return empType;
    }
    // 抽象方法  计算工资
    public abstract Double calculateSalary();
    // 抽象方法 显示员工信息
    public abstract void showInfo();
}
