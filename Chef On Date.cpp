#include<iostream>
#include<conio.h>
using namespace std;
main()
{
    int i;
    cin>>i;
    while(i--)
    {
        float X,Y;
        cin>>X>>Y;
        if(X>=Y)
            cout<<"Yes"<<endl;
        else
            cout<<"No"<<endl;
    }
    getch();
}
