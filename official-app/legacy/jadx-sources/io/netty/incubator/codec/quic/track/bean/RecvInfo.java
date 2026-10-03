package io.netty.incubator.codec.quic.track.bean;

import androidx.core.app.FrameMetricsAggregator;
import io.netty.incubator.codec.quic.track.TrackHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003Jo\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\b\u00105\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u00066"}, d2 = {"Lio/netty/incubator/codec/quic/track/bean/RecvInfo;", "", "dest_ip", "", "recv_ex_time", "", "recv_ex_name", "recv_ex_message", "recv_ex_cause_name", "recv_ex_cause_message", "recv_ex_stage", TrackHelperKt.RECV_TIME, "recv_success", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "getDest_ip", "()Ljava/lang/String;", "setDest_ip", "(Ljava/lang/String;)V", "getRecv_ex_cause_message", "setRecv_ex_cause_message", "getRecv_ex_cause_name", "setRecv_ex_cause_name", "getRecv_ex_message", "setRecv_ex_message", "getRecv_ex_name", "setRecv_ex_name", "getRecv_ex_stage", "setRecv_ex_stage", "getRecv_ex_time", "()J", "setRecv_ex_time", "(J)V", "getRecv_success", "()Z", "setRecv_success", "(Z)V", "getRecv_time", "setRecv_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RecvInfo {

    @Nullable
    private String dest_ip;

    @Nullable
    private String recv_ex_cause_message;

    @Nullable
    private String recv_ex_cause_name;

    @Nullable
    private String recv_ex_message;

    @Nullable
    private String recv_ex_name;

    @Nullable
    private String recv_ex_stage;
    private long recv_ex_time;
    private boolean recv_success;
    private long recv_time;

    public RecvInfo() {
        this(null, 0L, null, null, null, null, null, 0L, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDest_ip() {
        return this.dest_ip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRecv_ex_time() {
        return this.recv_ex_time;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecv_ex_name() {
        return this.recv_ex_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecv_ex_message() {
        return this.recv_ex_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRecv_ex_cause_name() {
        return this.recv_ex_cause_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRecv_ex_cause_message() {
        return this.recv_ex_cause_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRecv_ex_stage() {
        return this.recv_ex_stage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getRecv_time() {
        return this.recv_time;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRecv_success() {
        return this.recv_success;
    }

    @NotNull
    public final RecvInfo copy(@Nullable String dest_ip, long recv_ex_time, @Nullable String recv_ex_name, @Nullable String recv_ex_message, @Nullable String recv_ex_cause_name, @Nullable String recv_ex_cause_message, @Nullable String recv_ex_stage, long recv_time, boolean recv_success) {
        return new RecvInfo(dest_ip, recv_ex_time, recv_ex_name, recv_ex_message, recv_ex_cause_name, recv_ex_cause_message, recv_ex_stage, recv_time, recv_success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecvInfo)) {
            return false;
        }
        RecvInfo recvInfo = (RecvInfo) other;
        return Intrinsics.areEqual(this.dest_ip, recvInfo.dest_ip) && this.recv_ex_time == recvInfo.recv_ex_time && Intrinsics.areEqual(this.recv_ex_name, recvInfo.recv_ex_name) && Intrinsics.areEqual(this.recv_ex_message, recvInfo.recv_ex_message) && Intrinsics.areEqual(this.recv_ex_cause_name, recvInfo.recv_ex_cause_name) && Intrinsics.areEqual(this.recv_ex_cause_message, recvInfo.recv_ex_cause_message) && Intrinsics.areEqual(this.recv_ex_stage, recvInfo.recv_ex_stage) && this.recv_time == recvInfo.recv_time && this.recv_success == recvInfo.recv_success;
    }

    @Nullable
    public final String getDest_ip() {
        return this.dest_ip;
    }

    @Nullable
    public final String getRecv_ex_cause_message() {
        return this.recv_ex_cause_message;
    }

    @Nullable
    public final String getRecv_ex_cause_name() {
        return this.recv_ex_cause_name;
    }

    @Nullable
    public final String getRecv_ex_message() {
        return this.recv_ex_message;
    }

    @Nullable
    public final String getRecv_ex_name() {
        return this.recv_ex_name;
    }

    @Nullable
    public final String getRecv_ex_stage() {
        return this.recv_ex_stage;
    }

    public final long getRecv_ex_time() {
        return this.recv_ex_time;
    }

    public final boolean getRecv_success() {
        return this.recv_success;
    }

    public final long getRecv_time() {
        return this.recv_time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        String str = this.dest_ip;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.recv_ex_time)) * 31;
        String str2 = this.recv_ex_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recv_ex_message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recv_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recv_ex_cause_message;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recv_ex_stage;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.recv_time)) * 31;
        boolean z = this.recv_success;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode6 + r4;
    }

    public final void setDest_ip(@Nullable String str) {
        this.dest_ip = str;
    }

    public final void setRecv_ex_cause_message(@Nullable String str) {
        this.recv_ex_cause_message = str;
    }

    public final void setRecv_ex_cause_name(@Nullable String str) {
        this.recv_ex_cause_name = str;
    }

    public final void setRecv_ex_message(@Nullable String str) {
        this.recv_ex_message = str;
    }

    public final void setRecv_ex_name(@Nullable String str) {
        this.recv_ex_name = str;
    }

    public final void setRecv_ex_stage(@Nullable String str) {
        this.recv_ex_stage = str;
    }

    public final void setRecv_ex_time(long j2) {
        this.recv_ex_time = j2;
    }

    public final void setRecv_success(boolean z) {
        this.recv_success = z;
    }

    public final void setRecv_time(long j2) {
        this.recv_time = j2;
    }

    @NotNull
    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("recv_success", String.valueOf(this.recv_success));
        jSONObject.accumulate(TrackHelperKt.RECV_TIME, String.valueOf(this.recv_time));
        if (!this.recv_success) {
            jSONObject.accumulate("recv_ex_name", this.recv_ex_name);
            jSONObject.accumulate("recv_ex_message", this.recv_ex_message);
            jSONObject.accumulate("recv_ex_cause_name", this.recv_ex_cause_name);
            jSONObject.accumulate("recv_ex_cause_message", this.recv_ex_cause_message);
            jSONObject.accumulate("recv_ex_stage", this.recv_ex_stage);
            jSONObject.accumulate("recv_ex_time", Long.valueOf(this.recv_ex_time));
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ob.toString()");
        return string;
    }

    public RecvInfo(@Nullable String str, long j2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j3, boolean z) {
        this.dest_ip = str;
        this.recv_ex_time = j2;
        this.recv_ex_name = str2;
        this.recv_ex_message = str3;
        this.recv_ex_cause_name = str4;
        this.recv_ex_cause_message = str5;
        this.recv_ex_stage = str6;
        this.recv_time = j3;
        this.recv_success = z;
    }

    public /* synthetic */ RecvInfo(String str, long j2, String str2, String str3, String str4, String str5, String str6, long j3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) == 0 ? j3 : 0L, (i & 256) != 0 ? false : z);
    }
}
