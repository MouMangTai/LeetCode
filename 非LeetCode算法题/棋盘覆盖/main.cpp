#include <iostream>

using namespace std;
int tile = 0;
int board[8][8];  //���̵Ĵ�Сһ��Ҫ����2^k*2^k

void ChessBoard(int tr,int tc,int dr,int dc,int size){
    if(size==1) return ;    //�߽�����
    int s=size/2;
    int t=++tile;
    //�ж����Ͻǲ���
    if(dr<tr+s&&dc<tc+s){
        //�����ⷽ�������Ͻǲ���,�������С��Χ
        ChessBoard(tr,tc,dr,dc,s);
    }else{
        //�����ⷽ�鲻�����Ͻǲ���,����t�Ź��Ƹ���(���Ͻǵ��෴����)���½ǵĲ���
        board[tr+s-1][tc+s-1] = t;
        //������С��Χ ��ʱ�����½ǵĲ��ֿ����·�Χ�ڵ����ⷽ��
        ChessBoard(tr,tc,tr+s-1,tc+s-1,s);
    }

    //ʣ�µ��Դ����� ���Ͻ�
    if(dr<tr+s && dc>=tc+s){
        ChessBoard(tr,tc+s,dr,dc,s);
    }else{
        board[tr+s-1][tc+s] = t;
        ChessBoard(tr,tc+s,tr+s-1,tc+s,s);
    }
    //���½�
    if(dr>= tr+s && dc<tc+s){
        ChessBoard(tr+s,tc,dr,dc,s);
    }else{
        board[tr+s][tc+s-1] = t;
        ChessBoard(tr+s,tc,tr+s,tc+s-1,s);
    }
    //���½�
    if(dr>= tr+s && dc>=tc+s){
        ChessBoard(tr+s,tc+s,dr,dc,s);
    }else{
        board[tr+s][tc+s] = t;
        ChessBoard(tr+s,tc+s,tr+s,tc+s,s);
    }

}
int main()
{
    //��������8*8��С,��2�ŵ�3��Ϊ���ⷽ��
    ChessBoard(0,0,1,2,8);
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            cout<<board[i][j]<<" ";
        }
        cout<<endl;
    }
}
