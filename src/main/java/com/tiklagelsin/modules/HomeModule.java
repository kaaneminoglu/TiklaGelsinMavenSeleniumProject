package com.tiklagelsin.modules;

import com.tiklagelsin.base.BaseClass;
import com.tiklagelsin.pages.HomePage;

public class HomeModule extends BaseClass {

    public void restoranCheck(String[] menuNameList) throws Exception {
        HomePage homePage = new HomePage();
        homePage.restoranCheck(menuNameList);
    }
}
