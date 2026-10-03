package com.oplus.aiunit.vision;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.view.exceptionview.DevicePageType;

/* JADX INFO: loaded from: classes16.dex */
public class qoc implements pp6 {
    public static /* synthetic */ void c(z62 z62Var, View view) {
        if (z62Var != null) {
            z62Var.F();
        }
    }

    @Override // com.oplus.aiunit.vision.pp6
    public View a(final z62 z62Var, int i, String str) {
        View viewInflate = View.inflate(z62Var.t().getContext() instanceof Activity ? z62Var.t().getContext() : z62Var.s().i(), R$layout.lib_base_view_exception_page, null);
        du6 exceptionPageBean = DevicePageType.getExceptionPageBean(DevicePageType.NETWORK_ERROR);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_exception_image);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_exception_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_exception_tips);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.cb_retry);
        if (exceptionPageBean != null) {
            imageView.setImageResource(exceptionPageBean.a());
            textView.setText(exceptionPageBean.c());
            textView2.setText(exceptionPageBean.b());
            textView3.setVisibility(exceptionPageBean.d() ? 0 : 8);
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.poc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qoc.c(z62Var, view);
            }
        });
        return viewInflate;
    }
}
