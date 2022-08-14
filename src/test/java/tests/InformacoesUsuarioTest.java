package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navegador;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NoT\\drivers\\chromedriver.exe");
        // abrindo o navegador
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // navegando até a página
        navegador.get("http://www.juliodelima.com.br/taskit");
    }
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario () {


        // clicando no botão Sign in
        navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.id("login-sign-in")).sendKeys("rodneydeoliveira");
        navegador.findElement(By.id("password-sign-in")).sendKeys("Sharkman17!");
        navegador.findElement(By.id("btn-submit-sign-in")).click();
        navegador.findElement(By.xpath("/html/body/nav/div/div/ul[1]/li[3]/a")).isEnabled();
    }
    @After
    public void tearDown() {
        navegador.quit();

    }

}
