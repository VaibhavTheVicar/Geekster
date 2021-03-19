
def NBitBinary(N):
    ans = []
    solve(0,0,N,"",ans)
    return ans
		
def solve(o,z,n,op,ans):
    if z>o:
        return
    
    if n==0:
        ans.append(op)
        return
    
    if o==z:
        op1 = op+'1'
        solve(o+1,z,n-1,op1,ans)
    else: 
        op1 = op+'1'
        op2 = op+'0'
        solve(o+1,z,n-1,op1,ans)
        solve(o,z+1,n-1,op2,ans)

if __name__ == "__main__":
    N = 3
    print(NBitBinary(N))