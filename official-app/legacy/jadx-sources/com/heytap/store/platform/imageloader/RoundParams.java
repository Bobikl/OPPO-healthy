package com.heytap.store.platform.imageloader;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ&\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/heytap/store/platform/imageloader/RoundParams;", "", "()V", "borderColor", "", "getBorderColor", "()I", "setBorderColor", "(I)V", "borderWidth", "", "getBorderWidth", "()F", "setBorderWidth", "(F)V", "cornersRadii", "", "getCornersRadii", "()[F", "setCornersRadii", "([F)V", "isRoundAsCircle", "", "()Z", "setRoundAsCircle", "(Z)V", "setCornersRadius", "radius", "topLeft", "topRight", "bottomLeft", "bottomRight", "roundAsCircle", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public class RoundParams {
    private int borderColor;
    private float borderWidth;

    @Nullable
    private float[] cornersRadii;
    private boolean isRoundAsCircle;

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final float[] getCornersRadii() {
        return this.cornersRadii;
    }

    /* JADX INFO: renamed from: isRoundAsCircle, reason: from getter */
    public final boolean getIsRoundAsCircle() {
        return this.isRoundAsCircle;
    }

    /* JADX INFO: renamed from: setBorderColor, reason: collision with other method in class */
    public final void m5048setBorderColor(int i) {
        this.borderColor = i;
    }

    /* JADX INFO: renamed from: setBorderWidth, reason: collision with other method in class */
    public final void m5049setBorderWidth(float f) {
        this.borderWidth = f;
    }

    public final void setCornersRadii(@Nullable float[] fArr) {
        this.cornersRadii = fArr;
    }

    @NotNull
    public final RoundParams setCornersRadius(float radius) {
        return setCornersRadius(radius, radius, radius, radius);
    }

    /* JADX INFO: renamed from: setRoundAsCircle, reason: collision with other method in class */
    public final void m5050setRoundAsCircle(boolean z) {
        this.isRoundAsCircle = z;
    }

    @NotNull
    public final RoundParams setBorderColor(int borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    @NotNull
    public final RoundParams setBorderWidth(float borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    @NotNull
    public final RoundParams setCornersRadius(float topLeft, float topRight, float bottomLeft, float bottomRight) {
        this.cornersRadii = new float[]{topLeft, topRight, bottomLeft, bottomRight};
        return this;
    }

    @NotNull
    public final RoundParams setRoundAsCircle(boolean roundAsCircle) {
        this.isRoundAsCircle = roundAsCircle;
        return this;
    }
}
