package com.heytap.health.community.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ActionProvider;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.health.community.impl.R$id;
import com.heytap.health.community.impl.R$layout;

/* JADX INFO: loaded from: classes15.dex */
public class CommunityNoticeProvider extends ActionProvider {
    public COUIHintRedDot a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f3675c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CommunityNoticeProvider.this.b != null) {
                CommunityNoticeProvider.this.b.onClick();
            }
        }
    }

    public interface b {
        void onClick();
    }

    public CommunityNoticeProvider(Context context) {
        super(context);
        this.f3675c = new a();
    }

    public void b(int i) {
        this.a.setPointMode(i);
    }

    public void c(String str) {
        this.a.setPointText(str);
    }

    public void d(int i) {
        this.a.setVisibility(i);
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.community_layout_notice_red_dot, (ViewGroup) null, false);
        viewInflate.setLayoutParams(layoutParams);
        this.a = (COUIHintRedDot) viewInflate.findViewById(R$id.red_dot_community_unread);
        viewInflate.setOnClickListener(this.f3675c);
        return viewInflate;
    }

    public void setOnClickListener(b bVar) {
        this.b = bVar;
    }
}
