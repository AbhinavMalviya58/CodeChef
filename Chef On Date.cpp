#include<iostream>
#include<conio.h>
using namespace std;
main()
{
    int i;
    cin>>i;
    while(i--)
    {
        int X,Y,Z;
        cin>>X>>Y>>Z;
        for(int k = 2; k <= 100; k++){
            if(X%k !=0&&Y%k !=0&&Z%k !=0){
                cout<< k << endl;
                break;
            }
        }
    }
    getch();
}
