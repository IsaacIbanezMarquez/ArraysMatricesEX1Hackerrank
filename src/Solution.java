

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:

// Array invers:

/* Donat un array d'entrada, imprimeix els nombres de forma inversa.

Input Format

N tamany array N nombres enters per l'array.

Constraints

No n'hi ha.

Output Format

S'imprimeixen els nombres de l'array de forma inversa.

Sample Input 0

5
10 20 30 40 50
Sample Output 0

50 40 30 20 10

 */

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int grosor = sc.nextInt();
        int []Lista = new int [grosor];

        for (int i = 0; i < grosor; i++)
        {
            Lista[i] = sc.nextInt();
        }

        for (int i = grosor-1; i >= 0; i--)
        {
            System.out.print(Lista[i] + " ");
        }




    }
}
