#include <iostream>

using namespace std;
int tile = 0;
int board[8][8];  //棋盘的大小一定要满足2^k*2^k

void ChessBoard(int tr,int tc,int dr,int dc,int size){
    if(size==1) return ;    //边界条件
    int s=size/2;
    int t=++tile;
    //判断左上角部分
    if(dr<tr+s&&dc<tc+s){
        //若特殊方块在左上角部分,则继续缩小范围
        ChessBoard(tr,tc,dr,dc,s);
    }else{
        //若特殊方块不在左上角部分,则用t号骨牌覆盖(左上角的相反方向)右下角的部分
        board[tr+s-1][tc+s-1] = t;
        //继续缩小范围 这时候右下角的部分看作新范围内的特殊方块
        ChessBoard(tr,tc,tr+s-1,tc+s-1,s);
    }

    //剩下的以此类推 右上角
    if(dr<tr+s && dc>=tc+s){
        ChessBoard(tr,tc+s,dr,dc,s);
    }else{
        board[tr+s-1][tc+s] = t;
        ChessBoard(tr,tc+s,tr+s-1,tc+s,s);
    }
    //左下角
    if(dr>= tr+s && dc<tc+s){
        ChessBoard(tr+s,tc,dr,dc,s);
    }else{
        board[tr+s][tc+s-1] = t;
        ChessBoard(tr+s,tc,tr+s,tc+s-1,s);
    }
    //右下角
    if(dr>= tr+s && dc>=tc+s){
        ChessBoard(tr+s,tc+s,dr,dc,s);
    }else{
        board[tr+s][tc+s] = t;
        ChessBoard(tr+s,tc+s,tr+s,tc+s,s);
    }

}
int main()
{
    //假设棋盘8*8大小,第2排第3列为特殊方块
    ChessBoard(0,0,1,2,8);
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            cout<<board[i][j]<<" ";
        }
        cout<<endl;
    }
}
