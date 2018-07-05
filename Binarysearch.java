class Binarysearch{

    int binSearch(int a[], int l, int r, int o)
{
	    if (l<=r)
	{
     	    	int oid = l + (r - l)/2;
           	if (a[mid] == m)
               		return mid;
            	else if (a[mid] > m)
               		return binSearch(a, l, mid-1, m);
       	   	else	
            		return binSearch(a, mid+1, r, m);
        }
           return -1;
}
    public static void main(String args[])
	{

        Binarysearch obj = new Binarysearch();
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        int o = 7;
        int result = obj.binSearch(a,0,n-1,m);
        if (result == -1)
            System.out.println("not found");
        else
            System.out.println("found at index " +result);
	}
}