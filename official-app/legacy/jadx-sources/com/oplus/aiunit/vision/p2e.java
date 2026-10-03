package com.oplus.aiunit.vision;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import libcore.io.Streams;

/* JADX INFO: loaded from: classes4.dex */
public class p2e {
    @RequiresApi(api = 30)
    public static void a(PackageInstaller.SessionParams sessionParams, File file, PendingIntent pendingIntent) throws Exception {
        if (jvk.m()) {
            Response responseD = ep6.o(new Request.b().c("android.content.pm.PackageInstaller").b("installBackground").e("size", file.length()).f("descriptor", ParcelFileDescriptor.open(file, 268435456)).f("sessionParams", sessionParams).f("broadcastIntent", pendingIntent).a()).d();
            if (responseD.isSuccessful()) {
                return;
            }
            responseD.checkThrowable(Exception.class);
            throw new Exception("response has exception");
        }
        if (jvk.l()) {
            PackageInstaller packageInstaller = ep6.g().getPackageManager().getPackageInstaller();
            try {
                PackageInstaller.Session sessionOpenSession = packageInstaller.openSession(packageInstaller.createSession(sessionParams));
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    try {
                        long length = file.length();
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpen.getFileDescriptor());
                        try {
                            OutputStream outputStreamOpenWrite = sessionOpenSession.openWrite("PackageInstaller", 0L, length);
                            try {
                                Streams.copy(fileInputStream, outputStreamOpenWrite);
                                if (outputStreamOpenWrite != null) {
                                    outputStreamOpenWrite.close();
                                }
                                fileInputStream.close();
                                sessionOpenSession.commit(pendingIntent.getIntentSender());
                                parcelFileDescriptorOpen.close();
                                sessionOpenSession.close();
                            } catch (Throwable th) {
                                if (outputStreamOpenWrite != null) {
                                    try {
                                        outputStreamOpenWrite.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        if (parcelFileDescriptorOpen != null) {
                            try {
                                parcelFileDescriptorOpen.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (sessionOpenSession != null) {
                        try {
                            sessionOpenSession.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            } catch (Exception e2) {
                Log.d("PackageInstallerNative", e2.getMessage());
            }
        }
    }
}
