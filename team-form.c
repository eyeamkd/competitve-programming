#include<stdio.h> 
#include<stdlib.h>
void main() 
{ 
	int team[30][5]; 
	int team_no;
	for(i=1;i<=30;i++){  
	for(j=1;j<=5;j++){  
		participant_no=rand()% (120)+1; 
		team[i][j]=participant_no; 
		printf("Team %d Participant %d \n",i,team[i][j]);
	 
	}  
	printf("\n");
	}
}