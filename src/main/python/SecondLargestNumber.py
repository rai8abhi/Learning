if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    winner=0
    runner=0
    for i in arr:
        if i>winner:
            winner=i
    for j in arr:
        if j>runner and j<winner:
            runner=j
    print(runner)


    # maxv = max(arr)
    # print(maxv)
    # secondmax = 0
    # for i in arr:
    #     print(arr[i])
    # #     if i > maxv:
    # #        secondmax = maxv
    # #        maxv = i
    # print(secondmax)
