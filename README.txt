Spring app to showcase basic algorithms.

Note: This is a work in Progress

Execute Sample on Pivotal Web Service( PWS ) :
 
 https://algorithms-empathic-wolverine.cfapps.io/arithmetic?firstValue=100&secondValue=5&operator=multiply
 https://algorithms-empathic-wolverine.cfapps.io/fibonacciseries?resultCount=7
 https://algorithms-empathic-wolverine.cfapps.io/max?firstValue=100&secondValue=5
 https://algorithms-empathic-wolverine.cfapps.io/geometricseries?firstValue=3&secondValue=2&resultCount=7

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
    
    
 

