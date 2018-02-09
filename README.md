# TripleT

Kyle Tau, Angela Tom, Simon Tsui

# Hypothesis
By initially searching the diagonal and then checking the sides along the diagonal, the runtime of matrixSearch will be O(n) even for its worst case scenarios.

# Background



# Expiremental Methodology
The matrixSearch searches by the diagonal going from the top left of the matrix to the bottom right of the matrix. Along the diagonal, it tests if the next number down the diagonal is larger than the target number. If this is the case, matrixSearch will fan out checking the top and bottom halves for the number, going left/down for a higher number and going up/right for a smaller in the top and bottom halves respectively. Initially going along the diagonal makes the search more efficient and cuts down on the run time.
