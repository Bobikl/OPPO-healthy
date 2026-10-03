package com.heytap.accessory.file.receiver;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String t = "a";
    public Context b;
    public b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.HandlerC0246c f2574e;
    public String f;
    public Uri g;
    public SetupRequest h;
    public boolean i;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public OutputStream f2576l;
    public HandlerThread m;
    public long o;
    public int q;
    public String r;
    public MessageDigest s;
    public boolean a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2573c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2575j = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2577n = false;
    public Runnable p = null;

    /* JADX INFO: renamed from: com.heytap.accessory.file.receiver.a$a, reason: collision with other inner class name */
    public class RunnableC0245a implements Runnable {
        public final /* synthetic */ byte[] a;

        public RunnableC0245a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.a);
        }
    }

    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }
    }

    public a(c.HandlerC0246c handlerC0246c, Context context, String str, int i, String str2) {
        this.f2574e = handlerC0246c;
        this.b = context;
        this.q = i;
        this.r = str2;
        try {
            this.s = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            com.heytap.accessory.base.logging.a.e(t, "create MessageDigest failed");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9 A[Catch: all -> 0x00ca, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x001a, B:8:0x0027, B:10:0x0068, B:11:0x0079, B:13:0x0089, B:19:0x00b1, B:21:0x00b9, B:23:0x00c7, B:15:0x0097, B:18:0x00aa), top: B:34:0x0004, outer: #2, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    public synchronized boolean a(SetupRequest setupRequest, String str) {
        boolean z;
        String strE;
        synchronized (this) {
            this.o = 0L;
            HandlerThread handlerThread = new HandlerThread("DataReceiverWorker");
            this.m = handlerThread;
            handlerThread.start();
            if (this.m.getLooper() != null) {
                this.d = new b(this.m.getLooper());
            }
            this.h = setupRequest;
            this.f2573c = str;
            this.g = Uri.parse(str);
            this.h.h();
            com.heytap.accessory.base.logging.a.d(t, "File Path " + this.h.e() + " Size " + this.h.h());
            if (this.g.getScheme() == null) {
                this.g = Uri.fromFile(new File(this.g.toString()));
            }
            boolean z2 = false;
            z = true;
            if ("content".equalsIgnoreCase(this.g.getScheme()) || Const.Scheme.SCHEME_FILE.equalsIgnoreCase(this.g.getScheme())) {
                try {
                    this.f2576l = this.b.getContentResolver().openOutputStream(this.g);
                    this.a = true;
                    z2 = true;
                } catch (Exception e2) {
                    com.heytap.accessory.base.logging.a.a(t, "Not a Content URI", e2);
                }
                strE = this.h.e();
                if (strE != null) {
                    this.f = strE;
                    setupRequest.a(strE);
                    com.heytap.accessory.base.logging.a.a(t, "Prepare successful");
                } else {
                    z = z2;
                }
            } else {
                strE = this.h.e();
                if (strE != null) {
                    this.f = strE;
                    setupRequest.a(strE);
                    com.heytap.accessory.base.logging.a.a(t, "Prepare successful");
                } else {
                    z = z2;
                }
            }
            throw th;
        }
        return z;
        return z;
    }

    public final boolean b(byte[] bArr) {
        if (this.f2576l == null || this.h == null) {
            com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
            com.heytap.accessory.base.logging.a.b(t, "no receive stream or mFileRequest is null");
            return true;
        }
        if (bArr.length <= 0) {
            com.heytap.accessory.base.logging.a.b(t, "Wrong data Length!!");
            com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
            return true;
        }
        if ((bArr[0] & 1) == 1) {
            return false;
        }
        com.heytap.accessory.base.logging.a.b(t, "Not a data chunk header!!");
        com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
        return true;
    }

    public synchronized boolean c(byte[] bArr) {
        try {
            String str = t;
            com.heytap.accessory.base.logging.a.a(str, "Incoming data " + bArr.length + " , transId " + this.q);
            if (b(bArr)) {
                return false;
            }
            if ((bArr[0] & 1) != 1) {
                com.heytap.accessory.base.logging.a.b(str, "Not a data chunk header!!");
                com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
                return false;
            }
            int length = bArr.length - 1;
            try {
                try {
                    if (!this.a) {
                        File file = new File(this.f);
                        if (!file.isFile() || !file.exists()) {
                            com.heytap.accessory.base.logging.a.b(str, "Unable to open file '" + this.f + "'");
                            b();
                            com.heytap.accessory.file.utils.a.a(this.f2574e, 2, (Bundle) null);
                            return false;
                        }
                    }
                    if (this.r != null) {
                        this.s.update(bArr, 1, length);
                    }
                    this.f2576l.write(bArr, 1, length);
                    this.f2576l.flush();
                    long j2 = length;
                    this.o += j2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" TotalReceived = ");
                    sb.append(this.o);
                    sb.append(" totalNeed = ");
                    sb.append(this.h.h());
                    sb.append(" transId: ");
                    sb.append(this.q);
                    sb.append(" channelId: ");
                    SetupRequest setupRequest = this.h;
                    sb.append(setupRequest == null ? "null" : Integer.valueOf(setupRequest.b()));
                    sb.append(" index: ");
                    sb.append(length == 0 ? 0L : this.o / j2);
                    sb.append(" singleDataLen: ");
                    sb.append(length);
                    com.heytap.accessory.base.logging.a.a(str, sb.toString());
                    if (this.o > this.h.h()) {
                        com.heytap.accessory.base.logging.a.b(str, "Some other data was received. Aborting. TotalReceive = " + this.o + " FileRequest = " + this.h.h());
                        a();
                        com.heytap.accessory.file.utils.a.a(this.f2574e, 2, (Bundle) null);
                        return false;
                    }
                    int i = this.f2575j + 1;
                    this.f2575j = i;
                    if (i == 5 && this.o < this.h.h()) {
                        a(this.o, TypedValues.PositionType.TYPE_CURVE_FIT);
                        this.f2575j = 0;
                    }
                    if (this.o != this.h.h()) {
                        return true;
                    }
                    com.heytap.accessory.base.logging.a.c(str, "fileRead() Completed Receiving " + this.o + " transId: " + this.q);
                    a(this.o, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (!this.a) {
                        String str2 = this.f;
                        String strSubstring = str2.substring(0, str2.lastIndexOf("_temp"));
                        File file2 = new File(strSubstring);
                        if (file2.isFile() && file2.exists()) {
                            String str3 = strSubstring.substring(0, strSubstring.lastIndexOf(47) + 1) + strSubstring.substring(this.f.lastIndexOf(47) + 1, strSubstring.lastIndexOf(46)) + System.currentTimeMillis() + strSubstring.substring(strSubstring.lastIndexOf(46));
                            if (new File(this.f).renameTo(new File(str3))) {
                                this.k = str3;
                                com.heytap.accessory.base.logging.a.a(str, "File successfully renamed " + str3);
                            } else {
                                com.heytap.accessory.base.logging.a.b(str, "File rename failed");
                            }
                        } else if (new File(this.f).renameTo(new File(strSubstring))) {
                            com.heytap.accessory.base.logging.a.a(str, "File successfully renamed " + strSubstring);
                            this.k = strSubstring;
                        } else {
                            com.heytap.accessory.base.logging.a.b(str, "File rename failed");
                        }
                    }
                    if (d()) {
                        Message messageObtainMessage = this.f2574e.obtainMessage(509);
                        Bundle data = messageObtainMessage.getData();
                        data.putInt("transId", this.q);
                        messageObtainMessage.setData(data);
                        this.f2574e.sendMessage(messageObtainMessage);
                        b();
                        this.i = true;
                    }
                    return true;
                } catch (IOException e2) {
                    com.heytap.accessory.base.logging.a.a(t, "Error reading file '" + this.f + "'", e2);
                    b();
                    com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
                    return false;
                }
            } catch (FileNotFoundException e3) {
                com.heytap.accessory.base.logging.a.a(t, "Unable to open file '" + this.f + "'", e3);
                b();
                com.heytap.accessory.file.utils.a.a(this.f2574e, 2, this.q);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        if (this.r == null) {
            com.heytap.accessory.base.logging.a.c(t, "request md5 is null, so will not verify");
            return true;
        }
        String strA = com.heytap.accessory.misc.utils.c.a(this.s);
        if (Objects.equals(this.r, strA)) {
            com.heytap.accessory.base.logging.a.a(t, "md5 verify success!");
            return true;
        }
        com.heytap.accessory.base.logging.a.e(t, "md5 not equal,receive:" + this.r + ",calculate md5:" + strA);
        b();
        a(2, 10);
        return false;
    }

    public final synchronized void b() {
        try {
            OutputStream outputStream = this.f2576l;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e2) {
            com.heytap.accessory.base.logging.a.b(t, "closeOutStream() Exception" + e2);
        }
        com.heytap.accessory.base.logging.a.a(t, "closeOutStream() closed ");
        this.f2576l = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public synchronized void a(byte[] bArr) {
        if (!this.i && !this.f2577n) {
            RunnableC0245a runnableC0245a = new RunnableC0245a(bArr);
            this.p = runnableC0245a;
            this.d.post(runnableC0245a);
        } else {
            this.d.getLooper().quit();
            com.heytap.accessory.base.logging.a.e(t, "Already completed sending / stop requested");
        }
    }

    public final void a(long j2, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("progress", j2);
        bundle.putInt("transId", this.q);
        Message messageObtainMessage = this.f2574e.obtainMessage(i);
        messageObtainMessage.setData(bundle);
        this.f2574e.sendMessage(messageObtainMessage);
    }

    public final void a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("transId", this.q);
        bundle.putInt(EngineConstant.REASON, i2);
        Message messageObtainMessage = this.f2574e.obtainMessage(i);
        messageObtainMessage.setData(bundle);
        this.f2574e.sendMessage(messageObtainMessage);
    }

    public synchronized void a() {
        Runnable runnable;
        if (this.f != null && !this.a) {
            File file = new File(this.f);
            if (file.isFile() && file.exists()) {
                if (file.delete()) {
                    com.heytap.accessory.base.logging.a.a(t, "temp file deleted successfully - " + this.f);
                } else {
                    com.heytap.accessory.base.logging.a.b(t, "temp file could not be deleted - ");
                }
            }
        } else {
            if (this.g != null && this.a) {
                try {
                    if (this.b.getContentResolver().delete(this.g, null, null) > 0) {
                        com.heytap.accessory.base.logging.a.a(t, "temp file deleted successfully - " + this.g);
                    } else {
                        com.heytap.accessory.base.logging.a.b(t, "temp file could not be deleted");
                    }
                } catch (Exception unused) {
                    com.heytap.accessory.base.logging.a.b(t, "temp file could not be deleted cause exception happened!");
                }
            }
            throw th;
        }
        b bVar = this.d;
        if (bVar != null && (runnable = this.p) != null) {
            bVar.removeCallbacksAndMessages(runnable);
            this.d.getLooper().quit();
        }
        this.f2577n = true;
        this.k = null;
        b();
    }

    public synchronized void c() {
        if (this.k != null && !this.a) {
            File file = new File(this.k);
            if (file.isFile() && file.exists()) {
                if (file.delete()) {
                    com.heytap.accessory.base.logging.a.a(t, "Received file deleted successfully - " + this.k);
                } else {
                    com.heytap.accessory.base.logging.a.b(t, "Received file could not be deleted ");
                }
            }
        }
    }
}
