package QMP;

public class PropuestaQuitar extends Propuesta {
  PropuestaQuitar(Prenda prenda, Guardarropas guardarropas){
    this.guardarropas = guardarropas;
    this.prenda = prenda;
  }
  public void aceptar() {
    guardarropas.quitar(prenda);
    guardarropas.agregarAceptadas(this);
    guardarropas.eliminarPropuesta(this);
  }
  public void deshacer(){
    guardarropas.agregar(prenda);
  }
}
