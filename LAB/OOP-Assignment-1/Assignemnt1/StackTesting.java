class StackTesting
{
        public static void main(String args[ ])
        {
                StackFixed f=new StackFixed(3);
                DynamicStack d=new DynamicStack(5);
                Interface1 mystk;
                for(int i=0;i<3;i++)
                        f.push(i);
                System.out.println("Fixed length Contents are: ");
                for(int i=0;i<3;i++)
                        System.out.println(f.pop());
                for(int i=0;i<7;i++)
                        d.push(i);
                System.out.println("Dynamic length Contents are:");
                for(int i=0;i<7;i++)
                        System.out.println(d.pop());
                mystk=f;
                for(int i=0;i<3;i++)
                        mystk.push(i);
                System.out.println("Fixed length Contents using interface reference: ");
                for(int i=0;i<3;i++)
                        System.out.println(mystk.pop());
                mystk=d;
                for(int i=0;i<7;i++)
                        mystk.push(i);
                System.out.println("Dynamic length Contents using interface reference: ");
                for(int i=0;i<7;i++)
                        System.out.println(mystk.pop());
        }
}

