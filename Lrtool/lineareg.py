array = [[1,2,3],[3,4,5],[4,5,6]]
result = 0
k = 0
for i in range(len(array)):
    for j in range(len(array[i])):
        result += array[i][j]
        k += 1
print(result/k)