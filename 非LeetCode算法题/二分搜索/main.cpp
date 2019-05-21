#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int Binary_search(int list[],int x)
{
    int left = 0;
    int right = 9;
    while(left<=right)
    {
        int mid = (left+right)/2;
        if(list[mid]==x)
        {
            return mid;
        }
        else if(x>=list[mid])
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
    }
    return -1;
}
int main()
{
    int list[] = {1,3,5,6,7,11,50,59,100};
    int find;
    while(cin>>find)
    {
        int idx = Binary_search(list,find);
        if(idx!=-1)
        {
            cout<<"数字"<<find<<"位于数组的第"<<idx<<"个位置"<<endl;
        }
        else
        {
            cout<<"未找到数字"<<endl;
        }

    }

}
