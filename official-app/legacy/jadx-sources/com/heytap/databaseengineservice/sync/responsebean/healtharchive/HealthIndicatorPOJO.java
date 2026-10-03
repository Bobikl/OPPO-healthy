package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\bm\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0007¢\u0006\u0002\u0010$J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010r\u001a\u00020\u0007HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÆ\u0003J\t\u0010y\u001a\u00020\u001eHÆ\u0003J\t\u0010z\u001a\u00020\u0007HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u0007HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0007HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÞ\u0002\u0010\u0086\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0007HÆ\u0001J\u0015\u0010\u0087\u0001\u001a\u00020\u001e2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010!\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001a\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010A\"\u0004\bB\u0010CR\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010&\"\u0004\bG\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010&\"\u0004\bI\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010&\"\u0004\bM\u0010(R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010&\"\u0004\bS\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010&\"\u0004\bU\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010&\"\u0004\bW\u0010(R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010&\"\u0004\bY\u0010(R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010&\"\u0004\b[\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010&\"\u0004\b]\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010&\"\u0004\b_\u0010(R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010&\"\u0004\ba\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010&\"\u0004\bc\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010&\"\u0004\be\u0010(R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00104\"\u0004\bg\u00106¨\u0006\u008b\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthIndicatorPOJO;", "", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "", "docId", "", "fileIndex", "", "bodySystem", "category", "owner", "institute", "name", "uniformName", "value", "uniformValue", "unit", "uniformUnit", DBIndicatorStat.REFER, "uniformReferMan", "uniformReferWoman", DBIndicatorStat.REMIND, "uniformRemind", "valueState", "type", "dataCreatedTimestamp", "descriptionUrl", "uniformValueType", DBIndicatorStat.SORT, "isUniform", "", "riskRank", "explain", "dataExtends", "modifiedTimestamp", "del", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;IZILjava/lang/String;Ljava/lang/String;JI)V", "getBodySystem", "()Ljava/lang/String;", "setBodySystem", "(Ljava/lang/String;)V", "getCategory", "setCategory", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDataExtends", "setDataExtends", "getDataId", "setDataId", "getDel", "()I", "setDel", "(I)V", "getDescriptionUrl", "setDescriptionUrl", "getDocId", "setDocId", "getExplain", "setExplain", "getFileIndex", "setFileIndex", "getInstitute", "setInstitute", "()Z", "setUniform", "(Z)V", "getModifiedTimestamp", "setModifiedTimestamp", "getName", "setName", "getOwner", "setOwner", "getRefer", "setRefer", "getRemind", "setRemind", "getRiskRank", "setRiskRank", "getSort", "setSort", "getType", "setType", "getUniformName", "setUniformName", "getUniformReferMan", "setUniformReferMan", "getUniformReferWoman", "setUniformReferWoman", "getUniformRemind", "setUniformRemind", "getUniformUnit", "setUniformUnit", "getUniformValue", "setUniformValue", "getUniformValueType", "setUniformValueType", "getUnit", "setUnit", "getValue", "setValue", "getValueState", "setValueState", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthIndicatorPOJO {

    @Nullable
    private String bodySystem;

    @Nullable
    private String category;
    private long dataCreatedTimestamp;

    @Nullable
    private String dataExtends;
    private long dataId;
    private int del;

    @Nullable
    private String descriptionUrl;

    @NotNull
    private String docId;

    @Nullable
    private String explain;
    private int fileIndex;

    @Nullable
    private String institute;
    private boolean isUniform;
    private long modifiedTimestamp;

    @Nullable
    private String name;

    @Nullable
    private String owner;

    @Nullable
    private String refer;

    @Nullable
    private String remind;
    private int riskRank;
    private int sort;

    @Nullable
    private String type;

    @Nullable
    private String uniformName;

    @Nullable
    private String uniformReferMan;

    @Nullable
    private String uniformReferWoman;

    @Nullable
    private String uniformRemind;

    @Nullable
    private String uniformUnit;

    @Nullable
    private String uniformValue;

    @Nullable
    private String uniformValueType;

    @Nullable
    private String unit;

    @Nullable
    private String value;
    private int valueState;

    public HealthIndicatorPOJO() {
        this(0L, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, null, null, 0, false, 0, null, null, 0L, 0, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    public static /* synthetic */ HealthIndicatorPOJO copy$default(HealthIndicatorPOJO healthIndicatorPOJO, long j2, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, String str17, long j3, String str18, String str19, int i3, boolean z, int i4, String str20, String str21, long j4, int i5, int i6, Object obj) {
        long j5 = (i6 & 1) != 0 ? healthIndicatorPOJO.dataId : j2;
        String str22 = (i6 & 2) != 0 ? healthIndicatorPOJO.docId : str;
        int i7 = (i6 & 4) != 0 ? healthIndicatorPOJO.fileIndex : i;
        String str23 = (i6 & 8) != 0 ? healthIndicatorPOJO.bodySystem : str2;
        String str24 = (i6 & 16) != 0 ? healthIndicatorPOJO.category : str3;
        String str25 = (i6 & 32) != 0 ? healthIndicatorPOJO.owner : str4;
        String str26 = (i6 & 64) != 0 ? healthIndicatorPOJO.institute : str5;
        String str27 = (i6 & 128) != 0 ? healthIndicatorPOJO.name : str6;
        String str28 = (i6 & 256) != 0 ? healthIndicatorPOJO.uniformName : str7;
        String str29 = (i6 & 512) != 0 ? healthIndicatorPOJO.value : str8;
        String str30 = (i6 & 1024) != 0 ? healthIndicatorPOJO.uniformValue : str9;
        String str31 = (i6 & 2048) != 0 ? healthIndicatorPOJO.unit : str10;
        return healthIndicatorPOJO.copy(j5, str22, i7, str23, str24, str25, str26, str27, str28, str29, str30, str31, (i6 & 4096) != 0 ? healthIndicatorPOJO.uniformUnit : str11, (i6 & 8192) != 0 ? healthIndicatorPOJO.refer : str12, (i6 & 16384) != 0 ? healthIndicatorPOJO.uniformReferMan : str13, (i6 & 32768) != 0 ? healthIndicatorPOJO.uniformReferWoman : str14, (i6 & 65536) != 0 ? healthIndicatorPOJO.remind : str15, (i6 & 131072) != 0 ? healthIndicatorPOJO.uniformRemind : str16, (i6 & 262144) != 0 ? healthIndicatorPOJO.valueState : i2, (i6 & 524288) != 0 ? healthIndicatorPOJO.type : str17, (i6 & 1048576) != 0 ? healthIndicatorPOJO.dataCreatedTimestamp : j3, (i6 & 2097152) != 0 ? healthIndicatorPOJO.descriptionUrl : str18, (4194304 & i6) != 0 ? healthIndicatorPOJO.uniformValueType : str19, (i6 & 8388608) != 0 ? healthIndicatorPOJO.sort : i3, (i6 & 16777216) != 0 ? healthIndicatorPOJO.isUniform : z, (i6 & 33554432) != 0 ? healthIndicatorPOJO.riskRank : i4, (i6 & 67108864) != 0 ? healthIndicatorPOJO.explain : str20, (i6 & 134217728) != 0 ? healthIndicatorPOJO.dataExtends : str21, (i6 & 268435456) != 0 ? healthIndicatorPOJO.modifiedTimestamp : j4, (i6 & 536870912) != 0 ? healthIndicatorPOJO.del : i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDataId() {
        return this.dataId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUniformValue() {
        return this.uniformValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUniformUnit() {
        return this.uniformUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRefer() {
        return this.refer;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getUniformReferMan() {
        return this.uniformReferMan;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUniformReferWoman() {
        return this.uniformReferWoman;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getRemind() {
        return this.remind;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUniformRemind() {
        return this.uniformRemind;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getValueState() {
        return this.valueState;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsUniform() {
        return this.isUniform;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getRiskRank() {
        return this.riskRank;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDataExtends() {
        return this.dataExtends;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFileIndex() {
        return this.fileIndex;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getDel() {
        return this.del;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUniformName() {
        return this.uniformName;
    }

    @NotNull
    public final HealthIndicatorPOJO copy(long dataId, @NotNull String docId, int fileIndex, @Nullable String bodySystem, @Nullable String category, @Nullable String owner, @Nullable String institute, @Nullable String name, @Nullable String uniformName, @Nullable String value, @Nullable String uniformValue, @Nullable String unit, @Nullable String uniformUnit, @Nullable String refer, @Nullable String uniformReferMan, @Nullable String uniformReferWoman, @Nullable String remind, @Nullable String uniformRemind, int valueState, @Nullable String type, long dataCreatedTimestamp, @Nullable String descriptionUrl, @Nullable String uniformValueType, int sort, boolean isUniform, int riskRank, @Nullable String explain, @Nullable String dataExtends, long modifiedTimestamp, int del) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new HealthIndicatorPOJO(dataId, docId, fileIndex, bodySystem, category, owner, institute, name, uniformName, value, uniformValue, unit, uniformUnit, refer, uniformReferMan, uniformReferWoman, remind, uniformRemind, valueState, type, dataCreatedTimestamp, descriptionUrl, uniformValueType, sort, isUniform, riskRank, explain, dataExtends, modifiedTimestamp, del);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIndicatorPOJO)) {
            return false;
        }
        HealthIndicatorPOJO healthIndicatorPOJO = (HealthIndicatorPOJO) other;
        return this.dataId == healthIndicatorPOJO.dataId && Intrinsics.areEqual(this.docId, healthIndicatorPOJO.docId) && this.fileIndex == healthIndicatorPOJO.fileIndex && Intrinsics.areEqual(this.bodySystem, healthIndicatorPOJO.bodySystem) && Intrinsics.areEqual(this.category, healthIndicatorPOJO.category) && Intrinsics.areEqual(this.owner, healthIndicatorPOJO.owner) && Intrinsics.areEqual(this.institute, healthIndicatorPOJO.institute) && Intrinsics.areEqual(this.name, healthIndicatorPOJO.name) && Intrinsics.areEqual(this.uniformName, healthIndicatorPOJO.uniformName) && Intrinsics.areEqual(this.value, healthIndicatorPOJO.value) && Intrinsics.areEqual(this.uniformValue, healthIndicatorPOJO.uniformValue) && Intrinsics.areEqual(this.unit, healthIndicatorPOJO.unit) && Intrinsics.areEqual(this.uniformUnit, healthIndicatorPOJO.uniformUnit) && Intrinsics.areEqual(this.refer, healthIndicatorPOJO.refer) && Intrinsics.areEqual(this.uniformReferMan, healthIndicatorPOJO.uniformReferMan) && Intrinsics.areEqual(this.uniformReferWoman, healthIndicatorPOJO.uniformReferWoman) && Intrinsics.areEqual(this.remind, healthIndicatorPOJO.remind) && Intrinsics.areEqual(this.uniformRemind, healthIndicatorPOJO.uniformRemind) && this.valueState == healthIndicatorPOJO.valueState && Intrinsics.areEqual(this.type, healthIndicatorPOJO.type) && this.dataCreatedTimestamp == healthIndicatorPOJO.dataCreatedTimestamp && Intrinsics.areEqual(this.descriptionUrl, healthIndicatorPOJO.descriptionUrl) && Intrinsics.areEqual(this.uniformValueType, healthIndicatorPOJO.uniformValueType) && this.sort == healthIndicatorPOJO.sort && this.isUniform == healthIndicatorPOJO.isUniform && this.riskRank == healthIndicatorPOJO.riskRank && Intrinsics.areEqual(this.explain, healthIndicatorPOJO.explain) && Intrinsics.areEqual(this.dataExtends, healthIndicatorPOJO.dataExtends) && this.modifiedTimestamp == healthIndicatorPOJO.modifiedTimestamp && this.del == healthIndicatorPOJO.del;
    }

    @Nullable
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @Nullable
    public final String getDataExtends() {
        return this.dataExtends;
    }

    public final long getDataId() {
        return this.dataId;
    }

    public final int getDel() {
        return this.del;
    }

    @Nullable
    public final String getDescriptionUrl() {
        return this.descriptionUrl;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    public final int getFileIndex() {
        return this.fileIndex;
    }

    @Nullable
    public final String getInstitute() {
        return this.institute;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final String getRefer() {
        return this.refer;
    }

    @Nullable
    public final String getRemind() {
        return this.remind;
    }

    public final int getRiskRank() {
        return this.riskRank;
    }

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUniformName() {
        return this.uniformName;
    }

    @Nullable
    public final String getUniformReferMan() {
        return this.uniformReferMan;
    }

    @Nullable
    public final String getUniformReferWoman() {
        return this.uniformReferWoman;
    }

    @Nullable
    public final String getUniformRemind() {
        return this.uniformRemind;
    }

    @Nullable
    public final String getUniformUnit() {
        return this.uniformUnit;
    }

    @Nullable
    public final String getUniformValue() {
        return this.uniformValue;
    }

    @Nullable
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final int getValueState() {
        return this.valueState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v93 */
    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.dataId) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileIndex)) * 31;
        String str = this.bodySystem;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.institute;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.uniformName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.value;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uniformValue;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.unit;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.uniformUnit;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.refer;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.uniformReferMan;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.uniformReferWoman;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.remind;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.uniformRemind;
        int iHashCode16 = (((iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31) + Integer.hashCode(this.valueState)) * 31;
        String str16 = this.type;
        int iHashCode17 = (((iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31;
        String str17 = this.descriptionUrl;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.uniformValueType;
        int iHashCode19 = (((iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31) + Integer.hashCode(this.sort)) * 31;
        boolean z = this.isUniform;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode20 = (((iHashCode19 + r1) * 31) + Integer.hashCode(this.riskRank)) * 31;
        String str19 = this.explain;
        int iHashCode21 = (iHashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.dataExtends;
        return ((((iHashCode21 + (str20 != null ? str20.hashCode() : 0)) * 31) + Long.hashCode(this.modifiedTimestamp)) * 31) + Integer.hashCode(this.del);
    }

    public final boolean isUniform() {
        return this.isUniform;
    }

    public final void setBodySystem(@Nullable String str) {
        this.bodySystem = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDataExtends(@Nullable String str) {
        this.dataExtends = str;
    }

    public final void setDataId(long j2) {
        this.dataId = j2;
    }

    public final void setDel(int i) {
        this.del = i;
    }

    public final void setDescriptionUrl(@Nullable String str) {
        this.descriptionUrl = str;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setExplain(@Nullable String str) {
        this.explain = str;
    }

    public final void setFileIndex(int i) {
        this.fileIndex = i;
    }

    public final void setInstitute(@Nullable String str) {
        this.institute = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setRefer(@Nullable String str) {
        this.refer = str;
    }

    public final void setRemind(@Nullable String str) {
        this.remind = str;
    }

    public final void setRiskRank(int i) {
        this.riskRank = i;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUniform(boolean z) {
        this.isUniform = z;
    }

    public final void setUniformName(@Nullable String str) {
        this.uniformName = str;
    }

    public final void setUniformReferMan(@Nullable String str) {
        this.uniformReferMan = str;
    }

    public final void setUniformReferWoman(@Nullable String str) {
        this.uniformReferWoman = str;
    }

    public final void setUniformRemind(@Nullable String str) {
        this.uniformRemind = str;
    }

    public final void setUniformUnit(@Nullable String str) {
        this.uniformUnit = str;
    }

    public final void setUniformValue(@Nullable String str) {
        this.uniformValue = str;
    }

    public final void setUniformValueType(@Nullable String str) {
        this.uniformValueType = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setValueState(int i) {
        this.valueState = i;
    }

    @NotNull
    public String toString() {
        return "HealthIndicatorPOJO(dataId=" + this.dataId + ", docId=" + this.docId + ", fileIndex=" + this.fileIndex + ", bodySystem=" + this.bodySystem + ", category=" + this.category + ", owner=" + this.owner + ", institute=" + this.institute + ", name=" + this.name + ", uniformName=" + this.uniformName + ", value=" + this.value + ", uniformValue=" + this.uniformValue + ", unit=" + this.unit + ", uniformUnit=" + this.uniformUnit + ", refer=" + this.refer + ", uniformReferMan=" + this.uniformReferMan + ", uniformReferWoman=" + this.uniformReferWoman + ", remind=" + this.remind + ", uniformRemind=" + this.uniformRemind + ", valueState=" + this.valueState + ", type=" + this.type + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", descriptionUrl=" + this.descriptionUrl + ", uniformValueType=" + this.uniformValueType + ", sort=" + this.sort + ", isUniform=" + this.isUniform + ", riskRank=" + this.riskRank + ", explain=" + this.explain + ", dataExtends=" + this.dataExtends + ", modifiedTimestamp=" + this.modifiedTimestamp + ", del=" + this.del + ")";
    }

    public HealthIndicatorPOJO(long j2, @NotNull String docId, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, int i2, @Nullable String str16, long j3, @Nullable String str17, @Nullable String str18, int i3, boolean z, int i4, @Nullable String str19, @Nullable String str20, long j4, int i5) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.dataId = j2;
        this.docId = docId;
        this.fileIndex = i;
        this.bodySystem = str;
        this.category = str2;
        this.owner = str3;
        this.institute = str4;
        this.name = str5;
        this.uniformName = str6;
        this.value = str7;
        this.uniformValue = str8;
        this.unit = str9;
        this.uniformUnit = str10;
        this.refer = str11;
        this.uniformReferMan = str12;
        this.uniformReferWoman = str13;
        this.remind = str14;
        this.uniformRemind = str15;
        this.valueState = i2;
        this.type = str16;
        this.dataCreatedTimestamp = j3;
        this.descriptionUrl = str17;
        this.uniformValueType = str18;
        this.sort = i3;
        this.isUniform = z;
        this.riskRank = i4;
        this.explain = str19;
        this.dataExtends = str20;
        this.modifiedTimestamp = j4;
        this.del = i5;
    }

    public /* synthetic */ HealthIndicatorPOJO(long j2, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, String str17, long j3, String str18, String str19, int i3, boolean z, int i4, String str20, String str21, long j4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j2, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? null : str2, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, (i6 & 64) != 0 ? null : str5, (i6 & 128) != 0 ? null : str6, (i6 & 256) != 0 ? null : str7, (i6 & 512) != 0 ? null : str8, (i6 & 1024) != 0 ? null : str9, (i6 & 2048) != 0 ? null : str10, (i6 & 4096) != 0 ? null : str11, (i6 & 8192) != 0 ? null : str12, (i6 & 16384) != 0 ? null : str13, (i6 & 32768) != 0 ? null : str14, (i6 & 65536) != 0 ? null : str15, (i6 & 131072) != 0 ? null : str16, (i6 & 262144) != 0 ? 0 : i2, (i6 & 524288) != 0 ? null : str17, (i6 & 1048576) != 0 ? 0L : j3, (i6 & 2097152) != 0 ? null : str18, (i6 & 4194304) != 0 ? null : str19, (i6 & 8388608) != 0 ? 0 : i3, (i6 & 16777216) != 0 ? false : z, (i6 & 33554432) != 0 ? 0 : i4, (i6 & 67108864) != 0 ? null : str20, (i6 & 134217728) != 0 ? null : str21, (i6 & 268435456) != 0 ? 0L : j4, (i6 & 536870912) != 0 ? 0 : i5);
    }
}
