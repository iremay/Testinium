import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class giris {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\JavaProject\\GittiGidiyor\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/");

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.manage().window().maximize();
        WebElement navBarLogin = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Header\"]/nav[1]/div/div[8]/a[1]"))));
        navBarLogin.click();

        WebElement username = driver.findElement(By.xpath("/html/body/div[20]/div[2]/div/div/div/form/div[1]/div/div/input"));
        username.sendKeys("irem@gmail.com");

        WebElement password = driver.findElement(By.xpath("/html/body/div[20]/div[2]/div/div/div/form/div[2]/div/div/input"));
        password.sendKeys("123456789");

        WebElement loginClick = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[20]/div[2]/div/div/div/form/div[3]/button/span[1]"))));
        loginClick.click();


        String actualUrl="https://www.gittigidiyor.com/";
        String expectedUrl= driver.getCurrentUrl();

        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }


    }
}
