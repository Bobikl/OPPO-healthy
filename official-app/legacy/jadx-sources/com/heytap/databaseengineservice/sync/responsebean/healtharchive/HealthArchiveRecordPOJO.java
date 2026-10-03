package com.heytap.databaseengineservice.sync.responsebean.healtharchive;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bY\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0002\u0010\u001cJ\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u000fHÆ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u000fHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u000fHÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008b\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0006HÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010(\"\u0004\bK\u0010/R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010 R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&¨\u0006m"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/healtharchive/HealthArchiveRecordPOJO;", "", "name", "", "docId", "fileSource", "", "type", "archiveType", "owner", DBHealthArchiveRecord.AGE, "gender", "institute", "structData", "dataCreatedTimestamp", "", "uploadTimestamp", "tag", "originalTitle", "simplifyTitle", "imgUrl", "clientFileList", "analysis", "analysisTimestamp", "suggestion", "guessQuestions", "modifiedTimestamp", "del", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JI)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getAnalysis", "setAnalysis", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getArchiveType", "()I", "getClientFileList", "setClientFileList", "getDataCreatedTimestamp", "setDataCreatedTimestamp", "getDel", "setDel", "(I)V", "getDocId", "setDocId", "getFileSource", "setFileSource", "getGender", "setGender", "getGuessQuestions", "setGuessQuestions", "getImgUrl", "setImgUrl", "getInstitute", "setInstitute", "getModifiedTimestamp", "setModifiedTimestamp", "getName", "setName", "getOriginalTitle", "setOriginalTitle", "getOwner", "setOwner", "getSimplifyTitle", "setSimplifyTitle", "getStructData", "setStructData", "getSuggestion", "setSuggestion", "getTag", "setTag", "getType", "setType", "getUploadTimestamp", "setUploadTimestamp", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchiveRecordPOJO {

    @Nullable
    private String age;

    @Nullable
    private String analysis;
    private long analysisTimestamp;
    private final int archiveType;

    @Nullable
    private String clientFileList;
    private long dataCreatedTimestamp;
    private int del;

    @NotNull
    private String docId;
    private int fileSource;

    @Nullable
    private String gender;

    @Nullable
    private String guessQuestions;

    @Nullable
    private String imgUrl;

    @Nullable
    private String institute;
    private long modifiedTimestamp;

    @Nullable
    private String name;

    @Nullable
    private String originalTitle;

    @Nullable
    private String owner;

    @Nullable
    private String simplifyTitle;

    @Nullable
    private String structData;

    @Nullable
    private String suggestion;
    private int tag;

    @Nullable
    private String type;
    private long uploadTimestamp;

    public HealthArchiveRecordPOJO() {
        this(null, null, 0, null, 0, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, null, 0L, null, null, 0L, 0, 8388607, null);
    }

    public static /* synthetic */ HealthArchiveRecordPOJO copy$default(HealthArchiveRecordPOJO healthArchiveRecordPOJO, String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, String str7, String str8, long j2, long j3, int i3, String str9, String str10, String str11, String str12, String str13, long j4, String str14, String str15, long j5, int i4, int i5, Object obj) {
        String str16 = (i5 & 1) != 0 ? healthArchiveRecordPOJO.name : str;
        String str17 = (i5 & 2) != 0 ? healthArchiveRecordPOJO.docId : str2;
        int i6 = (i5 & 4) != 0 ? healthArchiveRecordPOJO.fileSource : i;
        String str18 = (i5 & 8) != 0 ? healthArchiveRecordPOJO.type : str3;
        int i7 = (i5 & 16) != 0 ? healthArchiveRecordPOJO.archiveType : i2;
        String str19 = (i5 & 32) != 0 ? healthArchiveRecordPOJO.owner : str4;
        String str20 = (i5 & 64) != 0 ? healthArchiveRecordPOJO.age : str5;
        String str21 = (i5 & 128) != 0 ? healthArchiveRecordPOJO.gender : str6;
        String str22 = (i5 & 256) != 0 ? healthArchiveRecordPOJO.institute : str7;
        String str23 = (i5 & 512) != 0 ? healthArchiveRecordPOJO.structData : str8;
        long j6 = (i5 & 1024) != 0 ? healthArchiveRecordPOJO.dataCreatedTimestamp : j2;
        long j7 = (i5 & 2048) != 0 ? healthArchiveRecordPOJO.uploadTimestamp : j3;
        int i8 = (i5 & 4096) != 0 ? healthArchiveRecordPOJO.tag : i3;
        return healthArchiveRecordPOJO.copy(str16, str17, i6, str18, i7, str19, str20, str21, str22, str23, j6, j7, i8, (i5 & 8192) != 0 ? healthArchiveRecordPOJO.originalTitle : str9, (i5 & 16384) != 0 ? healthArchiveRecordPOJO.simplifyTitle : str10, (i5 & 32768) != 0 ? healthArchiveRecordPOJO.imgUrl : str11, (i5 & 65536) != 0 ? healthArchiveRecordPOJO.clientFileList : str12, (i5 & 131072) != 0 ? healthArchiveRecordPOJO.analysis : str13, (i5 & 262144) != 0 ? healthArchiveRecordPOJO.analysisTimestamp : j4, (i5 & 524288) != 0 ? healthArchiveRecordPOJO.suggestion : str14, (1048576 & i5) != 0 ? healthArchiveRecordPOJO.guessQuestions : str15, (i5 & 2097152) != 0 ? healthArchiveRecordPOJO.modifiedTimestamp : j5, (i5 & 4194304) != 0 ? healthArchiveRecordPOJO.del : i4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStructData() {
        return this.structData;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOriginalTitle() {
        return this.originalTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getClientFileList() {
        return this.clientFileList;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getDel() {
        return this.del;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getArchiveType() {
        return this.archiveType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @NotNull
    public final HealthArchiveRecordPOJO copy(@Nullable String name, @NotNull String docId, int fileSource, @Nullable String type, int archiveType, @Nullable String owner, @Nullable String age, @Nullable String gender, @Nullable String institute, @Nullable String structData, long dataCreatedTimestamp, long uploadTimestamp, int tag, @Nullable String originalTitle, @Nullable String simplifyTitle, @Nullable String imgUrl, @Nullable String clientFileList, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions, long modifiedTimestamp, int del) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new HealthArchiveRecordPOJO(name, docId, fileSource, type, archiveType, owner, age, gender, institute, structData, dataCreatedTimestamp, uploadTimestamp, tag, originalTitle, simplifyTitle, imgUrl, clientFileList, analysis, analysisTimestamp, suggestion, guessQuestions, modifiedTimestamp, del);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchiveRecordPOJO)) {
            return false;
        }
        HealthArchiveRecordPOJO healthArchiveRecordPOJO = (HealthArchiveRecordPOJO) other;
        return Intrinsics.areEqual(this.name, healthArchiveRecordPOJO.name) && Intrinsics.areEqual(this.docId, healthArchiveRecordPOJO.docId) && this.fileSource == healthArchiveRecordPOJO.fileSource && Intrinsics.areEqual(this.type, healthArchiveRecordPOJO.type) && this.archiveType == healthArchiveRecordPOJO.archiveType && Intrinsics.areEqual(this.owner, healthArchiveRecordPOJO.owner) && Intrinsics.areEqual(this.age, healthArchiveRecordPOJO.age) && Intrinsics.areEqual(this.gender, healthArchiveRecordPOJO.gender) && Intrinsics.areEqual(this.institute, healthArchiveRecordPOJO.institute) && Intrinsics.areEqual(this.structData, healthArchiveRecordPOJO.structData) && this.dataCreatedTimestamp == healthArchiveRecordPOJO.dataCreatedTimestamp && this.uploadTimestamp == healthArchiveRecordPOJO.uploadTimestamp && this.tag == healthArchiveRecordPOJO.tag && Intrinsics.areEqual(this.originalTitle, healthArchiveRecordPOJO.originalTitle) && Intrinsics.areEqual(this.simplifyTitle, healthArchiveRecordPOJO.simplifyTitle) && Intrinsics.areEqual(this.imgUrl, healthArchiveRecordPOJO.imgUrl) && Intrinsics.areEqual(this.clientFileList, healthArchiveRecordPOJO.clientFileList) && Intrinsics.areEqual(this.analysis, healthArchiveRecordPOJO.analysis) && this.analysisTimestamp == healthArchiveRecordPOJO.analysisTimestamp && Intrinsics.areEqual(this.suggestion, healthArchiveRecordPOJO.suggestion) && Intrinsics.areEqual(this.guessQuestions, healthArchiveRecordPOJO.guessQuestions) && this.modifiedTimestamp == healthArchiveRecordPOJO.modifiedTimestamp && this.del == healthArchiveRecordPOJO.del;
    }

    @Nullable
    public final String getAge() {
        return this.age;
    }

    @Nullable
    public final String getAnalysis() {
        return this.analysis;
    }

    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    public final int getArchiveType() {
        return this.archiveType;
    }

    @Nullable
    public final String getClientFileList() {
        return this.clientFileList;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    public final int getDel() {
        return this.del;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    public final String getGender() {
        return this.gender;
    }

    @Nullable
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
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
    public final String getOriginalTitle() {
        return this.originalTitle;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Nullable
    public final String getStructData() {
        return this.structData;
    }

    @Nullable
    public final String getSuggestion() {
        return this.suggestion;
    }

    public final int getTag() {
        return this.tag;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileSource)) * 31;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.archiveType)) * 31;
        String str3 = this.owner;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.age;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institute;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.structData;
        int iHashCode7 = (((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.uploadTimestamp)) * 31) + Integer.hashCode(this.tag)) * 31;
        String str8 = this.originalTitle;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.simplifyTitle;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.imgUrl;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.clientFileList;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.analysis;
        int iHashCode12 = (((iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str13 = this.suggestion;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.guessQuestions;
        return ((((iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31) + Long.hashCode(this.modifiedTimestamp)) * 31) + Integer.hashCode(this.del);
    }

    public final void setAge(@Nullable String str) {
        this.age = str;
    }

    public final void setAnalysis(@Nullable String str) {
        this.analysis = str;
    }

    public final void setAnalysisTimestamp(long j2) {
        this.analysisTimestamp = j2;
    }

    public final void setClientFileList(@Nullable String str) {
        this.clientFileList = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDel(int i) {
        this.del = i;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setFileSource(int i) {
        this.fileSource = i;
    }

    public final void setGender(@Nullable String str) {
        this.gender = str;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
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

    public final void setOriginalTitle(@Nullable String str) {
        this.originalTitle = str;
    }

    public final void setOwner(@Nullable String str) {
        this.owner = str;
    }

    public final void setSimplifyTitle(@Nullable String str) {
        this.simplifyTitle = str;
    }

    public final void setStructData(@Nullable String str) {
        this.structData = str;
    }

    public final void setSuggestion(@Nullable String str) {
        this.suggestion = str;
    }

    public final void setTag(int i) {
        this.tag = i;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUploadTimestamp(long j2) {
        this.uploadTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "HealthArchiveRecordPOJO(name=" + this.name + ", docId=" + this.docId + ", fileSource=" + this.fileSource + ", type=" + this.type + ", archiveType=" + this.archiveType + ", owner=" + this.owner + ", age=" + this.age + ", gender=" + this.gender + ", institute=" + this.institute + ", structData=" + this.structData + ", dataCreatedTimestamp=" + this.dataCreatedTimestamp + ", uploadTimestamp=" + this.uploadTimestamp + ", tag=" + this.tag + ", originalTitle=" + this.originalTitle + ", simplifyTitle=" + this.simplifyTitle + ", imgUrl=" + this.imgUrl + ", clientFileList=" + this.clientFileList + ", analysis=" + this.analysis + ", analysisTimestamp=" + this.analysisTimestamp + ", suggestion=" + this.suggestion + ", guessQuestions=" + this.guessQuestions + ", modifiedTimestamp=" + this.modifiedTimestamp + ", del=" + this.del + ")";
    }

    public HealthArchiveRecordPOJO(@Nullable String str, @NotNull String docId, int i, @Nullable String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j2, long j3, int i3, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, long j4, @Nullable String str13, @Nullable String str14, long j5, int i4) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.name = str;
        this.docId = docId;
        this.fileSource = i;
        this.type = str2;
        this.archiveType = i2;
        this.owner = str3;
        this.age = str4;
        this.gender = str5;
        this.institute = str6;
        this.structData = str7;
        this.dataCreatedTimestamp = j2;
        this.uploadTimestamp = j3;
        this.tag = i3;
        this.originalTitle = str8;
        this.simplifyTitle = str9;
        this.imgUrl = str10;
        this.clientFileList = str11;
        this.analysis = str12;
        this.analysisTimestamp = j4;
        this.suggestion = str13;
        this.guessQuestions = str14;
        this.modifiedTimestamp = j5;
        this.del = i4;
    }

    public /* synthetic */ HealthArchiveRecordPOJO(String str, String str2, int i, String str3, int i2, String str4, String str5, String str6, String str7, String str8, long j2, long j3, int i3, String str9, String str10, String str11, String str12, String str13, long j4, String str14, String str15, long j5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? null : str3, (i5 & 16) != 0 ? -1 : i2, (i5 & 32) != 0 ? null : str4, (i5 & 64) != 0 ? null : str5, (i5 & 128) != 0 ? null : str6, (i5 & 256) != 0 ? null : str7, (i5 & 512) != 0 ? null : str8, (i5 & 1024) != 0 ? 0L : j2, (i5 & 2048) != 0 ? 0L : j3, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? null : str9, (i5 & 16384) != 0 ? null : str10, (i5 & 32768) != 0 ? null : str11, (i5 & 65536) != 0 ? null : str12, (i5 & 131072) != 0 ? null : str13, (i5 & 262144) != 0 ? 0L : j4, (i5 & 524288) != 0 ? null : str14, (i5 & 1048576) != 0 ? null : str15, (i5 & 2097152) == 0 ? j5 : 0L, (i5 & 4194304) != 0 ? 0 : i4);
    }
}
