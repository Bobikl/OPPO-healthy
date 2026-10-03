package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\""}, d2 = {"Lcom/health/health_seedlingcard/bean/Pieces;", "", "label", "Lcom/health/health_seedlingcard/bean/PiecesLabel;", "gt", "", "lte", "color", "", "(Lcom/health/health_seedlingcard/bean/PiecesLabel;IILjava/lang/String;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getGt", "()I", "setGt", "(I)V", "getLabel", "()Lcom/health/health_seedlingcard/bean/PiecesLabel;", "setLabel", "(Lcom/health/health_seedlingcard/bean/PiecesLabel;)V", "getLte", "setLte", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Pieces {

    @NotNull
    private String color;
    private int gt;

    @NotNull
    private PiecesLabel label;
    private int lte;

    public Pieces(@NotNull PiecesLabel piecesLabel, int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(piecesLabel, "label");
        Intrinsics.checkNotNullParameter(str, "color");
        this.label = piecesLabel;
        this.gt = i;
        this.lte = i2;
        this.color = str;
    }

    public static /* synthetic */ Pieces copy$default(Pieces pieces, PiecesLabel piecesLabel, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            piecesLabel = pieces.label;
        }
        if ((i3 & 2) != 0) {
            i = pieces.gt;
        }
        if ((i3 & 4) != 0) {
            i2 = pieces.lte;
        }
        if ((i3 & 8) != 0) {
            str = pieces.color;
        }
        return pieces.copy(piecesLabel, i, i2, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PiecesLabel getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGt() {
        return this.gt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLte() {
        return this.lte;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final Pieces copy(@NotNull PiecesLabel label, int gt, int lte, @NotNull String color) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(color, "color");
        return new Pieces(label, gt, lte, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pieces)) {
            return false;
        }
        Pieces pieces = (Pieces) other;
        return Intrinsics.areEqual(this.label, pieces.label) && this.gt == pieces.gt && this.lte == pieces.lte && Intrinsics.areEqual(this.color, pieces.color);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final int getGt() {
        return this.gt;
    }

    @NotNull
    public final PiecesLabel getLabel() {
        return this.label;
    }

    public final int getLte() {
        return this.lte;
    }

    public int hashCode() {
        return (((((this.label.hashCode() * 31) + Integer.hashCode(this.gt)) * 31) + Integer.hashCode(this.lte)) * 31) + this.color.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setGt(int i) {
        this.gt = i;
    }

    public final void setLabel(@NotNull PiecesLabel piecesLabel) {
        Intrinsics.checkNotNullParameter(piecesLabel, "<set-?>");
        this.label = piecesLabel;
    }

    public final void setLte(int i) {
        this.lte = i;
    }

    @NotNull
    public String toString() {
        return "Pieces(label=" + this.label + ", gt=" + this.gt + ", lte=" + this.lte + ", color=" + this.color + ")";
    }

    public /* synthetic */ Pieces(PiecesLabel piecesLabel, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(piecesLabel, (i3 & 2) != 0 ? 75 : i, (i3 & 4) != 0 ? 100 : i2, (i3 & 8) != 0 ? "#FFC30E" : str);
    }
}
