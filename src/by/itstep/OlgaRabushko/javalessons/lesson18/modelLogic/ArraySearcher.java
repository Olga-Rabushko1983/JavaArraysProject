package by.itstep.OlgaRabushko.javalessons.lesson18.modelLogic;

public class ArraySearcher {
    public static boolean chek(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    public static int fineFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int fineSecondIndex(int[] array, int value) {
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        if (counter==2) {
            return i;
        }
        }
        return -1;
    }

    //    public static int fineLastIndex(int[] array, int value) {
//        int lastIndex = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                lastIndex = i;
//            }
//        }
//
//        return -1;
//    }
    public static int fineLastIndex(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
