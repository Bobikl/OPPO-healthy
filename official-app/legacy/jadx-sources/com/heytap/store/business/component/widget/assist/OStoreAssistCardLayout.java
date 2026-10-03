package com.heytap.store.business.component.widget.assist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.entity.OStoreAssistCardEntity;
import com.heytap.store.business.component.utils.ScreenParamUtilKt;
import com.heytap.store.business.component.utils.ViewKtKt;
import com.heytap.store.business.component.widget.assist.OStoreAssistCardLayout;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\bH\u0002J\u001e\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010bH\u0002J\u0010\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u000201H\u0002J\b\u0010h\u001a\u00020_H\u0014J\u0010\u0010i\u001a\u00020_2\u0006\u0010`\u001a\u00020\bH\u0016J\u0010\u0010j\u001a\u00020_2\b\u0010k\u001a\u0004\u0018\u00010lR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010%\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010'\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001a\u0010)\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010,R\u0014\u00100\u001a\u000201X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010,R\u001a\u00107\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010,R\u001a\u0010:\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010,R\u0014\u0010=\u001a\u000201X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u001a\u0010?\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010,R\u001a\u0010B\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010,R\u0011\u0010E\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0018R\u001a\u0010G\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010,R\u0014\u0010J\u001a\u000201X\u0086D¢\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010R\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR\u001c\u0010U\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR\u001c\u0010X\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010O\"\u0004\bZ\u0010QR\u001c\u0010[\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010Q¨\u0006m"}, d2 = {"Lcom/heytap/store/business/component/widget/assist/OStoreAssistCardLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/heytap/store/business/component/widget/assist/IAssistScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "card_img", "Landroidx/appcompat/widget/AppCompatImageView;", "getCard_img", "()Landroidx/appcompat/widget/AppCompatImageView;", "setCard_img", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "cl_ext", "Landroidx/appcompat/widget/LinearLayoutCompat;", "getCl_ext", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "setCl_ext", "(Landroidx/appcompat/widget/LinearLayoutCompat;)V", "imgDistanceEnd", "getImgDistanceEnd", "()I", "imgDistanceTop", "getImgDistanceTop", "imgDistanceWidth", "getImgDistanceWidth", "imgMaxEnd", "getImgMaxEnd", "imgMaxTop", "getImgMaxTop", "imgMinEnd", "getImgMinEnd", "imgMinTop", "getImgMinTop", "img_big_width", "getImg_big_width", "img_small_width", "getImg_small_width", "marginLeftDistance", "getMarginLeftDistance", "setMarginLeftDistance", "(I)V", "marginTopDistance", "getMarginTopDistance", "setMarginTopDistance", "maxScale", "", "getMaxScale", "()F", "maxScrollWidth", "getMaxScrollWidth", "setMaxScrollWidth", "maxTitleLeftMargin", "getMaxTitleLeftMargin", "setMaxTitleLeftMargin", "maxTitleTopMargin", "getMaxTitleTopMargin", "setMaxTitleTopMargin", "minScale", "getMinScale", "minScrollWidth", "getMinScrollWidth", "setMinScrollWidth", "minTitleLeftMargin", "getMinTitleLeftMargin", "setMinTitleLeftMargin", "minTitleTopMargin", "getMinTitleTopMargin", "position", "getPosition", "setPosition", "scaleDistance", "getScaleDistance", "tv_btn", "Landroid/widget/TextView;", "getTv_btn", "()Landroid/widget/TextView;", "setTv_btn", "(Landroid/widget/TextView;)V", "tv_content", "getTv_content", "setTv_content", "tv_ext_content", "getTv_ext_content", "setTv_ext_content", "tv_ext_desc", "getTv_ext_desc", "setTv_ext_desc", "tv_title", "getTv_title", "setTv_title", "changeChildView", "", "dx", "createBtnDrawable", "Landroid/graphics/drawable/GradientDrawable;", "color", "", ResourcesUtil.ResourceType.DRAWABLE, "getWidthForValue", "value", "onFinishInflate", "onScrollChange", "setData", "data", "Lcom/heytap/store/business/component/entity/OStoreAssistCardEntity;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreAssistCardLayout extends ConstraintLayout implements IAssistScrollView {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private AppCompatImageView card_img;

    @Nullable
    private LinearLayoutCompat cl_ext;
    private final int imgDistanceEnd;
    private final int imgDistanceTop;
    private final int imgDistanceWidth;
    private final int imgMaxEnd;
    private final int imgMaxTop;
    private final int imgMinEnd;
    private final int imgMinTop;
    private final int img_big_width;
    private final int img_small_width;
    private int marginLeftDistance;
    private int marginTopDistance;
    private final float maxScale;
    private int maxScrollWidth;
    private int maxTitleLeftMargin;
    private int maxTitleTopMargin;
    private final float minScale;
    private int minScrollWidth;
    private int minTitleLeftMargin;
    private final int minTitleTopMargin;
    private int position;
    private final float scaleDistance;

    @Nullable
    private TextView tv_btn;

    @Nullable
    private TextView tv_content;

    @Nullable
    private TextView tv_ext_content;

    @Nullable
    private TextView tv_ext_desc;

    @Nullable
    private TextView tv_title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreAssistCardLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeChildView(int dx) {
        int maxScrollWidth;
        int maxScrollWidth2;
        int minScrollWidth;
        boolean z;
        int i;
        int maxScrollWidth3;
        int left;
        float minScale;
        int iAbs;
        float minScale2;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.c_card_layout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            iAbs = 100;
        } else {
            int i2 = R.id.tag_offset;
            Object tag = getTag(i2);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            int iIntValue = (num == null ? ((ViewGroup.MarginLayoutParams) layoutParams2).width : num.intValue()) - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            if (iIntValue == 0) {
                iIntValue = Math.abs(getLeft());
            }
            LogUtils logUtils = LogUtils.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append((char) 31532);
            sb.append(getPosition());
            sb.append("的最大偏移量:");
            sb.append(iIntValue);
            sb.append(",当前偏移量:");
            sb.append(getLeft());
            sb.append("，tag是否为空：");
            Object tag2 = getTag(i2);
            sb.append(tag2 instanceof Integer ? (Integer) tag2 : null);
            logUtils.d("ComputerAssistLayout", sb.toString());
            getMaxScale();
            if (getLeft() < 0) {
                int i3 = iIntValue / (-2);
                if (getLeft() <= i3) {
                    minScale2 = getMaxScale() - (((100 - Math.abs(((getLeft() - i3) * 100) / i3)) * getScaleDistance()) / 100.0f);
                } else {
                    minScale2 = getMinScale() + ((Math.abs(((i3 - getLeft()) * 100) / i3) * getScaleDistance()) / 100.0f);
                }
                logUtils.d("ComputerAssistLayout", getPosition() + "当前屏幕外的缩放系数" + minScale2);
                iAbs = Math.abs((getLeft() * 100) / iIntValue);
            } else {
                int maxScrollWidth4 = getMaxScrollWidth();
                int left2 = getLeft();
                if (left2 >= 0 && left2 < maxScrollWidth4) {
                    maxScrollWidth3 = getMaxScrollWidth();
                    left = (getLeft() * 100) / maxScrollWidth3;
                    i = 0;
                    z = true;
                } else {
                    if (getLeft() < getMaxScrollWidth() || getLeft() >= getMaxScrollWidth() + getMinScrollWidth()) {
                        maxScrollWidth = getMaxScrollWidth() + getMinScrollWidth();
                        maxScrollWidth2 = getMaxScrollWidth();
                        minScrollWidth = getMinScrollWidth() * 2;
                    } else {
                        maxScrollWidth = getMaxScrollWidth();
                        maxScrollWidth2 = getMaxScrollWidth();
                        minScrollWidth = getMinScrollWidth();
                    }
                    int i4 = maxScrollWidth2 + minScrollWidth;
                    z = false;
                    i = maxScrollWidth;
                    maxScrollWidth3 = i4;
                    left = 100;
                }
                int i5 = (maxScrollWidth3 - i) / 2;
                int left3 = getLeft() - i;
                if (left3 <= i5) {
                    minScale = getMaxScale() - (((100 - Math.abs(((i5 - left3) * 100) / i5)) * getScaleDistance()) / 100.0f);
                } else {
                    minScale = getMinScale() + ((Math.abs(((i5 - left3) * 100) / i5) * getScaleDistance()) / 100.0f);
                }
                logUtils.d("ComputerAssistLayout", getPosition() + "当前屏幕内缩放系数" + minScale + "--left:" + getLeft() + ",endOffset:" + maxScrollWidth3 + ",,realStartLeft:" + left3 + ",,startOffset:" + i + ",,endOffset:" + maxScrollWidth3 + ",maxScrollWidth:" + getMaxScrollWidth() + ",minScrollWidth:" + getMinScrollWidth());
                if (z) {
                    logUtils.d(Intrinsics.stringPlus("缩放系数变化:", Integer.valueOf(getPosition())), String.valueOf(minScale));
                    TextView tv_title = getTv_title();
                    if (tv_title != null) {
                        tv_title.setAlpha(minScale - 0.2142f);
                    }
                }
                iAbs = left;
                minScale2 = minScale;
            }
            if (dx != 0) {
                constraintLayout.setScaleX(minScale2);
                constraintLayout.setScaleY(minScale2);
            }
        }
        AppCompatImageView appCompatImageView = this.card_img;
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView == null ? null : appCompatImageView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            int imgMaxEnd = getImgMaxEnd() - ((getImgDistanceEnd() * iAbs) / 100);
            LogUtils logUtils2 = LogUtils.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            TextView tv_title2 = getTv_title();
            sb2.append((Object) (tv_title2 == null ? null : tv_title2.getText()));
            sb2.append("当前的边距");
            sb2.append(imgMaxEnd);
            sb2.append(",imgMaxEnd:");
            sb2.append(getImgMaxEnd());
            sb2.append(",imgMinEnd:");
            sb2.append(getImgMinEnd());
            sb2.append(",scrollPercent:");
            sb2.append(iAbs);
            logUtils2.d("图片边距调试", sb2.toString());
            layoutParams4.setMargins(((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, getImgMinTop() + ((getImgDistanceTop() * iAbs) / 100), imgMaxEnd, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
            float maxScrollWidth5 = ((getMaxScrollWidth() * iAbs) / 100) / getMaxScrollWidth();
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = getImg_big_width() - ((int) (getImgDistanceWidth() * maxScrollWidth5));
            ((ViewGroup.MarginLayoutParams) layoutParams4).height = getImg_big_width() - ((int) (getImgDistanceWidth() * maxScrollWidth5));
            AppCompatImageView card_img = getCard_img();
            if (card_img != null) {
                card_img.setLayoutParams(layoutParams4);
            }
        }
        TextView textView = this.tv_title;
        ViewGroup.LayoutParams layoutParams5 = textView == null ? null : textView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            LogUtils logUtils3 = LogUtils.INSTANCE;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("设置的的的title:");
            TextView tv_title3 = getTv_title();
            sb3.append((Object) (tv_title3 == null ? null : tv_title3.getText()));
            sb3.append(",maxLeft:");
            sb3.append(getMaxTitleLeftMargin());
            sb3.append("--minTitleLeftMargin:");
            sb3.append(getMinTitleLeftMargin());
            sb3.append("---marginLeftDistance：");
            sb3.append(getMarginLeftDistance());
            logUtils3.d("cardLayout", sb3.toString());
            layoutParams6.setMargins(getMinTitleLeftMargin() + ((getMarginLeftDistance() * iAbs) / 100), getMaxTitleTopMargin() - ((getMarginTopDistance() * iAbs) / 100), ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
            TextView tv_title4 = getTv_title();
            if (tv_title4 != null) {
                tv_title4.setLayoutParams(layoutParams6);
            }
        }
        if (getLeft() <= this.maxScrollWidth) {
            float f = iAbs >= 0 && iAbs < 51 ? 1.0f - ((iAbs * 2.0f) / 100.0f) : 0.0f;
            TextView textView2 = this.tv_content;
            if (textView2 != null) {
                textView2.setAlpha(f);
            }
            LinearLayoutCompat linearLayoutCompat = this.cl_ext;
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setAlpha(f);
            }
            TextView textView3 = this.tv_btn;
            if (textView3 != null) {
                textView3.setAlpha(f);
            }
        } else {
            TextView textView4 = this.tv_content;
            if (textView4 != null) {
                textView4.setAlpha(0.0f);
            }
            LinearLayoutCompat linearLayoutCompat2 = this.cl_ext;
            if (linearLayoutCompat2 != null) {
                linearLayoutCompat2.setAlpha(0.0f);
            }
            TextView textView5 = this.tv_btn;
            if (textView5 != null) {
                textView5.setAlpha(0.0f);
            }
        }
        LogUtils logUtils4 = LogUtils.INSTANCE;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("当前");
        TextView textView6 = this.tv_title;
        sb4.append((Object) (textView6 != null ? textView6.getText() : null));
        sb4.append("的滚动百分比:");
        sb4.append(iAbs);
        logUtils4.d("changeChildView", sb4.toString());
    }

    private final GradientDrawable createBtnDrawable(String color, GradientDrawable drawable) {
        if (color == null || color.length() == 0) {
            return null;
        }
        if (drawable == null) {
            try {
                drawable = new GradientDrawable();
            } catch (Exception unused) {
                return null;
            }
        }
        drawable.setShape(0);
        drawable.setColor(Color.parseColor(color));
        drawable.setCornerRadius(getWidthForValue(36.0f));
        return drawable;
    }

    private final int getWidthForValue(float value) {
        if (ScreenParamUtilKt.isPad(getContext())) {
            return DisplayUtil.dip2px(value);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return AssistExpKt.getAssistCardWidthChangeValue(value, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onScrollChange$lambda-0, reason: not valid java name */
    public static final void m4861onScrollChange$lambda0(OStoreAssistCardLayout this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeChildView(i);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Nullable
    public final AppCompatImageView getCard_img() {
        return this.card_img;
    }

    @Nullable
    public final LinearLayoutCompat getCl_ext() {
        return this.cl_ext;
    }

    public final int getImgDistanceEnd() {
        return this.imgDistanceEnd;
    }

    public final int getImgDistanceTop() {
        return this.imgDistanceTop;
    }

    public final int getImgDistanceWidth() {
        return this.imgDistanceWidth;
    }

    public final int getImgMaxEnd() {
        return this.imgMaxEnd;
    }

    public final int getImgMaxTop() {
        return this.imgMaxTop;
    }

    public final int getImgMinEnd() {
        return this.imgMinEnd;
    }

    public final int getImgMinTop() {
        return this.imgMinTop;
    }

    public final int getImg_big_width() {
        return this.img_big_width;
    }

    public final int getImg_small_width() {
        return this.img_small_width;
    }

    public final int getMarginLeftDistance() {
        return this.marginLeftDistance;
    }

    public final int getMarginTopDistance() {
        return this.marginTopDistance;
    }

    public final float getMaxScale() {
        return this.maxScale;
    }

    public final int getMaxScrollWidth() {
        return this.maxScrollWidth;
    }

    public final int getMaxTitleLeftMargin() {
        return this.maxTitleLeftMargin;
    }

    public final int getMaxTitleTopMargin() {
        return this.maxTitleTopMargin;
    }

    public final float getMinScale() {
        return this.minScale;
    }

    public final int getMinScrollWidth() {
        return this.minScrollWidth;
    }

    public final int getMinTitleLeftMargin() {
        return this.minTitleLeftMargin;
    }

    public final int getMinTitleTopMargin() {
        return this.minTitleTopMargin;
    }

    public final int getPosition() {
        return this.position;
    }

    public final float getScaleDistance() {
        return this.scaleDistance;
    }

    @Nullable
    public final TextView getTv_btn() {
        return this.tv_btn;
    }

    @Nullable
    public final TextView getTv_content() {
        return this.tv_content;
    }

    @Nullable
    public final TextView getTv_ext_content() {
        return this.tv_ext_content;
    }

    @Nullable
    public final TextView getTv_ext_desc() {
        return this.tv_ext_desc;
    }

    @Nullable
    public final TextView getTv_title() {
        return this.tv_title;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.c_card_layout);
        this.tv_title = (TextView) findViewById(R.id.c_card_title);
        this.tv_content = (TextView) findViewById(R.id.c_card_sub_content);
        this.tv_btn = (TextView) findViewById(R.id.c_card_btn);
        this.card_img = (AppCompatImageView) findViewById(R.id.c_card_img);
        this.cl_ext = (LinearLayoutCompat) findViewById(R.id.c_card_sub_tag_layout);
        this.tv_ext_content = (TextView) findViewById(R.id.c_card_sub_ext_content);
        this.tv_ext_desc = (TextView) findViewById(R.id.c_card_sub_ext_desc);
        boolean zIsPad = ScreenParamUtilKt.isPad(getContext());
        if (constraintLayout != null) {
            ViewKtKt.addOutlineProvider(constraintLayout, zIsPad ? DisplayUtil.dip2px(8.0f) : getWidthForValue(8.0f));
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(zIsPad ? DisplayUtil.dip2px(4.0f) : getWidthForValue(4.0f));
                constraintLayout.setLayoutParams(layoutParams2);
            }
        }
        AppCompatImageView appCompatImageView = this.card_img;
        if (appCompatImageView == null) {
            return;
        }
        ViewKtKt.addOutlineProvider(appCompatImageView, zIsPad ? DisplayUtil.dip2px(4.0f) : getWidthForValue(4.0f));
    }

    @Override // com.heytap.store.business.component.widget.assist.IAssistScrollView
    public void onScrollChange(final int dx) {
        post(new Runnable() { // from class: com.oplus.aiunit.vision.h4d
            @Override // java.lang.Runnable
            public final void run() {
                OStoreAssistCardLayout.m4861onScrollChange$lambda0(this.i, dx);
            }
        });
    }

    public final void setCard_img(@Nullable AppCompatImageView appCompatImageView) {
        this.card_img = appCompatImageView;
    }

    public final void setCl_ext(@Nullable LinearLayoutCompat linearLayoutCompat) {
        this.cl_ext = linearLayoutCompat;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    public final void setData(@Nullable OStoreAssistCardEntity data) {
        boolean z;
        TextPaint paint;
        TextView tv_btn;
        TextView tv_ext_desc;
        TextView tv_ext_content;
        TextView textView = this.tv_content;
        String str = "";
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.tv_ext_content;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.tv_ext_desc;
        if (textView3 != null) {
            textView3.setText("");
        }
        if (data == null) {
            return;
        }
        String titleExt = data.getTitleExt();
        boolean z2 = true;
        if (titleExt != null) {
            if (titleExt.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            String secondTitle = data.getSecondTitle();
            if (secondTitle != null && (tv_ext_content = getTv_ext_content()) != null) {
                tv_ext_content.setText(secondTitle);
            }
            String titleExt2 = data.getTitleExt();
            if (titleExt2 != null && (tv_ext_desc = getTv_ext_desc()) != null) {
                tv_ext_desc.setText(titleExt2);
            }
            TextView tv_content = getTv_content();
            if (tv_content != null) {
                tv_content.setVisibility(4);
            }
            LinearLayoutCompat cl_ext = getCl_ext();
            if (cl_ext != null) {
                cl_ext.setVisibility(0);
            }
        } else {
            TextView tv_content2 = getTv_content();
            if (tv_content2 != null) {
                String secondTitle2 = data.getSecondTitle();
                tv_content2.setVisibility(secondTitle2 == null || secondTitle2.length() == 0 ? 4 : 0);
            }
            LinearLayoutCompat cl_ext2 = getCl_ext();
            if (cl_ext2 != null) {
                cl_ext2.setVisibility(4);
            }
            TextView tv_content3 = getTv_content();
            if (tv_content3 != null) {
                String secondTitle3 = data.getSecondTitle();
                if (secondTitle3 == null) {
                    secondTitle3 = "";
                }
                tv_content3.setText(secondTitle3);
            }
        }
        if (!ScreenParamUtilKt.isPad(getContext())) {
            TextView tv_content4 = getTv_content();
            if (tv_content4 != null) {
                tv_content4.setAlpha(0.0f);
            }
            LinearLayoutCompat cl_ext3 = getCl_ext();
            if (cl_ext3 != null) {
                cl_ext3.setAlpha(0.0f);
            }
            TextView tv_btn2 = getTv_btn();
            if (tv_btn2 != null) {
                tv_btn2.setAlpha(0.0f);
            }
        }
        TextView tv_btn3 = getTv_btn();
        if (tv_btn3 != null) {
            String buttonDesc = data.getButtonDesc();
            if (buttonDesc == null) {
                buttonDesc = "";
            }
            tv_btn3.setText(buttonDesc);
        }
        String buttonDesc2 = data.getButtonDesc();
        Float fValueOf = null;
        if (buttonDesc2 == null || buttonDesc2.length() == 0) {
            TextView tv_content5 = getTv_content();
            if (tv_content5 != null) {
                tv_content5.setMaxLines(2);
            }
            TextView tv_content6 = getTv_content();
            if (tv_content6 != null) {
                tv_content6.setMaxWidth(getWidthForValue(72.0f));
            }
            TextView tv_content7 = getTv_content();
            if (tv_content7 != null) {
                tv_content7.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            TextView tv_content8 = getTv_content();
            if (tv_content8 != null) {
                tv_content8.setMaxLines(1);
            }
            TextView tv_content9 = getTv_content();
            if (tv_content9 != null) {
                tv_content9.setMaxWidth(getWidthForValue(84.0f));
            }
            TextView tv_content10 = getTv_content();
            if (tv_content10 != null) {
                tv_content10.setEllipsize(null);
            }
        }
        String buttonDesc3 = data.getButtonDesc();
        setMaxTitleTopMargin(getWidthForValue(buttonDesc3 == null || buttonDesc3.length() == 0 ? 16.0f : 14.0f));
        setMarginTopDistance(getMaxTitleTopMargin() - getMinTitleTopMargin());
        TextView tv_btn4 = getTv_btn();
        if (tv_btn4 != null) {
            String buttonDesc4 = data.getButtonDesc();
            if (buttonDesc4 != null && buttonDesc4.length() != 0) {
                z2 = false;
            }
            tv_btn4.setVisibility(z2 ? 4 : 0);
        }
        TextView tv_btn5 = getTv_btn();
        Drawable background = tv_btn5 == null ? null : tv_btn5.getBackground();
        GradientDrawable gradientDrawableCreateBtnDrawable = createBtnDrawable("#000000", background instanceof GradientDrawable ? (GradientDrawable) background : null);
        if (gradientDrawableCreateBtnDrawable != null && (tv_btn = getTv_btn()) != null) {
            tv_btn.setBackgroundDrawable(gradientDrawableCreateBtnDrawable);
        }
        AppCompatImageView card_img = getCard_img();
        if (card_img != null) {
            String pic = data.getPic();
            if (pic == null) {
                pic = "";
            }
            LoadStep.into$default(ImageLoader.load(pic).placeholder(R.drawable.icon_assist_card_default_bg), card_img, null, 2, null);
        }
        String title = data.getTitle();
        String str2 = str;
        if (title != null) {
            str2 = title;
        }
        int length = str2.length();
        String strSubSequence = str2;
        if (length > 4) {
            strSubSequence = str2.subSequence(0, 4);
        }
        TextView tv_title = getTv_title();
        if (tv_title != null) {
            tv_title.setText(strSubSequence);
        }
        TextView tv_title2 = getTv_title();
        if (tv_title2 != null && (paint = tv_title2.getPaint()) != null) {
            fValueOf = Float.valueOf(paint.measureText(strSubSequence.toString()));
        }
        if (fValueOf == null) {
            return;
        }
        setMaxTitleLeftMargin((getWidthForValue(66.0f) - ((int) fValueOf.floatValue())) / 2);
        setMarginLeftDistance(getMaxTitleLeftMargin() - getMinTitleLeftMargin());
        LogUtils.INSTANCE.d("cardLayout", "初始化的的title:" + ((Object) data.getTitle()) + ",maxLeft:" + getMaxTitleLeftMargin() + "--minTitleLeftMargin:" + getMinTitleLeftMargin() + "---marginLeftDistance：" + getMarginLeftDistance());
    }

    public final void setMarginLeftDistance(int i) {
        this.marginLeftDistance = i;
    }

    public final void setMarginTopDistance(int i) {
        this.marginTopDistance = i;
    }

    public final void setMaxScrollWidth(int i) {
        this.maxScrollWidth = i;
    }

    public final void setMaxTitleLeftMargin(int i) {
        this.maxTitleLeftMargin = i;
    }

    public final void setMaxTitleTopMargin(int i) {
        this.maxTitleTopMargin = i;
    }

    public final void setMinScrollWidth(int i) {
        this.minScrollWidth = i;
    }

    public final void setMinTitleLeftMargin(int i) {
        this.minTitleLeftMargin = i;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setTv_btn(@Nullable TextView textView) {
        this.tv_btn = textView;
    }

    public final void setTv_content(@Nullable TextView textView) {
        this.tv_content = textView;
    }

    public final void setTv_ext_content(@Nullable TextView textView) {
        this.tv_ext_content = textView;
    }

    public final void setTv_ext_desc(@Nullable TextView textView) {
        this.tv_ext_desc = textView;
    }

    public final void setTv_title(@Nullable TextView textView) {
        this.tv_title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreAssistCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreAssistCardLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreAssistCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxScrollWidth = getWidthForValue(168.0f);
        this.minScrollWidth = getWidthForValue(70.0f);
        int widthForValue = getWidthForValue(48.0f);
        this.img_small_width = widthForValue;
        int widthForValue2 = getWidthForValue(60.0f);
        this.img_big_width = widthForValue2;
        this.imgDistanceWidth = widthForValue2 - widthForValue;
        int widthForValue3 = getWidthForValue(11.5f);
        this.imgMinTop = widthForValue3;
        int widthForValue4 = getWidthForValue(27.0f);
        this.imgMaxTop = widthForValue4;
        this.imgDistanceTop = widthForValue4 - widthForValue3;
        int widthForValue5 = getWidthForValue(9.0f);
        this.imgMinEnd = widthForValue5;
        int widthForValue6 = getWidthForValue(8.0f);
        this.imgMaxEnd = widthForValue6;
        this.imgDistanceEnd = widthForValue6 - widthForValue5;
        this.maxTitleTopMargin = getWidthForValue(10.0f);
        int widthForValue7 = getWidthForValue(6.0f);
        this.minTitleTopMargin = widthForValue7;
        this.marginTopDistance = this.maxTitleTopMargin - widthForValue7;
        int widthForValue8 = getWidthForValue(12.0f);
        this.minTitleLeftMargin = widthForValue8;
        this.maxTitleLeftMargin = widthForValue8;
        this.marginLeftDistance = widthForValue8 - widthForValue8;
        this.maxScale = 1.0f;
        this.minScale = 0.8f;
        this.scaleDistance = 1.0f - 0.8f;
        this._$_findViewCache = new LinkedHashMap();
    }
}
