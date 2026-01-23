package Comparator.practice_Comparator;

public class CityNames {

    public int id;
    public String name;

    public CityNames(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "id = " + id + ", name = " + name;
    }
}
