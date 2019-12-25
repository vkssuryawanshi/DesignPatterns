package com.factory.test;

import com.factory.beans.Plan;
import com.factory.factory.GetPlanFactory;
import com.factory.factory.PlanType;

public class TestFactory {

	public static void main(String[] args)
	{
		GetPlanFactory factory = new GetPlanFactory();
		
		Plan comm = factory.getPlan(PlanType.COMMERTIAL);
		comm.getRate();
		System.out.println(comm.calculateBill(10));
		
		Plan dom = factory.getPlan(PlanType.DOMESTIC);
		dom.getRate();
		System.out.println(dom.calculateBill(10));
		
		Plan inst = factory.getPlan(PlanType.INSTITUTIONAL);
		inst.getRate();
		System.out.println(inst.calculateBill(10));
	}

}
