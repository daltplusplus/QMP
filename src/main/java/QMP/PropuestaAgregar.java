package QMP;

public class PropuestaAgregar extends Propuesta {
  PropuestaAgregar(Prenda prenda, Guardarropas guardarropas){
    this.prenda = prenda;
    this.guardarropas = guardarropas;
  }
  public void aceptar(){
      guardarropas.agregar(prenda);
      guardarropas.agregarAceptadas(this);
      guardarropas.eliminarPropuesta(this);
  }
  public void deshacer(){
    guardarropas.quitar(prenda);
  }

}
