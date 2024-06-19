import numpy as np
from sklearn.linear_model import LinearRegression

# Data
arr = [[2, 2, 4, 5, 6, 1, 6, 7, 8]]
target = [[1, 0, 1, 0, 0, 1, 0, 1, 0]]

# Reshape the data
test_arr = np.array(arr).reshape(-1, 1)
test_target = np.array(target).reshape(-1, 1)

# Fit the sklearn LinearRegression model
model = LinearRegression()
model.fit(test_arr, test_target)
predictions = model.predict(test_arr)

# Ordinary Least Squares implementation
def ordinary_least_squares(x, y):
    '''
    Find weights for a hypothesis of the form:
        w*x + b
    using ordinary least squares method where
    w defined as b1, b as b0 by convention.
    
    Params:
        x: training data values
        y: training data labels
    
    Returns:
        hypothesis function
    '''    
    xmean = np.mean(x)
    ymean = np.mean(y)
    
    m = len(x)
    
    numerator = 0
    denominator = 0

    for i in range(m):
        numerator += (x[i] - xmean) * (y[i] - ymean)
        denominator += (x[i] - xmean)**2
    
    b1 = numerator / denominator
    b0 = ymean - (b1 * xmean)
    
    # b1 and b0 are np arrays -> extract their actual values
    b1 = b1[0]
    b0 = b0[0]
    
    return lambda x: b1 * x + b0

# Create OLS model
new_model = ordinary_least_squares(test_arr, test_target)

# Predictions using OLS model
new_pred = new_model(test_arr)

# Print results
print("Sklearn LinearRegression predictions:\n", predictions)
print("Ordinary Least Squares predictions:\n", new_pred)
