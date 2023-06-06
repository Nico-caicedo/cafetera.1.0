public class Cafetera {
    private int _agua;
    private int _leche;
    private int _cafe;
    private boolean _power;
    private int _capuchino;
    private boolean _estado;
    private int _cafeP;
    private int _tintoP;
    private int _capuchinoP;
    private int _PrecioT;
    private int _cafePT;
    private int _tintoPT;
    private int _capuchinoPT;

    public Cafetera() {
        this._agua = 0;
        this._leche = 0;
        this._capuchino = 0;
        this._cafe = 0;
        this._power = false;
        this._cafeP = 0;
        this._tintoP = 0;
        this._capuchinoP = 0;
        this._PrecioT = 0;
        this._cafePT = 0;
        this._tintoPT = 0;
        this._capuchinoPT = 0;

    }

    // metodos setter
    public void setEstado(boolean newPower) {
        _power = newPower;
    }

    public void SetCargar(int Newagua, int Newleche, int Newcafe, int Newcapuchino) {
        _agua = Newagua;
        _leche = Newleche;
        _cafe = Newcafe;
        _capuchino = Newcapuchino;

    }

    public void SetPrecios(int Newtintop, int Newcafep, int Newcapuchinop) {
        _tintoP = Newtintop;
        _cafeP = Newcafep;
        _capuchinoP = Newcapuchinop;

    }

    // Procesa la petición segun la bebida

    public void setHacerTinto(int tamaño, int cant) {

        switch (tamaño) {
            case 1:
                int P1 = cant * _tintoP;
                _tintoPT = _tintoPT + P1;
                _PrecioT = _PrecioT + P1;
                _agua = _agua - (2 * cant);
                _cafe = _cafe - (2 * cant);
                break;
            case 2:
                int por = _tintoP * 35 / 100;
                int P2 = cant * (_tintoP + por);
                _tintoPT = _tintoPT + P2;
                _PrecioT = _PrecioT + P2;
                _agua = _agua - (3 * cant);
                _cafe = _cafe - (3 * cant);
                break;

        }

    }

    public void setHacerCafe(int tamaño, int cant) {

        switch (tamaño) {
            case 1:
                int P1 = cant * _cafeP;
                _cafePT = _cafePT + P1;
                _PrecioT = _PrecioT + P1;
                _agua = _agua - (2 * cant);
                _cafe = _cafe - (2 * cant);
                _leche = _leche - (1 * cant);
                break;
            case 2:
                int por = _cafeP * 35 / 100;
                int P2 = cant * (_cafeP + por);
                _cafePT = _cafePT + P2;
                _PrecioT = _PrecioT + P2;
                _agua = _agua - (3 * cant);
                _cafe = _cafe - (3 * cant);
                _leche = _leche - (2 * cant);
                break;

        }

    }

    public void setHacerCapuchino(int tamaño, int cant) {

        switch (tamaño) {
            case 1:
                int P1 = cant * _capuchinoP;
                _capuchinoPT = _capuchinoPT + P1;
                _PrecioT = _PrecioT + P1;
                _agua = _agua - (2 * cant);
                _capuchino = _capuchino - (3 * cant);
                break;
            case 2:

                int por = _capuchinoP * 35 / 100;
                int P2 = cant * (_capuchinoP + por);
                _capuchinoPT = _capuchinoPT + P2;
                _PrecioT = _PrecioT + P2;
                _agua = _agua - (3 * cant);
                _capuchino = _capuchino - (4 * cant);

                break;

        }

    }

    // metodos getter

    public void getMostrarEstado() {

        System.out.println("---Estado Material---");
        System.out.println("1.Agua : " + _agua);
        System.out.println("2.Leche : " + _leche);
        System.out.println("3.Cafe : " + _cafe);
        System.out.println("4.Capuchinp : " + _capuchino);
        System.out.println("    ");
    }

    public int getPrecioTinto() {

        return _tintoP;

    }

    public int getPrecioCafe() {

        return _cafeP;

    }

    public int getPreciocapuchino() {

        return _capuchinoP;

    }

    // regresa los valores de los precios totales por cada producto

    public int getPrecioTintoT() {

        return _tintoPT;

    }

    public int getPrecioCafeT() {

        return _cafePT;

    }

    public int getPreciocapuchinoT() {

        return _capuchinoPT;

    }

    // regresa el precio total de ventas

    public int getPrecioT() {

        return _PrecioT;

    }

}
