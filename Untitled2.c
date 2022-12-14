#include <stdio.h>

int main(void) {
	  int T ;

	 scanf("%d",&T);
	 while(T--)
	 {
	     int x,y,z,w;
	     scanf("%d %d %d %d",&w,&x,&y,&z);
	     if((w+y*z)>x)
	     printf("overflow\n");
	     else if((w+y*z)==x)
	     printf("Filled\n");
	     else
	     printf("Unfilled\n");

	 }
	return 0;
}

