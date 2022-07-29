package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void main(String[] args) {
//        vowelDeterminer('a');
        vowelDeterminer('A');
        vowelDeterminer('b');
//        vowelDeterminer('B');
        vowelDeterminer('@');
    }
    public static void vowelDeterminer(char character) {
        if ((character > 64 && character < 91) || (character > 96 && character < 123)) {
            if (character == 65 || character == 97 ||
                    character == 69 || character == 101 ||
                    character == 73 || character == 105 ||
                    character == 79 || character == 111 ||
                    character == 85 || character == 117 ||
                    character == 89 || character == 121) {
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
        else {
            System.out.println("wrong alphabet!");
        }

    }
}


//            A	65	a	97
//            E	69	e	101
//            I	73	i	105
//            O	79	o	111
//            U	85	u	117
//            Y	89	y	121