package com.heytap.databaseengine.model.healtharchive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\b\u0010+\u001a\u00020\u0004H\u0016J\t\u0010,\u001a\u00020&HÖ\u0001J\b\u0010-\u001a\u00020\u0004H\u0016J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020&HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthDiseaseRisk;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "ssoid", "", "diseaseType", "riskRank", "aiSuggestions", "references", "dataCreatedTimestamp", "", "modifiedTimestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getAiSuggestions", "()Ljava/lang/String;", "setAiSuggestions", "(Ljava/lang/String;)V", "getDataCreatedTimestamp", "()J", "setDataCreatedTimestamp", "(J)V", "getDiseaseType", "setDiseaseType", "getModifiedTimestamp", "setModifiedTimestamp", "getReferences", "setReferences", "getRiskRank", "setRiskRank", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "getSsoid", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthDiseaseRisk extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthDiseaseRisk> CREATOR = new a();

    @Nullable
    private String aiSuggestions;
    private long dataCreatedTimestamp;

    @NotNull
    private String diseaseType;
    private long modifiedTimestamp;

    @Nullable
    private String references;

    @NotNull
    private String riskRank;

    @NotNull
    private String ssoid;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HealthDiseaseRisk> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthDiseaseRisk createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthDiseaseRisk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HealthDiseaseRisk[] newArray(int i) {
            return new HealthDiseaseRisk[i];
        }
    }

    public HealthDiseaseRisk() {
        this(null, null, null, null, null, 0L, 0L, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRiskRank() {
        return this.riskRank;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @NotNull
    public final HealthDiseaseRisk copy(@NotNull String ssoid, @NotNull String diseaseType, @NotNull String riskRank, @Nullable String aiSuggestions, @Nullable String references, long dataCreatedTimestamp, long modifiedTimestamp) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        return new HealthDiseaseRisk(ssoid, diseaseType, riskRank, aiSuggestions, references, dataCreatedTimestamp, modifiedTimestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDiseaseRisk)) {
            return false;
        }
        HealthDiseaseRisk healthDiseaseRisk = (HealthDiseaseRisk) other;
        return Intrinsics.areEqual(this.ssoid, healthDiseaseRisk.ssoid) && Intrinsics.areEqual(this.diseaseType, healthDiseaseRisk.diseaseType) && Intrinsics.areEqual(this.riskRank, healthDiseaseRisk.riskRank) && Intrinsics.areEqual(this.aiSuggestions, healthDiseaseRisk.aiSuggestions) && Intrinsics.areEqual(this.references, healthDiseaseRisk.references) && this.dataCreatedTimestamp == healthDiseaseRisk.dataCreatedTimestamp && this.modifiedTimestamp == healthDiseaseRisk.modifiedTimestamp;
    }

    @Nullable
    public final String getAiSuggestions() {
        return this.aiSuggestions;
    }

    public final long getDataCreatedTimestamp() {
        return this.dataCreatedTimestamp;
    }

    @NotNull
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final String getReferences() {
        return this.references;
    }

    @NotNull
    public final String getRiskRank() {
        return this.riskRank;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        int iHashCode = ((((this.ssoid.hashCode() * 31) + this.diseaseType.hashCode()) * 31) + this.riskRank.hashCode()) * 31;
        String str = this.aiSuggestions;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.references;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.dataCreatedTimestamp)) * 31) + Long.hashCode(this.modifiedTimestamp);
    }

    public final void setAiSuggestions(@Nullable String str) {
        this.aiSuggestions = str;
    }

    public final void setDataCreatedTimestamp(long j2) {
        this.dataCreatedTimestamp = j2;
    }

    public final void setDiseaseType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.diseaseType = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setReferences(@Nullable String str) {
        this.references = str;
    }

    public final void setRiskRank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.riskRank = str;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "HealthDiseaseRisk( ssoid='" + this.ssoid + "', diseaseType='" + this.diseaseType + "', riskRank='" + this.riskRank + "', aiSuggestions='" + this.aiSuggestions + "', references='" + this.references + "', dataCreatedTimestamp='" + this.dataCreatedTimestamp + "', modifiedTimestamp='" + this.modifiedTimestamp + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.diseaseType);
        parcel.writeString(this.riskRank);
        parcel.writeString(this.aiSuggestions);
        parcel.writeString(this.references);
        parcel.writeLong(this.dataCreatedTimestamp);
        parcel.writeLong(this.modifiedTimestamp);
    }

    public /* synthetic */ HealthDiseaseRisk(String str, String str2, String str3, String str4, String str5, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? 0L : j3);
    }

    public HealthDiseaseRisk(@NotNull String ssoid, @NotNull String diseaseType, @NotNull String riskRank, @Nullable String str, @Nullable String str2, long j2, long j3) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(diseaseType, "diseaseType");
        Intrinsics.checkNotNullParameter(riskRank, "riskRank");
        this.ssoid = ssoid;
        this.diseaseType = diseaseType;
        this.riskRank = riskRank;
        this.aiSuggestions = str;
        this.references = str2;
        this.dataCreatedTimestamp = j2;
        this.modifiedTimestamp = j3;
    }
}
