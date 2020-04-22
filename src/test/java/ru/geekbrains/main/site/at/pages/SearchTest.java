package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.Page;
import ru.geekbrains.main.site.at.SearchPage;
import ru.geekbrains.main.site.at.pages.base.BaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {
    @Test
    public void checkPage() {
        chromeDriver.get("https://geekbrains.ru/career");

        SearchPage searchPage = PageFactory.initElements(chromeDriver, Page.class).getSearchPage();
        searchPage.searchPhrase("java");
        searchPage.checkSearchResultBlocks();

        assertThat(searchPage.getSearchBlockCount("professions"), greaterThanOrEqualTo(2));
        assertThat(searchPage.getSearchBlockCount("courses"), greaterThan(15));
        assertThat(searchPage.getSearchBlockCount("webinars"), greaterThan(180));
        assertThat(searchPage.getSearchBlockCount("webinars"), lessThan(300));
        assertThat(searchPage.getSearchBlockCount("blogs"), greaterThan(300));
        assertThat(searchPage.getSearchBlockCount("forums"), not(equalTo(350)));
        assertThat(searchPage.getSearchBlockCount("tests"), not(equalTo(0)));
    }
}
