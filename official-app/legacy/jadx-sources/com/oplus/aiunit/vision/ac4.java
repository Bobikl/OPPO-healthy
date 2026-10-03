package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;

/* JADX INFO: loaded from: classes17.dex */
public class ac4 extends e7c {
    public String i;

    public ac4(String str) {
        this.i = str;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.operation_viewholder_stage_title;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        d((TextView) viewHolder.itemView.findViewById(R$id.stage_title), this.i);
    }
}
