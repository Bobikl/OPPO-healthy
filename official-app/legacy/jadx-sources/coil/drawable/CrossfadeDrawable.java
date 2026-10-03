package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Scale;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.a35;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0019\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007BE\b\u0007\u0012\b\u00105\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010E\u001a\u00020@\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\b\b\u0002\u0010O\u001a\u00020\u001a\u0012\b\b\u0002\u0010R\u001a\u00020\u001a¢\u0006\u0004\bi\u0010jJ#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0017J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0001H\u0016J \u0010(\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016J\u0012\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0012\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016J\u0012\u00103\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u000101H\u0017J\b\u00104\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020\tH\u0016J\b\u00106\u001a\u00020\tH\u0016J\u0010\u00109\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0016J\b\u0010;\u001a\u00020\tH\u0016J\u001f\u0010>\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u0016H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010J\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010R\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u0002070S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010GR\u0014\u0010Z\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010GR\u0016\u0010]\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010GR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010GR(\u00105\u001a\u0004\u0018\u00010\u00012\b\u0010a\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0019\u0010h\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bf\u0010c\u001a\u0004\bg\u0010e¨\u0006l"}, d2 = {"Lcoil/drawable/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "", "startSize", "endSize", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "", "b", "Landroid/graphics/Canvas;", "canvas", ParserTag.TAG_DRAW, "getAlpha", "alpha", ClickApiEntity.SET_ALPHA, "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "colorFilter", "setColorFilter", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "level", "", "onLevelChange", "", "state", "onStateChange", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "invalidateDrawable", "", "when", "scheduleDrawable", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "isRunning", "start", Action.LIFE_CIRCLE_VALUE_STOP, "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "callback", "registerAnimationCallback", "unregisterAnimationCallback", "clearAnimationCallbacks", ResourcesUtil.ResourceType.DRAWABLE, "targetBounds", "c", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "Lcoil/size/Scale;", "i", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "scale", "j", "I", "getDurationMillis", "()I", "durationMillis", MapSchema.FIELD_NAME_KEY, "Z", "getFadeStart", "()Z", "fadeStart", LogFieldKey.LEVEL_KEY, "getPreferExactIntrinsicSize", "preferExactIntrinsicSize", "", LogFieldKey.MESSAGE_KEY, "Ljava/util/List;", "callbacks", "n", "intrinsicWidth", "o", "intrinsicHeight", LogFieldKey.PROCESS_NAME_KEY, "J", "startTimeMillis", "q", "maxAlpha", "r", "<set-?>", "s", "Landroid/graphics/drawable/Drawable;", "getStart", "()Landroid/graphics/drawable/Drawable;", "t", "getEnd", TextEntity.ELLIPSIZE_END, "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/size/Scale;IZZ)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCrossfadeDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 4 Collections.kt\ncoil/util/-Collections\n*L\n1#1,277:1\n1#2:278\n30#3,7:279\n30#3,7:286\n30#3,7:293\n30#3,7:300\n12#4,4:307\n12#4,4:311\n*S KotlinDebug\n*F\n+ 1 CrossfadeDrawable.kt\ncoil/drawable/CrossfadeDrawable\n*L\n71#1:279,7\n79#1:286,7\n93#1:293,7\n100#1:300,7\n211#1:307,4\n266#1:311,4\n*E\n"})
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable2Compat {
    public static final int DEFAULT_DURATION = 100;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Scale scale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean fadeStart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<Animatable2Compat.AnimationCallback> callbacks = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int intrinsicWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int intrinsicHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long startTimeMillis;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int maxAlpha;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Drawable start;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final Drawable end;

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i, boolean z, boolean z2) {
        this.scale = scale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.intrinsicWidth = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.intrinsicHeight = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.maxAlpha = 255;
        this.start = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.end = drawableMutate;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.start;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int a(Integer startSize, Integer endSize) {
        if (this.preferExactIntrinsicSize || ((startSize == null || startSize.intValue() != -1) && (endSize == null || endSize.intValue() != -1))) {
            return Math.max(startSize != null ? startSize.intValue() : -1, endSize != null ? endSize.intValue() : -1);
        }
        return -1;
    }

    public final void b() {
        this.state = 2;
        this.start = null;
        List<Animatable2Compat.AnimationCallback> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationEnd(this);
        }
    }

    @VisibleForTesting
    public final void c(@NotNull Drawable drawable, @NotNull Rect targetBounds) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int iWidth = targetBounds.width();
        int iHeight = targetBounds.height();
        double dC = a35.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.scale);
        double d = 2;
        int iRoundToInt = MathKt__MathJVMKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dC)) / d);
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt((((double) iHeight) - (dC * ((double) intrinsicHeight))) / d);
        drawable.setBounds(targetBounds.left + iRoundToInt, targetBounds.top + iRoundToInt2, targetBounds.right - iRoundToInt, targetBounds.bottom - iRoundToInt2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                drawable2.setAlpha(this.maxAlpha);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        if (i == 2) {
            Drawable drawable3 = this.end;
            if (drawable3 != null) {
                drawable3.setAlpha(this.maxAlpha);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / ((double) this.durationMillis);
        double dCoerceIn = RangesKt___RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.maxAlpha;
        int i3 = (int) (dCoerceIn * ((double) i2));
        if (this.fadeStart) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.start) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        Drawable drawable4 = this.end;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable4.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.maxAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.end) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.end;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.start;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        Drawable drawable = this.start;
        Drawable drawable2 = this.end;
        int i = this.state;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.state == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Drawable drawable = this.start;
        if (drawable != null) {
            c(drawable, bounds);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            c(drawable2, bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        Drawable drawable = this.start;
        boolean level2 = drawable != null ? drawable.setLevel(level) : false;
        Drawable drawable2 = this.end;
        return level2 || (drawable2 != null ? drawable2.setLevel(level) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NotNull int[] state) {
        Drawable drawable = this.start;
        boolean state2 = drawable != null ? drawable.setState(state) : false;
        Drawable drawable2 = this.end;
        return state2 || (drawable2 != null ? drawable2.setState(state) : false);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NotNull Animatable2Compat.AnimationCallback callback) {
        this.callbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        boolean z = false;
        if (alpha >= 0 && alpha < 256) {
            z = true;
        }
        if (z) {
            this.maxAlpha = alpha;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + alpha).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTint(tintColor);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTint(tintColor);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList tint) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintList(tint);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintList(tint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode tintMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintMode(tintMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintMode(tintMode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        this.startTimeMillis = SystemClock.uptimeMillis();
        List<Animatable2Compat.AnimationCallback> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.state != 2) {
            b();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NotNull Animatable2Compat.AnimationCallback callback) {
        return this.callbacks.remove(callback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        unscheduleSelf(what);
    }
}
