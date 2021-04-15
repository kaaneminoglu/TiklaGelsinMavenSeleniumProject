package com.tiklagelsin.scenarios;

import com.tiklagelsin.base.BaseClass;
import com.tiklagelsin.modules.SearchModule;
import org.testng.annotations.Test;

public class CheckSearch extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void checkSearch() throws Exception {
        SearchModule searchModule = new SearchModule();
        searchModule.searchText("Hamburger");
    }
}
