#include <iostream>

using namespace std;

int main()
{
    int w[6] = {0,1,3,2,6,2}; //���
    int v[6] = {0,2,5,3,10,4};//��ֵ
    int bag = 12; //��������
    int dp[6][13] = {0};
    //dp[i][j]����ǰi����Ʒȫ��װ������Ϊj�ı����еļ�ֵ
    for(int i=1;i<6;i++){
        for(int j=0;j<=12;j++){
            if(j<w[i]){
                dp[i][j] = dp[i-1][j];
            }else{
                dp[i][j] = max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
            }
            cout<<dp[i][j];
            cout<<" ";
        }
        cout<<endl;
    }
    cout<<"װ������ֵΪ"<<dp[5][12]<<"����Ʒ"<<endl;
    int c = bag;
    for(int i=5;i>=1;i--){
        if(dp[i][c]!=dp[i-1][c]){
            cout<<"ѡ������Ϊ"<<w[i]<<"��ֵΪ"<<v[i]<<"����Ʒ"<<endl;
            c -= w[i];
        }

    }
}
