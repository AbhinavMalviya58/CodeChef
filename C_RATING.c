#include <stdio.h>

int main(void) {
	// your code goes here
	int i;
	scanf("%d",&i);
	while(i--)
	{
	    int y,x;
	    scanf("%d%d",&y,&x);
	    if(((x-y)%8)==0)
	        printf("%d\n",(x-y)/8);
	   else
	        printf("%d\n",((x-y)/8)+1);
	}
	return 0;
}

