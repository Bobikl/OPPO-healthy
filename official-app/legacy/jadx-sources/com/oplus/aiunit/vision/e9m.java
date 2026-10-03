package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class e9m {

    public static class a extends Handler {
        public final /* synthetic */ upm a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, upm upmVar) {
            super(looper);
            this.a = upmVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 101) {
                this.a.a(0, (ArrayList<String>) message.obj);
            } else if (i != 102) {
                super.handleMessage(message);
            } else {
                this.a.a(message.arg1, (String) null);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Handler f10833j;
        public final /* synthetic */ Context k;

        public b(String str, Handler handler, Context context) {
            this.i = str;
            this.f10833j = handler;
            this.k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String string;
            try {
                Bitmap bitmapC = e9m.c(this.i, 840);
                if (bitmapC != null) {
                    File fileB = uum.b("Images");
                    String str2 = null;
                    if (fileB != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileB.getAbsolutePath());
                        String str3 = File.separator;
                        sb.append(str3);
                        sb.append(s04.QQ_SHARE_TEMP_DIR);
                        sb.append(str3);
                        string = sb.toString();
                        str = null;
                    } else {
                        File fileF = uum.f();
                        if (fileF == null) {
                            q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() getCacheDir = null,return error");
                            Message messageObtainMessage = this.f10833j.obtainMessage();
                            messageObtainMessage.arg1 = 102;
                            this.f10833j.sendMessage(messageObtainMessage);
                            return;
                        }
                        String absolutePath = fileF.getAbsolutePath();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(absolutePath);
                        String str4 = File.separator;
                        sb2.append(str4);
                        sb2.append(s04.QQ_SHARE_TEMP_DIR);
                        sb2.append(str4);
                        String string2 = sb2.toString();
                        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() use cache dir=" + string2);
                        str = absolutePath;
                        string = string2;
                    }
                    String str5 = "share2qq_temp" + com.tencent.open.utils.b.E(this.i) + ".jpg";
                    String str6 = this.i;
                    if (e9m.h(str6, 840, 840)) {
                        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() out of bound,compress!");
                        String strD = e9m.d(bitmapC, string, str5);
                        if (!TextUtils.isEmpty(strD)) {
                            str6 = strD;
                        }
                    } else {
                        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() not out of bound,not compress!");
                    }
                    boolean zN = com.tencent.open.utils.b.N(str6);
                    q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() check file isAppSpecificDir=" + zN);
                    ArrayList arrayList = new ArrayList(2);
                    if (zN) {
                        str2 = str6;
                    } else if (TextUtils.isEmpty(str)) {
                        String str7 = string + str5;
                        boolean zO = com.tencent.open.utils.b.o(this.k, str6, str7);
                        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() sd permission not denied. copy to app sepcific:" + str7 + ",isSuccess=" + zO);
                        if (zO) {
                            str2 = str7;
                        }
                    }
                    arrayList.add(str6);
                    arrayList.add(str2);
                    if (arrayList.size() >= 2 && (arrayList.get(0) != null || arrayList.get(1) != null)) {
                        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return success ! destFilePath=[" + ((String) arrayList.get(0)) + "," + ((String) arrayList.get(1)) + "]");
                        Message messageObtainMessage2 = this.f10833j.obtainMessage(101);
                        messageObtainMessage2.obj = arrayList;
                        this.f10833j.sendMessage(messageObtainMessage2);
                        return;
                    }
                }
            } catch (Exception e2) {
                q8g.g("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage runnable exception e:", e2);
            }
            q8g.d("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return failed!");
            Message messageObtainMessage3 = this.f10833j.obtainMessage(102);
            messageObtainMessage3.arg1 = 3;
            this.f10833j.sendMessage(messageObtainMessage3);
        }
    }

    public static final int a(BitmapFactory.Options options, int i, int i2) {
        int iG = g(options, i, i2);
        if (iG > 8) {
            return 8 * ((iG + 7) / 8);
        }
        int i3 = 1;
        while (i3 < iG) {
            i3 <<= 1;
        }
        return i3;
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = i / width;
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static final Bitmap c(String str, int i) {
        Bitmap bitmapDecodeFile;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e2) {
            q8g.g("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception1:", e2);
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (options.mCancel || i2 == -1 || i3 == -1) {
            return null;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        if (i2 > i) {
            options.inSampleSize = a(options, -1, i * i);
        }
        options.inJustDecodeBounds = false;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        } catch (Exception e3) {
            q8g.g("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap exception2:", e3);
            bitmapDecodeFile = null;
        } catch (OutOfMemoryError e4) {
            q8g.g("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap OutOfMemoryError:", e4);
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile == null) {
            q8g.f("openSDK_LOG.AsynScaleCompressImage", "scaleBitmap return null");
            return null;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 <= i5) {
            i4 = i5;
        }
        return i4 > i ? b(bitmapDecodeFile, i) : bitmapDecodeFile;
    }

    public static final String d(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str2);
        String string = stringBuffer.toString();
        File file2 = new File(string);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            return string;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static final void e(Context context, String str, upm upmVar) {
        q8g.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage()");
        if (TextUtils.isEmpty(str)) {
            upmVar.a(1, (String) null);
        } else if (com.tencent.open.utils.b.m()) {
            new Thread(new b(str, new a(context.getMainLooper(), upmVar), context)).start();
        } else {
            upmVar.a(2, (String) null);
        }
    }

    public static int g(BitmapFactory.Options options, int i, int i2) {
        int iMin;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int iCeil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        if (i == -1) {
            iMin = 128;
        } else {
            double d3 = i;
            iMin = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (iMin < iCeil) {
            return iCeil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i == -1 ? iCeil : iMin;
    }

    public static final boolean h(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e2) {
            q8g.g("openSDK_LOG.AsynScaleCompressImage", "isBitMapNeedToCompress exception:", e2);
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || i3 == -1 || i4 == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        q8g.d("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i5 > i2 || i3 > i;
    }
}
