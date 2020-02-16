import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @DataProvider(name = "data_provider_happy")
    public static Object[] checkValidEmail(){
        return new Object[] { "dD3_!@fA8.dd", "a533@2rr.rkf", "444444@444.aaaa"};
    }

    @Test(dataProvider = "data_provider_happy")
    public void test(String data){
        boolean actualResult = Email.isEmailCorrect(data);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
