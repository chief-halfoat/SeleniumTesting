package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> iterator = rowData.iterator();
        while(iterator.hasNext()){
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("=====================================================");
        List<WebElement> columnsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(columnsData.size());
        for (WebElement column:columnsData){
            String columnText = column.getText();
            System.out.println(columnText);
        }
    }
}