package com.oplus.aiunit.vision;

import com.oplus.seedling.sdk.seedling.SeedlingUIData;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.app.bean.CardViewInfo;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.p8e, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u0013\u0010$R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\u000e\u0010$¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/p8e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "totalParts", "b", "d", b2n.g, "(I)V", "successParts", "c", "Z", "getFailed", "()Z", b2n.f, "(Z)V", com.alipay.sdk.m.u.h.i, "Lpantanal/app/bean/CardViewInfo;", "Lpantanal/app/bean/CardViewInfo;", "()Lpantanal/app/bean/CardViewInfo;", "cardViewInfo", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "f", "()Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "uiData", "Ljava/lang/String;", "()Ljava/lang/String;", "picKey", "imageKey", "<init>", "(IIZLpantanal/app/bean/CardViewInfo;Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;Ljava/lang/String;Ljava/lang/String;)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PartSendState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int totalParts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int successParts;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean failed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final CardViewInfo cardViewInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final SeedlingUIData uiData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String picKey;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String imageKey;

    public PartSendState(int i, int i2, boolean z, @NotNull CardViewInfo cardViewInfo, @NotNull SeedlingUIData uiData, @NotNull String picKey, @NotNull String imageKey) {
        Intrinsics.checkNotNullParameter(cardViewInfo, "cardViewInfo");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        Intrinsics.checkNotNullParameter(picKey, "picKey");
        Intrinsics.checkNotNullParameter(imageKey, "imageKey");
        this.totalParts = i;
        this.successParts = i2;
        this.failed = z;
        this.cardViewInfo = cardViewInfo;
        this.uiData = uiData;
        this.picKey = picKey;
        this.imageKey = imageKey;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardViewInfo getCardViewInfo() {
        return this.cardViewInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPicKey() {
        return this.picKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSuccessParts() {
        return this.successParts;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotalParts() {
        return this.totalParts;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartSendState)) {
            return false;
        }
        PartSendState partSendState = (PartSendState) other;
        return this.totalParts == partSendState.totalParts && this.successParts == partSendState.successParts && this.failed == partSendState.failed && Intrinsics.areEqual(this.cardViewInfo, partSendState.cardViewInfo) && Intrinsics.areEqual(this.uiData, partSendState.uiData) && Intrinsics.areEqual(this.picKey, partSendState.picKey) && Intrinsics.areEqual(this.imageKey, partSendState.imageKey);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final SeedlingUIData getUiData() {
        return this.uiData;
    }

    public final void g(boolean z) {
        this.failed = z;
    }

    public final void h(int i) {
        this.successParts = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.totalParts) * 31) + Integer.hashCode(this.successParts)) * 31;
        boolean z = this.failed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.cardViewInfo.hashCode()) * 31) + this.uiData.hashCode()) * 31) + this.picKey.hashCode()) * 31) + this.imageKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "PartSendState(totalParts=" + this.totalParts + ", successParts=" + this.successParts + ", failed=" + this.failed + ", cardViewInfo=" + this.cardViewInfo + ", uiData=" + this.uiData + ", picKey=" + this.picKey + ", imageKey=" + this.imageKey + ")";
    }

    public /* synthetic */ PartSendState(int i, int i2, boolean z, CardViewInfo cardViewInfo, SeedlingUIData seedlingUIData, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, cardViewInfo, seedlingUIData, str, str2);
    }
}
