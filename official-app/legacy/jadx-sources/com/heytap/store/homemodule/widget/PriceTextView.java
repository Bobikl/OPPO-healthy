package com.heytap.store.homemodule.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.home.R;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "后续使用Widget库中的PriceTextView替代")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001(B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\b\u0010!\u001a\u00020\u001bH\u0002J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/heytap/store/homemodule/widget/PriceTextView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "builder", "Landroid/text/SpannableStringBuilder;", "currTextColor", "currencySymbolSize", ParserTag.CHILD_LAYOUT, "Landroid/text/StaticLayout;", "mediaTextSizeRatio", "", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/text/TextPaint;", "prevTextColor", "screenWidth", "smallTextSizeRatio", "textChanged", "", ParserTag.TAG_TEXT_SIZE, "useCustomFont", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "remakeLayout", "setSmallTextSizeRatio", "ratio", ClickApiEntity.SET_TEXT_SIZE, a8i.UPDATE, "newConfig", "Lcom/heytap/store/homemodule/widget/PriceTextView$Config;", "Config", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PriceTextView extends View {

    @NotNull
    private SpannableStringBuilder builder;
    private final int currTextColor;
    private int currencySymbolSize;

    @Nullable
    private StaticLayout layout;
    private final float mediaTextSizeRatio;

    @NotNull
    private final TextPaint paint;
    private final int prevTextColor;
    private final int screenWidth;
    private float smallTextSizeRatio;
    private boolean textChanged;
    private int textSize;
    private final boolean useCustomFont;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void remakeLayout() {
        SpannableStringBuilder spannableStringBuilder = this.builder;
        this.layout = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.toString().length(), this.paint, this.screenWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null) {
            return;
        }
        staticLayout.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (this.textChanged) {
            remakeLayout();
            this.textChanged = false;
        }
        int iDescent = (int) (this.paint.descent() - this.paint.ascent());
        if (mode != Integer.MIN_VALUE && mode != 0) {
            setMeasuredDimension(size, iDescent);
            return;
        }
        StaticLayout staticLayout = this.layout;
        Integer numValueOf = staticLayout == null ? null : Integer.valueOf((int) staticLayout.getLineWidth(0));
        setMeasuredDimension(numValueOf == null ? this.screenWidth / 2 : numValueOf.intValue(), iDescent);
    }

    public final void setSmallTextSizeRatio(float ratio) {
        this.smallTextSizeRatio = ratio;
    }

    public final void setTextSize(int textSize) {
        this.paint.setTextSize(textSize);
    }

    public final void update(@NotNull Config newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.builder = newConfig.createSpannableStringBuilder$com_heytap_store_business_home_impl(this.textSize, this.mediaTextSizeRatio, this.smallTextSizeRatio, this.currTextColor, this.prevTextColor, this.currencySymbolSize);
        this.textChanged = true;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PriceTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriceTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.builder = new SpannableStringBuilder();
        this.textChanged = true;
        this.screenWidth = DisplayUtil.getScreenWidth(ContextGetterUtils.INSTANCE.getApp());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PriceTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….styleable.PriceTextView)");
        this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceTextView_normalTextSize, 15);
        this.mediaTextSizeRatio = typedArrayObtainStyledAttributes.getFloat(R.styleable.PriceTextView_mediaTextRatio, 0.8f);
        this.smallTextSizeRatio = typedArrayObtainStyledAttributes.getFloat(R.styleable.PriceTextView_smallTextRatio, 0.66f);
        this.currTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_currPriceTextColor, Color.parseColor("#FFF63434"));
        this.prevTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PriceTextView_prevPriceTextColor, Color.parseColor("#FFB2B2B2"));
        this.currencySymbolSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceTextView_currencySymbolSize, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PriceTextView_useCustomFont, true);
        this.useCustomFont = z;
        typedArrayObtainStyledAttributes.recycle();
        textPaint.setTextSize(this.textSize);
        if (z) {
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001!BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ?\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0003H\u0016R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/store/homemodule/widget/PriceTextView$Config;", "", "prefix", "", "currPrice", "currStrikeThrough", "", "suffix", "prevPrice", "prevStrikeThrough", "currencySymbol", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "content", "elements", "", "", "[Ljava/lang/Integer;", "elementsPos", "createSpannableStringBuilder", "Landroid/text/SpannableStringBuilder;", "normalTextSize", "mediaTextSizeRatio", "", "smallTextSizeRatio", "currPriceTextColor", "prevPriceTextColor", "currencySymbolSize", "createSpannableStringBuilder$com_heytap_store_business_home_impl", "getElements", "()[Ljava/lang/Integer;", "getElementsLength", "type", "toString", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Config {
        public static final int ELEMENT_BLOCK = 6;
        public static final int ELEMENT_CURR_CURRENCY_SYMBOL = 1;
        public static final int ELEMENT_CURR_PRICE = 2;
        public static final int ELEMENT_PREFIX = 0;
        public static final int ELEMENT_PREV_CURRENCY_SYMBOL = 4;
        public static final int ELEMENT_PREV_PRICE = 5;
        public static final int ELEMENT_SUFFIX = 3;

        @NotNull
        private final String content;

        @NotNull
        private final String currPrice;
        private final boolean currStrikeThrough;

        @NotNull
        private final String currencySymbol;

        @NotNull
        private final Integer[] elements;

        @NotNull
        private final Integer[] elementsPos;

        @NotNull
        private final String prefix;

        @NotNull
        private final String prevPrice;
        private final boolean prevStrikeThrough;

        @NotNull
        private final String suffix;

        public Config(@NotNull String prefix, @NotNull String currPrice, boolean z, @NotNull String suffix, @NotNull String prevPrice, boolean z2, @NotNull String currencySymbol) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(currPrice, "currPrice");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            Intrinsics.checkNotNullParameter(prevPrice, "prevPrice");
            Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
            this.prefix = prefix;
            this.currPrice = currPrice;
            this.currStrikeThrough = z;
            this.suffix = suffix;
            this.prevPrice = prevPrice;
            this.prevStrikeThrough = z2;
            this.currencySymbol = currencySymbol;
            Integer[] elements = getElements();
            this.elements = elements;
            this.elementsPos = new Integer[elements.length];
            int length = elements.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (i == 0) {
                    this.elementsPos[i] = 0;
                } else {
                    Integer[] numArr = this.elementsPos;
                    int i3 = i - 1;
                    Integer num = numArr[i3];
                    Intrinsics.checkNotNull(num);
                    numArr[i] = Integer.valueOf(num.intValue() + getElementsLength(this.elements[i3].intValue()));
                }
                i = i2;
            }
            this.content = toString();
        }

        public static /* synthetic */ SpannableStringBuilder createSpannableStringBuilder$com_heytap_store_business_home_impl$default(Config config, int i, float f, float f2, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                i4 = 0;
            }
            return config.createSpannableStringBuilder$com_heytap_store_business_home_impl(i, f, f2, i2, i3, i4);
        }

        private final Integer[] getElements() {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.prefix)) {
                arrayList.add(0);
                arrayList.add(6);
            }
            if (!TextUtils.isEmpty(this.currPrice)) {
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(6);
            }
            if (!TextUtils.isEmpty(this.suffix)) {
                arrayList.add(3);
                arrayList.add(6);
            }
            if (!TextUtils.isEmpty(this.prevPrice)) {
                arrayList.add(4);
                arrayList.add(5);
                arrayList.add(6);
            }
            Integer num = (Integer) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
            if (num != null && num.intValue() == 6) {
                arrayList.remove(CollectionsKt__CollectionsKt.getLastIndex(arrayList));
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (Integer[]) array;
        }

        private final int getElementsLength(int type) {
            switch (type) {
                case 0:
                    return this.prefix.length();
                case 1:
                case 4:
                    return this.currencySymbol.length();
                case 2:
                    return this.currPrice.length();
                case 3:
                    return this.suffix.length();
                case 5:
                    return this.prevPrice.length();
                case 6:
                    return 1;
                default:
                    return 0;
            }
        }

        @NotNull
        public final SpannableStringBuilder createSpannableStringBuilder$com_heytap_store_business_home_impl(int normalTextSize, float mediaTextSizeRatio, float smallTextSizeRatio, int currPriceTextColor, int prevPriceTextColor, int currencySymbolSize) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.content);
            int length = this.elements.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                Integer num = this.elementsPos[i];
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                int elementsLength = getElementsLength(this.elements[i].intValue()) + iIntValue;
                if (iIntValue != elementsLength) {
                    int iIntValue2 = this.elements[i].intValue();
                    if (iIntValue2 == 0) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(currPriceTextColor), iIntValue, elementsLength, 33);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(smallTextSizeRatio), iIntValue, elementsLength, 33);
                    } else if (iIntValue2 == 1) {
                        float f = currencySymbolSize == 0 ? smallTextSizeRatio : currencySymbolSize / normalTextSize;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(currPriceTextColor), iIntValue, elementsLength, 33);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f), iIntValue, elementsLength, 33);
                    } else if (iIntValue2 == 2) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(currPriceTextColor), iIntValue, elementsLength, 33);
                        if (this.currStrikeThrough) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, elementsLength, 33);
                        }
                    } else if (iIntValue2 == 3) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(prevPriceTextColor), iIntValue, elementsLength, 33);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(smallTextSizeRatio), iIntValue, elementsLength, 33);
                    } else if (iIntValue2 == 4) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(prevPriceTextColor), iIntValue, elementsLength, 33);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(mediaTextSizeRatio), iIntValue, elementsLength, 33);
                    } else if (iIntValue2 == 5) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(prevPriceTextColor), iIntValue, elementsLength, 33);
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(mediaTextSizeRatio), iIntValue, elementsLength, 33);
                        if (this.prevStrikeThrough) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, elementsLength, 33);
                        }
                    }
                }
                i = i2;
            }
            return spannableStringBuilder;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Integer[] numArr = this.elements;
            int length = numArr.length;
            int i = 0;
            while (i < length) {
                int iIntValue = numArr[i].intValue();
                i++;
                switch (iIntValue) {
                    case 0:
                        sb.append(this.prefix);
                        break;
                    case 1:
                    case 4:
                        sb.append(this.currencySymbol);
                        break;
                    case 2:
                        sb.append(this.currPrice);
                        break;
                    case 3:
                        sb.append(this.suffix);
                        break;
                    case 5:
                        sb.append(this.prevPrice);
                        break;
                    case 6:
                        sb.append(" ");
                        break;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        public /* synthetic */ Config(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, str3, str4, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? "¥" : str5);
        }
    }
}
