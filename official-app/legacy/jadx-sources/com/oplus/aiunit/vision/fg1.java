package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Size;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes15.dex */
public class fg1 {
    public static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] c(Bitmap bitmap, long j2) {
        if (bitmap.getAllocationByteCount() <= j2) {
            byte[] bArrB = b(bitmap);
            StringBuilder sb = new StringBuilder();
            sb.append("less targetSize,it is ");
            sb.append(bArrB.length);
            return bArrB;
        }
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap bitmapD = d(bitmap, width, height, byteArrayOutputStream, 100);
        int i = 0;
        while (byteArrayOutputStream.size() > j2 && i <= 10) {
            width /= 2;
            height /= 2;
            i++;
            byteArrayOutputStream.reset();
            bitmapD = d(bitmapD, width, height, byteArrayOutputStream, 100);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("over targetSize,it is ");
        sb2.append(byteArray.length);
        return byteArray;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2, ByteArrayOutputStream byteArrayOutputStream, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        return bitmapCreateBitmap;
    }

    public static Bitmap e(Uri uri) {
        try {
            return MediaStore.Images.Media.getBitmap(b78.a().getContentResolver(), uri);
        } catch (IOException e2) {
            a7b.c(cg1.TAG, "getBitmapFromUri error", e2);
            return null;
        }
    }

    public static Bitmap f(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        try {
            InputStream inputStreamOpenRawResource = b78.a().getResources().openRawResource(i);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options);
            inputStreamOpenRawResource.close();
            return bitmapDecodeStream;
        } catch (IOException e2) {
            a7b.b(cg1.TAG, e2.toString());
            return null;
        }
    }

    public static Bitmap g(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap h(Uri uri) {
        ContentResolver contentResolver = b78.a().getContentResolver();
        try {
            return contentResolver.loadThumbnail(uri, new Size(512, 512), null);
        } catch (Exception e2) {
            a7b.b(cg1.TAG, e2.getMessage());
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri), new ImageDecoder.OnHeaderDecodedListener() { // from class: com.oplus.aiunit.vision.zf1
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        imageDecoder.setTargetSize(512, 512);
                    }
                });
            } catch (Exception e3) {
                a7b.b(cg1.TAG, e3.getMessage());
                return null;
            }
        }
    }

    public static Bitmap j(int i) {
        Context contextA = b78.a();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextA.getResources(), i);
        if (bitmapDecodeResource != null) {
            return bitmapDecodeResource;
        }
        Drawable drawable = contextA.getDrawable(i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = ejg.a(contextA, 36.0f);
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = ejg.a(contextA, 36.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
