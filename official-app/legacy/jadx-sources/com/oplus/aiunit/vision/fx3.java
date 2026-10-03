package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020&\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u00105\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020706\u0012\b\b\u0002\u0010@\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\u001c\u0010*R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u00101\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b,\u00103R\"\u00105\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b\u0010\u00102\"\u0004\b/\u00103R(\u0010=\u001a\b\u0012\u0004\u0012\u000207068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b\t\u0010:\"\u0004\b;\u0010<R\"\u0010@\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00100\u001a\u0004\b?\u00102\"\u0004\b\u0018\u00103¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/fx3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDest_ip", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "dest_ip", "b", "getConn_ex_name", "setConn_ex_name", "conn_ex_name", "c", "getConn_ex_message", "setConn_ex_message", "conn_ex_message", "d", "getConn_ex_cause_name", "setConn_ex_cause_name", "conn_ex_cause_name", MapSchema.FIELD_NAME_ENTRY, "getConn_ex_cause_message", "setConn_ex_cause_message", "conn_ex_cause_message", "I", "getFailed_ip_count", "()I", b2n.f, "(I)V", "failed_ip_count", "", "J", "getConn_time", "()J", "(J)V", "conn_time", b2n.g, "getCarrier", "carrier", "i", "Z", vs2.IS_RACE, "()Z", "(Z)V", "j", vs2.IS_REUSE, "", "Lcom/oplus/aiunit/vision/gx3;", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "()Ljava/util/List;", "setConn_retry_list", "(Ljava/util/List;)V", "conn_retry_list", LogFieldKey.LEVEL_KEY, "getConn_success", "conn_success", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;ZZLjava/util/List;Z)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class fx3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String dest_ip;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String conn_ex_name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String conn_ex_message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String conn_ex_cause_name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String conn_ex_cause_message;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int failed_ip_count;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long conn_time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public String carrier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean is_race;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean is_reuse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<gx3> conn_retry_list;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean conn_success;

    public fx3() {
        this(null, null, null, null, null, 0, 0L, null, false, false, null, false, 4095, null);
    }

    @NotNull
    public final List<gx3> a() {
        return this.conn_retry_list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIs_reuse() {
        return this.is_reuse;
    }

    public final void c(@Nullable String str) {
        this.carrier = str;
    }

    public final void d(boolean z) {
        this.conn_success = z;
    }

    public final void e(long j2) {
        this.conn_time = j2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fx3)) {
            return false;
        }
        fx3 fx3Var = (fx3) other;
        return Intrinsics.areEqual(this.dest_ip, fx3Var.dest_ip) && Intrinsics.areEqual(this.conn_ex_name, fx3Var.conn_ex_name) && Intrinsics.areEqual(this.conn_ex_message, fx3Var.conn_ex_message) && Intrinsics.areEqual(this.conn_ex_cause_name, fx3Var.conn_ex_cause_name) && Intrinsics.areEqual(this.conn_ex_cause_message, fx3Var.conn_ex_cause_message) && this.failed_ip_count == fx3Var.failed_ip_count && this.conn_time == fx3Var.conn_time && Intrinsics.areEqual(this.carrier, fx3Var.carrier) && this.is_race == fx3Var.is_race && this.is_reuse == fx3Var.is_reuse && Intrinsics.areEqual(this.conn_retry_list, fx3Var.conn_retry_list) && this.conn_success == fx3Var.conn_success;
    }

    public final void f(@Nullable String str) {
        this.dest_ip = str;
    }

    public final void g(int i) {
        this.failed_ip_count = i;
    }

    public final void h(boolean z) {
        this.is_race = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        String str = this.dest_ip;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.conn_ex_name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.conn_ex_message;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.conn_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.conn_ex_cause_message;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.failed_ip_count)) * 31) + Long.hashCode(this.conn_time)) * 31;
        String str6 = this.carrier;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.is_race;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode6 + r2) * 31;
        boolean z2 = this.is_reuse;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (i + r3) * 31;
        List<gx3> list = this.conn_retry_list;
        int iHashCode7 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z3 = this.conn_success;
        return iHashCode7 + (z3 ? 1 : z3);
    }

    public final void i(boolean z) {
        this.is_reuse = z;
    }

    @NotNull
    public String toString() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.conn_retry_list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((gx3) it.next()).i());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("dest_ip", this.dest_ip);
        if (!this.conn_success) {
            jSONObject.accumulate("conn_ex_name", this.conn_ex_name);
            jSONObject.accumulate("conn_ex_message", this.conn_ex_message);
            jSONObject.accumulate("conn_ex_cause_name", this.conn_ex_cause_name);
            jSONObject.accumulate("conn_ex_cause_message", this.conn_ex_cause_message);
        }
        jSONObject.accumulate("failed_ip_count", String.valueOf(this.failed_ip_count));
        jSONObject.accumulate("conn_time", String.valueOf(this.conn_time));
        jSONObject.accumulate("carrier", this.carrier);
        jSONObject.accumulate(vs2.IS_RACE, String.valueOf(this.is_race));
        jSONObject.accumulate(vs2.IS_REUSE, String.valueOf(this.is_reuse));
        if (this.conn_retry_list.size() > 0) {
            jSONObject.accumulate("conn_retry_list", jSONArray);
        }
        jSONObject.accumulate("conn_success", String.valueOf(this.conn_success));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ob.toString()");
        return string;
    }

    public fx3(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, long j2, @Nullable String str6, boolean z, boolean z2, @NotNull List<gx3> conn_retry_list, boolean z3) {
        Intrinsics.checkNotNullParameter(conn_retry_list, "conn_retry_list");
        this.dest_ip = str;
        this.conn_ex_name = str2;
        this.conn_ex_message = str3;
        this.conn_ex_cause_name = str4;
        this.conn_ex_cause_message = str5;
        this.failed_ip_count = i;
        this.conn_time = j2;
        this.carrier = str6;
        this.is_race = z;
        this.is_reuse = z2;
        this.conn_retry_list = conn_retry_list;
        this.conn_success = z3;
    }

    public /* synthetic */ fx3(String str, String str2, String str3, String str4, String str5, int i, long j2, String str6, boolean z, boolean z2, List list, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) == 0 ? str6 : "", (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? true : z2, (i2 & 1024) != 0 ? new ArrayList() : list, (i2 & 2048) == 0 ? z3 : false);
    }
}
