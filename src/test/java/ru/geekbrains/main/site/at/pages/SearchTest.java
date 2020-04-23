package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.CommonPage;
import ru.geekbrains.main.site.at.common.SearchBlock;
import ru.geekbrains.main.site.at.pages.base.BaseTest;

import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {
    @Test
    @Description(value = "Проверка поиска и отображения блоков")
    public void checkPage() {
        chromeDriver.get("https://geekbrains.ru/career");

        SearchBlock searchBlock = PageFactory.initElements(chromeDriver, CommonPage.class).getSearchBlock();
        searchBlock.searchPhrase("java");
        searchBlock.checkSearchResultBlocks();

        searchBlock.checkSearchBlockCount("Профессии", greaterThanOrEqualTo(2));
        searchBlock.checkSearchBlockCount("Курсы", greaterThan(15));
        searchBlock.checkSearchBlockCount("Вебинары", greaterThan(180));
        searchBlock.checkSearchBlockCount("Вебинары", lessThan(300));
        searchBlock.checkSearchBlockCount("Блоги", greaterThan(300));
        searchBlock.checkSearchBlockCount("Форум", not(equalTo(350)));
        searchBlock.checkSearchBlockCount("Тесты", not(equalTo(0)));
    }
}
