package company;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] es = new Employee[4];
        es[0] = new SalariedEmployee("tom", 5, 8000);
        es[1] = new HourlyEmployee("jerry", 11, 10, 300);
        es[2] = new SalesEmployee("anna", 2, 200000, 0.05);
        es[3] = new BasePlusSalesEmployee("bob", 11, 1000000, 0.1, 10000);
        int month = 11; // 本月为11月
        System.out.println("nanshan inc. " + month + " month income list");
        for (int i = 0; i < es.length; i++) {
            System.out.println(es[i].getName() + ":" + es[i].getSalary(month));
        }
    }
}
