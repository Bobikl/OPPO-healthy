package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.coui.appcompat.progressbar.COUIHorizontalProgressBar;
import com.heytap.health.operation.R$id;
import com.heytap.health.operation.R$layout;
import com.heytap.health.operation.medalv2.MedalListDetailActivity;
import com.heytap.health.operations.bean.MedalListBean;

/* JADX INFO: loaded from: classes17.dex */
public class s5i {
    public String a;
    public MedalListBean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f16479c;

    public s5i(String str, @ColorInt int i) {
        this(str, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Context context, String str, MedalListBean medalListBean, View view) {
        f(context, str, medalListBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Context context, String str, MedalListBean medalListBean, View view) {
        MedalListBean medalListBean2 = this.b;
        if (medalListBean2 == null) {
            f(context, str, medalListBean);
        } else {
            f(context, str, medalListBean2);
        }
    }

    public View c(final Context context, String str, final String str2, float f, String str3, final MedalListBean medalListBean) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_special_type_medal, (ViewGroup) null, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.medal_img);
        r4a.j(context, str, imageView);
        ((TextView) viewInflate.findViewById(R$id.challenge_progress)).setText(str3);
        ((TextView) viewInflate.findViewById(R$id.medal_name)).setText(str2);
        COUIHorizontalProgressBar cOUIHorizontalProgressBar = (COUIHorizontalProgressBar) viewInflate.findViewById(R$id.progress_bar);
        int i = this.f16479c;
        if (i != -1) {
            cOUIHorizontalProgressBar.setProgressColor(ColorStateList.valueOf(i));
        }
        if (Float.compare(f, -1.0f) == 0) {
            cOUIHorizontalProgressBar.setVisibility(8);
        } else {
            cOUIHorizontalProgressBar.setMax(100);
            cOUIHorizontalProgressBar.setVisibility(0);
            cOUIHorizontalProgressBar.setProgress((int) (f * 100.0f), true);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.q5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.d(context, str2, medalListBean, view);
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.r5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.e(context, str2, medalListBean, view);
            }
        });
        return viewInflate;
    }

    public final void f(Context context, String str, MedalListBean medalListBean) {
        Intent intent = new Intent(context, (Class<?>) MedalListDetailActivity.class);
        intent.putExtra("medal_type_code", medalListBean);
        context.startActivity(intent);
        if (this.a.equals("每日活动")) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 5).a("element", str).b();
        } else if (this.a.equals("步行")) {
            com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 6).a("element", str).b();
        }
    }

    public s5i(String str, @ColorInt int i, MedalListBean medalListBean) {
        this.a = str;
        this.f16479c = i;
        this.b = medalListBean;
    }
}
