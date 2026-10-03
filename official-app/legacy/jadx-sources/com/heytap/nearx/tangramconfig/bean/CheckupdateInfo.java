package com.heytap.nearx.tangramconfig.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\bB-\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\nB%\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\rB?\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006$"}, d2 = {"Lcom/heytap/nearx/tangramconfig/bean/CheckupdateInfo;", "", "progress", "", "(I)V", "reqlist", "", "", "(Ljava/util/List;I)V", "resplist", "(Ljava/util/List;Ljava/util/List;I)V", "productVersion", Fields.PRODUCT_ID, "(ILjava/lang/String;I)V", "reqUpdateList", "respUpdateList", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getProductId", "()Ljava/lang/String;", "getProductVersion", "()I", "getProgress", "getReqUpdateList", "()Ljava/util/List;", "getRespUpdateList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CheckupdateInfo {

    @NotNull
    private final String productId;
    private final int productVersion;
    private final int progress;

    @NotNull
    private final List<String> reqUpdateList;

    @NotNull
    private final List<String> respUpdateList;

    public CheckupdateInfo(int i, @NotNull String productId, @NotNull List<String> reqUpdateList, @NotNull List<String> respUpdateList, int i2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(reqUpdateList, "reqUpdateList");
        Intrinsics.checkNotNullParameter(respUpdateList, "respUpdateList");
        this.productVersion = i;
        this.productId = productId;
        this.reqUpdateList = reqUpdateList;
        this.respUpdateList = respUpdateList;
        this.progress = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckupdateInfo copy$default(CheckupdateInfo checkupdateInfo, int i, String str, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkupdateInfo.productVersion;
        }
        if ((i3 & 2) != 0) {
            str = checkupdateInfo.productId;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            list = checkupdateInfo.reqUpdateList;
        }
        List list3 = list;
        if ((i3 & 8) != 0) {
            list2 = checkupdateInfo.respUpdateList;
        }
        List list4 = list2;
        if ((i3 & 16) != 0) {
            i2 = checkupdateInfo.progress;
        }
        return checkupdateInfo.copy(i, str2, list3, list4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProductVersion() {
        return this.productVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final List<String> component3() {
        return this.reqUpdateList;
    }

    @NotNull
    public final List<String> component4() {
        return this.respUpdateList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final CheckupdateInfo copy(int productVersion, @NotNull String productId, @NotNull List<String> reqUpdateList, @NotNull List<String> respUpdateList, int progress) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(reqUpdateList, "reqUpdateList");
        Intrinsics.checkNotNullParameter(respUpdateList, "respUpdateList");
        return new CheckupdateInfo(productVersion, productId, reqUpdateList, respUpdateList, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckupdateInfo)) {
            return false;
        }
        CheckupdateInfo checkupdateInfo = (CheckupdateInfo) other;
        return this.productVersion == checkupdateInfo.productVersion && Intrinsics.areEqual(this.productId, checkupdateInfo.productId) && Intrinsics.areEqual(this.reqUpdateList, checkupdateInfo.reqUpdateList) && Intrinsics.areEqual(this.respUpdateList, checkupdateInfo.respUpdateList) && this.progress == checkupdateInfo.progress;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int getProductVersion() {
        return this.productVersion;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final List<String> getReqUpdateList() {
        return this.reqUpdateList;
    }

    @NotNull
    public final List<String> getRespUpdateList() {
        return this.respUpdateList;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.productVersion) * 31) + this.productId.hashCode()) * 31) + this.reqUpdateList.hashCode()) * 31) + this.respUpdateList.hashCode()) * 31) + Integer.hashCode(this.progress);
    }

    @NotNull
    public String toString() {
        return "CheckupdateInfo(productVersion=" + this.productVersion + ", productId=" + this.productId + ", reqUpdateList=" + this.reqUpdateList + ", respUpdateList=" + this.respUpdateList + ", progress=" + this.progress + ')';
    }

    public /* synthetic */ CheckupdateInfo(int i, String str, List list, List list2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (List<String>) list, (List<String>) list2, (i3 & 16) != 0 ? 0 : i2);
    }

    public /* synthetic */ CheckupdateInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public CheckupdateInfo(int i) {
        this(0, "", new ArrayList(), new ArrayList(), i);
    }

    public /* synthetic */ CheckupdateInfo(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckupdateInfo(@NotNull List<String> reqlist, int i) {
        this(0, "", reqlist, new ArrayList(), i);
        Intrinsics.checkNotNullParameter(reqlist, "reqlist");
    }

    public /* synthetic */ CheckupdateInfo(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<String>) list, (List<String>) list2, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckupdateInfo(@NotNull List<String> reqlist, @NotNull List<String> resplist, int i) {
        this(0, "", reqlist, resplist, i);
        Intrinsics.checkNotNullParameter(reqlist, "reqlist");
        Intrinsics.checkNotNullParameter(resplist, "resplist");
    }

    public /* synthetic */ CheckupdateInfo(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckupdateInfo(int i, @NotNull String productId, int i2) {
        this(i, productId, new ArrayList(), new ArrayList(), i2);
        Intrinsics.checkNotNullParameter(productId, "productId");
    }
}
