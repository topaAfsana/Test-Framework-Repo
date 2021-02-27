package Qa.Pages;

import Qa.CucumberRunner.TestRunner;

public class WebUI extends TestRunner {
//FOCUSED DRIVER COMING FROM RUNNER
    //****************************REGISTER PAGES********************************************
    public static HomePageObj HomePage(){ return  new HomePageObj(driver); }
    public static ExpensePageObj ExpensePage(){ return  new ExpensePageObj(driver); }

}
