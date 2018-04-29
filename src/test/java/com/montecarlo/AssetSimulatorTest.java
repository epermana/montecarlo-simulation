package com.montecarlo;



import java.math.BigDecimal;

import org.junit.Test;


/**
 * Unit test for simple Asset simulator
 */
public class AssetSimulatorTest 
    
{
   
    @Test
	public void testSimulation(){
		Asset aggressive = new Asset("Aggressive", new BigDecimal(100000), 0.094324, 0.15675);
		Asset conservative = new Asset("Conservative", new BigDecimal(100000), 0.06189, 0.063438);
		
		AssetSimulator assetsimulator = new AssetSimulator(aggressive, conservative);
		assetsimulator.simulate();
		
		System.out.println(aggressive);
		System.out.println(conservative);
	}
}
