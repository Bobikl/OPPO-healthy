package com.heytap.health.oobe.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0017J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/heytap/health/oobe/widget/LinearGradientDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "Landroid/graphics/Canvas;", "canvas", ParserTag.TAG_DRAW, "", "alpha", ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "a", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/LinearGradient;", "b", "Landroid/graphics/LinearGradient;", "gradient", "", "c", "[I", "getColors", "()[I", "setColors", "([I)V", ParserTag.TAG_COLORS, "", "d", "[F", "getPositions", "()[F", "setPositions", "([F)V", "positions", "Lcom/heytap/health/oobe/widget/LinearGradientDrawable$Orientation;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/oobe/widget/LinearGradientDrawable$Orientation;", "getOrientation", "()Lcom/heytap/health/oobe/widget/LinearGradientDrawable$Orientation;", "setOrientation", "(Lcom/heytap/health/oobe/widget/LinearGradientDrawable$Orientation;)V", "orientation", "Landroid/graphics/Shader$TileMode;", "f", "Landroid/graphics/Shader$TileMode;", "getTileMode", "()Landroid/graphics/Shader$TileMode;", "setTileMode", "(Landroid/graphics/Shader$TileMode;)V", "tileMode", "<init>", "()V", ExifInterface.TAG_ORIENTATION, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class LinearGradientDrawable extends Drawable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public LinearGradient gradient;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Paint paint = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] colors = {Color.parseColor("#CCE2F2"), Color.parseColor("#F0F1F2")};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public float[] positions = {0.0f, 0.25f};

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Orientation orientation = Orientation.TOP_BOTTOM;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public Shader.TileMode tileMode = Shader.TileMode.CLAMP;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/oobe/widget/LinearGradientDrawable$Orientation;", "", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "BOTTOM_TOP", "LEFT_RIGHT", "RIGHT_LEFT", "TR_BL", "TL_BR", "BR_TL", "BL_TR", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Orientation {
        TOP_BOTTOM,
        BOTTOM_TOP,
        LEFT_RIGHT,
        RIGHT_LEFT,
        TR_BL,
        TL_BR,
        BR_TL,
        BL_TR
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.BOTTOM_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Orientation.LEFT_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Orientation.RIGHT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Orientation.TR_BL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Orientation.TL_BR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Orientation.BR_TL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Orientation.BL_TR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void a(Rect bounds) {
        float[] fArr;
        switch (a.$EnumSwitchMapping$0[this.orientation.ordinal()]) {
            case 1:
                fArr = new float[]{0.0f, 0.0f, 0.0f, bounds.height()};
                break;
            case 2:
                fArr = new float[]{0.0f, bounds.height(), 0.0f, 0.0f};
                break;
            case 3:
                fArr = new float[]{0.0f, 0.0f, bounds.width(), 0.0f};
                break;
            case 4:
                fArr = new float[]{bounds.width(), 0.0f, 0.0f, 0.0f};
                break;
            case 5:
                fArr = new float[]{bounds.width(), 0.0f, 0.0f, bounds.height()};
                break;
            case 6:
                fArr = new float[]{0.0f, 0.0f, bounds.width(), bounds.height()};
                break;
            case 7:
                fArr = new float[]{bounds.width(), bounds.height(), 0.0f, 0.0f};
                break;
            case 8:
                fArr = new float[]{0.0f, bounds.height(), bounds.width(), 0.0f};
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        LinearGradient linearGradient = new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], this.colors, this.positions, this.tileMode);
        this.gradient = linearGradient;
        this.paint.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(getBounds(), this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        a(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
