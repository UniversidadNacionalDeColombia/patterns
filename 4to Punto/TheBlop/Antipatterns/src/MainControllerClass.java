


public class MainControllerClass {
	Data1 data_list[] = new Data1[5];
	Images images = new Images(5);
	Records records = new Records(5);
	Figure1 figure = new Figure1();

	public MainControllerClass() {
		for (int i = 0; i < data_list.length; i++) {
			data_list[i] = new Data1();
		}	
	}
	
	void showData() {
		for (int i = 0; i < data_list.length; i++) {
			System.out.println("El numero de horas totales que "+data_list[i].nombre+" va a tener es de "+totalHoras(i));
		}
	}
	
	void changeData(int index,String nombre,int dias,float horasDia) {
		data_list[index].dias = dias;
		data_list[index].nombre = nombre;
		data_list[index].horasDia = horasDia;
	}
	
	
	//Lo que define la logica de calcular la data deberia ser propio de la clase data
	float totalHoras(int index) {
		return data_list[index].horasDia * data_list[index].dias; 
	}
	
	String getNameData(int index) {
		return data_list[index].nombre;
	}
	
	void setData(int index,String nombre,float horas,int dias) {
		data_list[index].nombre = nombre;
		data_list[index].dias = dias;
		data_list[index].horasDia = horas;
	}
	
	void createImage(int index,String nombre, String formato, String fecha) {
		Image image = images.images[0];
		image.date = fecha;
		image.name = nombre;
		image.formato = formato;
	}
	
	void printImage(int index) {
		Image image = this.images.images[0];
		System.out.println("Date: "+image.date);
		System.out.println("Formato: "+image.formato);
		System.out.println("Name: "+image.name);
	}
	
	Image cambiarFormatoImages(int index,String formato) {
		return cambiarFormatoImage(images.images[index],formato);
	}
	
	Image cambiarFormatoImage(Image image,String formato) {
		image.formato = formato;
		return image;
	}
	
	Images getImages(int number){
		//Retorna cierta cantidad de imanges
		return new Images(10);
	}
	
	void recordAll(){
		for(int i=0;i<this.records.records.length;i++) {
			recordObject(this.records.records[i]);			
		}
	}
	
	void recordObject(Object record) {
		//Se encarga de grabar un record especifico
	}

	void addFilter(int index,String filter) {
		this.records.filters.add(filter);
	}
	
	
	void changeNameFigure(String name) {
		this.figure.name = name;
	}
	
	void changeSize(float width, float height) {
		this.figure.height = height;
		this.figure.width = width;
	}
	
	void changeHeightFigura(float height) {
		this.figure.height = height;
	}
	
	void changeWidthFigure(float width) {
		this.figure.width = width;
	}
	
	
	
}
