# "Making Sense" Coding Automation Challenge by Jose Carabajal
The following is a Java + Selenium + TestNG test execution. Its purpose is to follow the guidelines from the code challenge:


## Code Challenge Requirements:
# You can use any approach that you consider to solve the following problem. Language must be Java,JS or C#

	- A person wants to go to buy a car on www.mercadolibre.com.
	- He is not sure about what model to buy and, for this reason, he wants to search All cars that have a price below $2.000.000.  
	- But he has some considerations to take into account: 
		- The car must be located in Cordoba,
		- The product list must be shown from lowest to highest price. 
	- In addition, he wants to know the number of results available.


## Steps to Reproduce
- Navigate to "https://www.mercadolibre.com" .
- Click on the "Argentina" location.
- Search for the word "Autos".
- Filter the search by clicking on the Range of the cars with the price < $2.000.000.
- Filter the searcg by clicking on the Province with the value "Cordoba".
- Re order the results list by clicking on the "Ordenar por: Menor precio" value.
- Validate and show the number of results obtained by the search.


## Maven Dependencies
- [selenium-java] - https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59) - (Selenium automates browsers.)
- [webdrivermanager] - https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/3.8.1 -  (Automated driver management and Docker builder for Selenium WebDriver)
- [testng] -  https://mvnrepository.com/artifact/org.testng/testng/7.1.0 - (Testing framework for Java)

 

# Additional Notes
- I created the test framework on the amount of time I had on the weekend.
- I don't use chromedriver because with the bonigarcia dependency it is not necessary.
- To run the test you have run the file suite.xml inside the path src/test/resources
