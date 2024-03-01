public class R03_NUM03_J {
    public static long getInteger(DataInputStream is) throws IQException 
    {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}
