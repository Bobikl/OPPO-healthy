package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.m99, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 \"\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u001e\u0010&R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\u0004\u0010&R\u0017\u0010-\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b\u0019\u0010,R\"\u00103\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010/\u001a\u0004\b(\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/oplus/aiunit/vision/m99;", "", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;)V", "dataSetLabel", "", UserInfo.SEX_FEMALE, "j", "()F", "q", "(F)V", "startX", "c", LogFieldKey.LEVEL_KEY, "endX", "d", "i", LogFieldKey.PROCESS_NAME_KEY, "radius", MapSchema.FIELD_NAME_ENTRY, b2n.f, "n", "lineWidth", "Landroid/graphics/drawable/Drawable;", "f", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", LogFieldKey.MESSAGE_KEY, "(Landroid/graphics/drawable/Drawable;)V", "fillDrawable", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "linePath", b2n.g, "cubicFillPath", "", "[F", "()[F", "firstAndLastPoints", "", "Z", "()Z", "o", "(Z)V", "onlyOnePoint", "<init>", "()V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class HighlightLineBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public String dataSetLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public float startX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public float endX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public float lineWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public Drawable fillDrawable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Path linePath = new Path();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final Path cubicFillPath = new Path();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final float[] firstPoints = new float[4];

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean onlyOnePoint = true;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Path getCubicFillPath() {
        return this.cubicFillPath;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDataSetLabel() {
        return this.dataSetLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getEndX() {
        return this.endX;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Drawable getFillDrawable() {
        return this.fillDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final float[] getFirstPoints() {
        return this.firstPoints;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Path getLinePath() {
        return this.linePath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getLineWidth() {
        return this.lineWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getOnlyOnePoint() {
        return this.onlyOnePoint;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getStartX() {
        return this.startX;
    }

    public final void k(@Nullable String str) {
        this.dataSetLabel = str;
    }

    public final void l(float f) {
        this.endX = f;
    }

    public final void m(@Nullable Drawable drawable) {
        this.fillDrawable = drawable;
    }

    public final void n(float f) {
        this.lineWidth = f;
    }

    public final void o(boolean z) {
        this.onlyOnePoint = z;
    }

    public final void p(float f) {
        this.radius = f;
    }

    public final void q(float f) {
        this.startX = f;
    }

    @NotNull
    public String toString() {
        String str = this.dataSetLabel;
        float f = this.startX;
        float f2 = this.endX;
        float f3 = this.radius;
        float f4 = this.lineWidth;
        Drawable drawable = this.fillDrawable;
        Path path = this.linePath;
        Path path2 = this.cubicFillPath;
        String string = Arrays.toString(this.firstPoints);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "HighlightLineBean(dataSetLabel=" + str + ", startX=" + f + ", endX=" + f2 + ", radius=" + f3 + ", lineWidth=" + f4 + ", fillDrawable=" + drawable + ", linePath=" + path + ", cubicFillPath=" + path2 + ", firstPoints=" + string + ", onlyOnePoint=" + this.onlyOnePoint + ")";
    }
}
