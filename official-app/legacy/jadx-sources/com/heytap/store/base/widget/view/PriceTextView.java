package com.heytap.store.base.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.widget.R;
import com.heytap.store.base.widget.font.OppoFont;
import com.heytap.store.base.widget.font.OppoFontUtils;
import com.heytap.store.product.common.utils.NumberUtilsKt;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u00002\u00020\u0001:\u0003@ABB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0014J0\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002JÍ\u0001\u0010-\u001a\u00020\u001c2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010$2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010$2\n\b\u0002\u00104\u001a\u0004\u0018\u00010$2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020$*\u00020\u00072\u0006\u0010?\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "availableWidth", "", "debugPaint", "Landroid/graphics/Paint;", DBHealthReviewPlan.DESC, "Lcom/heytap/store/base/widget/view/PriceDesc;", "drawGroups", "", "Lcom/heytap/store/base/widget/view/PriceTextView$ElementGroup;", "groups", "maxBottom", "mediaTypeface", "Landroid/graphics/Typeface;", "convertGravity", "gravity", "formatSmallMainPriceIfNeeded", "priceDesc", "formatSmallTextSizeIfNeeded", "internalLog", "", "msg", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setPriceDesc", a8i.UPDATE, "mainPrice", "mainPriceColor", "mainNeedCurrencySymbol", "subPrice", "subPriceColor", "subNeedCurrencySymbol", "subStrikeThru", "prefix", "prefixColor", "suffix", "suffixColor", ParserTag.TAG_TEXT_SIZE, "smallSizeRatio", "placeHolderWidthRatio", "currencySymbol", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;)V", "hasFlag", "flag", "Element", "ElementGroup", "PlaceHolderElement", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PriceTextView extends View {
    private float availableWidth;
    private Paint debugPaint;
    private PriceDesc desc;

    @NotNull
    private final List<ElementGroup> drawGroups;

    @NotNull
    private final List<ElementGroup> groups;
    private int maxBottom;

    @Nullable
    private final Typeface mediaTypeface;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceTextView$ElementGroup;", "", "()V", "baseLineYOffsetRatio", "", "getBaseLineYOffsetRatio", "()F", "setBaseLineYOffsetRatio", "(F)V", "children", "", "Lcom/heytap/store/base/widget/view/PriceTextView$Element;", "getChildren", "()Ljava/util/List;", "displayPriority", "", "getDisplayPriority", "()I", "setDisplayPriority", "(I)V", "<set-?>", "maxBottom", "getMaxBottom", ParserTag.TAG_MAX_HEIGHT, "getMaxHeight", "totalWidth", "getTotalWidth", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ElementGroup {
        private float baseLineYOffsetRatio;

        @NotNull
        private final List<Element> children = new ArrayList();
        private int displayPriority;
        private int maxBottom;
        private int maxHeight;
        private int totalWidth;

        public final float getBaseLineYOffsetRatio() {
            return this.baseLineYOffsetRatio;
        }

        @NotNull
        public final List<Element> getChildren() {
            return this.children;
        }

        public final int getDisplayPriority() {
            return this.displayPriority;
        }

        public final int getMaxBottom() {
            Object obj;
            Iterator<T> it = this.children.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int bottom = ((Element) next).getBottom();
                    do {
                        Object next2 = it.next();
                        int bottom2 = ((Element) next2).getBottom();
                        if (bottom < bottom2) {
                            next = next2;
                            bottom = bottom2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Element element = (Element) obj;
            if (element == null) {
                return 0;
            }
            return element.getBottom();
        }

        public final int getMaxHeight() {
            Object obj;
            Iterator<T> it = this.children.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int measuredHeight = ((Element) next).getMeasuredHeight();
                    do {
                        Object next2 = it.next();
                        int measuredHeight2 = ((Element) next2).getMeasuredHeight();
                        if (measuredHeight < measuredHeight2) {
                            next = next2;
                            measuredHeight = measuredHeight2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Element element = (Element) obj;
            if (element == null) {
                return 0;
            }
            return element.getMeasuredHeight();
        }

        public final int getTotalWidth() {
            Iterator<T> it = this.children.iterator();
            int measuredWidth = 0;
            while (it.hasNext()) {
                measuredWidth += ((Element) it.next()).getMeasuredWidth();
            }
            return measuredWidth;
        }

        public final void setBaseLineYOffsetRatio(float f) {
            this.baseLineYOffsetRatio = f;
        }

        public final void setDisplayPriority(int i) {
            this.displayPriority = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceTextView$PlaceHolderElement;", "Lcom/heytap/store/base/widget/view/PriceTextView$Element;", Fields.WIDTH_FIELD, "", "(I)V", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class PlaceHolderElement extends Element {
        public PlaceHolderElement(int i) {
            super("", -16777216, 0, null, false, 24, null);
            setMeasuredWidth(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int convertGravity(int gravity) {
        if (hasFlag(gravity, 3)) {
            return 3;
        }
        int i = 5;
        if (!hasFlag(gravity, 5)) {
            i = 1;
            if (!hasFlag(gravity, 1)) {
                return 3;
            }
        }
        return i;
    }

    private final int formatSmallMainPriceIfNeeded(PriceDesc priceDesc) {
        if (!NumberUtilsKt.isNumber(priceDesc.getMainPrice()) && priceDesc.getSmallMainPrice()) {
            return formatSmallTextSizeIfNeeded(priceDesc);
        }
        PriceDesc priceDesc2 = this.desc;
        if (priceDesc2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc2 = null;
        }
        return priceDesc2.getTextSize();
    }

    private final int formatSmallTextSizeIfNeeded(PriceDesc priceDesc) {
        float smallSizeRatio;
        PriceDesc priceDesc2 = null;
        if (priceDesc.getSmallSizeRatio() <= 0.8f || priceDesc.getSmallSizeRatioNotLimit()) {
            PriceDesc priceDesc3 = this.desc;
            if (priceDesc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc3 = null;
            }
            float textSize = priceDesc3.getTextSize();
            PriceDesc priceDesc4 = this.desc;
            if (priceDesc4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            } else {
                priceDesc2 = priceDesc4;
            }
            smallSizeRatio = textSize * priceDesc2.getSmallSizeRatio();
        } else {
            PriceDesc priceDesc5 = this.desc;
            if (priceDesc5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc5 = null;
            }
            float textSize2 = priceDesc5.getTextSize();
            PriceDesc priceDesc6 = this.desc;
            if (priceDesc6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            } else {
                priceDesc2 = priceDesc6;
            }
            smallSizeRatio = textSize2 * priceDesc2.getSmallSizeRatio() * 0.8f;
        }
        return (int) smallSizeRatio;
    }

    private final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    private final void internalLog(String msg) {
    }

    private final void setPriceDesc(PriceDesc priceDesc) {
        ElementGroup elementGroup;
        ElementGroup elementGroup2;
        ElementGroup elementGroup3;
        int i;
        ElementGroup elementGroup4;
        ElementGroup elementGroup5;
        PriceTextView priceTextView = this;
        priceTextView.desc = priceDesc;
        priceTextView.groups.clear();
        PriceDesc priceDesc2 = priceTextView.desc;
        if (priceDesc2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc2 = null;
        }
        int textSize = priceDesc2.getTextSize();
        float f = textSize;
        PriceDesc priceDesc3 = priceTextView.desc;
        if (priceDesc3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc3 = null;
        }
        int smallSizeRatio = (int) (priceDesc3.getSmallSizeRatio() * f);
        PriceDesc priceDesc4 = priceTextView.desc;
        if (priceDesc4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc4 = null;
        }
        int placeHolderWidthRatio = (int) (f * priceDesc4.getPlaceHolderWidthRatio());
        PriceDesc priceDesc5 = priceTextView.desc;
        if (priceDesc5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc5 = null;
        }
        PriceTextView priceTextView2 = priceDesc5.getPrefix().length() > 0 ? priceTextView : null;
        if (priceTextView2 == null) {
            elementGroup = null;
        } else {
            ElementGroup elementGroup6 = new ElementGroup();
            elementGroup6.setDisplayPriority(20);
            elementGroup6.setBaseLineYOffsetRatio(0.1f);
            List<Element> children = elementGroup6.getChildren();
            PriceDesc priceDesc6 = priceTextView2.desc;
            if (priceDesc6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc6 = null;
            }
            String prefix = priceDesc6.getPrefix();
            PriceDesc priceDesc7 = priceTextView2.desc;
            if (priceDesc7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc7 = null;
            }
            children.add(new Element(prefix, priceDesc7.getPrefixColor(), priceTextView2.formatSmallTextSizeIfNeeded(priceDesc), priceTextView2.mediaTypeface, false, 16, null));
            elementGroup6.getChildren().add(new PlaceHolderElement(placeHolderWidthRatio * 2));
            Unit unit = Unit.INSTANCE;
            elementGroup = elementGroup6;
        }
        PriceDesc priceDesc8 = priceTextView.desc;
        if (priceDesc8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc8 = null;
        }
        PriceTextView priceTextView3 = priceDesc8.getSuffix().length() > 0 ? priceTextView : null;
        if (priceTextView3 == null) {
            elementGroup2 = null;
        } else {
            ElementGroup elementGroup7 = new ElementGroup();
            elementGroup7.setDisplayPriority(30);
            elementGroup7.setBaseLineYOffsetRatio(0.1f);
            elementGroup7.getChildren().add(new PlaceHolderElement(placeHolderWidthRatio * 2));
            List<Element> children2 = elementGroup7.getChildren();
            PriceDesc priceDesc9 = priceTextView3.desc;
            if (priceDesc9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc9 = null;
            }
            String suffix = priceDesc9.getSuffix();
            PriceDesc priceDesc10 = priceTextView3.desc;
            if (priceDesc10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc10 = null;
            }
            children2.add(new Element(suffix, priceDesc10.getSuffixColor(), priceTextView3.formatSmallTextSizeIfNeeded(priceDesc), priceTextView3.mediaTypeface, false, 16, null));
            Unit unit2 = Unit.INSTANCE;
            elementGroup2 = elementGroup7;
        }
        PriceDesc priceDesc11 = priceTextView.desc;
        if (priceDesc11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc11 = null;
        }
        PriceTextView priceTextView4 = priceDesc11.getMainPrice().length() > 0 ? priceTextView : null;
        if (priceTextView4 == null) {
            elementGroup = elementGroup;
            i = smallSizeRatio;
            elementGroup2 = elementGroup2;
            elementGroup4 = null;
        } else {
            ElementGroup elementGroup8 = new ElementGroup();
            elementGroup8.setDisplayPriority(100);
            elementGroup8.setBaseLineYOffsetRatio(priceDesc.getSmallMainPrice() ? 0.1f : 0.0f);
            PriceDesc priceDesc12 = priceTextView4.desc;
            if (priceDesc12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc12 = null;
            }
            if (priceDesc12.getMainNeedCurrencySymbol()) {
                List<Element> children3 = elementGroup8.getChildren();
                PriceDesc priceDesc13 = priceTextView4.desc;
                if (priceDesc13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc13 = null;
                }
                String currencySymbol = priceDesc13.getCurrencySymbol();
                PriceDesc priceDesc14 = priceTextView4.desc;
                if (priceDesc14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc14 = null;
                }
                elementGroup3 = elementGroup8;
                children3.add(new Element(currencySymbol, priceDesc14.getMainPriceColor(), smallSizeRatio, priceTextView4.mediaTypeface, false, 16, null));
                elementGroup3.getChildren().add(new PlaceHolderElement(placeHolderWidthRatio));
            } else {
                elementGroup3 = elementGroup8;
            }
            PriceDesc priceDesc15 = priceTextView4.desc;
            if (priceDesc15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc15 = null;
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) priceDesc15.getMainPrice(), new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                List<Element> children4 = elementGroup3.getChildren();
                String str = (String) CollectionsKt___CollectionsKt.first(listSplit$default);
                PriceDesc priceDesc16 = priceTextView4.desc;
                if (priceDesc16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc16 = null;
                }
                i = smallSizeRatio;
                children4.add(new Element(str, priceDesc16.getMainPriceColor(), textSize, priceTextView4.mediaTypeface, false, 16, null));
                List<Element> children5 = elementGroup3.getChildren();
                String strStringPlus = Intrinsics.stringPlus(".", CollectionsKt___CollectionsKt.last(listSplit$default));
                PriceDesc priceDesc17 = priceTextView4.desc;
                if (priceDesc17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc17 = null;
                }
                children5.add(new Element(strStringPlus, priceDesc17.getMainPriceColor(), i, priceTextView4.mediaTypeface, false, 16, null));
            } else {
                i = smallSizeRatio;
                List<Element> children6 = elementGroup3.getChildren();
                PriceDesc priceDesc18 = priceTextView4.desc;
                if (priceDesc18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc18 = null;
                }
                String mainPrice = priceDesc18.getMainPrice();
                PriceDesc priceDesc19 = priceTextView4.desc;
                if (priceDesc19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc19 = null;
                }
                children6.add(new Element(mainPrice, priceDesc19.getMainPriceColor(), priceTextView4.formatSmallMainPriceIfNeeded(priceDesc), priceTextView4.mediaTypeface, false, 16, null));
            }
            Unit unit3 = Unit.INSTANCE;
            priceTextView = this;
            elementGroup4 = elementGroup3;
        }
        PriceDesc priceDesc20 = priceTextView.desc;
        if (priceDesc20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc20 = null;
        }
        PriceTextView priceTextView5 = priceDesc20.getSubPrice().length() > 0 ? priceTextView : null;
        if (priceTextView5 == null) {
            elementGroup5 = null;
        } else {
            elementGroup5 = new ElementGroup();
            elementGroup5.setDisplayPriority(10);
            elementGroup5.getChildren().add(new PlaceHolderElement(placeHolderWidthRatio * 2));
            PriceDesc priceDesc21 = priceTextView5.desc;
            if (priceDesc21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc21 = null;
            }
            if (priceDesc21.getSubNeedCurrencySymbol()) {
                List<Element> children7 = elementGroup5.getChildren();
                PriceDesc priceDesc22 = priceTextView5.desc;
                if (priceDesc22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc22 = null;
                }
                String currencySymbol2 = priceDesc22.getCurrencySymbol();
                PriceDesc priceDesc23 = priceTextView5.desc;
                if (priceDesc23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc23 = null;
                }
                children7.add(new Element(currencySymbol2, priceDesc23.getSubPriceColor(), i, priceTextView5.mediaTypeface, false, 16, null));
                elementGroup5.getChildren().add(new PlaceHolderElement(placeHolderWidthRatio));
            }
            List<Element> children8 = elementGroup5.getChildren();
            PriceDesc priceDesc24 = priceTextView5.desc;
            if (priceDesc24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc24 = null;
            }
            String subPrice = priceDesc24.getSubPrice();
            PriceDesc priceDesc25 = priceTextView5.desc;
            if (priceDesc25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc25 = null;
            }
            int subPriceColor = priceDesc25.getSubPriceColor();
            PriceDesc priceDesc26 = priceTextView5.desc;
            if (priceDesc26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc26 = null;
            }
            children8.add(new Element(subPrice, subPriceColor, i, priceTextView5.mediaTypeface, priceDesc26.getSubStrikeThru()));
            Unit unit4 = Unit.INSTANCE;
        }
        if (elementGroup != 0) {
            priceTextView.groups.add(elementGroup);
        }
        if (elementGroup4 != null) {
            priceTextView.groups.add(elementGroup4);
        }
        ElementGroup elementGroup9 = elementGroup2;
        if (elementGroup9 != null) {
            priceTextView.groups.add(elementGroup9);
        }
        if (elementGroup5 != null) {
            priceTextView.groups.add(elementGroup5);
        }
        requestLayout();
    }

    public static /* synthetic */ void update$default(PriceTextView priceTextView, String str, Integer num, Boolean bool, String str2, Integer num2, Boolean bool2, Boolean bool3, String str3, Integer num3, String str4, Integer num4, Integer num5, Float f, Float f2, String str5, Integer num6, int i, Object obj) {
        priceTextView.update((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : f, (i & 8192) != 0 ? null : f2, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? null : num6);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<T> it = this.drawGroups.iterator();
        int totalWidth = 0;
        while (it.hasNext()) {
            totalWidth += ((ElementGroup) it.next()).getTotalWidth();
        }
        PriceDesc priceDesc = this.desc;
        if (priceDesc == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
            priceDesc = null;
        }
        int gravity = priceDesc.getGravity();
        float paddingStart = gravity != 1 ? gravity != 5 ? getPaddingStart() : (getWidth() - getPaddingEnd()) - totalWidth : (getWidth() - totalWidth) / 2.0f;
        float height = (getHeight() - getPaddingBottom()) - this.maxBottom;
        for (ElementGroup elementGroup : this.drawGroups) {
            for (Element element : elementGroup.getChildren()) {
                PriceDesc priceDesc2 = this.desc;
                if (priceDesc2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc2 = null;
                }
                float textSize = priceDesc2.getTextSize();
                PriceDesc priceDesc3 = this.desc;
                if (priceDesc3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                    priceDesc3 = null;
                }
                float smallSizeRatio = textSize * priceDesc3.getSmallSizeRatio() * elementGroup.getBaseLineYOffsetRatio();
                boolean z = element instanceof PlaceHolderElement;
                if (!z) {
                    canvas.drawText(element.getText(), paddingStart, height - smallSizeRatio, element.getPaint());
                }
                if (z) {
                    internalLog(Intrinsics.stringPlus("onDraw, placeHolderWidth = ", Integer.valueOf(element.getMeasuredWidth())));
                }
                paddingStart += element.getMeasuredWidth();
                this.availableWidth -= element.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Object obj;
        super.onLayout(changed, left, top, right, bottom);
        this.availableWidth = (getWidth() - getPaddingStart()) - getPaddingEnd();
        internalLog("onLayout width = " + getWidth() + " height = " + getHeight() + " availableWidth = " + this.availableWidth);
        this.drawGroups.clear();
        this.drawGroups.addAll(this.groups);
        while (!this.drawGroups.isEmpty()) {
            Iterator<T> it = this.drawGroups.iterator();
            int totalWidth = 0;
            while (it.hasNext()) {
                totalWidth += ((ElementGroup) it.next()).getTotalWidth();
            }
            if (totalWidth <= this.availableWidth) {
                internalLog("onLayout filter end " + totalWidth + StringUtil.SPACE + this.availableWidth);
                return;
            }
            Iterator<T> it2 = this.drawGroups.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int displayPriority = ((ElementGroup) next).getDisplayPriority();
                    do {
                        Object next2 = it2.next();
                        int displayPriority2 = ((ElementGroup) next2).getDisplayPriority();
                        if (displayPriority > displayPriority2) {
                            next = next2;
                            displayPriority = displayPriority2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            ElementGroup elementGroup = (ElementGroup) obj;
            internalLog(Intrinsics.stringPlus("onLayout removeTarget = ", elementGroup));
            if (elementGroup == null) {
                return;
            } else {
                this.drawGroups.remove(elementGroup);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Object next;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Iterator<ElementGroup> it = this.groups.iterator();
        while (it.hasNext()) {
            for (Element element : it.next().getChildren()) {
                if (!(element instanceof PlaceHolderElement)) {
                    Paint paint = element.getPaint();
                    element.setMeasuredWidth((int) paint.measureText(element.getText()));
                    element.setMeasuredHeight((int) (paint.getFontMetrics().bottom - paint.getFontMetrics().top));
                    element.setBottom((int) paint.getFontMetrics().bottom);
                }
            }
        }
        Iterator<T> it2 = this.groups.iterator();
        int totalWidth = 0;
        while (it2.hasNext()) {
            totalWidth += ((ElementGroup) it2.next()).getTotalWidth();
        }
        int paddingStart = totalWidth + getPaddingStart() + getPaddingEnd();
        Iterator<T> it3 = this.groups.iterator();
        Object next2 = null;
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                int maxHeight = ((ElementGroup) next).getMaxHeight();
                do {
                    Object next3 = it3.next();
                    int maxHeight2 = ((ElementGroup) next3).getMaxHeight();
                    if (maxHeight < maxHeight2) {
                        next = next3;
                        maxHeight = maxHeight2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        ElementGroup elementGroup = (ElementGroup) next;
        int maxHeight3 = (elementGroup == null ? 0 : elementGroup.getMaxHeight()) + getPaddingTop() + getPaddingBottom();
        Iterator<T> it4 = this.groups.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                int maxBottom = ((ElementGroup) next2).getMaxBottom();
                do {
                    Object next4 = it4.next();
                    int maxBottom2 = ((ElementGroup) next4).getMaxBottom();
                    if (maxBottom < maxBottom2) {
                        next2 = next4;
                        maxBottom = maxBottom2;
                    }
                } while (it4.hasNext());
            }
        }
        ElementGroup elementGroup2 = (ElementGroup) next2;
        this.maxBottom = elementGroup2 != null ? elementGroup2.getMaxBottom() : 0;
        internalLog("totalWidth = " + paddingStart + " totalHeight = " + maxHeight3);
        setMeasuredDimension(View.resolveSize(paddingStart, widthMeasureSpec), View.resolveSize(maxHeight3, heightMeasureSpec));
    }

    @JvmOverloads
    public final void update() {
        update$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmOverloads
    public final void update(@Nullable String str) {
        update$default(this, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null);
    }

    public /* synthetic */ PriceTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num) {
        update$default(this, str, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.groups = new ArrayList();
        this.drawGroups = new ArrayList();
        this.mediaTypeface = OppoFontUtils.INSTANCE.getFont(context, OppoFont.SANS_TEXT_MEDIUM_500);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PriceTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….styleable.PriceTextView)");
        PriceDesc priceDesc = new PriceDesc(null, 0, false, null, 0, false, false, null, 0, null, 0, 0, 0.0f, false, false, 0.0f, null, 0, 262143, null);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.PriceTextView_widget_mainPrice);
        priceDesc.setMainPrice(string == null ? "" : string);
        priceDesc.setSmallMainPrice(typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_widget_mainNeedSmall, false));
        priceDesc.setMainPriceColor(typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_widget_mainPriceColor, -16777216));
        priceDesc.setMainNeedCurrencySymbol(typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_widget_mainNeedCurrencySymbol, true));
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.PriceTextView_widget_subPrice);
        priceDesc.setSubPrice(string2 == null ? "" : string2);
        priceDesc.setSubPriceColor(typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_widget_subPriceColor, -16777216));
        priceDesc.setSubNeedCurrencySymbol(typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_widget_subNeedCurrencySymbol, true));
        priceDesc.setSubStrikeThru(typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_widget_subStrikeThru, true));
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.PriceTextView_widget_prefix);
        priceDesc.setPrefix(string3 == null ? "" : string3);
        priceDesc.setPrefixColor(typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_widget_prefixColor, -16777216));
        String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.PriceTextView_widget_suffix);
        priceDesc.setSuffix(string4 != null ? string4 : "");
        priceDesc.setSuffixColor(typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_widget_suffixColor, -16777216));
        priceDesc.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceTextView_widget_textSizeDp, 60));
        priceDesc.setSmallSizeRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.PriceTextView_widget_smallSizeRatio, 0.66f));
        priceDesc.setSmallSizeRatioNotLimit(typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_widget_smallSizeRatioNotLimit, false));
        priceDesc.setPlaceHolderWidthRatio(typedArrayObtainStyledAttributes.getFloat(R.styleable.PriceTextView_widget_placeHolderWidthRatio, 0.125f));
        String string5 = typedArrayObtainStyledAttributes.getString(R.styleable.PriceTextView_widget_currencySymbol);
        priceDesc.setCurrencySymbol(string5 == null ? "¥" : string5);
        priceDesc.setGravity(convertGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.PriceTextView_android_gravity, 3)));
        setPriceDesc(priceDesc);
        typedArrayObtainStyledAttributes.recycle();
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        update$default(this, str, num, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, 65528, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2) {
        update$default(this, str, num, bool, str2, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2) {
        update$default(this, str, num, bool, str2, num2, null, null, null, null, null, null, null, null, null, null, null, 65504, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2) {
        update$default(this, str, num, bool, str2, num2, bool2, null, null, null, null, null, null, null, null, null, null, 65472, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, null, null, null, null, null, null, null, null, null, 65408, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, null, null, null, null, null, null, null, null, 65280, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, null, null, null, null, null, null, null, 65024, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, null, null, null, null, null, null, 64512, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, num4, null, null, null, null, null, 63488, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, num4, num5, null, null, null, null, 61440, null);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0012\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/heytap/store/base/widget/view/PriceTextView$Element;", "", "text", "", ParserTag.TAG_TEXT_COLOR, "", ParserTag.TAG_TEXT_SIZE, ParserTag.TAG_TEXT_TYPEFACE, "Landroid/graphics/Typeface;", "needStrikeThru", "", "(Ljava/lang/String;IILandroid/graphics/Typeface;Z)V", "bottom", "getBottom", "()I", "setBottom", "(I)V", "measuredHeight", "getMeasuredHeight", "setMeasuredHeight", "measuredWidth", "getMeasuredWidth", "setMeasuredWidth", "getNeedStrikeThru", "()Z", "setNeedStrikeThru", "(Z)V", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "getTextColor", ClickApiEntity.SET_TEXT_COLOR, "getTextSize", ClickApiEntity.SET_TEXT_SIZE, "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static class Element {
        private int bottom;
        private int measuredHeight;
        private int measuredWidth;
        private boolean needStrikeThru;

        @NotNull
        private Paint paint;

        @NotNull
        private String text;
        private int textColor;
        private int textSize;

        @Nullable
        private Typeface typeface;

        public Element(@NotNull String text, int i, int i2, @Nullable Typeface typeface, boolean z) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.textColor = i;
            this.textSize = i2;
            this.typeface = typeface;
            this.needStrikeThru = z;
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setTextSize(this.textSize);
            this.paint.setColor(this.textColor);
            if (this.needStrikeThru) {
                Paint paint2 = this.paint;
                paint2.setFlags(paint2.getFlags() | 16);
            } else {
                Paint paint3 = this.paint;
                paint3.setFlags(paint3.getFlags() & (-17));
            }
            Typeface typeface2 = this.typeface;
            if (typeface2 != null) {
                this.paint.setTypeface(typeface2);
            }
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final boolean getNeedStrikeThru() {
            return this.needStrikeThru;
        }

        @NotNull
        public final Paint getPaint() {
            return this.paint;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getTextSize() {
            return this.textSize;
        }

        @Nullable
        public final Typeface getTypeface() {
            return this.typeface;
        }

        public final void setBottom(int i) {
            this.bottom = i;
        }

        public final void setMeasuredHeight(int i) {
            this.measuredHeight = i;
        }

        public final void setMeasuredWidth(int i) {
            this.measuredWidth = i;
        }

        public final void setNeedStrikeThru(boolean z) {
            this.needStrikeThru = z;
        }

        public final void setPaint(@NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(paint, "<set-?>");
            this.paint = paint;
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        public final void setTextColor(int i) {
            this.textColor = i;
        }

        public final void setTextSize(int i) {
            this.textSize = i;
        }

        public final void setTypeface(@Nullable Typeface typeface) {
            this.typeface = typeface;
        }

        public /* synthetic */ Element(String str, int i, int i2, Typeface typeface, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 8) != 0 ? null : typeface, (i3 & 16) != 0 ? false : z);
        }
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Float f) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, num4, num5, f, null, null, null, 57344, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Float f, @Nullable Float f2) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, num4, num5, f, f2, null, null, 49152, null);
    }

    @JvmOverloads
    public final void update(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num2, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str3, @Nullable Integer num3, @Nullable String str4, @Nullable Integer num4, @Nullable Integer num5, @Nullable Float f, @Nullable Float f2, @Nullable String str5) {
        update$default(this, str, num, bool, str2, num2, bool2, bool3, str3, num3, str4, num4, num5, f, f2, str5, null, 32768, null);
    }

    @JvmOverloads
    public final void update(@Nullable String mainPrice, @Nullable Integer mainPriceColor, @Nullable Boolean mainNeedCurrencySymbol, @Nullable String subPrice, @Nullable Integer subPriceColor, @Nullable Boolean subNeedCurrencySymbol, @Nullable Boolean subStrikeThru, @Nullable String prefix, @Nullable Integer prefixColor, @Nullable String suffix, @Nullable Integer suffixColor, @Nullable Integer textSize, @Nullable Float smallSizeRatio, @Nullable Float placeHolderWidthRatio, @Nullable String currencySymbol, @Nullable Integer gravity) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        PriceDesc priceDesc = null;
        if (mainPrice == null) {
            unit = null;
        } else {
            PriceDesc priceDesc2 = this.desc;
            if (priceDesc2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc2 = null;
            }
            priceDesc2.setMainPrice(mainPrice);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            PriceDesc priceDesc3 = this.desc;
            if (priceDesc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc3 = null;
            }
            priceDesc3.setMainPrice("");
        }
        if (mainPriceColor != null) {
            int iIntValue = mainPriceColor.intValue();
            PriceDesc priceDesc4 = this.desc;
            if (priceDesc4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc4 = null;
            }
            priceDesc4.setMainPriceColor(iIntValue);
        }
        if (mainNeedCurrencySymbol != null) {
            boolean zBooleanValue = mainNeedCurrencySymbol.booleanValue();
            PriceDesc priceDesc5 = this.desc;
            if (priceDesc5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc5 = null;
            }
            priceDesc5.setMainNeedCurrencySymbol(zBooleanValue);
        }
        if (subPrice == null) {
            unit2 = null;
        } else {
            PriceDesc priceDesc6 = this.desc;
            if (priceDesc6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc6 = null;
            }
            priceDesc6.setSubPrice(subPrice);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            PriceDesc priceDesc7 = this.desc;
            if (priceDesc7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc7 = null;
            }
            priceDesc7.setSubPrice("");
        }
        if (subPriceColor != null) {
            int iIntValue2 = subPriceColor.intValue();
            PriceDesc priceDesc8 = this.desc;
            if (priceDesc8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc8 = null;
            }
            priceDesc8.setSubPriceColor(iIntValue2);
        }
        if (subNeedCurrencySymbol != null) {
            boolean zBooleanValue2 = subNeedCurrencySymbol.booleanValue();
            PriceDesc priceDesc9 = this.desc;
            if (priceDesc9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc9 = null;
            }
            priceDesc9.setSubNeedCurrencySymbol(zBooleanValue2);
        }
        if (subStrikeThru != null) {
            boolean zBooleanValue3 = subStrikeThru.booleanValue();
            PriceDesc priceDesc10 = this.desc;
            if (priceDesc10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc10 = null;
            }
            priceDesc10.setSubStrikeThru(zBooleanValue3);
        }
        if (prefix == null) {
            unit3 = null;
        } else {
            PriceDesc priceDesc11 = this.desc;
            if (priceDesc11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc11 = null;
            }
            priceDesc11.setPrefix(prefix);
            unit3 = Unit.INSTANCE;
        }
        if (unit3 == null) {
            PriceDesc priceDesc12 = this.desc;
            if (priceDesc12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc12 = null;
            }
            priceDesc12.setPrefix("");
        }
        if (prefixColor != null) {
            int iIntValue3 = prefixColor.intValue();
            PriceDesc priceDesc13 = this.desc;
            if (priceDesc13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc13 = null;
            }
            priceDesc13.setPrefixColor(iIntValue3);
        }
        if (suffix == null) {
            unit4 = null;
        } else {
            PriceDesc priceDesc14 = this.desc;
            if (priceDesc14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc14 = null;
            }
            priceDesc14.setSuffix(suffix);
            unit4 = Unit.INSTANCE;
        }
        if (unit4 == null) {
            PriceDesc priceDesc15 = this.desc;
            if (priceDesc15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc15 = null;
            }
            priceDesc15.setSuffix("");
        }
        if (suffixColor != null) {
            int iIntValue4 = suffixColor.intValue();
            PriceDesc priceDesc16 = this.desc;
            if (priceDesc16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc16 = null;
            }
            priceDesc16.setSuffixColor(iIntValue4);
        }
        if (textSize != null) {
            int iIntValue5 = textSize.intValue();
            PriceDesc priceDesc17 = this.desc;
            if (priceDesc17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc17 = null;
            }
            priceDesc17.setTextSize(iIntValue5);
        }
        if (smallSizeRatio != null) {
            float fFloatValue = smallSizeRatio.floatValue();
            PriceDesc priceDesc18 = this.desc;
            if (priceDesc18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc18 = null;
            }
            priceDesc18.setSmallSizeRatio(fFloatValue);
        }
        if (placeHolderWidthRatio != null) {
            float fFloatValue2 = placeHolderWidthRatio.floatValue();
            PriceDesc priceDesc19 = this.desc;
            if (priceDesc19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc19 = null;
            }
            priceDesc19.setPlaceHolderWidthRatio(fFloatValue2);
        }
        if (currencySymbol != null) {
            PriceDesc priceDesc20 = this.desc;
            if (priceDesc20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc20 = null;
            }
            priceDesc20.setCurrencySymbol(currencySymbol);
        }
        if (gravity != null) {
            int iIntValue6 = gravity.intValue();
            PriceDesc priceDesc21 = this.desc;
            if (priceDesc21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
                priceDesc21 = null;
            }
            priceDesc21.setGravity(convertGravity(iIntValue6));
        }
        PriceDesc priceDesc22 = this.desc;
        if (priceDesc22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(DBHealthReviewPlan.DESC);
        } else {
            priceDesc = priceDesc22;
        }
        setPriceDesc(priceDesc);
    }
}
