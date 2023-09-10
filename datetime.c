#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main() {
	time_t t = time(NULL);
	struct tm tm = *localtime(&t);
	time_t tempo_atual;
	struct tm *tempo_info;
	time(&tempo_atual);
	tempo_info = localtime(&tempo_atual);
	tempo_info = localtime(&t);
	int hora = tempo_info->tm_hour;
	int minutos = tempo_info->tm_min;
	int segundos = tempo_info->tm_sec;
	
	printf("Date e hora de hoje: %02d/%02d/%d	%02d:%02d:%02d\n", tm.tm_mday, tm.tm_mon + 1, tm.tm_year + 1900, hora, minutos, segundos);
	return 0;
}