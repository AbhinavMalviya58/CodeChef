#include <stdio.h>

int main(void) {
	int i;
	scanf("%d",&i);
	while(i--)
	{
	    	int R1 , R2, R3;
	    	scanf("%d,%d,%d",&R1,&R2,&R3);
	    if((R1+R2)<R3 || (R1+R3)<R2 || (R2+R3)<R1)
	    {
	        printf("Yes");
	    }
	    else
	    printf("No");
	    }
	return 0;
}
