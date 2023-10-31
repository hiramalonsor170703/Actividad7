package ListFibonacci;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
  	
public void ejecutar() {
		
		String ruta = "D:\\java-2023-06\\eclipse\\ejercicios\\Filefibonacci";
        
		Fibonacci fibonacci = new Fibonacci();
        
		List<Integer> listaFibonacci = fibonacci.generarFibonacci();
        
		Splitter splitter = new Splitter();
        
		List<Integer> listaPares = splitter.buscarPar(listaFibonacci);
        List<Integer> listaImpares = splitter.obtenerImpares(listaFibonacci);

        crearArchivo(ruta, "SecuenciaFibonacci.txt", listaFibonacci);
        crearArchivo(ruta, "ParesFibonacci.txt", listaPares);
        crearArchivo(ruta, "ImparesFibonacci.txt", listaImpares);
    }

    public void crearArchivo(String ruta, String nombreArchivo, List<Integer> lista) {
        try {
           
        	File file = new File(ruta + "/" + nombreArchivo);
            
        	FileWriter writer = new FileWriter(file);
            
        	for (Integer numero : lista) {
                writer.write(numero + " ");
            }
            
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
        
    }
}
