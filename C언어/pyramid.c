#include <stdio.h>
// 피라미드를 쌓아라 
int main_pyramid(void) {
	int floor;
	printf("몇층으로 쌓겠느냐?");
	scanf_s("%d", &floor);

	/*

ssssss*
sssss***
ssss*****
sss*******
ss*********
s***********
*************

		 */

	for (int i = 0; i < floor; i++) {      // 몇줄?
		for (int j = 0; j < floor +i; j++) {  // 줄마다 출력될 범위?
			if (j < floor - i-1)
				printf(" ");
			else
				printf("*");
		}
		printf("\n");
	}
	return 0;
}