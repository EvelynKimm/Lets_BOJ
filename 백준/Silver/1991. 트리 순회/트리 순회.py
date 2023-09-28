import sys

N = int(sys.stdin.readline().strip())
tree = {}

for n in range(N):
    root, left, right = sys.stdin.readline().strip().split()
    tree[root] = [left, right]

def preorder(root):      #전위 순회는 루트 -> 왼쪽자식 -> 오른쪽자식
    if root != '.':
        print(root, end='') #루트 
        preorder(tree[root][0])    #left -> right가 새로운 root가 됨
        preorder(tree[root][1])    #right -> left가 새로운 root가 됨

def inorder(root):      #중위 순회는 왼쪽자식 -> 루트 -> 오른쪽자식
    if root != '.':
        inorder(tree[root][0])
        print(root, end='')
        inorder(tree[root][1])

def postorder(root):        #후위 순회는 왼쪽자식 -> 오른쪽자식 -> 루트
    if root != '.':
        postorder(tree[root][0])
        postorder(tree[root][1])
        print(root, end='')

preorder('A')
print()
inorder('A')
print()
postorder('A')