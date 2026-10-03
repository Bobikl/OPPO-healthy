package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\u001a\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b\u0013\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b\f\u0010\u001fR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b#\u0010\u001fR$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b+\u0010/¨\u00063"}, d2 = {"Lcom/oplus/aiunit/vision/gx3;", "", "", "toString", "Lorg/json/JSONObject;", "i", "", "hashCode", "other", "", "equals", "", "a", "J", "getConn_retry_time", "()J", b2n.f, "(J)V", "conn_retry_time", "b", "Z", "getConn_retry_success", "()Z", "f", "(Z)V", "conn_retry_success", "c", "Ljava/lang/String;", "getConn_retry_ex_name", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "conn_retry_ex_name", "getConn_retry_ex_message", "conn_retry_ex_message", MapSchema.FIELD_NAME_ENTRY, "getConn_retry_ex_cause_name", "conn_retry_ex_cause_name", "getConn_retry_ex_cause_message", "conn_retry_ex_cause_message", "getConn_retry_ex_stage", "conn_retry_ex_stage", "Lcom/oplus/aiunit/vision/f9f;", b2n.g, "Lcom/oplus/aiunit/vision/f9f;", "getRace_extra", "()Lcom/oplus/aiunit/vision/f9f;", "(Lcom/oplus/aiunit/vision/f9f;)V", "race_extra", "<init>", "(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/f9f;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class gx3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long conn_retry_time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean conn_retry_success;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String conn_retry_ex_name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String conn_retry_ex_message;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String conn_retry_ex_cause_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String conn_retry_ex_cause_message;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String conn_retry_ex_stage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public f9f race_extra;

    public gx3() {
        this(0L, false, null, null, null, null, null, null, 255, null);
    }

    public final void a(@Nullable String str) {
        this.conn_retry_ex_cause_message = str;
    }

    public final void b(@Nullable String str) {
        this.conn_retry_ex_cause_name = str;
    }

    public final void c(@Nullable String str) {
        this.conn_retry_ex_message = str;
    }

    public final void d(@Nullable String str) {
        this.conn_retry_ex_name = str;
    }

    public final void e(@Nullable String str) {
        this.conn_retry_ex_stage = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof gx3)) {
            return false;
        }
        gx3 gx3Var = (gx3) other;
        return this.conn_retry_time == gx3Var.conn_retry_time && this.conn_retry_success == gx3Var.conn_retry_success && Intrinsics.areEqual(this.conn_retry_ex_name, gx3Var.conn_retry_ex_name) && Intrinsics.areEqual(this.conn_retry_ex_message, gx3Var.conn_retry_ex_message) && Intrinsics.areEqual(this.conn_retry_ex_cause_name, gx3Var.conn_retry_ex_cause_name) && Intrinsics.areEqual(this.conn_retry_ex_cause_message, gx3Var.conn_retry_ex_cause_message) && Intrinsics.areEqual(this.conn_retry_ex_stage, gx3Var.conn_retry_ex_stage) && Intrinsics.areEqual(this.race_extra, gx3Var.race_extra);
    }

    public final void f(boolean z) {
        this.conn_retry_success = z;
    }

    public final void g(long j2) {
        this.conn_retry_time = j2;
    }

    public final void h(@Nullable f9f f9fVar) {
        this.race_extra = f9fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.conn_retry_time) * 31;
        boolean z = this.conn_retry_success;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.conn_retry_ex_name;
        int iHashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.conn_retry_ex_message;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.conn_retry_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.conn_retry_ex_cause_message;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.conn_retry_ex_stage;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        f9f f9fVar = this.race_extra;
        return iHashCode6 + (f9fVar != null ? f9fVar.hashCode() : 0);
    }

    @NotNull
    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("conn_retry_time", String.valueOf(this.conn_retry_time));
        if (!this.conn_retry_success) {
            jSONObject.accumulate("conn_retry_ex_name", this.conn_retry_ex_name);
            jSONObject.accumulate("conn_retry_ex_message", this.conn_retry_ex_message);
            jSONObject.accumulate("conn_retry_ex_cause_name", this.conn_retry_ex_cause_name);
            jSONObject.accumulate("conn_retry_ex_cause_message", this.conn_retry_ex_cause_message);
            jSONObject.accumulate("conn_retry_ex_stage", this.conn_retry_ex_stage);
        }
        jSONObject.accumulate("conn_retry_success", String.valueOf(this.conn_retry_success));
        f9f f9fVar = this.race_extra;
        if (f9fVar != null) {
            jSONObject.accumulate("race_extra", f9fVar != null ? f9fVar.a() : null);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("conn_retry_time", String.valueOf(this.conn_retry_time));
        if (!this.conn_retry_success) {
            jSONObject.accumulate("conn_retry_ex_name", this.conn_retry_ex_name);
            jSONObject.accumulate("conn_retry_ex_message", this.conn_retry_ex_message);
            jSONObject.accumulate("conn_retry_ex_cause_name", this.conn_retry_ex_cause_name);
            jSONObject.accumulate("conn_retry_ex_cause_message", this.conn_retry_ex_cause_message);
            jSONObject.accumulate("conn_retry_ex_stage", this.conn_retry_ex_stage);
        }
        jSONObject.accumulate("conn_retry_success", String.valueOf(this.conn_retry_success));
        f9f f9fVar = this.race_extra;
        if (f9fVar != null) {
            jSONObject.accumulate("race_extra", f9fVar);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ob.toString()");
        return string;
    }

    public gx3(long j2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable f9f f9fVar) {
        this.conn_retry_time = j2;
        this.conn_retry_success = z;
        this.conn_retry_ex_name = str;
        this.conn_retry_ex_message = str2;
        this.conn_retry_ex_cause_name = str3;
        this.conn_retry_ex_cause_message = str4;
        this.conn_retry_ex_stage = str5;
        this.race_extra = f9fVar;
    }

    public /* synthetic */ gx3(long j2, boolean z, String str, String str2, String str3, String str4, String str5, f9f f9fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? true : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? null : f9fVar);
    }
}
