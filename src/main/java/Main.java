import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    while(true)
      {
        
      
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println("1-dodawanie 2-odejmowanie 3-mnozenie 4-dzielenie 5-pole prostokata 6-pole trojkata 7-suma a*a b*b c*c 8-najm wart a b c  9-wyjscie z programu");
    System.out.println("Podaj numer operacji:\n");
    wybor=scan.nextInt();
    switch(wybor)
      {
          case 1:
            System.out.println("Podaj a");
            float b=scan.nextInt();
            System.out.println("Podaj b");
            float c=scan.nextInt();
            System.out.println("Wynik dodawania "+(b+c));
            break;
          
          case 2:
            System.out.println("Podaj a");
            float d=scan.nextInt();
            System.out.println("Podaj b");
            float e=scan.nextInt();
            System.out.println("wynik odejmowania "+(d-e));
            break;
          
          case 3:
            System.out.println("Podaj a");
            float f=scan.nextInt();
            System.out.println("Podaj b");
            float g=scan.nextInt();
            System.out.println("Wynik mnozenia "+(f*g));
            break;
          
          case 4:
            System.out.println("Podaj a");
            float h=scan.nextInt();
            System.out.println("Podaj b");
            float i=scan.nextInt();
            if(i==0)
            {
              System.out.println("Nie dzielimy przez 0");
            }
            else
            {
              System.out.println("Wynik dzielenia "+(h/i));
            }
            break;
          case 5:
            System.out.println("Podaj a");
            float j=scan.nextInt();
            System.out.println("Podaj b");
            float k=scan.nextInt();
            System.out.println("Pole prostokata "+(j*k));
          break;

          case 6:
            System.out.println("Podaj a");
            float l=scan.nextInt();
            System.out.println("Podaj b");
            float m=scan.nextInt();
            System.out.println("Podaj c");
            float n1=scan.nextInt();
            double p1=(l+m+n1)/2.0;
            System.out.println("Pole trojkata+"+Math.sqrt(p1*(p1-l)*(p1-m)*(p1-n1)));
          break;

          case 7:
             System.out.println("Podaj a");
            float n=scan.nextInt();
            System.out.println("Podaj b");
            float o=scan.nextInt();
            System.out.println("Podaj c");
            float p=scan.nextInt();
            System.out.println("Suma a*a b*b c*c "+(n*n+o*o+p*p));
          break;

          case 8:
          System.out.println("Podaj a");
          float q=scan.nextInt();
          System.out.println("Podaj b");
          float r=scan.nextInt();
          System.out.println("Podaj c");
          float s=scan.nextInt();
          if(q<r && q<s)
          {
            System.out.println("Najmniejsza wartosc "+q);
          }
          else if(r<q && r<s)
          {
            System.out.println("Najmniejsza wartosc "+r);
          }
          else 
          {
            System.out.println("Najmniejsza wartosc "+s);
          }
          
          break;

          case 9:
          
          System.out.println("Koniec programu");
          scan.close();
          System.exit(0);
          break;
          
          default:
          System.out.println("Nie ma takiej operacji");
          break;
          
      }
      
    }
  }
}