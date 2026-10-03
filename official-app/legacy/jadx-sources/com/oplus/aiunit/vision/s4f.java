package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.heytap.health.zxing.R$color;
import java.util.HashMap;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes19.dex */
public class s4f {
    public static Bitmap a(Context context, String str, String str2, String str3) {
        String str4;
        String strSubstring;
        int iA = ejg.a(context, 360.0f);
        int iA2 = ejg.a(context, 360.0f);
        int iA3 = ejg.a(context, 14.0f);
        int iA4 = ejg.a(context, 12.0f);
        int iA5 = ejg.a(context, 200.0f);
        int iA6 = ejg.a(context, 200.0f);
        int iA7 = ejg.a(context, 34.0f);
        int iA8 = ejg.a(context, 16.0f);
        int iA9 = ejg.a(context, 40.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA, iA2, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(-1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRect(0.0f, 0.0f, iA, iA2, paint);
        int i = iA7 + iA3 + iA8;
        Hashtable hashtable = new Hashtable();
        hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hashtable.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hashtable.put(EncodeHintType.MARGIN, 1);
        try {
            Canvas canvas2 = canvas;
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, iA5, iA6, hashtable);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = 0;
                while (i3 < height) {
                    bitmapCreateBitmap2.setPixel(i2, i3, bitMatrixEncode.get(i2, i3) ? -16777216 : -1);
                    i3++;
                    bitMatrixEncode = bitMatrixEncode;
                }
            }
            paint.setColor(-16777216);
            canvas2.drawBitmap(bitmapCreateBitmap2, (iA - iA5) / 2, i, paint);
            Rect rect = new Rect();
            paint.setColor(-16777216);
            paint.setTextSize(iA3);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            int i4 = iA / 2;
            int i5 = i + iA6;
            canvas2.drawText(str2, i4 - (rect.width() / 2), iA8 + i5 + (rect.height() / 2), paint);
            paint.setColor(context.getColor(R$color.lib_zxing_text_color));
            paint.setTextSize(iA4);
            int i6 = iA / iA4;
            int iCeil = (int) Math.ceil(Double.valueOf(str3.length()).doubleValue() / Double.valueOf(i6).doubleValue());
            int i7 = i5 + iA9;
            int i8 = 0;
            while (i8 < iCeil) {
                if (i8 == iCeil - 1) {
                    str4 = str3;
                    strSubstring = str4.substring(i8 * i6);
                } else {
                    str4 = str3;
                    strSubstring = str4.substring(i8 * i6, (i8 + 1) * i6);
                }
                paint.getTextBounds(str4, 0, strSubstring.length(), rect);
                canvas2.drawText(strSubstring, i4 - (rect.width() / 2), (i8 * iA4) + i7 + (i8 * 5) + (rect.height() / 2), paint);
                i8++;
                canvas2 = canvas2;
            }
            Canvas canvas3 = canvas2;
            canvas3.save();
            canvas3.restore();
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            a7b.b("QRCodeUtils", "generate WriterException " + e2.getMessage());
            return null;
        }
    }

    public static Bitmap b(Context context, String str) {
        HashMap map = new HashMap();
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        map.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        map.put(EncodeHintType.MARGIN, 1);
        int iL = (int) ejg.l(context, 300);
        int iL2 = (int) ejg.l(context, 300);
        try {
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, iL2, iL, map);
            int[] iArr = new int[iL2 * iL];
            for (int i = 0; i < iL; i++) {
                for (int i2 = 0; i2 < iL2; i2++) {
                    if (bitMatrixEncode.get(i2, i)) {
                        iArr[(i * iL2) + i2] = -16777216;
                    } else {
                        iArr[(i * iL2) + i2] = -1;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL2, iL, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, iL2, 0, 0, iL2, iL);
            return bitmapCreateBitmap;
        } catch (WriterException e2) {
            a7b.b("QRCodeUtils", "generate WriterException " + e2.getMessage());
            return null;
        }
    }
}
