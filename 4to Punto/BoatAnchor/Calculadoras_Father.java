//Esta clase es un caso de Boat Anchor ya que es una funcion padre que se llama, pero en el hijo nunca su utiliza nada de este padre
public class Calculadoras_Father {

    String marca;
    String vaule = "1234n123";

    Calculadoras_Father(String marca){
        this.marca = marca;
    }

    //Estos metodos son casos de anchor boar ya que son metodos que nunca se utilizan.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
