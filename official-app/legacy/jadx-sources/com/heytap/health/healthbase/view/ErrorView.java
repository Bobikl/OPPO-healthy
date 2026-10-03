package com.heytap.health.healthbase.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.health_base.R$id;
import com.heytap.health.health_base.R$layout;
import com.oplus.aiunit.vision.rpc;

/* JADX INFO: loaded from: classes16.dex */
public class ErrorView extends FrameLayout implements View.OnClickListener {
    public LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f4613j;
    public a k;

    public interface a {
        void s4();
    }

    public ErrorView(@NonNull Context context) {
        super(context);
        c();
    }

    public boolean a(Context context) {
        if (rpc.c()) {
            return true;
        }
        e();
        return false;
    }

    public void b() {
        this.i.setVisibility(8);
        this.f4613j.setVisibility(8);
    }

    public void c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.health_base_layout_error, (ViewGroup) this, true);
        this.i = (LinearLayout) viewInflate.findViewById(R$id.view_loading);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R$id.view_network_error);
        this.f4613j = linearLayout;
        linearLayout.findViewById(R$id.bt_retry).setOnClickListener(this);
    }

    public void d() {
        this.i.setVisibility(0);
        this.f4613j.setVisibility(8);
    }

    public void e() {
        this.i.setVisibility(8);
        this.f4613j.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (view.getId() != R$id.bt_retry || (aVar = this.k) == null) {
            return;
        }
        aVar.s4();
    }

    public void setOnErrorViewClickListener(a aVar) {
        this.k = aVar;
    }

    public void setViewBgColor(int i) {
        this.i.setBackgroundColor(i);
        this.f4613j.setBackgroundColor(i);
    }

    public ErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public ErrorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
