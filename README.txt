Spring app to showcase basic algorithms.

Note: This is a work in Progress

Sample Usage: http://localhost:8080/arithmetic?firstValue=15&secondValue=5&operator=add"
              

To compile:

   mvn clean
   mvn install

Verification:

   ls -al manifest.yml
   ls -al target/algorithms*.jar


To Deploy to PCF:

    cf push

Validate the app is deployed and running:

    cf apps | grep -i algorithms
    
    
 Execute Sample on PWS:
 
 https://algorithms-empathic-wolverine.cfapps.io/arithmetic?firstValue=100&secondValue=5&operator=multiply
 https://algorithms-empathic-wolverine.cfapps.io/fibonaccisequence

