package com.heytap.health.operation.medal.runninghall.vb;

import androidx.annotation.Nullable;
import com.heytap.health.operation.R$layout;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MedalGradeBottomShare extends MedalGradeHead {
    public int size;

    public MedalGradeBottomShare(int i) {
        this.size = i;
    }

    @Override // com.heytap.health.operation.medal.runninghall.vb.MedalGradeHead, com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.operation_act_run_hall_medail_bottom_share;
    }

    @Override // com.heytap.health.operation.medal.runninghall.vb.MedalGradeHead, com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(JViewHolder jViewHolder, int i, @Nullable @org.jetbrains.annotations.Nullable List<Object> list, @Nullable @org.jetbrains.annotations.Nullable OnViewClickListener onViewClickListener) {
        if (this.size == 2) {
            jViewHolder.itemView.setPadding(0, MultiStateLayout.g(132.0f), 0, 0);
        }
    }
}
