package com.oplus.backup.sdk.common.utils;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes19.dex */
public class FileUtils {
    public static final String TAG = "FileUtils";

    public static boolean copyFile(InputStream inputStream, String str) throws Throwable {
        if (inputStream == null || TextUtils.isEmpty(str)) {
            return false;
        }
        mkdirs(new File(str).getParentFile());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            inputStream.close();
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    fileOutputStream = fileOutputStream2;
                    throw e2;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    inputStream.close();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Exception unused2) {
        }
    }

    public static boolean copyFolder(String str, String str2) throws Throwable {
        try {
            new File(str2).mkdirs();
            String[] list = new File(str).list();
            for (int i = 0; i < list.length; i++) {
                String str3 = File.separator;
                File file = str.endsWith(str3) ? new File(str + list[i]) : new File(str + str3 + list[i]);
                if (file.isFile()) {
                    nioTransferCopy(file, new File(str2 + "/" + file.getName().toString()));
                }
                if (file.isDirectory()) {
                    copyFolder(str + "/" + list[i], str2 + "/" + list[i]);
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean deleteFileOrFolder(File file) {
        if (file == null) {
            return false;
        }
        try {
            boolean z = true;
            if (!file.exists()) {
                return true;
            }
            if (file.isFile()) {
                return file.delete();
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (!deleteFileOrFolder(file2)) {
                            z = false;
                        }
                    }
                }
                if (!file.delete()) {
                    return false;
                }
            }
            return z;
        } catch (Exception unused) {
            BRLog.e("FileUtils", "deleteFileOrFolder exception");
            return false;
        }
    }

    public static boolean isEmptyFolder(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return false;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!isEmptyFolder(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean mkdirs(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.isFile()) {
            File file2 = new File(file.getAbsolutePath() + file.lastModified());
            if (file.renameTo(file2)) {
                return file.mkdirs();
            }
            BRLog.w("FileUtils", "file.renameTo false, " + BRLog.getModifiedFile(file2));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    public static boolean nioTransferCopy(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileChannel channel;
        FileChannel fileChannel;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream;
        FileChannel fileChannel2;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        channel = null;
        FileChannel channel2 = null;
        fileChannel = null;
        fileChannel = null;
        FileChannel fileChannel3 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    channel = fileInputStream.getChannel();
                    try {
                        channel2 = fileOutputStream.getChannel();
                        channel.transferTo(0L, channel.size(), channel2);
                        fileInputStream.close();
                        channel.close();
                        fileOutputStream.close();
                        if (channel2 == null) {
                            return true;
                        }
                        channel2.close();
                        return true;
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream2 = fileOutputStream;
                        fileChannel = channel2;
                        fileChannel3 = channel;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream;
                            fileChannel2 = fileChannel;
                            fileOutputStream = fileOutputStream2;
                            channel = fileChannel3;
                            fileInputStream3 = fileInputStream2;
                            if (fileInputStream3 != null) {
                                fileInputStream3.close();
                            }
                            if (channel != null) {
                                channel.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (fileChannel2 != null) {
                                fileChannel2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        fileChannel2 = channel2;
                        fileInputStream3 = fileInputStream2;
                        if (fileInputStream3 != null) {
                            fileInputStream3.close();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    fileChannel = null;
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                    fileInputStream3 = fileInputStream;
                    fileChannel2 = channel;
                    if (fileInputStream3 != null) {
                        fileInputStream3.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                fileChannel = null;
                fileOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                channel = null;
            }
        } catch (IOException e5) {
            e = e5;
            fileChannel = null;
            fileOutputStream2 = null;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            channel = null;
        }
    }

    public static boolean copyFile(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    fileInputStream = new FileInputStream(str);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e2) {
                            fileOutputStream = fileOutputStream2;
                            throw e2;
                        } catch (Exception unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (fileInputStream == null) {
                                return false;
                            }
                            fileInputStream.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        throw e3;
                    } catch (Exception unused2) {
                    }
                } else {
                    fileInputStream = null;
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }
}
