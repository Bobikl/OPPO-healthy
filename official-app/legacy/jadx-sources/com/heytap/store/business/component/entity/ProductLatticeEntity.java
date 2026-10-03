package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R4\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/business/component/entity/ProductLatticeEntity;", "", "()V", "value", "", "Lcom/heytap/store/business/component/entity/ProductLatticeDetail;", hp6.DETAIL_ENTRY, "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "isAllPic", "", "()Z", "setAllPic", "(Z)V", "isCoverHead", "setCoverHead", "isFoldWindowPad", "setFoldWindowPad", "isHaveGrid", "setHaveGrid", "isOppoCommunityPad", "setOppoCommunityPad", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProductLatticeEntity {

    @Nullable
    private List<ProductLatticeDetail> details;

    @Nullable
    private OStoreHeaderInfo headerInfo;
    private boolean isAllPic;
    private boolean isCoverHead;
    private boolean isOppoCommunityPad;
    private boolean isHaveGrid = true;
    private boolean isFoldWindowPad = true;

    @Nullable
    public final List<ProductLatticeDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    /* JADX INFO: renamed from: isAllPic, reason: from getter */
    public final boolean getIsAllPic() {
        return this.isAllPic;
    }

    /* JADX INFO: renamed from: isCoverHead, reason: from getter */
    public final boolean getIsCoverHead() {
        return this.isCoverHead;
    }

    /* JADX INFO: renamed from: isFoldWindowPad, reason: from getter */
    public final boolean getIsFoldWindowPad() {
        return this.isFoldWindowPad;
    }

    /* JADX INFO: renamed from: isHaveGrid, reason: from getter */
    public final boolean getIsHaveGrid() {
        return this.isHaveGrid;
    }

    /* JADX INFO: renamed from: isOppoCommunityPad, reason: from getter */
    public final boolean getIsOppoCommunityPad() {
        return this.isOppoCommunityPad;
    }

    public final void setAllPic(boolean z) {
        this.isAllPic = z;
    }

    public final void setCoverHead(boolean z) {
        this.isCoverHead = z;
    }

    public final void setDetails(@Nullable List<ProductLatticeDetail> list) {
        this.details = list;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ProductLatticeDetail) it.next()).getGoodsCardType() == 1) {
                return;
            }
        }
        setAllPic(true);
    }

    public final void setFoldWindowPad(boolean z) {
        this.isFoldWindowPad = z;
    }

    public final void setHaveGrid(boolean z) {
        this.isHaveGrid = z;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setOppoCommunityPad(boolean z) {
        this.isOppoCommunityPad = z;
    }
}
