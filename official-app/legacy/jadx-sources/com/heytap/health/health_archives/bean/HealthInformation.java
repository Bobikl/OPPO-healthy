package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthInformation;", "", "name", "", "sex", "birthday", Fields.HEIGHT_FIELD, "weight", "bloodType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getBloodType", "setBloodType", "getHeight", "setHeight", "getName", "setName", "getSex", "setSex", "getWeight", "setWeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthInformation {

    @Nullable
    private String birthday;

    @Nullable
    private String bloodType;

    @Nullable
    private String height;

    @Nullable
    private String name;

    @Nullable
    private String sex;

    @Nullable
    private String weight;

    public HealthInformation() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ HealthInformation copy$default(HealthInformation healthInformation, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthInformation.name;
        }
        if ((i & 2) != 0) {
            str2 = healthInformation.sex;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = healthInformation.birthday;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = healthInformation.height;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = healthInformation.weight;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = healthInformation.bloodType;
        }
        return healthInformation.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBloodType() {
        return this.bloodType;
    }

    @NotNull
    public final HealthInformation copy(@Nullable String name, @Nullable String sex, @Nullable String birthday, @Nullable String height, @Nullable String weight, @Nullable String bloodType) {
        return new HealthInformation(name, sex, birthday, height, weight, bloodType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthInformation)) {
            return false;
        }
        HealthInformation healthInformation = (HealthInformation) other;
        return Intrinsics.areEqual(this.name, healthInformation.name) && Intrinsics.areEqual(this.sex, healthInformation.sex) && Intrinsics.areEqual(this.birthday, healthInformation.birthday) && Intrinsics.areEqual(this.height, healthInformation.height) && Intrinsics.areEqual(this.weight, healthInformation.weight) && Intrinsics.areEqual(this.bloodType, healthInformation.bloodType);
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    @Nullable
    public final String getBloodType() {
        return this.bloodType;
    }

    @Nullable
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sex;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthday;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.height;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.weight;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bloodType;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setBloodType(@Nullable String str) {
        this.bloodType = str;
    }

    public final void setHeight(@Nullable String str) {
        this.height = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setWeight(@Nullable String str) {
        this.weight = str;
    }

    @NotNull
    public String toString() {
        return "HealthInformation(name=" + this.name + ", sex=" + this.sex + ", birthday=" + this.birthday + ", height=" + this.height + ", weight=" + this.weight + ", bloodType=" + this.bloodType + ")";
    }

    public HealthInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.name = str;
        this.sex = str2;
        this.birthday = str3;
        this.height = str4;
        this.weight = str5;
        this.bloodType = str6;
    }

    public /* synthetic */ HealthInformation(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
