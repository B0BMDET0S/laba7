public class lshest {
    public static void main(String[] args) {
        int [] arr = new int[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ((int)(Math.random()*99)+10);
            System.out.println(arr[i]);
        }
        boolean flag = true;
        for(int i = 1; i<arr.length;i++){
            if(arr[i]<=arr[i-1])
                flag = false;
                break;
        }
        if(flag){
            System.out.println("massiv vozrastaet");
        }
        else{
            System.out.println("massiv ne vozrastaet");
        }
    }
}
