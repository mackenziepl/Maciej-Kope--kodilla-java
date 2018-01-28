import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    static public long getCountEmptyStringUsingJava8(List<String> lista) {
        long y = lista.stream()
                .filter(l -> l.isEmpty())
                .count();
        return y;
    }

    static public long getCountLength3UsingJava8(List<String> lista) {
        long y = lista.stream()
                .filter(l -> l.length()==3)
                .count();
        return y;
    }

    static public List<String> deleteEmptyStringsUsingJava8(List<String> lista) {
        List<String> lista2 = lista.stream()
                .filter(l -> l.length()>0)
                .collect(Collectors.toList());

        return lista2;
    }

    static public String getMergedStringUsingJava8(List<String> lista, String x) {
         String marged  =  lista.stream()
                .filter(l -> l.length()>0)
                .collect(Collectors.joining(x));
        return marged;
    }

    static public List<Integer> getSquaresJava8 (List<Integer> lista) {
            List<Integer> lista2 = lista.stream()
                    .distinct()
                    .map(l -> l*l)
                    .collect(Collectors.toList());
        return lista2;
    }

    static public Integer getMaxJava8(List<Integer> lista) {
        int x = lista.stream()
                .max(Integer::compare)
                .get();
             return x;
    }

    static public Integer getMinJava8(List<Integer> lista) {
        int x = lista.stream()
                //.min(Comparator.naturalOrder())
                .min(Integer::compare)
                .get();
             return x;
    }

    static public Integer getSumJava8(List<Integer> lista) {
        int x = IntStream.range(0, lista.size())
                .map(n -> lista.get(n))
                .sum();
        return x;
    }

    static public Integer getAverageJava8(List<Integer> lista) {
        double x = lista.stream()
                .mapToInt(l -> l)
                .average()
                .getAsDouble();
        int y = (int) x;
        return y;
    }


}
