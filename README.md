# ex1

<h3>Miriam Binyamines</h3>
<h5>Email: miriamman@edu.hac.ac.il</h5>

<h3>Salomon Demma</h3>
<h5>Email: dennasa@edu.hac.ac.ill</h5>

<h1>Counter Program </h1>
<a href='doc/index.html'>API documentation</a>

This program contains two classes, Counter and CounterMax, both of which represent a simple counter with increment functionality.

<h3> Counter Class </h3>
The Counter class has the following methods:

Counter() - constructor that initializes the counter to 0. <br>
print() - prints out the current value of the counter.<br>
increment(int num) - increases the value of the counter by num if num is a positive integer.<br>
getCounter() - getter that returns the current value of the counter.<br>
toString() - overrides the toString() method to return a string representation of the counter value.<br>


<h3> CounterMax Class </h3>
The CounterMax class is a subclass of Counter and has the following methods:<br>

CounterMax(int max) - constructor that initializes the counter to 0 and sets the maximum value of the counter to max.<br>
increment(int num) - overrides the increment(int num) method to throw a RuntimeException if incrementing the counter by 
num would cause it to exceed its maximum value.<br>

<h3>Main Class</h3>
The Main class contains a simple program that reads in a specified number of integers from the user and increments a
Counter object by the sum of those integers. It also contains a readNumber(Scanner scanner) method that reads a positive
integer from the user using the specified Scanner object.<br>

<h3>MainMax Class</h3>
The MainMax class contains a similar program to Main that uses a CounterMax object instead of a Counter object.
It reads in a specified number of integers from the user and increments a CounterMax object by the sum of those integers. 
If incrementing the CounterMax object by an integer would cause it to exceed its maximum value, a RuntimeException is
thrown and the program stops. It also contains a readNumber(Scanner scanner, String msg) method that reads a positive
integer from the user using the specified Scanner object and a custom message.<br>

