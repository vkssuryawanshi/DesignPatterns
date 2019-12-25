package com.factory.factory;

import com.factory.beans.CommercialPlan;
import com.factory.beans.DomesticPlan;
import com.factory.beans.InstitutionalPlan;
import com.factory.beans.Plan;

public class GetPlanFactory 
{
	public Plan getPlan(PlanType type)
	{
		if(type == null)
			return null;
		
		if(type.equals(PlanType.COMMERTIAL))
			return new CommercialPlan();
		
		if(type.equals(PlanType.DOMESTIC))
			return new DomesticPlan();
		
		if(type.equals(PlanType.INSTITUTIONAL))
			return new InstitutionalPlan();
		
		return null;
	}

}
