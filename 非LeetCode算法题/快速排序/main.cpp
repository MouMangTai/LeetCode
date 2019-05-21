#include <iostream>

using namespace std;
void Swap(int list[],int p,int q)
{
    int temp = list[p];
    list[p] = list[q];
    list[q] = temp;
}
int Sort(int list[],int left,int right)
{
    int i = left;
    int j = right;
    int x = list[i];
    while(true)
    {
        while(list[++i]<x&&i<right);
        while(list[--j]>x) ;
        if(i>=j) break;
        Swap(list,i,j);
    }
    list[left] = list[j];
    list[j] = x;
    return j;

}
void fast_sort(int list[],int left,int right)
{
    if(left<right)
    {
        int mid = Sort(list,left,right);
        fast_sort(list,left,mid-1);
        fast_sort(list,mid+1,right);
    }
}
void show(int list[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<list[i]<<" ";
    }
    cout<<endl;
}
int main()
{
    int n;
    while(cin>>n)
    {
        int list[n];
        for(int i=0;i<n;i++)
        {
            cin>>list[i];
        }
        fast_sort(list,0,n);
        show(list,n);
    }
}
