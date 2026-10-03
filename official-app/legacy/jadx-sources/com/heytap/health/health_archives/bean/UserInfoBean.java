package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B[\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J]\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001c¨\u0006-"}, d2 = {"Lcom/heytap/health/health_archives/bean/UserInfoBean;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "basicInfo", UserInfoBean.ALLERGY_HISTORY, UserInfoBean.FAMILY_HISTORY, UserInfoBean.MEDICATION_HISTORY, UserInfoBean.PAST_MEDICAL_HISTORY, "surgicalHistory", "diagnosisResult", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getBasicInfo", "()Ljava/lang/String;", "setBasicInfo", "(Ljava/lang/String;)V", "getAllergyHistory", "setAllergyHistory", "getFamilyHistory", "setFamilyHistory", "getMedicationHistory", "setMedicationHistory", "getPastMedicalHistory", "setPastMedicalHistory", "getSurgicalHistory", "setSurgicalHistory", "getDiagnosisResult", "setDiagnosisResult", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UserInfoBean {

    @NotNull
    public static final String ALLERGY_HISTORY = "allergyHistory";

    @NotNull
    public static final String FAMILY_HISTORY = "familyHistory";

    @NotNull
    public static final String MEDICATION_HISTORY = "medicationHistory";

    @NotNull
    public static final String PAST_MEDICAL_HISTORY = "pastMedicalHistory";

    @Nullable
    private String allergyHistory;

    @Nullable
    private String basicInfo;

    @Nullable
    private String diagnosisResult;

    @Nullable
    private String familyHistory;

    @Nullable
    private String medicationHistory;

    @Nullable
    private String pastMedicalHistory;

    @Nullable
    private String surgicalHistory;

    public UserInfoBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ UserInfoBean copy$default(UserInfoBean userInfoBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfoBean.basicInfo;
        }
        if ((i & 2) != 0) {
            str2 = userInfoBean.allergyHistory;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = userInfoBean.familyHistory;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = userInfoBean.medicationHistory;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = userInfoBean.pastMedicalHistory;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = userInfoBean.surgicalHistory;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = userInfoBean.diagnosisResult;
        }
        return userInfoBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBasicInfo() {
        return this.basicInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAllergyHistory() {
        return this.allergyHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFamilyHistory() {
        return this.familyHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMedicationHistory() {
        return this.medicationHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPastMedicalHistory() {
        return this.pastMedicalHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSurgicalHistory() {
        return this.surgicalHistory;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDiagnosisResult() {
        return this.diagnosisResult;
    }

    @NotNull
    public final UserInfoBean copy(@Nullable String basicInfo, @Nullable String allergyHistory, @Nullable String familyHistory, @Nullable String medicationHistory, @Nullable String pastMedicalHistory, @Nullable String surgicalHistory, @Nullable String diagnosisResult) {
        return new UserInfoBean(basicInfo, allergyHistory, familyHistory, medicationHistory, pastMedicalHistory, surgicalHistory, diagnosisResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoBean)) {
            return false;
        }
        UserInfoBean userInfoBean = (UserInfoBean) other;
        return Intrinsics.areEqual(this.basicInfo, userInfoBean.basicInfo) && Intrinsics.areEqual(this.allergyHistory, userInfoBean.allergyHistory) && Intrinsics.areEqual(this.familyHistory, userInfoBean.familyHistory) && Intrinsics.areEqual(this.medicationHistory, userInfoBean.medicationHistory) && Intrinsics.areEqual(this.pastMedicalHistory, userInfoBean.pastMedicalHistory) && Intrinsics.areEqual(this.surgicalHistory, userInfoBean.surgicalHistory) && Intrinsics.areEqual(this.diagnosisResult, userInfoBean.diagnosisResult);
    }

    @Nullable
    public final String getAllergyHistory() {
        return this.allergyHistory;
    }

    @Nullable
    public final String getBasicInfo() {
        return this.basicInfo;
    }

    @Nullable
    public final String getDiagnosisResult() {
        return this.diagnosisResult;
    }

    @Nullable
    public final String getFamilyHistory() {
        return this.familyHistory;
    }

    @Nullable
    public final String getMedicationHistory() {
        return this.medicationHistory;
    }

    @Nullable
    public final String getPastMedicalHistory() {
        return this.pastMedicalHistory;
    }

    @Nullable
    public final String getSurgicalHistory() {
        return this.surgicalHistory;
    }

    public int hashCode() {
        String str = this.basicInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.allergyHistory;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.familyHistory;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.medicationHistory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pastMedicalHistory;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.surgicalHistory;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.diagnosisResult;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAllergyHistory(@Nullable String str) {
        this.allergyHistory = str;
    }

    public final void setBasicInfo(@Nullable String str) {
        this.basicInfo = str;
    }

    public final void setDiagnosisResult(@Nullable String str) {
        this.diagnosisResult = str;
    }

    public final void setFamilyHistory(@Nullable String str) {
        this.familyHistory = str;
    }

    public final void setMedicationHistory(@Nullable String str) {
        this.medicationHistory = str;
    }

    public final void setPastMedicalHistory(@Nullable String str) {
        this.pastMedicalHistory = str;
    }

    public final void setSurgicalHistory(@Nullable String str) {
        this.surgicalHistory = str;
    }

    @NotNull
    public String toString() {
        return "UserInfoBean(basicInfo=" + this.basicInfo + ", allergyHistory=" + this.allergyHistory + ", familyHistory=" + this.familyHistory + ", medicationHistory=" + this.medicationHistory + ", pastMedicalHistory=" + this.pastMedicalHistory + ", surgicalHistory=" + this.surgicalHistory + ", diagnosisResult=" + this.diagnosisResult + ")";
    }

    public UserInfoBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.basicInfo = str;
        this.allergyHistory = str2;
        this.familyHistory = str3;
        this.medicationHistory = str4;
        this.pastMedicalHistory = str5;
        this.surgicalHistory = str6;
        this.diagnosisResult = str7;
    }

    public /* synthetic */ UserInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
