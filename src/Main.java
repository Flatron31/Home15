import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("\\d{3}");
//        String text = "abc123def";
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }


//        1) Написать регулярное выражение для проверки правильности ввода номера телефона.
//        Проводить проверку по следующему шаблону
//        +375(29)123-12-12

        Pattern pattern1 = Pattern.compile("^(\\+375)\\(\\d[29]\\)\\d{3}-\\d{2}-\\d{2}");
        ArrayList<String> listTelefon = new ArrayList<>();
        listTelefon.add(" +375(29)123-12-12");
        listTelefon.add("+325(24)123-12-12");
        listTelefon.add("+375(29)-123-12-12");
        listTelefon.add("+375(29)123:12-12");
        listTelefon.add("+375(29)123-12-12");
        listTelefon.add("+375(29)1231212");
        for (String value : listTelefon){
            Matcher matcher1 = pattern1.matcher(value);
            while (matcher1.find()){
                System.out.println(value);
            }
        }

//          2) Написать регулярное выражение для проверки правильности ввода email. Email считается валидным,
//          если у него есть '@что-то.что-то'

        Pattern pattern2 = Pattern.compile("^[0-9-a-zA-Z]+@[0-9-a-zA-Z]+\\.[a-z]+");
        ArrayList<String> list = new ArrayList<>();
        list.add("ab12@FDdg124.com");
        list.add("aG12v@FDdg124.com");
        list.add("aG12v@FDdg124.ru");
        list.add("a*b12@FDdg124.com");
        list.add("ab12@FDdg1##24.com");
        list.add("ab12@FDdg124.8nj");
        list.add("ab12@FDdg124com");
        for (String value2 : list){
            Matcher matcher2 = pattern2.matcher(value2);
            while (matcher2.find()){
                System.out.println(value2);
            }
        }

//          3) В переменную присвоить какой либо текст на несколько предложений. Написать регулярки,
//          которые будут находить первые и последние слова предложений.

        String text3 = "1945 What are You doing. I am learning. Ddgewe arfdgfse etewj efgsdfr. Fegwsdge dfdcvvf etvsdvdfg.";
        Pattern pattern3 = Pattern.compile("^\\b[0-9a-zA-Z]+\\b\\s|\\.\\s\\b[0-9a-zA-Z]+\\b\\s");
        Pattern pattern4 = Pattern.compile("\\s\\b[0-9a-z]+\\b\\.");
        System.out.println("Первые слова предложения: ");
        Matcher matcher3 = pattern3.matcher(text3);
        while (matcher3.find()){
            System.out.println(matcher3.group());
        }
        System.out.println("-----------------------------");
        System.out.println("Последние слова предложения: ");
        Matcher matcher4 = pattern4.matcher(text3);
        while (matcher4.find()){
            System.out.println(matcher4.group());
        }

    }
}
