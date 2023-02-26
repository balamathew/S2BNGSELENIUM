package Programs;

public class Interprograms {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        //odd index should be retreived and add---1+3+5=9
        //even index should be retreived and odd index should be extract =2,4--2....9+2=11

        int num = 6;
        int ocount = 0;
        int ecount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=num){
                if (i%2!=0){
                    ocount++;
                    break;

                }
                else
                    ecount++;
            }
        }
int j=0;
int []err=new int[ocount++];
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=num){
                if (i%2!=0){
                   err[i]=i;
                   j++;
                }
                else
                    ecount++;
            }
        }
       err[j++]=a[a.length-1];
  for (int s:err)  {

      System.out.println(s);
  }

        }
    }