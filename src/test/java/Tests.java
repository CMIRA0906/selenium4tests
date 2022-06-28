import org.junit.jupiter.api.Test;
import pages.GoogleHome;

public class Tests extends BaseClass{


    @Test
    public void googleTest(){
        GoogleHome home =  new GoogleHome(driver);
        System.out.println("Hi");
        home.searchSomething();
        System.out.println("Bye");
    }
}
