package entidades;

public class Employee {
    public  String name;
    public  Double grossSalary;
    public  double tax;

    public double netSalary(){
        return grossSalary-tax;
    }
    public double increaseSalary(double percentagem){
        return  grossSalary += grossSalary*(percentagem/100);
    }

    @Override
    public String toString() {
      return    name+"," +" $ "
              + String.format("%.2f",netSalary());
    }
}
