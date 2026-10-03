package com.heytap.health.stress.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.heytap.health.stress.R$id;
import com.heytap.health.stress.R$layout;
import com.heytap.health.stress.R$string;

/* JADX INFO: loaded from: classes18.dex */
public class StressDetailView extends FrameLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f6037j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6038l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6039n;
    public TextView o;
    public TextView p;
    public View q;
    public TextView r;
    public TextView s;

    public interface a {
        void e(String str);
    }

    public StressDetailView(@NonNull Context context) {
        super(context);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(a aVar, View view) {
        aVar.e(this.m.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(a aVar, View view) {
        aVar.e(this.p.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(a aVar, View view) {
        aVar.e(this.s.getText().toString());
    }

    public final void d() {
        View.inflate(getContext(), R$layout.health_stress_view_detail, this);
        this.i = (TextView) findViewById(R$id.tv_stress_detail_text);
        View viewFindViewById = findViewById(R$id.first_stress_evaluate);
        this.f6037j = viewFindViewById;
        int i = R$id.item_evaluate_text;
        this.k = (TextView) viewFindViewById.findViewById(i);
        this.f6038l = (TextView) this.f6037j.findViewById(R$id.item_evaluate_time);
        View view = this.f6037j;
        int i2 = R$id.item_evaluate_value;
        this.m = (TextView) view.findViewById(i2);
        View viewFindViewById2 = findViewById(R$id.second_stress_evaluate);
        this.f6039n = viewFindViewById2;
        this.o = (TextView) viewFindViewById2.findViewById(i);
        this.p = (TextView) this.f6039n.findViewById(i2);
        View viewFindViewById3 = findViewById(R$id.third_stress_evaluate);
        this.q = viewFindViewById3;
        this.r = (TextView) viewFindViewById3.findViewById(i);
        this.s = (TextView) this.q.findViewById(i2);
        this.i.setText(R$string.health_stress_detail);
    }

    public void h(@StringRes int i, String str) {
        this.k.setText(i);
        this.f6038l.setText("");
        this.m.setText(str);
    }

    public void i(@StringRes int i, String str, String str2) {
        this.k.setText(i);
        this.f6038l.setText(str);
        this.m.setText(str2);
    }

    public void j(@StringRes int i, String str) {
        this.o.setText(i);
        this.p.setText(str);
    }

    public void k(@StringRes int i, String str) {
        this.r.setText(i);
        this.s.setText(str);
    }

    public void l() {
        this.m.setText("- -");
        this.p.setText("- -");
        this.s.setText("- -");
    }

    public void setFirstLayoutOnClickListener(final a aVar) {
        this.f6037j.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(aVar, view);
            }
        });
    }

    public void setSecondLayoutOnClickListener(final a aVar) {
        this.f6039n.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.xxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(aVar, view);
            }
        });
    }

    public void setThirdLayoutOnClickListener(final a aVar) {
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.g(aVar, view);
            }
        });
    }

    public StressDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public StressDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
