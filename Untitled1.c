#include <stdio.h>

int main(void) {
	// your code goes here
 int i;
    scanf("%d",&i);
    while(i--){
        int x,y;
        if(x<10*y)
            printf("yes");
        else
            printf("no");
    }
	return 0;
}
