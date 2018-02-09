# TripleT

Kyle Tau, Angela Tom, Simon Tsui
\n APCS2 pd2
\n Lab 00 -- But What Does the Data Say?
\n 2018-02-09

# Hypothesis
Our method achieves O(n) runtime by searching from the top right to the bottom left.

# Background
The matrixSearch starts off at the top right corner. At this starting point, the orientation is clear: if the target is greater than the current number, go down, and if the target is less than the current number, go left. 

# Experimental Methodology
We will test the runtime of sizes ranging from 500 to 7000, going up in increments of 100.
For each size we will run 100,000 tests and find the average (in milliseconds) of the 100,000 trials.
After graphing the values, with matrix size on the horizontal axis and runtime on the vertical axis, we will evaluate if our method does achieve O(n) runtime. 
Each trial will be searching for the same value but throughout the different sizes we will increase the value as the size increases.

# Results

# Conclusions
As we increase the size of the matrix, the runtime does increase. 
