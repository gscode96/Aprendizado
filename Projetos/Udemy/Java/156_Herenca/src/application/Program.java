package application;

import Entities.Account;
import Entities.BussinessAccount;
import Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWCASTING

        BussinessAccount acc4 = (BussinessAccount) acc2; // casting manual
        acc4.loan(100.0);

        if (acc3 instanceof BussinessAccount) { // verifica a instancia para não dar erro
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.00); // realiza a operacao do objeto convertido

        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();

        }

        // Sobrepossição de métodos

        Account acc6 = new Account(1006, "Gabriel", 1000.00);
        acc6.withdraw(200.0); 
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1007, "Jamile", 1000.0, 0.01);
        acc7.withdraw(200.0); //metodo sobreescrevido na clase filha sem taxa
        System.out.println(acc7.getBalance());

        Account acc8 = new BussinessAccount(1008, "Gabriel", 1000.0, 200.0);
        acc8.withdraw(200.0);//metodo sobreescrevido com a palava super para usar a classe mãe mais uma implementacao
        System.out.println(acc8.getBalance());



    }

}
