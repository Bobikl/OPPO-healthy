package com.heytap.health.settings.watch.sporthealthsettings.utils.research;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000eHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/ProjectUserInfo;", "", "birthday", "", Fields.HEIGHT_FIELD, "nickName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "sex", "ssoid", "updateTimeMillis", "", "userName", "weight", "bloodPressureType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V", "getBirthday", "()Ljava/lang/String;", "getBloodPressureType", "()I", "getHeight", "getNickName", "getPhoneNumber", "getSex", "getSsoid", "getUpdateTimeMillis", "()J", "getUserName", "getWeight", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProjectUserInfo {
    public static final int $stable = 0;

    @NotNull
    private final String birthday;
    private final int bloodPressureType;

    @NotNull
    private final String height;

    @NotNull
    private final String nickName;

    @NotNull
    private final String phoneNumber;

    @NotNull
    private final String sex;

    @NotNull
    private final String ssoid;
    private final long updateTimeMillis;

    @NotNull
    private final String userName;

    @NotNull
    private final String weight;

    public ProjectUserInfo(@NotNull String birthday, @NotNull String height, @NotNull String nickName, @NotNull String phoneNumber, @NotNull String sex, @NotNull String ssoid, long j2, @NotNull String userName, @NotNull String weight, int i) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.birthday = birthday;
        this.height = height;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.ssoid = ssoid;
        this.updateTimeMillis = j2;
        this.userName = userName;
        this.weight = weight;
        this.bloodPressureType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBloodPressureType() {
        return this.bloodPressureType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUpdateTimeMillis() {
        return this.updateTimeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    public final ProjectUserInfo copy(@NotNull String birthday, @NotNull String height, @NotNull String nickName, @NotNull String phoneNumber, @NotNull String sex, @NotNull String ssoid, long updateTimeMillis, @NotNull String userName, @NotNull String weight, int bloodPressureType) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new ProjectUserInfo(birthday, height, nickName, phoneNumber, sex, ssoid, updateTimeMillis, userName, weight, bloodPressureType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectUserInfo)) {
            return false;
        }
        ProjectUserInfo projectUserInfo = (ProjectUserInfo) other;
        return Intrinsics.areEqual(this.birthday, projectUserInfo.birthday) && Intrinsics.areEqual(this.height, projectUserInfo.height) && Intrinsics.areEqual(this.nickName, projectUserInfo.nickName) && Intrinsics.areEqual(this.phoneNumber, projectUserInfo.phoneNumber) && Intrinsics.areEqual(this.sex, projectUserInfo.sex) && Intrinsics.areEqual(this.ssoid, projectUserInfo.ssoid) && this.updateTimeMillis == projectUserInfo.updateTimeMillis && Intrinsics.areEqual(this.userName, projectUserInfo.userName) && Intrinsics.areEqual(this.weight, projectUserInfo.weight) && this.bloodPressureType == projectUserInfo.bloodPressureType;
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getBloodPressureType() {
        return this.bloodPressureType;
    }

    @NotNull
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public final long getUpdateTimeMillis() {
        return this.updateTimeMillis;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((((this.birthday.hashCode() * 31) + this.height.hashCode()) * 31) + this.nickName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.sex.hashCode()) * 31) + this.ssoid.hashCode()) * 31) + Long.hashCode(this.updateTimeMillis)) * 31) + this.userName.hashCode()) * 31) + this.weight.hashCode()) * 31) + Integer.hashCode(this.bloodPressureType);
    }

    @NotNull
    public String toString() {
        return "ProjectUserInfo(birthday=" + this.birthday + ", height=" + this.height + ", nickName=" + this.nickName + ", phoneNumber=" + this.phoneNumber + ", sex=" + this.sex + ", ssoid=" + this.ssoid + ", updateTimeMillis=" + this.updateTimeMillis + ", userName=" + this.userName + ", weight=" + this.weight + ", bloodPressureType=" + this.bloodPressureType + ")";
    }
}
