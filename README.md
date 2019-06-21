# HungarianAlgorithm
A Java implementation of the Kuhn–Munkres assignment algorithm:
https://en.wikipedia.org/wiki/Hungarian_algorithm

## Example
### Input 
|  | 0 | 1 | 2 | 3|
|----|----|----|----|----|
|**0** |70 | 40 | 20 | 55|
|**1**|65 | 60 | 45 | 90| 
|**2**|30 | 45 | 50 | 75|
|**3**|25 | 30 | 55 | 40|

### Output
```
Col0 => Row2 (30)
Col1 => Row1 (60)
Col2 => Row0 (20)
Col3 => Row3 (40)

Total: 150
```

## Usage
```
int[][] dataMatrix = {
  {70,  40,   20,   55},
  {65,  60,   45,   90},
  {30,  45,   50,   75},
  {25,  30,   55,   40}
};  

HungarianAlgorithm ha = new HungarianAlgorithm(dataMatrix);
int[][] assignment = ha.findOptimalAssignment();
```
The results are returned as a two-dimensional array where each subarray represents an assignment. The first element of each assignment represents the column number, and the second element represents the row number of the ```dataMatrix```.
```
{{0, 2}, {1, 1}, {2, 0}, {3, 3}}
```
