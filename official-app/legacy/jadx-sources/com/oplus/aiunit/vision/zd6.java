package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.ecg.business.AlgorithmExplanActivity;
import com.heytap.health.operation.ecg.business.ExpectExplanActivity;
import com.heytap.health.operation.ecg.business.ExpertActivity;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class zd6 extends JViewBean {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19375j = um.d().h();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(JViewHolder jViewHolder, Object obj) throws Throwable {
        if (g3k.j()) {
            return;
        }
        if (this.i) {
            ExpectExplanActivity.V7(jViewHolder.getActivity());
        } else {
            ExpertActivity.j8(jViewHolder.getActivity());
        }
    }

    public static /* synthetic */ void d(JViewHolder jViewHolder, Object obj) throws Throwable {
        if (g3k.j()) {
            return;
        }
        AlgorithmExplanActivity.Y7(jViewHolder.getActivity());
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.item_ecg_records_head;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    @SuppressLint({"CheckResult"})
    public void onBindViewHolder(final JViewHolder jViewHolder, int i, @Nullable List<Object> list, @Nullable OnViewClickListener onViewClickListener) {
        if (this.f19375j) {
            jViewHolder.goneViews(R$id.ecg_expert_read_group);
        }
        q3g.c(jViewHolder.getView(R$id.ecg_expert_read_bg)).a(new o14() { // from class: com.oplus.aiunit.vision.xd6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.c(jViewHolder, obj);
            }
        });
        q3g.c(jViewHolder.getView(R$id.ecg_algorithm_guide_bg)).a(new o14() { // from class: com.oplus.aiunit.vision.yd6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                zd6.d(jViewHolder, obj);
            }
        });
        jViewHolder.itemView.setOnClickListener(null);
    }
}
