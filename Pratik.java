
public class Pratik {
    public static void main(String[] args) {
        //harmonik ortalama = eleman sayısı/ elemanların harmonik serisi
        int[] myArray = {1,2,5,8,7,50};
        double sum = 0;
        for (double i : myArray) {
            sum+=1/i;
        }
        double avg = myArray.length/sum;
        System.out.println(avg);
    }
}
