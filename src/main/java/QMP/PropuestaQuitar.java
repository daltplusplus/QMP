package QMP;

public class PropuestaQuitar implements Propuesta {
  Guardarropas guardarropas;
  Prenda prenda;

  PropuestaQuitar(Prenda prenda, Guardarropas guardarropas){
    this.guardarropas = guardarropas;
    this.prenda = prenda;
  }

  public void aceptar() {
    guardarropas.quitar(prenda);
    guardarropas.agregarAceptadas(this);
    guardarropas.eliminarPropuesta(this);
  }

  public void rechazar() {
    guardarropas.eliminarPropuesta(this);
  }

  public void deshacer(){
    guardarropas.agregar(prenda);
  }
}
