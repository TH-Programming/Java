public class App {
    public static void main(String[] args) throws Exception {
        //! casting is changing a data type just before using it by adding the new type in parentheses
       //! byte myNewByteValue = (byte) (myMinShortValue/2)

        byte myByte = 1;
        short myShort = 12;
        int myInt = 30;
        long myLong = 50000L + (10*(myByte + myShort + myInt));
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt))
    }
}
