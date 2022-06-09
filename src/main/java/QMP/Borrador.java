package QMP;

class Borrador{
  Prenda prenda;

  void setTipo(TipoPrenda tipo) {
    prenda.setTipo(tipo);
  }

  void setMateriales(Color color, Tela tela) {
    prenda.setColor(color);
    prenda.setTela(tela);

  }

  void crearPrenda() {
    this.prenda = new Prenda();
  }

}
