public class Main {
    public static void main(String[] args) {
        /* Scanner in = new Scanner(System.in);
  System.out.println("Введите первое число для умножения");
  int a=in.nextInt();
  System.out.println("Введите второе число для умножения");
  int b=in.nextInt();
  System.out.println("Умножить число  " +a + " на число  " +b +"?");
  int c=in.nextInt();
  if (c==(a*b))
  { System.out.println("Молодец, верный ответ!");}
  else
  { System.out.println("Ответ неверный! Верный ответ " +(a*b));}

 }
} калькулятор на умноженіе
  */

  /*
  int mass[] = new int[10];
  mass[0] = 2;
  mass[1] = 9;
  mass[2] = 7;
  mass[3] = 4;
  mass[4] = 9;
  mass[5] = 1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;

  System.out.println("номера в массиве четных значений");

  for (int i = 0; i < 10; i++) {
   if (mass[i] % 2 ==0);
   System.out.print(i + " ");

  }
 }
}

   */
  /*
  int mass[] = new int[10];
  Random random=new Random();

  for (int i = 0; i < 10; i++) {
   mass[i] = random.nextInt(10);
   System.out.print(mass[i] + " ");}
   int b = mass[0];
   mass[0]=mass[9];
   mass[9]=b;
   for (int j = 0; j < 10; j++) {
    mass[j]=random.nextInt(10);
    if (mass[j]  % 2 == 0);
    System.out.print(j +" ");

  }}}
 */
  /*
     int mass[] = new int[10];
    Random random = new Random();
     for (int i = 0; i < 10; i++){
     mass[i] = random.nextInt();
     System.out.print(mass[i] + " ");{
    if (mass[i] % 2 == 0) ;
    System.out.println(i + " ");}
 }
}}
случайный массив из 10 положительных и отрицательных чисел и номера ячеек в массиве
*/
  /*Random random = new Random();
  int [] array = new int[10];
  int sum=0;

  for (int i =1; i < array.length; i++) {
   array[i] = random.nextInt(10);{
   System.out.print(array[i] + " ");
    if (array[i] >0) ;
    sum += array[i];}
  }System.out.println(sum);
  }}
  слечайный массив из 10 цифр и его сумма
*/
  /*
  int mass[] = new int[10];
  mass[0] = 2;
  mass[1] = 9;
  mass[2] = 7;
  mass[3] = 4;
  mass[4] = 9;
  mass[5] = 1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;

  System.out.println("номера в массиве четных значений");

  for (int i = 0; i < 10; i++) {
   if (mass[i] % 2 ==0);
   System.out.print(i + " ");

  }
 }
}
*/
  /*
  int mass[] = new int[10];
  Random random=new Random();

  for (int i = 0; i < 10; i++) {
   mass[i] = random.nextInt(10);
   System.out.print(mass[i] + " ");}
   int b = mass[0];
   mass[0]=mass[9];
   mass[9]=b;
   for (int j = 0; j < 10; j++) {
    mass[j]=random.nextInt(10);
    if (mass[j]  % 2 == 0);
    System.out.print(j +" ");

  }}}
 */
  /*
   Random random=new Random();
   int[] array=new int[10];
   for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array.length; j++) {
     array[i] = random.nextInt(10);
     System.out.print(array[i] + " ");
       }
        System.out.println();
       }
  int sum=0;
  for (int i = 0; i < array.length; i++) {
     for (int j = 0; j < array.length; j++) {
       if (array[i] %2 ==0){
        sum += array[i];
    }
   }
  }
 }
}
матрица 10*10 случайных положительных чисел. Если убрать в первом println array и в кавычки вставить точки - будет 10*10 точек
*/
  /*
    Random random = new Random();
   int [][] array = new int[2][10];

   for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {

           array[i][j] = random.nextInt(10);
           System.out.print(array[i][j] + " ");
        }
         System.out.println();
      }
   int sum = 0;
      for (int i = 0; i < array.length; i++) {
     for (int j = 0; j < array[i].length; j++) {
      if (array[i][j] %2==0){
         sum += array[i][j];
     }
   }System.out.println(sum);
  }
 }
}
выводит из случайного массива сумму положительных чётных числел
*/
  /*
  Random random = new Random();
  int [] array = new int[10];
  for (int i = 0; i < array.length; i++) {
   { array[i] = random.nextInt(10);
    System.out.print(array[i] + " ");}
   }System.out.println();
  int sum = 0;
  for (int i = 0; i < array.length; i++) {
    if (array[i]%2==0){
     sum += array[i];
    }
   }System.out.println(sum);
  }
 }
 выводит из случайного массива сумму чётных чисел
*/
  /*int mass[] = new int[10];
  mass[0] = -2;
  mass[1] = -9;
  mass[2] = 7;
  mass[3] = -4;
  mass[4] = 9;
  mass[5] = -1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;

  for (int i = 0; i < mass.length; i++) {
   {
    System.out.print(mass[i] + " ");}
  }System.out.println();
  int sum = 0;
  for (int i = 0; i < mass.length; i++) {
   if (mass[i]%2==0 && mass[i] >=0){
    sum += mass[i];
   }
  }System.out.println(sum);
 }
}
выводит из заданного массива сумму положительных чётных чисел
*/
  /*Random random = new Random();
  int array[] = new int[10];
  for (int i = 0; i < array.length; i++) {
   {array[i] = random.nextInt(10);
    System.out.print(array[i] + " ");}
  }System.out.println();
  int sum = 0;
  for (int i = 0; i < array.length; i++) {
   if (array[i]%2==0 && array[i] >=0){
    sum += array[i];
   }
  }System.out.println(sum);
 }
}
выводит из случайного массива сумму положительных чётных числел
*/
  /* Random random = new Random();
  int mass[] = new int[10];
  for (int i = 0; i < 10; i++) {mass[i] = random.nextInt();{

    System.out.print(mass[i] + " ");}
  }System.out.println();
  int sum = 0;
  for (int i = 0; i < mass.length; i++) {
   if (mass[i]%2==0 && mass[i] >=0){
    sum += mass[i];
   }
  }System.out.println(sum);
 }
}
вывод в случайном массиве суммы положительных чётных чисел
   */
  /*Random random = new Random();
  int [] array = new int[10];
  for (int i = 0; i < array.length; i++) {
   { array[i] = random.nextInt(10);
    System.out.print(array[i] + " ");}
  }System.out.println();
  int max = array[0];
  for (int i = 0; i < array.length; i++) {
   if (array[i]>max){
    max= array[i];
   }
  }System.out.println(max);
 }
}
вывод случайного массіва і максімального его элемента
*/
  /* Random random = new Random();
  int [] array = new int[10];
  int indMax=0;
  for (int i = 0; i < array.length; i++) {
   { array[i] = random.nextInt(10);
    System.out.print(array[i] + " ");}
  }System.out.println();
  int max = array[0];
  for(int i = 0; i < array.length; i++) {
   if (array[i]>max){
    max= array[i];
    for (int j = 0; j < array.length; j++) {if (max==array[i]) {indMax=i; break;}
    }
   }
  }System.out.println(max);System.out.println("индекс элемента - " +indMax);
 }
}
вывод случайного массіва, максімального его элемента і его номера в массіве
*/
  /* int mass[] = new int[10];
  mass[0] = -2;
  mass[1] = -9;
  mass[2] = 7;
  mass[3] = -4;
  mass[4] = 9;
  mass[5] = -1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;

  for (int i = 0; i < mass.length; i++) {
   {
    System.out.print(mass[i] + " ");}
  }System.out.println();
  int sum = 0;
  double average=0;
  for (int i = 0; i < mass.length; i++) {
   if (mass[i] >=0){
    sum += mass[i];
    average=sum/mass[i];
   }
  }System.out.println(sum);System.out.println(average);
 }
}
вывод заданного массіва, сумма положітельных элементов і іх среднее аріфметіческое
*/
  /*Random random = new Random();
  int mass[] = new int[10];
  int sum=0;
  for (int i = 0; i < 10; i++) {mass[i] = random.nextInt();{

   System.out.print(mass[i] + " ");}
  }System.out.println();
  int sum1 = 0;
  int average=0;
  for (int i = 0; i < mass.length; i++) {
    if (mass[i] >= 0){ sum += mass[i];
    sum1 += 1;
    average=sum/sum1;
   }
  }System.out.println(sum);System.out.println(sum1);System.out.println(average);
 }
}
вывод случайного массіва, сумма положітельных элементов і іх среднее аріфметіческое
*/
 /* Random random = new Random();
  int[] array = new int[10];
  int ind = 0;
  for (int i = 0; i < array.length; i++) {
   {array[i] = random.nextInt(10);
    System.out.print(array[i] + " ");}
  }System.out.println();
  ind = array[0];
  for (int i = 0; i < array.length; i++) {
   if (array[i] % 2 == 0 && array[i]>0) {
    ind = array[i];
    for (int j = 0; j < array.length; j++) {
     if (ind == array[i]) {
      ind = i;
      break;}
    } System.out.print(ind + " ");
   }
  }
 }
}
вывод случайного массива, вывод номеров(індексов) массива где стоят чётные числа
*/
  /*
  int mass[] = new int[10];
  int ind = 0;
  mass[0] = -2;
  mass[1] = -9;
  mass[2] = 7;
  mass[3] = -4;
  mass[4] = 9;
  mass[5] = -1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;
  for (int i = 0; i < mass.length; i++) {
   {  System.out.print(mass[i] + " ");}
  }System.out.println();
  ind = mass[0];
  for (int i = 0; i < mass.length; i++) {
   if (mass[i] % 2 == 0 && mass[i]>0) {
    ind = mass[i];
    for (int j = 0; j < mass.length; j++) {
     if (ind == mass[i]) {
      ind = i;
      break;}
    } System.out.print(ind + " ");
   }
  }
 }
}
вывод заданного массива, вывод номеров массива где стоят чётные числа
*/
  /* int mass[] = new int[10];
  mass[0] = -2;
  mass[1] = -9;
  mass[2] = 7;
  mass[3] = -4;
  mass[4] = 9;
  mass[5] = -1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;
  for (int i = 0; i < mass.length; i++) {
   {  System.out.print(mass[i] + " ");}
  }System.out.println();
  int max = mass[0];
  for(int i = 0; i < mass.length; i++) {
   if (mass[i]>max && mass[i]<0){
    max= mass[i];
    for (int j = 0; j < mass.length; j++) {if (max==mass[i]);
    }
   }
  }System.out.println(max);
 }
}
Максимальный из отрицательных заданных элементов массива
*/
  /*
  Random random = new Random();
  int[] array = new int[10];
  for (int i = 0; i < array.length; i++) {
   {array[i] = random.nextInt();
    System.out.print(array[i] + " ");}
  }System.out.println();
  int max = array[0];
  for(int i = 0; i < array.length; i++) {
   if (array[i]>max && array[i]<0){
    max= array[i];
    for (int j = 0; j < array.length; j++) {if (max==array[i]);
    }
   }
  }System.out.println(max);
 }
}
Максимальный из отрицательных случайных элементов массива
*/
 /* int mass[] = new int[10];
  mass[0] = -2;
  mass[1] = -9;
  mass[2] = 7;
  mass[3] = -4;
  mass[4] = 9;
  mass[5] = -1;
  mass[6] = 3;
  mass[7] = 8;
  mass[8] = 4;
  mass[9] = 6;
  for (int i = 0; i < mass.length; i++) {
   {  System.out.print(mass[i] + " ");}
  }System.out.println();
  int max = mass[1];
  int min = mass[1];
  for(int i = 0; i < mass.length; i++) {
   if (mass[i]>max){
    max= mass[i];
    for (int j = 0; j < mass.length; j++) {if (max==mass[i]);

    }
   }
  }System.out.println(max);
 }
}
пока не работает
*/
/*        int[] numbers = {1, 2, 3, 4, 100, 101, 1, 2, 3};
        int[] result = getMostFrequentNumbers(numbers);
        System.out.println(Arrays.toString(result));}
    public static int[] getMostFrequentNumbers(int[] numbers) {
        if (numbers.length > 0) {
            int[] uniqueNumbers = new int[]{numbers[0]};
            for (int i = 1; i < numbers.length; i++) {
                int number = numbers[i];
                if (indexOf(uniqueNumbers, number) == -1) {
                    uniqueNumbers = Arrays.copyOf(uniqueNumbers, uniqueNumbers.length + 1);
                    uniqueNumbers[uniqueNumbers.length - 1] = number;
                }
            }
            int[] counts = new int[uniqueNumbers.length];
            int max = 0;
            for (int number : numbers) {
                int index = indexOf(uniqueNumbers, number);
                counts[index]++;
                if (counts[index] > max) {
                    max = counts[index];}
            }int[] result = new int[0];
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] == max) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = uniqueNumbers[i];}
            }return result;
        }return new int[0];
    }public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;}
        }return -1;
    }
}
наиболее часто встречающееся число в массиве
*/
        /*Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            {array[i] = random.nextInt();
                System.out.print(array[i] + " ");}
        }System.out.println();
        int nMin = 0;
        int nMax = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                nMax = i;}
            if (array[i] < min) {
                min = i;
                nMin = i;}
        }int tmp = array[nMax];
        array[nMax] = array[nMin];
        array[nMin] = tmp;
        for (int item : array) {
            System.out.print(item + ",");}
    }
}
    В массиве случайных целых чисел поменять местами минимальный и максимальный элементы.
/*

         */
        /*
Random random = new Random();
   int [][] array = new int[2][10];
   int p=0;
   for (int i = 0; i < array.length; i++) {
       for (int j = 0; j < array[i].length; j++) {

           array[i][j] = random.nextInt(10);
           System.out.print(array[i][j] + " ");
        }
         System.out.println();
      }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                p[0]>>>=1;

                                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
     }
   }
   почти работает
         */
        /*

        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[]{1,2,3,4,5};
        int[] array4 = new int[]{1,2,3,4,5};
        int[] array5 = new int[]{1,2,3,4,5};
        int[][] arrayM = {array1,array2,array3,array4,array5};
        arrayM[0][0]=54;

        for (int i =0; i < arrayM.length; i++) {
            for (int j = 0; j <arrayM[i].length; j++) {
                if (j==0){
                    arrayM[i][j]=array1[i];
                    System.out.print(array1[i] + array2[i]  + " ");

                }

            }



            }
            System.out.println();
        }




}
 */
        /*
        int[] array = new int[]{1, 2, 3, 4, 5};

        int a = sum(array);
        System.out.println(a);
    }
            public static int sum (int[] array123) {
                int sum= 0;
                for (int i = 0; i < array123.length ; i++) {
                    sum += array123[i];
                }
            return 111;
        }
    }

*/ /*
        int[] array = new int[]{1, 2, 3, 4, 5};

        int a = sum(array);
        System.out.println(a);
    }
    public static int sum (int[] array123) {
        int sum= 0;
        for (int i = 0; i < array123.length ; i++) {
            sum += array123[i];
        }
        return sum;
    }
}
*/ /*
        int[] array = new int[]{1, 2, 3, 4, 5};
        int a = sum(5, 8);
        System.out.println(a);
    }
    public static int sum (int a, int b) {
        int sum= 0;
        for (int i = 0; i < sum; i++) {
            sum += sum(5,8);
        }
        return a+b;
    }
}
*//*
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = new int[]{1, 2};

        int[] arrayM = (array1; array2; array3);
        arrayM[0] = 9;

        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM.length; j++) {
                if (j == 0) {
                    arrayM[i] = array1[i];
                    System.out.print(array1[i] & array2[i] & array2[i]);

                }
            }
        }
    }
}
*/ /*
        int[] array1 = {1, 2, 3};
        int[] array2 ={1, 2, 3, 4};
        int[] array3 = {1, 2};
        System.out.println(Arrays.toString(concatenation (array1, array2, array3)));
    }

    public static int[] concatenation (int[]...args) {
        int length = 0;
        for (int i = 0; i < args.length; i++) {
            length += args[i].length;
        }
        int[] array = new int[length];

        for (int i = 0, k = 0; i < args.length; i++) {
            for (int j = 0; j <  args[i].length; j++, k++) {
                array[k]=args[i][j];

            }

        }return array;
    }

}можно любое колічество массівов об'едініть в одін
*/
        /*
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {1, 2};

        System.out.println(Arrays.toString(concatenation(array1, array2, array3, array4, array5)));
    }

    public static int[] concatenation(int[]... args) {
        int length = 0;
        for (int i = 0; i < args.length; i++) {
            length += args[i].length;
        }
        int[] array = new int[length];

        for (int i = 0, k = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++, k++) {
                array[k] = args[i][j];

            }

        }
        return array;
    }
}ожно любое колічество массівов об'едініть в одін
*/
        /*

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {1, 2};

        print(array1);
        print(array2);
        print(array3);
        print(array4);
        print(array5);
     }

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }}
*/
            /*
            Random random = new Random();
            int [] array = new int[10];
            int indMax=0;
            for (int i = 0; i < array.length; i++) {
                { array[i] = random.nextInt(10);
                    System.out.print(array[i] + " ");}
            }System.out.println();
            int max = array[0];
            for(int i = 0; i < array.length; i++) {
                if (array[i]>max){
                    max= array[i];
                    for (int j = 0; j < array.length; j++) {if (max==array[i]) {indMax=i; break;}
                    }
                }
            }System.out.println(max);System.out.println(indMax);
        }
}
}
        }System.out.println(max);System.out.println(indMax);
                }
                }}} реверс рандомного массіва (вывод в обратном порядке)
                */
        /*  int mass[] = new int[10];
        mass[0] = -2;
        mass[1] = -9;
        mass[2] = 7;
        mass[3] = -4;
        mass[4] = 9;
        mass[5] = -1;
        mass[6] = 3;
        mass[7] = 8;
        mass[8] = 4;
        mass[9] = 6;
        for (int i = 0; i < mass.length; i++) {
            {  System.out.print(mass[i] + " ");}
        }System.out.println();
        int b = mass[0];        mass[0]=mass[9];        mass[9]=b;
        int с = mass[1];        mass[1]=mass[8]; mass[8]=с;
        int d = mass[2];        mass[2]=mass[7];        mass[7]=d;
        int e = mass[3];        mass[3]=mass[6]; mass[6]=e;
        int f = mass[4];        mass[4]=mass[5]; mass[5]=f;

        for (int j = 0; j < 10; j++) {

            System.out.print(mass[j] +" ");

        }}}реверс заданного массіва (вывод в обратном порядке)
*/
        /*       int mass[] = new int[10];
        Random random = new Random();

               for (int i = 0; i < 10; i++) {
            mass[i] = random.nextInt(10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int swap = 0;
        int uniqueNumbers=0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == mass[i++]) {
                swap++;
            }
            if (swap <= 1) {

            }System.out.println(mass[i]+ " ");

        }
    }}вывод уникалных значений для рандомного массива
*/
        /* int[] array = {1, 2, 3,10,2,1,100,4,3,1};

        for (int i = 0; i < 10; i++) {

            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);

        System.out.println();
        int swap = 0;
        int uniqueNumbers=0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] == array[i++]) {
                swap++;
            }
            if (swap <= 1) {

            }System.out.println(array[i]+ " ");

        }
    }} вывод уникалных значений для заданного массива c сортировкой
*//*
        int arr[] = {1, 2, 3, 0, 6, -1};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
                }
            }System.out.println(arr[i] + " ");
        }
    }
}сортировка пузырьком
*//*
        int[] array = {1, 2, 3, 4,5,6};
        int n = 2;
        System.out.println("Array" + Arrays.toString(array));
        ShiftToRight(array, n);
    }
    public static void ShiftToRight(int a[], int n){
        int [] b= new int[a.length];
        for (int i = n; i <a.length; i++) {
            b[i]=a[i-n];
        }
        for (int i = 0; i < n; i++) {
            b[i]= a[a.length -1-i];
        }
        System.out.println("Array after shifting to right by one: " + Arrays.toString(b));

        }
    }сдвиг массива вправо
 *//*
        int[]array = {1, 2, 3, 4,5,6};
        int n = 4;
        System.out.println("Array" + Arrays.toString(array));
        ShiftToRight(array, n);
    }
    public static void ShiftToRight(int a[], int n){
        int  temp= a[n];
        for (int i = n; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0] = temp;

        System.out.println("Array after shifting to right by one: " + Arrays.toString(a));

    }
}перенос цифры из массива на первое место
*//*
        int[] a = {1, 2, 3, 4,5,6};
        int n = 2;
        int [] b=new int[a.length];

        for (int i = a.length-1; i>=0; i--) {
            if (i + n >= a.length) {
                b[i + n - a.length] = a[i];
            } else {
                b[i + n] = a[i];
            }
        }
        for (int i :b)
        System.out.println(i);

    }
}сдвиг заданного массива на н-шагов
*//* int a[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int n = 2;
        int [] b=new int[a.length];

        for (int i = a.length-1; i>=0; i--) {
            if (i + n >= a.length) {
                b[i + n - a.length] = a[i];
            } else {
                b[i + n] = a[i];
            }
        }
        for (int i :b)
            System.out.print(i + " ");

    }
}сдвиг рандомного массива на н-шагов
*//*
                int[] a = {1, 2, 3, 4,5,6};

                System.out.println();
                int n = 2;
                int i=a[0];
                for (int i = 0; i < n; i++) {
        a[i-1]=a[i];
        a[n-1]=i;
        for (int i = 0; i < n; i++) {


        }System.out.println();

        }System.out.print(a[i] >>> " ");



        }
        }
        *//* номера в массиве четных значений
        int mass[] = new int[10];
        mass[0] = 2;
        mass[1] = 9;
        mass[2] = 7;
        mass[3] = 4;
        mass[4] = 9;
        mass[5] = 1;
        mass[6] = 3;
        mass[7] = 8;
        mass[8] = 4;
        mass[9] = 6;

        System.out.println("номера в массиве четных значений");

        for (int i = 0; i < 10; i++) {
            if (mass[i] % 2 ==0)
            //вывод значений массива System.out.print(mass[i] + " ");
            System.out.println(i + " ");
        }
    }
}*/ int mass[] = new int[10];
        mass[0] = 2;
        mass[1] = 9;
        mass[2] = 7;
        mass[3] = 4;
        mass[4] = 9;
        mass[5] = 2;
        mass[6] = 3;
        mass[7] = 8;
        mass[8] = 4;
        mass[9] = 1;

        System.out.println("minimal numerous");
int min =mass[0];
        for (int i = 0; i < 10; i++) {
            if (mass[i] < min)
            min= mass[i];

        }System.out.println(min + "=minimum");
    }}
