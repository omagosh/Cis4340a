import java.math.BigInteger;

public class Rule04 {
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString(); // Valid Character Data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
}
