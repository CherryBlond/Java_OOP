package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.common.FooterBlock;
import ru.geekbrains.main.site.at.common.HeaderBlock;
import ru.geekbrains.main.site.at.common.NavigationBlock;
import ru.geekbrains.main.site.at.common.SearchBlock;

public class CommonPage {
    private HeaderBlock headerBlock;
    private FooterBlock footerBlock;
    private NavigationBlock navigationBlock;
    private SearchBlock searchBlock;

    public CommonPage(WebDriver driver) {
        this.navigationBlock = PageFactory.initElements(driver, NavigationBlock.class);
        this.searchBlock = PageFactory.initElements(driver, SearchBlock.class);
        this.headerBlock = PageFactory.initElements(driver, HeaderBlock.class);
        this.footerBlock = PageFactory.initElements(driver, FooterBlock.class);
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    public FooterBlock getFooterBlock() {
        return footerBlock;
    }

    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }

    public SearchBlock getSearchBlock() {
        return searchBlock;
    }
}
