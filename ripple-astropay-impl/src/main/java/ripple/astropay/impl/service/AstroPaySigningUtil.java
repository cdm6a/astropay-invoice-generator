package ripple.astropay.impl.service;

/**
 * @author cmcnamara
 */
public class AstroPaySigningUtil {

    public static String GetSign(String key, String message) throws Exception {
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
        byte[] keyBytes = key.getBytes("UTF-8");
        System.out.println("Key bytes: " + ByteArray2HexString(keyBytes));
        byte[] messageBytes = message.getBytes("UTF-8");
        System.out.println("Message bytes: " + ByteArray2HexString(messageBytes));
        mac.init(new javax.crypto.spec.SecretKeySpec(keyBytes, mac.getAlgorithm()));
        return ByteArray2HexString(mac.doFinal(messageBytes));
    }

    public static String ByteArray2HexString(byte[] b) {
        java.math.BigInteger bi = new java.math.BigInteger(1, b);
        return String.format("%0" + (b.length<< 1) + "X", bi);
    }
}
