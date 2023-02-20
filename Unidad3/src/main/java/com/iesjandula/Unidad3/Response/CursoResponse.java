package com.iesjandula.Unidad3.Response;

public class CursoResponse
{
    private int anioFin;
    private int anioInicio;

    public CursoResponse(int anioFin, int anioInicio) {
        this.anioFin = anioFin;
        this.anioInicio = anioInicio;
    }

    public int getAnioFin() {
        return anioFin;
    }

    public void setAnioFin(int anioFin) {
        this.anioFin = anioFin;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }
}
