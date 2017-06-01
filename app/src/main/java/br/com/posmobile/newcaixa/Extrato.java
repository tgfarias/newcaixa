package br.com.posmobile.newcaixa;

/**
 * Created by tiagocosta on 01/06/2017.
 */

public class Extrato {

    public String categoria;
    public String local;
    public Double valor;
    public String hora;

    public Extrato(String categoria, String local, Double valor, String hora )
    {
        this.categoria = categoria;
        this.local = local;
        this.valor = valor;
        this.hora = hora;
    }
}
