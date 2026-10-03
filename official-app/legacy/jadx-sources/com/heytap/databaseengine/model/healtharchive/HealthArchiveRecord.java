package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bY\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B±\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010#J\t\u0010\\\u001a\u00020\u0004HÂ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010_\u001a\u00020\u0011HÆ\u0003J\t\u0010`\u001a\u00020\u0011HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0018HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0018HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010k\u001a\u00020\u0011HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010n\u001a\u00020\u0004HÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010q\u001a\u00020\bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jµ\u0002\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00182\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010v\u001a\u00020\bHÖ\u0001J\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010zHÖ\u0003J\b\u0010{\u001a\u00020\u0004H\u0016J\t\u0010|\u001a\u00020\bHÖ\u0001J\b\u0010}\u001a\u00020\u0004H\u0016J\u001c\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\bHÖ\u0001R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010)\"\u0004\b?\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010)\"\u0004\bE\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R \u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010)\"\u0004\bM\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010/\"\u0004\bY\u00101R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00105\"\u0004\b[\u00107¨\u0006\u0083\u0001"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveRecord;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "name", "docId", "fileSource", "", "type", "archiveType", "owner", DBHealthArchiveRecord.AGE, "sex", "institute", "structData", "dataCreatedTimestamp", "", "uploadTimestamp", "tag", "originalTitle", "simplifyTitle", "imgUrl", "clientFileList", "", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "abnormalNumber", "indicatorDetailList", "Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorDetail;", "userReviewPlanList", "Lcom/heytap/databaseengine/model/healtharchive/HealthReviewPlan;", "analysis", "analysisTimestamp", "suggestion", "guessQuestions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAbnormalNumber", "()I", "setAbnormalNumber", "(I)V", "getAge", "()Ljava/lang/String;", "setAge", "(Ljava/lang/String;)V", "getAnalysis", "setAnalysis", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getArchiveType", "setArchiveType", "getClientFileList", "()Ljava/util/List;", "setClientFileList", "(Ljava/util/List;)V", "getDataCreatedTimestamp", "setDataCreatedTimestamp", "getDocId", "setDocId", "getFileSource", "setFileSource", "getGuessQuestions", "setGuessQuestions", "getImgUrl", "setImgUrl", "getIndicatorDetailList", "setIndicatorDetailList", "getInstitute", "setInstitute", "getName", "setName", "getOriginalTitle", "setOriginalTitle", "getOwner", "setOwner", "getSex", "setSex", "getSimplifyTitle", "setSimplifyTitle", "getStructData", "setStructData", "getSuggestion", "setSuggestion", "getTag", "setTag", "getType", "setType", "getUploadTimestamp", "setUploadTimestamp", "getUserReviewPlanList", "setUserReviewPlanList", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "getSsoid", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchiveRecord extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthArchiveRecord> CREATOR = new a();
    private int abnormalNumber;

    @Nullable
    private String age;

    @Nullable
    private String analysis;
    private long analysisTimestamp;
    private int archiveType;

    @Nullable
    private List<HealthArchiveFile> clientFileList;
    private long dataCreatedTimestamp;

    @NotNull
    private String docId;
    private int fileSource;

    @Nullable
    private String guessQuestions;

    @Nullable
    private String imgUrl;

    @Nullable
    private List<IndicatorStat> indicatorDetailList;

    @Nullable
    private String institute;

    @Nullable
    private String name;

    @Nullable
    private String originalTitle;

    @Nullable
    private String owner;

    @SerializedName("gender")
    @Nullable
    private String sex;

    @Nullable
    private String simplifyTitle;

    @NotNull
    private String ssoid;

    @Nullable
    private String structData;

    @Nullable
    private String suggestion;
    private int tag;

    @Nullable
    private String type;
    private long uploadTimestamp;

    @Nullable
    private List<HealthReviewPlan> userReviewPlanList;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthArchiveRecord> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthArchiveRecord createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i3 = parcel.readInt();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList4.add(HealthArchiveFile.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            int i6 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList5.add(IndicatorStat.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList6.add(HealthReviewPlan.CREATOR.createFromParcel(parcel));
                    i10++;
                    i9 = i9;
                }
                arrayList3 = arrayList6;
            }
            return new HealthArchiveRecord(string, string2, string3, i, string4, i2, string5, string6, string7, string8, string9, j2, j3, i3, string10, string11, string12, arrayList, i6, arrayList2, arrayList3, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthArchiveRecord[] newArray(int i) {
            return new HealthArchiveRecord[i];
        }
    }

    public HealthArchiveRecord() {
        this(null, null, null, 0, null, 0, null, null, null, null, null, 0L, 0L, 0, null, null, null, null, 0, null, null, null, 0L, null, null, 33554431, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStructData() {
        return this.structData;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getUploadTimestamp() {
        return this.uploadTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOriginalTitle() {
        return this.originalTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final List<HealthArchiveFile> component18() {
        return this.clientFileList;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getAbnormalNumber() {
        return this.abnormalNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<IndicatorStat> component20() {
        return this.indicatorDetailList;
    }

    @Nullable
    public final List<HealthReviewPlan> component21() {
        return this.userReviewPlanList;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFileSource() {
        return this.fileSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getArchiveType() {
        return this.archiveType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAge() {
        return this.age;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final HealthArchiveRecord copy(@NotNull String ssoid, @Nullable String name, @NotNull String docId, int fileSource, @Nullable String type, int archiveType, @Nullable String owner, @Nullable String age, @Nullable String sex, @Nullable String institute, @Nullable String structData, long dataCreatedTimestamp, long uploadTimestamp, int tag, @Nullable String originalTitle, @Nullable String simplifyTitle, @Nullable String imgUrl, @Nullable List<HealthArchiveFile> clientFileList, int abnormalNumber, @Nullable List<IndicatorStat> indicatorDetailList, @Nullable List<HealthReviewPlan> userReviewPlanList, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        return new HealthArchiveRecord(ssoid, name, docId, fileSource, type, archiveType, owner, age, sex, institute, structData, dataCreatedTimestamp, uploadTimestamp, tag, originalTitle, simplifyTitle, imgUrl, clientFileList, abnormalNumber, indicatorDetailList, userReviewPlanList, analysis, analysisTimestamp, suggestion, guessQuestions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchiveRecord)) {
            return false;
        }
        HealthArchiveRecord healthArchiveRecord = (HealthArchiveRecord) other;
        return Intrinsics.areEqual(this.ssoid, healthArchiveRecord.ssoid) && Intrinsics.areEqual(this.name, healthArchiveRecord.name) && Intrinsics.areEqual(this.docId, healthArchiveRecord.docId) && this.fileSource == healthArchiveRecord.fileSource && Intrinsics.areEqual(this.type, healthArchiveRecord.type) && this.archiveType == healthArchiveRecord.archiveType && Intrinsics.areEqual(this.owner, healthArchiveRecord.owner) && Intrinsics.areEqual(this.age, healthArchiveRecord.age) && Intrinsics.areEqual(this.sex, healthArchiveRecord.sex) && Intrinsics.areEqual(this.institute, healthArchiveRecord.institute) && Intrinsics.areEqual(this.structData, healthArchiveRecord.structData) && this.dataCreatedTimestamp == healthArchiveRecord.dataCreatedTimestamp && this.uploadTimestamp == healthArchiveRecord.uploadTimestamp && this.tag == healthArchiveRecord.tag && Intrinsics.areEqual(this.originalTitle, healthArchiveRecord.originalTitle) && Intrinsics.areEqual(this.simplifyTitle, healthArchiveRecord.simplifyTitle) && Intrinsics.areEqual(this.imgUrl, healthArchiveRecord.imgUrl) && Intrinsics.areEqual(this.clientFileList, healthArchiveRecord.clientFileList) && this.abnormalNumber == healthArchiveRecord.abnormalNumber && Intrinsics.areEqual(this.indicatorDetailList, healthArchiveRecord.indicatorDetailList) && Intrinsics.areEqual(this.userReviewPlanList, healthArchiveRecord.userReviewPlanList) && Intrinsics.areEqual(this.analysis, healthArchiveRecord.analysis) && this.analysisTimestamp == healthArchiveRecord.analysisTimestamp && Intrinsics.areEqual(this.suggestion, healthArchiveRecord.suggestion) && Intrinsics.areEqual(this.guessQuestions, healthArchiveRecord.guessQuestions);
    }

    public final int getAbnormalNumber() {
        return this.abnormalNumber;
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
    public final List<HealthArchiveFile> getClientFileList() {
        return this.clientFileList;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @NotNull
    public final String getDocId() {
        return this.docId;
    }

    public final int getFileSource() {
        return this.fileSource;
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
    public final List<IndicatorStat> getIndicatorDetailList() {
        return this.indicatorDetailList;
    }

    @Nullable
    public final String getInstitute() {
        return this.institute;
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
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSimplifyTitle() {
        return this.simplifyTitle;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
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

    @Nullable
    public final List<HealthReviewPlan> getUserReviewPlanList() {
        return this.userReviewPlanList;
    }

    public int hashCode() {
        int iHashCode = this.ssoid.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.docId.hashCode()) * 31) + Integer.hashCode(this.fileSource)) * 31;
        String str2 = this.type;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.archiveType)) * 31;
        String str3 = this.owner;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.age;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institute;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.structData;
        int iHashCode8 = (((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.uploadTimestamp)) * 31) + Integer.hashCode(this.tag)) * 31;
        String str8 = this.originalTitle;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.simplifyTitle;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.imgUrl;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<HealthArchiveFile> list = this.clientFileList;
        int iHashCode12 = (((iHashCode11 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.abnormalNumber)) * 31;
        List<IndicatorStat> list2 = this.indicatorDetailList;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HealthReviewPlan> list3 = this.userReviewPlanList;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str11 = this.analysis;
        int iHashCode15 = (((iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str12 = this.suggestion;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.guessQuestions;
        return iHashCode16 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setAbnormalNumber(int i) {
        this.abnormalNumber = i;
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

    public final void setArchiveType(int i) {
        this.archiveType = i;
    }

    public final void setClientFileList(@Nullable List<HealthArchiveFile> list) {
        this.clientFileList = list;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDocId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docId = str;
    }

    public final void setFileSource(int i) {
        this.fileSource = i;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setIndicatorDetailList(@Nullable List<IndicatorStat> list) {
        this.indicatorDetailList = list;
    }

    public final void setInstitute(@Nullable String str) {
        this.institute = str;
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

    public final void setSex(@Nullable String str) {
        this.sex = str;
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

    public final void setUserReviewPlanList(@Nullable List<HealthReviewPlan> list) {
        this.userReviewPlanList = list;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "HealthArchiveRecord(ssoid='" + this.ssoid + "', name='" + this.name + "', docId='" + this.docId + "', fileSource='" + this.fileSource + "', type='" + this.type + "', archiveType='" + this.archiveType + "', owner='" + this.owner + "', age='" + this.age + "', sex='" + this.sex + "', institute='" + this.institute + "', structData='" + this.structData + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "',uploadTimestamp='" + this.uploadTimestamp + "' tag='" + this.tag + "', imgUrl='" + this.imgUrl + "',abnormalNumber='" + this.abnormalNumber + "', analysis='" + this.analysis + "', analysisTimestamp='" + this.analysisTimestamp + "', suggestion='" + this.suggestion + "', guessQuestions='" + this.guessQuestions + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.name);
        parcel.writeString(this.docId);
        parcel.writeInt(this.fileSource);
        parcel.writeString(this.type);
        parcel.writeInt(this.archiveType);
        parcel.writeString(this.owner);
        parcel.writeString(this.age);
        parcel.writeString(this.sex);
        parcel.writeString(this.institute);
        parcel.writeString(this.structData);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.uploadTimestamp);
        parcel.writeInt(this.tag);
        parcel.writeString(this.originalTitle);
        parcel.writeString(this.simplifyTitle);
        parcel.writeString(this.imgUrl);
        List<HealthArchiveFile> list = this.clientFileList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<HealthArchiveFile> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.abnormalNumber);
        List<IndicatorStat> list2 = this.indicatorDetailList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<IndicatorStat> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        List<HealthReviewPlan> list3 = this.userReviewPlanList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<HealthReviewPlan> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.analysis);
        parcel.writeLong(this.analysisTimestamp);
        parcel.writeString(this.suggestion);
        parcel.writeString(this.guessQuestions);
    }

    public /* synthetic */ HealthArchiveRecord(String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, String str7, String str8, String str9, long j2, long j3, int i3, String str10, String str11, String str12, List list, int i4, List list2, List list3, String str13, long j4, String str14, String str15, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) == 0 ? str3 : "", (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? null : str4, (i5 & 32) != 0 ? -1 : i2, (i5 & 64) != 0 ? null : str5, (i5 & 128) != 0 ? null : str6, (i5 & 256) != 0 ? null : str7, (i5 & 512) != 0 ? null : str8, (i5 & 1024) != 0 ? null : str9, (i5 & 2048) != 0 ? 0L : j2, (i5 & 4096) != 0 ? 0L : j3, (i5 & 8192) != 0 ? 0 : i3, (i5 & 16384) != 0 ? null : str10, (i5 & 32768) != 0 ? null : str11, (i5 & 65536) != 0 ? null : str12, (i5 & 131072) != 0 ? null : list, (i5 & 262144) == 0 ? i4 : 0, (i5 & 524288) != 0 ? null : list2, (i5 & 1048576) != 0 ? null : list3, (i5 & 2097152) != 0 ? null : str13, (i5 & 4194304) == 0 ? j4 : 0L, (i5 & 8388608) != 0 ? null : str14, (i5 & 16777216) != 0 ? null : str15);
    }

    public HealthArchiveRecord(@NotNull String ssoid, @Nullable String str, @NotNull String docId, int i, @Nullable String str2, int i2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, long j2, long j3, int i3, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable List<HealthArchiveFile> list, int i4, @Nullable List<IndicatorStat> list2, @Nullable List<HealthReviewPlan> list3, @Nullable String str11, long j4, @Nullable String str12, @Nullable String str13) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(docId, "docId");
        this.ssoid = ssoid;
        this.name = str;
        this.docId = docId;
        this.fileSource = i;
        this.type = str2;
        this.archiveType = i2;
        this.owner = str3;
        this.age = str4;
        this.sex = str5;
        this.institute = str6;
        this.structData = str7;
        this.dataCreatedTimestamp = j2;
        this.uploadTimestamp = j3;
        this.tag = i3;
        this.originalTitle = str8;
        this.simplifyTitle = str9;
        this.imgUrl = str10;
        this.clientFileList = list;
        this.abnormalNumber = i4;
        this.indicatorDetailList = list2;
        this.userReviewPlanList = list3;
        this.analysis = str11;
        this.analysisTimestamp = j4;
        this.suggestion = str12;
        this.guessQuestions = str13;
    }
}
