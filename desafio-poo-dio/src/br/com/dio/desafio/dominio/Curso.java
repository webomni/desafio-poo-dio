package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20;
    }

    public Curso() {

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo=" + getTitulo() + '\'' +
                "Descricao=" + getDescricao() + '\'' +
                "Data=" + cargaHoraria + '}';

    }

}
