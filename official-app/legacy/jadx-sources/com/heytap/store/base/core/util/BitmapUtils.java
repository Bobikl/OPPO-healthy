package com.heytap.store.base.core.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapUtils {
    private static final String TAG = "BitmapUtils";

    private BitmapUtils() {
    }

    public static Bitmap base64ToBitmap(String str) {
        if (str.contains("data:image")) {
            str = str.split(",")[1];
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j2, boolean z) {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j2) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            while (byteArrayOutputStream.size() > j2 && (i = i - 5) >= 0) {
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (z && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (byteArrayOutputStream.size() > j2) {
            return null;
        }
        return byteArray;
    }

    public static Bitmap compressImage(Bitmap bitmap, int i) {
        if (bitmap.getByteCount() / 1024 <= i) {
            return bitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > i && i2 > 0) {
            byteArrayOutputStream.reset();
            i2 -= 10;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }

    public static Bitmap getBitmapFromView(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static boolean isLongImage(int i, int i2) {
        if (i <= DeviceInfoUtil.screenWidth && i2 <= DeviceInfoUtil.screenHeight) {
            return false;
        }
        float f = i;
        float f2 = i2;
        return f / f2 > 2.3f || f2 / f > 2.3f;
    }

    public static int readBitmapDigree(String str) {
        ExifInterface exifInterface;
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e2) {
            e2.printStackTrace();
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public static BitmapFactory.Options readBitmapOptions(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return options;
    }

    public static void recycleBitmap(Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            return;
        }
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static void scanPhotos(String str, Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
