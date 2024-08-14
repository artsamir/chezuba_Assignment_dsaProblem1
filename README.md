# Increment Large Integer by one
## Problem Description
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.
## Example : 
### Input
```
digits = [1, 2, 3];
```
### Output
```
[1, 2, 4]
```
The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4]. 

## Approach
1. **Start from last digit:** start from last digit of the array if the last digit less than `9`, increment this digit and return the updated value
2. if the last digit `9`, set it to `0` and move next digit to left
