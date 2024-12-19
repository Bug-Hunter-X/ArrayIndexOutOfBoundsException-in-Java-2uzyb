public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 0;
        try {
            System.out.println("Enter the index (0-4):");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            index = scanner.nextInt();
            if(index<0 || index>=arr.length){
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            System.out.println(arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}