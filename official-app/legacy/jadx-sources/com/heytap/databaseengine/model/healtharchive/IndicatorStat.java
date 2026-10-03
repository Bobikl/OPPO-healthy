package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.IndicatorStatExtends;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorStat;
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

/* JADX INFO: renamed from: com.heytap.databaseengine.model.healtharchive.HealthIndicatorStat, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\t\u0010O\u001a\u00020\u0004HÂ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120\nHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010S\u001a\u00020\u0015HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010W\u001a\u00020\u0015HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u0010Y\u001a\u00020\u001dHÆ\u0003J\t\u0010Z\u001a\u00020\u0004HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010`\u001a\u00020\u000eHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jç\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\t\u0010c\u001a\u00020\u000eHÖ\u0001J\u0013\u0010d\u001a\u00020\u001d2\b\u0010e\u001a\u0004\u0018\u00010fHÖ\u0003J\b\u0010g\u001a\u00020\u0004H\u0016J\t\u0010h\u001a\u00020\u000eHÖ\u0001J\b\u0010i\u001a\u00020\u0004H\u0016J\u0019\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u000eHÖ\u0001R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&¨\u0006o"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthIndicatorStat;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "indicatorName", "category", "type", "bodySystem", "trendList", "", "Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrend;", "owner", "state", "", "uniformValueType", "tag", "trendTag", "Lcom/heytap/databaseengine/model/healtharchive/IndicatorTrendTag;", "analysis", "analysisTimestamp", "", "suggestion", "guessQuestions", "explain", "updateTime", "dataExtends", "Lcom/heytap/databaseengine/model/IndicatorStatExtends;", "needBroadcast", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;ILjava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/heytap/databaseengine/model/IndicatorStatExtends;Z)V", "getAnalysis", "()Ljava/lang/String;", "setAnalysis", "(Ljava/lang/String;)V", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getBodySystem", "setBodySystem", "getCategory", "setCategory", "getDataExtends", "()Lcom/heytap/databaseengine/model/IndicatorStatExtends;", "setDataExtends", "(Lcom/heytap/databaseengine/model/IndicatorStatExtends;)V", "getExplain", "setExplain", "getGuessQuestions", "setGuessQuestions", "getIndicatorName", "setIndicatorName", "getNeedBroadcast", "()Z", "setNeedBroadcast", "(Z)V", "getOwner", "setOwner", "getState", "()I", "setState", "(I)V", "getSuggestion", "setSuggestion", "getTag", "setTag", "getTrendList", "()Ljava/util/List;", "setTrendList", "(Ljava/util/List;)V", "getTrendTag", "setTrendTag", "getType", "setType", "getUniformValueType", "setUniformValueType", "getUpdateTime", "setUpdateTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "getSsoid", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class IndicatorStat extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorStat> CREATOR = new a();

    @Nullable
    private String analysis;
    private long analysisTimestamp;

    @SerializedName("body_system")
    @Nullable
    private String bodySystem;

    @Nullable
    private String category;

    @Nullable
    private IndicatorStatExtends dataExtends;

    @Nullable
    private String explain;

    @Nullable
    private String guessQuestions;

    @NotNull
    private String indicatorName;
    private boolean needBroadcast;

    @Nullable
    private String owner;

    @NotNull
    private String ssoid;
    private int state;

    @Nullable
    private String suggestion;
    private int tag;

    @SerializedName(DBHealthIndicatorStat.TREND_LIST)
    @NotNull
    private List<IndicatorTrend> trendList;

    @NotNull
    private List<IndicatorTrendTag> trendTag;

    @Nullable
    private String type;

    @SerializedName("uniform_value_type")
    @Nullable
    private String uniformValueType;
    private long updateTime;

    /* JADX INFO: renamed from: com.heytap.databaseengine.model.healtharchive.HealthIndicatorStat$a */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IndicatorStat> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndicatorStat createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IndicatorTrend.CREATOR.createFromParcel(parcel));
            }
            String string6 = parcel.readString();
            int i3 = parcel.readInt();
            String string7 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList2.add(IndicatorTrendTag.CREATOR.createFromParcel(parcel));
            }
            return new IndicatorStat(string, string2, string3, string4, string5, arrayList, string6, i3, string7, i4, arrayList2, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : IndicatorStatExtends.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IndicatorStat[] newArray(int i) {
            return new IndicatorStat[i];
        }
    }

    public IndicatorStat() {
        this(null, null, null, null, null, null, null, 0, null, 0, null, null, 0L, null, null, null, 0L, null, false, 524287, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final List<IndicatorTrendTag> component11() {
        return this.trendTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSuggestion() {
        return this.suggestion;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final IndicatorStatExtends getDataExtends() {
        return this.dataExtends;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getNeedBroadcast() {
        return this.needBroadcast;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBodySystem() {
        return this.bodySystem;
    }

    @NotNull
    public final List<IndicatorTrend> component6() {
        return this.trendList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUniformValueType() {
        return this.uniformValueType;
    }

    @NotNull
    public final IndicatorStat copy(@NotNull String ssoid, @NotNull String indicatorName, @Nullable String category, @Nullable String type, @Nullable String bodySystem, @NotNull List<IndicatorTrend> trendList, @Nullable String owner, int state, @Nullable String uniformValueType, int tag, @NotNull List<IndicatorTrendTag> trendTag, @Nullable String analysis, long analysisTimestamp, @Nullable String suggestion, @Nullable String guessQuestions, @Nullable String explain, long updateTime, @Nullable IndicatorStatExtends dataExtends, boolean needBroadcast) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        Intrinsics.checkNotNullParameter(trendTag, "trendTag");
        return new IndicatorStat(ssoid, indicatorName, category, type, bodySystem, trendList, owner, state, uniformValueType, tag, trendTag, analysis, analysisTimestamp, suggestion, guessQuestions, explain, updateTime, dataExtends, needBroadcast);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorStat)) {
            return false;
        }
        IndicatorStat indicatorStat = (IndicatorStat) other;
        return Intrinsics.areEqual(this.ssoid, indicatorStat.ssoid) && Intrinsics.areEqual(this.indicatorName, indicatorStat.indicatorName) && Intrinsics.areEqual(this.category, indicatorStat.category) && Intrinsics.areEqual(this.type, indicatorStat.type) && Intrinsics.areEqual(this.bodySystem, indicatorStat.bodySystem) && Intrinsics.areEqual(this.trendList, indicatorStat.trendList) && Intrinsics.areEqual(this.owner, indicatorStat.owner) && this.state == indicatorStat.state && Intrinsics.areEqual(this.uniformValueType, indicatorStat.uniformValueType) && this.tag == indicatorStat.tag && Intrinsics.areEqual(this.trendTag, indicatorStat.trendTag) && Intrinsics.areEqual(this.analysis, indicatorStat.analysis) && this.analysisTimestamp == indicatorStat.analysisTimestamp && Intrinsics.areEqual(this.suggestion, indicatorStat.suggestion) && Intrinsics.areEqual(this.guessQuestions, indicatorStat.guessQuestions) && Intrinsics.areEqual(this.explain, indicatorStat.explain) && this.updateTime == indicatorStat.updateTime && Intrinsics.areEqual(this.dataExtends, indicatorStat.dataExtends) && this.needBroadcast == indicatorStat.needBroadcast;
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
    public final IndicatorStatExtends getDataExtends() {
        return this.dataExtends;
    }

    @Nullable
    public final String getExplain() {
        return this.explain;
    }

    @Nullable
    public final String getGuessQuestions() {
        return this.guessQuestions;
    }

    @NotNull
    public final String getIndicatorName() {
        return this.indicatorName;
    }

    public final boolean getNeedBroadcast() {
        return this.needBroadcast;
    }

    @Nullable
    public final String getOwner() {
        return this.owner;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
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
    public final List<IndicatorTrend> getTrendList() {
        return this.trendList;
    }

    @NotNull
    public final List<IndicatorTrendTag> getTrendTag() {
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

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.indicatorName.hashCode()) * 31;
        String str = this.category;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodySystem;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.trendList.hashCode()) * 31;
        String str4 = this.owner;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.state)) * 31;
        String str5 = this.uniformValueType;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.tag)) * 31) + this.trendTag.hashCode()) * 31;
        String str6 = this.analysis;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str7 = this.suggestion;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.guessQuestions;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.explain;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + Long.hashCode(this.updateTime)) * 31;
        IndicatorStatExtends indicatorStatExtends = this.dataExtends;
        int iHashCode11 = (iHashCode10 + (indicatorStatExtends != null ? indicatorStatExtends.hashCode() : 0)) * 31;
        boolean z = this.needBroadcast;
        ?? r5 = z;
        if (z) {
            r5 = 1;
        }
        return iHashCode11 + r5;
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

    public final void setDataExtends(@Nullable IndicatorStatExtends indicatorStatExtends) {
        this.dataExtends = indicatorStatExtends;
    }

    public final void setExplain(@Nullable String str) {
        this.explain = str;
    }

    public final void setGuessQuestions(@Nullable String str) {
        this.guessQuestions = str;
    }

    public final void setIndicatorName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.indicatorName = str;
    }

    public final void setNeedBroadcast(boolean z) {
        this.needBroadcast = z;
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

    public final void setTrendList(@NotNull List<IndicatorTrend> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.trendList = list;
    }

    public final void setTrendTag(@NotNull List<IndicatorTrendTag> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.trendTag = list;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUniformValueType(@Nullable String str) {
        this.uniformValueType = str;
    }

    public final void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "IndicatorStat(ssoid='" + this.ssoid + "', indicatorName='" + this.indicatorName + "', category='" + this.category + "', type='" + this.type + "', bodySystem='" + this.bodySystem + "', trendList='" + this.trendList + "', state='" + this.state + "', tag='" + this.tag + "', analysis='" + this.analysis + "', analysisTimestamp='" + this.analysisTimestamp + "', suggestion='" + this.suggestion + "', guessQuestions='" + this.guessQuestions + "', explain='" + this.explain + "', updateTime='" + this.updateTime + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.indicatorName);
        parcel.writeString(this.category);
        parcel.writeString(this.type);
        parcel.writeString(this.bodySystem);
        List<IndicatorTrend> list = this.trendList;
        parcel.writeInt(list.size());
        Iterator<IndicatorTrend> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.owner);
        parcel.writeInt(this.state);
        parcel.writeString(this.uniformValueType);
        parcel.writeInt(this.tag);
        List<IndicatorTrendTag> list2 = this.trendTag;
        parcel.writeInt(list2.size());
        Iterator<IndicatorTrendTag> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analysis);
        parcel.writeLong(this.analysisTimestamp);
        parcel.writeString(this.suggestion);
        parcel.writeString(this.guessQuestions);
        parcel.writeString(this.explain);
        parcel.writeLong(this.updateTime);
        IndicatorStatExtends indicatorStatExtends = this.dataExtends;
        if (indicatorStatExtends == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            indicatorStatExtends.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.needBroadcast ? 1 : 0);
    }

    public /* synthetic */ IndicatorStat(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, String str7, int i2, List list2, String str8, long j2, String str9, String str10, String str11, long j3, IndicatorStatExtends indicatorStatExtends, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? new ArrayList() : list, (i3 & 64) != 0 ? null : str6, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? null : str7, (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) != 0 ? new ArrayList() : list2, (i3 & 2048) != 0 ? null : str8, (i3 & 4096) != 0 ? 0L : j2, (i3 & 8192) != 0 ? null : str9, (i3 & 16384) != 0 ? null : str10, (i3 & 32768) != 0 ? null : str11, (i3 & 65536) == 0 ? j3 : 0L, (i3 & 131072) != 0 ? null : indicatorStatExtends, (i3 & 262144) != 0 ? true : z);
    }

    public IndicatorStat(@NotNull String ssoid, @NotNull String indicatorName, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull List<IndicatorTrend> trendList, @Nullable String str4, int i, @Nullable String str5, int i2, @NotNull List<IndicatorTrendTag> trendTag, @Nullable String str6, long j2, @Nullable String str7, @Nullable String str8, @Nullable String str9, long j3, @Nullable IndicatorStatExtends indicatorStatExtends, boolean z) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        Intrinsics.checkNotNullParameter(trendList, "trendList");
        Intrinsics.checkNotNullParameter(trendTag, "trendTag");
        this.ssoid = ssoid;
        this.indicatorName = indicatorName;
        this.category = str;
        this.type = str2;
        this.bodySystem = str3;
        this.trendList = trendList;
        this.owner = str4;
        this.state = i;
        this.uniformValueType = str5;
        this.tag = i2;
        this.trendTag = trendTag;
        this.analysis = str6;
        this.analysisTimestamp = j2;
        this.suggestion = str7;
        this.guessQuestions = str8;
        this.explain = str9;
        this.updateTime = j3;
        this.dataExtends = indicatorStatExtends;
        this.needBroadcast = z;
    }
}
