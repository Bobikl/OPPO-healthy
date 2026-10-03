package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.annotation.RequiresApi;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public class e4a {
    public static orb a(f4a f4aVar) {
        a7b.f("ImageMediaFileUtil", "get image media file begin");
        return oa7.a(MediaStore.Images.ImageColumns.class, f4aVar);
    }

    @RequiresApi(api = 29)
    @SuppressLint({"ObsoleteSdkInt"})
    public static Uri b(f4a f4aVar, Bitmap bitmap) {
        a7b.f("ImageMediaFileUtil", "save image begin");
        Uri uriA = a(f4aVar).a();
        ParcelFileDescriptor parcelFileDescriptorC = orb.c(uriA);
        if (parcelFileDescriptorC == null) {
            a7b.f("ImageMediaFileUtil", "save image,file descriptor is null");
            return uriA;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(parcelFileDescriptorC.getFileDescriptor());
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    a7b.f("ImageMediaFileUtil", "save image end");
                    try {
                        fileOutputStream2.close();
                        parcelFileDescriptorC.close();
                    } catch (IOException e2) {
                        a7b.b("ImageMediaFileUtil", "save image fail in file stream close, message: " + e2.getMessage());
                    }
                    return uriA;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    a7b.b("ImageMediaFileUtil", "save image failed, file not found, message:" + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            a7b.b("ImageMediaFileUtil", "save image fail in file stream close, message: " + e4.getMessage());
                            return uriA;
                        }
                    }
                    parcelFileDescriptorC.close();
                    return uriA;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            a7b.b("ImageMediaFileUtil", "save image fail in file stream close, message: " + e5.getMessage());
                            throw th;
                        }
                    }
                    parcelFileDescriptorC.close();
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
