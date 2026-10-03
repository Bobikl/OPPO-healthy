package com.heytap.health.watchface.business.manager.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ActionProvider;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes19.dex */
public class BadgeActionProvider extends ActionProvider {
    public ImageView a;
    public COUIHintRedDot b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f6969c;
    public View.OnClickListener d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BadgeActionProvider.this.f6969c != null) {
                BadgeActionProvider.this.f6969c.onClick();
            }
        }
    }

    public interface b {
        void onClick();
    }

    public BadgeActionProvider(Context context) {
        super(context);
        this.d = new a();
    }

    public boolean b() {
        return this.b.getVisibility() == 0;
    }

    public void c(int i) {
        this.b.setVisibility(i);
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, ejg.h());
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.watch_face_home_red_dot, (ViewGroup) null, false);
        viewInflate.setLayoutParams(layoutParams);
        this.a = (ImageView) viewInflate.findViewById(R$id.iv_image);
        this.b = (COUIHintRedDot) viewInflate.findViewById(R$id.red_dot_number);
        viewInflate.setOnClickListener(this.d);
        return viewInflate;
    }

    public void setOnClickListener(b bVar) {
        this.f6969c = bVar;
    }
}
