package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$string;

/* JADX INFO: loaded from: classes17.dex */
public class r0c extends e7c {
    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.lib_base_simple_item_title2;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(R$id.lib_base_simple_title);
        textView.setText(R$string.lib_core_data_from_mjk);
        textView.setGravity(17);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#4D000000"));
    }
}
