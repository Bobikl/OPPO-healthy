package com.heytap.store.business.component.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.heytap.store.base.core.util.ImageSizeUtil;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.databinding.PfHeytapBusinessWidgetHeaderLayoutBinding;
import com.heytap.store.business.component.entity.OStoreHeaderInfo;
import com.heytap.store.business.component.view.OStoreHeaderView;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.webview.extension.protocol.Const;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0014J\u0006\u0010\u001e\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00132\b\b\u0001\u0010 \u001a\u00020\tJ\u0010\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00132\b\b\u0001\u0010 \u001a\u00020\tJ\u0010\u0010\"\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010#\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001bH\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001bH\u0002R\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/heytap/store/business/component/view/OStoreHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/heytap/store/business/component/view/IOStoreView;", "Lcom/heytap/store/business/component/databinding/PfHeytapBusinessWidgetHeaderLayoutBinding;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "headerInfo", "setHeaderInfo", "(Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;)V", "mBinding", "mClickAction", "Lkotlin/Function1;", "", "getMClickAction", "()Lkotlin/jvm/functions/Function1;", "setMClickAction", "(Lkotlin/jvm/functions/Function1;)V", "onClicked", "Landroid/view/View$OnClickListener;", "getTitleStyle", "Lcom/heytap/store/business/component/view/TitleLayoutStyle;", "getViewBinding", "onFinishInflate", "setLightColor", "setMoreColor", "color", "", "setTitleColor", "updateHeaderInfo", "updateTitleContent", Const.Arguments.Open.STYLE, "updateTitleVisibility", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreHeaderView extends ConstraintLayout implements IOStoreView<PfHeytapBusinessWidgetHeaderLayoutBinding> {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private OStoreHeaderInfo headerInfo;

    @Nullable
    private final PfHeytapBusinessWidgetHeaderLayoutBinding mBinding;

    @Nullable
    private Function1<? super Integer, Unit> mClickAction;

    @NotNull
    private final View.OnClickListener onClicked;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TitleLayoutStyle.values().length];
            iArr[TitleLayoutStyle.IMAGE.ordinal()] = 1;
            iArr[TitleLayoutStyle.TEXT.ordinal()] = 2;
            iArr[TitleLayoutStyle.HIDE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TitleLayoutStyle getTitleStyle(OStoreHeaderInfo headerInfo) {
        int titleStyle = headerInfo.getTitleStyle();
        if (titleStyle != 1) {
            return titleStyle != 2 ? TitleLayoutStyle.HIDE : TitleLayoutStyle.IMAGE;
        }
        return TitleLayoutStyle.TEXT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: onClicked$lambda-1, reason: not valid java name */
    public static final void m4849onClicked$lambda1(OStoreHeaderView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OStoreHeaderInfo oStoreHeaderInfo = this$0.headerInfo;
        if (oStoreHeaderInfo == null) {
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
            return;
        }
        Intrinsics.checkNotNull(oStoreHeaderInfo);
        if (StringsKt__StringsJVMKt.isBlank(oStoreHeaderInfo.getMoreLink())) {
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
            return;
        }
        OStoreHeaderInfo oStoreHeaderInfo2 = this$0.headerInfo;
        if (oStoreHeaderInfo2 != null) {
            oStoreHeaderInfo2.getMoreIsLogin();
        }
        Function1<? super Integer, Unit> function1 = this$0.mClickAction;
        if (function1 != null) {
            function1.invoke(1);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void setHeaderInfo(OStoreHeaderInfo oStoreHeaderInfo) {
        this.headerInfo = oStoreHeaderInfo;
        if (oStoreHeaderInfo == null) {
            return;
        }
        TitleLayoutStyle titleStyle = getTitleStyle(oStoreHeaderInfo);
        updateTitleVisibility(titleStyle);
        updateTitleContent(oStoreHeaderInfo, titleStyle);
    }

    private final void updateTitleContent(OStoreHeaderInfo headerInfo, TitleLayoutStyle style) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        AppCompatTextView appCompatTextView;
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding = this.mBinding;
        AppCompatTextView appCompatTextView2 = pfHeytapBusinessWidgetHeaderLayoutBinding == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding.tvMoreTitle2;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTag(headerInfo);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding2 = this.mBinding;
            TextView textView = pfHeytapBusinessWidgetHeaderLayoutBinding2 == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding2.idLeftTitle;
            if (textView != null) {
                textView.setText(headerInfo.getTitle());
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding3 = this.mBinding;
            AppCompatTextView appCompatTextView3 = pfHeytapBusinessWidgetHeaderLayoutBinding3 != null ? pfHeytapBusinessWidgetHeaderLayoutBinding3.tvMoreTitle2 : null;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setText(updateTitleContent$getMoreText(headerInfo));
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding4 = this.mBinding;
            if (pfHeytapBusinessWidgetHeaderLayoutBinding4 == null || (appCompatTextView = pfHeytapBusinessWidgetHeaderLayoutBinding4.tvMoreTitle2) == null) {
                return;
            }
            updateTitleContent$updateArrowVisible(appCompatTextView, this, headerInfo);
            return;
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding5 = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding5 != null && (imageView3 = pfHeytapBusinessWidgetHeaderLayoutBinding5.idTitleBg) != null) {
            imageView3.setOnClickListener(this.onClicked);
        }
        String picTitle = headerInfo.getPicTitle();
        int imageScaleHeight = ImageSizeUtil.getImageScaleHeight(picTitle);
        if (imageScaleHeight > 0) {
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding6 = this.mBinding;
            ViewGroup.LayoutParams layoutParams = (pfHeytapBusinessWidgetHeaderLayoutBinding6 == null || (imageView2 = pfHeytapBusinessWidgetHeaderLayoutBinding6.idTitleBg) == null) ? null : imageView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = imageScaleHeight;
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding7 = this.mBinding;
            ImageView imageView4 = pfHeytapBusinessWidgetHeaderLayoutBinding7 != null ? pfHeytapBusinessWidgetHeaderLayoutBinding7.idTitleBg : null;
            if (imageView4 != null) {
                imageView4.setMaxHeight(imageScaleHeight);
            }
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding8 = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding8 == null || (imageView = pfHeytapBusinessWidgetHeaderLayoutBinding8.idTitleBg) == null) {
            return;
        }
        ImageLoader.load(picTitle, imageView);
    }

    private static final String updateTitleContent$getMoreText(OStoreHeaderInfo oStoreHeaderInfo) {
        return StringsKt__StringsJVMKt.isBlank(oStoreHeaderInfo.getMoreText()) ? "   " : oStoreHeaderInfo.getMoreText();
    }

    private static final void updateTitleContent$updateArrowVisible(TextView textView, OStoreHeaderView oStoreHeaderView, OStoreHeaderInfo oStoreHeaderInfo) {
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding = oStoreHeaderView.mBinding;
        if (Intrinsics.areEqual(textView, pfHeytapBusinessWidgetHeaderLayoutBinding == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding.tvMoreTitle2)) {
            if (!(!StringsKt__StringsJVMKt.isBlank(oStoreHeaderInfo.getMoreLink()))) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(textView.getContext(), R.drawable.pf_heytap_business_widget_more_arrow), (Drawable) null);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(ContextCompat.getColor(textView.getContext(), R.color.pf_heytap_business_widget_base_desc_color));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(\n               …  )\n                    )");
            TextViewCompat.setCompoundDrawableTintList(textView, colorStateListValueOf);
        }
    }

    private final void updateTitleVisibility(TitleLayoutStyle style) {
        AppCompatTextView appCompatTextView;
        setVisibility(style == TitleLayoutStyle.HIDE ? 8 : 0);
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding = this.mBinding;
            ImageView imageView = pfHeytapBusinessWidgetHeaderLayoutBinding == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding.idTitleBg;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding2 = this.mBinding;
            TextView textView = pfHeytapBusinessWidgetHeaderLayoutBinding2 == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding2.idLeftTitle;
            if (textView != null) {
                textView.setVisibility(8);
            }
            PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding3 = this.mBinding;
            appCompatTextView = pfHeytapBusinessWidgetHeaderLayoutBinding3 != null ? pfHeytapBusinessWidgetHeaderLayoutBinding3.tvMoreTitle2 : null;
            if (appCompatTextView == null) {
                return;
            }
            appCompatTextView.setVisibility(8);
            return;
        }
        if (i != 2) {
            return;
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding4 = this.mBinding;
        ImageView imageView2 = pfHeytapBusinessWidgetHeaderLayoutBinding4 == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding4.idTitleBg;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding5 = this.mBinding;
        TextView textView2 = pfHeytapBusinessWidgetHeaderLayoutBinding5 == null ? null : pfHeytapBusinessWidgetHeaderLayoutBinding5.idLeftTitle;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding6 = this.mBinding;
        appCompatTextView = pfHeytapBusinessWidgetHeaderLayoutBinding6 != null ? pfHeytapBusinessWidgetHeaderLayoutBinding6.tvMoreTitle2 : null;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setVisibility(0);
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
    public final Function1<Integer, Unit> getMClickAction() {
        return this.mClickAction;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        AppCompatTextView appCompatTextView;
        ImageView imageView;
        super.onFinishInflate();
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding != null && (imageView = pfHeytapBusinessWidgetHeaderLayoutBinding.idTitleBg) != null) {
            imageView.setOnClickListener(this.onClicked);
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding2 = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding2 == null || (appCompatTextView = pfHeytapBusinessWidgetHeaderLayoutBinding2.tvMoreTitle2) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(this.onClicked);
    }

    public final void setLightColor() {
        AppCompatTextView appCompatTextView;
        TextView textView;
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding != null && (textView = pfHeytapBusinessWidgetHeaderLayoutBinding.idLeftTitle) != null) {
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.pf_heytap_business_widget_light_title_color));
        }
        PfHeytapBusinessWidgetHeaderLayoutBinding pfHeytapBusinessWidgetHeaderLayoutBinding2 = this.mBinding;
        if (pfHeytapBusinessWidgetHeaderLayoutBinding2 == null || (appCompatTextView = pfHeytapBusinessWidgetHeaderLayoutBinding2.tvMoreTitle2) == null) {
            return;
        }
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.pf_heytap_business_widget_light_desc_color));
    }

    public final void setMClickAction(@Nullable Function1<? super Integer, Unit> function1) {
        this.mClickAction = function1;
    }

    public final void setMoreColor(@ColorInt int color) {
    }

    public final void setTitleColor(@ColorInt int color) {
    }

    public final void updateHeaderInfo(@Nullable OStoreHeaderInfo headerInfo) {
        setHeaderInfo(headerInfo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBinding = PfHeytapBusinessWidgetHeaderLayoutBinding.inflate(LayoutInflater.from(context), this);
        this.onClicked = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r4d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OStoreHeaderView.m4849onClicked$lambda1(this.i, view);
            }
        };
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.heytap.store.business.component.view.IOStoreView
    @Nullable
    /* JADX INFO: renamed from: getViewBinding, reason: from getter */
    public PfHeytapBusinessWidgetHeaderLayoutBinding getMBinding() {
        return this.mBinding;
    }

    public final void setMoreColor(@Nullable String color) {
    }

    public final void setTitleColor(@Nullable String color) {
    }

    public /* synthetic */ OStoreHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
