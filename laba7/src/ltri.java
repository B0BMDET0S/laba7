
public class ltri {
    public static void main(String[] args) {
        int [] arr = new int[12];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random()*31)-15);
        }
        int max = arr[0], index = 0;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>=max)
                max = arr[i];
            index = i;
        }
        System.out.println("max chislo "+max+"\nindex chisla "+index);
    }
}
