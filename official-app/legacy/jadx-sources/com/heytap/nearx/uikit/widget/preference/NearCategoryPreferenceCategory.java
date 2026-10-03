package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.preference.NearCategoryPreferenceCategory;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearCategoryPreferenceCategory;", "Lcom/heytap/nearx/uikit/widget/preference/NearPreferenceCategory;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lcom/heytap/nearx/uikit/widget/preference/NearCategoryPreferenceCategory$OnPreferenceEndClickListener;", "paddingEnd", "paddingStart", "preferenceEndText", "", "preferenceEndType", "onBindViewHolder", "", "view", "Landroidx/preference/PreferenceViewHolder;", "setOnPreferenceEndClickListener", "Companion", "OnPreferenceEndClickListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearCategoryPreferenceCategory extends NearPreferenceCategory {
    private static final int PREFERENCE_END_DEFAULT = 0;
    private static final int PREFERENCE_END_ICON = 2;
    private static final int PREFERENCE_END_MULTI = 3;
    private static final int PREFERENCE_END_TEXT = 1;

    @Nullable
    private OnPreferenceEndClickListener listener;
    private int paddingEnd;
    private int paddingStart;

    @Nullable
    private String preferenceEndText;
    private int preferenceEndType;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearCategoryPreferenceCategory$OnPreferenceEndClickListener;", "", "onPreferenceEndClick", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnPreferenceEndClickListener {
        void onPreferenceEndClick();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCategoryPreferenceCategory(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: onBindViewHolder$lambda-2, reason: not valid java name */
    public static final void m4702onBindViewHolder$lambda2(NearCategoryPreferenceCategory this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnPreferenceEndClickListener onPreferenceEndClickListener = this$0.listener;
        if (onPreferenceEndClickListener != null) {
            onPreferenceEndClickListener.onPreferenceEndClick();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onBindViewHolder(view);
        View view2 = view.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "view.itemView");
        view2.setPaddingRelative(this.paddingStart, view2.getPaddingTop(), this.paddingEnd, view2.getPaddingBottom());
        View viewFindViewById = view.findViewById(R$id.preference_end_container);
        TextView textView = (TextView) view.findViewById(R$id.preference_end_text);
        ImageView imageView = (ImageView) view.findViewById(R$id.preference_end_icon);
        View viewFindViewById2 = view.findViewById(R$id.preference_end_multi_container);
        TextView textView2 = (TextView) view.findViewById(R$id.preference_end_multi_text);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.preference_end_multi_icon);
        int i = this.preferenceEndType;
        if (i == 0) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else if (i == 1) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            String str = this.preferenceEndText;
            if (str != null && textView != null) {
                textView.setText(str);
            }
        } else if (i == 2) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else if (i == 3) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            String str2 = this.preferenceEndText;
            if (str2 != null && textView2 != null) {
                textView2.setText(str2);
            }
        }
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.tgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                NearCategoryPreferenceCategory.m4702onBindViewHolder$lambda2(this.i, view3);
            }
        });
    }

    public final void setOnPreferenceEndClickListener(@NotNull OnPreferenceEndClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCategoryPreferenceCategory(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCategoryPreferenceCategory(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCategoryPreferenceCategory, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ategory, defStyleAttr, 0)");
        this.preferenceEndType = typedArrayObtainStyledAttributes.getInt(R$styleable.NearCategoryPreferenceCategory_nxEndType, 0);
        this.preferenceEndText = typedArrayObtainStyledAttributes.getString(R$styleable.NearCategoryPreferenceCategory_nxEndText);
        int i2 = R$styleable.NearCategoryPreferenceCategory_android_paddingStart;
        Resources resources = context.getResources();
        int i3 = R$dimen.nx_category_preference_default_padding;
        this.paddingStart = typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, resources.getDimensionPixelSize(i3));
        this.paddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, context.getResources().getDimensionPixelSize(i3));
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ NearCategoryPreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearCategoryPreferenceCategoryStyle : i);
    }
}
