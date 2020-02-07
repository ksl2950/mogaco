#include <stdio.h>
#include <time.h>

//����Ⱑ 6������ �ִ�
//�̵��� ���Ͽ� ��� �ִµ� �縷�̿���
//�縷�� �ʹ� ������, �ʹ� �����ؼ� ���� ���� ���� ������ �ؿ�
//���� �� �����ϱ� ���� �������� ���׿� ���� �༭ ����⸦ ����ּ���
//������ �ð��� �������� ���� Ŀ���� ���߿��� �ȳ�

int level;
int arrayFish[6]; // 0-5
int * cursor; // arrayFish�� ����Ű�鼭 �������� ���� ���� ����

void initData();
void printFishes();
void decreasedwater(long elaposedTime);
int checkFishAlive();

int main_pointer_Project(void) {

	long startTime = 0; // ���� ���۽ð�
	long totalElaposedTime = 0; // �� ��� �ð�
	long prevElaposedTime = 0; //���� ��� �ð� (�ֱٿ� ���� �� �ð� ����)

	int num; // ��� ���׿� ���� �� ������, ����� �Է�
	initData(); // ������ �ʱ�ȭ

	cursor = arrayFish; //cursor[0] , cursor[1] .. 

	startTime = clock(); //����ð��� millisecong(1000���� 1��) ������ ��ȯ 
	while (1)
	{
		printFishes();
		printf("��� ���׿� ���� �ֽðھ��?");
		scanf_s("%d", &num);

		//�Է°� üũ 
		if (num < 1 || num> 6)
		{
			printf("\n�Է°��� �߸��Ǿ����ϴ�\n");
			continue;
		}
		//�� ����ð�

		totalElaposedTime = (clock() - startTime) / CLOCKS_PER_SEC;
		printf("�� ��� �ð� ; %d ��\n", totalElaposedTime);
		
		// ���� �� �� �ð� ( ���������� �� �� �ð�) ���ķ� �帥 �ð�
		prevElaposedTime = totalElaposedTime - prevElaposedTime;
		printf("�ֱٰ���ð� : %ld �� \n", prevElaposedTime);

		//������ ���� ����(����)
		decreasedwater(prevElaposedTime);

		//����ڰ� �Է��� ���׿� ���� �ش�. 
		//1. ������ ���� 0�̸�? ���� ���� �ʴ´�. 
		if (cursor[num - 1] <= 0) {
			printf("%d �� ������ �̹� �׾����ϴ� ���� �����ʽ��ϴ�\n", num);
		}
		//2. ������ ���� 0�� �ƴѰ��? ���� �ش� ! 100�� ���� �ʴ��� üũ 
		else if (cursor[num - 1] + 1 <= 100)
		{
			//���� �ش�
			printf("%d �� ���׿� ���� �ݴϴ� \n\n", num);
			cursor[num - 1] += 1; //cursor[num-1] = cursor[num-1] +1 
		}

		//������ �� ���� Ȯ��(�������� 20�ʸ��� �ѹ��� ����)
		if (totalElaposedTime / 20 > level - 1)
		{
			level++; // level1 ->level2 
			printf("�� ������!! ���� %d �������� %d������ ���׷��̵� ***\n\n", level - 1, level);

			//�������� 5
			if (level == 5)
			{
				printf("\n\n �����մϴ�. �ְ����� �޼��Ͽ����ϴ�. ������ �����մϴ�.");
				exit(0);
			}
		}

		//��� ����Ⱑ �׾����� Ȯ�� 
		if (checkFishAlive() == 0)
		{
			printf("��� ����Ⱑ �Ф�\n");
		}
		else {
			printf("����Ⱑ ���� ����־��\n");
		}
		prevElaposedTime = totalElaposedTime;

		// 10 �� -> 15�� (5�� : prevElapesedTime -> 15��) -> 25��(10��..?)
	}

	return 0;
}

void initData() {
	level = 1; // ���ӷ��� 1-5
	for (int i = 0; i < 6; i++) {
		arrayFish[i] = 100; //������ �� ����(0-100)
	}
}

void printFishes() {
	printf("%3d�� %3d�� %3d�� %3d�� %3d�� %3d��\n", 1, 2, 3, 4, 5, 6);
	for (int i = 0; i < 6; i++)
	{
		printf(" %4d ", arrayFish[i]); // 6ĭ
	}
	printf("\n\n");
}

void decreasedwater(long elaposedTime) {
	for (int i = 0; i < 6; i++) 
	{
		arrayFish[i] -= (level * 3 * (int)elaposedTime);// 3: ���̵� ������ ���� ��
		if (arrayFish[i] < 0)
		{
			arrayFish[i] = 0;
		}
	}
}

int checkFishAlive()
{
	for (int i = 0; i < 6; i++) {
		if (arrayFish[i] > 0)
			return 1; //�� True
	}
	return 0;
}