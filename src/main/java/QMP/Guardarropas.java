package QMP;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Guardarropas {
  List<Prenda> prendas = new  ArrayList<>();
  List<Propuesta> propuestas = new ArrayList<>();

  List<Propuesta> aceptadas = new ArrayList<>();
  void agregar(Prenda prenda){
    prendas.add(prenda);
  }

  void eliminarPropuesta(Propuesta propuesta){
    propuestas.remove(propuesta);
  }

  void agregarAceptadas(Propuesta propuesta){
    aceptadas.add(propuesta);
  }

  void quitar(Prenda prenda){
    prendas.remove(prenda);
  }

  void sugerirAgregar(Prenda prenda){
    propuestas.add(new PropuestaAgregar(prenda, this));
  }

  void sugerirQuitar(Prenda prenda){
    propuestas.add(new PropuestaQuitar(prenda, this));
  }

}
