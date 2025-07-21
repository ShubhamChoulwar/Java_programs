package String;

public class SeparateString {
    String name1;

    public static void main(String[] args) {
        String name = "My name is shubham";
        new SeparateString().removeSpacesUsingLoop(name);

    }

    /**
     * This method is used to remove the spaces from the given string using loop
     * @param name
     */
    public void removeSpacesUsingLoop(String name){
        StringBuilder removeSpaces = new StringBuilder();
        for(int i=0; i<name.length();i++){
            if(name.charAt(i) != ' '){
                removeSpaces.append(name.charAt(i));
            }
        }
        System.out.println("without spaces:" + removeSpaces);
    }

    public void addUnderScore(String name){
        this.name1 = name;
        name1.split("_");
        System.out.println("with underscore: " + name1);

    }
}



