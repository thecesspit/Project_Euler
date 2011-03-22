
/**
 * Date: 3/15/11
 * Time: 10:15 PM

The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
 */

// Set up
start = System.currentTimeMillis()

helper = new eulerTools()

// Target is the number of divisors, x will be triangle number, searcher is the number of iterations
// Divisors is a list of the divisors to measure the size
int target = 500
int s = 1
boolean loop = true
long x = 0
def divisors = []

while(loop)
{
    s = s + 2
    x = s*((s+1)/2)
    if((helper.factorFinder((int) ((s+1)/2)).size() * helper.factorFinder(s).size()) >= target){ loop = false}
}

println helper.factorFinder((int) s*((s+1)/2))
println ("First number with at least $target digits is $x as Triangular #$s")
// End
println ("Elapsed Time = ${(System.currentTimeMillis() - start)/1000} seconds")