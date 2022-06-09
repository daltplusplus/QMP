package QMP;

class TipoPrenda{
  Categoria categoria;

  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }

  TipoPrenda ZAPATO = new TipoPrenda(Categoria.CALZADO);
  TipoPrenda REMERA = new TipoPrenda(Categoria.SUPERIOR);
  TipoPrenda GORRO = new TipoPrenda(Categoria.ACCESORIO);
  //....
}

