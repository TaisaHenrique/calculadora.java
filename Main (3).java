public class Casa {

    
    private String endereco;     
    private String cor;          
    private int numQuartos;      
    private int numBanheiros;    
    private double tamanho;      
    private String tipo;         
    private double valor;       
    private boolean garagem;    

    
    public Casa(String endereco, String cor, int numQuartos, int numBanheiros, double tamanho, String tipo, double valor, boolean garagem) {
        this.endereco = endereco;
        this.cor = cor;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.valor = valor;
        this.garagem = garagem;
    }

    public Casa(String endereco, double tamanho, double valor) {
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.valor = valor;
        this.cor = "Branca";
        this.numQuartos = 2;
        this.numBanheiros = 1;
        this.tipo = "Casa Térrea";
        this.garagem = false;
    }
    
    public Casa() {
        this.endereco = "Desconhecido";
        this.cor = "Branca";
        this.numQuartos = 2;
        this.numBanheiros = 1;
        this.tamanho = 100;
        this.tipo = "Casa Térrea";
        this.valor = 0.0;
        this.garagem = false;
    }

    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Cor: " + cor);
        System.out.println("Número de quartos: " + numQuartos);
        System.out.println("Número de banheiros: " + numBanheiros);
        System.out.println("Tamanho: " + tamanho + " m²");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Possui garagem: " + (garagem ? "Sim" : "Não"));
    }

    public void mudarCor(String novaCor) {
        this.cor = novaCor;
        System.out.println("A cor da casa foi alterada para " + cor);
    }

    public void adicionarQuarto() {
        this.numQuartos++;
        System.out.println("A casa agora tem " + numQuartos + " quartos.");
    }

    public void removerQuarto() {
        if (this.numQuartos > 1) {
            this.numQuartos--;
            System.out.println("A casa agora tem " + numQuartos + " quartos.");
        } else {
            System.out.println("A casa não pode ter menos de um quarto.");
        }
    }

    public void atualizarValor(double novoValor) {
        this.valor = novoValor;
        System.out.println("O valor da casa foi atualizado para R$ " + valor);
    }

    public void adicionarGaragem() {
        if (!this.garagem) {
            this.garagem = true;
            System.out.println("Uma garagem foi adicionada à casa.");
        } else {
            System.out.println("A casa já possui uma garagem.");
        }
    }

    public void verificarTamanho() {
        if (this.tamanho > 200) {
            System.out.println("Esta é uma casa grande.");
        } else {
            System.out.println("Esta não é uma casa grande.");
        }
    } 
} 