package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lcom/heytap/health/cardiovascular/model/UserBodyInfo;", "", ServiceNodeBundleKeys.DEVICE_NAME, "", "sex", "", "weight", "", Fields.HEIGHT_FIELD, DBHealthArchiveRecord.AGE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)V", "getAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeviceName", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSex", "getWeight", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/model/UserBodyInfo;", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserBodyInfo {
    public static final int $stable = 0;

    @Nullable
    private final Integer age;

    @Nullable
    private final String deviceName;

    @Nullable
    private final Float height;

    @Nullable
    private final Integer sex;

    @Nullable
    private final Float weight;

    public UserBodyInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ UserBodyInfo copy$default(UserBodyInfo userBodyInfo, String str, Integer num, Float f, Float f2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userBodyInfo.deviceName;
        }
        if ((i & 2) != 0) {
            num = userBodyInfo.sex;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            f = userBodyInfo.weight;
        }
        Float f3 = f;
        if ((i & 8) != 0) {
            f2 = userBodyInfo.height;
        }
        Float f4 = f2;
        if ((i & 16) != 0) {
            num2 = userBodyInfo.age;
        }
        return userBodyInfo.copy(str, num3, f3, f4, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSex() {
        return this.sex;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAge() {
        return this.age;
    }

    @NotNull
    public final UserBodyInfo copy(@Nullable String deviceName, @Nullable Integer sex, @Nullable Float weight, @Nullable Float height, @Nullable Integer age) {
        return new UserBodyInfo(deviceName, sex, weight, height, age);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBodyInfo)) {
            return false;
        }
        UserBodyInfo userBodyInfo = (UserBodyInfo) other;
        return Intrinsics.areEqual(this.deviceName, userBodyInfo.deviceName) && Intrinsics.areEqual(this.sex, userBodyInfo.sex) && Intrinsics.areEqual((Object) this.weight, (Object) userBodyInfo.weight) && Intrinsics.areEqual((Object) this.height, (Object) userBodyInfo.height) && Intrinsics.areEqual(this.age, userBodyInfo.age);
    }

    @Nullable
    public final Integer getAge() {
        return this.age;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final Float getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getSex() {
        return this.sex;
    }

    @Nullable
    public final Float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.deviceName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.weight;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num2 = this.age;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserBodyInfo(deviceName=" + this.deviceName + ", sex=" + this.sex + ", weight=" + this.weight + ", height=" + this.height + ", age=" + this.age + ")";
    }

    public UserBodyInfo(@Nullable String str, @Nullable Integer num, @Nullable Float f, @Nullable Float f2, @Nullable Integer num2) {
        this.deviceName = str;
        this.sex = num;
        this.weight = f;
        this.height = f2;
        this.age = num2;
    }

    public /* synthetic */ UserBodyInfo(String str, Integer num, Float f, Float f2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : num2);
    }
}
