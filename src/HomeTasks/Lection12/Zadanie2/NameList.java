package HomeTasks.Lection12.Zadanie2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameList {

    static List<List<String>> nameList = Arrays.asList(Arrays.asList("Volodya","Igor","Gena"),
            Arrays.asList("Igor", "Kostya", "Valera"), Arrays.asList("Valera", "Misha" ,"Anton"),
            Arrays.asList("Anton", "Jenya", "Vlad"));

    public static void main(String[] args) {

        List <String> namelist = nameList.stream().flatMap(l->l.stream()).distinct().collect(Collectors.toList());
        namelist.stream().forEach(System.out::println);
    }

}
