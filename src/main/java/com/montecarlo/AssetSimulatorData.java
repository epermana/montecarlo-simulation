package com.montecarlo;

import java.math.BigDecimal;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * represent a state of each iteration in simualtion
 * 
 * @author edwin permana
 *
 */
public class AssetSimulatorData {

	private NormalDistribution normalDistribution;
	private DescriptiveStatistics stats;

	/**
	 * 
	 * @param mean
	 * @param standardDeviation
	 */
	public AssetSimulatorData(double mean, double standardDeviation) {

		this.normalDistribution = new NormalDistribution(mean,
				standardDeviation);

		this.stats = new DescriptiveStatistics();
	}

	public double getPercentile(double n) {
		return this.stats.getPercentile(n);
	}

	public double nextSampleReturn() {
		return this.normalDistribution.sample();
	}

	public void saveSimulationResult(BigDecimal simResult) {
		this.stats.addValue(simResult.doubleValue());
	}
}