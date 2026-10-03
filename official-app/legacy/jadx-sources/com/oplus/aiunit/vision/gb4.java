package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.R$string;

/* JADX INFO: loaded from: classes17.dex */
public class gb4 extends e7c {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11698j;
    public String k;

    public gb4(String str, String str2, String str3) {
        this.i = str;
        this.f11698j = str2;
        this.k = str3;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.operation_viewholder_course_detail_action;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R$id.action_img);
        TextView textView = (TextView) viewHolder.itemView.findViewById(R$id.action_title);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R$id.action_times);
        r4a.e(context, this.i, imageView);
        d(textView, this.f11698j);
        if (this.k.contains(" ")) {
            d(textView2, this.k);
        } else {
            d(textView2, String.format(context.getString(R$string.operation_course_action_times), Integer.valueOf(Integer.parseInt(this.k))));
        }
    }
}
