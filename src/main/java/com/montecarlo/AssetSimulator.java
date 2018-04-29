package com.montecarlo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Simulate Monte Carlo Simulation for asset prices
 *
 */
public class AssetSimulator {
	public static void main(String[] args) {
		System.out.println(" Monte Carlo Simulation for asset prices");
	}

	private Map<Asset, AssetSimulatorData> currentstate;
	private Asset[] assets;
	private double inflation = 0.035;// 3.5%
	private long simulations = 10000;// 10000 simulations
	private int periods = 20;// on 20 periods

	public AssetSimulator(Asset... assets) {
		this.assets = assets;

		// current state of AssetData
		this.currentstate = new HashMap<Asset, AssetSimulatorData>(
				assets.length);

		for (Asset p : assets) {
			AssetSimulatorData assetsimData = new AssetSimulatorData(
					p.getMean(), p.getStandardDeviation());
			currentstate.put(p, assetsimData);
		}

	}

	// getter and setter auto Gen

	public double getInflation() {
		return inflation;
	}

	public int getPeriods() {
		return periods;
	}

	public long getSimulations() {
		return simulations;
	}

	public void setInflation(double inflation) {
		this.inflation = inflation;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public void setSimulations(long simulations) {
		this.simulations = simulations;
	}

	/**
	 * simulate the monte carlo
	 */
	public void simulate() {
		for (int i = 0; i < simulations; i++) {
			for (Asset asset : assets) {
				BigDecimal simResult = asset.getInitialInvestment();// starting
				// value
				for (int j = 0; j < periods; j++) {
					// take the next random sample of Asset price
					double r = currentstate.get(asset).nextSampleReturn();

					// next simualtion value
					simResult = new BigDecimal((1 + r)).multiply(simResult);

					// calculate inflation
					simResult = new BigDecimal((1 - inflation))
							.multiply(simResult);
				}
				// save result
				currentstate.get(asset).saveSimulationResult(simResult);
			}
		}

		// SET assets value at end of simulation
		for (Asset asset : assets) {
			AssetSimulatorData assetsimData = currentstate.get(asset);
			asset.setSimulationMedian(assetsimData.getPercentile(50));
			asset.setSimulationBottom10(assetsimData.getPercentile(10));
			asset.setSimulationTop10(assetsimData.getPercentile(90));
		}
	}

}
