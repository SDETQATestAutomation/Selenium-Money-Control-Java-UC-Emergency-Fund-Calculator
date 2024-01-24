package com.iiht.evaluation.automation.functional;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

import com.iiht.evaluation.automation.Activities;
import com.iiht.evaluation.automation.App;
import com.iiht.evaluation.automation.testutils.MasterData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import com.iiht.evaluation.automation.SubActivities;
import org.testng.annotations.*;

import static com.iiht.evaluation.automation.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.automation.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.automation.testutils.TestUtils.yakshaAssert;

public class TestAutomation extends App {

    @Test
    public void test_emergency_fund_calculator_open_submenu() throws IOException {
        boolean testcase_status = true;
        try {
            boolean select_submenu_from_menu_succeed = Activities.select_submenu_from_menu(driver, "Personal Finance", "Emergency Fund Calculator");
            System.out.println("select_submenu_from_menu_succeed " + select_submenu_from_menu_succeed);
            if (!select_submenu_from_menu_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_medical_dental_cost() throws IOException {
        boolean testcase_status = true;
        String medical_dental_cost = MasterData.test_emergency_fund_calculator_master_data.get("medical_dental_cost");
        try {
            boolean emergency_fund_calculator_enter_medical_dental_cost_succeed = Activities.emergency_fund_calculator_enter_medical_dental_cost(driver, medical_dental_cost);
            System.out.println("emergency_fund_calculator_enter_medical_dental_cost_succeed " + emergency_fund_calculator_enter_medical_dental_cost_succeed);
            if (!emergency_fund_calculator_enter_medical_dental_cost_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_vehicle_repair() throws IOException {
        boolean testcase_status = true;
        String vehicle_repair = MasterData.test_emergency_fund_calculator_master_data.get("vehicle_repair");
        try {
            boolean emergency_fund_calculator_enter_vehicle_repair_succeed = Activities.emergency_fund_calculator_enter_vehicle_repair(driver, vehicle_repair);
            System.out.println("emergency_fund_calculator_enter_vehicle_repair_succeed " + emergency_fund_calculator_enter_vehicle_repair_succeed);
            if (!emergency_fund_calculator_enter_vehicle_repair_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_others() throws IOException {
        boolean testcase_status = true;
        String others = MasterData.test_emergency_fund_calculator_master_data.get("others");
        try {
            boolean emergency_fund_calculator_enter_others_succeed = Activities.emergency_fund_calculator_enter_others(driver, others);
            System.out.println("emergency_fund_calculator_enter_others_succeed " + emergency_fund_calculator_enter_others_succeed);
            if (!emergency_fund_calculator_enter_others_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_life_health_insurance_premium() throws IOException {
        boolean testcase_status = true;
        String life_health_insurance_premium = MasterData.test_emergency_fund_calculator_master_data.get("life_health_insurance_premium");
        try {
            boolean emergency_fund_calculator_enter_life_health_insurance_premium_succeed = Activities.emergency_fund_calculator_enter_life_health_insurance_premium(driver, life_health_insurance_premium);
            System.out.println("emergency_fund_calculator_enter_life_health_insurance_premium_succeed " + emergency_fund_calculator_enter_life_health_insurance_premium_succeed);
            if (!emergency_fund_calculator_enter_life_health_insurance_premium_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_home_auto_insurance_premium() throws IOException {
        boolean testcase_status = true;
        String home_auto_insurance_premium = MasterData.test_emergency_fund_calculator_master_data.get("home_auto_insurance_premium");
        try {
            boolean emergency_fund_calculator_enter_home_auto_insurance_premium_succeed = Activities.emergency_fund_calculator_enter_home_auto_insurance_premium(driver, home_auto_insurance_premium);
            System.out.println("emergency_fund_calculator_enter_home_auto_insurance_premium_succeed " + emergency_fund_calculator_enter_home_auto_insurance_premium_succeed);
            if (!emergency_fund_calculator_enter_home_auto_insurance_premium_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_home_loan_other_important_emis() throws IOException {
        boolean testcase_status = true;
        String home_loan_other_important_emis = MasterData.test_emergency_fund_calculator_master_data.get("home_loan_other_important_emis");
        try {
            boolean emergency_fund_calculator_enter_home_loan_other_important_emis_succeed = Activities.emergency_fund_calculator_enter_home_loan_other_important_emis(driver, Double.parseDouble(home_loan_other_important_emis));
            System.out.println("emergency_fund_calculator_enter_home_loan_other_important_emis_succeed " + emergency_fund_calculator_enter_home_loan_other_important_emis_succeed);
            if (!emergency_fund_calculator_enter_home_loan_other_important_emis_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_monthly_living_expenses() throws IOException {
        boolean testcase_status = true;
        String monthly_living_expenses = MasterData.test_emergency_fund_calculator_master_data.get("monthly_living_expenses");
        try {
            boolean emergency_fund_calculator_enter_monthly_living_expenses_succeed = Activities.emergency_fund_calculator_enter_monthly_living_expenses(driver, Double.parseDouble(monthly_living_expenses));
            System.out.println("emergency_fund_calculator_enter_monthly_living_expenses_succeed " + emergency_fund_calculator_enter_monthly_living_expenses_succeed);
            if (!emergency_fund_calculator_enter_monthly_living_expenses_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_enter_month_unemployed() throws IOException {
        boolean testcase_status = true;
        String month_unemployed = MasterData.test_emergency_fund_calculator_master_data.get("month_unemployed");
        try {
            boolean emergency_fund_calculator_enter_month_unemployed_succeed = Activities.emergency_fund_calculator_enter_month_unemployed(driver, Integer.parseInt(month_unemployed));
            System.out.println("emergency_fund_calculator_enter_month_unemployed_succeed " + emergency_fund_calculator_enter_month_unemployed_succeed);
            if (!emergency_fund_calculator_enter_month_unemployed_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_click_calculate_button() throws IOException {
        boolean testcase_status = true;
        try {
            boolean emergency_fund_calculator_click_calculate_button_succeed = Activities.emergency_fund_calculator_click_calculate_button(driver);
            System.out.println("emergency_fund_calculator_click_calculate_button_succeed " + emergency_fund_calculator_click_calculate_button_succeed);
            if (!emergency_fund_calculator_click_calculate_button_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_check_uninsured_unexpected_emergencies_total() throws IOException {
        boolean testcase_status = true;
        String uninsured_unexpected_emergencies_total = MasterData.test_emergency_fund_calculator_master_data.get("uninsured_unexpected_emergencies_total");
        try {
            boolean emergency_fund_calculator_check_uninsured_unexpected_emergencies_total_succeed = Activities.emergency_fund_calculator_check_uninsured_unexpected_emergencies_total(driver, Double.parseDouble(uninsured_unexpected_emergencies_total));
            System.out.println("emergency_fund_calculator_check_uninsured_unexpected_emergencies_total_succeed " + emergency_fund_calculator_check_uninsured_unexpected_emergencies_total_succeed);
            if (!emergency_fund_calculator_check_uninsured_unexpected_emergencies_total_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_check_annual_amount_of_fixed_payments_total() throws IOException {
        boolean testcase_status = true;
        String annual_amount_of_fixed_payments_total = MasterData.test_emergency_fund_calculator_master_data.get("annual_amount_of_fixed_payments_total");
        try {
            boolean emergency_fund_calculator_check_annual_amount_of_fixed_payments_total_succeed = Activities.emergency_fund_calculator_check_annual_amount_of_fixed_payments_total(driver, Double.parseDouble(annual_amount_of_fixed_payments_total));
            System.out.println("emergency_fund_calculator_check_annual_amount_of_fixed_payments_total_succeed " + emergency_fund_calculator_check_annual_amount_of_fixed_payments_total_succeed);
            if (!emergency_fund_calculator_check_annual_amount_of_fixed_payments_total_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss() throws IOException {
        boolean testcase_status = true;
        String build_reserve_to_pay_for_job_loss = MasterData.test_emergency_fund_calculator_master_data.get("build_reserve_to_pay_for_job_loss");
        try {
            boolean emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss_succeed = Activities.emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss(driver, build_reserve_to_pay_for_job_loss);
            System.out.println("emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss_succeed " + emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss_succeed);
            if (!emergency_fund_calculator_check_build_reserve_to_pay_for_job_loss_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_emergency_fund_calculator_check_result() throws IOException {
        boolean testcase_status = true;
        String final_result = MasterData.test_emergency_fund_calculator_master_data.get("final_result");
        try {
            boolean emergency_fund_calculator_check_result_succeed = Activities.emergency_fund_calculator_check_result(driver, final_result);
            System.out.println("emergency_fund_calculator_check_result_succeed " + emergency_fund_calculator_check_result_succeed);
            if (!emergency_fund_calculator_check_result_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
//           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }


}

