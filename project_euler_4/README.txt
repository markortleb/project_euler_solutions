Project Euler Problem 4:

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

********************************************************************
Setting up:

1.) Install Scala
$ > sudo apt install Scala

2.) Install Scala Build Tool (sbt):
$ > echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
$ > sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
$ > sudo apt-get update
$ > sudo apt-get install sbt

3.) Compile Program with sbt
$ > cd {project euler 4 base dir}
$ > sbt compile

4.) Run Program
$ > sbt run