// Não esquecer de mudar o nome do arquivo e o nome da classe.

// import java.util.*;

// public class DIO{

//     public static void main(String[] args)  {

//         var input = new Scanner(System.in);

//         while(input.hasNext()){
//             int entrada = input.nextInt();
//             int S = entrada;

//             if (entrada % 2 == 0) {
//               S = S - entrada;
//               System.out.println(S);

//             } else {
//                 S = S % 2;
//                 System.out.println(S);

//               }
//               // for(int i=0; i < S; i++){
//               //   System.out.println(i);
//               // }
//               // S = S -1;
//               // 

//         }
//     }
// }

import java.io.IOException;
import java.util.Scanner;

public class quem_pagara_a_conta {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int C = leitor.nextInt();
    int N, X;
    for (int i = 0; i < C; i++) {
      N = leitor.nextInt();
      X = 0;
      for (int j = 0; j < N; j++) {
        if (j % 2 == 0)
          X++;
        else
          X--;
      }
      System.out.println(X);
    }
  }
}