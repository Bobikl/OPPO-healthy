package com.oplus.aiunit.vision;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public class qb7 {
    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        return file.mkdir();
    }

    public static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static File c(String str) {
        if (d(str)) {
            return null;
        }
        return new File(str);
    }

    public static boolean d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(File file, byte[] bArr, boolean z, boolean z2) throws Throwable {
        boolean z3 = false;
        if (bArr == null || !b(file)) {
            return false;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                try {
                    channel.position(channel.size());
                    channel.write(ByteBuffer.wrap(bArr));
                    if (z2) {
                        channel.force(true);
                    }
                    try {
                        channel.close();
                        try {
                            fileOutputStream.close();
                            return true;
                        } catch (IOException e2) {
                            e = e2;
                            z3 = true;
                            e.printStackTrace();
                            return z3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static boolean f(String str, byte[] bArr, boolean z, boolean z2) {
        return e(c(str), bArr, z, z2);
    }
}
