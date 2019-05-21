#include <bits/stdc++.h>

using namespace std;
void Swap(int list[],int q,int p)
{
    int temp = list[q];
    list[q] = list[p];
    list[p] = temp;
}
void Perm(int list[],int k,int m)
{
    if(k==m)
    {
        for(int i=0;i<m;i++)
        {
            cout<<list[i];
        }
        cout<<endl;
        return ;
    }
    for(int i=k;i<m;i++)
    {
        Swap(list,i,k);
        Perm(list,k+1,m);
        Swap(list,i,k);
    }
}
int main()
{
    int list[] = {1,2};
    int len = sizeof(list)/sizeof(list[0]);
    Perm(list,0,len);
}
