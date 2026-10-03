package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.FileObserver;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class cb {
    public static final ConcurrentHashMap<String, Properties> a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, FileObserver> f10014c = new ConcurrentHashMap<>();

    public class a extends FileObserver {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, File file) {
            super(str, i);
            this.a = file;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "onEvent: " + i + " path: " + this.a.getName());
            if (i == 8) {
                cb.i(this.a.getName());
                AcLogUtil.e("AcMultiProcessFileUtilBase", "modify remove cache: " + this.a.getName());
                return;
            }
            if (i == 64 || i == 512) {
                cb.i(this.a.getName());
                AcLogUtil.e("AcMultiProcessFileUtilBase", "delete remove cache: " + this.a.getName());
            }
        }
    }

    public static void a(Context context, String str) {
        String name = new File(context.getFilesDir(), str + ".properties").getName();
        i(name);
        AcLogUtil.i("AcMultiProcessFileUtilBase", "clearCache: " + name);
    }

    @WorkerThread
    public static synchronized void b(Context context, String str) {
        File file = new File(context.getFilesDir(), str + ".properties");
        AcLogUtil.i("AcMultiProcessFileUtilBase", "Deleting file: " + file.getName());
        if (!file.exists()) {
            AcLogUtil.i("AcMultiProcessFileUtilBase", "File does not exist, skipping deletion");
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        if (file.delete()) {
                            AcLogUtil.i("AcMultiProcessFileUtilBase", "File deleted successfully");
                            i(file.getName());
                        } else {
                            AcLogUtil.e("AcMultiProcessFileUtilBase", "Failed to delete file");
                        }
                        fileLockLock.release();
                        channel.close();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        fileLockLock.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (FileNotFoundException unused) {
            AcLogUtil.w("AcMultiProcessFileUtilBase", "File already deleted by other process, fileName: " + str);
        } catch (Throwable th6) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "Error deleting file", th6);
        }
    }

    @WorkerThread
    public static synchronized void c(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), str + ".properties");
        AcLogUtil.i("AcMultiProcessFileUtilBase", "delete key from " + str + ": " + str2);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        Properties properties = new Properties();
                        if (file.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                properties.load(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (properties.containsKey(str2)) {
                            properties.remove(str2);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                properties.store(fileOutputStream, (String) null);
                                i(file.getName());
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        }
                        fileLockLock.release();
                        channel.close();
                        randomAccessFile.close();
                    } catch (Throwable th5) {
                        fileLockLock.release();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        } catch (FileNotFoundException unused) {
            AcLogUtil.w("AcMultiProcessFileUtilBase", "deleteFromFile file not found, fileName: " + str);
        } catch (Throwable th10) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "deleteFromFile fail", th10);
        }
    }

    public static boolean d(File file, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        Long l2 = b.get(str);
        return l2 == null || file.lastModified() == l2.longValue();
    }

    @WorkerThread
    public static String e(Context context, String str, String str2) {
        File file = new File(context.getFilesDir(), str + ".properties");
        String name = file.getName();
        Properties properties = a.get(name);
        if (properties != null && !TextUtils.isEmpty(properties.getProperty(str2))) {
            if (d(file, name)) {
                AcLogUtil.i("AcMultiProcessFileUtilBase", "read from cache, file: " + name);
                return properties.getProperty(str2);
            }
            i(name);
        }
        try {
            return h(name, str2, file);
        } catch (Throwable th) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "readFromFile error", th);
            return "";
        }
    }

    public static synchronized Properties f(File file) {
        Properties properties;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        FileLock fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                        try {
                            properties = new Properties();
                            if (file.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    properties.load(fileInputStream);
                                    if (properties.isEmpty()) {
                                        AcLogUtil.e("AcMultiProcessFileUtilBase", "readWithFileLock but properties.isEmpty");
                                        properties.load(fileInputStream);
                                    }
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                            fileLockLock.release();
                            channel.close();
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            fileLockLock.release();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                throw th8;
            }
        } catch (FileNotFoundException unused) {
            AcLogUtil.w("AcMultiProcessFileUtilBase", "readWithFileLock file not found, fileName: " + file.getName());
            return null;
        } catch (Throwable th9) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "readWithFileLock fail", th9);
            return null;
        }
        return properties;
    }

    public static void g(File file) {
        a aVar = new a(file.getParentFile().getPath(), 584, file);
        if (f10014c.putIfAbsent(file.getName(), aVar) == null) {
            aVar.startWatching();
        }
    }

    public static String h(String str, String str2, File file) {
        synchronized (cb.class) {
            ConcurrentHashMap<String, Properties> concurrentHashMap = a;
            Properties properties = concurrentHashMap.get(str);
            if (properties != null && !TextUtils.isEmpty(properties.getProperty(str2))) {
                return properties.getProperty(str2);
            }
            Properties propertiesF = f(file);
            if (propertiesF == null) {
                AcLogUtil.e("AcMultiProcessFileUtilBase", "read file fail, porps = null");
                return "";
            }
            if (!propertiesF.isEmpty() && propertiesF.containsKey(str2)) {
                concurrentHashMap.put(str, propertiesF);
                b.put(str, Long.valueOf(file.lastModified()));
            }
            g(file);
            return propertiesF.getProperty(str2);
        }
    }

    public static void i(String str) {
        a.remove(str);
        b.remove(str);
    }

    @WorkerThread
    public static synchronized void j(Context context, String str, String str2, String str3) {
        File file = new File(context.getFilesDir(), str + ".properties");
        AcLogUtil.i("AcMultiProcessFileUtilBase", "save " + str + " key: " + str2);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockLock = channel.lock();
                    try {
                        Properties properties = new Properties();
                        if (file.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                properties.load(fileInputStream);
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        properties.setProperty(str2, str3);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            properties.store(fileOutputStream, (String) null);
                            i(file.getName());
                            fileOutputStream.close();
                            fileLockLock.release();
                            channel.close();
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        fileLockLock.release();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                }
                throw th8;
            }
        } catch (Throwable th10) {
            AcLogUtil.e("AcMultiProcessFileUtilBase", "saveToFile fail!", th10);
        }
    }
}
