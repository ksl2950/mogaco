#include <stdio.h>
int main_random(void) {
	srand(time(NULL));
	int num = rand() % 100 + 1; // 1~100
	printf("���� : %d\n", num);
	int answer = 0; //����
	int chance = 5; //��ȸ
	while (chance > 0) {
		printf("���� ��ȸ %d ��\n", chance--);
		printf("���ڸ� ���纸����(1~100): ");
		scanf_s("%d", &answer);

		if (answer > num) {
			printf("Down\n\n");
		}
		else if (answer < num) {
			printf("Up \n\n");
		}
		else if (answer == num) {
			printf("�����Դϴ� \n\n");
			break;
		}
		else {
			printf("�˼����¿��� \n");
		}
	}
	return 0;
}