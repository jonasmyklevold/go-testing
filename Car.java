
public class Car
{
    // instance variables - replace the example below with your own
    private String brand;
    private String model;
    private String modelType;
    private String color;
    private int year;


    public void setBrand(String newBrand)
    {
        brand = newBrand;
    }

    public void setModel(String newModel)
    {
        model = newModel;
    }

    public void setModelType(String newModelType)
    {
        modelType = newModelType;
    }

    public void setColor(String newColor)
    {
        color = newColor;
    }

    public void setYear(int newYear)
    {
        if (newYear > 1900 ) {
            year = newYear;
        }
    }


    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public String getModelType()
    {
        return modelType;
    }

    public String getColor()
    {
        return color;
    }

    public int getYear()
    {
        return year;
    }


    public static void main()
    {
        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setModel("Yaris");
        toyota.setModelType("Hatchback");
        toyota.setColor("Black");
        toyota.setYear(2001);


        System.out.println("My Toyota is: " + toyota.getColor());
        System.out.println("The model is: " + toyota.getModel());
        System.out.println("The size of the car is: " + toyota.getModelType());
        System.out.println("The car's color is: " + toyota.getColor());
        System.out.println("this car was made in:" + toyota.getYear());
    }
}
