//Esta clase es un caso de Boat Anchor ya que es una clase que nunca se crea, y solo representa basura en el proyecto
public class Calculator_core {

    //Estos dos atributos son un caso de Boat Anchor ya que nunca se utilizan en el objeto.
    int value = 0;
    int thethie;

    int operations;

    Calculator_core(int operations){
        this.operations = operations;
    }

    public void values(String x){
        for(int i=0; i<10;i++){
            System.out.println(x);
        }
    }

}
