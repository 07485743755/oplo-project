package co.oplo.testBase;


import co.oplo.utils.PropertyReader;
import org.junit.BeforeClass;

public class TestBase {

    public  static PropertyReader propertyReader;
    @BeforeClass
    public static void init(){

        propertyReader= PropertyReader.getInstance();

    }
}
