package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.f38, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/f38;", "", "", "icon", "", "enable", "supportTransfer", "transfer", "a", "", "toString", "hashCode", "other", "equals", "I", "d", "()I", "b", "Z", "c", "()Z", MapSchema.FIELD_NAME_ENTRY, "f", "<init>", "(IZZZ)V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GameModeUIData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean enable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean supportTransfer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean transfer;

    public GameModeUIData(int i, boolean z, boolean z2, boolean z3) {
        this.icon = i;
        this.enable = z;
        this.supportTransfer = z2;
        this.transfer = z3;
    }

    public static /* synthetic */ GameModeUIData b(GameModeUIData gameModeUIData, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gameModeUIData.icon;
        }
        if ((i2 & 2) != 0) {
            z = gameModeUIData.enable;
        }
        if ((i2 & 4) != 0) {
            z2 = gameModeUIData.supportTransfer;
        }
        if ((i2 & 8) != 0) {
            z3 = gameModeUIData.transfer;
        }
        return gameModeUIData.a(i, z, z2, z3);
    }

    @NotNull
    public final GameModeUIData a(int icon, boolean enable, boolean supportTransfer, boolean transfer) {
        return new GameModeUIData(icon, enable, supportTransfer, transfer);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSupportTransfer() {
        return this.supportTransfer;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameModeUIData)) {
            return false;
        }
        GameModeUIData gameModeUIData = (GameModeUIData) other;
        return this.icon == gameModeUIData.icon && this.enable == gameModeUIData.enable && this.supportTransfer == gameModeUIData.supportTransfer && this.transfer == gameModeUIData.transfer;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getTransfer() {
        return this.transfer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.icon) * 31;
        boolean z = this.enable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.supportTransfer;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.transfer;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "GameModeUIData(icon=" + this.icon + ", enable=" + this.enable + ", supportTransfer=" + this.supportTransfer + ", transfer=" + this.transfer + ")";
    }
}
