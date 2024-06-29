package pages;

import static com.codeborne.selenide.Selenide.executeJavaScript;

// Отключение баннера
public class BannerDrop{
    public static void bannerDrop(){
        executeJavaScript("$('#fixedban').remove();");
        executeJavaScript("$('footer').remove();");
    }
}