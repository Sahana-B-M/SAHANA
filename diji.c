#include<stdio.h>
int p[10],d[10],n,src;
int cost[10][10];

void diji(int src){
	int i,j,min,u,v;
	int s[10];
	for(i=0;i<n;i++){
		d[i]=cost[src][i];
		s[i]=0;
		p[i]=src;
	}
	s[src]=1;
	for(i=1;i<n;i++){
		min=99;
		u=-1;  
		for(j=0;j<n;j++){     
			if(s[j]==0){             
				if(d[j]<min){         
					min=d[j];	
					u=j;
				}
			}
		}
		if(u==-1)	
			return;
		s[u]=1;    
		for(v=0;v<n;v++){    
			if(s[v]==0){  
				if(d[u]+cost[u][v]<d[v]){			
					d[v]=d[u]+cost[u][v];
					p[v]=u;
				}
			}
		}
	

	}
}

void print_path(int src,int dest){
	int i;
	i=dest;
	while(i!=src){
		printf("%d<--",i);
		i=p[i];
	}
	printf("%d = %d",i,d[dest]);
}



void main(){
	int i,j;
	printf("Enter the number of vertices:\t");
	scanf("%d",&n);
	printf("Enter the cost adjacency matrix:\n");
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			scanf("%d",&cost[i][j]);
	printf("The Cost adjacency matrix is:\n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++)
			printf("\t%d",cost[i][j]);
		printf("\n");
	}
	printf("Enter the source vertex:\t");
	scanf("%d",&src);
	diji(src);
	printf("The shortest distance is:\n");
	for(i=0;i<n;i++){
		if(d[i]!=99)
			print_path(src,i);	
		else
			printf("is not reachable from %d --> %d",src,i);
		printf("\n");
	}
}


