package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public class ydk extends com.heytap.health.base.view.recyclercard.a {
    public TextView o;
    public String p;

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_family_card_type_title;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void g(View view) {
        super.g(view);
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).b();
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(Context context, View view) {
        super.l(context, view);
        TextView textView = (TextView) view.findViewById(R$id.tv_type);
        this.o = textView;
        textView.setText(this.p);
    }

    public void o(String str) {
        this.p = str;
    }
}
