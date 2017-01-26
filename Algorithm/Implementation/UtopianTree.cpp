/*
* HACKER RANK -> ALGORITHM -> IMPLEMENTATION
* Utopian Tree Problem 
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        cin >> n;
        int height = 1;
        for (int i = 0; i < n; i++)
        {
            height = i % 2 == 0 ? height*2 : height + 1;
        }
        cout<<height<<endl;
    }
    return 0;
}
