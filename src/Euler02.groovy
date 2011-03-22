/**
 * Created by IntelliJ IDEA.User: Chris
  PROBLEM :
  Each new term in the Fibonacci sequence is generated by adding the previous two terms.
  By starting with 1 and 2, the first 10 terms will be:
  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  By considering the terms in the Fibonacci sequence whose values do not exceed four million,
  find the sum of the even-valued terms.
 */

int total = 0
int x = 1
int y = 1
int next = 0

while(x < 4000000)
{
  next = x + y
  if(next%2==0)
  {
    print("$next ")
    total = total+next
  }
  y = x
  x = next
}

println total
