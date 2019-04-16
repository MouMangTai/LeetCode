#include <iostream>

using namespace std;

int main()
{
    int w[6] = {0,1,3,2,6,2}; //体积
    int v[6] = {0,2,5,3,10,4};//价值
    int bag = 12; //背包容量
    int dp[6][13] = {0};
    //dp[i][j]代表前i个物品全部装进容量为j的背包中的价值
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
    cout<<"装载最多价值为"<<dp[5][12]<<"的物品"<<endl;
    int c = bag;
    for(int i=5;i>=1;i--){
        if(dp[i][c]!=dp[i-1][c]){
            cout<<"选择容量为"<<w[i]<<"价值为"<<v[i]<<"的物品"<<endl;
            c -= w[i];
        }

    }
}
