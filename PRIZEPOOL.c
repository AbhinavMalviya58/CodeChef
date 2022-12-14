#include <stdio.h>

int main(void) {
	// your code goes here
	int i;
	scanf("%d",&i);
	while(i--)
	{
	    int x,y,S,H;
	    scanf("%d%d",&x,&y);
            S=10*x;
            H=90*y;
        printf("%d \n",S+H);
	}
	return 0;
}


