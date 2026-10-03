package com.oplus.aiunit.vision;

import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bP\u0010QJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0000J\u0006\u0010\u0015\u001a\u00020\u0000J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\u0019\u001a\u00020\u0007R\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\"\u0010(\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\"\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\"\u0010.\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\"\u00101\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\"\u00104\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR\"\u00108\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\"\u0010<\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010\u001eR\"\u0010@\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010\u001eR\"\u0010C\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001a\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\"\u0010E\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001a\u001a\u0004\b=\u0010\u001c\"\u0004\bD\u0010\u001eR\"\u0010G\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b9\u0010\u001c\"\u0004\bF\u0010\u001eR\"\u0010I\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\bH\u0010\u001eR\"\u0010L\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010\u001eR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010N¨\u0006R"}, d2 = {"Lcom/oplus/aiunit/vision/ezj;", "", "C", "d", "c", "A", "z", "", c8l.KEY_B, ExifInterface.LONGITUDE_EAST, "D", UserInfo.SEX_FEMALE, "u", "t", "s", "r", "y", "x", "w", "v", "a", MapSchema.FIELD_NAME_ENTRY, "timeStat", "", "b", "q", "J", "getStartTime", "()J", "setStartTime", "(J)V", "startTime", b2n.f, "setDnsStartTime", "dnsStartTime", "f", "setDnsEndTime", "dnsEndTime", "n", "setSocketStartTime", "socketStartTime", LogFieldKey.MESSAGE_KEY, "setSocketEndTime", "socketEndTime", LogFieldKey.PROCESS_NAME_KEY, "setTlsStartTime", "tlsStartTime", "o", "setTlsEndTime", "tlsEndTime", b2n.g, "setRequestHeadersStartTime", "requestHeadersStartTime", "i", "getRequestHeadersEndTime", "setRequestHeadersEndTime", "requestHeadersEndTime", "j", "getRequestBodyStartTime", "setRequestBodyStartTime", "requestBodyStartTime", MapSchema.FIELD_NAME_KEY, "getRequestBodyEndTime", "setRequestBodyEndTime", "requestBodyEndTime", LogFieldKey.LEVEL_KEY, "setResponseHeadersStartTime", "responseHeadersStartTime", "setResponseHeadersEndTime", "responseHeadersEndTime", "setResponseBodyStartTime", "responseBodyStartTime", "setResponseBodyEndTime", "responseBodyEndTime", "getEndTime", "setEndTime", "endTime", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "FULL_FORMAT", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class ezj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long dnsStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long dnsEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long socketStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long socketEndTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long tlsStartTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long tlsEndTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long requestHeadersStartTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long requestHeadersEndTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long requestBodyStartTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long requestBodyEndTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public long responseHeadersStartTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long responseHeadersEndTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long responseBodyStartTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long responseBodyEndTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long endTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final SimpleDateFormat FULL_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.getDefault());

    @NotNull
    public final ezj A() {
        this.socketStartTime = q();
        return this;
    }

    public final long B() {
        return this.socketEndTime - this.socketStartTime;
    }

    @NotNull
    public final ezj C() {
        this.startTime = q();
        return this;
    }

    @NotNull
    public final ezj D() {
        this.tlsEndTime = q();
        return this;
    }

    @NotNull
    public final ezj E() {
        this.tlsStartTime = q();
        return this;
    }

    public final long F() {
        return this.tlsEndTime - this.tlsStartTime;
    }

    @NotNull
    public final ezj a() {
        long jQ = q();
        if (this.socketEndTime == 0) {
            this.socketEndTime = jQ;
        }
        if (this.tlsStartTime > 0 && this.tlsEndTime == 0) {
            this.tlsEndTime = jQ;
        }
        return this;
    }

    public final void b(@Nullable ezj timeStat) {
        if (timeStat != null) {
            this.startTime = timeStat.startTime;
            this.dnsStartTime = timeStat.dnsStartTime;
            this.dnsEndTime = timeStat.dnsEndTime;
            this.socketStartTime = timeStat.socketStartTime;
            this.socketEndTime = timeStat.socketEndTime;
            this.tlsStartTime = timeStat.tlsStartTime;
            this.tlsEndTime = timeStat.tlsEndTime;
            this.requestHeadersStartTime = timeStat.requestHeadersStartTime;
            this.requestHeadersEndTime = timeStat.requestHeadersEndTime;
            this.requestBodyStartTime = timeStat.requestBodyStartTime;
            this.requestBodyEndTime = timeStat.requestBodyEndTime;
            this.responseHeadersStartTime = timeStat.responseHeadersStartTime;
            this.responseHeadersEndTime = timeStat.responseHeadersEndTime;
            this.responseBodyStartTime = timeStat.responseBodyStartTime;
            this.responseBodyEndTime = timeStat.responseBodyEndTime;
            this.endTime = timeStat.endTime;
        }
    }

    @NotNull
    public final ezj c() {
        this.dnsEndTime = q();
        return this;
    }

    @NotNull
    public final ezj d() {
        this.dnsStartTime = q();
        return this;
    }

    @NotNull
    public final ezj e() {
        this.endTime = q();
        return this;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getDnsEndTime() {
        return this.dnsEndTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getDnsStartTime() {
        return this.dnsStartTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getRequestHeadersStartTime() {
        return this.requestHeadersStartTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getResponseBodyEndTime() {
        return this.responseBodyEndTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getResponseBodyStartTime() {
        return this.responseBodyStartTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getResponseHeadersEndTime() {
        return this.responseHeadersEndTime;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getResponseHeadersStartTime() {
        return this.responseHeadersStartTime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getSocketEndTime() {
        return this.socketEndTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getSocketStartTime() {
        return this.socketStartTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTlsEndTime() {
        return this.tlsEndTime;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getTlsStartTime() {
        return this.tlsStartTime;
    }

    public final long q() {
        return SystemClock.uptimeMillis();
    }

    @NotNull
    public final ezj r() {
        this.requestBodyEndTime = q();
        return this;
    }

    @NotNull
    public final ezj s() {
        this.requestBodyStartTime = q();
        return this;
    }

    @NotNull
    public final ezj t() {
        this.requestHeadersEndTime = q();
        return this;
    }

    @NotNull
    public final ezj u() {
        this.requestHeadersStartTime = q();
        return this;
    }

    @NotNull
    public final ezj v() {
        this.responseBodyEndTime = q();
        return this;
    }

    @NotNull
    public final ezj w() {
        this.responseBodyStartTime = q();
        return this;
    }

    @NotNull
    public final ezj x() {
        this.responseHeadersEndTime = q();
        return this;
    }

    @NotNull
    public final ezj y() {
        this.responseHeadersStartTime = q();
        return this;
    }

    @NotNull
    public final ezj z() {
        this.socketEndTime = q();
        return this;
    }
}
