package main


import "fmt"

func maxIntSlice(someList []int) int{
	var maxVal = someList[0];
	for _, val := range someList {
		if val > maxVal {
			maxVal = val;
		}
	}

	return maxVal;
}


func trialDivision(n int) []int{
	var s []int;
	var f = 2;
	for n > 1{
		if n % f == 0{
			s = append(s, f)
			n = n / f;
		} else { 
			f = f + 1;
		}
	}

	return s;
}


func main(){
	var n = 600851475143;
	var factors []int;

	factors = trialDivision(n)
	fmt.Println(maxIntSlice(factors))
}