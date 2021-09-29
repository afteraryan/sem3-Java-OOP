class DynamicStack implements Interface1
{
        private int stack1[ ];
        private int tos;
        DynamicStack(int size)
        {
                stack1=new int[size];
                tos=-1;
        }
        public void push(int item)
        {
                if(tos==stack1.length-1)
                {
                        System.out.println("Stack Overflows.");
                        int testing[ ]=new int[stack1.length * 2];
                        for(int i=0;i<stack1.length;i++)
                                testing[i]=stack1[i];
                        stack1=testing;
                        stack1[++tos]=item;
                }
                else
                        stack1[++tos]=item;
        }
        public int pop()
        {
                if(tos<0)
                {
                        System.out.println("Stack Underflows.");
                        return 0;
                }
                else
                        return stack1[tos--];
        }
}