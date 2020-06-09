package dominio;

import java.util.Date;

public class Reserva {
      private int codigo;
      private Date dataCadastro;
      private Date dataReserva;
      private int quantidadeDiarias;
      private Romaria romaria;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
      
    public Romaria getRomaria() {
        return romaria;
    }

    public void setRomaria(Romaria romaria) {
        this.romaria = romaria;
    }
      
      

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }
      
      
}
