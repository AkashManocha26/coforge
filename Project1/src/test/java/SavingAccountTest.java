import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {
    SavingAccount account;
    @BeforeEach
    public void  init(){
        account=new SavingAccount(1001,"Ankit Kumar",10000,0.5f,4,"jaipur");
    }
    @Test
    public void testGetActId(){
        Assertions.assertEquals(account.getActId(),1001);
    }
    @Test
    public void testGetActName(){
        Assertions.assertEquals(account.getActName(),"Ankit Kumar");
    }
    @Test
    public void testGetBalance(){
        Assertions.assertEquals(account.getBalance(),10000);
        account.deposit(10000);
        Assertions.assertEquals(account.getBalance(),20000);
    }
    @Test
    public void testGetLocation(){
        Assertions.assertEquals(account.getLocation(),"jaipur");
    }
    @Test
    public void testGetRate(){
        Assertions.assertEquals(account.getRate(),0.5f);
    }
    @Test
    public void testGetTime(){
        Assertions.assertEquals(account.getTime(),4);
    }

}
