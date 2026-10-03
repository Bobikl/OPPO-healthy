package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes19.dex */
public class wv {
    public static Bitmap a(ImageItem imageItem, int i) {
        Uri uriFromFile;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            uriFromFile = Uri.parse(imageItem.mUriPath);
            try {
                parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(uriFromFile, "r");
            } catch (Exception e2) {
                e = e2;
                ltl.i("AlbumImageUtil", "[adjustFdBestPosToBitmap] Exception " + e.getMessage());
                parcelFileDescriptorOpenFileDescriptor = null;
            }
        } catch (Exception e3) {
            e = e3;
            uriFromFile = null;
        }
        if (parcelFileDescriptorOpenFileDescriptor == null && !TextUtils.isEmpty(imageItem.mCutPath)) {
            try {
                uriFromFile = Uri.fromFile(new File(imageItem.mCutPath));
                parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(uriFromFile, "r");
            } catch (Exception e4) {
                ltl.i("AlbumImageUtil", "[adjustFdBestPosToBitmap] Exception1 " + e4.getMessage());
            }
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            File file = new File(ntl.m().f().m().n(true), ybb.b(imageItem.mUriPath) + ".jpg");
            if (file.exists()) {
                try {
                    uriFromFile = Uri.fromFile(file);
                    parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(uriFromFile, "r");
                } catch (FileNotFoundException e5) {
                    ltl.i("AlbumImageUtil", "[adjustFdBestPosToBitmap] FileNotFoundException2 " + e5.getMessage());
                }
            }
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            return null;
        }
        int iZ = cg1.z(uriFromFile);
        boolean z = iZ == 90 || iZ == 270;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
        int iB = b(z ? options.outHeight : options.outWidth, i);
        options.inJustDecodeBounds = false;
        options.inSampleSize = iB;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
        if (bitmapDecodeFileDescriptor == null) {
            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        }
        if (iZ != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(iZ);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, false);
            if (bitmapCreateBitmap != bitmapDecodeFileDescriptor && !bitmapDecodeFileDescriptor.isRecycled()) {
                bitmapDecodeFileDescriptor.recycle();
            }
            bitmapDecodeFileDescriptor = bitmapCreateBitmap;
        }
        try {
            parcelFileDescriptorOpenFileDescriptor.close();
        } catch (Exception unused) {
        }
        return bitmapDecodeFileDescriptor;
    }

    public static int b(int i, int i2) {
        int i3 = 1;
        for (int i4 = i / 2; i4 > i2; i4 /= 2) {
            i3 *= 2;
        }
        return i3;
    }
}
