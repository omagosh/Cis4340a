public class Rule03 {
    public static long getInteger(DataInputStream is) throws IQException 
    {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}
