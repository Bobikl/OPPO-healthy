package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public class pq {
    public static String a = "AES/CTR/NoPadding";
    public static String b = "AES";

    public static String a(String str, String str2) throws Exception {
        byte[] bArrDecode = Base64.decode(str2, 0);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[16];
        System.arraycopy(bArrDecode, 0, bArr, 0, 16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr));
        int length = bArrDecode.length - 16;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 16, bArr2, 0, length);
        return new String(cipher.doFinal(bArr2), StandardCharsets.UTF_8);
    }

    public static String b(String str, String str2) throws Exception {
        return Base64.encodeToString(c(str, str2.getBytes(StandardCharsets.UTF_8)), 0);
    }

    public static byte[] c(String str, byte[] bArr) throws Exception {
        byte[] bArrM = m(16);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArrM));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr2 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArrM, 0, bArr2, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
        return bArr2;
    }

    public static boolean d(String str, File file, File file2) {
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
            try {
                byte[] bArr = new byte[16];
                inputStreamNewInputStream.read(bArr);
                try {
                    CipherOutputStream cipherOutputStream = new CipherOutputStream(Files.newOutputStream(file2.toPath(), new OpenOption[0]), n(str, bArr));
                    try {
                        byte[] bArr2 = new byte[32768];
                        while (true) {
                            int i = inputStreamNewInputStream.read(bArr2);
                            if (i < 0) {
                                cipherOutputStream.flush();
                                cipherOutputStream.close();
                                inputStreamNewInputStream.close();
                                return true;
                            }
                            cipherOutputStream.write(bArr2, 0, i);
                        }
                    } catch (Throwable th) {
                        try {
                            cipherOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    a7b.b("AesUtils", "AesGcmDecrypt file fail=" + e2);
                    inputStreamNewInputStream.close();
                    return false;
                }
            } catch (Throwable th3) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Exception e3) {
            a7b.b("AesUtils", "AesGcmDecrypt file fail=" + e3);
        }
    }

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public static boolean e(String str, String str2, String str3) throws Throwable {
        FileInputStream fileInputStream;
        CipherInputStream cipherInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str2);
            if (!file.exists()) {
                throw new NullPointerException("source file is empty");
            }
            File file2 = new File(str3);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                throw new IOException("create file exception");
            }
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArrM = m(16);
                    cipherInputStream = new CipherInputStream(fileInputStream, o(str, bArrM));
                    try {
                        fileOutputStream2.write(bArrM);
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int i = cipherInputStream.read(bArr);
                            if (i < 0) {
                                fileOutputStream2.flush();
                                h(fileOutputStream2);
                                g(fileInputStream);
                                g(cipherInputStream);
                                return true;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            e.printStackTrace();
                            a7b.f("AesUtils", "aesGcmEncryptFile Exception:" + e);
                            h(fileOutputStream);
                            g(fileInputStream);
                            g(cipherInputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            h(fileOutputStream);
                            g(fileInputStream);
                            g(cipherInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        h(fileOutputStream);
                        g(fileInputStream);
                        g(cipherInputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    cipherInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    cipherInputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
                cipherInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                cipherInputStream = null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
            cipherInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            cipherInputStream = null;
        }
    }

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public static boolean f(byte[] bArr, String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        CipherInputStream cipherInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new NullPointerException("source file is empty");
            }
            File file2 = new File(str2);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                throw new IOException("create file exception");
            }
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArrM = m(16);
                    cipherInputStream = new CipherInputStream(fileInputStream, p(bArr, bArrM, 1));
                    try {
                        fileOutputStream2.write(bArrM);
                        byte[] bArr2 = new byte[32768];
                        while (true) {
                            int i = cipherInputStream.read(bArr2);
                            if (i < 0) {
                                fileOutputStream2.flush();
                                h(fileOutputStream2);
                                g(fileInputStream);
                                g(cipherInputStream);
                                return true;
                            }
                            fileOutputStream2.write(bArr2, 0, i);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            e.printStackTrace();
                            a7b.f("AesUtils", "aesGcmEncryptFile Exception:" + e);
                            h(fileOutputStream);
                            g(fileInputStream);
                            g(cipherInputStream);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            h(fileOutputStream);
                            g(fileInputStream);
                            g(cipherInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        h(fileOutputStream);
                        g(fileInputStream);
                        g(cipherInputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    cipherInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    cipherInputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
                cipherInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                cipherInputStream = null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
            cipherInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            cipherInputStream = null;
        }
    }

    public static void g(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                a7b.m("AesUtils", "[closeInputStream]  IOException " + e2.getMessage());
            }
        }
    }

    public static void h(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                a7b.m("AesUtils", "[closeOutputStream]  IOException " + e2.getMessage());
            }
        }
    }

    public static String i(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[16];
        byte[] bArrDecode = java.util.Base64.getDecoder().decode(str2);
        System.arraycopy(bArrDecode, 0, bArr, 0, 16);
        Cipher cipher = Cipher.getInstance(a);
        cipher.init(2, new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), b), new IvParameterSpec(bArr));
        int length = bArrDecode.length - 16;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 16, bArr2, 0, length);
        return new String(cipher.doFinal(bArr2));
    }

    public static boolean j(String str, String str2, String str3) throws Throwable {
        CipherInputStream cipherInputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    throw new NullPointerException("Decrypt file is empty");
                }
                File file2 = new File(str3);
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                byte[] bArr = new byte[16];
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        if (fileInputStream.read(bArr) != 16) {
                            a7b.m("AesUtils", "[decryptFile]  read bytes length is not IV_LENGTH ");
                            g(fileInputStream);
                        } else {
                            Cipher cipherQ = q(str, bArr, 2);
                            if (cipherQ == null) {
                                g(fileInputStream);
                            } else {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                                try {
                                    cipherInputStream = new CipherInputStream(fileInputStream, cipherQ);
                                    try {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int i = cipherInputStream.read(bArr2);
                                            if (i == -1) {
                                                h(bufferedOutputStream2);
                                                g(cipherInputStream);
                                                return true;
                                            }
                                            bufferedOutputStream2.write(bArr2, 0, i);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        try {
                                            a7b.m("AesUtils", "IOException exception:" + e);
                                            h(bufferedOutputStream);
                                            g(cipherInputStream);
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            h(bufferedOutputStream);
                                            g(cipherInputStream);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        h(bufferedOutputStream);
                                        g(cipherInputStream);
                                        throw th;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    cipherInputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cipherInputStream = null;
                                }
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        a7b.m("AesUtils", "[decryptFile]  IOException " + e.getMessage());
                        g(fileInputStream);
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileInputStream = null;
                }
                h(null);
                g(null);
                return false;
            } catch (Throwable th4) {
                th = th4;
                cipherInputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            cipherInputStream = null;
        }
    }

    public static boolean k(byte[] bArr, String str, String str2) throws Throwable {
        CipherInputStream cipherInputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new NullPointerException("encryptFile file is empty");
            }
            File file2 = new File(str2);
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.createNewFile()) {
                throw new IOException("create file exception");
            }
            byte[] bArr2 = new byte[16];
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    if (fileInputStream.read(bArr2) != 16) {
                        a7b.m("AesUtils", "decryptFile read bytes length is not IV_LENGTH ");
                        g(fileInputStream);
                    } else {
                        Cipher cipherP = p(bArr, bArr2, 2);
                        if (cipherP == null) {
                            g(fileInputStream);
                        } else {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                            try {
                                cipherInputStream = new CipherInputStream(fileInputStream, cipherP);
                                try {
                                    byte[] bArr3 = new byte[4096];
                                    while (true) {
                                        int i = cipherInputStream.read(bArr3);
                                        if (i == -1) {
                                            h(bufferedOutputStream2);
                                            g(cipherInputStream);
                                            return true;
                                        }
                                        bufferedOutputStream2.write(bArr3, 0, i);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    try {
                                        a7b.m("AesUtils", "decryptFile IOException exception:" + e);
                                        h(bufferedOutputStream);
                                        g(cipherInputStream);
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        h(bufferedOutputStream);
                                        g(cipherInputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    h(bufferedOutputStream);
                                    g(cipherInputStream);
                                    throw th;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                cipherInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                cipherInputStream = null;
                            }
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    a7b.m("AesUtils", "decryptFile  IOException " + e.getMessage());
                    g(fileInputStream);
                }
            } catch (IOException e5) {
                e = e5;
                fileInputStream = null;
            }
            h(null);
            g(null);
            return false;
        } catch (Exception e6) {
            e = e6;
            cipherInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            cipherInputStream = null;
        }
    }

    public static String l(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM = m(16);
        Cipher cipher = Cipher.getInstance(a);
        cipher.init(1, new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), b), new IvParameterSpec(bArrM));
        byte[] bArrDoFinal = cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8));
        byte[] bArr = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArrM, 0, bArr, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr, 16, bArrDoFinal.length);
        return java.util.Base64.getEncoder().encodeToString(bArr);
    }

    public static byte[] m(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static Cipher n(String str, byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES"), new GCMParameterSpec(128, bArr));
        return cipher;
    }

    public static Cipher o(String str, byte[] bArr) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES"), new GCMParameterSpec(128, bArr));
            return cipher;
        } catch (Exception e2) {
            a7b.f("AesUtils", "getEncryptCipher Exception:" + e2);
            throw e2;
        }
    }

    public static Cipher p(byte[] bArr, byte[] bArr2, int i) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(i, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
            return cipher;
        } catch (Exception e2) {
            a7b.f("AesUtils", "getEncryptCipher Exception:" + e2);
            throw e2;
        }
    }

    public static Cipher q(String str, byte[] bArr, int i) {
        Cipher cipher = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "AES");
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(i, secretKeySpec, new GCMParameterSpec(128, bArr));
            return cipher;
        } catch (InvalidAlgorithmParameterException e2) {
            a7b.m("AesUtils", "InvalidAlgorithmParameterException exception:" + e2);
            return cipher;
        } catch (InvalidKeyException e3) {
            a7b.m("AesUtils", "InvalidKeyException exception:" + e3);
            return cipher;
        } catch (NoSuchAlgorithmException e4) {
            a7b.m("AesUtils", "NoSuchAlgorithmException exception:" + e4);
            return cipher;
        } catch (NoSuchPaddingException e5) {
            a7b.m("AesUtils", "NoSuchPaddingException exception:" + e5);
            return cipher;
        }
    }
}
