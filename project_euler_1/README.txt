Project Euler Problem 1: 

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

*********************************************************************
Setting up:

1.) Install Maven.
$ > sudo apt install maven

2.) Change directory to project_euler_1.

3.) Build package with Maven.
$ > mvn -X package

4.) Run the program with the name of the main class, in this case
    the main class is com.markortleb.projecteuler1.ProjectEuler1.
$ > java -cp ./target/project-euler-1-1.0.0.jar com.markortleb.projecteuler1.ProjectEuler1