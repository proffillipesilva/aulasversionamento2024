import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Testes {
    @Test
    void test1(){
        List<String> frutasList = List.of("banana" ,"pera", "uva", "pera", "salada mista", "pera");
        Set<String> frutasSet = new HashSet<>(frutasList);
                //Set.of("banana" ,"pera", "uva", "pera", "salada mista", "pera");
        System.out.println(frutasList);
        System.out.println(frutasSet);

    }

    @Test
    void test2_hashSet(){
        List<String> frutasList = List.of("banana" ,"pera", "uva", "pera", "salada mista", "pera");
        HashSet<String> frutasSet = new HashSet<>();
        frutasSet.add("banana");
        frutasSet.add("pera");
        frutasSet.add("banana");
        frutasSet.add("pera");
        frutasSet.add("uva");
        System.out.println(frutasList);
        System.out.println(frutasSet);

    }

    @Test
    void test3_containsHashSet(){

        HashSet<String> frutasSet = new HashSet<>(List.of("banana" ,"pera", "uva", "pera", "salada mista", "pera"));

        System.out.println(frutasSet.contains("abacate"));
        System.out.println(frutasSet.contains("pera"));

    }

    @Test
    void mapaFrutas(){
        HashMap<String, Integer> frutas = new HashMap<>();
        frutas.put("pera", 3);
        frutas.put("uva", 2);
        System.out.println(frutas);
        System.out.println(frutas.get("uva"));
        System.out.println("Eu tenho a fruta pera: " + frutas.containsKey("pera"));
        System.out.println("Eu tenho a fruta maca: " + frutas.containsKey("maca"));
    }

    @Test
    void contagemDasFrutas(){
        List<String> frutasList = List.of("banana" ,"pera", "uva", "pera", "salada mista",
                "pera", "uva", "laranja", "banana", "banana");
        HashMap<String, Integer> minhaContagem = new HashMap<>();
        for(String fruta : frutasList){
            if(minhaContagem.containsKey(fruta)){
                Integer contagemAtualDaFruta = minhaContagem.get(fruta);
                minhaContagem.put(fruta, contagemAtualDaFruta  + 1);
            } else {
                minhaContagem.put(fruta, 1);
            }
        }
        System.out.println(minhaContagem);
    }


}
