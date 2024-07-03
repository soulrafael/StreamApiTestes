import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//Aceita argumentos do tipo T e não retorna nenhum valor

public class ConsumerTest {
    public static void main(String[] args) {
        //Cria uma lista de numeros inteiros
        List<Integer> lista =  Arrays.asList(1,2,3,4,5,6,7,8);

        Consumer<Integer> numerosPar = numero -> {
            if (numero%2 == 0) {
                System.out.println(numero);
            }
        };
        Consumer<Integer> numerosImpar = numero -> {
            if (numero%2==1) {
                System.out.println(numero);
            }
        };
        lista.stream().forEach(numerosPar);
        lista.stream().forEach(numerosImpar);
    }
}
