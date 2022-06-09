package QMP;

public class PropuestaAgregar implements Propuesta {
  Prenda prenda;
  Guardarropas guardarropas;

  PropuestaAgregar(Prenda prenda, Guardarropas guardarropas){
    this.prenda = prenda;
    this.guardarropas = guardarropas;
  }

  public void aceptar(){
      guardarropas.agregar(prenda);
      guardarropas.agregarAceptadas(this);
      guardarropas.eliminarPropuesta(this);
  }

  public void rechazar() {
    guardarropas.eliminarPropuesta(this);
  }

  public void deshacer(){
    guardarropas.quitar(prenda);
  }

}
