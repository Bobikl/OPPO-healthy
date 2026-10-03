package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import com.coui.appcompat.couiswitch.COUISwitch;
import com.coui.appcompat.p009cardview.COUICardView;
import com.heytap.health.family.family.R$id;
import com.heytap.health.family.family.R$layout;
import com.heytap.health.family.family.R$string;

/* JADX INFO: loaded from: classes16.dex */
public class ns4 extends com.heytap.health.base.view.recyclercard.a {
    public COUICardView o;
    public TextView p;
    public COUISwitch q;
    public int r;
    public boolean s;
    public int t;
    public a u;
    public ShapeDrawable v;

    public interface a {
        void onClick(int i, boolean z);
    }

    public ns4(int i, int i2, boolean z) {
        this.r = i;
        this.t = i2;
        this.s = z;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_family_card_data;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void r(View view) {
        super.r(view);
        if (view == this.q) {
            boolean z = !this.s;
            this.s = z;
            this.u.onClick(this.r, z);
            boolean z2 = this.s;
            int i = this.t;
            if (i == 1) {
                com.heytap.health.base.track.a.B(51, z2 ? 1 : 0);
                return;
            }
            if (i == 2) {
                com.heytap.health.base.track.a.B(53, z2 ? 1 : 0);
                return;
            }
            if (i == 3) {
                com.heytap.health.base.track.a.B(54, z2 ? 1 : 0);
            } else if (i == 4) {
                com.heytap.health.base.track.a.B(52, z2 ? 1 : 0);
            } else {
                if (i != 5) {
                    return;
                }
                com.heytap.health.base.track.a.B(55, z2 ? 1 : 0);
            }
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(Context context, View view) {
        super.l(context, view);
        this.o = (COUICardView) view.findViewById(R$id.data_share_card_bg);
        this.p = (TextView) view.findViewById(R$id.tv_title);
        this.q = (COUISwitch) view.findViewById(R$id.switch_btn);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.v = shapeDrawable;
        shapeDrawable.getPaint().setColor(Color.parseColor("#FFFFFF"));
        t();
        this.q.setChecked(this.s);
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ms4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.r(view2);
            }
        });
        View viewFindViewById = view.findViewById(R$id.view_health_family_divide_line);
        if (this.t == 8) {
            viewFindViewById.setVisibility(8);
        }
    }

    public boolean p() {
        return this.s;
    }

    public int q() {
        return this.t;
    }

    public void s(boolean z) {
        this.s = z;
    }

    public final void t() {
        switch (this.t) {
            case 1:
                this.p.setText(R$string.health_family_daily_activity);
                this.v.setShape(new RoundRectShape(new float[]{48.0f, 48.0f, 48.0f, 48.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                this.o.setBackground(this.v);
                break;
            case 2:
                this.p.setText(R$string.health_family_heart_rate_record);
                this.o.setRadius(0.0f);
                break;
            case 3:
                this.p.setText(R$string.health_family_ecg_record);
                this.o.setRadius(0.0f);
                break;
            case 4:
                this.p.setText(R$string.health_family_sleep_record);
                this.o.setRadius(0.0f);
                break;
            case 5:
                this.p.setText(R$string.health_family_blood_oxygen_record);
                this.o.setRadius(0.0f);
                break;
            case 6:
                this.p.setText(R$string.health_family_pressure_record);
                this.o.setRadius(0.0f);
                break;
            case 8:
                this.p.setText(R$string.health_family_sport_record);
                this.o.setRadius(0.0f);
                break;
            case 9:
                this.p.setText(R$string.health_family_wrist_temperature_record);
                this.o.setRadius(0.0f);
                break;
            case 10:
                this.p.setText(R$string.health_family_blood_glucose_record);
                this.o.setRadius(0.0f);
                break;
            case 11:
                this.p.setText(R$string.health_family_physical_mental_record);
                this.v.setShape(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 48.0f, 48.0f, 48.0f, 48.0f}, null, null));
                this.o.setBackground(this.v);
                break;
        }
    }

    public void u(a aVar) {
        this.u = aVar;
    }
}
