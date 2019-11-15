
public class Images {
	Image images[];
	public Images(int number) {
		 this.images = new Image[number];
		 for (int i = 0; i < images.length; i++) {
			images[i] = new Image();
		}
	}
}
