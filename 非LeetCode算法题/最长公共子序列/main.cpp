#include <iostream>

using namespace std;



int main()
{
    string s1 = "absc";
    string s2 = "bs";
    int n = s1.length()+1;
    int m = s2.length()+1;
    int b[n][m] = {0};
    int c[n][m] = {0};
    for(int i=0;i<n;i++) {b[i][0]=0;c[i][0]=0;}
    for(int i=0;i<m;i++) {b[0][i]=0;c[0][i]=0;}
    for(int i=1;i<n;i++){
        for(int j=1;j<m;j++){
            if(s1[i-1]==s2[j-1]){
                b[i][j] = b[i-1][j-1]+1;
                c[i][j] = 1;
            }else if(b[i-1][j]>=b[i][j-1]){
                b[i][j] = b[i-1][j];
                c[i][j] = 2;
            }else{
                b[i][j] = b[i][j-1];
                c[i][j] = 3;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cout<<b[i][j];
        }
        cout<<endl;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cout<<c[i][j];
        }
        cout<<endl;
    }
    int i=n-1;
    int j=m-1;
    while(c[i][j]!=0){
        if(c[i][j]==1){
            cout<<s1[i-1];
            i--;
            j--;
        }else if(c[i][j]==2){
            i--;
        }else{
            j--;
        }
    }
}
