package lab1;
public class Main {
    public static void main(String[] args) {
        char [][] pixel = make_forward();
        for(int i=0;i<4;i++){
            for(int x=0;x<13;x++){
                System.out.print(pixel[i][x]);
            }
            System.out.println();
        }
        char [][] array = make_mirror(pixel);
        for(int i=0;i<4;i++){
            for(int x=0;x<13;x++){
                System.out.print(array[i][x]);
            }
            System.out.println();
        }
        pixel = make_forward();
        for(int i=0;i<4;i++){
            for(int x=0;x<13;x++){
                System.out.print(pixel[i][x]);
            }
            for(int e=0;e<13;e++){
                System.out.print(array[i][e]);
            }
            System.out.println();
        }

    }
    public static char[][] make_mirror(char[][] array){
        for(int j = 0; j < array.length; j++){
            for(int i = 0; i < array[j].length / 2; i++) {
                char temp = array[j][i];
                array[j][i] = array[j][array[j].length - i - 1];
                array[j][array[j].length - i - 1] = temp;
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array[i].length;x++) {
                switch(array[i][x]){
                    case ')': array[i][x] = '(';
                        break;
                    case '(': array[i][x] = ')';
                        break;
                    case '/': array[i][x] = '\\';
                        break;
                    case '\\': array[i][x] = '/';
                        break;
                    default:
                        break;
                }
            }
        }
        return array;
    }
    public static char[][] make_forward(){
        char[][] pixel = new char [4][13];
        pixel[0][0]=' ';
        pixel[0][1]=' ';
        pixel[0][2]='_';
        pixel[0][3]='_';
        pixel[0][4]='_';
        pixel[0][5]='_';
        pixel[0][6]='_';
        pixel[0][7]='_';
        pixel[0][8]=' ';
        pixel[0][9]=' ';
        pixel[0][10]=' ';
        pixel[0][11]=' ';
        pixel[0][12]=' ';
        pixel[1][0]=' ';
        pixel[1][1]='/';
        pixel[1][2]='|';
        pixel[1][3]='_';
        pixel[1][4]='|';
        pixel[1][5]='|';
        pixel[1][6]='_';
        pixel[1][7]='\\';
        pixel[1][8]='\'';
        pixel[1][9]='.';
        pixel[1][10]='_';
        pixel[1][11]='_';
        pixel[1][12]=' ';
        pixel[2][0]='(';
        pixel[2][1]=' ';
        pixel[2][2]=' ';
        pixel[2][3]=' ';
        pixel[2][4]='_';
        pixel[2][5]=' ';
        pixel[2][6]=' ';
        pixel[2][7]=' ';
        pixel[2][8]=' ';
        pixel[2][9]='_';
        pixel[2][10]=' ';
        pixel[2][11]='_';
        pixel[2][12]='\\';
        pixel[3][0]='=';
        pixel[3][1]='\'';
        pixel[3][2]='-';
        pixel[3][3]='(';
        pixel[3][4]='_';
        pixel[3][5]=')';
        pixel[3][6]='-';
        pixel[3][7]='-';
        pixel[3][8]='(';
        pixel[3][9]='_';
        pixel[3][10]=')';
        pixel[3][11]='-';
        pixel[3][12]='\'';
        return pixel;
    }
}