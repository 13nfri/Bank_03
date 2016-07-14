package sample.bankapp;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class FixedDepositDetails {
	@NotNull
	private long id;
	@Min(1000)
	@Max(5000000)
	private float depositAmount;
	@Min(6)
	private int tenure;
	@NotNull
	@Size(min=5, max=100)
	private String email;
	
	public long getId() {
		return id;
	}
	public float getDepositAmount() {
		return depositAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public String getEmail() {
		return email;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public FixedDepositDetails(long id, float depositAmount, int tenure, String email) {
		super();
		this.id = id;
		this.depositAmount = depositAmount;
		this.tenure = tenure;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return id+depositAmount+tenure+email;
	}
	
}
