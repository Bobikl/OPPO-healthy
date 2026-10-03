package io.netty.incubator.codec.quic.track.bean;

import androidx.core.app.FrameMetricsAggregator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003Jo\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00104\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\fHÖ\u0001J\b\u00107\u001a\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00068"}, d2 = {"Lio/netty/incubator/codec/quic/track/bean/RetryInfo;", "", "retry_dest_ip", "", "retry_ex_name", "retry_ex_message", "retry_ex_cause_name", "retry_ex_cause_message", "retry_ex_stage", "retry_time", "", "conn_count", "", "request_success", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIZ)V", "getConn_count", "()I", "setConn_count", "(I)V", "getRequest_success", "()Z", "setRequest_success", "(Z)V", "getRetry_dest_ip", "()Ljava/lang/String;", "setRetry_dest_ip", "(Ljava/lang/String;)V", "getRetry_ex_cause_message", "setRetry_ex_cause_message", "getRetry_ex_cause_name", "setRetry_ex_cause_name", "getRetry_ex_message", "setRetry_ex_message", "getRetry_ex_name", "setRetry_ex_name", "getRetry_ex_stage", "setRetry_ex_stage", "getRetry_time", "()J", "setRetry_time", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RetryInfo {
    private int conn_count;
    private boolean request_success;

    @Nullable
    private String retry_dest_ip;

    @Nullable
    private String retry_ex_cause_message;

    @Nullable
    private String retry_ex_cause_name;

    @Nullable
    private String retry_ex_message;

    @Nullable
    private String retry_ex_name;

    @Nullable
    private String retry_ex_stage;
    private long retry_time;

    public RetryInfo() {
        this(null, null, null, null, null, null, 0L, 0, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRetry_dest_ip() {
        return this.retry_dest_ip;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRetry_ex_name() {
        return this.retry_ex_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRetry_ex_message() {
        return this.retry_ex_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRetry_ex_cause_name() {
        return this.retry_ex_cause_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRetry_ex_cause_message() {
        return this.retry_ex_cause_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRetry_ex_stage() {
        return this.retry_ex_stage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRetry_time() {
        return this.retry_time;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getConn_count() {
        return this.conn_count;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRequest_success() {
        return this.request_success;
    }

    @NotNull
    public final RetryInfo copy(@Nullable String retry_dest_ip, @Nullable String retry_ex_name, @Nullable String retry_ex_message, @Nullable String retry_ex_cause_name, @Nullable String retry_ex_cause_message, @Nullable String retry_ex_stage, long retry_time, int conn_count, boolean request_success) {
        return new RetryInfo(retry_dest_ip, retry_ex_name, retry_ex_message, retry_ex_cause_name, retry_ex_cause_message, retry_ex_stage, retry_time, conn_count, request_success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetryInfo)) {
            return false;
        }
        RetryInfo retryInfo = (RetryInfo) other;
        return Intrinsics.areEqual(this.retry_dest_ip, retryInfo.retry_dest_ip) && Intrinsics.areEqual(this.retry_ex_name, retryInfo.retry_ex_name) && Intrinsics.areEqual(this.retry_ex_message, retryInfo.retry_ex_message) && Intrinsics.areEqual(this.retry_ex_cause_name, retryInfo.retry_ex_cause_name) && Intrinsics.areEqual(this.retry_ex_cause_message, retryInfo.retry_ex_cause_message) && Intrinsics.areEqual(this.retry_ex_stage, retryInfo.retry_ex_stage) && this.retry_time == retryInfo.retry_time && this.conn_count == retryInfo.conn_count && this.request_success == retryInfo.request_success;
    }

    public final int getConn_count() {
        return this.conn_count;
    }

    public final boolean getRequest_success() {
        return this.request_success;
    }

    @Nullable
    public final String getRetry_dest_ip() {
        return this.retry_dest_ip;
    }

    @Nullable
    public final String getRetry_ex_cause_message() {
        return this.retry_ex_cause_message;
    }

    @Nullable
    public final String getRetry_ex_cause_name() {
        return this.retry_ex_cause_name;
    }

    @Nullable
    public final String getRetry_ex_message() {
        return this.retry_ex_message;
    }

    @Nullable
    public final String getRetry_ex_name() {
        return this.retry_ex_name;
    }

    @Nullable
    public final String getRetry_ex_stage() {
        return this.retry_ex_stage;
    }

    public final long getRetry_time() {
        return this.retry_time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.retry_dest_ip;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.retry_ex_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.retry_ex_message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.retry_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.retry_ex_cause_message;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.retry_ex_stage;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.retry_time)) * 31) + Integer.hashCode(this.conn_count)) * 31;
        boolean z = this.request_success;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode6 + r3;
    }

    public final void setConn_count(int i) {
        this.conn_count = i;
    }

    public final void setRequest_success(boolean z) {
        this.request_success = z;
    }

    public final void setRetry_dest_ip(@Nullable String str) {
        this.retry_dest_ip = str;
    }

    public final void setRetry_ex_cause_message(@Nullable String str) {
        this.retry_ex_cause_message = str;
    }

    public final void setRetry_ex_cause_name(@Nullable String str) {
        this.retry_ex_cause_name = str;
    }

    public final void setRetry_ex_message(@Nullable String str) {
        this.retry_ex_message = str;
    }

    public final void setRetry_ex_name(@Nullable String str) {
        this.retry_ex_name = str;
    }

    public final void setRetry_ex_stage(@Nullable String str) {
        this.retry_ex_stage = str;
    }

    public final void setRetry_time(long j2) {
        this.retry_time = j2;
    }

    @NotNull
    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("retry_dest_ip", this.retry_dest_ip);
        if (!this.request_success) {
            jSONObject.accumulate("retry_ex_name", this.retry_ex_name);
            jSONObject.accumulate("retry_ex_message", this.retry_ex_message);
            jSONObject.accumulate("retry_ex_cause_name", this.retry_ex_cause_name);
            jSONObject.accumulate("retry_ex_cause_message", this.retry_ex_cause_message);
            jSONObject.accumulate("retry_ex_stage", this.retry_ex_stage);
        }
        jSONObject.accumulate("retry_time", String.valueOf(this.retry_time));
        jSONObject.accumulate("conn_count", String.valueOf(this.conn_count));
        jSONObject.accumulate("request_success", String.valueOf(this.request_success));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ob.toString()");
        return string;
    }

    public RetryInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j2, int i, boolean z) {
        this.retry_dest_ip = str;
        this.retry_ex_name = str2;
        this.retry_ex_message = str3;
        this.retry_ex_cause_name = str4;
        this.retry_ex_cause_message = str5;
        this.retry_ex_stage = str6;
        this.retry_time = j2;
        this.conn_count = i;
        this.request_success = z;
    }

    public /* synthetic */ RetryInfo(String str, String str2, String str3, String str4, String str5, String str6, long j2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? true : z);
    }
}
