package dominio;
// Generated 24-feb-2013 21:35:58 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * AsistenciaAsamblea generated by hbm2java
 */
public class AsistenciaAsamblea  implements java.io.Serializable {


     private Integer idAsistenciaA;
     private Asociado asociados;
     private Asamblea asamblea;
     private Date horaLlegada;
     private Date horaSalida;

    public AsistenciaAsamblea() {
    }

    public AsistenciaAsamblea(Asociado asociados, Asamblea asamblea, Date horaLlegada, Date horaSalida) {
       this.asociados = asociados;
       this.asamblea = asamblea;
       this.horaLlegada = horaLlegada;
       this.horaSalida = horaSalida;
    }
   
    public Integer getIdAsistenciaA() {
        return this.idAsistenciaA;
    }
    
    public void setIdAsistenciaA(Integer idAsistenciaA) {
        this.idAsistenciaA = idAsistenciaA;
    }
    public Asociado getAsociados() {
        return this.asociados;
    }
    
    public void setAsociados(Asociado asociados) {
        this.asociados = asociados;
    }
    public Asamblea getAsamblea() {
        return this.asamblea;
    }
    
    public void setAsamblea(Asamblea asamblea) {
        this.asamblea = asamblea;
    }
    public Date getHoraLlegada() {
        return this.horaLlegada;
    }
    
    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    public Date getHoraSalida() {
        return this.horaSalida;
    }
    
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }




}


