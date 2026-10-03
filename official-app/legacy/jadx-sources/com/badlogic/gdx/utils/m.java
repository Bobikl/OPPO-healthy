package com.badlogic.gdx.utils;

import com.heytap.store.base.core.util.DeviceInfoUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Random;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes13.dex */
public class m {
    public static Architecture architecture;
    public static final HashSet<String> b;
    public static Architecture.Bitness bitness;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Random f1342c;

    @Deprecated
    public static boolean is64Bit;

    @Deprecated
    public static boolean isARM;

    @Deprecated
    public static boolean isAndroid;

    @Deprecated
    public static boolean isIos;

    @Deprecated
    public static boolean isLinux;

    @Deprecated
    public static boolean isMac;

    @Deprecated
    public static boolean isWindows;
    public static Os os;
    public String a;

    static {
        Architecture.Bitness bitness2 = Architecture.Bitness._32;
        bitness = bitness2;
        Architecture architecture2 = Architecture.x86;
        architecture = architecture2;
        if (System.getProperty("os.name").contains("Windows")) {
            os = Os.Windows;
        } else if (System.getProperty("os.name").contains("Linux")) {
            os = Os.Linux;
        } else if (System.getProperty("os.name").contains("Mac")) {
            os = Os.MacOsX;
        }
        if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
            architecture = Architecture.ARM;
        } else if (System.getProperty("os.arch").startsWith("riscv")) {
            architecture = Architecture.RISCV;
        } else if (System.getProperty("os.arch").startsWith("loongarch")) {
            architecture = Architecture.LOONGARCH;
        }
        if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
            bitness = Architecture.Bitness._64;
        } else if (System.getProperty("os.arch").contains("128")) {
            bitness = Architecture.Bitness._128;
        }
        boolean z = System.getProperty("moe.platform.name") != null;
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            os = Os.Android;
            bitness = bitness2;
            architecture = architecture2;
        }
        if (z || (os != Os.Android && os != Os.Windows && os != Os.Linux && os != Os.MacOsX)) {
            os = Os.IOS;
            bitness = bitness2;
            architecture = architecture2;
        }
        isWindows = os == Os.Windows;
        isLinux = os == Os.Linux;
        isMac = os == Os.MacOsX;
        isIos = os == Os.IOS;
        isAndroid = os == Os.Android;
        isARM = architecture == Architecture.ARM;
        is64Bit = bitness == Architecture.Bitness._64;
        b = new HashSet<>();
        f1342c = new Random();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized boolean d(String str) {
        return b.contains(str);
    }

    public static synchronized void j(String str) {
        b.add(str);
    }

    public String b(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                crc32.update(bArr, 0, i);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a(inputStream);
                throw th;
            }
        }
        a(inputStream);
        return Long.toString(crc32.getValue(), 16);
    }

    public final File c(String str, String str2, File file) throws Throwable {
        String strB;
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        if (file.exists()) {
            try {
                strB = b(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                strB = null;
            }
        } else {
            strB = null;
        }
        if (strB == null || !strB.equals(str2)) {
            try {
                InputStream inputStreamI = i(str);
                try {
                    file.getParentFile().mkdirs();
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStreamI.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        a(inputStreamI);
                        a(fileOutputStream);
                    } catch (IOException e2) {
                        e = e2;
                        inputStream = inputStreamI;
                        try {
                            throw new SharedLibraryLoadRuntimeException("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e);
                        } catch (Throwable th) {
                            th = th;
                            a(inputStream);
                            a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamI;
                        a(inputStream);
                        a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
        return file;
    }

    public void e(String str) {
        String str2;
        if (os == Os.IOS) {
            return;
        }
        synchronized (m.class) {
            if (d(str)) {
                return;
            }
            String strH = h(str);
            try {
                if (os == Os.Android) {
                    System.loadLibrary(strH);
                } else {
                    g(strH);
                }
                j(str);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't load shared library '");
                sb.append(strH);
                sb.append("' for target: ");
                if (os == Os.Android) {
                    str2 = DeviceInfoUtil.SYSTEM_NAME;
                } else {
                    str2 = System.getProperty("os.name") + ", " + architecture.name() + ", " + bitness.name().substring(1) + "-bit";
                }
                sb.append(str2);
                throw new SharedLibraryLoadRuntimeException(sb.toString(), th);
            }
        }
    }

    public final Throwable f(String str, String str2, File file) {
        try {
            System.load(c(str, str2, file).getAbsolutePath());
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public final void g(String str) {
        String strB = b(i(str));
        String name = new File(str).getName();
        Throwable thF = f(str, strB, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + strB, name));
        if (thF == null) {
            return;
        }
        try {
            File fileCreateTempFile = File.createTempFile(strB, null);
            if (fileCreateTempFile.delete() && f(str, strB, fileCreateTempFile) == null) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (f(str, strB, new File(System.getProperty("user.home") + "/.libgdx/" + strB, name)) == null) {
            return;
        }
        if (f(str, strB, new File(".temp/" + strB, name)) == null) {
            return;
        }
        File file = new File(System.getProperty("java.library.path"), str);
        if (!file.exists()) {
            throw new SharedLibraryLoadRuntimeException(thF);
        }
        System.load(file.getAbsolutePath());
    }

    public String h(String str) {
        if (os == Os.Android) {
            return str;
        }
        return os.getLibPrefix() + str + architecture.toSuffix() + bitness.toSuffix() + "." + os.getLibExtension();
    }

    public final InputStream i(String str) {
        if (this.a == null) {
            InputStream resourceAsStream = m.class.getResourceAsStream("/" + str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new SharedLibraryLoadRuntimeException("Unable to read file for extraction: " + str);
        }
        try {
            ZipFile zipFile = new ZipFile(this.a);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return zipFile.getInputStream(entry);
            }
            throw new SharedLibraryLoadRuntimeException("Couldn't find '" + str + "' in JAR: " + this.a);
        } catch (IOException e2) {
            throw new SharedLibraryLoadRuntimeException("Error reading '" + str + "' in JAR: " + this.a, e2);
        }
    }
}
