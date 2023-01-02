
int main(void)
{
    int i;
    scanf("%d",&i);
    while(i--)
    {
        int Charlir,Bob,Alice;
        scanf("%d%d%d",&Charlir,&Bob,&Alice);

        if(Charlir>Bob)
        {
            printf("Charlir");
        }
        else if(Bob>Charlir)
        {
            printf("Bob");
        }
        else{
            printf("Alice");
        }
    }

}