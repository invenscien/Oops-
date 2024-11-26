package UserAccessManagement;

public class Account {
    private String Number;
    private Double Balance;
    private String Name;
    private String Email;
    private String Phone;

   public Account(String Number,double Balance , String Name,String email,String Phone){
       this.Number = Number;
       this.Name = Name;
       this.Balance= Balance;
       this.Email= email;
       this.Phone = Phone;

   }
   public void DepositMoney(double DepositedMoney) {
       this.Balance += DepositedMoney;
       System.out.println("Deposit is Successful , new balance is" + this.Balance);
   }
   public void WithDraw(double WithDrawMoney) {
       if (this.Balance - WithDrawMoney < 0) {
           System.out.println("withdraw unsucess " + this.Balance + "is only left");
       }
       else {
       this.Balance-=WithDrawMoney;
           System.out.println("Withdraw sucessful, current balance"+this.Balance);
       }
   }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}


