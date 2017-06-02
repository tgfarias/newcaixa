package br.com.posmobile.newcaixa;

/**
 * Created by tiagocosta on 01/06/2017.
 */

public class Extrato {

    public String categoria;
    public String local;
    public String valor;
    public String hora;
    public int resId;

    public Extrato(String categoria, String local, String valor, String hora, int resId)
    {
        this.categoria = categoria;
        this.local = local;
        this.valor = valor;
        this.hora = hora;
        this.resId = resId;
    }
}
