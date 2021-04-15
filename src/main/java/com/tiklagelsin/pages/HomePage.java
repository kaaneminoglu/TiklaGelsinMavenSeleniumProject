package com.tiklagelsin.pages;

import com.tiklagelsin.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BaseClass {

    private final By lstRestoran = By.xpath(".//*[@id='gatsby-focus-wrapper']/div[1]/div/div[2]/div/div[3]/div/a");
    private final By btnSearch = By.xpath(".//*[@id='gatsby-focus-wrapper']/div[1]/div/div[2]/nav/div[1]/button");
    private final By txtSearch = By.xpath(".//*[@id='gatsby-focus-wrapper']/div[1]/div/div[2]/nav/div[1]/input");
    private final By lstSearchDropDown = By.xpath(".//*[@id='gatsby-focus-wrapper']/div[1]/div/div[2]/nav/div[1]/div/div/a");

    public void restoranCheck(String[] restoranNameList) throws Exception {
        try {
            List<WebElement> restoranList = driver.findElements(lstRestoran);
            for (int i = 0; i < restoranList.size(); i++) {
                String restoranPage = "https://www.tiklagelsin.com/" + restoranNameList[i];
                if (!restoranList.get(i).getAttribute("href").contains(restoranPage)) {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void searchText(String searchText) throws Exception {
        try {
            driver.findElement(btnSearch).click();
            driver.findElement(txtSearch).sendKeys(searchText);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void checkSearchResult(String searchText) throws Exception {
        try {
            List<WebElement> searchList = driver.findElements(lstSearchDropDown);
            if (searchList.size() == 0) {
                throw new Exception();
            }
            for (WebElement webElement : searchList) {
                String searchListItem = webElement.findElement(By.xpath("./a/span")).getText();
                if (!searchListItem.contains(searchText)) {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}