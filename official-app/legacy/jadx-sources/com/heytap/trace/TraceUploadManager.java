package com.heytap.trace;

import android.util.Log;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.common.util.TimeUtilKt;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.kxg;
import com.oplus.aiunit.vision.ne0;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/heytap/trace/TraceUploadManager;", "", "Lcom/heytap/trace/TraceSegment;", "traceSegment", "", MapSchema.FIELD_NAME_ENTRY, "", "", "failUrls", "d", "Ljava/io/DataOutputStream;", "dataOutputStream", "f", "Ljava/io/Closeable;", "closeable", "b", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ThreadPoolExecutor;", "Lkotlin/Lazy;", "c", "()Ljava/util/concurrent/ThreadPoolExecutor;", "uploadThreadPool", "Lcom/oplus/aiunit/vision/kxg;", "Lcom/oplus/aiunit/vision/kxg;", "getSettingsStore", "()Lcom/oplus/aiunit/vision/kxg;", "settingsStore", "<init>", "(Lcom/oplus/aiunit/vision/kxg;)V", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
public final class TraceUploadManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Lazy uploadThreadPool;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kxg settingsStore;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TraceSegment f8317j;

        public a(TraceSegment traceSegment) {
            this.f8317j = traceSegment;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            TraceUploadManager.this.d(this.f8317j, new ArrayList());
        }
    }

    public TraceUploadManager(@NotNull kxg settingsStore) {
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        this.settingsStore = settingsStore;
        this.TAG = ne0.TAG;
        this.uploadThreadPool = LazyKt__LazyJVMKt.lazy(new Function0<ThreadPoolExecutor>() { // from class: com.heytap.trace.TraceUploadManager$uploadThreadPool$2

            @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/heytap/trace/TraceUploadManager$uploadThreadPool$2$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "Ljava/util/concurrent/atomic/AtomicInteger;", "i", "Ljava/util/concurrent/atomic/AtomicInteger;", "getIndex", "()Ljava/util/concurrent/atomic/AtomicInteger;", "index", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
            public static final class a implements ThreadFactory {

                /* JADX INFO: renamed from: i, reason: from kotlin metadata */
                @NotNull
                public final AtomicInteger index = new AtomicInteger();

                @Override // java.util.concurrent.ThreadFactory
                @NotNull
                public Thread newThread(@NotNull Runnable r) {
                    Intrinsics.checkNotNullParameter(r, "r");
                    Thread thread = new Thread(r);
                    thread.setName("TraceUploadThreadPool_" + this.index.get());
                    this.index.incrementAndGet();
                    thread.setDaemon(true);
                    return thread;
                }
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final ThreadPoolExecutor invoke() {
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new a());
            }
        });
        c().setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final ThreadPoolExecutor c() {
        return (ThreadPoolExecutor) this.uploadThreadPool.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x019b  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        if (p010kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) "connect", false, 2, (java.lang.Object) null) != false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.heytap.trace.TraceUploadManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TraceSegment traceSegment, List<String> failUrls) throws Throwable {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        List<String> listB = this.settingsStore.b();
        Intrinsics.checkNotNullExpressionValue(listB, "settingsStore.uploadAddress");
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listB);
        mutableList.removeAll(failUrls);
        int size = mutableList.size();
        if (size == 0) {
            Log.e(this.TAG, "no aliviable trace server.");
            return;
        }
        String str = (String) mutableList.get(new Random().nextInt(size));
        if (str == null || str.length() == 0) {
            Log.e(this.TAG, "sendPost error, url is empty, Unexpected HTTP Request: " + traceSegment);
            return;
        }
        ?? r3 = 0;
        dataOutputStream = null;
        dataOutputStream = null;
        DataOutputStream dataOutputStream2 = null;
        DataOutputStream dataOutputStream3 = null;
        r3 = 0;
        try {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setConnectTimeout(20000);
                        httpURLConnection.setReadTimeout(60000);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestProperty("Content-Type", FileSyncModel.streamMime);
                        httpURLConnection.setRequestProperty("Connection", "close");
                        httpURLConnection.setRequestProperty("t", String.valueOf(TimeUtilKt.b()));
                        dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            Intrinsics.checkNotNull(traceSegment);
                            f(dataOutputStream, traceSegment);
                            b(dataOutputStream);
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.d(this.TAG, "send trace post Request to [" + str + "], sgment = " + traceSegment + ", response is " + responseCode + "->" + httpURLConnection.getResponseMessage());
                            if (200 == responseCode) {
                                b(dataOutputStream);
                                httpURLConnection.disconnect();
                                return;
                            }
                            if (408 == responseCode) {
                                failUrls.add(str);
                                d(traceSegment, failUrls);
                                b(dataOutputStream);
                                httpURLConnection.disconnect();
                                return;
                            }
                            Log.e(this.TAG, "sendPost error,url=" + str + ",Unexpected HTTP response: " + responseCode + StringUtil.SPACE + responseCode);
                            b(dataOutputStream);
                            httpURLConnection.disconnect();
                            r3 = dataOutputStream2;
                        } catch (IOException e2) {
                            e = e2;
                            if (!(e instanceof ConnectException)) {
                                if (e instanceof SocketTimeoutException) {
                                    String message = e.getMessage();
                                    Intrinsics.checkNotNull(message);
                                }
                                b(dataOutputStream);
                                if (httpURLConnection == null) {
                                    return;
                                }
                            }
                            failUrls.add(str);
                            d(traceSegment, failUrls);
                            b(dataOutputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Exception unused) {
                            dataOutputStream3 = dataOutputStream;
                            Log.e(this.TAG, "upload trace log error,url=" + str);
                            b(dataOutputStream3);
                            dataOutputStream2 = dataOutputStream3;
                            r3 = dataOutputStream3;
                            if (httpURLConnection != null) {
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        dataOutputStream = null;
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    b(r3);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                dataOutputStream = null;
                httpURLConnection = null;
            } catch (Exception unused3) {
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
                b(r3);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r3 = 1;
        }
    }

    public final void e(@NotNull TraceSegment traceSegment) throws Exception {
        Intrinsics.checkNotNullParameter(traceSegment, "traceSegment");
        List<String> listB = this.settingsStore.b();
        if (listB == null || listB.isEmpty()) {
            return;
        }
        c().execute(new a(traceSegment));
    }

    public final void f(DataOutputStream dataOutputStream, TraceSegment traceSegment) throws IOException {
        if (traceSegment.getTraceId() == null || traceSegment.getMethodName() == null || traceSegment.getAppPackage() == null || traceSegment.getStatus() == null) {
            return;
        }
        dataOutputStream.writeByte(33);
        dataOutputStream.writeUTF(traceSegment.getTraceId());
        dataOutputStream.writeUTF(traceSegment.getMethodName());
        dataOutputStream.writeUTF(traceSegment.getAppPackage());
        dataOutputStream.writeUTF(traceSegment.getLevel());
        dataOutputStream.writeLong(traceSegment.getStartTime());
        dataOutputStream.writeInt((int) (traceSegment.getEndTime() - traceSegment.getStartTime()));
        StringBuilder sb = new StringBuilder();
        sb.append("appVersion=");
        sb.append(traceSegment.getAppVersion());
        sb.append("&model=");
        sb.append(traceSegment.getModel());
        sb.append("&brand=");
        sb.append(traceSegment.getBrand());
        Map<String, String> attachment = traceSegment.getAttachment();
        if (attachment != null) {
            for (Map.Entry<String, String> entry : attachment.entrySet()) {
                sb.append("&");
                sb.append(entry.getKey());
                sb.append(HttpUtils.EQUAL_SIGN);
                sb.append(entry.getValue());
            }
        }
        dataOutputStream.writeUTF(sb.toString());
        dataOutputStream.writeUTF(traceSegment.getServerIp() == null ? "" : traceSegment.getServerIp());
        dataOutputStream.writeUTF(traceSegment.getStatus());
        dataOutputStream.writeUTF(traceSegment.getErrorMsg() != null ? traceSegment.getErrorMsg() : "");
    }
}
