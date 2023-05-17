public class Item implements Comparable<Item>{
    private String nome;
    private float valor;

    public Item(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Item outro) {
        if(this.getValor()>outro.getValor()){
            return 1;
        } else if (this.getValor()<outro.getValor()) {
            return -1;
        }
        return 0;
    }
}
