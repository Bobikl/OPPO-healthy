package com.heytap.speech.engine.breenovad.util;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    public static void copyAssets(Context context, String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2, str));
                    try {
                        copyFile(inputStreamOpen, fileOutputStream2);
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused) {
                            }
                        }
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                        fileOutputStream = fileOutputStream2;
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException unused7) {
            }
        } catch (IOException unused8) {
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpen = null;
        }
    }

    public static void copyAssetsDirToSDCard(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length != 0) {
                String str3 = str2 + File.separator + (str.contains("/") ? str.substring(str.lastIndexOf(47) + 1) : str);
                File file = new File(str3);
                if (!file.exists()) {
                    file.mkdirs();
                }
                for (String str4 : list) {
                    copyAssetsDirToSDCard(context, str + File.separator + str4, str3);
                }
                return;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[1024];
            File file2 = new File(str2 + File.separator + str.substring(str.lastIndexOf(47)));
            if (file2.exists()) {
                return;
            }
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
