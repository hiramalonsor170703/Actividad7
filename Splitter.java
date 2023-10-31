package ListFibonacci;
import java.util.ArrayList;
import java.util.List;

public class Splitter {


	public List<Integer> buscarPar(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        for (Integer i : lista) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return pares;
    }

    public List<Integer> obtenerImpares(List<Integer> lista) {
        List<Integer> impares = new ArrayList<>();
        for (Integer i : lista) {
            if (i % 2 != 0) {
                impares.add(i);
            }
        }
        return impares;
    }
    
}
