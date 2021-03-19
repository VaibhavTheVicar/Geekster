def solve(sword,soldiers,k):
    if(len(soldiers)==1):
        return
    dead = (sword+k-1) % len(soldiers)
    del soldiers[dead]
    solve(dead,soldiers,k)


n = int(input())
k = int(input())
s = [i+1 for i in range(n)]
solve(0,s,k)
print(s[0])
