package com.heytap.store.base.core.util.encryption;

import android.content.Context;
import android.content.res.AssetManager;
import io.netty.util.internal.StringUtil;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
public class RsaOpenSSL {
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private RSAPrivateKey privateKey;
    private RSAPublicKey publicKey;

    public static String byteArrayToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = HEX_CHAR;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
            if (i < bArr.length - 1) {
                sb.append(StringUtil.SPACE);
            }
        }
        return sb.toString();
    }

    public static String decode(Context context, String str) {
        RsaOpenSSL rsaOpenSSL = getRsaOpenSSL(context);
        try {
            return new String(rsaOpenSSL.decrypt(rsaOpenSSL.getPrivateKey(), Base64.decode(str)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String encode(Context context, String str) {
        RsaOpenSSL rsaOpenSSL = getRsaOpenSSL(context);
        try {
            return Base64.encode(rsaOpenSSL.encrypt(rsaOpenSSL.getPublicKey(), str.getBytes()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static RsaOpenSSL getRsaOpenSSL(Context context) {
        RsaOpenSSL rsaOpenSSL = new RsaOpenSSL();
        AssetManager assets = context.getAssets();
        try {
            rsaOpenSSL.loadPublicKey(assets.open("rsa_public_key.pem"));
            System.out.println("加载公钥成功");
        } catch (Exception e2) {
            System.err.println(e2.getMessage());
            System.err.println("加载公钥失败");
        }
        try {
            rsaOpenSSL.loadPrivateKey(assets.open("rsa_private_key_pkcs8.pem"));
            System.out.println("加载私钥成功");
        } catch (Exception e3) {
            System.err.println(e3.getMessage());
            System.err.println("加载私钥失败");
        }
        return rsaOpenSSL;
    }

    public byte[] decrypt(RSAPrivateKey rSAPrivateKey, byte[] bArr) throws Exception {
        if (rSAPrivateKey == null) {
            throw new Exception("解密私钥为空, 请设置");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, rSAPrivateKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            throw new Exception("解密私钥非法,请检查");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此解密算法");
        } catch (BadPaddingException unused3) {
            throw new Exception("密文数据已损坏");
        } catch (IllegalBlockSizeException unused4) {
            throw new Exception("密文长度非法");
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public byte[] encrypt(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey == null) {
            throw new Exception("加密公钥为空, 请设置");
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException unused) {
            throw new Exception("加密公钥非法,请检查");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此加密算法");
        } catch (BadPaddingException unused3) {
            throw new Exception("明文数据已损坏");
        } catch (IllegalBlockSizeException unused4) {
            throw new Exception("明文长度非法");
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public RSAPrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public RSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    public void loadPrivateKey(InputStream inputStream) throws Exception {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    inputStream.close();
                    loadPrivateKey(byteArrayOutputStream.toByteArray());
                    return;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                    bArr = new byte[1024];
                }
            }
        } catch (IOException unused) {
            throw new Exception("私钥数据读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("私钥输入流为空");
        }
    }

    public void loadPublicKey(InputStream inputStream) throws Exception {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    loadPublicKey(sb.toString());
                    return;
                } else if (line.charAt(0) != '-') {
                    sb.append(line);
                    sb.append(StringUtil.CARRIAGE_RETURN);
                }
            }
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }

    public void loadPrivateKey(byte[] bArr) throws Exception {
        try {
            this.privateKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
        } catch (NullPointerException unused) {
            throw new Exception("私钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("私钥非法");
        }
    }

    public void loadPublicKey(String str) throws Exception {
        try {
            this.publicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(new BASE64Decoder().decodeBuffer(str)));
        } catch (IOException unused) {
            throw new Exception("公钥数据内容读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥数据为空");
        } catch (NoSuchAlgorithmException unused3) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException unused4) {
            throw new Exception("公钥非法");
        }
    }
}
