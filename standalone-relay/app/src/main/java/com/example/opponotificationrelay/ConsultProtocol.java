package com.example.opponotificationrelay;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 还原 OPPO 穿戴设备经典蓝牙连接握手协议 (Consult Protocol)
 * 包括 TransportConsult (CID=1) 与 ShakeHand (CID=21)
 */
public final class ConsultProtocol {

    public static final int SERVICE_CONSULT = 1;
    public static final int COMMAND_TRANSPORT_CONSULT = 1;
    public static final int COMMAND_SHAKE_HAND = 21;

    private ConsultProtocol() {}

    /**
     * 构造 TransportConsult 传输协商包 (SID=1, CID=1)
     * 字段定义 (ConsultProto.TransportConsult):
     * 1: protocolVersion (int32) = 2 或 5
     * 2: maxFrameSize (int32) = 10240
     * 3: maxTransimissionUnit (int32) = 2048
     * 4: interval (int32) = 0
     * 5: supportProtocol (int32) = 3
     */
    public static byte[] buildTransportConsult(int protocolVersion) {
        ProtoWriter pw = new ProtoWriter();
        pw.int32(1, protocolVersion);
        pw.int32(2, 10240);
        pw.int32(3, 2048);
        pw.int32(4, 0);
        pw.int32(5, 3);
        byte[] proto = pw.toByteArray();

        // 附加 2 字节帧头: [SID=1, CID=1]
        byte[] frame = new byte[proto.length + 2];
        frame[0] = (byte) SERVICE_CONSULT;
        frame[1] = (byte) COMMAND_TRANSPORT_CONSULT;
        System.arraycopy(proto, 0, frame, 2, proto.length);
        return frame;
    }

    /**
     * 构造 ShakeHand 身份握手包 (SID=1, CID=21)
     * 字段定义 (ConsultProto.ShakeHand):
     * 1: repeated int32 data (4 字节随机种子)
     * 2: repeated int32 encrypt_data (使用 AES-128 与配对 Key 加密后的字节)
     */
    public static byte[] buildShakeHand(byte[] aesKey) {
        byte[] randomBytes = new byte[4];
        new SecureRandom().nextBytes(randomBytes);

        byte[] encryptedBytes = encryptAes128(randomBytes, aesKey);

        ProtoWriter pw = new ProtoWriter();
        for (byte b : randomBytes) {
            pw.int32(1, b & 0xFF);
        }
        if (encryptedBytes != null) {
            for (byte b : encryptedBytes) {
                pw.int32(2, b & 0xFF);
            }
        }
        byte[] proto = pw.toByteArray();

        // 附加 2 字节帧头: [SID=1, CID=21]
        byte[] frame = new byte[proto.length + 2];
        frame[0] = (byte) SERVICE_CONSULT;
        frame[1] = (byte) COMMAND_SHAKE_HAND;
        System.arraycopy(proto, 0, frame, 2, proto.length);
        return frame;
    }

    public static byte[] encryptAes128(byte[] data, byte[] key) {
        if (key == null || key.length == 0) {
            return null;
        }
        try {
            // 补齐或截取 16 字节 (128 bit)
            byte[] validKey = new byte[16];
            System.arraycopy(key, 0, validKey, 0, Math.min(key.length, 16));

            SecretKeySpec secretKey = new SecretKeySpec(validKey, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(data);
        } catch (Throwable t) {
            return null;
        }
    }

    public static byte[] hexStringToByteArray(String s) {
        if (s == null || s.trim().isEmpty()) return new byte[0];
        String clean = s.trim().replace(" ", "").replace(":", "");
        int len = clean.length();
        if (len % 2 != 0) clean = "0" + clean;
        len = clean.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(clean.charAt(i), 16) << 4)
                                 + Character.digit(clean.charAt(i + 1), 16));
        }
        return data;
    }

    private static final class ProtoWriter {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();

        void int32(int field, int value) {
            key(field, 0);
            varint(value & 0xffffffffL);
        }

        void string(int field, String value) {
            if (value != null && !value.isEmpty()) {
                byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
                key(field, 2);
                varint(bytes.length);
                out.write(bytes, 0, bytes.length);
            }
        }

        private void key(int field, int wireType) {
            varint(((long) field << 3) | wireType);
        }

        private void varint(long value) {
            while ((value & ~0x7fL) != 0L) {
                out.write((int) ((value & 0x7fL) | 0x80L));
                value >>>= 7;
            }
            out.write((int) value);
        }

        byte[] toByteArray() {
            return out.toByteArray();
        }
    }
}
