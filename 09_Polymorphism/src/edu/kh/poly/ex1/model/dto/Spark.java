package edu.kh.poly.ex1.model.dto;

public class Spark extends Car { // 경차
	private double disconutOffer;
	
	public Spark() {}

	public Spark(String engine, String fuel, int wheel, double disconutOffer) {
		super(engine, fuel, wheel);
		this.disconutOffer = disconutOffer;
	}

	public double getDisconutOffer() {
		return disconutOffer;
	}

	public void setDisconutOffer(double disconutOffer) {
		this.disconutOffer = disconutOffer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + disconutOffer;
	}
}
