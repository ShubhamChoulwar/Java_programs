package practise_String;
//input = aaabbc   output = a3b2c1
public class StringCompression {
    public void outputCharNumberOfChar(String name){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=1;i<=name.length();i++){
            if(i<name.length() && name.charAt(i)==name.charAt(i-1)){
                count++;
            } else {
                sb.append(name.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String name = "abaabbc";
        StringCompression stringCompression = new StringCompression();
        stringCompression.outputCharNumberOfChar(name);
    }
}
