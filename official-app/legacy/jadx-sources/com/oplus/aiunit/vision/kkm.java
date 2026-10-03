package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
public class kkm {
    public static String g;
    public String a;
    public upm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13335c;
    public Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<Activity> f13336e;
    public Runnable f = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            q8g.j("AsynLoadImg", "handleMessage:" + message.arg1);
            if (message.arg1 == 0) {
                kkm.this.b.a(message.arg1, (String) message.obj);
            } else {
                kkm.this.b.a(message.arg1, (String) null);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zE;
            q8g.j("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + com.tencent.open.utils.b.E(kkm.this.a) + ".jpg";
            String str2 = kkm.g + str;
            File file = new File(str2);
            Message messageObtainMessage = kkm.this.d.obtainMessage();
            if (file.exists()) {
                messageObtainMessage.arg1 = 0;
                messageObtainMessage.obj = str2;
                q8g.j("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - kkm.this.f13335c));
            } else {
                Bitmap bitmapA = kkm.a(kkm.this.a);
                if (bitmapA != null) {
                    zE = kkm.this.e(bitmapA, str);
                } else {
                    q8g.j("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    zE = false;
                }
                if (zE) {
                    messageObtainMessage.arg1 = 0;
                    messageObtainMessage.obj = str2;
                } else {
                    messageObtainMessage.arg1 = 1;
                }
                q8g.j("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - kkm.this.f13335c));
            }
            kkm.this.d.sendMessage(messageObtainMessage);
        }
    }

    public kkm(Activity activity) {
        this.f13336e = new WeakReference<>(activity);
        this.d = new a(activity.getMainLooper());
    }

    public static Bitmap a(String str) {
        q8g.j("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            q8g.j("AsynLoadImg", "image download finished." + str);
            return bitmapDecodeStream;
        } catch (IOException e2) {
            e2.printStackTrace();
            q8g.j("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            q8g.j("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }

    public void d(String str, upm upmVar) {
        q8g.j("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            upmVar.a(1, (String) null);
            return;
        }
        if (!com.tencent.open.utils.b.m()) {
            upmVar.a(2, (String) null);
            return;
        }
        if (this.f13336e.get() != null) {
            Activity activity = this.f13336e.get();
            File fileI = com.tencent.open.utils.b.I(activity, "Images");
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (fileI == null) {
                q8g.f("AsynLoadImg", "externalImageFile is null");
                upmVar.a(2, (String) null);
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(yzm.k(activity) ? fileI.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb.append("/tmp/");
                g = sb.toString();
            }
        }
        this.f13335c = System.currentTimeMillis();
        this.a = str;
        this.b = upmVar;
        new Thread(this.f).start();
    }

    public boolean e(Bitmap bitmap, String str) throws Throwable {
        String str2 = g;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                q8g.j("AsynLoadImg", "saveFile:" + str);
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream2);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream = bufferedOutputStream2;
                    e.printStackTrace();
                    q8g.g("AsynLoadImg", "saveFile bmp fail---", e);
                    if (bufferedOutputStream == null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
