import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] calc) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int index1 = number.indexOf('+');
        int index2 = number.indexOf('-');
        int index3 = number.indexOf('*');
        int index4 = number.indexOf('/');

        int index01 = number.lastIndexOf('+');
        int index02 = number.lastIndexOf('-');
        int index03 = number.lastIndexOf('*');
        int index04 = number.lastIndexOf('/');

        if ((index1==index01)&&(index2==index02)&&(index3==index03)&&(index4==index04)) {
        String ind1 = "\\+";
        String ind2 = "-";
        String ind3 = "\\*";
        String ind4 = "/";
            if (index1 > 0) {
            String strings1 = ind1;
            String[] strings = number.split(ind1);

            boolean result = (strings[0].matches("\\d*\\d")) && (strings[1].matches("\\d*\\d"));
            if (result) {
                int c = Integer.parseInt(strings[0]);
                int d = Integer.parseInt(strings[1]);
                if ((c>=1)&&(c<11)&&(d>=1)&&(d<11)) {
                    int e = c + d;
                    System.out.println(e);}
                else {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            } else  {
                try {
                    Datas datas = Datas.valueOf(strings[0]);
                    Datas1 datas1 = Datas1.valueOf(strings[1]);
                    int c = datas.getTrsl();
                    int d = datas1.getTrsl();
                    int e = c + d;
                    int ed = e/10;
                    int ef = e-ed*10;
                    String wer = new String();
                    String wet = new String();
                    switch (ed) {
                        case 0:
                            wer = "";
                            break;
                        case 1:
                            wer = "X";
                            break;
                        case 2:
                            wer = "XX";
                            break;
                        case 3:
                            wer = "XXX";
                            break;
                        case 4:
                            wer = "XL";
                            break;
                        case 5:
                            wer = "L";
                            break;
                        case 6:
                            wer = "LX";
                            break;
                        case 7:
                            wer = "LXX";
                            break;
                        case 8:
                            wer = "LXXX";
                            break;
                        case 9:
                            wer = "XC";
                            break;
                        case 10:
                            wer = "C";
                            break;
                    }
                    switch (ef) {
                        case 0:
                            wet = "";
                            break;
                        case 1:
                            wet = "I";
                            break;
                        case 2:
                            wet = "II";
                            break;
                        case 3:
                            wet = "III";
                            break;
                        case 4:
                            wet = "IV";
                            break;
                        case 5:
                            wet = "V";
                            break;
                        case 6:
                            wet = "VI";
                            break;
                        case 7:
                            wet = "VII";
                            break;
                        case 8:
                            wet = "VIII";
                            break;
                        case 9:
                            wet = "IX";
                            break;
                    }
                    System.out.println(wer+wet);
                } catch (IllegalArgumentException e) {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            }
        }
        else if (index2 > 0) {
            String strings1 = ind2;
            String[] strings = number.split(ind2);

            boolean result = (strings[0].matches("\\d*\\d")) && (strings[1].matches("\\d*\\d"));
            if (result) {
                int c = Integer.parseInt(strings[0]);
                int d = Integer.parseInt(strings[1]);
                if ((c>=1)&&(c<11)&&(d>=1)&&(d<11)) {
                    int e = c - d;
                    System.out.println(e);}
                else {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            } else  {
                try {
                    Datas datas = Datas.valueOf(strings[0]);
                    Datas1 datas1 = Datas1.valueOf(strings[1]);
                    int c = datas.getTrsl();
                    int d = datas1.getTrsl();
                    int e = c - d;
                        if (e < 1) {
                        try {
                            throw new IOException();
                        } catch (IOException e1) {
                            System.out.println("Отет был бы равен нулю или отрицательным. В римской системе это не предусмотрено");
                        }
                        } else {
                            int ed = e / 10;
                            int ef = e - ed * 10;
                        String wer = new String();
                        String wet = new String();
                        switch (ed) {
                            case 0:
                                wer = "";
                                break;
                            case 1:
                                wer = "X";
                                break;
                            case 2:
                                wer = "XX";
                                break;
                            case 3:
                                wer = "XXX";
                                break;
                            case 4:
                                wer = "XL";
                                break;
                            case 5:
                                wer = "L";
                                break;
                            case 6:
                                wer = "LX";
                                break;
                            case 7:
                                wer = "LXX";
                                break;
                            case 8:
                                wer = "LXXX";
                                break;
                            case 9:
                                wer = "XC";
                                break;
                            case 10:
                                wer = "C";
                                break;
                        }
                        switch (ef) {
                            case 0:
                                wet = "";
                                break;
                            case 1:
                                wet = "I";
                                break;
                            case 2:
                                wet = "II";
                                break;
                            case 3:
                                wet = "III";
                                break;
                            case 4:
                                wet = "IV";
                                break;
                            case 5:
                                wet = "V";
                                break;
                            case 6:
                                wet = "VI";
                                break;
                            case 7:
                                wet = "VII";
                                break;
                            case 8:
                                wet = "VIII";
                                break;
                            case 9:
                                wet = "IX";
                                break;
                        }
                        System.out.println(wer + wet);}}
                     catch(IllegalArgumentException e){
                        System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                                "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                    }
                }}




        else if (index3 > 0) {
            String strings1 = ind3;
            String[] strings = number.split(ind3);

            boolean result = (strings[0].matches("\\d*\\d")) && (strings[1].matches("\\d*\\d"));
            if (result) {
                int c = Integer.parseInt(strings[0]);
                int d = Integer.parseInt(strings[1]);
                if ((c>=1)&&(c<11)&&(d>=1)&&(d<11)) {
                    int e = c * d;
                    System.out.println(e);}
                else {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            } else  {
                try {
                    Datas datas = Datas.valueOf(strings[0]);
                    Datas1 datas1 = Datas1.valueOf(strings[1]);
                    int c = datas.getTrsl();
                    int d = datas1.getTrsl();
                    int e = c * d;
                    int ed = e/10;
                    int ef = e-ed*10;
                    String wer = new String();
                    String wet = new String();
                    switch (ed) {
                        case 0:
                            wer = "";
                            break;
                        case 1:
                            wer = "X";
                            break;
                        case 2:
                            wer = "XX";
                            break;
                        case 3:
                            wer = "XXX";
                            break;
                        case 4:
                            wer = "XL";
                            break;
                        case 5:
                            wer = "L";
                            break;
                        case 6:
                            wer = "LX";
                            break;
                        case 7:
                            wer = "LXX";
                            break;
                        case 8:
                            wer = "LXXX";
                            break;
                        case 9:
                            wer = "XC";
                            break;
                        case 10:
                            wer = "C";
                            break;
                    }
                    switch (ef) {
                        case 0:
                            wet = "";
                            break;
                        case 1:
                            wet = "I";
                            break;
                        case 2:
                            wet = "II";
                            break;
                        case 3:
                            wet = "III";
                            break;
                        case 4:
                            wet = "IV";
                            break;
                        case 5:
                            wet = "V";
                            break;
                        case 6:
                            wet = "VI";
                            break;
                        case 7:
                            wet = "VII";
                            break;
                        case 8:
                            wet = "VIII";
                            break;
                        case 9:
                            wet = "IX";
                            break;
                    }
                    System.out.println(wer+wet);
                } catch (IllegalArgumentException e) {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            }
        }else if (index4 > 0) {
            String strings1 = ind4;
            String[] strings = number.split(ind4);

            boolean result = (strings[0].matches("\\d*\\d")) && (strings[1].matches("\\d*\\d"));
            if (result) {
                int c = Integer.parseInt(strings[0]);
                int d = Integer.parseInt(strings[1]);
                if ((c>=1)&&(c<11)&&(d>=1)&&(d<11)) {
                    int e = c / d;
                    System.out.println(e);}
                else {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            } else  {
                try {
                    Datas datas = Datas.valueOf(strings[0]);
                    Datas1 datas1 = Datas1.valueOf(strings[1]);
                    int c = datas.getTrsl();
                    int d = datas1.getTrsl();
                    int e = c / d;
                    int ed = e/10;
                    int ef = e-ed*10;
                    String wer = new String();
                    String wet = new String();
                    switch (ed) {
                        case 0:
                            wer = "";
                            break;
                        case 1:
                            wer = "X";
                            break;
                        case 2:
                            wer = "XX";
                            break;
                        case 3:
                            wer = "XXX";
                            break;
                        case 4:
                            wer = "XL";
                            break;
                        case 5:
                            wer = "L";
                            break;
                        case 6:
                            wer = "LX";
                            break;
                        case 7:
                            wer = "LXX";
                            break;
                        case 8:
                            wer = "LXXX";
                            break;
                        case 9:
                            wer = "XC";
                            break;
                        case 10:
                            wer = "C";
                            break;
                    }
                    switch (ef) {
                        case 0:
                            wet = "";
                            break;
                        case 1:
                            wet = "I";
                            break;
                        case 2:
                            wet = "II";
                            break;
                        case 3:
                            wet = "III";
                            break;
                        case 4:
                            wet = "IV";
                            break;
                        case 5:
                            wet = "V";
                            break;
                        case 6:
                            wet = "VI";
                            break;
                        case 7:
                            wet = "VII";
                            break;
                        case 8:
                            wet = "VIII";
                            break;
                        case 9:
                            wet = "IX";
                            break;
                    }
                    System.out.println(wer+wet);
                } catch (IllegalArgumentException e) {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
            }
        }
        else {
                try {
                    throw new IOException();
                } catch (IOException e1) {
                    System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                            "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
             }
    }
    else {
            System.out.println("Введите данные в виде: a + b, a - b, a * b, a / b, " +
                    "где a и b - одновременно либо арабские, либо римские, от 1 до 10 (I-X)");
                }
        }
    }


