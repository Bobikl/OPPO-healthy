package com.heytap.okhttp.extension.hubble;

import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@s15(addedVersion = 1, tableName = HubbleEntity.TABLE_NAME)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\bS\b\u0087\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009f\u0001BÝ\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u000b\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\b\b\u0002\u00100\u001a\u00020\u000b\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u000b\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\b\b\u0002\u00107\u001a\u00020\u000b\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u00109\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\u0002\u0012\b\b\u0002\u0010;\u001a\u00020\u000b\u0012\b\b\u0002\u0010<\u001a\u00020\u000b\u0012\b\b\u0002\u0010=\u001a\u00020\u000b\u0012\b\b\u0002\u0010>\u001a\u00020\u000b\u0012\b\b\u0002\u0010?\u001a\u00020\u000b\u0012\b\b\u0002\u0010@\u001a\u00020\u000b\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u000b\u0012\b\b\u0002\u0010C\u001a\u00020\u000b\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u000b\u0012\b\b\u0002\u0010F\u001a\u00020\u000b\u0012\b\b\u0002\u0010G\u001a\u00020\u000b\u0012\b\b\u0002\u0010H\u001a\u00020\u000b¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0002HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0002HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003JÝ\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u00020\u00022\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u000b2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u000b2\b\b\u0002\u0010A\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020\u000b2\b\b\u0002\u0010D\u001a\u00020\u00022\b\b\u0002\u0010E\u001a\u00020\u000b2\b\b\u0002\u0010F\u001a\u00020\u000b2\b\b\u0002\u0010G\u001a\u00020\u000b2\b\b\u0002\u0010H\u001a\u00020\u000bHÆ\u0001J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\t\u0010K\u001a\u00020\u000bHÖ\u0001J\u0013\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010T\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010XR\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010T\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010T\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010T\u001a\u0004\ba\u0010V\"\u0004\bb\u0010XR\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010c\u001a\u0004\bh\u0010e\"\u0004\bi\u0010gR\"\u00100\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010O\u001a\u0004\bl\u0010Q\"\u0004\bm\u0010SR\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010O\u001a\u0004\bn\u0010Q\"\u0004\bo\u0010SR\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010O\u001a\u0004\bp\u0010Q\"\u0004\bq\u0010SR\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010gR\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010c\u001a\u0004\bt\u0010e\"\u0004\bu\u0010gR\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010c\u001a\u0004\bv\u0010e\"\u0004\bw\u0010gR\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010c\u001a\u0004\bx\u0010e\"\u0004\by\u0010gR\"\u00108\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010O\u001a\u0004\bz\u0010Q\"\u0004\b{\u0010SR\"\u00109\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010O\u001a\u0004\b|\u0010Q\"\u0004\b}\u0010SR\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010O\u001a\u0004\b~\u0010Q\"\u0004\b\u007f\u0010SR$\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b;\u0010c\u001a\u0005\b\u0080\u0001\u0010e\"\u0005\b\u0081\u0001\u0010gR$\u0010<\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b<\u0010c\u001a\u0005\b\u0082\u0001\u0010e\"\u0005\b\u0083\u0001\u0010gR$\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b=\u0010c\u001a\u0005\b\u0084\u0001\u0010e\"\u0005\b\u0085\u0001\u0010gR$\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b>\u0010c\u001a\u0005\b\u0086\u0001\u0010e\"\u0005\b\u0087\u0001\u0010gR$\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b?\u0010c\u001a\u0005\b\u0088\u0001\u0010e\"\u0005\b\u0089\u0001\u0010gR$\u0010@\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\b@\u0010c\u001a\u0005\b\u008a\u0001\u0010e\"\u0005\b\u008b\u0001\u0010gR$\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bA\u0010O\u001a\u0005\b\u008c\u0001\u0010Q\"\u0005\b\u008d\u0001\u0010SR$\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bB\u0010c\u001a\u0005\b\u008e\u0001\u0010e\"\u0005\b\u008f\u0001\u0010gR$\u0010C\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bC\u0010c\u001a\u0005\b\u0090\u0001\u0010e\"\u0005\b\u0091\u0001\u0010gR$\u0010D\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bD\u0010O\u001a\u0005\b\u0092\u0001\u0010Q\"\u0005\b\u0093\u0001\u0010SR$\u0010E\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bE\u0010c\u001a\u0005\b\u0094\u0001\u0010e\"\u0005\b\u0095\u0001\u0010gR$\u0010F\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bF\u0010c\u001a\u0005\b\u0096\u0001\u0010e\"\u0005\b\u0097\u0001\u0010gR$\u0010G\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bG\u0010c\u001a\u0005\b\u0098\u0001\u0010e\"\u0005\b\u0099\u0001\u0010gR$\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0004\bH\u0010c\u001a\u0005\b\u009a\u0001\u0010e\"\u0005\b\u009b\u0001\u0010g¨\u0006 \u0001"}, d2 = {"Lcom/heytap/okhttp/extension/hubble/HubbleEntity;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "_id", "key", "network_type", HubbleEntity.COLUMN_ISP, "method", "dest_ip", "host", HubbleEntity.COLUMN_DNS_CNT, HubbleEntity.COLUMN_DNS_FAIL_CNT, HubbleEntity.COLUMN_DNS_SUC_CNT, HubbleEntity.COLUMN_DNS_TM, HubbleEntity.COLUMN_DNS_MAX_TM, HubbleEntity.COLUMN_DNS_MIN_TM, HubbleEntity.COLUMN_CONNECT_CNT, HubbleEntity.COLUMN_CONNECT_FAIL_CNT, HubbleEntity.COLUMN_CONNECT_SUC_CNT, HubbleEntity.COLUMN_CONNECT_SESSION_CNT, HubbleEntity.COLUMN_CONNECT_TM, HubbleEntity.COLUMN_CONNECT_MAX_TM, HubbleEntity.COLUMN_CONNECT_MIN_TM, HubbleEntity.COLUMN_CONNECT_300MS_CNT, HubbleEntity.COLUMN_CONNECT_500MS_CNT, HubbleEntity.COLUMN_CONNECT_1S_CNT, HubbleEntity.COLUMN_CONNECT_3S_CNT, HubbleEntity.COLUMN_HEADER_CNT, HubbleEntity.COLUMN_HEADER_SUC_CNT, HubbleEntity.COLUMN_HEADER_TM, HubbleEntity.COLUMN_CALL_CNT, HubbleEntity.COLUMN_CALL_SUC_CNT, HubbleEntity.COLUMN_CALL_TM, HubbleEntity.COLUMN_CALL_300MS_CNT, HubbleEntity.COLUMN_CALL_500MS_CNT, HubbleEntity.COLUMN_CALL_1S_CNT, HubbleEntity.COLUMN_CALL_3S_CNT, "copy", "toString", "hashCode", "other", "", "equals", "J", "get_id", "()J", "set_id", "(J)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getNetwork_type", "setNetwork_type", "getIsp", "setIsp", "getMethod", "setMethod", "getDest_ip", "setDest_ip", "getHost", "setHost", "I", "getDns_cnt", "()I", "setDns_cnt", "(I)V", "getDns_fail_cnt", "setDns_fail_cnt", "getDns_suc_cnt", "setDns_suc_cnt", "getDns_tm", "setDns_tm", "getDns_max_tm", "setDns_max_tm", "getDns_min_tm", "setDns_min_tm", "getConnect_cnt", "setConnect_cnt", "getConnect_fail_cnt", "setConnect_fail_cnt", "getConnect_suc_cnt", "setConnect_suc_cnt", "getConnect_session_cnt", "setConnect_session_cnt", "getConnect_tm", "setConnect_tm", "getConnect_max_tm", "setConnect_max_tm", "getConnect_min_tm", "setConnect_min_tm", "getConnect_300ms_cnt", "setConnect_300ms_cnt", "getConnect_500ms_cnt", "setConnect_500ms_cnt", "getConnect_1s_cnt", "setConnect_1s_cnt", "getConnect_3s_cnt", "setConnect_3s_cnt", "getHeader_cnt", "setHeader_cnt", "getHeader_suc_cnt", "setHeader_suc_cnt", "getHeader_tm", "setHeader_tm", "getCall_cnt", "setCall_cnt", "getCall_suc_cnt", "setCall_suc_cnt", "getCall_tm", "setCall_tm", "getCall_300ms_cnt", "setCall_300ms_cnt", "getCall_500ms_cnt", "setCall_500ms_cnt", "getCall_1s_cnt", "setCall_1s_cnt", "getCall_3s_cnt", "setCall_3s_cnt", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJJJIIIIJJJIIIIIIJIIJIIII)V", "Companion", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HubbleEntity {

    @NotNull
    public static final String COLUMN_CALL_1S_CNT = "call_1s_cnt";

    @NotNull
    public static final String COLUMN_CALL_300MS_CNT = "call_300ms_cnt";

    @NotNull
    public static final String COLUMN_CALL_3S_CNT = "call_3s_cnt";

    @NotNull
    public static final String COLUMN_CALL_500MS_CNT = "call_500ms_cnt";

    @NotNull
    public static final String COLUMN_CALL_CNT = "call_cnt";

    @NotNull
    public static final String COLUMN_CALL_SUC_CNT = "call_suc_cnt";

    @NotNull
    public static final String COLUMN_CALL_TM = "call_tm";

    @NotNull
    public static final String COLUMN_CONNECT_1S_CNT = "connect_1s_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_300MS_CNT = "connect_300ms_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_3S_CNT = "connect_3s_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_500MS_CNT = "connect_500ms_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_CNT = "connect_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_FAIL_CNT = "connect_fail_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_MAX_TM = "connect_max_tm";

    @NotNull
    public static final String COLUMN_CONNECT_MIN_TM = "connect_min_tm";

    @NotNull
    public static final String COLUMN_CONNECT_SESSION_CNT = "connect_session_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_SUC_CNT = "connect_suc_cnt";

    @NotNull
    public static final String COLUMN_CONNECT_TM = "connect_tm";

    @NotNull
    public static final String COLUMN_DEST_IP = "dest_ip";

    @NotNull
    public static final String COLUMN_DNS_CNT = "dns_cnt";

    @NotNull
    public static final String COLUMN_DNS_FAIL_CNT = "dns_fail_cnt";

    @NotNull
    public static final String COLUMN_DNS_MAX_TM = "dns_max_tm";

    @NotNull
    public static final String COLUMN_DNS_MIN_TM = "dns_min_tm";

    @NotNull
    public static final String COLUMN_DNS_SUC_CNT = "dns_suc_cnt";

    @NotNull
    public static final String COLUMN_DNS_TM = "dns_tm";

    @NotNull
    public static final String COLUMN_HEADER_CNT = "header_cnt";

    @NotNull
    public static final String COLUMN_HEADER_SUC_CNT = "header_suc_cnt";

    @NotNull
    public static final String COLUMN_HEADER_TM = "header_tm";

    @NotNull
    public static final String COLUMN_HOST = "host";

    @NotNull
    public static final String COLUMN_ISP = "isp";

    @NotNull
    public static final String COLUMN_KEY = "key";

    @NotNull
    public static final String COLUMN_METHOD = "method";

    @NotNull
    public static final String COLUMN_NETWORK_TYPE = "network_type";

    @NotNull
    public static final String TABLE_NAME = "hubble_data_list";
    private long _id;

    @t15(dbColumnName = COLUMN_CALL_1S_CNT)
    private int call_1s_cnt;

    @t15(dbColumnName = COLUMN_CALL_300MS_CNT)
    private int call_300ms_cnt;

    @t15(dbColumnName = COLUMN_CALL_3S_CNT)
    private int call_3s_cnt;

    @t15(dbColumnName = COLUMN_CALL_500MS_CNT)
    private int call_500ms_cnt;

    @t15(dbColumnName = COLUMN_CALL_CNT)
    private int call_cnt;

    @t15(dbColumnName = COLUMN_CALL_SUC_CNT)
    private int call_suc_cnt;

    @t15(dbColumnName = COLUMN_CALL_TM)
    private long call_tm;

    @t15(dbColumnName = COLUMN_CONNECT_1S_CNT)
    private int connect_1s_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_300MS_CNT)
    private int connect_300ms_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_3S_CNT)
    private int connect_3s_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_500MS_CNT)
    private int connect_500ms_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_CNT)
    private int connect_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_FAIL_CNT)
    private int connect_fail_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_MAX_TM)
    private long connect_max_tm;

    @t15(dbColumnName = COLUMN_CONNECT_MIN_TM)
    private long connect_min_tm;

    @t15(dbColumnName = COLUMN_CONNECT_SESSION_CNT)
    private int connect_session_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_SUC_CNT)
    private int connect_suc_cnt;

    @t15(dbColumnName = COLUMN_CONNECT_TM)
    private long connect_tm;

    @t15(dbColumnName = "dest_ip")
    @NotNull
    private String dest_ip;

    @t15(dbColumnName = COLUMN_DNS_CNT)
    private int dns_cnt;

    @t15(dbColumnName = COLUMN_DNS_FAIL_CNT)
    private int dns_fail_cnt;

    @t15(dbColumnName = COLUMN_DNS_MAX_TM)
    private long dns_max_tm;

    @t15(dbColumnName = COLUMN_DNS_MIN_TM)
    private long dns_min_tm;

    @t15(dbColumnName = COLUMN_DNS_SUC_CNT)
    private int dns_suc_cnt;

    @t15(dbColumnName = COLUMN_DNS_TM)
    private long dns_tm;

    @t15(dbColumnName = COLUMN_HEADER_CNT)
    private int header_cnt;

    @t15(dbColumnName = COLUMN_HEADER_SUC_CNT)
    private int header_suc_cnt;

    @t15(dbColumnName = COLUMN_HEADER_TM)
    private long header_tm;

    @t15(dbColumnName = "host")
    @NotNull
    private String host;

    @t15(dbColumnName = COLUMN_ISP)
    @NotNull
    private String isp;

    @t15(dbColumnName = "key")
    @NotNull
    private String key;

    @t15(dbColumnName = "method")
    @NotNull
    private String method;

    @t15(dbColumnName = "network_type")
    @NotNull
    private String network_type;

    public HubbleEntity() {
        this(0L, null, null, null, null, null, null, 0, 0, 0, 0L, 0L, 0L, 0, 0, 0, 0, 0L, 0L, 0L, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0L, 0, 0, 0, 0, -1, 3, null);
    }

    public static /* synthetic */ HubbleEntity copy$default(HubbleEntity hubbleEntity, long j2, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, long j3, long j4, long j5, int i4, int i5, int i6, int i7, long j6, long j7, long j8, int i8, int i9, int i10, int i11, int i12, int i13, long j9, int i14, int i15, long j10, int i16, int i17, int i18, int i19, int i20, int i21, Object obj) {
        long j11 = (i20 & 1) != 0 ? hubbleEntity._id : j2;
        String str7 = (i20 & 2) != 0 ? hubbleEntity.key : str;
        String str8 = (i20 & 4) != 0 ? hubbleEntity.network_type : str2;
        String str9 = (i20 & 8) != 0 ? hubbleEntity.isp : str3;
        String str10 = (i20 & 16) != 0 ? hubbleEntity.method : str4;
        String str11 = (i20 & 32) != 0 ? hubbleEntity.dest_ip : str5;
        String str12 = (i20 & 64) != 0 ? hubbleEntity.host : str6;
        int i22 = (i20 & 128) != 0 ? hubbleEntity.dns_cnt : i;
        int i23 = (i20 & 256) != 0 ? hubbleEntity.dns_fail_cnt : i2;
        int i24 = (i20 & 512) != 0 ? hubbleEntity.dns_suc_cnt : i3;
        long j12 = (i20 & 1024) != 0 ? hubbleEntity.dns_tm : j3;
        long j13 = (i20 & 2048) != 0 ? hubbleEntity.dns_max_tm : j4;
        long j14 = (i20 & 4096) != 0 ? hubbleEntity.dns_min_tm : j5;
        int i25 = (i20 & 8192) != 0 ? hubbleEntity.connect_cnt : i4;
        int i26 = (i20 & 16384) != 0 ? hubbleEntity.connect_fail_cnt : i5;
        int i27 = (i20 & 32768) != 0 ? hubbleEntity.connect_suc_cnt : i6;
        int i28 = (i20 & 65536) != 0 ? hubbleEntity.connect_session_cnt : i7;
        long j15 = j14;
        long j16 = (i20 & 131072) != 0 ? hubbleEntity.connect_tm : j6;
        long j17 = (i20 & 262144) != 0 ? hubbleEntity.connect_max_tm : j7;
        long j18 = (i20 & 524288) != 0 ? hubbleEntity.connect_min_tm : j8;
        int i29 = (i20 & 1048576) != 0 ? hubbleEntity.connect_300ms_cnt : i8;
        return hubbleEntity.copy(j11, str7, str8, str9, str10, str11, str12, i22, i23, i24, j12, j13, j15, i25, i26, i27, i28, j16, j17, j18, i29, (2097152 & i20) != 0 ? hubbleEntity.connect_500ms_cnt : i9, (i20 & 4194304) != 0 ? hubbleEntity.connect_1s_cnt : i10, (i20 & 8388608) != 0 ? hubbleEntity.connect_3s_cnt : i11, (i20 & 16777216) != 0 ? hubbleEntity.header_cnt : i12, (i20 & 33554432) != 0 ? hubbleEntity.header_suc_cnt : i13, (i20 & 67108864) != 0 ? hubbleEntity.header_tm : j9, (i20 & 134217728) != 0 ? hubbleEntity.call_cnt : i14, (268435456 & i20) != 0 ? hubbleEntity.call_suc_cnt : i15, (i20 & 536870912) != 0 ? hubbleEntity.call_tm : j10, (i20 & 1073741824) != 0 ? hubbleEntity.call_300ms_cnt : i16, (i20 & Integer.MIN_VALUE) != 0 ? hubbleEntity.call_500ms_cnt : i17, (i21 & 1) != 0 ? hubbleEntity.call_1s_cnt : i18, (i21 & 2) != 0 ? hubbleEntity.call_3s_cnt : i19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDns_suc_cnt() {
        return this.dns_suc_cnt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDns_tm() {
        return this.dns_tm;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getDns_max_tm() {
        return this.dns_max_tm;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getDns_min_tm() {
        return this.dns_min_tm;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getConnect_cnt() {
        return this.connect_cnt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getConnect_fail_cnt() {
        return this.connect_fail_cnt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getConnect_suc_cnt() {
        return this.connect_suc_cnt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getConnect_session_cnt() {
        return this.connect_session_cnt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getConnect_tm() {
        return this.connect_tm;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getConnect_max_tm() {
        return this.connect_max_tm;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getConnect_min_tm() {
        return this.connect_min_tm;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getConnect_300ms_cnt() {
        return this.connect_300ms_cnt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getConnect_500ms_cnt() {
        return this.connect_500ms_cnt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getConnect_1s_cnt() {
        return this.connect_1s_cnt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getConnect_3s_cnt() {
        return this.connect_3s_cnt;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getHeader_cnt() {
        return this.header_cnt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getHeader_suc_cnt() {
        return this.header_suc_cnt;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final long getHeader_tm() {
        return this.header_tm;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getCall_cnt() {
        return this.call_cnt;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getCall_suc_cnt() {
        return this.call_suc_cnt;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNetwork_type() {
        return this.network_type;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final long getCall_tm() {
        return this.call_tm;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getCall_300ms_cnt() {
        return this.call_300ms_cnt;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getCall_500ms_cnt() {
        return this.call_500ms_cnt;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final int getCall_1s_cnt() {
        return this.call_1s_cnt;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final int getCall_3s_cnt() {
        return this.call_3s_cnt;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIsp() {
        return this.isp;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDest_ip() {
        return this.dest_ip;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDns_cnt() {
        return this.dns_cnt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDns_fail_cnt() {
        return this.dns_fail_cnt;
    }

    @NotNull
    public final HubbleEntity copy(long _id, @NotNull String key, @NotNull String network_type, @NotNull String isp, @NotNull String method, @NotNull String dest_ip, @NotNull String host, int dns_cnt, int dns_fail_cnt, int dns_suc_cnt, long dns_tm, long dns_max_tm, long dns_min_tm, int connect_cnt, int connect_fail_cnt, int connect_suc_cnt, int connect_session_cnt, long connect_tm, long connect_max_tm, long connect_min_tm, int connect_300ms_cnt, int connect_500ms_cnt, int connect_1s_cnt, int connect_3s_cnt, int header_cnt, int header_suc_cnt, long header_tm, int call_cnt, int call_suc_cnt, long call_tm, int call_300ms_cnt, int call_500ms_cnt, int call_1s_cnt, int call_3s_cnt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(network_type, "network_type");
        Intrinsics.checkNotNullParameter(isp, "isp");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(dest_ip, "dest_ip");
        Intrinsics.checkNotNullParameter(host, "host");
        return new HubbleEntity(_id, key, network_type, isp, method, dest_ip, host, dns_cnt, dns_fail_cnt, dns_suc_cnt, dns_tm, dns_max_tm, dns_min_tm, connect_cnt, connect_fail_cnt, connect_suc_cnt, connect_session_cnt, connect_tm, connect_max_tm, connect_min_tm, connect_300ms_cnt, connect_500ms_cnt, connect_1s_cnt, connect_3s_cnt, header_cnt, header_suc_cnt, header_tm, call_cnt, call_suc_cnt, call_tm, call_300ms_cnt, call_500ms_cnt, call_1s_cnt, call_3s_cnt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubbleEntity)) {
            return false;
        }
        HubbleEntity hubbleEntity = (HubbleEntity) other;
        return this._id == hubbleEntity._id && Intrinsics.areEqual(this.key, hubbleEntity.key) && Intrinsics.areEqual(this.network_type, hubbleEntity.network_type) && Intrinsics.areEqual(this.isp, hubbleEntity.isp) && Intrinsics.areEqual(this.method, hubbleEntity.method) && Intrinsics.areEqual(this.dest_ip, hubbleEntity.dest_ip) && Intrinsics.areEqual(this.host, hubbleEntity.host) && this.dns_cnt == hubbleEntity.dns_cnt && this.dns_fail_cnt == hubbleEntity.dns_fail_cnt && this.dns_suc_cnt == hubbleEntity.dns_suc_cnt && this.dns_tm == hubbleEntity.dns_tm && this.dns_max_tm == hubbleEntity.dns_max_tm && this.dns_min_tm == hubbleEntity.dns_min_tm && this.connect_cnt == hubbleEntity.connect_cnt && this.connect_fail_cnt == hubbleEntity.connect_fail_cnt && this.connect_suc_cnt == hubbleEntity.connect_suc_cnt && this.connect_session_cnt == hubbleEntity.connect_session_cnt && this.connect_tm == hubbleEntity.connect_tm && this.connect_max_tm == hubbleEntity.connect_max_tm && this.connect_min_tm == hubbleEntity.connect_min_tm && this.connect_300ms_cnt == hubbleEntity.connect_300ms_cnt && this.connect_500ms_cnt == hubbleEntity.connect_500ms_cnt && this.connect_1s_cnt == hubbleEntity.connect_1s_cnt && this.connect_3s_cnt == hubbleEntity.connect_3s_cnt && this.header_cnt == hubbleEntity.header_cnt && this.header_suc_cnt == hubbleEntity.header_suc_cnt && this.header_tm == hubbleEntity.header_tm && this.call_cnt == hubbleEntity.call_cnt && this.call_suc_cnt == hubbleEntity.call_suc_cnt && this.call_tm == hubbleEntity.call_tm && this.call_300ms_cnt == hubbleEntity.call_300ms_cnt && this.call_500ms_cnt == hubbleEntity.call_500ms_cnt && this.call_1s_cnt == hubbleEntity.call_1s_cnt && this.call_3s_cnt == hubbleEntity.call_3s_cnt;
    }

    public final int getCall_1s_cnt() {
        return this.call_1s_cnt;
    }

    public final int getCall_300ms_cnt() {
        return this.call_300ms_cnt;
    }

    public final int getCall_3s_cnt() {
        return this.call_3s_cnt;
    }

    public final int getCall_500ms_cnt() {
        return this.call_500ms_cnt;
    }

    public final int getCall_cnt() {
        return this.call_cnt;
    }

    public final int getCall_suc_cnt() {
        return this.call_suc_cnt;
    }

    public final long getCall_tm() {
        return this.call_tm;
    }

    public final int getConnect_1s_cnt() {
        return this.connect_1s_cnt;
    }

    public final int getConnect_300ms_cnt() {
        return this.connect_300ms_cnt;
    }

    public final int getConnect_3s_cnt() {
        return this.connect_3s_cnt;
    }

    public final int getConnect_500ms_cnt() {
        return this.connect_500ms_cnt;
    }

    public final int getConnect_cnt() {
        return this.connect_cnt;
    }

    public final int getConnect_fail_cnt() {
        return this.connect_fail_cnt;
    }

    public final long getConnect_max_tm() {
        return this.connect_max_tm;
    }

    public final long getConnect_min_tm() {
        return this.connect_min_tm;
    }

    public final int getConnect_session_cnt() {
        return this.connect_session_cnt;
    }

    public final int getConnect_suc_cnt() {
        return this.connect_suc_cnt;
    }

    public final long getConnect_tm() {
        return this.connect_tm;
    }

    @NotNull
    public final String getDest_ip() {
        return this.dest_ip;
    }

    public final int getDns_cnt() {
        return this.dns_cnt;
    }

    public final int getDns_fail_cnt() {
        return this.dns_fail_cnt;
    }

    public final long getDns_max_tm() {
        return this.dns_max_tm;
    }

    public final long getDns_min_tm() {
        return this.dns_min_tm;
    }

    public final int getDns_suc_cnt() {
        return this.dns_suc_cnt;
    }

    public final long getDns_tm() {
        return this.dns_tm;
    }

    public final int getHeader_cnt() {
        return this.header_cnt;
    }

    public final int getHeader_suc_cnt() {
        return this.header_suc_cnt;
    }

    public final long getHeader_tm() {
        return this.header_tm;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getIsp() {
        return this.isp;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final String getNetwork_type() {
        return this.network_type;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this._id) * 31;
        String str = this.key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.network_type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.isp;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.method;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.dest_ip;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.host;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.hashCode(this.dns_cnt)) * 31) + Integer.hashCode(this.dns_fail_cnt)) * 31) + Integer.hashCode(this.dns_suc_cnt)) * 31) + Long.hashCode(this.dns_tm)) * 31) + Long.hashCode(this.dns_max_tm)) * 31) + Long.hashCode(this.dns_min_tm)) * 31) + Integer.hashCode(this.connect_cnt)) * 31) + Integer.hashCode(this.connect_fail_cnt)) * 31) + Integer.hashCode(this.connect_suc_cnt)) * 31) + Integer.hashCode(this.connect_session_cnt)) * 31) + Long.hashCode(this.connect_tm)) * 31) + Long.hashCode(this.connect_max_tm)) * 31) + Long.hashCode(this.connect_min_tm)) * 31) + Integer.hashCode(this.connect_300ms_cnt)) * 31) + Integer.hashCode(this.connect_500ms_cnt)) * 31) + Integer.hashCode(this.connect_1s_cnt)) * 31) + Integer.hashCode(this.connect_3s_cnt)) * 31) + Integer.hashCode(this.header_cnt)) * 31) + Integer.hashCode(this.header_suc_cnt)) * 31) + Long.hashCode(this.header_tm)) * 31) + Integer.hashCode(this.call_cnt)) * 31) + Integer.hashCode(this.call_suc_cnt)) * 31) + Long.hashCode(this.call_tm)) * 31) + Integer.hashCode(this.call_300ms_cnt)) * 31) + Integer.hashCode(this.call_500ms_cnt)) * 31) + Integer.hashCode(this.call_1s_cnt)) * 31) + Integer.hashCode(this.call_3s_cnt);
    }

    public final void setCall_1s_cnt(int i) {
        this.call_1s_cnt = i;
    }

    public final void setCall_300ms_cnt(int i) {
        this.call_300ms_cnt = i;
    }

    public final void setCall_3s_cnt(int i) {
        this.call_3s_cnt = i;
    }

    public final void setCall_500ms_cnt(int i) {
        this.call_500ms_cnt = i;
    }

    public final void setCall_cnt(int i) {
        this.call_cnt = i;
    }

    public final void setCall_suc_cnt(int i) {
        this.call_suc_cnt = i;
    }

    public final void setCall_tm(long j2) {
        this.call_tm = j2;
    }

    public final void setConnect_1s_cnt(int i) {
        this.connect_1s_cnt = i;
    }

    public final void setConnect_300ms_cnt(int i) {
        this.connect_300ms_cnt = i;
    }

    public final void setConnect_3s_cnt(int i) {
        this.connect_3s_cnt = i;
    }

    public final void setConnect_500ms_cnt(int i) {
        this.connect_500ms_cnt = i;
    }

    public final void setConnect_cnt(int i) {
        this.connect_cnt = i;
    }

    public final void setConnect_fail_cnt(int i) {
        this.connect_fail_cnt = i;
    }

    public final void setConnect_max_tm(long j2) {
        this.connect_max_tm = j2;
    }

    public final void setConnect_min_tm(long j2) {
        this.connect_min_tm = j2;
    }

    public final void setConnect_session_cnt(int i) {
        this.connect_session_cnt = i;
    }

    public final void setConnect_suc_cnt(int i) {
        this.connect_suc_cnt = i;
    }

    public final void setConnect_tm(long j2) {
        this.connect_tm = j2;
    }

    public final void setDest_ip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dest_ip = str;
    }

    public final void setDns_cnt(int i) {
        this.dns_cnt = i;
    }

    public final void setDns_fail_cnt(int i) {
        this.dns_fail_cnt = i;
    }

    public final void setDns_max_tm(long j2) {
        this.dns_max_tm = j2;
    }

    public final void setDns_min_tm(long j2) {
        this.dns_min_tm = j2;
    }

    public final void setDns_suc_cnt(int i) {
        this.dns_suc_cnt = i;
    }

    public final void setDns_tm(long j2) {
        this.dns_tm = j2;
    }

    public final void setHeader_cnt(int i) {
        this.header_cnt = i;
    }

    public final void setHeader_suc_cnt(int i) {
        this.header_suc_cnt = i;
    }

    public final void setHeader_tm(long j2) {
        this.header_tm = j2;
    }

    public final void setHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.host = str;
    }

    public final void setIsp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isp = str;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.method = str;
    }

    public final void setNetwork_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.network_type = str;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "HubbleEntity(_id=" + this._id + ", key=" + this.key + ", network_type=" + this.network_type + ", isp=" + this.isp + ", method=" + this.method + ", dest_ip=" + this.dest_ip + ", host=" + this.host + ", dns_cnt=" + this.dns_cnt + ", dns_fail_cnt=" + this.dns_fail_cnt + ", dns_suc_cnt=" + this.dns_suc_cnt + ", dns_tm=" + this.dns_tm + ", dns_max_tm=" + this.dns_max_tm + ", dns_min_tm=" + this.dns_min_tm + ", connect_cnt=" + this.connect_cnt + ", connect_fail_cnt=" + this.connect_fail_cnt + ", connect_suc_cnt=" + this.connect_suc_cnt + ", connect_session_cnt=" + this.connect_session_cnt + ", connect_tm=" + this.connect_tm + ", connect_max_tm=" + this.connect_max_tm + ", connect_min_tm=" + this.connect_min_tm + ", connect_300ms_cnt=" + this.connect_300ms_cnt + ", connect_500ms_cnt=" + this.connect_500ms_cnt + ", connect_1s_cnt=" + this.connect_1s_cnt + ", connect_3s_cnt=" + this.connect_3s_cnt + ", header_cnt=" + this.header_cnt + ", header_suc_cnt=" + this.header_suc_cnt + ", header_tm=" + this.header_tm + ", call_cnt=" + this.call_cnt + ", call_suc_cnt=" + this.call_suc_cnt + ", call_tm=" + this.call_tm + ", call_300ms_cnt=" + this.call_300ms_cnt + ", call_500ms_cnt=" + this.call_500ms_cnt + ", call_1s_cnt=" + this.call_1s_cnt + ", call_3s_cnt=" + this.call_3s_cnt + ")";
    }

    public HubbleEntity(long j2, @NotNull String key, @NotNull String network_type, @NotNull String isp, @NotNull String method, @NotNull String dest_ip, @NotNull String host, int i, int i2, int i3, long j3, long j4, long j5, int i4, int i5, int i6, int i7, long j6, long j7, long j8, int i8, int i9, int i10, int i11, int i12, int i13, long j9, int i14, int i15, long j10, int i16, int i17, int i18, int i19) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(network_type, "network_type");
        Intrinsics.checkNotNullParameter(isp, "isp");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(dest_ip, "dest_ip");
        Intrinsics.checkNotNullParameter(host, "host");
        this._id = j2;
        this.key = key;
        this.network_type = network_type;
        this.isp = isp;
        this.method = method;
        this.dest_ip = dest_ip;
        this.host = host;
        this.dns_cnt = i;
        this.dns_fail_cnt = i2;
        this.dns_suc_cnt = i3;
        this.dns_tm = j3;
        this.dns_max_tm = j4;
        this.dns_min_tm = j5;
        this.connect_cnt = i4;
        this.connect_fail_cnt = i5;
        this.connect_suc_cnt = i6;
        this.connect_session_cnt = i7;
        this.connect_tm = j6;
        this.connect_max_tm = j7;
        this.connect_min_tm = j8;
        this.connect_300ms_cnt = i8;
        this.connect_500ms_cnt = i9;
        this.connect_1s_cnt = i10;
        this.connect_3s_cnt = i11;
        this.header_cnt = i12;
        this.header_suc_cnt = i13;
        this.header_tm = j9;
        this.call_cnt = i14;
        this.call_suc_cnt = i15;
        this.call_tm = j10;
        this.call_300ms_cnt = i16;
        this.call_500ms_cnt = i17;
        this.call_1s_cnt = i18;
        this.call_3s_cnt = i19;
    }

    public /* synthetic */ HubbleEntity(long j2, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, long j3, long j4, long j5, int i4, int i5, int i6, int i7, long j6, long j7, long j8, int i8, int i9, int i10, int i11, int i12, int i13, long j9, int i14, int i15, long j10, int i16, int i17, int i18, int i19, int i20, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i20 & 1) != 0 ? 0L : j2, (i20 & 2) != 0 ? "" : str, (i20 & 4) != 0 ? "" : str2, (i20 & 8) != 0 ? "" : str3, (i20 & 16) != 0 ? "" : str4, (i20 & 32) != 0 ? "" : str5, (i20 & 64) == 0 ? str6 : "", (i20 & 128) != 0 ? 0 : i, (i20 & 256) != 0 ? 0 : i2, (i20 & 512) != 0 ? 0 : i3, (i20 & 1024) != 0 ? 0L : j3, (i20 & 2048) != 0 ? 0L : j4, (i20 & 4096) != 0 ? 0L : j5, (i20 & 8192) != 0 ? 0 : i4, (i20 & 16384) != 0 ? 0 : i5, (i20 & 32768) != 0 ? 0 : i6, (i20 & 65536) != 0 ? 0 : i7, (i20 & 131072) != 0 ? 0L : j6, (i20 & 262144) != 0 ? 0L : j7, (i20 & 524288) != 0 ? 0L : j8, (i20 & 1048576) != 0 ? 0 : i8, (i20 & 2097152) != 0 ? 0 : i9, (i20 & 4194304) != 0 ? 0 : i10, (i20 & 8388608) != 0 ? 0 : i11, (i20 & 16777216) != 0 ? 0 : i12, (i20 & 33554432) != 0 ? 0 : i13, (i20 & 67108864) != 0 ? 0L : j9, (i20 & 134217728) != 0 ? 0 : i14, (i20 & 268435456) != 0 ? 0 : i15, (i20 & 536870912) != 0 ? 0L : j10, (i20 & 1073741824) != 0 ? 0 : i16, (i20 & Integer.MIN_VALUE) != 0 ? 0 : i17, (i21 & 1) != 0 ? 0 : i18, (i21 & 2) != 0 ? 0 : i19);
    }
}
