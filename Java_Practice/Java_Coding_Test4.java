public class Java_Coding_Test4 {
    public static void main(String [] args){
        int [] numbers = {10,45,23,89,12,67};
        int largest = numbers[0];
        int secondLargest = numbers[1];
        int temp;
        if (secondLargest>largest){
            temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }
        for (int i = 2; i < numbers.length ;i++){
            if (numbers[i]> largest){
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i]>secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
    }
}
