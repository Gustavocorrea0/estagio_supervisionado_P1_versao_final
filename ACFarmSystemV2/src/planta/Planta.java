
package planta;

import java.util.Date;

public class Planta {
    
    private int idPlanta;
    private String tipoDePlanta;
    private String fornecedorPlanta;
    private int cicloEmDias;
    private Date dataDePlantio;
    private Double alturaAtualDaPlanta; 
    private int idPropriedade;

    public int getIdPropriedade() {
        return idPropriedade;
    }

    public void setIdPropriedade(int idPropriedade) {
        this.idPropriedade = idPropriedade;
    }
    
    

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public String getFornecedorPlanta() {
        return fornecedorPlanta;
    }

    public void setFornecedorPlanta(String fornecedorPlanta) {
        this.fornecedorPlanta = fornecedorPlanta;
    }

    public String getTipoDePlanta() {
        return tipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        this.tipoDePlanta = tipoDePlanta;
    }

    public int getCicloEmDias() {
        return cicloEmDias;
    }

    public void setCicloEmDias(int cicloEmDias) {
        this.cicloEmDias = cicloEmDias;
    }

    public Date getDataDePlantio() {
        return dataDePlantio;
    }

    public void setDataDePlantio(Date dataDePlantio) {
        this.dataDePlantio = dataDePlantio;
    }

    public Double getAlturaAtualDaPlanta() {
        return alturaAtualDaPlanta;
    }

    public void setAlturaAtualDaPlanta(Double alturaAtualDaPlanta) {
        this.alturaAtualDaPlanta = alturaAtualDaPlanta;
    }
    
    
}
