package algorithms_java.binary_search;

/**
 * Created by lombocska on 2017. 03. 30..
 */
public class BinarySearch {

    int size;

    public boolean binarySearch(int key, int[] data){
        size = data.length;
        int low = 0;
        int high = size - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == key) {
                System.out.println("The key number was: " + data[middle] + " at the " + middle);
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        System.out.println("The key number isn't in the data");
        return false;
    }

    public static void main(String[] args) {
        int[] dataArray = new int[10];
        dataArray[0] = 10;
        dataArray[1] = 11;
        dataArray[2] = 17;
        dataArray[3] = 19;
        dataArray[4] = 20;
        dataArray[5] = 50;
        dataArray[6] = 90;
        dataArray[7] = 110;
        dataArray[8] = 120;
        dataArray[9] = 135;

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(20, dataArray);
    }
}
