package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"ObsoleteSdkInt"})
public class prb {
    @RequiresApi(api = 29)
    public static int a(xb7 xb7Var) {
        int iB = b(xb7Var).b();
        a7b.f("MediaFileUtil", "delete file success, count:" + iB);
        return iB;
    }

    @RequiresApi(api = 29)
    public static orb b(xb7 xb7Var) {
        a7b.f("MediaFileUtil", "get media file begin");
        return oa7.a(MediaStore.Downloads.class, xb7Var);
    }

    @RequiresApi(api = 29)
    public static void c(xb7 xb7Var, PdfDocument pdfDocument) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        a7b.f("MediaFileUtil", "save pdf file begin");
        Uri uriA = b(xb7Var).a();
        if (uriA == null) {
            a7b.f("MediaFileUtil", "save pdf file, uri is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorC = orb.c(uriA);
        if (parcelFileDescriptorC == null) {
            a7b.f("MediaFileUtil", "save pdf file, file descriptor is null");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptorC.getFileDescriptor());
                    try {
                        pdfDocument.writeTo(fileOutputStream);
                        a7b.f("MediaFileUtil", "create pdf file end");
                        pdfDocument.close();
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        fileOutputStream2 = fileOutputStream;
                        a7b.b("MediaFileUtil", "save pdf file, occur io exception");
                        pdfDocument.close();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            pdfDocument.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            parcelFileDescriptorC.close();
                        } catch (IOException unused2) {
                            a7b.b("MediaFileUtil", "save pdf file, close resource occur io exception");
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
                parcelFileDescriptorC.close();
            } catch (Throwable th3) {
                fileOutputStream = fileOutputStream2;
                th = th3;
            }
        } catch (IOException unused4) {
            a7b.b("MediaFileUtil", "save pdf file, close resource occur io exception");
        }
    }

    @RequiresApi(api = 29)
    public static void d(xb7 xb7Var, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        a7b.f("MediaFileUtil", "save pdf file begin");
        Uri uriA = b(xb7Var).a();
        if (uriA == null) {
            a7b.f("MediaFileUtil", "save pdf file, uri is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorC = orb.c(uriA);
        if (parcelFileDescriptorC == null) {
            a7b.f("MediaFileUtil", "save pdf file, file descriptor is null");
            return;
        }
        try {
            fileOutputStream = new FileOutputStream(parcelFileDescriptorC.getFileDescriptor());
            try {
                e(inputStream, fileOutputStream);
                a7b.f("MediaFileUtil", "create pdf file end");
                try {
                    fileOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    parcelFileDescriptorC.close();
                } catch (IOException unused) {
                    a7b.b("MediaFileUtil", "save pdf file, close resource occur io exception");
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        a7b.b("MediaFileUtil", "save pdf file, close resource occur io exception");
                        throw th;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                parcelFileDescriptorC.close();
                throw th;
            }
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
    }

    public static OutputStream e(InputStream inputStream, OutputStream outputStream) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        outputStream.flush();
                        bufferedInputStream.close();
                        return outputStream;
                    }
                    outputStream.write(bArr, 0, i);
                    return outputStream;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return outputStream;
        }
    }
}
