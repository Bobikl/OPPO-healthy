package io.netty.incubator.codec.quic.track.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bh\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0002\u0010\u001fJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\rHÆ\u0003J\t\u0010\\\u001a\u00020\rHÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0005HÆ\u0003J\t\u0010q\u001a\u00020\rHÆ\u0003J\u0099\u0002\u0010r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010s\u001a\u00020\r2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020vHÖ\u0001J\b\u0010w\u001a\u00020\u0003H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010-\"\u0004\b9\u0010/R\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010-\"\u0004\b=\u0010/R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00101\"\u0004\b@\u00103R\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u00101\"\u0004\bA\u00103R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010-\"\u0004\bE\u0010/R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010-\"\u0004\bG\u0010/R\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010-\"\u0004\bI\u0010/R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\u001a\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010-\"\u0004\bO\u0010/R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010/R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010-\"\u0004\bS\u0010/R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010-\"\u0004\bU\u0010/R\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/¨\u0006x"}, d2 = {"Lio/netty/incubator/codec/quic/track/bean/ConnInfo;", "", "dest_ip", "", "conn_ex_time", "", "conn_ex_name", "conn_ex_message", "conn_ex_cause_name", "conn_ex_cause_message", "conn_ex_stage", "conn_time", "conn_success", "", "protocol", "connect_id", "is_0rtt", "is_0rtt_success", "recv", "send", "lost", "rtt", "min_rtt", "max_rtt", "s_rtt", "cwnd", "retrans_ratio", "stream_cnt", "deliver_rate", "dealed_stream_cnt", "pmtu", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;JZZJJJJJJJJJJJJJ)V", "getConn_ex_cause_message", "()Ljava/lang/String;", "setConn_ex_cause_message", "(Ljava/lang/String;)V", "getConn_ex_cause_name", "setConn_ex_cause_name", "getConn_ex_message", "setConn_ex_message", "getConn_ex_name", "setConn_ex_name", "getConn_ex_stage", "setConn_ex_stage", "getConn_ex_time", "()J", "setConn_ex_time", "(J)V", "getConn_success", "()Z", "setConn_success", "(Z)V", "getConn_time", "setConn_time", "getConnect_id", "setConnect_id", "getCwnd", "setCwnd", "getDealed_stream_cnt", "setDealed_stream_cnt", "getDeliver_rate", "setDeliver_rate", "getDest_ip", "setDest_ip", "set_0rtt", "set_0rtt_success", "getLost", "setLost", "getMax_rtt", "setMax_rtt", "getMin_rtt", "setMin_rtt", "getPmtu", "setPmtu", "getProtocol", "setProtocol", "getRecv", "setRecv", "getRetrans_ratio", "setRetrans_ratio", "getRtt", "setRtt", "getS_rtt", "setS_rtt", "getSend", "setSend", "getStream_cnt", "setStream_cnt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ConnInfo {

    @Nullable
    private String conn_ex_cause_message;

    @Nullable
    private String conn_ex_cause_name;

    @Nullable
    private String conn_ex_message;

    @Nullable
    private String conn_ex_name;

    @Nullable
    private String conn_ex_stage;
    private long conn_ex_time;
    private boolean conn_success;
    private long conn_time;
    private long connect_id;
    private long cwnd;
    private long dealed_stream_cnt;
    private long deliver_rate;

    @Nullable
    private String dest_ip;
    private boolean is_0rtt;
    private boolean is_0rtt_success;
    private long lost;
    private long max_rtt;
    private long min_rtt;
    private long pmtu;

    @NotNull
    private String protocol;
    private long recv;
    private long retrans_ratio;
    private long rtt;
    private long s_rtt;
    private long send;
    private long stream_cnt;

    public ConnInfo() {
        this(null, 0L, null, null, null, null, null, 0L, false, null, 0L, false, false, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 67108863, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDest_ip() {
        return this.dest_ip;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getConnect_id() {
        return this.connect_id;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIs_0rtt() {
        return this.is_0rtt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIs_0rtt_success() {
        return this.is_0rtt_success;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getRecv() {
        return this.recv;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getSend() {
        return this.send;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getLost() {
        return this.lost;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getRtt() {
        return this.rtt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getMin_rtt() {
        return this.min_rtt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getMax_rtt() {
        return this.max_rtt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getConn_ex_time() {
        return this.conn_ex_time;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getS_rtt() {
        return this.s_rtt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getCwnd() {
        return this.cwnd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getRetrans_ratio() {
        return this.retrans_ratio;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getStream_cnt() {
        return this.stream_cnt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getDeliver_rate() {
        return this.deliver_rate;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getDealed_stream_cnt() {
        return this.dealed_stream_cnt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final long getPmtu() {
        return this.pmtu;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConn_ex_name() {
        return this.conn_ex_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConn_ex_message() {
        return this.conn_ex_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConn_ex_cause_name() {
        return this.conn_ex_cause_name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getConn_ex_cause_message() {
        return this.conn_ex_cause_message;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConn_ex_stage() {
        return this.conn_ex_stage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getConn_time() {
        return this.conn_time;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getConn_success() {
        return this.conn_success;
    }

    @NotNull
    public final ConnInfo copy(@Nullable String dest_ip, long conn_ex_time, @Nullable String conn_ex_name, @Nullable String conn_ex_message, @Nullable String conn_ex_cause_name, @Nullable String conn_ex_cause_message, @Nullable String conn_ex_stage, long conn_time, boolean conn_success, @NotNull String protocol, long connect_id, boolean is_0rtt, boolean is_0rtt_success, long recv, long send, long lost, long rtt, long min_rtt, long max_rtt, long s_rtt, long cwnd, long retrans_ratio, long stream_cnt, long deliver_rate, long dealed_stream_cnt, long pmtu) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new ConnInfo(dest_ip, conn_ex_time, conn_ex_name, conn_ex_message, conn_ex_cause_name, conn_ex_cause_message, conn_ex_stage, conn_time, conn_success, protocol, connect_id, is_0rtt, is_0rtt_success, recv, send, lost, rtt, min_rtt, max_rtt, s_rtt, cwnd, retrans_ratio, stream_cnt, deliver_rate, dealed_stream_cnt, pmtu);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnInfo)) {
            return false;
        }
        ConnInfo connInfo = (ConnInfo) other;
        return Intrinsics.areEqual(this.dest_ip, connInfo.dest_ip) && this.conn_ex_time == connInfo.conn_ex_time && Intrinsics.areEqual(this.conn_ex_name, connInfo.conn_ex_name) && Intrinsics.areEqual(this.conn_ex_message, connInfo.conn_ex_message) && Intrinsics.areEqual(this.conn_ex_cause_name, connInfo.conn_ex_cause_name) && Intrinsics.areEqual(this.conn_ex_cause_message, connInfo.conn_ex_cause_message) && Intrinsics.areEqual(this.conn_ex_stage, connInfo.conn_ex_stage) && this.conn_time == connInfo.conn_time && this.conn_success == connInfo.conn_success && Intrinsics.areEqual(this.protocol, connInfo.protocol) && this.connect_id == connInfo.connect_id && this.is_0rtt == connInfo.is_0rtt && this.is_0rtt_success == connInfo.is_0rtt_success && this.recv == connInfo.recv && this.send == connInfo.send && this.lost == connInfo.lost && this.rtt == connInfo.rtt && this.min_rtt == connInfo.min_rtt && this.max_rtt == connInfo.max_rtt && this.s_rtt == connInfo.s_rtt && this.cwnd == connInfo.cwnd && this.retrans_ratio == connInfo.retrans_ratio && this.stream_cnt == connInfo.stream_cnt && this.deliver_rate == connInfo.deliver_rate && this.dealed_stream_cnt == connInfo.dealed_stream_cnt && this.pmtu == connInfo.pmtu;
    }

    @Nullable
    public final String getConn_ex_cause_message() {
        return this.conn_ex_cause_message;
    }

    @Nullable
    public final String getConn_ex_cause_name() {
        return this.conn_ex_cause_name;
    }

    @Nullable
    public final String getConn_ex_message() {
        return this.conn_ex_message;
    }

    @Nullable
    public final String getConn_ex_name() {
        return this.conn_ex_name;
    }

    @Nullable
    public final String getConn_ex_stage() {
        return this.conn_ex_stage;
    }

    public final long getConn_ex_time() {
        return this.conn_ex_time;
    }

    public final boolean getConn_success() {
        return this.conn_success;
    }

    public final long getConn_time() {
        return this.conn_time;
    }

    public final long getConnect_id() {
        return this.connect_id;
    }

    public final long getCwnd() {
        return this.cwnd;
    }

    public final long getDealed_stream_cnt() {
        return this.dealed_stream_cnt;
    }

    public final long getDeliver_rate() {
        return this.deliver_rate;
    }

    @Nullable
    public final String getDest_ip() {
        return this.dest_ip;
    }

    public final long getLost() {
        return this.lost;
    }

    public final long getMax_rtt() {
        return this.max_rtt;
    }

    public final long getMin_rtt() {
        return this.min_rtt;
    }

    public final long getPmtu() {
        return this.pmtu;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final long getRecv() {
        return this.recv;
    }

    public final long getRetrans_ratio() {
        return this.retrans_ratio;
    }

    public final long getRtt() {
        return this.rtt;
    }

    public final long getS_rtt() {
        return this.s_rtt;
    }

    public final long getSend() {
        return this.send;
    }

    public final long getStream_cnt() {
        return this.stream_cnt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    public int hashCode() {
        String str = this.dest_ip;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.conn_ex_time)) * 31;
        String str2 = this.conn_ex_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.conn_ex_message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conn_ex_cause_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.conn_ex_cause_message;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.conn_ex_stage;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Long.hashCode(this.conn_time)) * 31;
        boolean z = this.conn_success;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode7 = (((((iHashCode6 + r1) * 31) + this.protocol.hashCode()) * 31) + Long.hashCode(this.connect_id)) * 31;
        boolean z2 = this.is_0rtt;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode7 + r2) * 31;
        boolean z3 = this.is_0rtt_success;
        return ((((((((((((((((((((((((((i + (z3 ? 1 : z3)) * 31) + Long.hashCode(this.recv)) * 31) + Long.hashCode(this.send)) * 31) + Long.hashCode(this.lost)) * 31) + Long.hashCode(this.rtt)) * 31) + Long.hashCode(this.min_rtt)) * 31) + Long.hashCode(this.max_rtt)) * 31) + Long.hashCode(this.s_rtt)) * 31) + Long.hashCode(this.cwnd)) * 31) + Long.hashCode(this.retrans_ratio)) * 31) + Long.hashCode(this.stream_cnt)) * 31) + Long.hashCode(this.deliver_rate)) * 31) + Long.hashCode(this.dealed_stream_cnt)) * 31) + Long.hashCode(this.pmtu);
    }

    public final boolean is_0rtt() {
        return this.is_0rtt;
    }

    public final boolean is_0rtt_success() {
        return this.is_0rtt_success;
    }

    public final void setConn_ex_cause_message(@Nullable String str) {
        this.conn_ex_cause_message = str;
    }

    public final void setConn_ex_cause_name(@Nullable String str) {
        this.conn_ex_cause_name = str;
    }

    public final void setConn_ex_message(@Nullable String str) {
        this.conn_ex_message = str;
    }

    public final void setConn_ex_name(@Nullable String str) {
        this.conn_ex_name = str;
    }

    public final void setConn_ex_stage(@Nullable String str) {
        this.conn_ex_stage = str;
    }

    public final void setConn_ex_time(long j2) {
        this.conn_ex_time = j2;
    }

    public final void setConn_success(boolean z) {
        this.conn_success = z;
    }

    public final void setConn_time(long j2) {
        this.conn_time = j2;
    }

    public final void setConnect_id(long j2) {
        this.connect_id = j2;
    }

    public final void setCwnd(long j2) {
        this.cwnd = j2;
    }

    public final void setDealed_stream_cnt(long j2) {
        this.dealed_stream_cnt = j2;
    }

    public final void setDeliver_rate(long j2) {
        this.deliver_rate = j2;
    }

    public final void setDest_ip(@Nullable String str) {
        this.dest_ip = str;
    }

    public final void setLost(long j2) {
        this.lost = j2;
    }

    public final void setMax_rtt(long j2) {
        this.max_rtt = j2;
    }

    public final void setMin_rtt(long j2) {
        this.min_rtt = j2;
    }

    public final void setPmtu(long j2) {
        this.pmtu = j2;
    }

    public final void setProtocol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.protocol = str;
    }

    public final void setRecv(long j2) {
        this.recv = j2;
    }

    public final void setRetrans_ratio(long j2) {
        this.retrans_ratio = j2;
    }

    public final void setRtt(long j2) {
        this.rtt = j2;
    }

    public final void setS_rtt(long j2) {
        this.s_rtt = j2;
    }

    public final void setSend(long j2) {
        this.send = j2;
    }

    public final void setStream_cnt(long j2) {
        this.stream_cnt = j2;
    }

    public final void set_0rtt(boolean z) {
        this.is_0rtt = z;
    }

    public final void set_0rtt_success(boolean z) {
        this.is_0rtt_success = z;
    }

    @NotNull
    public String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("dest_ip", this.dest_ip);
        if (!this.conn_success) {
            jSONObject.accumulate("conn_ex_name", this.conn_ex_name);
            jSONObject.accumulate("conn_ex_message", this.conn_ex_message);
            jSONObject.accumulate("conn_ex_cause_name", this.conn_ex_cause_name);
            jSONObject.accumulate("conn_ex_cause_message", this.conn_ex_cause_message);
            jSONObject.accumulate("conn_ex_stage", this.conn_ex_stage);
            jSONObject.accumulate("conn_ex_time", Long.valueOf(this.conn_ex_time));
        }
        jSONObject.accumulate("protocol", this.protocol);
        jSONObject.accumulate("conn_success", String.valueOf(this.conn_success));
        jSONObject.accumulate("conn_time", String.valueOf(this.conn_time));
        jSONObject.accumulate("connect_id", String.valueOf(this.connect_id));
        jSONObject.accumulate("is_0rtt", String.valueOf(this.is_0rtt));
        jSONObject.accumulate("is_0rtt_success", String.valueOf(this.is_0rtt_success));
        jSONObject.accumulate("recv", String.valueOf(this.recv));
        jSONObject.accumulate("send", String.valueOf(this.send));
        jSONObject.accumulate("lost", String.valueOf(this.lost));
        jSONObject.accumulate("rtt", String.valueOf(this.rtt));
        jSONObject.accumulate("cwnd", String.valueOf(this.cwnd));
        jSONObject.accumulate("deliver_rate", String.valueOf(this.deliver_rate));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "ob.toString()");
        return string;
    }

    public ConnInfo(@Nullable String str, long j2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j3, boolean z, @NotNull String protocol, long j4, boolean z2, boolean z3, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.dest_ip = str;
        this.conn_ex_time = j2;
        this.conn_ex_name = str2;
        this.conn_ex_message = str3;
        this.conn_ex_cause_name = str4;
        this.conn_ex_cause_message = str5;
        this.conn_ex_stage = str6;
        this.conn_time = j3;
        this.conn_success = z;
        this.protocol = protocol;
        this.connect_id = j4;
        this.is_0rtt = z2;
        this.is_0rtt_success = z3;
        this.recv = j5;
        this.send = j6;
        this.lost = j7;
        this.rtt = j8;
        this.min_rtt = j9;
        this.max_rtt = j10;
        this.s_rtt = j11;
        this.cwnd = j12;
        this.retrans_ratio = j13;
        this.stream_cnt = j14;
        this.deliver_rate = j15;
        this.dealed_stream_cnt = j16;
        this.pmtu = j17;
    }

    public /* synthetic */ ConnInfo(String str, long j2, String str2, String str3, String str4, String str5, String str6, long j3, boolean z, String str7, long j4, boolean z2, boolean z3, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? 0L : j3, (i & 256) != 0 ? false : z, (i & 512) == 0 ? str7 : "", (i & 1024) != 0 ? 0L : j4, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? 0L : j5, (i & 16384) != 0 ? 0L : j6, (32768 & i) != 0 ? 0L : j7, (65536 & i) != 0 ? 0L : j8, (131072 & i) != 0 ? 0L : j9, (262144 & i) != 0 ? 0L : j10, (524288 & i) != 0 ? 0L : j11, (1048576 & i) != 0 ? 0L : j12, (2097152 & i) != 0 ? 0L : j13, (4194304 & i) != 0 ? 0L : j14, (8388608 & i) != 0 ? 0L : j15, (16777216 & i) != 0 ? 0L : j16, (i & 33554432) != 0 ? 0L : j17);
    }
}
