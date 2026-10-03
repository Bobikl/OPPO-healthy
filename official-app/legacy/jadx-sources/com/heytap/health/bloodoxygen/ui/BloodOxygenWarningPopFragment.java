package com.heytap.health.bloodoxygen.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.health.bloodoxygen.R$layout;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/bloodoxygen/ui/BloodOxygenWarningPopFragment;", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "()V", "initView", "", "panelView", "Landroid/view/View;", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BloodOxygenWarningPopFragment extends COUIPanelFragment {
    @Override // com.coui.appcompat.panel.COUIPanelFragment
    public void initView(@Nullable View panelView) {
        super.initView(panelView);
        if (panelView != null) {
            View viewInflate = LayoutInflater.from(panelView.getContext()).inflate(R$layout.health_blood_oxygen_fragment_warning_pop, (ViewGroup) null, false);
            View contentView = getContentView();
            ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
            if (viewGroup != null) {
                viewGroup.addView(viewInflate);
            }
        }
    }
}
