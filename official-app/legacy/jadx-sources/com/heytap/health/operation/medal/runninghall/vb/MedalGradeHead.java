package com.heytap.health.operation.medal.runninghall.vb;

import android.content.res.Resources;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$plurals;
import com.heytap.health.operation.R$string;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.oplus.aiunit.vision.w1g;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MedalGradeHead extends JViewBean implements Serializable {
    public String desc;

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.operation_act_run_hall_medail_head;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(JViewHolder jViewHolder, int i, @Nullable @org.jetbrains.annotations.Nullable List<Object> list, @Nullable @org.jetbrains.annotations.Nullable OnViewClickListener onViewClickListener) {
        Pair<Integer, Integer> pairB = w1g.B();
        Integer num = (Integer) pairB.first;
        Integer num2 = (Integer) pairB.second;
        if (num.intValue() == 0 && num2.intValue() == 0) {
            this.desc = "";
        } else if (num.intValue() == 0) {
            this.desc = jViewHolder.getActivity().getResources().getQuantityString(R$plurals.operation_run_hall_medal_head_medals, num2.intValue(), num2);
        } else {
            Resources resources = jViewHolder.getActivity().getResources();
            this.desc = resources.getString(R$string.operation_run_hall_desc, resources.getQuantityString(R$plurals.operation_run_hall_medal_break_desc, num.intValue(), num), resources.getQuantityString(R$plurals.operation_run_hall_medal_num_desc, num2.intValue(), num2));
        }
        jViewHolder.setText2(R$id.operation_run_hall_medal_value, this.desc);
    }

    public MedalGradeHeadShare toShare() {
        MedalGradeHeadShare medalGradeHeadShare = new MedalGradeHeadShare();
        medalGradeHeadShare.desc = this.desc;
        return medalGradeHeadShare;
    }
}
