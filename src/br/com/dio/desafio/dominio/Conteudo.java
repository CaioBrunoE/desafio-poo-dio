package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10d;
    private String titulo;
    private String descriacao;
    public abstract Double caucularaXP();
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescriacao() {
        return descriacao;
    }
    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }
}
