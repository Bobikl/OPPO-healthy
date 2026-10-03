package com.heytap.sports.recommend.ui;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/recommend/ui/UploadSelectedData;", "", "bizType", "", "userAnsList", "", "Lcom/heytap/sports/recommend/ui/UserAnswer;", "(ILjava/util/List;)V", "getBizType", "()I", "getUserAnsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UploadSelectedData {
    public static final int $stable = 8;
    private final int bizType;

    @NotNull
    private final List<UserAnswer> userAnsList;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadSelectedData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadSelectedData copy$default(UploadSelectedData uploadSelectedData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadSelectedData.bizType;
        }
        if ((i2 & 2) != 0) {
            list = uploadSelectedData.userAnsList;
        }
        return uploadSelectedData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    public final List<UserAnswer> component2() {
        return this.userAnsList;
    }

    @NotNull
    public final UploadSelectedData copy(int bizType, @NotNull List<UserAnswer> userAnsList) {
        Intrinsics.checkNotNullParameter(userAnsList, "userAnsList");
        return new UploadSelectedData(bizType, userAnsList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadSelectedData)) {
            return false;
        }
        UploadSelectedData uploadSelectedData = (UploadSelectedData) other;
        return this.bizType == uploadSelectedData.bizType && Intrinsics.areEqual(this.userAnsList, uploadSelectedData.userAnsList);
    }

    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    public final List<UserAnswer> getUserAnsList() {
        return this.userAnsList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.bizType) * 31) + this.userAnsList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadSelectedData(bizType=" + this.bizType + ", userAnsList=" + this.userAnsList + ")";
    }

    public UploadSelectedData(int i, @NotNull List<UserAnswer> userAnsList) {
        Intrinsics.checkNotNullParameter(userAnsList, "userAnsList");
        this.bizType = i;
        this.userAnsList = userAnsList;
    }

    public /* synthetic */ UploadSelectedData(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
