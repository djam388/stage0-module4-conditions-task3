package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void main(String[] args) {
        isFirstAliquot(3, 3);
    }
    public static void isFirstAliquot(int first, int second) {
        //prints:"Aliquot" is yes otherwise "Not aliquot"
        if ( first != second && second % first == 0) {
            System.out.println("Aliquot");
        }
        else {
            System.out.println("Not aliquot");
        }
    }
}
