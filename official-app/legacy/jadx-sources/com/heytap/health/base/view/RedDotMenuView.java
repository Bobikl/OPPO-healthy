package com.heytap.health.base.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;

/* JADX INFO: loaded from: classes15.dex */
public class RedDotMenuView extends FrameLayout implements View.OnClickListener {
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUIHintRedDot f3296j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f3297l;
    public Context m;

    public interface a {
        void Q6(boolean z);
    }

    public RedDotMenuView(@NonNull Context context) {
        super(context);
        this.k = false;
        a(context);
    }

    public final void a(Context context) {
        this.m = context;
        View viewInflate = View.inflate(getContext(), R$layout.lib_base_view_reddotmenu, this);
        this.i = (ImageView) viewInflate.findViewById(R$id.iv_icon);
        this.f3296j = (COUIHintRedDot) viewInflate.findViewById(R$id.red_dot);
        viewInflate.setOnClickListener(this);
    }

    public void b(boolean z) {
        this.f3296j.setVisibility(z ? 0 : 4);
        this.f3296j.setPointMode(1);
        this.k = z;
        StringBuilder sb = new StringBuilder();
        sb.append("RedDot is show?");
        sb.append(z);
        postInvalidate();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        COUIHintRedDot cOUIHintRedDot;
        a aVar = this.f3297l;
        if (aVar == null || (cOUIHintRedDot = this.f3296j) == null) {
            return;
        }
        aVar.Q6(cOUIHintRedDot.getVisibility() == 0);
    }

    public void setIcon(int i) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setListener(a aVar) {
        this.f3297l = aVar;
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public RedDotMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = false;
        a(context);
    }

    public RedDotMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = false;
        a(context);
    }
}
