package Tests.Header;

import Page.HomePage;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckSocialButton extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver);

    }


    @Test
    public void checkYouTubeButton(){

    }
    @Test
    public void checkFaceBookButton(){

    }
    @Test
    public void checkTwitterButton(){

    }
    @Test
    public void checkInstagramButton(){

    }
    @Test
    public void checkOdnoklassnikiButton(){

    }
    @Test
    public void checkRSSButton(){

    }
}
