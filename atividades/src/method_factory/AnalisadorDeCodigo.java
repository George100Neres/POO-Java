package method_factory;

import java.io.File;
import java.util.List;

public class AnalisadorDeCodigo {
    public int analisa() {
    	List<File> todosArquivos = arquivos.todosJava();
    	
     int qtdIfs = 0;
     for(File arquivo: todosArquivos) {
    	 String codigo = IOUtils.readFile(arquivo);
    	 
    	 String[] tokens = codigo.split(" ");
    	 
    	 for(String token : tokens) {
    		 if(token.equals("if")) qtdIfs++;
    	 }
     }
    }
}
