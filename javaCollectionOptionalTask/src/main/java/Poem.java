import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Poem {
    public static class CompareTo implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    public static void main(String[] args){
        List<String> poem = new ArrayList<>();
        poem.add("Я тебя отвоюю у всех земель, у всех небес,");
        poem.add("Оттого что лес — моя колыбель, и могила — лес,");
        poem.add("Оттого что я на земле стою — лишь одной ногой,");
        poem.add("Оттого что я о тебе спою — как никто другой.");
        poem.add("Я тебя отвоюю у всех времен, у всех ночей,");
        poem.add("У всех золотых знамен, у всех мечей,");
        poem.add("Я ключи закину и псов прогоню с крыльца —");
        poem.add("Оттого что в земной ночи я вернее пса.");
        poem.add("Я тебя отвоюю у всех других — у той, одной,");
        poem.add("Ты не будешь ничей жених, я — ничьей женой,");
        poem.add("И в последнем споре возьму тебя — замолчи!-");
        poem.add("У того, с которым Иаков стоял в ночи.");
        poem.add("Но пока тебе не скрещу на груди персты —");
        poem.add("О проклятие!- у тебя остаешься — ты:");
        poem.add("Два крыла твои, нацеленные в эфир,-");
        poem.add("Оттого, что мир — твоя колыбель, и могила — мир!");

        System.out.println(poem);
        poem.sort(new Poem.CompareTo());
        System.out.println(poem);





    }

}
