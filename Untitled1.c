#include <stdio.h>

int main(void) {
	// your code goes here
	int w,x,y,z,k,t;
	scanf("%d",&t);

	for(int i=0;i<t;i++){

	   	 scanf("%d %d %d %d",&w,&x,&y,&z);
	   	 k=w+(y*z);
	     if(k>x){
	        printf("OVERFLOW\n");
	    }
	    else if (k<x){
	        printf("UNFILLED\n");
	    }
	    else {
	        printf("FILLED\n");
	    }
	}
	return 0;
}
