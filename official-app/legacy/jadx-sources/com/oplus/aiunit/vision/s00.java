package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public class s00 extends com.heytap.health.base.view.recyclercard.a {
    public COUISwitch o;
    public boolean p;
    public a q;
    public String r;
    public String s;

    public interface a {
        void a(boolean z);
    }

    public s00(boolean z, String str, String str2) {
        this.p = z;
        this.r = str;
        this.s = str2;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_family_card_all_share;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void q(View view) {
        super.q(view);
        if (view == this.o) {
            boolean z = !this.p;
            this.p = z;
            this.q.a(z);
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(Context context, View view) {
        super.l(context, view);
        ((TextView) view.findViewById(R$id.tv_title)).setText(this.r);
        ((TextView) view.findViewById(R$id.tv_desc)).setText(this.s);
        COUISwitch cOUISwitch = (COUISwitch) view.findViewById(R$id.switch_btn);
        this.o = cOUISwitch;
        cOUISwitch.setChecked(this.p);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.q(view2);
            }
        });
    }

    public boolean p() {
        return this.p;
    }

    public void r(boolean z) {
        this.p = z;
    }

    public void s(a aVar) {
        this.q = aVar;
    }
}
