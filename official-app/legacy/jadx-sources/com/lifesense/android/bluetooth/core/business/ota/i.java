package com.lifesense.android.bluetooth.core.business.ota;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public HandlerThread a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f8603c;
    public h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f8604e;

    @SuppressLint({"NewApi"})
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:59:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            InputStream fileInputStream;
            int iAvailable;
            if (message.arg1 != 1) {
                return;
            }
            byte[] bArr = new byte[1024];
            InputStream inputStream = null;
            int i = 0;
            try {
                fileInputStream = i.this.f8604e.getName().endsWith(".bin") ? new FileInputStream(i.this.f8604e) : new e(new FileInputStream(i.this.f8604e), 4096);
                try {
                    try {
                        iAvailable = fileInputStream.available();
                        try {
                            byte[] bArr2 = new byte[iAvailable];
                            int i2 = 0;
                            while (true) {
                                int i3 = fileInputStream.read(bArr);
                                if (i3 <= 0) {
                                    break;
                                }
                                System.arraycopy(bArr, 0, bArr2, i2, i3);
                                i2 += i3;
                            }
                            i.this.d = new h(bArr2);
                            try {
                                fileInputStream.close();
                            } catch (Exception e2) {
                                e = e2;
                                e.printStackTrace();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = iAvailable;
                            e.printStackTrace();
                            String name = e.getClass().getName();
                            if (i.this.f8603c != null) {
                                i.this.f8603c.onFileProcessorResults(i, null, name);
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e4) {
                                    e = e4;
                                    iAvailable = i;
                                    e.printStackTrace();
                                }
                            }
                            iAvailable = i;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = fileInputStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
            if (i.this.f8603c != null) {
                i.this.f8603c.onFileProcessorResults(iAvailable, i.this.d, null);
            }
        }
    }

    public i(g gVar) {
        this.f8603c = gVar;
        HandlerThread handlerThread = new HandlerThread("UpgradeFileProcessor");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new a(this.a.getLooper());
    }

    @SuppressLint({"NewApi"})
    public void a() {
        if (this.a != null) {
            this.a.quitSafely();
        }
    }

    public void a(File file) {
        this.f8604e = file;
        Message messageObtainMessage = this.b.obtainMessage();
        messageObtainMessage.arg1 = 1;
        this.b.sendMessage(messageObtainMessage);
    }
}
