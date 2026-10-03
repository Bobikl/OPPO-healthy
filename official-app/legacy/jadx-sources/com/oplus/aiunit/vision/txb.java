package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\t\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/txb;", "", "", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "text", "Landroidx/compose/ui/unit/TextUnit;", "b", "J", "c", "()J", "fontSize", "Landroidx/compose/ui/unit/Dp;", UserInfo.SEX_FEMALE, "d", "()F", "marginTop", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "()Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "<init>", "(Ljava/lang/String;JFJLandroidx/compose/ui/text/font/FontFamily;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class txb {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float marginTop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long color;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontFamily fontFamily;

    public /* synthetic */ txb(String str, long j2, float f, long j3, FontFamily fontFamily, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, f, j3, fontFamily);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public txb(String str, long j2, float f, long j3, FontFamily fontFamily) {
        this.text = str;
        this.fontSize = j2;
        this.marginTop = f;
        this.color = j3;
        this.fontFamily = fontFamily;
    }

    public /* synthetic */ txb(String str, long j2, float f, long j3, FontFamily fontFamily, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TextUnit.INSTANCE.m4296getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? Dp.INSTANCE.m4124getUnspecifiedD9Ej5fM() : f, (i & 8) != 0 ? Color.INSTANCE.m1654getUnspecified0d7_KjU() : j3, (i & 16) != 0 ? FontFamily.INSTANCE.getDefault() : fontFamily, null);
    }
}
