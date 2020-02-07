#include <stdio.h>
int main_random(void) {
	srand(time(NULL));
	int num = rand() % 100 + 1; // 1~100
	printf("숫자 : %d\n", num);
	int answer = 0; //정답
	int chance = 5; //기회
	while (chance > 0) {
		printf("남은 기회 %d 번\n", chance--);
		printf("숫자를 맞춰보세요(1~100): ");
		scanf_s("%d", &answer);

		if (answer > num) {
			printf("Down\n\n");
		}
		else if (answer < num) {
			printf("Up \n\n");
		}
		else if (answer == num) {
			printf("정답입니다 \n\n");
			break;
		}
		else {
			printf("알수업는오류 \n");
		}
	}
	return 0;
}