package com.heytap.health.family.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.panel.COUIPanelFragment;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;
import com.heytap.health.family.setting.FamilyAddWayPanelFragment;
import com.oplus.aiunit.vision.a27;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/family/setting/FamilyAddWayPanelFragment;", "Lcom/coui/appcompat/panel/COUIPanelFragment;", "Landroid/view/View;", "panelView", "", "initView", "Lcom/oplus/aiunit/vision/a27;", "callback", "Lcom/oplus/aiunit/vision/a27;", "<init>", "(Lcom/oplus/aiunit/vision/a27;)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final class FamilyAddWayPanelFragment extends COUIPanelFragment {
    public static final int $stable = 8;

    @Nullable
    private a27 callback;

    /* JADX WARN: Multi-variable type inference failed */
    public FamilyAddWayPanelFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$lambda$0(FamilyAddWayPanelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$lambda$1(FamilyAddWayPanelFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
    }

    @Override // com.coui.appcompat.panel.COUIPanelFragment
    public void initView(@Nullable View panelView) {
        super.initView(panelView);
        if (panelView != null) {
            View viewInflate = LayoutInflater.from(panelView.getContext()).inflate(R$layout.health_family_add_way, (ViewGroup) null, false);
            View contentView = getContentView();
            ViewGroup viewGroup = contentView instanceof ViewGroup ? (ViewGroup) contentView : null;
            if (viewGroup != null) {
                viewGroup.addView(viewInflate);
            }
            Button button = (Button) viewInflate.findViewById(R$id.family_add_way_telephone);
            TextView textView = (TextView) viewInflate.findViewById(R$id.family_add_way_qrcode);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.b27
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyAddWayPanelFragment.initView$lambda$2$lambda$0(this.i, view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.c27
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilyAddWayPanelFragment.initView$lambda$2$lambda$1(this.i, view);
                }
            });
        }
    }

    public /* synthetic */ FamilyAddWayPanelFragment(a27 a27Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : a27Var);
    }

    public FamilyAddWayPanelFragment(@Nullable a27 a27Var) {
    }
}
