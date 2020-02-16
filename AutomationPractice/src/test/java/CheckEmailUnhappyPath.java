import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @DataProvider(name = "data_provider_unhappy")
    public static Object[] checkWrongEmail(){
        return new Object[] { "32", "a@2.sdf", "ewsf"};
    }

    @Test(dataProvider = "data_provider_unhappy")
    public static void test(String data){

       boolean actualResult = Email.isEmailCorrect(data);
       boolean expectedResult = false;
       Assert.assertEquals(expectedResult, actualResult);
    }
}
