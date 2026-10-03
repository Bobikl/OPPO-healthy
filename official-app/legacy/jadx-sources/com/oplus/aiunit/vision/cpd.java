package com.oplus.aiunit.vision;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes19.dex */
public class cpd {
    public static boolean a() {
        try {
            Class.forName("com.oplus.wrapper.content.pm.PackageInstaller");
            u6b.a("com.oplus.wrapper.content.pm.PackageInstaller已找到");
            return true;
        } catch (ClassNotFoundException unused) {
            u6b.a("com.oplus.wrapper.content.pm.PackageInstaller未找到");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    @RequiresApi(api = 30)
    public static void b(PackageInstaller packageInstaller, PackageInstaller.SessionParams sessionParams, File file, PendingIntent pendingIntent) throws Throwable {
        Throwable th;
        com.oplus.wrapper.content.pm.PackageInstaller.Session session;
        Exception e2;
        if (a()) {
            com.oplus.wrapper.content.pm.PackageInstaller packageInstaller2 = new com.oplus.wrapper.content.pm.PackageInstaller(packageInstaller);
            u6b.a("新PackageInstaller 创建成功");
            com.oplus.wrapper.content.pm.PackageInstaller.Session session2 = null;
            try {
                try {
                    session = new com.oplus.wrapper.content.pm.PackageInstaller.Session(packageInstaller2.openSession(packageInstaller2.createSession(sessionParams)));
                    try {
                        u6b.a("PackageInstaller.Session 创建成功");
                        FileInputStream fileInputStream = new FileInputStream(ParcelFileDescriptor.open(file, 268435456).getFileDescriptor());
                        try {
                            long length = file.length();
                            u6b.a("安装包大小为：" + length);
                            OutputStream outputStreamOpenWrite = session.openWrite("PackageInstaller", 0L, length);
                            try {
                                byte[] bArr = new byte[1048576];
                                while (true) {
                                    int i = fileInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        outputStreamOpenWrite.write(bArr, 0, i);
                                    }
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                                session.fsync(outputStreamOpenWrite);
                                u6b.a("安装包文件流拷贝成功");
                                if (outputStreamOpenWrite != null) {
                                    outputStreamOpenWrite.close();
                                }
                                fileInputStream.close();
                                session.commit(pendingIntent.getIntentSender());
                                u6b.a("新方案静默安装成功");
                            } catch (Throwable th3) {
                                if (outputStreamOpenWrite != null) {
                                    try {
                                        outputStreamOpenWrite.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            fileInputStream.close();
                            throw th5;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        u6b.a("静默安装失败，失败原因堆栈为：\n");
                        e2.printStackTrace();
                        if (session == null) {
                            return;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (0 != 0) {
                        session2.close();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                session = null;
                e2 = e4;
            } catch (Throwable th7) {
                th = th7;
                if (0 != 0) {
                    session2.close();
                }
                throw th;
            }
            session.close();
        }
    }
}
