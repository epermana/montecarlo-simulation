/**
 * 
 */
package com.montecarlo;

import java.math.BigDecimal;

/**
 * @author edwin permana Asset prices encapsulate mean and std initial
 *         investment and asset name
 */
public class Asset {
	private double simulationMedian;
	private double simulationTop10;
	private double simulationBottom10;

	private double mean;// mean return
	private double standardDeviation;

	private String assetName;
	private BigDecimal initialInvestment;

	/**
	 * 
	 */
	public Asset() {
		// Defult Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @param initialInvestment
	 * @param mean
	 * @param standardDeviation
	 */
	public Asset(String name, BigDecimal initialInvestment, double mean,
			double standardDeviation) {
		this.assetName = name;
		this.initialInvestment = initialInvestment;
		this.mean = mean;
		this.standardDeviation = standardDeviation;
	}

	public BigDecimal getInitialInvestment() {
		return initialInvestment;
	}

	public double getMean() {
		return mean;
	}

	public String getName() {
		return assetName;
	}

	public double getSimulationBottom10() {
		return simulationBottom10;
	}

	public double getSimulationMedian() {
		return simulationMedian;
	}

	public double getSimulationTop10() {
		return simulationTop10;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setInitialInvestment(BigDecimal initialInvestment) {
		this.initialInvestment = initialInvestment;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public void setName(String name) {
		this.assetName = name;
	}

	public void setSimulationBottom10(double simulationBottom10) {
		this.simulationBottom10 = simulationBottom10;
	}

	public void setSimulationMedian(double d) {
		this.simulationMedian = d;
	}

	public void setSimulationTop10(double simulationTop10) {
		this.simulationTop10 = simulationTop10;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	@Override
	public String toString() {
		return "Asset [name=" + assetName + ", initialInvestment="
				+ initialInvestment + ", returnMean=" + mean
				+ ", riskInStandradDeviation=" + standardDeviation
				+ ", simulationMedian=" + simulationMedian + ", 10% Best="
				+ simulationTop10 + ", 10% Worst=" + simulationBottom10 + "]";
	}

}
