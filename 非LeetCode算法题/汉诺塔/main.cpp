#include <iostream>

using namespace std;
void Hanoi(int n,int a,int b,int c)
{
    if(n>0)
    {
        Hanoi(n-1,a,c,b);
        cout<<"Բ��"<<a<<"�ƶ���"<<b<<endl;
        Hanoi(n-1,c,b,a);
    }
}
int main()
{
    Hanoi(3,1,2,3);
}
