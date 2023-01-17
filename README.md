# Java_program_to_find_the_prime_numbers-_in_between_a_range
Given Lower and Upper variables.The task is to find the prime numbers in these interval.
Time Complexity:
If you look at the code snippet, as you can see there, a for loop is employed to add primes to the list, it results in O(n).
in that loop, we are again calling another method called isPrime(int n), which checks if a number is prime or not, which results in O(sqrt(N)),as it iterates from 2 to sqrt(N).
So the Time Complexity will be O(N*sqrt(N)).
