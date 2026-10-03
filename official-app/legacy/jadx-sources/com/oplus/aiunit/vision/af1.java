package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class af1 implements etf<Bitmap> {

    @Nullable
    public final ch0 a;
    public static final brd<Integer> COMPRESSION_QUALITY = brd.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final brd<Bitmap.CompressFormat> COMPRESSION_FORMAT = brd.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public af1(@NonNull ch0 ch0Var) {
        this.a = ch0Var;
    }

    @Override // com.oplus.aiunit.vision.etf
    @NonNull
    public EncodeStrategy a(@NonNull erd erdVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // com.oplus.aiunit.vision.im6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull usf<Bitmap> usfVar, @NonNull File file, @NonNull erd erdVar) {
        boolean z;
        Bitmap bitmap = usfVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, erdVar);
        x68.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = p6b.b();
            int iIntValue = ((Integer) erdVar.a(COMPRESSION_QUALITY)).intValue();
            OutputStream h82Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        h82Var = this.a != null ? new h82(fileOutputStream, this.a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, h82Var);
                        h82Var.close();
                        try {
                            h82Var.close();
                        } catch (IOException unused) {
                        }
                        z = true;
                    } catch (IOException e2) {
                        e = e2;
                        h82Var = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (h82Var != null) {
                            try {
                                h82Var.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        h82Var = fileOutputStream;
                        if (h82Var != null) {
                            try {
                                h82Var.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
                if (Log.isLoggable("BitmapEncoder", 2)) {
                    Log.v("BitmapEncoder", "Compressed with type: " + compressFormatD + " of size " + uqk.i(bitmap) + " in " + p6b.a(jB) + ", options format: " + erdVar.a(COMPRESSION_FORMAT) + ", hasAlpha: " + bitmap.hasAlpha());
                }
                x68.e();
                return z;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            x68.e();
            throw th3;
        }
    }

    public final Bitmap.CompressFormat d(Bitmap bitmap, erd erdVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) erdVar.a(COMPRESSION_FORMAT);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }
}
