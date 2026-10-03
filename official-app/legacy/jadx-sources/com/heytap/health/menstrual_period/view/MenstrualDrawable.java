package com.heytap.health.menstrual_period.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.menstrual_period.R$color;
import com.heytap.health.menstrual_period.R$drawable;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bfk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.qtf;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u001d\u0010&\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010*\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'¨\u00060"}, d2 = {"Lcom/heytap/health/menstrual_period/view/MenstrualDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", ParserTag.TAG_DRAW, "", "alpha", ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "a", "b", MapSchema.FIELD_NAME_ENTRY, "", "text", "d", "c", "", "f", "Lcom/heytap/health/menstrual_period/view/MenstrualDrawable$Type;", "Lcom/heytap/health/menstrual_period/view/MenstrualDrawable$Type;", "getType", "()Lcom/heytap/health/menstrual_period/view/MenstrualDrawable$Type;", "type", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Lkotlin/Lazy;", b2n.f, "()Landroid/graphics/drawable/Drawable;", "starDrawable", UserInfo.SEX_FEMALE, Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "centerX", b2n.g, "centerY", "<init>", "(Lcom/heytap/health/menstrual_period/view/MenstrualDrawable$Type;Ljava/lang/String;)V", "Type", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MenstrualDrawable extends Drawable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy starDrawable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float height;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final float centerX;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final float centerY;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PERIOD_TODAY' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/heytap/health/menstrual_period/view/MenstrualDrawable$Type;", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "colorId", "", "other", "(Ljava/lang/String;IFFILjava/lang/Integer;)V", "getColorId", "()I", "getHeight", "()F", "getOther", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "PERIOD_TODAY", "PREDICT_PERIOD_TODAY", "NORMAL_TODAY", "OVULATION_TODAY", "PERIOD_HIGHLIGHT_DAY", "PREDICT_PERIOD_HIGHLIGHT_DAY", "NORMAL_HIGHLIGHT_DAY", "OVULATION_HIGHLIGHT_DAY", "PREDICT_PERIOD_CIRCLE", "PERIOD_PAST_CIRCLE", "NORMAL_CIRCLE", "NORMAL_PAST_CIRCLE", "OVULATION_CIRCLE", "OVULATION_PAST_CIRCLE", "OVULATION_STAR", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type NORMAL_CIRCLE;
        public static final Type NORMAL_HIGHLIGHT_DAY;
        public static final Type NORMAL_PAST_CIRCLE;
        public static final Type NORMAL_TODAY;
        public static final Type OVULATION_CIRCLE;
        public static final Type OVULATION_HIGHLIGHT_DAY;
        public static final Type OVULATION_PAST_CIRCLE;
        public static final Type OVULATION_STAR;
        public static final Type OVULATION_TODAY;
        public static final Type PERIOD_HIGHLIGHT_DAY;
        public static final Type PERIOD_PAST_CIRCLE;
        public static final Type PERIOD_TODAY;
        public static final Type PREDICT_PERIOD_CIRCLE;
        public static final Type PREDICT_PERIOD_HIGHLIGHT_DAY;
        public static final Type PREDICT_PERIOD_TODAY;
        private final int colorId;
        private final float height;

        @Nullable
        private final Integer other;
        private final float width;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PERIOD_TODAY, PREDICT_PERIOD_TODAY, NORMAL_TODAY, OVULATION_TODAY, PERIOD_HIGHLIGHT_DAY, PREDICT_PERIOD_HIGHLIGHT_DAY, NORMAL_HIGHLIGHT_DAY, OVULATION_HIGHLIGHT_DAY, PREDICT_PERIOD_CIRCLE, PERIOD_PAST_CIRCLE, NORMAL_CIRCLE, NORMAL_PAST_CIRCLE, OVULATION_CIRCLE, OVULATION_PAST_CIRCLE, OVULATION_STAR};
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            int i = R$color.menstrual_f4285B;
            int i2 = R$color.menstrual_ffc2d2;
            PERIOD_TODAY = new Type("PERIOD_TODAY", 0, 20.0f, 20.0f, i, Integer.valueOf(i2));
            PREDICT_PERIOD_TODAY = new Type("PREDICT_PERIOD_TODAY", 1, 20.0f, 20.0f, i, Integer.valueOf(i2));
            int i3 = R$color.menstrual_c5c5c5;
            NORMAL_TODAY = new Type("NORMAL_TODAY", 2, 20.0f, 20.0f, i3, Integer.valueOf(R$color.menstrual_F5F5F5));
            int i4 = R$color.menstrual_b3ccfc;
            OVULATION_TODAY = new Type("OVULATION_TODAY", 3, 20.0f, 20.0f, i4, Integer.valueOf(R$color.menstrual_93B5FA));
            int i5 = R$color.menstrual_f83465;
            PERIOD_HIGHLIGHT_DAY = new Type("PERIOD_HIGHLIGHT_DAY", 4, 32.0f, 32.0f, i5, Integer.valueOf(i5));
            int i6 = R$color.menstrual_ff769D;
            PREDICT_PERIOD_HIGHLIGHT_DAY = new Type("PREDICT_PERIOD_HIGHLIGHT_DAY", 5, 32.0f, 32.0f, i6, Integer.valueOf(i6));
            NORMAL_HIGHLIGHT_DAY = new Type("NORMAL_HIGHLIGHT_DAY", 6, 32.0f, 32.0f, R$color.menstrual_d9d9d9, Integer.valueOf(R$color.menstrual_888888));
            int i7 = R$color.menstrual_1d58ce;
            OVULATION_HIGHLIGHT_DAY = new Type("OVULATION_HIGHLIGHT_DAY", 7, 32.0f, 32.0f, i7, Integer.valueOf(i7));
            float f = 5.0f;
            float f2 = 5.0f;
            Integer num = null;
            int i8 = 8;
            DefaultConstructorMarker defaultConstructorMarker = null;
            PREDICT_PERIOD_CIRCLE = new Type("PREDICT_PERIOD_CIRCLE", 8, f, f2, R$color.menstrual_ffd7e0, num, i8, defaultConstructorMarker);
            PERIOD_PAST_CIRCLE = new Type("PERIOD_PAST_CIRCLE", 9, 5.0f, 5.0f, i, null, 8, null);
            NORMAL_CIRCLE = new Type("NORMAL_CIRCLE", 10, f, f2, R$color.menstrual_ffffff, num, i8, defaultConstructorMarker);
            NORMAL_PAST_CIRCLE = new Type("NORMAL_PAST_CIRCLE", 11, 5.0f, 5.0f, i3, null, 8, 0 == true ? 1 : 0);
            OVULATION_CIRCLE = new Type("OVULATION_CIRCLE", 12, 5.0f, 5.0f, i4, null, 8, null);
            OVULATION_PAST_CIRCLE = new Type("OVULATION_PAST_CIRCLE", 13, 5.0f, 5.0f, i7, null, 8, null);
            OVULATION_STAR = new Type("OVULATION_STAR", 14, 14.0f, 14.0f, R$drawable.ic_ovulation_day_chart, null, 8, null);
            $VALUES = $values();
        }

        private Type(String str, int i, float f, float f2, int i2, Integer num) {
            super(str, i);
            this.width = f;
            this.height = f2;
            this.colorId = i2;
            this.other = num;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int getColorId() {
            return this.colorId;
        }

        public final float getHeight() {
            return this.height;
        }

        @Nullable
        public final Integer getOther() {
            return this.other;
        }

        public final float getWidth() {
            return this.width;
        }

        public /* synthetic */ Type(String str, int i, float f, float f2, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, f, f2, i2, (i3 & 8) != 0 ? null : num);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.PREDICT_PERIOD_TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.NORMAL_TODAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.OVULATION_TODAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.NORMAL_HIGHLIGHT_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.OVULATION_HIGHLIGHT_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.PERIOD_HIGHLIGHT_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.PREDICT_PERIOD_HIGHLIGHT_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Type.OVULATION_STAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MenstrualDrawable(@NotNull Type type, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.type = type;
        this.text = text;
        this.paint = new Paint(1);
        this.starDrawable = LazyKt__LazyJVMKt.lazy(new Function0<Drawable>() { // from class: com.heytap.health.menstrual_period.view.MenstrualDrawable$starDrawable$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @Nullable
            public final Drawable invoke() {
                return qtf.h(MenstrualDrawable.Type.OVULATION_STAR.getColorId());
            }
        });
        float fConvertDpToPixel = Utils.convertDpToPixel(type.getWidth());
        this.width = fConvertDpToPixel;
        float fConvertDpToPixel2 = Utils.convertDpToPixel(type.getHeight());
        this.height = fConvertDpToPixel2;
        float f = 2;
        this.centerX = fConvertDpToPixel / f;
        this.centerY = fConvertDpToPixel2 / f;
    }

    public final void a(Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(qtf.f(this.type.getColorId()));
        canvas.drawCircle(this.centerX, this.centerY, f(), this.paint);
    }

    public final void b(Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(-1);
        canvas.drawCircle(this.centerX, this.centerY, f(), this.paint);
        this.paint.setColor(qtf.f(this.type.getColorId()));
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        canvas.drawCircle(this.centerX, this.centerY, f(), this.paint);
        d(canvas, this.text);
    }

    public final void c(Canvas canvas) {
        Drawable drawableG = g();
        if (drawableG != null) {
            float f = drawableG instanceof VectorDrawable ? f() : f() / 2;
            float f2 = this.centerX;
            float f3 = this.centerY;
            drawableG.setBounds((int) (f2 - f), (int) (f3 - f), (int) (f2 + f), (int) (f3 + f));
            drawableG.draw(canvas);
        }
    }

    public final void d(Canvas canvas, String text) {
        this.paint.setStyle(Paint.Style.FILL);
        Paint paint = this.paint;
        Integer other = this.type.getOther();
        paint.setColor(other != null ? qtf.f(other.intValue()) : -1);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(bfk.a(14.0f));
        this.paint.setTextAlign(Paint.Align.CENTER);
        RectF rectF = new RectF(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f = 2;
        canvas.drawText(text, rectF.centerX(), (rectF.centerY() - (fontMetrics.top / f)) - (fontMetrics.bottom / f), this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        switch (a.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
            case 2:
            case 3:
                e(canvas);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                b(canvas);
                break;
            case 8:
                c(canvas);
                break;
            default:
                a(canvas);
                break;
        }
    }

    public final void e(Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(qtf.f(this.type.getColorId()));
        canvas.drawCircle(this.centerX, this.centerY, f(), this.paint);
        d(canvas, this.text);
    }

    public final float f() {
        return RangesKt___RangesKt.coerceAtMost(this.width, this.height) / 2;
    }

    public final Drawable g() {
        return (Drawable) this.starDrawable.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public /* synthetic */ MenstrualDrawable(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? "" : str);
    }
}
