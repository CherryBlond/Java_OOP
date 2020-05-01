package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.courses.FilterBlock;
import ru.geekbrains.main.site.at.courses.HeaderTabsBlock;
import ru.geekbrains.main.site.at.courses.ResultBlock;

public class CoursesPage extends CommonPage {
    private FilterBlock filterBlock;
    private HeaderTabsBlock headerTabsBlock;
    private ResultBlock resultBlock;

    public CoursesPage(WebDriver driver) {
        super(driver);
        this.filterBlock = PageFactory.initElements(driver, FilterBlock.class);
        this.headerTabsBlock = PageFactory.initElements(driver, HeaderTabsBlock.class);
        this.resultBlock = PageFactory.initElements(driver, ResultBlock.class);
    }

    public FilterBlock getFilterBlock() {
        return filterBlock;
    }

    public HeaderTabsBlock getHeaderTabsBlock() {
        return headerTabsBlock;
    }

    public ResultBlock getResultBlock() {
        return resultBlock;
    }
}
