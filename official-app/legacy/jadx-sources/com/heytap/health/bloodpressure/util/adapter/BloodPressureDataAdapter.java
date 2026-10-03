package com.heytap.health.bloodpressure.util.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.bloodPressure.BloodPressure;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.bloodpressure.R$id;
import com.oplus.aiunit.vision.aw8;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.xp1;

/* JADX INFO: loaded from: classes15.dex */
public class BloodPressureDataAdapter extends BaseRecyclerAdapter<BloodPressure> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(int i, View view) {
        BaseRecyclerAdapter.a aVar = this.k;
        if (aVar != null) {
            aVar.onItemClick(i);
        }
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(BaseViewHolder baseViewHolder, final int i) {
        View view = baseViewHolder.getView(R$id.v_divider);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_date);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_weight);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_time);
        RelativeLayout relativeLayout = (RelativeLayout) baseViewHolder.getView(R$id.rv_item);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.btn_interpretation);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.no1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.m(i, view2);
            }
        });
        BloodPressure bloodPressure = (BloodPressure) this.i.get(i);
        BloodPressure bloodPressure2 = i > 0 ? (BloodPressure) this.i.get(i - 1) : bloodPressure;
        int[] iArrD = xp1.d(bloodPressure.getSystolic(), bloodPressure.getDiastolic());
        if (iArrD.length == 3) {
            Context context = baseViewHolder.itemView.getContext();
            Drawable drawableE = xp1.e(context);
            drawableE.setTint(context.getColor(iArrD[1]));
            textView4.setBackground(drawableE);
            textView4.setText(context.getString(iArrD[2]));
        }
        textView.setText(fn9.g(bloodPressure.getMeasureTimestamp(), "yyyMMMd"));
        textView2.setText(bloodPressure.getSystolic() + "/" + bloodPressure.getDiastolic() + " mmHg");
        textView3.setText(fn9.g(bloodPressure.getMeasureTimestamp(), "h mm"));
        view.setVisibility(0);
        textView.setVisibility(0);
        if (aw8.a(bloodPressure2.getMeasureTimestamp(), bloodPressure.getMeasureTimestamp()) == 0) {
            if (i != 0) {
                textView.setVisibility(8);
            }
            view.setVisibility(8);
        }
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int i) {
        e(baseViewHolder, i);
    }
}
