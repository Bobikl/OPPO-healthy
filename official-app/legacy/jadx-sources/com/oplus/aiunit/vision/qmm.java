package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xingin.xhssharesdk.XhsShareConstants$XhsShareNoteErrorCode;
import com.xingin.xhssharesdk.XhsShareConstants$XhsShareNoteNewErrorCode;
import com.xingin.xhssharesdk.XhsShareSdkTools;
import com.xingin.xhssharesdk.callback.XhsShareCallback;
import com.xingin.xhssharesdk.callback.XhsShareRegisterCallback;
import com.xingin.xhssharesdk.core.XhsShareActivity;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import com.xingin.xhssharesdk.log.IShareLogger;
import com.xingin.xhssharesdk.model.config.XhsShareGlobalConfig;
import com.xingin.xhssharesdk.model.sharedata.XhsNote;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class qmm {

    @NonNull
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final XhsShareGlobalConfig f15853c;

    @Nullable
    public edm d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public XhsShareRegisterCallback f15854e;

    @Nullable
    public XhsShareCallback f;
    public String g;

    @Nullable
    public volatile bdm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hdm f15855j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Handler f15856l;

    @Nullable
    public WeakReference<Activity> m;

    @Nullable
    public com.xingin.xhssharesdk.i.g o;

    @Nullable
    public b p;
    public e h = null;
    public boolean k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f15857n = new a();

    public class a implements IShareLogger {
        public a() {
        }

        @Override // com.xingin.xhssharesdk.log.IShareLogger
        public final void d(String str, String str2) {
            if (qmm.this.f15853c.isEnableLog()) {
                qmm.this.f15853c.getShareLogger().d(str, str2);
            }
        }

        @Override // com.xingin.xhssharesdk.log.IShareLogger
        public final void e(String str, String str2, @Nullable Throwable th) {
            if (qmm.this.f15853c.isEnableLog()) {
                qmm.this.f15853c.getShareLogger().e(str, str2, th);
            }
        }

        @Override // com.xingin.xhssharesdk.log.IShareLogger
        public final void i(String str, String str2) {
            if (qmm.this.f15853c.isEnableLog()) {
                qmm.this.f15853c.getShareLogger().i(str, str2);
            }
        }

        @Override // com.xingin.xhssharesdk.log.IShareLogger
        public final void v(String str, String str2) {
            if (qmm.this.f15853c.isEnableLog()) {
                qmm.this.f15853c.getShareLogger().v(str, str2);
            }
        }

        @Override // com.xingin.xhssharesdk.log.IShareLogger
        public final void w(String str, String str2, @Nullable Throwable th) {
            if (qmm.this.f15853c.isEnableLog()) {
                qmm.this.f15853c.getShareLogger().w(str, str2, th);
            }
        }
    }

    public static class b implements Runnable {
        public final String i;

        public b(String str) {
            this.i = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (XhsShareSdk.a == null) {
                return;
            }
            qmm qmmVar = XhsShareSdk.a;
            boolean zEquals = TextUtils.equals(this.i, qmmVar.c());
            qmmVar.f15857n.d("XhsShare_Sdk", "delayInterruptRunnable run! sessionId equals: " + zEquals);
            if (zEquals) {
                WeakReference<Activity> weakReference = qmmVar.m;
                if (weakReference == null || weakReference.get() == null) {
                    qmmVar.f15857n.w("XhsShare_Sdk", "unregisterShareResultReceiverWithOutsideActivity, OutsideActivity is NULL!", null);
                } else {
                    Activity activity = qmmVar.m.get();
                    com.xingin.xhssharesdk.i.g gVar = qmmVar.o;
                    if (gVar != null) {
                        try {
                            activity.unregisterReceiver(gVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
                qmmVar.g(qmmVar.c(), XhsShareConstants$XhsShareNoteNewErrorCode.GET_SHARE_RESULT_TIMEOUT, XhsShareConstants$XhsShareNoteErrorCode.UNKNOWN, "Get ShareResult from Xhs timeout!", null, true);
                qmmVar.f15857n.e("XhsShare_Sdk", "[" + qmmVar.c() + "][new: -20400006][old:-10000001]Get ShareResult from Xhs timeout!", null);
            }
        }
    }

    public static class c implements zcm {

        @NonNull
        public final zcm a;

        public c(@NonNull XhsShareActivity.a aVar) {
            this.a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str, int i, int i2, String str2, Throwable th) {
            this.a.b(str, i, i2, str2, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, Uri uri) {
            this.a.a(str, uri);
        }

        @Override // com.oplus.aiunit.vision.zcm
        public final void a(@NonNull final String str, @NonNull final Uri uri) {
            yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.okm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(str, uri);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.zcm
        public final void b(@NonNull final String str, final int i, final int i2, @NonNull final String str2, final Throwable th) {
            yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.pkm
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(str, i, i2, str2, th);
                }
            });
        }

        public /* synthetic */ c(XhsShareActivity.a aVar, int i) {
            this(aVar);
        }
    }

    public static class d implements omm {
        @Override // com.oplus.aiunit.vision.omm
        public final void a(wim wimVar) {
            b bVar;
            if (XhsShareSdk.a == null) {
                return;
            }
            qmm qmmVar = XhsShareSdk.a;
            boolean zEquals = TextUtils.equals(wimVar.d, qmmVar.c());
            qmmVar.f15857n.d("XhsShare_Sdk", "OutsideReceiveShareResultCallback onReceive, equals is " + zEquals + " ,result is " + wimVar);
            if (zEquals) {
                Handler handler = qmmVar.f15856l;
                if (handler != null && (bVar = qmmVar.p) != null) {
                    handler.removeCallbacks(bVar);
                    qmmVar.p = null;
                    qmmVar.f15857n.d("XhsShare_Sdk", "removeDelayInterruptRunnable");
                }
                WeakReference<Activity> weakReference = qmmVar.m;
                if (weakReference == null || weakReference.get() == null) {
                    qmmVar.f15857n.w("XhsShare_Sdk", "unregisterShareResultReceiverWithOutsideActivity, OutsideActivity is NULL!", null);
                } else {
                    Activity activity = qmmVar.m.get();
                    com.xingin.xhssharesdk.i.g gVar = qmmVar.o;
                    if (gVar != null) {
                        try {
                            activity.unregisterReceiver(gVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (wimVar.a) {
                    qmmVar.i(wimVar.d);
                    return;
                }
                Pair<Integer, Integer> errorCodeFromXhsShareResult = XhsShareSdkTools.getErrorCodeFromXhsShareResult(wimVar);
                qmmVar.g(wimVar.d, ((Integer) errorCodeFromXhsShareResult.first).intValue(), ((Integer) errorCodeFromXhsShareResult.second).intValue(), wimVar.f18287c, null, true);
                qmmVar.f15857n.e("XhsShare_Sdk", "[" + wimVar.d + "][new: " + errorCodeFromXhsShareResult.first + "][old:" + errorCodeFromXhsShareResult.second + "]" + wimVar.f18287c, null);
            }
        }
    }

    public class e extends Thread {

        @NonNull
        public final XhsNote i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public final c f15858j;

        @NonNull
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f15859l;

        public e(@NonNull XhsNote xhsNote, @NonNull String str, long j2, @NonNull XhsShareActivity.a aVar) {
            this.i = xhsNote;
            this.k = str;
            this.f15858j = new c(aVar, 0);
            this.f15859l = j2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Throwable th;
            c cVar;
            String str;
            int i;
            int i2;
            String str2;
            super.run();
            try {
                qmm qmmVar = qmm.this;
                Context context = qmmVar.a;
                String strH = qmmVar.h();
                XhsNote xhsNote = this.i;
                qmm qmmVar2 = qmm.this;
                this.f15858j.a(this.k, bvm.a(qmm.this.a, bvm.c(context, strH, xhsNote, TextUtils.isEmpty(qmmVar2.f15853c.getCacheDirPath()) ? XhsShareSdkTools.getDefaultCacheDirPath(qmmVar2.a) : qmmVar2.f15853c.getCacheDirPath()), this.k, this.f15859l));
            } catch (com.xingin.xhssharesdk.l.a e2) {
                this.f15858j.b(this.k, XhsShareConstants$XhsShareNoteNewErrorCode.PROCESS_DATA_ERROR, XhsShareConstants$XhsShareNoteErrorCode.PROCESS_ERROR, "[" + e2.a + "]" + e2.getMessage(), e2);
            } catch (IOException e3) {
                th = e3;
                cVar = this.f15858j;
                str = this.k;
                i = XhsShareConstants$XhsShareNoteNewErrorCode.IO_ERROR;
                i2 = XhsShareConstants$XhsShareNoteErrorCode.PROCESS_ERROR;
                str2 = "IO Exception!";
                cVar.b(str, i, i2, str2, th);
            } catch (InterruptedException e4) {
                th = e4;
                cVar = this.f15858j;
                str = this.k;
                i = XhsShareConstants$XhsShareNoteNewErrorCode.INTERRUPTED_ERROR;
                i2 = XhsShareConstants$XhsShareNoteErrorCode.PROCESS_THREAD_INTERRUPTED;
                str2 = "ProcessDataThread has be interrupted!!";
                cVar.b(str, i, i2, str2, th);
            } catch (JSONException e5) {
                th = e5;
                cVar = this.f15858j;
                str = this.k;
                i = XhsShareConstants$XhsShareNoteNewErrorCode.JSON_ERROR;
                i2 = XhsShareConstants$XhsShareNoteErrorCode.GENERATE_JSON_ERROR;
                str2 = "Convert json error!";
                cVar.b(str, i, i2, str2, th);
            }
        }
    }

    public qmm(@NonNull Context context, String str, @NonNull XhsShareGlobalConfig xhsShareGlobalConfig) {
        this.a = context;
        this.b = str;
        this.f15853c = xhsShareGlobalConfig;
    }

    public static void d(qmm qmmVar) {
        if (qmmVar.d == null) {
            return;
        }
        SharedPreferences sharedPreferences = qmmVar.a.getSharedPreferences("XHS_SHARE_SDK_SP", 0);
        try {
            sharedPreferences.edit().putString("XHS_SHARE_SDK_SP_KEY_TOKEN_CHECK_INFO", qmmVar.d.b().toString()).apply();
        } catch (JSONException e2) {
            qmmVar.f15857n.w("XhsShare_Sdk", "TokenCheckInfo to Json error.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        XhsShareCallback xhsShareCallback = this.f;
        if (xhsShareCallback != null) {
            xhsShareCallback.onSuccess(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, int i, int i2, String str2, Throwable th) {
        XhsShareCallback xhsShareCallback = this.f;
        if (xhsShareCallback != null) {
            xhsShareCallback.onError2(str, i, i2, str2, th);
        }
    }

    public final String c() {
        bdm bdmVar = this.i;
        return bdmVar != null ? bdmVar.a : "";
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    public final void g(final String str, final int i, final int i2, final String str2, final Throwable th, boolean z) {
        String string;
        long j2;
        bdm bdmVar = this.i;
        if (bdmVar == null) {
            this.f15857n.e("XhsShare_Sdk", "notifyShareError error, currentShareContext is NULL!", null);
            return;
        }
        zim zimVar = bdmVar.b;
        if (!TextUtils.isEmpty(zimVar.a) && TextUtils.equals(bdmVar.a, zimVar.a)) {
            if (zimVar.d != 0) {
                XhsShareSdk.d("ShareTimelineTracker", "shareResultTimestamp has be assigned!", null);
            } else {
                zimVar.d = System.currentTimeMillis();
            }
        }
        bdmVar.f9692c = false;
        Context context = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\t");
        if (th == null) {
            string = "";
        } else {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        sb.append(string);
        String string2 = sb.toString();
        zim zimVar2 = bdmVar.b;
        long j3 = zimVar2.f19446c;
        if (j3 <= 0) {
            j3 = zimVar2.b;
        }
        if (j3 > 0) {
            long j4 = zimVar2.d;
            if (j4 > 0) {
                long j5 = j4 - j3;
                if (j5 >= 0) {
                    j2 = j5;
                } else {
                    j2 = -1;
                }
            } else {
                j2 = -1;
            }
        } else {
            j2 = -1;
        }
        idm.b(context, str, false, i, string2, j2);
        yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.jkm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(str, i, i2, str2, th);
            }
        });
        if (z && this.f15853c.isClearCacheWhenShareComplete()) {
            hdm hdmVar = this.f15855j;
            if (hdmVar != null && hdmVar.isAlive()) {
                this.f15855j.interrupt();
            }
            hdm hdmVar2 = new hdm(new File(TextUtils.isEmpty(this.f15853c.getCacheDirPath()) ? XhsShareSdkTools.getDefaultCacheDirPath(this.a) : this.f15853c.getCacheDirPath()));
            this.f15855j = hdmVar2;
            hdmVar2.start();
        }
        this.m = null;
    }

    public final String h() {
        if (!TextUtils.isEmpty(this.f15853c.getFileProviderAuthority())) {
            return this.f15853c.getFileProviderAuthority();
        }
        return XhsShareSdkTools.getCurrentAppPackageName(this.a) + ".provider";
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066  */
    public final void i(final String str) {
        long j2;
        bdm bdmVar = this.i;
        if (bdmVar == null) {
            this.f15857n.e("XhsShare_Sdk", "notifyShareSuccess error, currentShareContext is NULL!", null);
            return;
        }
        zim zimVar = bdmVar.b;
        if (!TextUtils.isEmpty(zimVar.a) && TextUtils.equals(bdmVar.a, zimVar.a)) {
            if (zimVar.d != 0) {
                XhsShareSdk.d("ShareTimelineTracker", "shareResultTimestamp has be assigned!", null);
            } else {
                zimVar.d = System.currentTimeMillis();
            }
        }
        bdmVar.f9692c = false;
        Context context = this.a;
        zim zimVar2 = bdmVar.b;
        long j3 = zimVar2.f19446c;
        if (j3 <= 0) {
            j3 = zimVar2.b;
        }
        if (j3 > 0) {
            long j4 = zimVar2.d;
            if (j4 > 0) {
                long j5 = j4 - j3;
                if (j5 >= 0) {
                    j2 = j5;
                } else {
                    j2 = -1;
                }
            } else {
                j2 = -1;
            }
        } else {
            j2 = -1;
        }
        idm.b(context, str, true, 0, "", j2);
        yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.hkm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e(str);
            }
        });
        if (this.f15853c.isClearCacheWhenShareComplete()) {
            hdm hdmVar = this.f15855j;
            if (hdmVar != null && hdmVar.isAlive()) {
                this.f15855j.interrupt();
            }
            hdm hdmVar2 = new hdm(new File(TextUtils.isEmpty(this.f15853c.getCacheDirPath()) ? XhsShareSdkTools.getDefaultCacheDirPath(this.a) : this.f15853c.getCacheDirPath()));
            this.f15855j = hdmVar2;
            hdmVar2.start();
        }
        this.m = null;
    }

    public final void j() {
        b bVar;
        if (this.f15856l == null) {
            this.f15856l = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.f15856l;
        if (handler != null && (bVar = this.p) != null) {
            handler.removeCallbacks(bVar);
            this.p = null;
            this.f15857n.d("XhsShare_Sdk", "removeDelayInterruptRunnable");
        }
        this.f15857n.d("XhsShare_Sdk", "setupInterruptTimeout");
        b bVar2 = new b(c());
        this.p = bVar2;
        this.f15856l.postDelayed(bVar2, 20000L);
    }
}
