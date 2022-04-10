def solution(x):
    # Your code here
    msgltr = ''
    for i in range(len(x)):
        if x[i] >= 'a' and x[i] <='z':
            msgltr = chr(ord('z')-ord(x[i])+ord('a'))
            print(msgltr,end='')
        else:
            print(x[i],end='')
