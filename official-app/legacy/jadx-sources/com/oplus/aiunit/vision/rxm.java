package com.oplus.aiunit.vision;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.tencent.open.utils.HttpUtils;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class rxm {
    public static rxm h;
    public HandlerThread d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f16392e;
    public Random a = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Serializable> f16391c = Collections.synchronizedList(new ArrayList());
    public List<Serializable> b = Collections.synchronizedList(new ArrayList());
    public Executor f = y0n.c();
    public Executor g = y0n.c();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1000) {
                rxm.this.i();
            } else if (i == 1001) {
                rxm.this.l();
            }
            super.handleMessage(message);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Bundle i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f16393j;

        public b(Bundle bundle, boolean z) {
            this.i = bundle;
            this.f16393j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strL = com.tencent.open.utils.b.L(emm.d(uum.a()));
                String strL2 = com.tencent.open.utils.b.L(emm.e(uum.a()));
                String strL3 = com.tencent.open.utils.b.L(emm.a());
                String strL4 = com.tencent.open.utils.b.L(emm.f(uum.a()));
                Bundle bundle = new Bundle();
                bundle.putString("uin", "1000");
                bundle.putString("imei", strL);
                bundle.putString(SpeechConstant.KEY_IMSI, strL2);
                bundle.putString("android_id", strL4);
                bundle.putString("mac", strL3);
                bundle.putString("platform", "1");
                bundle.putString("os_ver", Build.VERSION.RELEASE);
                bundle.putString("position", "");
                bundle.putString("network", lcm.a(uum.a()));
                bundle.putString("language", emm.c());
                bundle.putString("resolution", emm.b(uum.a()));
                bundle.putString("apn", lcm.b(uum.a()));
                bundle.putString("model_name", Build.MODEL);
                bundle.putString("timezone", TimeZone.getDefault().getID());
                bundle.putString("sdk_ver", s04.SDK_VERSION);
                bundle.putString("qz_ver", com.tencent.open.utils.b.B(uum.a(), s04.PACKAGE_QZONE));
                bundle.putString("qq_ver", com.tencent.open.utils.b.x(uum.a(), "com.tencent.mobileqq"));
                bundle.putString("qua", com.tencent.open.utils.b.D(uum.a(), uum.d()));
                bundle.putString(StatisticsTrackUtil.KEY_PACKAGE_NAME, uum.d());
                bundle.putString("app_ver", com.tencent.open.utils.b.B(uum.a(), uum.d()));
                Bundle bundle2 = this.i;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                rxm.this.f16391c.add(new com.tencent.open.a.b(bundle));
                int size = rxm.this.f16391c.size();
                int iB = com.tencent.open.utils.a.d(uum.a(), null).b("Agent_ReportTimeInterval");
                if (iB == 0) {
                    iB = 10000;
                }
                if (!rxm.this.g("report_via", size) && !this.f16393j) {
                    if (rxm.this.f16392e.hasMessages(1001)) {
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1001;
                    rxm.this.f16392e.sendMessageDelayed(messageObtain, iB);
                    return;
                }
                rxm.this.l();
                rxm.this.f16392e.removeMessages(1001);
            } catch (Exception e2) {
                q8g.g("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e2);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16394j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f16395l;
        public final /* synthetic */ long m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f16396n;
        public final /* synthetic */ boolean o;

        public c(long j2, String str, String str2, int i, long j3, long j4, boolean z) {
            this.i = j2;
            this.f16394j = str;
            this.k = str2;
            this.f16395l = i;
            this.m = j3;
            this.f16396n = j4;
            this.o = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.i;
                Bundle bundle = new Bundle();
                String strA = lcm.a(uum.a());
                bundle.putString("apn", strA);
                bundle.putString("appid", "1000067");
                bundle.putString("commandid", this.f16394j);
                bundle.putString("detail", this.k);
                StringBuilder sb = new StringBuilder();
                sb.append("network=");
                sb.append(strA);
                sb.append(Typography.amp);
                sb.append("sdcard=");
                int i = 1;
                sb.append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0);
                sb.append(Typography.amp);
                sb.append("wifi=");
                sb.append(lcm.e(uum.a()));
                bundle.putString("deviceInfo", sb.toString());
                int iA = 100 / rxm.this.a(this.f16395l);
                if (iA > 0) {
                    i = iA > 100 ? 100 : iA;
                }
                bundle.putString(RecordCombinedLineChart.KEY_STEP_CADENCE, i + "");
                bundle.putString("reqSize", this.m + "");
                bundle.putString("resultCode", this.f16395l + "");
                bundle.putString("rspSize", this.f16396n + "");
                bundle.putString("timeCost", jElapsedRealtime + "");
                bundle.putString("uin", "1000");
                rxm.this.b.add(new com.tencent.open.a.b(bundle));
                int size = rxm.this.b.size();
                int iB = com.tencent.open.utils.a.d(uum.a(), null).b("Agent_ReportTimeInterval");
                if (iB == 0) {
                    iB = 10000;
                }
                if (rxm.this.g("report_cgi", size) || this.o) {
                    rxm.this.i();
                    rxm.this.f16392e.removeMessages(1000);
                } else if (!rxm.this.f16392e.hasMessages(1000)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1000;
                    rxm.this.f16392e.sendMessageDelayed(messageObtain, iB);
                }
            } catch (Exception e2) {
                q8g.g("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", e2);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bundle bundleJ = rxm.this.j();
                if (bundleJ == null) {
                    return;
                }
                int iB = com.tencent.open.utils.a.d(uum.a(), null).b("Common_HttpRetryCount");
                if (iB == 0) {
                    iB = 3;
                }
                q8g.d("openSDK_LOG.ReportManager", "-->doReportCgi, retryCount: " + iB);
                boolean z = false;
                int i = 0;
                do {
                    i++;
                    try {
                        try {
                            try {
                                HttpClient httpClientH = HttpUtils.h(uum.a(), null, "https://wspeed.qq.com/w.cgi");
                                HttpPost httpPost = new HttpPost("https://wspeed.qq.com/w.cgi");
                                httpPost.addHeader("Accept-Encoding", "gzip");
                                httpPost.setHeader("Content-Type", FileSyncModel.FormMime);
                                httpPost.setEntity(new ByteArrayEntity(com.tencent.open.utils.b.K(HttpUtils.f(bundleJ))));
                                int statusCode = httpClientH.execute(httpPost).getStatusLine().getStatusCode();
                                q8g.d("openSDK_LOG.ReportManager", "-->doReportCgi, statusCode: " + statusCode);
                                if (statusCode != 200) {
                                    break;
                                }
                                sum.a().i("report_cgi");
                                z = true;
                                break;
                            } catch (Exception e2) {
                                q8g.g("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e2);
                            }
                        } catch (SocketTimeoutException e3) {
                            q8g.g("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e3);
                        }
                    } catch (ConnectTimeoutException e4) {
                        q8g.g("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e4);
                    }
                } while (i < iB);
                if (!z) {
                    sum.a().h("report_cgi", rxm.this.b);
                }
                rxm.this.b.clear();
            } catch (Exception e5) {
                q8g.g("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception out.", e5);
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jElapsedRealtime;
            int i;
            int i2;
            try {
                Bundle bundleK = rxm.this.k();
                if (bundleK == null) {
                    return;
                }
                q8g.j("openSDK_LOG.ReportManager", "-->doReportVia, params: " + bundleK.toString());
                int iA = fsm.a();
                int i3 = 0;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = 0;
                long j3 = 0;
                boolean z = false;
                int iG = 0;
                do {
                    int i4 = i3 + 1;
                    try {
                        try {
                            try {
                                try {
                                    com.tencent.open.utils.b.C1015b c1015bJ = HttpUtils.j(uum.a(), "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", "POST", bundleK);
                                    try {
                                        i2 = com.tencent.open.utils.b.C(c1015bJ.a).getInt("ret");
                                    } catch (JSONException unused) {
                                        i2 = -4;
                                    }
                                    if (i2 == 0 || !TextUtils.isEmpty(c1015bJ.a)) {
                                        i4 = iA;
                                        z = true;
                                    }
                                    j2 = c1015bJ.b;
                                    j3 = c1015bJ.f20321c;
                                } catch (JSONException unused2) {
                                    i3 = i4;
                                    iG = -4;
                                    j2 = 0;
                                    j3 = 0;
                                }
                            } catch (SocketTimeoutException unused3) {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                i = -8;
                                jElapsedRealtime2 = jElapsedRealtime;
                                j2 = 0;
                                j3 = 0;
                                iG = i;
                            }
                        } catch (HttpUtils.NetworkUnavailableException unused4) {
                            rxm.this.f16391c.clear();
                            q8g.d("openSDK_LOG.ReportManager", "doReportVia, NetworkUnavailableException.");
                            return;
                        } catch (IOException e2) {
                            iG = HttpUtils.g(e2);
                            i3 = i4;
                            j2 = 0;
                            j3 = 0;
                        }
                    } catch (HttpUtils.HttpStatusException e3) {
                        try {
                            iG = Integer.parseInt(e3.getMessage().replace(HttpUtils.HttpStatusException.ERROR_INFO, ""));
                        } catch (Exception unused5) {
                        }
                    } catch (ConnectTimeoutException unused6) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        i = -7;
                        jElapsedRealtime2 = jElapsedRealtime;
                        j2 = 0;
                        j3 = 0;
                        iG = i;
                    } catch (Exception unused7) {
                        iG = -6;
                        i3 = iA;
                        j2 = 0;
                        j3 = 0;
                    }
                    i3 = i4;
                } while (i3 < iA);
                rxm.this.e("mapp_apptrace_sdk", jElapsedRealtime2, j2, j3, iG, null, false);
                if (z) {
                    sum.a().i("report_via");
                } else {
                    sum.a().h("report_via", rxm.this.f16391c);
                }
                rxm.this.f16391c.clear();
                q8g.d("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z);
            } catch (Exception e4) {
                q8g.g("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", e4);
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ Bundle i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f16397j;
        public final /* synthetic */ boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f16398l;

        public f(Bundle bundle, String str, boolean z, String str2) {
            this.i = bundle;
            this.f16397j = str;
            this.k = z;
            this.f16398l = str2;
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:120:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:0: B:21:0x0096->B:129:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0134 A[Catch: Exception -> 0x0157, TRY_ENTER, TryCatch #7 {Exception -> 0x0157, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000e, B:10:0x0015, B:12:0x003e, B:13:0x0042, B:15:0x0050, B:19:0x0086, B:84:0x0134, B:85:0x013a, B:34:0x00d4, B:70:0x0117, B:94:0x0150, B:93:0x014d, B:16:0x0064, B:18:0x0072, B:95:0x0151, B:88:0x0142, B:90:0x0148), top: B:105:0x0004, inners: #5 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x013a A[Catch: Exception -> 0x0157, TRY_LEAVE, TryCatch #7 {Exception -> 0x0157, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000e, B:10:0x0015, B:12:0x003e, B:13:0x0042, B:15:0x0050, B:19:0x0086, B:84:0x0134, B:85:0x013a, B:34:0x00d4, B:70:0x0117, B:94:0x0150, B:93:0x014d, B:16:0x0064, B:18:0x0072, B:95:0x0151, B:88:0x0142, B:90:0x0148), top: B:105:0x0004, inners: #5 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0148 A[Catch: Exception -> 0x014c, TRY_LEAVE, TryCatch #5 {Exception -> 0x014c, blocks: (B:88:0x0142, B:90:0x0148), top: B:103:0x0142, outer: #7 }] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpUriRequest httpGet;
            HttpResponse httpResponseExecute;
            HttpEntity entity;
            try {
                if (this.i == null) {
                    q8g.f("openSDK_LOG.ReportManager", "-->httpRequest, params is null!");
                    return;
                }
                int iA = fsm.a();
                if (iA == 0) {
                    iA = 3;
                }
                q8g.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iA);
                HttpResponse httpResponse = null;
                HttpClient httpClientH = HttpUtils.h(uum.a(), null, this.f16397j);
                String strF = HttpUtils.f(this.i);
                if (this.k) {
                    strF = URLEncoder.encode(strF);
                }
                if (this.f16398l.toUpperCase().equals("GET")) {
                    StringBuffer stringBuffer = new StringBuffer(this.f16397j);
                    stringBuffer.append(strF);
                    httpGet = new HttpGet(stringBuffer.toString());
                } else if (!this.f16398l.toUpperCase().equals("POST")) {
                    q8g.f("openSDK_LOG.ReportManager", "-->httpRequest unkonw request method return.");
                    return;
                } else {
                    HttpPost httpPost = new HttpPost(this.f16397j);
                    httpPost.setEntity(new ByteArrayEntity(com.tencent.open.utils.b.K(strF)));
                    httpGet = httpPost;
                }
                httpGet.addHeader("Accept-Encoding", "gzip");
                httpGet.addHeader("Content-Type", FileSyncModel.FormMime);
                int i = 0;
                boolean z = false;
                while (true) {
                    i++;
                    try {
                        try {
                            httpResponseExecute = httpClientH.execute(httpGet);
                            try {
                                int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                                q8g.d("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + statusCode);
                                if (statusCode != 200) {
                                    q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest : HttpStatuscode != 200");
                                } else {
                                    try {
                                        q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread success");
                                        z = true;
                                    } catch (SocketTimeoutException e2) {
                                        e = e2;
                                        z = true;
                                        try {
                                            q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                                            if (httpResponseExecute != null) {
                                                try {
                                                    HttpEntity entity2 = httpResponseExecute.getEntity();
                                                    if (entity2 != null) {
                                                        entity2.consumeContent();
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                                    if (i >= iA) {
                                                        if (z) {
                                                            q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                                                        } else {
                                                            q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                            if (i >= iA) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            httpResponse = httpResponseExecute;
                                            if (httpResponse != null) {
                                                try {
                                                    entity = httpResponse.getEntity();
                                                    if (entity != null) {
                                                        entity.consumeContent();
                                                    }
                                                } catch (Exception e4) {
                                                    q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e4);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (ConnectTimeoutException e5) {
                                        e = e5;
                                        z = true;
                                        q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest ConnectTimeoutException:", e);
                                        if (httpResponseExecute != null) {
                                            try {
                                                HttpEntity entity3 = httpResponseExecute.getEntity();
                                                if (entity3 != null) {
                                                    entity3.consumeContent();
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                                if (i >= iA) {
                                                    if (z) {
                                                        q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                                                    } else {
                                                        q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        if (i >= iA) {
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        z = true;
                                        httpResponse = httpResponseExecute;
                                        q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e);
                                        if (httpResponse != null) {
                                            try {
                                                HttpEntity entity4 = httpResponse.getEntity();
                                                if (entity4 != null) {
                                                    entity4.consumeContent();
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                            }
                                        }
                                    }
                                }
                                try {
                                    HttpEntity entity5 = httpResponseExecute.getEntity();
                                    if (entity5 != null) {
                                        entity5.consumeContent();
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    q8g.g("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                }
                            } catch (SocketTimeoutException e10) {
                                e = e10;
                            } catch (ConnectTimeoutException e11) {
                                e = e11;
                            } catch (Exception e12) {
                                e = e12;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (httpResponse != null) {
                                entity = httpResponse.getEntity();
                                if (entity != null) {
                                    entity.consumeContent();
                                }
                            }
                            throw th;
                        }
                    } catch (SocketTimeoutException e13) {
                        e = e13;
                        httpResponseExecute = null;
                    } catch (ConnectTimeoutException e14) {
                        e = e14;
                        httpResponseExecute = null;
                    } catch (Exception e15) {
                        e = e15;
                    }
                    if (z) {
                        q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                    } else {
                        q8g.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                    }
                    return;
                }
            } catch (Exception e16) {
                q8g.g("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e16);
            }
        }
    }

    public rxm() {
        this.d = null;
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.d = handlerThread;
            handlerThread.start();
        }
        if (!this.d.isAlive() || this.d.getLooper() == null) {
            return;
        }
        this.f16392e = new a(this.d.getLooper());
    }

    public static synchronized rxm b() {
        if (h == null) {
            h = new rxm();
        }
        return h;
    }

    public int a(int i) {
        if (i == 0) {
            int iB = com.tencent.open.utils.a.d(uum.a(), null).b("Common_CGIReportFrequencySuccess");
            if (iB == 0) {
                return 10;
            }
            return iB;
        }
        int iB2 = com.tencent.open.utils.a.d(uum.a(), null).b("Common_CGIReportFrequencyFailed");
        if (iB2 == 0) {
            return 100;
        }
        return iB2;
    }

    public void c(Bundle bundle, String str, boolean z) {
        if (bundle == null) {
            return;
        }
        q8g.j("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (h("report_via", str) || z) {
            this.f.execute(new b(bundle, z));
        }
    }

    public void d(String str, long j2, long j3, long j4, int i) {
        e(str, j2, j3, j4, i, "", false);
    }

    public void e(String str, long j2, long j3, long j4, int i, String str2, boolean z) {
        q8g.j("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j2 + " | reqSize:" + j3 + " | rspSize: " + j4 + " | responseCode: " + i + " | detail: " + str2);
        if (h("report_cgi", "" + i) || z) {
            this.g.execute(new c(j2, str, str2, i, j3, j4, z));
        }
    }

    public void f(String str, String str2, Bundle bundle, boolean z) {
        y0n.b(new f(bundle, str, z, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c A[PHI: r3
  0x001c: PHI (r3v11 int) = (r3v7 int), (r3v14 int) binds: [B:11:0x0034, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean g(String str, int i) {
        int iB;
        int i2 = 5;
        if (str.equals("report_cgi")) {
            iB = com.tencent.open.utils.a.d(uum.a(), null).b("Common_CGIReportMaxcount");
            if (iB != 0) {
                i2 = iB;
            }
        } else if (str.equals("report_via")) {
            iB = com.tencent.open.utils.a.d(uum.a(), null).b("Agent_ReportBatchCount");
            if (iB != 0) {
                i2 = iB;
            }
        } else {
            i2 = 0;
        }
        q8g.d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + i2);
        return i >= i2;
    }

    public boolean h(String str, String str2) {
        int iA;
        q8g.d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 100;
        if (!str.equals("report_cgi")) {
            if (str.equals("report_via")) {
                iA = fsm.b(str2);
                if (this.a.nextInt(100) < iA) {
                    i = iA;
                    z = true;
                }
            }
            q8g.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
            return z;
        }
        try {
            iA = a(Integer.parseInt(str2));
            if (this.a.nextInt(100) < iA) {
                z = true;
            }
        } catch (Exception unused) {
            return false;
        }
        i = iA;
        q8g.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
        return z;
    }

    public void i() {
        this.g.execute(new d());
    }

    public Bundle j() {
        if (this.b.size() == 0) {
            return null;
        }
        com.tencent.open.a.b bVar = (com.tencent.open.a.b) this.b.get(0);
        if (bVar == null) {
            q8g.d("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
            return null;
        }
        String str = bVar.a.get("appid");
        List<Serializable> listG = sum.a().g("report_cgi");
        if (listG != null) {
            this.b.addAll(listG);
        }
        q8g.d("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: " + this.b.size());
        if (this.b.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("appid", str);
            bundle.putString("releaseversion", s04.SDK_VERSION_REPORT);
            bundle.putString("device", Build.DEVICE);
            bundle.putString("qua", s04.SDK_QUA);
            bundle.putString("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
            for (int i = 0; i < this.b.size(); i++) {
                com.tencent.open.a.b bVar2 = (com.tencent.open.a.b) this.b.get(i);
                bundle.putString(i + "_1", bVar2.a.get("apn"));
                bundle.putString(i + "_2", bVar2.a.get(RecordCombinedLineChart.KEY_STEP_CADENCE));
                bundle.putString(i + "_3", bVar2.a.get("commandid"));
                bundle.putString(i + "_4", bVar2.a.get("resultCode"));
                bundle.putString(i + "_5", bVar2.a.get("timeCost"));
                bundle.putString(i + "_6", bVar2.a.get("reqSize"));
                bundle.putString(i + "_7", bVar2.a.get("rspSize"));
                bundle.putString(i + "_8", bVar2.a.get("detail"));
                bundle.putString(i + "_9", bVar2.a.get("uin"));
                bundle.putString(i + "_10", emm.g(uum.a()) + "&" + bVar2.a.get("deviceInfo"));
            }
            q8g.j("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: " + bundle.toString());
            return bundle;
        } catch (Exception e2) {
            q8g.g("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", e2);
            return null;
        }
    }

    public Bundle k() {
        List<Serializable> listG = sum.a().g("report_via");
        if (listG != null) {
            this.f16391c.addAll(listG);
        }
        q8g.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f16391c.size());
        if (this.f16391c.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f16391c) {
            JSONObject jSONObject = new JSONObject();
            com.tencent.open.a.b bVar = (com.tencent.open.a.b) serializable;
            for (String str : bVar.a.keySet()) {
                try {
                    String str2 = bVar.a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e2) {
                    q8g.g("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
                }
            }
            jSONArray.put(jSONObject);
        }
        q8g.j("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            bundle.putString("data", jSONObject2.toString());
            return bundle;
        } catch (JSONException e3) {
            q8g.g("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e3);
            return null;
        }
    }

    public void l() {
        this.f.execute(new e());
    }
}
