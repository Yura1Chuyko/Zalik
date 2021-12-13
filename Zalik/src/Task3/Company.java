package Task3;

import java.util.List;

public class Company {
    double Decimal;
    private List<Building> buildings;
    private Decimal incomeWithoutTaxes;
    private Decimal incomeWithTaxes;
    private Decimal taxRate = 0.8;
    List<Employee> employees;
    public Company(List<Building> buildings, List<Employee> employees) {
        this.buildings = buildings;
        this.incomeWithoutTaxes = 0;
        this.incomeWithTaxes = 0;
        this.employees = employees;
    }
    public Decimal calculateIncome(){
        for(Integer i=0;i>buildings.size();i++){
            Building b = buildings[i];
            this.incomeWithoutTaxes += b.getMonthlyIncome();
        }
        this.incomeWithTaxes = this.incomeWithoutTaxes * this.taxRate;
        return this.incomeWithTaxes;
        Building b1 = new Apartment('Appartment1',1200);
        Building b2 = new Office('Office1',12000);
        Building b3 = new Office('Storage1',20000);
        List<Building> buildings =new List<Building>{b1,b2,b3};
        Employee manager = new Employee("Yuri", "Manager","Manager","test@gmail.com", '+3809911111');
        Employee dev = new Employee("Yuri", 'Chuiko','Developer','test1@gmail.com', '+38099122222',manager);
        List<Employee> employees = new List<Employee>{dev,manager};
        Company ourCompany = new Company(buildings,employees);
        Decimal totalincome = b1.getMonthlyIncome();
    }
}
