package QMP;

public abstract class Propuesta {
  Guardarropas guardarropas;
  Prenda prenda;
  abstract void aceptar();
  public void rechazar() {
    guardarropas.eliminarPropuesta(this);
  }
  abstract void deshacer();
}
