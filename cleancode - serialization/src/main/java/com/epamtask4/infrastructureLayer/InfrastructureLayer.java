package com.epamtask4.infrastructureLayer;
import com.epamtask4.cleancode.ToCalculateInterest;
public class InfrastructureLayer {
	
	public void userOperation1(){
	
		for(int i=0;i<ToCalculateInterest.listForInterestDetails.size();i++) {
			System.out.format("%s",ToCalculateInterest.listForInterestDetails.get(i)+"\n");
		}
	}
	public void userOperation2(){
		
		for(int i=0;i<ToCalculateInterest.listForHousecostDetails.size();i++) {
			System.out.format("%s",ToCalculateInterest.listForHousecostDetails.get(i)+"\n");
		}
	}
}
