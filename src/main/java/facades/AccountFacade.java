package facades;

import entities.Account;

import javax.persistence.EntityManagerFactory;

public class AccountFacade {

    private static AccountFacade instance;
    private static EntityManagerFactory emf;

    private AccountFacade() {

    }

    public static AccountFacade getAccountFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AccountFacade();
        }
        return instance;
    }

    private EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public String createAccount() {
        Account account = new Account();

        return "Account created";
    }
}
