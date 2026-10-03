package com.heytap.health.watch.thirdparty.bugfix.research.api;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchUserInfo;", "", "ssoid", "", "nickName", "userName", "sex", Fields.HEIGHT_FIELD, "weight", "birthday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "getHeight", "getNickName", "getSex", "getSsoid", "getUserName", "getWeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchUserInfo {

    @NotNull
    private final String birthday;

    @NotNull
    private final String height;

    @NotNull
    private final String nickName;

    @NotNull
    private final String sex;

    @NotNull
    private final String ssoid;

    @NotNull
    private final String userName;

    @NotNull
    private final String weight;

    public ResearchUserInfo(@NotNull String ssoid, @NotNull String nickName, @NotNull String userName, @NotNull String sex, @NotNull String height, @NotNull String weight, @NotNull String birthday) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        this.ssoid = ssoid;
        this.nickName = nickName;
        this.userName = userName;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }

    public static /* synthetic */ ResearchUserInfo copy$default(ResearchUserInfo researchUserInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = researchUserInfo.ssoid;
        }
        if ((i & 2) != 0) {
            str2 = researchUserInfo.nickName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = researchUserInfo.userName;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = researchUserInfo.sex;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = researchUserInfo.height;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = researchUserInfo.weight;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = researchUserInfo.birthday;
        }
        return researchUserInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    @NotNull
    public final ResearchUserInfo copy(@NotNull String ssoid, @NotNull String nickName, @NotNull String userName, @NotNull String sex, @NotNull String height, @NotNull String weight, @NotNull String birthday) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        return new ResearchUserInfo(ssoid, nickName, userName, sex, height, weight, birthday);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchUserInfo)) {
            return false;
        }
        ResearchUserInfo researchUserInfo = (ResearchUserInfo) other;
        return Intrinsics.areEqual(this.ssoid, researchUserInfo.ssoid) && Intrinsics.areEqual(this.nickName, researchUserInfo.nickName) && Intrinsics.areEqual(this.userName, researchUserInfo.userName) && Intrinsics.areEqual(this.sex, researchUserInfo.sex) && Intrinsics.areEqual(this.height, researchUserInfo.height) && Intrinsics.areEqual(this.weight, researchUserInfo.weight) && Intrinsics.areEqual(this.birthday, researchUserInfo.birthday);
    }

    @NotNull
    public final String getBirthday() {
        return this.birthday;
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
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
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
        return (((((((((((this.ssoid.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.sex.hashCode()) * 31) + this.height.hashCode()) * 31) + this.weight.hashCode()) * 31) + this.birthday.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResearchUserInfo(ssoid=" + this.ssoid + ", nickName=" + this.nickName + ", userName=" + this.userName + ", sex=" + this.sex + ", height=" + this.height + ", weight=" + this.weight + ", birthday=" + this.birthday + ")";
    }
}
