package com.tiklagelsin.scenarios;

import com.tiklagelsin.base.BaseClass;
import com.tiklagelsin.modules.HomeModule;
import org.testng.annotations.Test;

public class CheckRestoranList extends BaseClass {
    @Test(groups = {"RegressionGroup"})
    public void checkRestoran() throws Exception {
        String[] menuNameList = {"burger-king", "popeyes", "arbys", "sbarro", "usta-donerci", "usta-pideci", "amasya-et-urunleri"};
        HomeModule homeModule = new HomeModule();
        homeModule.restoranCheck(menuNameList);
    }
}
