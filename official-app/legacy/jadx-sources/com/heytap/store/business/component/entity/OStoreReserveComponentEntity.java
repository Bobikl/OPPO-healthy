package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010\u0014R.\u0010>\u001a\u0016\u0012\u0004\u0012\u00020@\u0018\u00010?j\n\u0012\u0004\u0012\u00020@\u0018\u0001`AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u001a\u0010O\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\b¨\u0006R"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreReserveComponentEntity;", "", "()V", "btnBackGroundColor", "", "getBtnBackGroundColor", "()Ljava/lang/String;", "setBtnBackGroundColor", "(Ljava/lang/String;)V", "btnColor", "getBtnColor", "setBtnColor", "btnContent", "getBtnContent", "setBtnContent", "goodsSpuId", "", "getGoodsSpuId", "()I", "setGoodsSpuId", "(I)V", "isJumpEnable", "", "()Z", "setJumpEnable", "(Z)V", "isReserve", "setReserve", "isReserveSuccessJumpEnable", "setReserveSuccessJumpEnable", "isShowReserverCountText", "setShowReserverCountText", "jumpUrl", "getJumpUrl", "setJumpUrl", "originalPosition", "getOriginalPosition", "setOriginalPosition", "reportEntity", "Lcom/heytap/store/business/component/entity/OStoreReserverReportEntity;", "getReportEntity", "()Lcom/heytap/store/business/component/entity/OStoreReserverReportEntity;", "setReportEntity", "(Lcom/heytap/store/business/component/entity/OStoreReserverReportEntity;)V", "reserveCount", "", "getReserveCount", "()J", "setReserveCount", "(J)V", "reserveCountTextColor", "getReserveCountTextColor", "setReserveCountTextColor", "reserveSuccessJumpUrl", "getReserveSuccessJumpUrl", "setReserveSuccessJumpUrl", "reservedBtnContent", "getReservedBtnContent", "setReservedBtnContent", "skuId", "getSkuId", "setSkuId", "skuInfoList", "Ljava/util/ArrayList;", "Lcom/heytap/store/business/component/entity/OStoreReserveSkuEntity;", "Lkotlin/collections/ArrayList;", "getSkuInfoList", "()Ljava/util/ArrayList;", "setSkuInfoList", "(Ljava/util/ArrayList;)V", "startX", "", "getStartX", "()F", "setStartX", "(F)V", "startY", "getStartY", "setStartY", "subscribeSuccessfulRemindText", "getSubscribeSuccessfulRemindText", "setSubscribeSuccessfulRemindText", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreReserveComponentEntity {

    @Nullable
    private String btnBackGroundColor;

    @Nullable
    private String btnColor;

    @Nullable
    private String btnContent;
    private boolean isJumpEnable;
    private boolean isReserve;
    private boolean isReserveSuccessJumpEnable;

    @Nullable
    private OStoreReserverReportEntity reportEntity;
    private long reserveCount;

    @Nullable
    private ArrayList<OStoreReserveSkuEntity> skuInfoList;
    private float startX;
    private float startY;
    private int originalPosition = -1;
    private int skuId = -1;
    private int goodsSpuId = -1;
    private boolean isShowReserverCountText = true;

    @NotNull
    private String subscribeSuccessfulRemindText = "";

    @Nullable
    private String reserveSuccessJumpUrl = "";

    @NotNull
    private String reservedBtnContent = "";

    @NotNull
    private String jumpUrl = "";

    @NotNull
    private String reserveCountTextColor = "";

    @Nullable
    public final String getBtnBackGroundColor() {
        return this.btnBackGroundColor;
    }

    @Nullable
    public final String getBtnColor() {
        return this.btnColor;
    }

    @Nullable
    public final String getBtnContent() {
        return this.btnContent;
    }

    public final int getGoodsSpuId() {
        return this.goodsSpuId;
    }

    @NotNull
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final int getOriginalPosition() {
        return this.originalPosition;
    }

    @Nullable
    public final OStoreReserverReportEntity getReportEntity() {
        return this.reportEntity;
    }

    public final long getReserveCount() {
        return this.reserveCount;
    }

    @NotNull
    public final String getReserveCountTextColor() {
        return this.reserveCountTextColor;
    }

    @Nullable
    public final String getReserveSuccessJumpUrl() {
        return this.reserveSuccessJumpUrl;
    }

    @NotNull
    public final String getReservedBtnContent() {
        return this.reservedBtnContent;
    }

    public final int getSkuId() {
        return this.skuId;
    }

    @Nullable
    public final ArrayList<OStoreReserveSkuEntity> getSkuInfoList() {
        return this.skuInfoList;
    }

    public final float getStartX() {
        return this.startX;
    }

    public final float getStartY() {
        return this.startY;
    }

    @NotNull
    public final String getSubscribeSuccessfulRemindText() {
        return this.subscribeSuccessfulRemindText;
    }

    /* JADX INFO: renamed from: isJumpEnable, reason: from getter */
    public final boolean getIsJumpEnable() {
        return this.isJumpEnable;
    }

    /* JADX INFO: renamed from: isReserve, reason: from getter */
    public final boolean getIsReserve() {
        return this.isReserve;
    }

    /* JADX INFO: renamed from: isReserveSuccessJumpEnable, reason: from getter */
    public final boolean getIsReserveSuccessJumpEnable() {
        return this.isReserveSuccessJumpEnable;
    }

    /* JADX INFO: renamed from: isShowReserverCountText, reason: from getter */
    public final boolean getIsShowReserverCountText() {
        return this.isShowReserverCountText;
    }

    public final void setBtnBackGroundColor(@Nullable String str) {
        this.btnBackGroundColor = str;
    }

    public final void setBtnColor(@Nullable String str) {
        this.btnColor = str;
    }

    public final void setBtnContent(@Nullable String str) {
        this.btnContent = str;
    }

    public final void setGoodsSpuId(int i) {
        this.goodsSpuId = i;
    }

    public final void setJumpEnable(boolean z) {
        this.isJumpEnable = z;
    }

    public final void setJumpUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jumpUrl = str;
    }

    public final void setOriginalPosition(int i) {
        this.originalPosition = i;
    }

    public final void setReportEntity(@Nullable OStoreReserverReportEntity oStoreReserverReportEntity) {
        this.reportEntity = oStoreReserverReportEntity;
    }

    public final void setReserve(boolean z) {
        this.isReserve = z;
    }

    public final void setReserveCount(long j2) {
        this.reserveCount = j2;
    }

    public final void setReserveCountTextColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reserveCountTextColor = str;
    }

    public final void setReserveSuccessJumpEnable(boolean z) {
        this.isReserveSuccessJumpEnable = z;
    }

    public final void setReserveSuccessJumpUrl(@Nullable String str) {
        this.reserveSuccessJumpUrl = str;
    }

    public final void setReservedBtnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reservedBtnContent = str;
    }

    public final void setShowReserverCountText(boolean z) {
        this.isShowReserverCountText = z;
    }

    public final void setSkuId(int i) {
        this.skuId = i;
    }

    public final void setSkuInfoList(@Nullable ArrayList<OStoreReserveSkuEntity> arrayList) {
        this.skuInfoList = arrayList;
    }

    public final void setStartX(float f) {
        this.startX = f;
    }

    public final void setStartY(float f) {
        this.startY = f;
    }

    public final void setSubscribeSuccessfulRemindText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subscribeSuccessfulRemindText = str;
    }
}
