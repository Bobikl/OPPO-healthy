package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0002\u0010\u0018J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0010HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0010HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\u0010HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003JÝ\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0010HÆ\u0001J\u0013\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020\nHÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001a\"\u0004\bD\u0010\u001c¨\u0006^"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthIndicatorStatPOJO;", "", "name", "", "category", "type", "bodySystem", "owner", "trendList", "state", "", "uniformValueType", "tag", "trendTag", "analysis", "analysisTimestamp", "", "suggestion", "guessQuestions", "explain", "dataUpdateTimestamp", "dataExtends", "del", "modifiedTimestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IJ)V", "getAnalysis", "()Ljava/lang/String;", "setAnalysis", "(Ljava/lang/String;)V", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getBodySystem", "setBodySystem", "getCategory", "setCategory", "getDataExtends", "setDataExtends", "getDataUpdateTimestamp", "setDataUpdateTimestamp", "getDel", "()I", "setDel", "(I)V", "getExplain", "setExplain", "getGuessQuestions", "setGuessQuestions", "getModifiedTimestamp", "setModifiedTimestamp", "getName", "setName", "getOwner", "setOwner", "getState", "setState", "getSuggestion", "setSuggestion", "getTag", "setTag", "getTrendList", "setTrendList", "getTrendTag", "setTrendTag", "getType", "setType", "getUniformValueType", "setUniformValueType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthIndicatorStatPOJO {

    @Nullable
    private String analysis;
    private long analysisTimestamp;

    @Nullable
    private String bodySystem;

    @Nullable
    private String category;

    @Nullable
    private String dataExtends;
    private long dataUpdateTimestamp;
    private int del;

    @Nullable
    private String explain;

    @Nullable
    private String guessQuestions;
    private long modifiedTimestamp;

    @NotNull
    private String name;

    @Nullable
    private String owner;
    private int state;

    @Nullable
    private String suggestion;
    private int tag;

    @NotNull
    private String trendList;

    @Nullable
    private String trendTag;

    @Nullable
    private String type;

    @Nullable
    private String uniformValueType;

    public HealthIndicatorStatPOJO() {
        this(null, null, null, null, null, null, 0, null, 0, null, null, 0L, null, null, null, 0L, null, 0, 0L, 524287, null);
    }

    public static /* synthetic */ HealthIndicatorStatPOJO copy$default(HealthIndicatorStatPOJO healthIndicatorStatPOJO, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, String str8, String str9, long j2, String str10, String str11, String str12, long j3, String str13, int i3, long j4, int i4, Object obj) {
        String str14 = (i4 & 1) != 0 ? healthIndicatorStatPOJO.name : str;
        String str15 = (i4 & 2) != 0 ? healthIndicatorStatPOJO.category : str2;
        String str16 = (i4 & 4) != 0 ? healthIndicatorStatPOJO.type : str3;
        String str17 = (i4 & 8) != 0 ? healthIndicatorStatPOJO.bodySystem : str4;
        String str18 = (i4 & 16) != 0 ? healthIndicatorStatPOJO.owner : str5;
        String str19 = (i4 & 32) != 0 ? healthIndicatorStatPOJO.trendList : str6;
        int i5 = (i4 & 64) != 0 ? healthIndicatorStatPOJO.state : i;
        String str20 = (i4 & 128) != 0 ? healthIndicatorStatPOJO.uniformValueType : str7;
        int i6 = (i4 & 256) != 0 ? healthIndicatorStatPOJO.tag : i2;
        String str21 = (i4 & 512) != 0 ? healthIndicatorStatPOJO.trendTag : str8;
        String str22 = (i4 & 1024) != 0 ? healthIndicatorStatPOJO.analysis : str9;
        long j5 = (i4 & 2048) != 0 ? healthIndicatorStatPOJO.analysisTimestamp : j2;
        return healthIndicatorStatPOJO.copy(str14, str15, str16, str17, str18, str19, i5, str20, i6, str21, str22, j5, (i4 & 4096) != 0 ? healthIndicatorStatPOJO.suggestion : str10, (i4 & 8192) != 0 ? healthIndicatorStatPOJO.guessQuestions : str11, (i4 & 16384) != 0 ? healthIndicatorStatPOJO.explain : str12, (i4 & 32768) != 0 ? healthIndicatorStatPOJO.dataUpdateTimestamp : j3, (i4 & 65536) != 0 ? healthIndicatorStatPOJO.dataExtends : str13, (131072 & i4) != 0 ? healthIndicatorStatPOJO.del : i3, (i4 & 262144) != 0 ? healthIndicatorStatPOJO.modifiedTimestamp : j4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrendTag() {
        return this.trendTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getDataUpdateTimestamp() {
        return this.dataUpdateTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDataExtends() {
        return this.dataExtends;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getDel() {
        return this.del;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrendList() {
        return this.trendList;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final HealthIndicatorStatPOJO copy(@NotNull String name, @Nullable String category, @Nullable String type, @Nullable String bodySystem, @Nullable String owner, @NotNull String trendList, int state, @Nullable String uniformValueType, int tag, @Nullable String trendTag, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions, @Nullable String explain, long dataUpdateTimestamp, @Nullable String dataExtends, int del, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        return new HealthIndicatorStatPOJO(name, category, type, bodySystem, owner, trendList, state, uniformValueType, tag, trendTag, analysis, analysisTimestamp, suggestion, guessQuestions, explain, dataUpdateTimestamp, dataExtends, del, modifiedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthIndicatorStatPOJO)) {
            return false;
        }
        HealthIndicatorStatPOJO healthIndicatorStatPOJO = (HealthIndicatorStatPOJO) other;
        return Intrinsics.areEqual(this.name, healthIndicatorStatPOJO.name) && Intrinsics.areEqual(this.category, healthIndicatorStatPOJO.category) && Intrinsics.areEqual(this.type, healthIndicatorStatPOJO.type) && Intrinsics.areEqual(this.bodySystem, healthIndicatorStatPOJO.bodySystem) && Intrinsics.areEqual(this.owner, healthIndicatorStatPOJO.owner) && Intrinsics.areEqual(this.trendList, healthIndicatorStatPOJO.trendList) && this.state == healthIndicatorStatPOJO.state && Intrinsics.areEqual(this.uniformValueType, healthIndicatorStatPOJO.uniformValueType) && this.tag == healthIndicatorStatPOJO.tag && Intrinsics.areEqual(this.trendTag, healthIndicatorStatPOJO.trendTag) && Intrinsics.areEqual(this.analysis, healthIndicatorStatPOJO.analysis) && this.analysisTimestamp == healthIndicatorStatPOJO.analysisTimestamp && Intrinsics.areEqual(this.suggestion, healthIndicatorStatPOJO.suggestion) && Intrinsics.areEqual(this.guessQuestions, healthIndicatorStatPOJO.guessQuestions) && Intrinsics.areEqual(this.explain, healthIndicatorStatPOJO.explain) && this.dataUpdateTimestamp == healthIndicatorStatPOJO.dataUpdateTimestamp && Intrinsics.areEqual(this.dataExtends, healthIndicatorStatPOJO.dataExtends) && this.del == healthIndicatorStatPOJO.del && this.modifiedTimestamp == healthIndicatorStatPOJO.modifiedTimestamp;
    }

    @Nullable
    public final String getAnalysis() {
        return this.analysis;
    }

    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getDataExtends() {
        return this.dataExtends;
    }

    public final long getDataUpdateTimestamp() {
        return this.dataUpdateTimestamp;
    }

    public final int getDel() {
        return this.del;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTrendList() {
        return this.trendList;
    }

    @Nullable
    public final String getTrendTag() {
        return this.trendTag;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.category;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodySystem;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.owner;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.trendList.hashCode()) * 31) + Integer.hashCode(this.state)) * 31;
        String str5 = this.uniformValueType;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.tag)) * 31;
        String str6 = this.trendTag;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.analysis;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str8 = this.suggestion;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.guessQuestions;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.explain;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + Long.hashCode(this.dataUpdateTimestamp)) * 31;
        String str11 = this.dataExtends;
        return ((((iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31) + Integer.hashCode(this.del)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setAnalysis(@Nullable String str) {
        this.analysis = str;
    }

    public final void setAnalysisTimestamp(long j2) {
        this.analysisTimestamp = j2;
    }

    public final void setBodySystem(@Nullable String str) {
        this.bodySystem = str;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDataExtends(@Nullable String str) {
        this.dataExtends = str;
    }

    public final void setDataUpdateTimestamp(long j2) {
        this.dataUpdateTimestamp = j2;
    }

    public final void setDel(int i) {
        this.del = i;
    }

    public final void setExplain(@Nullable String str) {
        this.explain = str;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSuggestion(@Nullable String str) {
        this.suggestion = str;
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public final void setTrendList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trendList = str;
    }

    public final void setTrendTag(@Nullable String str) {
        this.trendTag = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUniformValueType(@Nullable String str) {
        this.uniformValueType = str;
    }

    @NotNull
    public String toString() {
        return "HealthIndicatorStatPOJO(name=" + this.name + ", category=" + this.category + ", type=" + this.type + ", bodySystem=" + this.bodySystem + ", owner=" + this.owner + ", trendList=" + this.trendList + ", state=" + this.state + ", uniformValueType=" + this.uniformValueType + ", tag=" + this.tag + ", trendTag=" + this.trendTag + ", analysis=" + this.analysis + ", analysisTimestamp=" + this.analysisTimestamp + ", suggestion=" + this.suggestion + ", guessQuestions=" + this.guessQuestions + ", explain=" + this.explain + ", dataUpdateTimestamp=" + this.dataUpdateTimestamp + ", dataExtends=" + this.dataExtends + ", del=" + this.del + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }

    public HealthIndicatorStatPOJO(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String trendList, int i, @Nullable String str5, int i2, @Nullable String str6, @Nullable String str7, long j2, @Nullable String str8, @Nullable String str9, @Nullable String str10, long j3, @Nullable String str11, int i3, long j4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        this.name = name;
        this.category = str;
        this.type = str2;
        this.bodySystem = str3;
        this.owner = str4;
        this.trendList = trendList;
        this.state = i;
        this.uniformValueType = str5;
        this.tag = i2;
        this.trendTag = str6;
        this.analysis = str7;
        this.analysisTimestamp = j2;
        this.suggestion = str8;
        this.guessQuestions = str9;
        this.explain = str10;
        this.dataUpdateTimestamp = j3;
        this.dataExtends = str11;
        this.del = i3;
        this.modifiedTimestamp = j4;
    }

    public /* synthetic */ HealthIndicatorStatPOJO(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, String str8, String str9, long j2, String str10, String str11, String str12, long j3, String str13, int i3, long j4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) == 0 ? str6 : "", (i4 & 64) != 0 ? 0 : i, (i4 & 128) != 0 ? null : str7, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? null : str8, (i4 & 1024) != 0 ? null : str9, (i4 & 2048) != 0 ? 0L : j2, (i4 & 4096) != 0 ? null : str10, (i4 & 8192) != 0 ? null : str11, (i4 & 16384) != 0 ? null : str12, (i4 & 32768) != 0 ? 0L : j3, (i4 & 65536) != 0 ? null : str13, (i4 & 131072) != 0 ? 0 : i3, (i4 & 262144) == 0 ? j4 : 0L);
    }
}
