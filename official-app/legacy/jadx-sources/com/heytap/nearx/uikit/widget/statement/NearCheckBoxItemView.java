package com.heytap.nearx.uikit.widget.statement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.internal.widget.InnerCheckBox;
import com.heytap.nearx.uikit.widget.NearCheckBox;
import com.heytap.nearx.uikit.widget.statement.NearCheckBoxItemView;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/heytap/nearx/uikit/widget/statement/NearCheckBoxItemView;", "Landroid/widget/LinearLayout;", "", "isChecked", "Lcom/heytap/nearx/uikit/internal/widget/InnerCheckBox$b;", "listener", "", "setOnStateChangeListener", "Lcom/heytap/nearx/uikit/widget/statement/PrivacyItem;", "privacyItem", "Lcom/heytap/nearx/uikit/widget/statement/PrivacyItem;", "getPrivacyItem", "()Lcom/heytap/nearx/uikit/widget/statement/PrivacyItem;", "Lcom/heytap/nearx/uikit/widget/NearCheckBox;", "checkBox", "Lcom/heytap/nearx/uikit/widget/NearCheckBox;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/heytap/nearx/uikit/widget/statement/PrivacyItem;)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class NearCheckBoxItemView extends LinearLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private NearCheckBox checkBox;

    @NotNull
    private final PrivacyItem privacyItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearCheckBoxItemView(@NotNull Context context, @NotNull PrivacyItem privacyItem) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyItem, "privacyItem");
        this.privacyItem = privacyItem;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.nx_component_layout_privacy_checkbox, this);
        TextView textView = (TextView) viewInflate.findViewById(R$id.checkbox_title);
        if (textView != null) {
            textView.setText(getPrivacyItem().getTitleText());
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.checkbox_summary);
        if (textView2 != null) {
            textView2.setText(getPrivacyItem().getSummaryText());
        }
        View viewFindViewById = viewInflate.findViewById(R$id.checkbox);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.checkbox)");
        this.checkBox = (NearCheckBox) viewFindViewById;
        ((ConstraintLayout) viewInflate.findViewById(R$id.checkbox_layout)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearCheckBoxItemView.m4713lambda1$lambda0(this.i, view);
            }
        });
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: lambda-1$lambda-0, reason: not valid java name */
    public static final void m4713lambda1$lambda0(NearCheckBoxItemView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int state = this$0.checkBox.getState();
        InnerCheckBox.Companion companion = InnerCheckBox.INSTANCE;
        if (state == companion.b()) {
            this$0.checkBox.setState(companion.a());
        } else if (state == companion.a()) {
            this$0.checkBox.setState(companion.b());
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

    @NotNull
    public final PrivacyItem getPrivacyItem() {
        return this.privacyItem;
    }

    public final boolean isChecked() {
        return this.checkBox.getState() == InnerCheckBox.INSTANCE.a();
    }

    public final void setOnStateChangeListener(@NotNull InnerCheckBox.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.checkBox.setOnStateChangeListener(listener);
    }
}
