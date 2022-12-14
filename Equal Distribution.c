#include <stdio.h>

int main(void) {
	// your code goes here
	  int i;
    scanf("%d",&i);
    while(i--)
    {
        int a,b,c;
        scanf("%d%d",&a,&b);
        if((a+b)%2==0)
            printf("yes\n");
        else
            printf("no\n");
    }
	return 0;
}

