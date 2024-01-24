package com.iiht.evaluation.automation.testutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterData {
	public static final Map<String, String> test_success_login_master_data = new HashMap<>();
	public static final Map<String, String> test_failure_login_master_data = new HashMap<>();
	public static final Map<String, String> test_fixed_deposit_calculator_master_data = new HashMap<>();
	public static final Map<String, String> test_emergency_fund_calculator_master_data = new HashMap<>();
	
	static {
		test_success_login_master_data.put("email","prashant.ranjan.qa@gmail.com");
		test_success_login_master_data.put("password","igetup@7AM");

		/* **********************************/
		test_failure_login_master_data.put("email","prashant.ranjan.qa@gmail.commmmm");
		test_failure_login_master_data.put("password","igetup@7AMmmmmmm");
		test_failure_login_master_data.put("error_message","Invalid User Id/EmailID or Password. Please try again.");

		/* **********************************/
		test_fixed_deposit_calculator_master_data.put("investment_amount","2000000");
		test_fixed_deposit_calculator_master_data.put("investment_period","14");
		test_fixed_deposit_calculator_master_data.put("rate_of_return","12");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_monthly","Monthly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_quaterly","Quaterly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_half_yearly","Half Yearly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_yearly","Yearly");
		test_fixed_deposit_calculator_master_data.put("tax_rate","2000000");
		test_fixed_deposit_calculator_master_data.put("total_payment","2,000,000.00");
		test_fixed_deposit_calculator_master_data.put("total_interest","8,641,939.64");
		test_fixed_deposit_calculator_master_data.put("total_corpus","10,641,939.64");
		test_fixed_deposit_calculator_master_data.put("post_tax_amount","9,293,797.05");

		/* **********************************/
		test_emergency_fund_calculator_master_data.put("medical_dental_cost","2000000");
		test_emergency_fund_calculator_master_data.put("vehicle_repair","2000000");
		test_emergency_fund_calculator_master_data.put("others","2000000");
		test_emergency_fund_calculator_master_data.put("life_health_insurance_premium","20000");
		test_emergency_fund_calculator_master_data.put("home_auto_insurance_premium","20000");
		test_emergency_fund_calculator_master_data.put("home_loan_other_important_emis","2000");
		test_emergency_fund_calculator_master_data.put("monthly_living_expenses","2000000");
		test_emergency_fund_calculator_master_data.put("month_unemployed","12");
		test_emergency_fund_calculator_master_data.put("uninsured_unexpected_emergencies_total","12000");
		test_emergency_fund_calculator_master_data.put("annual_amount_of_fixed_payments_total","12000");
		test_emergency_fund_calculator_master_data.put("build_reserve_to_pay_for_job_loss","12000");
		test_emergency_fund_calculator_master_data.put("final_result","12000");
	}
}
