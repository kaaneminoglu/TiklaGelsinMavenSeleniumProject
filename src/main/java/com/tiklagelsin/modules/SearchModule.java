package com.tiklagelsin.modules;

import com.tiklagelsin.base.BaseClass;
import com.tiklagelsin.pages.HomePage;

public class SearchModule extends BaseClass {

    public void searchText(String text) throws Exception {
        HomePage homePage = new HomePage();
        homePage.searchText(text);
        homePage.checkSearchResult(text);
    }
}
