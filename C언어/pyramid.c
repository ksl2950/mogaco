#include <stdio.h>
// �Ƕ�̵带 �׾ƶ� 
int main_pyramid(void) {
	int floor;
	printf("�������� �װڴ���?");
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

	for (int i = 0; i < floor; i++) {      // ����?
		for (int j = 0; j < floor +i; j++) {  // �ٸ��� ��µ� ����?
			if (j < floor - i-1)
				printf(" ");
			else
				printf("*");
		}
		printf("\n");
	}
	return 0;
}