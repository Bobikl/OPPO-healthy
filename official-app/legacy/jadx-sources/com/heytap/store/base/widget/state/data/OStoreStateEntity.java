package com.heytap.store.base.widget.state.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JA\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006+"}, d2 = {"Lcom/heytap/store/base/widget/state/data/OStoreStateEntity;", "", "type", "", "loadData", "Lcom/heytap/store/base/widget/state/data/StateLoadBean;", "errorData", "Lcom/heytap/store/base/widget/state/data/StateErrorBean;", "emptyData", "Lcom/heytap/store/base/widget/state/data/StateEmptyBean;", "isUserCustom", "", "(ILcom/heytap/store/base/widget/state/data/StateLoadBean;Lcom/heytap/store/base/widget/state/data/StateErrorBean;Lcom/heytap/store/base/widget/state/data/StateEmptyBean;Z)V", "getEmptyData", "()Lcom/heytap/store/base/widget/state/data/StateEmptyBean;", "setEmptyData", "(Lcom/heytap/store/base/widget/state/data/StateEmptyBean;)V", "getErrorData", "()Lcom/heytap/store/base/widget/state/data/StateErrorBean;", "setErrorData", "(Lcom/heytap/store/base/widget/state/data/StateErrorBean;)V", "()Z", "setUserCustom", "(Z)V", "getLoadData", "()Lcom/heytap/store/base/widget/state/data/StateLoadBean;", "setLoadData", "(Lcom/heytap/store/base/widget/state/data/StateLoadBean;)V", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreStateEntity {

    @Nullable
    private StateEmptyBean emptyData;

    @Nullable
    private StateErrorBean errorData;
    private boolean isUserCustom;

    @Nullable
    private StateLoadBean loadData;
    private int type;

    public OStoreStateEntity(int i, @Nullable StateLoadBean stateLoadBean, @Nullable StateErrorBean stateErrorBean, @Nullable StateEmptyBean stateEmptyBean, boolean z) {
        this.type = i;
        this.loadData = stateLoadBean;
        this.errorData = stateErrorBean;
        this.emptyData = stateEmptyBean;
        this.isUserCustom = z;
    }

    public static /* synthetic */ OStoreStateEntity copy$default(OStoreStateEntity oStoreStateEntity, int i, StateLoadBean stateLoadBean, StateErrorBean stateErrorBean, StateEmptyBean stateEmptyBean, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oStoreStateEntity.type;
        }
        if ((i2 & 2) != 0) {
            stateLoadBean = oStoreStateEntity.loadData;
        }
        StateLoadBean stateLoadBean2 = stateLoadBean;
        if ((i2 & 4) != 0) {
            stateErrorBean = oStoreStateEntity.errorData;
        }
        StateErrorBean stateErrorBean2 = stateErrorBean;
        if ((i2 & 8) != 0) {
            stateEmptyBean = oStoreStateEntity.emptyData;
        }
        StateEmptyBean stateEmptyBean2 = stateEmptyBean;
        if ((i2 & 16) != 0) {
            z = oStoreStateEntity.isUserCustom;
        }
        return oStoreStateEntity.copy(i, stateLoadBean2, stateErrorBean2, stateEmptyBean2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StateLoadBean getLoadData() {
        return this.loadData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StateErrorBean getErrorData() {
        return this.errorData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StateEmptyBean getEmptyData() {
        return this.emptyData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsUserCustom() {
        return this.isUserCustom;
    }

    @NotNull
    public final OStoreStateEntity copy(int type, @Nullable StateLoadBean loadData, @Nullable StateErrorBean errorData, @Nullable StateEmptyBean emptyData, boolean isUserCustom) {
        return new OStoreStateEntity(type, loadData, errorData, emptyData, isUserCustom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreStateEntity)) {
            return false;
        }
        OStoreStateEntity oStoreStateEntity = (OStoreStateEntity) other;
        return this.type == oStoreStateEntity.type && Intrinsics.areEqual(this.loadData, oStoreStateEntity.loadData) && Intrinsics.areEqual(this.errorData, oStoreStateEntity.errorData) && Intrinsics.areEqual(this.emptyData, oStoreStateEntity.emptyData) && this.isUserCustom == oStoreStateEntity.isUserCustom;
    }

    @Nullable
    public final StateEmptyBean getEmptyData() {
        return this.emptyData;
    }

    @Nullable
    public final StateErrorBean getErrorData() {
        return this.errorData;
    }

    @Nullable
    public final StateLoadBean getLoadData() {
        return this.loadData;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        StateLoadBean stateLoadBean = this.loadData;
        int iHashCode2 = (iHashCode + (stateLoadBean == null ? 0 : stateLoadBean.hashCode())) * 31;
        StateErrorBean stateErrorBean = this.errorData;
        int iHashCode3 = (iHashCode2 + (stateErrorBean == null ? 0 : stateErrorBean.hashCode())) * 31;
        StateEmptyBean stateEmptyBean = this.emptyData;
        int iHashCode4 = (iHashCode3 + (stateEmptyBean != null ? stateEmptyBean.hashCode() : 0)) * 31;
        boolean z = this.isUserCustom;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode4 + r3;
    }

    public final boolean isUserCustom() {
        return this.isUserCustom;
    }

    public final void setEmptyData(@Nullable StateEmptyBean stateEmptyBean) {
        this.emptyData = stateEmptyBean;
    }

    public final void setErrorData(@Nullable StateErrorBean stateErrorBean) {
        this.errorData = stateErrorBean;
    }

    public final void setLoadData(@Nullable StateLoadBean stateLoadBean) {
        this.loadData = stateLoadBean;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserCustom(boolean z) {
        this.isUserCustom = z;
    }

    @NotNull
    public String toString() {
        return "OStoreStateEntity(type=" + this.type + ", loadData=" + this.loadData + ", errorData=" + this.errorData + ", emptyData=" + this.emptyData + ", isUserCustom=" + this.isUserCustom + ')';
    }

    public /* synthetic */ OStoreStateEntity(int i, StateLoadBean stateLoadBean, StateErrorBean stateErrorBean, StateEmptyBean stateEmptyBean, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : stateLoadBean, (i2 & 4) != 0 ? null : stateErrorBean, (i2 & 8) != 0 ? null : stateEmptyBean, (i2 & 16) != 0 ? false : z);
    }
}
