public class App {
    public static void main(String[] args) { throws Exception {

        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('f'));
        System.out.println(Character.isDigit('3'));
    }

        String test = "Hola";
        for (int i = 0; i < test.length();i++){
            System.out.println(test.charAt(i));
        }

        //Si lo haces implementando esto, le regalo un punto en el exameen
        char c = '1';
        int ascii = (int) c;
        System.out.println("El codigo ascii de a es: " + ascii);

    }
}