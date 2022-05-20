#include<stdio.h>
int i,j,n,a[20][20],visited[10],count=0;
void dfs(int v)
{
int w;
count++;
visited[v]=count;
for(w=0;w<n;w++)
if(visited[w]==0 && a[v][w]==1)
dfs(w);
printf("%d\n",v);
}
void main()
{
printf("enter the number of vertices");
scanf("%d",&n);
printf("enter adjacency matrix:");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
scanf("%d", &a[i][j]);
printf("Adjacency matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
printf("%d",a[i][j]);
}
printf("\n");
}
for(i=0;i<n;i++)
visited[i]=0;
dfs(0);
if(count==n)
printf("graph is connected");
else
printf("graph is disconnected");
}

