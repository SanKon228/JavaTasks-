class Dz2_7 {

    public static void main(String[] args) {
      if(args.length <= 0) {
        System.out.println("Error");//Если нет аргументов командной строки
      } else {
        long prod = 1; //это число будем умножать на аргументы
        long next_arg = 0; //а эта переменная будет аргументами
        for(String a:args) { //проходимся по всем аргументам
          next_arg = Long.parseLong(a); //берем следующий, делаем его числом типа  long
          prod *= next_arg; //домножаем
          System.out.println(a); //выводим аргумент на экран, для проверки. эту строку можно убрать
        }  
        System.out.println("Result = " + prod); //выводим результат
      }
    }
  }