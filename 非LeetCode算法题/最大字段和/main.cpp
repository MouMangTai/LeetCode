#include <iostream>

using namespace std;
int maxSum(int n,int *a){
    int w = 0;
    int max = 0;
    for(int i=0;i<n;i++){
        w+=a[i];
        if(w>max) max = w;
        if(w<0) w=0;
    }
    return max;
}
int main()
{
    int a[] = {-2,11,-4,13,-5,-2};
    int n = 6;
    cout<<maxSum(n,a);
}
