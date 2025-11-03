import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel {
    public static void main(String[] args) {
        // Start a browser (this is Selenium)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
