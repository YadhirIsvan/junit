 javac -d out Calculator.java
 javac -d out -cp out:junit-platform-console-standalone-1.11.3.jar CalculatorTest.java
 java -jar junit-platform-console-standalone-1.11.3.jar --class-path out --scan-class-path


