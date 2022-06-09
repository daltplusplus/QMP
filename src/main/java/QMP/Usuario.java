package QMP;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropas> guardarropas = new ArrayList<>();

  void GuardarropasCompartido(List<Usuario> usuarios){
    usuarios.forEach(usuario -> usuario.guardarropas.add(new Guardarropas()));
  }

}
