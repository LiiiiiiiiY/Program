#include <stdio.h>


int main(){
    int arr[4] = {85, 12, 163, 134};
    int newArr[sizeof(arr)/sizeof(arr[0])];
    if(arr[0]<arr[1]){
        if(arr[0]<arr[2]){
            if(arr[0]<arr[3])newArr[0]=arr[0];
            else newArr[0]=arr[3];
        }
    }
    return 0;
}