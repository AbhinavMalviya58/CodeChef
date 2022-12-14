#include <stdio.h>

int main(void) {
	// your code goes here
	int i;
	scanf("%d",&i);
	while(i--)
    {
        int x,y,a;
        scanf("%d%d%d",&x,&y,&a);
        if(a>=x&&y>a)
            printf("yes\n");
        else
            printf("no\n");
    }

}
