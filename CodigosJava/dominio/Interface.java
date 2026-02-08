package dominio;

public class Interface {
    public void renderizar(String[] linhas){
        for(int linha = 0; linha < linhas.length; linha++){
            String stringAtual = linhas[linha];
            for(int i=0; i<stringAtual.length() ; i++){
                char caracter = stringAtual.charAt(i);
                System.out.println(caracter);
                Pausas.pausar(50);
            }
            Pausas.pausar(1500);
        }
    }
}
