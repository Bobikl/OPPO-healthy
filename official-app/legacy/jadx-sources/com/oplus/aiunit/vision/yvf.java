package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010)\u001a\u00020#\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u0013\u0010(R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b\t\u0010.R\"\u00106\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/yvf;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getRetry_dest_ip", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "retry_dest_ip", "getRetry_ex_name", "setRetry_ex_name", "retry_ex_name", "c", "getRetry_ex_message", "setRetry_ex_message", "retry_ex_message", "d", "getRetry_ex_cause_name", "setRetry_ex_cause_name", "retry_ex_cause_name", MapSchema.FIELD_NAME_ENTRY, "getRetry_ex_cause_message", "setRetry_ex_cause_message", "retry_ex_cause_message", "f", "getRetry_ex_stage", "setRetry_ex_stage", "retry_ex_stage", "", b2n.f, "J", "getRetry_time", "()J", "(J)V", "retry_time", b2n.g, "I", "getConn_count", "()I", "(I)V", "conn_count", "i", "Z", "getRequest_success", "()Z", "setRequest_success", "(Z)V", "request_success", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIZ)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class yvf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String retry_dest_ip;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String retry_ex_name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String retry_ex_message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String retry_ex_cause_name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String retry_ex_cause_message;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String retry_ex_stage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long retry_time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int conn_count;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean request_success;

    public yvf() {
        this(null, null, null, null, null, null, 0L, 0, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final void a(int i) {
        this.conn_count = i;
    }

    public final void b(@Nullable String str) {
        this.retry_dest_ip = str;
    }

    public final void c(long j2) {
        this.retry_time = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yvf)) {
            return false;
        }
        yvf yvfVar = (yvf) other;
        return Intrinsics.areEqual(this.retry_dest_ip, yvfVar.retry_dest_ip) && Intrinsics.areEqual(this.retry_ex_name, yvfVar.retry_ex_name) && Intrinsics.areEqual(this.retry_ex_message, yvfVar.retry_ex_message) && Intrinsics.areEqual(this.retry_ex_cause_name, yvfVar.retry_ex_cause_name) && Intrinsics.areEqual(this.retry_ex_cause_message, yvfVar.retry_ex_cause_message) && Intrinsics.areEqual(this.retry_ex_stage, yvfVar.retry_ex_stage) && this.retry_time == yvfVar.retry_time && this.conn_count == yvfVar.conn_count && this.request_success == yvfVar.request_success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.retry_dest_ip;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.retry_ex_name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.retry_ex_message;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.retry_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.retry_ex_cause_message;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.retry_ex_stage;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.retry_time)) * 31) + Integer.hashCode(this.conn_count)) * 31;
        boolean z = this.request_success;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode6 + r3;
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

    public yvf(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j2, int i, boolean z) {
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

    public /* synthetic */ yvf(String str, String str2, String str3, String str4, String str5, String str6, long j2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? true : z);
    }
}
