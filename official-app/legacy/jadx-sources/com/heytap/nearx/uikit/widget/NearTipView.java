package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearTipView;
import com.oplus.aiunit.vision.xhc;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001!B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearTipView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconRes", "Landroid/graphics/drawable/Drawable;", "listener", "Lcom/heytap/nearx/uikit/widget/NearTipView$OnRefreshClickListener;", "refresh", "Landroid/widget/ImageButton;", "refreshText", "Landroid/widget/TextView;", "text", "", ParserTag.TAG_TEXT_COLOR, ParserTag.TAG_TEXT_SIZE, "getRefreshTextView", "setRefreshClickListener", "", "setRefreshIcon", "res", "setRefreshText", "setRefreshTextColor", "setRefreshTextSize", "size", "", "tintRefreshIcon", "color", "OnRefreshClickListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearTipView extends LinearLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private Drawable iconRes;

    @Nullable
    private OnRefreshClickListener listener;

    @Nullable
    private ImageButton refresh;

    @Nullable
    private TextView refreshText;

    @Nullable
    private String text;
    private int textColor;
    private int textSize;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearTipView$OnRefreshClickListener;", "", "onRefreshClickListener", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnRefreshClickListener {
        void onRefreshClickListener();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTipView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4688_init_$lambda0(NearTipView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnRefreshClickListener onRefreshClickListener = this$0.listener;
        if (onRefreshClickListener != null) {
            onRefreshClickListener.onRefreshClickListener();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
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
    /* JADX INFO: renamed from: getRefreshTextView, reason: from getter */
    public final TextView getRefreshText() {
        return this.refreshText;
    }

    public final void setRefreshClickListener(@NotNull OnRefreshClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setRefreshIcon(int res) {
        ImageButton imageButton = this.refresh;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageResource(res);
    }

    public final void setRefreshText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.refreshText;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setRefreshTextColor(int res) {
        TextView textView = this.refreshText;
        if (textView == null) {
            return;
        }
        textView.setTextColor(res);
    }

    public final void setRefreshTextSize(float size) {
        TextView textView = this.refreshText;
        if (textView == null) {
            return;
        }
        textView.setTextSize(size);
    }

    public final void tintRefreshIcon(int color) {
        ImageButton imageButton = this.refresh;
        xhc.d(imageButton == null ? null : imageButton.getDrawable(), color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.nx_top_tip_layout, (ViewGroup) this, true);
        setBackgroundResource(R$drawable.nx_top_tip_bg);
        this.refresh = (ImageButton) viewInflate.findViewById(R$id.top_tip_refresh);
        this.refreshText = (TextView) viewInflate.findViewById(R$id.top_tip_refresh_text);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearTipView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…TipView, defStyleAttr, 0)");
        this.text = typedArrayObtainStyledAttributes.getString(R$styleable.NearTipView_nxRefreshText);
        this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearTipView_nxRefreshTextSize, 0);
        this.textColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearTipView_nxRefreshTextColor, 0);
        this.iconRes = xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.NearTipView_nxRefreshIcon);
        typedArrayObtainStyledAttributes.recycle();
        ImageButton imageButton = this.refresh;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.iconRes);
        }
        TextView textView = this.refreshText;
        if (textView != null) {
            textView.setText(this.text);
        }
        TextView textView2 = this.refreshText;
        if (textView2 != null) {
            textView2.setTextColor(this.textColor);
        }
        TextView textView3 = this.refreshText;
        if (textView3 != null) {
            textView3.setTextSize(this.textSize);
        }
        TextView textView4 = this.refreshText;
        if (textView4 != null) {
            textView4.setTextSize(0, this.textSize);
        }
        ImageButton imageButton2 = this.refresh;
        if (imageButton2 == null) {
            return;
        }
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.rlc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearTipView.m4688_init_$lambda0(this.i, view);
            }
        });
    }

    public /* synthetic */ NearTipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearTopTipViewStyle : i);
    }
}
