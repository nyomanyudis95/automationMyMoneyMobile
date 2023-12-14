package com.myMoney.pageObject;

import com.myMoney.utils.StringUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainInputPage {
    WebDriverWait wait;
    AppiumDriver driver;
    By btnCancelSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_cancel");
    By btnSaveSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_save");
    By btnIncomeSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_1");
    By btnExpenseSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_2");
    By btnTransferSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_3");
    By btnAccountSelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_from");
    By btnCategorySelector = AppiumBy.id("com.raha.app.mymoney.free:id/btn_to");
    By inputTextNoteSelector = AppiumBy.id("com.raha.app.mymoney.free:id/et_note");
    By textViewNominalSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_display");
    By textSignSelector = AppiumBy.id("com.raha.app.mymoney.free:id/iv_sign");

    By bottomSheetContainerSelector = AppiumBy.id("com.raha.app.mymoney.free:id/design_bottom_sheet");
    By titleBottomSheetSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_title");
    By containerListItemBottomSheetSelector = AppiumBy.id("com.raha.app.mymoney.free:id/rv");
    By listDetailTitleSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_title");
    By listDetailAmountSelector = AppiumBy.id("com.raha.app.mymoney.free:id/tv_amount");



    public MainInputPage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertUserInMainInputPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnCancelSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(btnSaveSelector));
        WebElement btnCancelElement = driver.findElement(btnCancelSelector);
        WebElement btnSaveElement = driver.findElement(btnSaveSelector);
        Assertions.assertEquals(true,btnSaveElement.isDisplayed());
        Assertions.assertEquals(true,btnCancelElement.isDisplayed());
    }

    public String clickBtnCalculator(String nominal,String type,boolean isResetNominal){
        WebElement btnElement;
        wait.until(ExpectedConditions.presenceOfElementLocated(textViewNominalSelector));
        if(StringUtils.isNumeric(type)){
            int numberType = Integer.valueOf(type);
            if(numberType>=1 && numberType <=3){
                if(numberType == 1){
                    wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_1\" and @text=\"1\"]")));
                    btnElement = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_1\" and @text=\"1\"]"));
                    btnElement.click();
                }
                else if(numberType == 2){
                    wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_2\" and @text=\"2\"]")));
                    btnElement = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_2\" and @text=\"2\"]"));
                    btnElement.click();
                }
                else if(numberType == 3){
                    wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_3\" and @text=\"3\"]")));
                    btnElement = driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.raha.app.mymoney.free:id/btn_3\" and @text=\"3\"]"));
                    btnElement.click();
                }
            }
            else{
                wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type)));
                btnElement = driver.findElement(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type));
                btnElement.click();
            }
        }
        else{
            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type)));
            btnElement = driver.findElement(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type));
            btnElement.click();
        }



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String nominalText = driver.findElement(textViewNominalSelector).getText();

        if(!isResetNominal){
            if(StringUtils.isNumeric(type)){
                float numberType = Float.valueOf(type);
                if(numberType >=1 && numberType <=9){
                    int lengthNominal = nominal.length();
                    int indexDot = 0;
                    if(nominal.contains(".")){
                        indexDot = nominal.indexOf('.');
                        if(indexDot+3 == lengthNominal){
                            Assertions.assertEquals(nominalText,nominal);
                            System.out.println("nyoman1 nominal = "+nominal+ " nominalText = "+nominalText);
                        }
                        else{
                            String finalNominal = nominal+type;
                            Assertions.assertEquals(nominalText,finalNominal);
                            System.out.println("nyoman2 nominal = "+nominal+ " nominalText = "+nominalText);
                        }
                    }
                    else{
                        if(nominal.contains("0")){
                            if(nominal.indexOf('0') == 0  && nominal.length() == 1){
                                Assertions.assertEquals(nominalText,type);
                                System.out.println("nyoman3 nominal = "+nominal+ " nominalText = "+nominalText);
                            }
                            else{
                                String finalNominal = nominal+type;
                                Assertions.assertEquals(nominalText,finalNominal);
                                System.out.println("nyoman4 nominal = "+nominal+ " nominalText = "+nominalText);
                            }
                        }
                        else{
                            String finalNominal = nominal+type;
                            Assertions.assertEquals(nominalText,finalNominal);
                            System.out.println("nyoman5 nominal = "+nominal+ " nominalText = "+nominalText);
                        }

                    }
                }
                else if(numberType == 0){
                    if(nominal.contains("0")){
                        int index = nominal.indexOf('0');
                        if(index != 0){
                            String finalNominal = nominal+"0";
                            Assertions.assertEquals(nominalText,finalNominal);
                            System.out.println("nyoman6 nominal = "+nominal+ " nominalText = "+nominalText);
                        }
                        else{
                            Assertions.assertEquals(nominalText,nominal);
                            System.out.println("nyoman7 nominal = "+nominal+ " nominalText = "+nominalText);
                        }
                    }
                    else{
                        String finalNominal = nominal+"0";
                        Assertions.assertEquals(nominalText,finalNominal);
                        System.out.println("nyoman8 nominal = "+nominal+ " nominalText = "+nominalText);
                    }
                }
            }
            else if(type.equals("dot")){
                if(nominal.contains(".")){
                    Assertions.assertEquals(nominalText,nominal);
                    System.out.println("nyoman9 nominal = "+nominal+ " nominalText = "+nominalText);
                }
                else{
                    String finalNominal = nominal+".";
                    Assertions.assertEquals(nominalText,finalNominal);
                    System.out.println("nyoman10 nominal = "+nominal+ " nominalText = "+nominalText);
                }
            }
            else if(type.equals("c")){
                if(nominal.length() == 1){
                    Assertions.assertEquals(nominalText,"0");
                    System.out.println("nyoman11 nominal = "+nominal+ " nominalText = "+nominalText);
                }
                else{
                    String finalNominal = nominal.substring(0,nominal.length()-1);
                    Assertions.assertEquals(nominalText,finalNominal);
                    System.out.println("nyoman12 nominal = "+nominal+ " finalNominal = "+finalNominal);
                }
            }
        }
        else{
            if(type.equals(".")){
                Assertions.assertEquals(nominalText,"0.");
                System.out.println("nyoman13 nominal = "+nominal+ " finalNominal = "+"0.");
            }
            else{
                Assertions.assertEquals(nominalText,type);
                System.out.println("nyoman14 nominal = "+nominal+ " finalNominal = "+type);
            }

        }

        return nominalText;
    }

    public void clickBtnAritmaticCalculator(String type,String activeTypeCalculation, boolean isReadyCalulate, String totalNominal, String nominal){
        wait.until(ExpectedConditions.presenceOfElementLocated(textViewNominalSelector));

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type)));
        WebElement btnElement = driver.findElement(AppiumBy.id("com.raha.app.mymoney.free:id/btn_"+type));
        btnElement.click();

        if(isReadyCalulate){
            int numberTotalNominal = Integer.valueOf(totalNominal);
            int numberNominal = Integer.valueOf(nominal);
            if(activeTypeCalculation.equals("plus")){
                numberTotalNominal += numberNominal;
            }
            else if(activeTypeCalculation.equals("minus")){
                numberTotalNominal -= numberNominal;
            }
            else if(activeTypeCalculation.equals("mul")){
                numberTotalNominal *= numberNominal;
            }
            else if(activeTypeCalculation.equals("div")){
                numberTotalNominal /= numberNominal;
            }
            String StringTotalNominal = String.valueOf(numberTotalNominal);




            wait.until(ExpectedConditions.presenceOfElementLocated(textViewNominalSelector));
            Assertions.assertEquals(StringTotalNominal,driver.findElement(textViewNominalSelector).getText());

            System.out.println("nyoman18 nominal = "+nominal+ " finalNominal = "+type);
        }
    }

    public void clickBtnAccount(){
        wait.until(ExpectedConditions.presenceOfElementLocated(btnAccountSelector));
        driver.findElement(btnAccountSelector).click();
    }

    public void assertBottomSheetAccountIsDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(bottomSheetContainerSelector));
        wait.until(ExpectedConditions.presenceOfElementLocated(titleBottomSheetSelector));
        WebElement containerElement = driver.findElement(bottomSheetContainerSelector);
        WebElement titleElement = driver.findElement(titleBottomSheetSelector);
        Assertions.assertEquals(true,containerElement.isDisplayed());
        Assertions.assertEquals("Select an account",titleElement.getText());
    }

    public void assertBottomSheetAccountIsHide(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(bottomSheetContainerSelector));
        boolean isHide = false;
        try{
            WebElement containerElement = driver.findElement(bottomSheetContainerSelector);
            isHide = false;
        }
        catch(Exception err){
            isHide = true;
        }
        Assertions.assertEquals(true,isHide);
    }

    public String clickFirstItemAccount(){
        wait.until(ExpectedConditions.presenceOfElementLocated(containerListItemBottomSheetSelector));
        WebElement firstItemContainer = driver.findElement(containerListItemBottomSheetSelector)
                .findElements(AppiumBy.className("android.view.ViewGroup"))
                .get(0);

        String title = firstItemContainer.findElement(listDetailTitleSelector).getText();
        String amount = firstItemContainer.findElement(listDetailAmountSelector).getText();
        firstItemContainer.click();
        return title+"|"+amount;
    }

}
