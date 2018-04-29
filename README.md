# montecarlo-simulation
montecarlo-simulation finance

to run test run
mvn clena install 
then
 mvn test on AssetSimulatorTest

copy and paste requirement

Modern Portfolio Theory says that it is not enough to look at the expected risk and return of one particular stock. By investing in more than one stock, an investor can reap the benefits of diversification- chief among them, a reduction in the riskiness of the portfolio. 
 
A Real Time implementation of Modern Portfolio Theory is to build an optimal asset allocation of domestic stocks & bonds, international stock and bonds, alternatives and cash. Combining the risk & return of each asset class and correlations across them – we come up with the risk and return of the overall portfolio.  Two portfolios were created, one being extremely Conservative and one being Aggressive.
 

 
We would now like to compare their performance against each other. We would like to know that if a user with $100,000 invested their money in either of them, how would the returns compare over the next 20 years. We would like to test their performance by using forward-looking Monte Carlo Simulations.
 
Monte Carlo Simulation:
This is a statistical technique that uses pseudo-random uniform variables for a given statistical distribution based on past risk (SD) and return (mean) to predict outcomes over future time periods. Based on iterative evaluation of each random future value, we project the portfolio future value over 20 years. We would like to run 10,000 simulations of projecting 20 year value and come up with the following:
 
Assumptions
1.     We would like to use a random number generator to ensure Gaussian distribution of random numbers that are generated.
 
2.     20th Year future value should be inflation adjusted at the rate of 3.5% each year. Ie. Year 1 value of 103.5 is equivalent to 100 at Year 0.
 
Solution Needed
 
1.     Portfolio Inflation Adjusted Values from Simulation
 

 
Description
10% Best Case               	:   90th Percentile value among the 10,000 simulations
10% Worst Case            	:  10th Percentile value among the 10,000 simulations.

Hint
To test your results create an account with Personal Capital, add a manual portfolio and go to Investment Checkup and compare your results.

ow do I add Manual Investments Holdings?

If the financial institution  for your investment account is currently not supported by Personal Capital, you can create a Manual Investment Holding within the application, so it can be included in your Net Worth and other calculations. You can add this account using either our web application or mobile applications. The steps for each are below.  
Web Application (www.personalcapital.com) 1. Log in to Personal Capital 2. Click on the 'Link' (+) icon on the sidebar. 3. Click on 'Add Portfolio' 4. Enter the account name and the number (optional) 5. Click 'Continue' to save and add the account  iPhone /iPad Application: 1. Log in to the application. 2. Go to Net Worth page. 2. Scroll down to 'Link More Accounts' and select it 3. Click on 'More'>'Manual Investment Holdings' 4. Enter the account name and the number (optional) 5. Click 'Continue' to save and add the account  Android 1. Log in to the application. 2. Select "Menu" button or action bar. 3. Select "Link Account" 4. Click on 'More'>'Manual Investment Holdings' 5. Enter the account name and the number (optional) 6. Click 'Continue' to save and add the account  Once you have added the manual investment account please add your holdings by following the steps below after selecting the account in your Accounts panel:  1. Select 'Add Holding' 2. Type in the ticker or CUSIP 3. Click Search and when the right one shows up (check description), click Done



Delivery
Please create a public github repo and checkin your code there.

