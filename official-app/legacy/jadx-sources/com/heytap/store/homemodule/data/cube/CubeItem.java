package com.heytap.store.homemodule.data.cube;

import com.heytap.store.homemodule.data.HomeItemDetail;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/heytap/store/homemodule/data/cube/CubeItem;", "", "originWidth", "", "originHeight", "originalPosition", "", "content", "Lcom/heytap/store/homemodule/data/HomeItemDetail;", "(FFILcom/heytap/store/homemodule/data/HomeItemDetail;)V", "getContent", "()Lcom/heytap/store/homemodule/data/HomeItemDetail;", "setContent", "(Lcom/heytap/store/homemodule/data/HomeItemDetail;)V", "getOriginHeight", "()F", "setOriginHeight", "(F)V", "getOriginWidth", "setOriginWidth", "getOriginalPosition", "()I", "setOriginalPosition", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CubeItem {

    @Nullable
    private HomeItemDetail content;
    private float originHeight;
    private float originWidth;
    private int originalPosition;

    public CubeItem(float f, float f2, int i, @Nullable HomeItemDetail homeItemDetail) {
        this.originWidth = f;
        this.originHeight = f2;
        this.originalPosition = i;
        this.content = homeItemDetail;
    }

    public static /* synthetic */ CubeItem copy$default(CubeItem cubeItem, float f, float f2, int i, HomeItemDetail homeItemDetail, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = cubeItem.originWidth;
        }
        if ((i2 & 2) != 0) {
            f2 = cubeItem.originHeight;
        }
        if ((i2 & 4) != 0) {
            i = cubeItem.originalPosition;
        }
        if ((i2 & 8) != 0) {
            homeItemDetail = cubeItem.content;
        }
        return cubeItem.copy(f, f2, i, homeItemDetail);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getOriginWidth() {
        return this.originWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOriginHeight() {
        return this.originHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HomeItemDetail getContent() {
        return this.content;
    }

    @NotNull
    public final CubeItem copy(float originWidth, float originHeight, int originalPosition, @Nullable HomeItemDetail content) {
        return new CubeItem(originWidth, originHeight, originalPosition, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CubeItem)) {
            return false;
        }
        CubeItem cubeItem = (CubeItem) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.originWidth), (Object) Float.valueOf(cubeItem.originWidth)) && Intrinsics.areEqual((Object) Float.valueOf(this.originHeight), (Object) Float.valueOf(cubeItem.originHeight)) && this.originalPosition == cubeItem.originalPosition && Intrinsics.areEqual(this.content, cubeItem.content);
    }

    @Nullable
    public final HomeItemDetail getContent() {
        return this.content;
    }

    public final float getOriginHeight() {
        return this.originHeight;
    }

    public final float getOriginWidth() {
        return this.originWidth;
    }

    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    public int hashCode() {
        int iHashCode = ((((Float.hashCode(this.originWidth) * 31) + Float.hashCode(this.originHeight)) * 31) + Integer.hashCode(this.originalPosition)) * 31;
        HomeItemDetail homeItemDetail = this.content;
        return iHashCode + (homeItemDetail == null ? 0 : homeItemDetail.hashCode());
    }

    public final void setContent(@Nullable HomeItemDetail homeItemDetail) {
        this.content = homeItemDetail;
    }

    public final void setOriginHeight(float f) {
        this.originHeight = f;
    }

    public final void setOriginWidth(float f) {
        this.originWidth = f;
    }

    public final void setOriginalPosition(int i) {
        this.originalPosition = i;
    }

    @NotNull
    public String toString() {
        return "CubeItem(originWidth=" + this.originWidth + ", originHeight=" + this.originHeight + ", originalPosition=" + this.originalPosition + ", content=" + this.content + ')';
    }
}
