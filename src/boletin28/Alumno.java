
package boletin28;



public class Alumno {
    
    private String nome;
    private int nota;
    private Enderezo enderezo;

    public Alumno() {
    }

    public Alumno(String nome, int nota, String numero, int rua) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = new Enderezo(numero,rua);
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", nota: " + nota + ", enderezo: " + enderezo ;
    }
    
    public void cambiarNota(int nova){
        
      setNota(nova);      
    }
    
    public void amosar(){
        System.out.println(toString());
    }
    
     public void enderezoNovo(String rua, int numero) {
        Enderezo novo = new Enderezo(rua, numero);
        this.enderezo = novo;
     }
     
     public void cambiarNumero(int num){
        enderezo.setNumero(num);
    }
    
    
    public class Enderezo{
        
        private String rua;
        private int numero;

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "rua: " + rua + ", numero: " + numero;
        }
       
    }
    
}
