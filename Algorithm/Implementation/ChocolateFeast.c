/*
* HACKER RANK -> ALGORITHM -> IMPLEMENTATION
* Chocolate Feast
*/

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int chocolateFromWrapper(int, int);

int main(){
    int t; 
    scanf("%d",&t);
    for(int a0 = 0; a0 < t; a0++){
        int n; 
        int c; 
        int m; 
        int count = 0;
        scanf("%d %d %d",&n,&c,&m);
        count = (n/c) + chocolateFromWrapper(n/c, m);
        printf("%d\n", count);
    }
    return 0;
}

int chocolateFromWrapper(int chocolate, int m)
{
    if(chocolate < m)
        return 0;
    return chocolate/m + chocolateFromWrapper(chocolate/m + chocolate%m, m);
}
