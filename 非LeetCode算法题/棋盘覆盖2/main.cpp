#include <iostream>

using namespace std;
int board[8][8] = {0};
int title = 0;
//r1,c1��ʾ�������Ͻǵ����꣬r2,c2��ʾ�������ӵ�����
void Chess_Board(int r1,int c1,int r2,int c2,int len)
{
    if(len==1) return ;
    int num = ++title;
    int l = len / 2;
    //���Ͻ�
    if(r2<r1+l&&c2<c1+l)
    {
        Chess_Board(r1,c1,r2,c2,l);
    }
    else
    {
        board[r1+l-1][c1+l-1] = num;
        Chess_Board(r1,c1,r1+l-1,c1+l-1,l);
    }
    //���Ͻ�
    if(r2<r1+l&&c2>=c1+l)
    {
        Chess_Board(r1,c1+l,r2,c2,l);
    }
    else
    {
        board[r1+l-1][c1+l] = num;
        Chess_Board(r1,c1+l,r1+l-1,c1+l,l);
    }
    //���½�
    if(r2>=r1+l&&c2<c1+l)
    {
        Chess_Board(r1+l,c1,r2,c2,l);
    }
    else
    {
        board[r1+l][c1+l-1] = num;
        Chess_Board(r1+l,c1,r1+l,c1+l-1,l);
    }
    //���½�
    if(r2>=r1+l&&c2>=c1+l)
    {
        Chess_Board(r1+l,c1+l,r2,c2,l);
    }
    else
    {
        board[r1+l][c1+l] = num;
        Chess_Board(r1+l,c1+l,r1+l,c1+l,l);
    }

}
void show_board(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(board[i][j]>=10)
            {
                cout<<board[i][j]<<" ";
            }
            else
            {
                cout<<board[i][j]<<"  ";
            }
        }
        cout<<endl;
    }
}
int main()
{
    int n,r,c;
    while(cin>>n>>r>>c)
    {
        Chess_Board(0,0,r,c,8);
        show_board(n);
    }

}
