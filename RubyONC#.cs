using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RubyonRails
{
    class Ruby
    {
        public string a1 { get; set; }



        public void Print(int n)
        {
            string a = "";
            if (a1 != null)
            {
                a = a1;
            }
            else
            {
                a = "1";
            }
            if(n > 0 )
            {
                Console.WriteLine(a);
                string b = "";
                for(int i = 0; i < n - 1 ; i++ )
                {
                    int count = 1;
                    for (int j = 0; j < a.Length; j++)
                    {
                        if( j != a.Length - 1)
                        {
                            if(a[j] == a[j+1])
                            {
                                count++;
                            }
                            else
                            {
                                b = b + count + a[j];
                                count = 1;
                            }
                        }
                        
                        else
                        {
                            b = b + count + a[j];
                        }
                    }
                    a = b;
                    Console.WriteLine(b);
                    b = "";
                }
            }

        }

    }
        
    class Program
    {
        static void Main(string[] args)
        {
            Ruby r = new Ruby();
            Console.Write("Enter the first number of sequence: ");
            r.a1 = Console.ReadLine();
            Console.Write("Enter the quantity of sequence: ");
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine("Result: ");

            r.Print(n);

            //Автоматический ТЕСТ. 
            //int x = 10;
            //Ruby r1 = new Ruby();
            //r1.Print(x);

        }
    }
}





