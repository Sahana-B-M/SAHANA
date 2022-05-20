#include<stdio.h>
int a[10][10],visited[10],n,count=0,topo[10];
int k=0;
void dfs(int v)
{
	int w;
	count++;
	visited[v]=count;
	for(w=0;w<n;w++)
		if(visited[w]==0 && a[v][w]==1)
			dfs(w);
	topo[k++]=v;
	printf("%d\t",v);
}
void main()
{
	int i,j;
	printf("enter the number of vertices\n");
	scanf("%d",&n);
	printf("enter the matrix\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
			scanf("%d",&a[i][j]);
	}
	printf("Adjacency matrix is \n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	printf("------DFS----------\n");
	for(i=0;i<n;i++)
		visited[i]=0;
	for(i=0;i<n;i++)
		if(visited[i]==0)
			dfs(i);
	if(count==n)
	{
		printf("\ngraph is connected\n");
	}else
		printf("\ngraph is not connecting\n");
	printf("\n Topological sorting is:\n");
	for(i=n-1;i>=0;i--)
		printf("%d\t",topo[i]);
}

