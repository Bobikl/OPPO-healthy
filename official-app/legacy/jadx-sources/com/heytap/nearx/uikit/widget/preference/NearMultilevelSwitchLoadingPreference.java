package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.widget.preference.NearMultilevelSwitchLoadingPreference;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearMultilevelSwitchLoadingPreference;", "Lcom/heytap/nearx/uikit/widget/preference/NearSwitchLoadingPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lcom/heytap/nearx/uikit/widget/preference/NearMultilevelSwitchLoadingPreference$OnPreferenceItemClickListener;", "onBindViewHolder", "", "view", "Landroidx/preference/PreferenceViewHolder;", "setOnPreferenceItemClickListener", "OnPreferenceItemClickListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearMultilevelSwitchLoadingPreference extends NearSwitchLoadingPreference {

    @Nullable
    private OnPreferenceItemClickListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/uikit/widget/preference/NearMultilevelSwitchLoadingPreference$OnPreferenceItemClickListener;", "", "onPreferenceItemClick", "", "view", "Landroid/view/View;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnPreferenceItemClickListener {
        void onPreferenceItemClick(@Nullable View view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearMultilevelSwitchLoadingPreference(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: onBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m4704onBindViewHolder$lambda0(NearMultilevelSwitchLoadingPreference this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnPreferenceItemClickListener onPreferenceItemClickListener = this$0.listener;
        if (onPreferenceItemClickListener != null) {
            onPreferenceItemClickListener.onPreferenceItemClick(view);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearSwitchLoadingPreference, androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onBindViewHolder(view);
        view.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ijc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NearMultilevelSwitchLoadingPreference.m4704onBindViewHolder$lambda0(this.i, view2);
            }
        });
    }

    public final void setOnPreferenceItemClickListener(@NotNull OnPreferenceItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearMultilevelSwitchLoadingPreference(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NearMultilevelSwitchLoadingPreference(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearMultilevelSwitchLoadingPreferenceStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearMultilevelSwitchLoadingPreference(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
