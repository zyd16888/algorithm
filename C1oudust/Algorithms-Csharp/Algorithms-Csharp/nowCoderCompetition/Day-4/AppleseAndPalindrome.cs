/*
 * https://ac.nowcoder.com/acm/contest/330/I
 */
using System;

namespace Algorithms_Csharp.nowCoderCompetition.Day_4
{
    class AppleseAndPalindrome
    {
        public static void Run()
        {
            //bool can = false;
            string a = Console.ReadLine();
            if (IsPalindrome(a))
            {
                Console.WriteLine("Yes");
            }
            else
            {
                for (int i = 0; i < a.Length / 2; i++)
                {
                    for (int j = a.Length - 1; j > 0; j--)
                    {
                        if (a[i] != a[j])
                        {
                            if (IsPalindrome(a.Replace(a[i].ToString(), "")) || IsPalindrome(a.Replace(a[j].ToString(), "")))
                            {
                                Console.WriteLine("Yes");
                               // can = true;
                                return;
                            }
                        }
                    }
                }

                Console.WriteLine("No");
            }
           // char[] ch = a.ToCharArray();
            
            //            for (int i = 0; i <= a.Length; i++)
            //            {
            //                for (int j = 0; j < ch.Length; j++)
            //                {
            //                    string temp = a.Insert(i, ch[j].ToString());
            //                    if (IsPalindrome(temp))
            //                    {
            //                        can = true;
            //                        break;
            //                    }
            //                }
            //                if (can) break;
            //            }

//            if (can)
//                Console.WriteLine("Yes");
//            else
//                Console.WriteLine("No");
        }

        public static bool IsPalindrome(string s)
        {
            char[] temp = s.ToCharArray();
            Array.Reverse(temp);
            return s == new string(temp);
        }
    }
}
