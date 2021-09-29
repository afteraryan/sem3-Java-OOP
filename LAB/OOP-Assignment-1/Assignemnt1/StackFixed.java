public class StackFixed implements Interface1
{
        private int stak1[ ];
        private int tos;
        StackFixed(int size)
        {
                stak1=new int[size];
                tos=-1;
        }
        public void push(int item)
        {
                if(tos==stak1.length-1)
                {
                        System.out.println("Stack Overflow!!");
                        int testing[ ]=new int[stak1.length * 2];
                        for(int i=0;i<stak1.length;i++)
                                testing[i]=stak1[i];
                        stak1=testing;
                        stak1[++tos]=item;
                }
                else
                        stak1[++tos]=item;
        }
        public int pop()
        {
                if(tos<0)
                {
                        System.out.println("Stack Underflow!!");
                        return 0;
                }
                else
                        return stak1[tos--];
        }
}