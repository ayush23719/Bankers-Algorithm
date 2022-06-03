public class Main
{
	public static void main(String[] args) {
	int i=0,avail=3,count=0,temp,k=0;
	int []flag=new int[4];
	int []alloc={5,4,3,2};
	int []req={3,2,4,5};
	int []seq=new int [4];
	
	while(count<4){
	    temp=0;
	    for(i=0;i<4;i++)
	    {
	        if(flag[i]==0)
	        {
	            if(req[i]<alloc[i]+avail)
	            {
	                flag[i]=-1;
	                avail=avail+alloc[i];
	                count++;
	                temp=1;
	                seq[k++]=i+1;
	            }
	        }
	    }
	    if(temp==0)
	    break;
	}
	for(i=0;i<4;i++)
	{
	    if(flag[i]==0)
	    {
	        System.out.println("Not in Safe state process is " );
	        System.out.println(i);
	        return;
	    }
	}
	 System.out.println("System is in Safe state" );
	}
}
