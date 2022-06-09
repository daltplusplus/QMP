package QMP;

class Prenda{
  TipoPrenda tipo;
  Tela tela;
  Color color;
  Color secundario;

  //TODO agregar setter para darle forma a la prenda en borrador

  void setTipo(TipoPrenda tipo){
    this.tipo = tipo;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setTela(Tela tela) {
    this.tela = tela;
  }

  /*
	Prenda(TipoPrenda tipo, Tela tela, Color color){
		this.tipo = tipo;
		this.tela = tela;
		this.color = color;
	}

	Prenda(TipoPrenda tipo, Tela tela, Color color, Color secundario){
		this.tipo = tipo;
		this.tela = tela;
		this.color = color;
		this.secundario = secundario;
	}
	*/
}

