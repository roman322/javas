
package Camera;

/**
 *
 * @author rmoch
 */

    
public class Camera {
    private static int count=0;
    private int id;

    private String _maker;
    private double _price;
    private String _year;
    private String _color;
    private String _megapixels;


    //конструктор з параметрами, який ініціалізує 4 поля класу
    public Camera(String maker, String color, double price, String year) {
        _maker = maker;
        _price = price;
        _year = year;
        _color = color;
    }
    //конструктор з параметрами, який ініціалізує всі поля класу
    public Camera(String maker, String color, double price, String year,String megapixels) {
        _maker = maker;
        _price = price;
        _year = year;
        _color = color;
        _megapixels=megapixels;

        count++;
        id = count;
    }


    public String toString() {
        return id+". "+ _maker + " " + _color + " " + _price + " " + _year + " "+ _megapixels+" ";

    }

    //метод для отримання значення поля id
    public int getId() {
        return id;
    }
    public static int getCount() {
        return count;
    }
    
    

    public static void main(String[] args) {
        Camera camera[]=new Camera[5];
        
        camera[0] = new Camera("Sony","red",1000,"2016", "12,4");
        camera[1] = new Camera("Nicon", "black", 1200, "2011","16.2");     
        camera[2] = new Camera("Canon", "white", 800, "2018", "14,5");
        camera[3] = new Camera("Polaroid", "yellow", 1200, "2017","18,4");
        camera[4] = new Camera("Lumix", "blue", 1100, "2014","19,4");
    
        for (int i = 0; i < Camera.getCount(); i++) {
            System.out.println(camera[i]);
        }
    }
}
    
    

