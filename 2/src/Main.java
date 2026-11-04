import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.

  Scanner sc = new Scanner(System.in);
    System.out.println("Введите кол-во элементов в дв массиве");
    int n = sc.nextInt();
    int m  = sc.nextInt();
    System.out.println("Одномерный");
    int n1 = sc.nextInt();
    int[][] arr =  new int[n][m];
    int[] mass = new int [n1];

    for ( int i =0; i<n;i++){
        for(int j = 0;j<m;j++){
        System.out.println("Введите элемент дв массива ");
        arr[i][j] = sc.nextInt();
    }}

    for( int i = 0;i<mass.length;i++){
        System.out.println("Введите элемент одн массива ");
        mass[i] = sc.nextInt();
    }
    System.out.println("Одномерный масссив");
    for(int i =0;i<mass.length;i++){
        System.out.print(mass[i] + " ");
    }
    System.out.println(" ");
    System.out.println("Ваш Массив:");
    for( int i = 0;i<n;i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.print("\n");
    }

    System.out.println("Выберите задание 1/2");
    int a = sc.nextInt();

    switch (a){
        case 1:{
            System.out.println("Задание 1 : Среднее арифмитическое");
            double sum = 0.0;
            for(int i=0;i< mass.length;i++){
                sum+=mass[i];
            }
            sum/=mass.length;
            System.out.println("Среднее арифмитичекское массива = " + sum);
            break;
        }


        case 2:{
            int max = Integer.MIN_VALUE;
            for( int i = 0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j]>max){
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("Максимальный элемент массива = "+ max);
            break;
        }

        default:{
            System.out.println("Выберите корректное задание!");
            break;}
    }

}
