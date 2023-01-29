public class Main {
      public static String reverseString(String testString) {
        String reverse = "";
        for (int i = testString.length() - 1; i > -1; i--) {
                reverse = reverse + testString.charAt(i);
        }
        return reverse;
    }

    public static int[] arraySort(int[] arrayUnsorted) {
        for(int k = 0; k< arrayUnsorted.length; k++) {
           for(int i = k; i< arrayUnsorted.length; i++) {
            if(arrayUnsorted[i]< arrayUnsorted[k]) {
                int a = arrayUnsorted[i];
                int b = arrayUnsorted[k];
                arrayUnsorted[k] =a;
                arrayUnsorted[i] =b;
            }
        }
    }
        return arrayUnsorted;
}

    public static String[] stringSplit(String inputString) {
        return inputString.split(",");
    }

    public static int checksum(int i) {
        int checksum = 0;
        while (i>0) {
            checksum+= i%10;
            i/=10;
        }
        return checksum;
    }

    public static String roman(int i) {
        int secondDigit = i/10;
        String a="";
        String b ="";
        if (i == 100) {
              a ="C";
          } else if (i >= 90) {
              a= "XC";
          } else if (i >= 80) {
              a="LXXX";
          } else if (i >= 70) {
              a="LXX";
          } else if (i >= 60) {
              a="LX";
          } else if (i >= 50) {
              a="L";
          } else if (i>=40) {
              a="XL";
          } else if (i >= 30) {
              a="XXX";
          } else if (i >= 20) {
              a="XX";
          } else if (i >= 10) {
              a="X";
          }
          if (secondDigit>10) {
              b="IX";
          } else if (secondDigit > 9) {
              b="VIII";
          } else if (secondDigit > 8) {
              b="VII";
          } else if (secondDigit > 7) {
              b="VI";
          } else if (secondDigit > 6) {
              b="V";
          } else if (secondDigit > 5) {
              b="IV";
          } else if (secondDigit > 4) {
              b="III";
          } else if (secondDigit > 3) {
              b="II";
          } else if (secondDigit > 2) {
              b="I";
          }
        return a+b;
      }
}