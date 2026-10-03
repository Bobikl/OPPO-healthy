package com.heytap.store.base.core.util;

import android.annotation.TargetApi;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.heytap.store.business.component.utils.ViewKtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u00060\bj\u0002`\u0010\u001a%\u0010\u0011\u001a\u00020\u00032\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\u001a\u0012\u0010\u0016\u001a\u00060\bj\u0002`\u00102\u0006\u0010\u000f\u001a\u00020\u0001\u001a^\u0010\u0017\u001a\u00020\u0014*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\u001b\b\u0002\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\n\u0010\u001f\u001a\u00020 *\u00020!\u001a#\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015\u001a)\u0010$\u001a\u00020\u0014*\u00020\u00032\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\u001a)\u0010'\u001a\u00020\u0014*\u00020\u00032\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\u001a)\u0010(\u001a\u00020\u0014*\u00020\u00032\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015H\u0086\bø\u0001\u0000\u001a#\u0010+\u001a\u00020\u0014*\u00020\u00032\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u0015\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\b8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r*\n\u0010-\"\u00020\b2\u00020\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"value", "Lcom/heytap/store/base/core/util/Shape;", "shapeEnum", "Landroid/graphics/drawable/GradientDrawable;", "getShapeEnum", "(Landroid/graphics/drawable/GradientDrawable;)Lcom/heytap/store/base/core/util/Shape;", "setShapeEnum", "(Landroid/graphics/drawable/GradientDrawable;Lcom/heytap/store/base/core/util/Shape;)V", "", "shapeSolidColor", "getShapeSolidColor", "(Landroid/graphics/drawable/GradientDrawable;)I", "setShapeSolidColor", "(Landroid/graphics/drawable/GradientDrawable;I)V", "fromInt", "s", "Lcom/heytap/store/base/core/util/ShapeInt;", "shapeDrawable", "fill", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "toInt", "commonShape", "Landroid/view/View;", "solidColor", "radius", "", "strokeColor", "strokeWidth", "(Landroid/view/View;ILjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "render", "", "Lcom/heytap/store/base/core/util/Corners;", "shapeGradient", "Lcom/heytap/store/base/core/util/Gradient;", "shapePadding", "setPadding", "Lcom/heytap/store/base/core/util/ShapePadding;", "shapeRadius", "shapeSize", "setSize", "Lcom/heytap/store/base/core/util/OvalSize;", "shapeStroke", "Lcom/heytap/store/base/core/util/Stroke;", "ShapeInt", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ShapeKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shape.values().length];
            iArr[Shape.RECTANGLE.ordinal()] = 1;
            iArr[Shape.OVAL.ordinal()] = 2;
            iArr[Shape.LINE.ordinal()] = 3;
            iArr[Shape.RING.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void commonShape(@NotNull View view, int i, @Nullable Float f, @Nullable Integer num, @Nullable Integer num2, @NotNull Function1<? super GradientDrawable, Unit> fill) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fill, "fill");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        setShapeEnum(gradientDrawable, Shape.RECTANGLE);
        setShapeSolidColor(gradientDrawable, i);
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        if (num2 != null && num != null) {
            gradientDrawable.setStroke(num2.intValue(), num.intValue());
        }
        fill.invoke(gradientDrawable);
        view.setBackground(gradientDrawable);
    }

    public static /* synthetic */ void commonShape$default(View view, int i, Float f, Integer num, Integer num2, Function1 fill, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) != 0) {
            fill = new Function1<GradientDrawable, Unit>() { // from class: com.heytap.store.base.core.util.ShapeKt.commonShape.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GradientDrawable gradientDrawable) {
                    Intrinsics.checkNotNullParameter(gradientDrawable, "$this$null");
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GradientDrawable gradientDrawable) {
                    invoke2(gradientDrawable);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fill, "fill");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        setShapeEnum(gradientDrawable, Shape.RECTANGLE);
        setShapeSolidColor(gradientDrawable, i);
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        if (num2 != null && num != null) {
            gradientDrawable.setStroke(num2.intValue(), num.intValue());
        }
        fill.invoke(gradientDrawable);
        view.setBackground(gradientDrawable);
    }

    @Nullable
    public static final Shape fromInt(int i) {
        if (i == 0) {
            return Shape.RECTANGLE;
        }
        if (i == 1) {
            return Shape.OVAL;
        }
        if (i == 2) {
            return Shape.LINE;
        }
        if (i != 3) {
            return null;
        }
        return Shape.RING;
    }

    @TargetApi(24)
    @NotNull
    public static final Shape getShapeEnum(@NotNull GradientDrawable gradientDrawable) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Shape shapeFromInt = fromInt(gradientDrawable.getShape());
        if (shapeFromInt != null) {
            return shapeFromInt;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Illegal shape int ", Integer.valueOf(gradientDrawable.getShape())).toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = ViewKtKt.NO_GETTER)
    public static final /* synthetic */ int getShapeSolidColor(GradientDrawable gradientDrawable) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        throw new IllegalStateException(ViewKtKt.NO_GETTER.toString());
    }

    @NotNull
    public static final float[] render(@NotNull Corners corners) {
        Intrinsics.checkNotNullParameter(corners, "<this>");
        return new float[]{corners.orRadius$Core_release(corners.getTopLeft()), corners.orRadius$Core_release(corners.getTopLeft()), corners.orRadius$Core_release(corners.getTopRight()), corners.orRadius$Core_release(corners.getTopRight()), corners.orRadius$Core_release(corners.getBottomRight()), corners.orRadius$Core_release(corners.getBottomRight()), corners.orRadius$Core_release(corners.getBottomLeft()), corners.orRadius$Core_release(corners.getBottomLeft())};
    }

    public static final void setShapeEnum(@NotNull GradientDrawable gradientDrawable, @NotNull Shape value) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        gradientDrawable.setShape(toInt(value));
    }

    public static final void setShapeSolidColor(@NotNull GradientDrawable gradientDrawable, int i) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        gradientDrawable.setColor(i);
    }

    @NotNull
    public static final GradientDrawable shapeDrawable(@NotNull Function1<? super GradientDrawable, Unit> fill) {
        Intrinsics.checkNotNullParameter(fill, "fill");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        fill.invoke(gradientDrawable);
        return gradientDrawable;
    }

    public static final void shapeGradient(@NotNull GradientDrawable gradientDrawable, @NotNull Function1<? super Gradient, Unit> fill) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(fill, "fill");
        Gradient gradient = new Gradient();
        fill.invoke(gradient);
        gradientDrawable.setOrientation(gradient.getOrientation());
        gradientDrawable.setColors(new int[]{gradient.getStartColor(), gradient.getEndColor()});
    }

    public static final void shapePadding(@NotNull GradientDrawable gradientDrawable, @NotNull Function1<? super ShapePadding, Unit> setPadding) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(setPadding, "setPadding");
        ShapePadding shapePadding = new ShapePadding();
        setPadding.invoke(shapePadding);
        gradientDrawable.setPadding(shapePadding.getStartPadding(), shapePadding.getTopPadding(), shapePadding.getEndPadding(), shapePadding.getBottomPadding());
    }

    public static final void shapeRadius(@NotNull GradientDrawable gradientDrawable, @NotNull Function1<? super Corners, Unit> fill) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(fill, "fill");
        Corners corners = new Corners();
        fill.invoke(corners);
        gradientDrawable.setCornerRadii(render(corners));
    }

    public static final void shapeSize(@NotNull GradientDrawable gradientDrawable, @NotNull Function1<? super OvalSize, Unit> setSize) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(setSize, "setSize");
        OvalSize ovalSize = new OvalSize();
        setSize.invoke(ovalSize);
        gradientDrawable.setSize(ovalSize.getWidth(), ovalSize.getHeight());
    }

    public static final void shapeStroke(@NotNull GradientDrawable gradientDrawable, @NotNull Function1<? super Stroke, Unit> fill) {
        Intrinsics.checkNotNullParameter(gradientDrawable, "<this>");
        Intrinsics.checkNotNullParameter(fill, "fill");
        Stroke stroke = new Stroke();
        fill.invoke(stroke);
        gradientDrawable.setStroke(stroke.getWidth(), stroke.getColor(), stroke.getDashWidth(), stroke.getDashGap());
    }

    public static final int toInt(@NotNull Shape s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int i = WhenMappings.$EnumSwitchMapping$0[s.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
