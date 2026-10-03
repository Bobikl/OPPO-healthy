package com.example.opponotificationrelay;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/** OAF v1 认证；认证 MAC 的时间为小端，线上字段及加密计数器为大端。 */
public final class OafCrypto {
    private final byte[] key, challenges;
    private long sent, received;
    public OafCrypto(byte[] key, byte[] clientChallenge, byte[] serverChallenge) {
        this.key = key.clone();
        this.challenges = concat(clientChallenge, serverChallenge);
        if (key.length != 16 || challenges.length != 16) throw new IllegalArgumentException("OAF key/challenge size");
    }
    public static byte[] concat(byte[]... parts) {
        int size = 0;
        for (byte[] p : parts) size += p.length;
        byte[] result = new byte[size];
        int offset = 0;
        for (byte[] p : parts) { System.arraycopy(p, 0, result, offset, p.length); offset += p.length; }
        return result;
    }
    public static byte[] hmac(byte[] key, byte[] data) throws GeneralSecurityException {
        Mac mac = Mac.getInstance("HmacSHA512");
        mac.init(new SecretKeySpec(key, "HmacSHA512"));
        return mac.doFinal(data);
    }
    public static byte[] challengeMac(byte[] key, byte[] challenges, long time) throws GeneralSecurityException {
        byte[] le = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(time).array();
        return Arrays.copyOf(hmac(key, concat(challenges, le)), 8);
    }
    public static byte[] request(byte[] key, byte[] challenge, long time, byte[] localId, byte[] alias)
            throws GeneralSecurityException {
        if (challenge.length != 8 || localId.length != 6 || alias.length != 6) throw new IllegalArgumentException("OAF auth fields");
        return ByteBuffer.allocate(38).put((byte)16).put((byte)1).put(challenge).putLong(time)
            .put(challengeMac(key, challenge, time)).put(localId).put(alias).array();
    }
    public static byte[] verifyResponse(byte[] key, byte[] qc, byte[] response) throws GeneralSecurityException {
        if (response.length != 27 || response[0] != 17 || response[1] != 1 || response[2] != 0)
            throw new GeneralSecurityException("OAF authentication rejected");
        byte[] qs = Arrays.copyOfRange(response, 3, 11);
        long ts = ByteBuffer.wrap(response, 11, 8).getLong();
        if (!MessageDigest.isEqual(challengeMac(key, concat(qc, qs), ts), Arrays.copyOfRange(response, 19, 27)))
            throw new GeneralSecurityException("OAF server authentication mismatch");
        return qs;
    }
    public static byte[] confirm(byte[] key, byte[] qs, long clientTime) throws GeneralSecurityException {
        return concat(new byte[]{18, 1, 0}, challengeMac(key, qs, clientTime));
    }
    private Cipher cipher(int mode, byte[] counter) throws GeneralSecurityException {
        byte[] material = hmac(key, concat(challenges, counter));
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(mode, new SecretKeySpec(material, 0, 16, "AES"), new GCMParameterSpec(128, material, 16, 12));
        cipher.updateAAD(material, 28, 20);
        return cipher;
    }
    public synchronized byte[] encrypt(byte[] plain) throws GeneralSecurityException {
        if (sent == Long.MAX_VALUE) throw new GeneralSecurityException("OAF counter exhausted");
        byte[] counter = ByteBuffer.allocate(8).putLong(++sent).array();
        return concat(counter, cipher(Cipher.ENCRYPT_MODE, counter).doFinal(plain));
    }
    public synchronized byte[] decrypt(byte[] encrypted) throws GeneralSecurityException {
        if (encrypted.length < 24) throw new GeneralSecurityException("OAF truncated ciphertext");
        long counter = ByteBuffer.wrap(encrypted).getLong();
        if (counter <= received) throw new GeneralSecurityException("OAF replay rejected");
        byte[] plain = cipher(Cipher.DECRYPT_MODE, Arrays.copyOf(encrypted, 8)).doFinal(encrypted, 8, encrypted.length - 8);
        received = counter;
        return plain;
    }
}
