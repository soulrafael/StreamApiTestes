import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SuplierTest {
    public static void main(String[] args) {
        Supplier<String> saudacao= () -> "Hello WOrld1000!";
        List<String> listaDeSaudacao = Stream.generate(saudacao)
        .limit(5)
        .toList();

        listaDeSaudacao.forEach(d ->System.out.println(d));







        
    }
}
