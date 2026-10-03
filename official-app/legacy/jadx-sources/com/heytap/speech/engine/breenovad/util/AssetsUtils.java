package com.heytap.speech.engine.breenovad.util;

import android.content.Context;
import com.oplus.aiunit.vision.k18;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class AssetsUtils {
    /* JADX WARN: Code duplicated, block: B:56:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[SYNTHETIC] */
    public static boolean copyAssetsFile(Context context, String str, String str2) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        boolean z = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                try {
                    File file = new File(str2);
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                    try {
                        byte[] bArr = new byte[k18.GL_BYTE];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                        fileOutputStream2.flush();
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        z = true;
                        fileOutputStream2.close();
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    if (fileOutputStream != null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        } catch (Exception unused3) {
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamOpen = null;
        }
        return z;
    }
}
