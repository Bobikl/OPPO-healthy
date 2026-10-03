package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;

/* JADX INFO: loaded from: classes17.dex */
public class kb4 extends e7c {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13222j;

    public kb4(String str, String str2) {
        this.i = str;
        this.f13222j = str2;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.operation_viewholder_course_detail_desc;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(R$id.desc);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R$id.desc_title);
        d(textView, lna.INSTANCE.a(this.f13222j));
        d(textView2, this.i);
    }
}
