package com.heytap.health.base.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.button.COUIButton;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;

/* JADX INFO: loaded from: classes15.dex */
public class NetworkInValidLayout extends FrameLayout {
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f3292j;
    public View k;

    public interface a {
        void refresh();
    }

    public NetworkInValidLayout(@NonNull Context context) {
        super(context);
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void c(Drawable drawable, View view) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.refresh();
        }
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.lib_base_no_network_layout, this);
        this.k = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.setNet);
        this.f3292j = (TextView) this.k.findViewById(R$id.no_network_text);
        final Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        ((COUIButton) this.k.findViewById(R$id.go_setting)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.zoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.c(drawable, view);
            }
        });
    }

    @Override // android.view.View
    public View getRootView() {
        return this.k;
    }

    public void setNetworkInfoText(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f3292j.setText(str);
    }

    public void setRefreshListener(a aVar) {
        this.i = aVar;
    }

    public NetworkInValidLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }

    public NetworkInValidLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }
}
