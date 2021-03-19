def generateParenthesis(n):
        x = []
        solve("",n,n,x)
        print(x)
        return x

def solve(op,o,c,ans):
    if o==0:
        op = op + ")"*c
        ans.append(op)
        print(op)
        return
    if o==c:
        op1 = op + "("
        solve(op1,o-1,c,ans)
        return
    if o>c:#optional
        return
    op1 = op+"("
    op2 = op+")"
    
    solve(op1,o-1,c,ans)
    solve(op2,o,c-1,ans)
    
        
generateParenthesis(3)