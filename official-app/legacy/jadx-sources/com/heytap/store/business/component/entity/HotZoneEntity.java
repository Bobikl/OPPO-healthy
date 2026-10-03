package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001a\u00103\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014¨\u00066"}, d2 = {"Lcom/heytap/store/business/component/entity/HotZoneEntity;", "", "()V", "bgUrl", "", "getBgUrl", "()Ljava/lang/String;", "setBgUrl", "(Ljava/lang/String;)V", "headerInfo", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "getHeaderInfo", "()Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", Fields.HEIGHT_FIELD, "", "getHeight", "()I", "setHeight", "(I)V", "hotZoneBannerLists", "", "Lcom/heytap/store/business/component/entity/HotZoneCarouserEntity;", "getHotZoneBannerLists", "()Ljava/util/List;", "setHotZoneBannerLists", "(Ljava/util/List;)V", "hotZoneBtnLists", "Lcom/heytap/store/business/component/entity/OStoreReserveComponentEntity;", "getHotZoneBtnLists", "setHotZoneBtnLists", "hotZoneItemLists", "Lcom/heytap/store/business/component/entity/HotZoneItemEntity;", "getHotZoneItemLists", "setHotZoneItemLists", "hotZonePicLists", "Lcom/heytap/store/business/component/entity/HotZonePicEntity;", "getHotZonePicLists", "setHotZonePicLists", "isHaveFrame", "", "()Z", "setHaveFrame", "(Z)V", "originalHeight", "getOriginalHeight", "setOriginalHeight", "originalWidth", "getOriginalWidth", "setOriginalWidth", Fields.WIDTH_FIELD, "getWidth", "setWidth", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HotZoneEntity {

    @Nullable
    private String bgUrl;

    @Nullable
    private OStoreHeaderInfo headerInfo;
    private int height;

    @Nullable
    private List<HotZoneCarouserEntity> hotZoneBannerLists;

    @Nullable
    private List<OStoreReserveComponentEntity> hotZoneBtnLists;

    @Nullable
    private List<HotZoneItemEntity> hotZoneItemLists;

    @Nullable
    private List<HotZonePicEntity> hotZonePicLists;
    private boolean isHaveFrame;
    private int originalHeight;
    private int originalWidth;
    private int width;

    @Nullable
    public final String getBgUrl() {
        return this.bgUrl;
    }

    @Nullable
    public final OStoreHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final List<HotZoneCarouserEntity> getHotZoneBannerLists() {
        return this.hotZoneBannerLists;
    }

    @Nullable
    public final List<OStoreReserveComponentEntity> getHotZoneBtnLists() {
        return this.hotZoneBtnLists;
    }

    @Nullable
    public final List<HotZoneItemEntity> getHotZoneItemLists() {
        return this.hotZoneItemLists;
    }

    @Nullable
    public final List<HotZonePicEntity> getHotZonePicLists() {
        return this.hotZonePicLists;
    }

    public final int getOriginalHeight() {
        return this.originalHeight;
    }

    public final int getOriginalWidth() {
        return this.originalWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isHaveFrame, reason: from getter */
    public final boolean getIsHaveFrame() {
        return this.isHaveFrame;
    }

    public final void setBgUrl(@Nullable String str) {
        this.bgUrl = str;
    }

    public final void setHaveFrame(boolean z) {
        this.isHaveFrame = z;
    }

    public final void setHeaderInfo(@Nullable OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setHotZoneBannerLists(@Nullable List<HotZoneCarouserEntity> list) {
        this.hotZoneBannerLists = list;
    }

    public final void setHotZoneBtnLists(@Nullable List<OStoreReserveComponentEntity> list) {
        this.hotZoneBtnLists = list;
    }

    public final void setHotZoneItemLists(@Nullable List<HotZoneItemEntity> list) {
        this.hotZoneItemLists = list;
    }

    public final void setHotZonePicLists(@Nullable List<HotZonePicEntity> list) {
        this.hotZonePicLists = list;
    }

    public final void setOriginalHeight(int i) {
        this.originalHeight = i;
    }

    public final void setOriginalWidth(int i) {
        this.originalWidth = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
