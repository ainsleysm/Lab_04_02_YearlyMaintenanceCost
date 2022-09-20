public class Main
{
    public static void main(String[] args)
    {
        int winter = 6000;
        int spring = 4000;
        int summer = 5500;
        int fall = 4000;
        int yearlyCost = winter + spring + summer + fall;

        System.out.println("Seasonal costs = winter: $" + winter + ", spring: $" + spring + ", summer: $" + summer +
                ", fall: $" + fall);
        System.out.println("Total yearly cost: $" + yearlyCost);
    }
}