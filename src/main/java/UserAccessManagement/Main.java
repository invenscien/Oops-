package UserAccessManagement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account emp = new Account("12345",100,"bals","bals@","124");
        System.out.println(emp.getBalance());
        emp.DepositMoney(200);
        System.out.println(emp.getBalance());
        emp.WithDraw(300);
       // Account po = new Account();
        //po.setNumber("15");
        //System.out.println(po.getNumber());
        emp.setNumber("54");
        System.out.println(emp.getNumber());
        System.out.println(emp);

        }
    }
