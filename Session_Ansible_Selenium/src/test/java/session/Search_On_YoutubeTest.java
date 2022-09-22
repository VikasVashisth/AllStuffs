package session;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class Search_On_YoutubeTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("Url1"));  //Url2
    }
    @Test
    public void check(){

        Search_On_Youtube search_on_youtube = new Search_On_Youtube(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getSearch_box()));
        search_on_youtube.click_On_search_box().click();
        search_on_youtube.click_On_search_box().sendKeys("Knoldus Inc");
        search_on_youtube.click_On_search_box().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getKnoldus_title()));
        search_on_youtube.click_On_Knoldus_title().click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getSubscribe_button()));
        search_on_youtube.click_On_subscribe_button().click();

        //Click on first video
       /* wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getvideo()));
        search_on_youtube.click_On_video().click();*/


     /*          // throws Throwable{
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath("//button[text()='Login with Google']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vikas.vashisth@knoldus.com");

        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(schedule_sa_report_byDayofMonth.getGet_Team_content()));
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vikasvashisth9540141061");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.xpath("//button[text()='Web Clock-out']")).click();
        driver.findElement(By.xpath("//button[text()='Clock-out']")).click();
*/

    }
    @Test
    public  void NewTest(){

        System.out.println("Second test");
    }
}