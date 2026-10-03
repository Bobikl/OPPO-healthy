package com.heytap.health.main.card.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.R$string;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.home.tipcard.TopTipCard;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.qmg;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class HealthCommonCardView extends FrameLayout {
    public static final int C = Color.argb(255, 36, 36, 36);
    public Integer A;
    public ColorStateList B;
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f5987j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f5988l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f5989n;
    public TextView o;
    public TextView p;
    public AppCompatTextView q;
    public FrameLayout r;
    public RelativeLayout s;
    public RelativeLayout t;
    public ImageView u;
    public ImageView v;
    public ImageView w;
    public TextView x;
    public View y;
    public LinearLayout z;

    public HealthCommonCardView(Context context) {
        super(context);
        this.A = null;
        this.B = null;
        b();
    }

    public String a(long j2, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int year = LocalDateTime.ofInstant(Instant.ofEpochMilli(jCurrentTimeMillis), ZoneId.systemDefault()).toLocalDate().getYear() - LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate().getYear();
        int iQ = (int) ((o15.q(jCurrentTimeMillis) - o15.q(j2)) / 86400000);
        if (iQ == 0) {
            return z ? getContext().getString(R$string.lib_base_chart_today) : lo9.g(Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).withSecond(0).withNano(0).toInstant().toEpochMilli(), o15.DATE_FORMAT_HOUR);
        }
        if (iQ == 1) {
            return getContext().getString(com.heytap.health.health.impl.R$string.health_yesterday);
        }
        return year != 0 ? lo9.g(j2, "yyyMMMd") : lo9.g(j2, "MMMd");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        this.r.removeAllViews();
        this.r.addView(view);
    }

    public final void b() {
        View.inflate(getContext(), R$layout.health_common_base_card, this);
        this.i = (TextView) findViewById(R$id.tv_title);
        this.k = (TextView) findViewById(R$id.tv_extend);
        this.f5987j = (TextView) findViewById(R$id.tv_tip1);
        this.f5988l = (TextView) findViewById(R$id.tv_tip2);
        this.m = (TextView) findViewById(R$id.tv_tip3);
        this.s = (RelativeLayout) findViewById(R$id.lin_guide);
        this.r = (FrameLayout) findViewById(R$id.frame_layout);
        this.t = (RelativeLayout) findViewById(R$id.view_parent);
        this.u = (ImageView) findViewById(R$id.iv_bg);
        this.x = (TextView) findViewById(R$id.new_card_tag);
        this.y = findViewById(R$id.view_cus_bg);
        this.v = (ImageView) findViewById(R$id.iv_icon);
        this.f5989n = (TextView) findViewById(R$id.tv_content);
        this.p = (TextView) findViewById(R$id.tv_content2);
        this.w = (ImageView) findViewById(R$id.iv_content_icon);
        this.o = (TextView) findViewById(R$id.tv_notice);
        this.z = (LinearLayout) findViewById(R$id.ll_tv_content);
        this.q = (AppCompatTextView) findViewById(R$id.health_recommend);
        c();
    }

    public final void c() {
        ImageView imageView;
        Integer numValueOf = null;
        if (!if0.y(getContext())) {
            ImageView imageView2 = this.u;
            if (imageView2 == null || !(imageView2.getBackground() instanceof GradientDrawable)) {
                return;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.u.getBackground();
            if (this.B == null) {
                this.B = ColorStateList.valueOf(-1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("notifyDarkBackGround() light mode = ");
            sb.append(this.B);
            gradientDrawable.setColor(this.B);
            this.A = null;
            return;
        }
        Integer numG = if0.g();
        if (numG == null) {
            return;
        }
        if (numG.intValue() == 0) {
            numValueOf = Integer.valueOf(TopTipCard.Dark_Bg_Color_0);
        } else if (numG.intValue() == 1) {
            numValueOf = Integer.valueOf(TopTipCard.Dark_Bg_Color_1);
        } else if (numG.intValue() == 2) {
            numValueOf = Integer.valueOf(TopTipCard.Dark_Bg_Color_2);
        }
        if (Objects.equals(this.A, numValueOf)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("notifyDarkBackGround() darkLevel = ");
        sb2.append(numValueOf);
        if (numValueOf == null || (imageView = this.u) == null) {
            return;
        }
        Drawable background = imageView.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(numValueOf.intValue());
            this.A = numValueOf;
        }
    }

    public void d() {
        RelativeLayout relativeLayout = this.s;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        TextView textView = this.k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setVisibility(0);
            this.i.setTextSize(14.0f);
        }
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        TextView textView3 = this.f5989n;
        if (textView3 != null) {
            textView3.setVisibility(0);
            this.f5989n.setTextSize(18.0f);
            this.f5989n.setTextColor(ContextCompat.getColor(getContext(), R$color.health_1A1A1A));
            ((LinearLayout.LayoutParams) this.f5989n.getLayoutParams()).rightMargin = 0;
        }
        TextView textView4 = this.p;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.p.setTextSize(14.0f);
        }
        TextView textView5 = this.o;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.w.setImageDrawable(null);
        }
        TextView textView6 = this.x;
        if (textView6 != null) {
            textView6.setVisibility(8);
        }
        ImageView imageView2 = this.v;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        TextView textView7 = this.f5988l;
        if (textView7 != null) {
            textView7.setOnClickListener(null);
        }
        TextView textView8 = this.m;
        if (textView8 != null) {
            textView8.setVisibility(8);
            this.m.setOnClickListener(null);
        }
        AppCompatTextView appCompatTextView = this.q;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
    }

    public void e(long j2, boolean z) {
        String strA = a(j2, z);
        if (this.o == null || TextUtils.isEmpty(strA)) {
            return;
        }
        this.o.setVisibility(0);
        this.o.setText(strA);
    }

    public void f(String str, String str2, String str3) {
        this.i.setText(str);
        this.s.setVisibility(0);
        this.f5987j.setText(str2);
        this.f5988l.setText(str3);
        this.z.setVisibility(8);
        this.r.setVisibility(8);
        this.o.setVisibility(8);
    }

    public void g(TextView textView, long j2) {
        h(textView, j2, false);
    }

    public FrameLayout getFrameLayout() {
        return this.r;
    }

    public String getTitle() {
        return this.i.getText().toString();
    }

    public void h(TextView textView, long j2, boolean z) {
        String strA = a(j2, z);
        if (textView == null || TextUtils.isEmpty(strA)) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(strA);
    }

    public void i(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("showNewCardTag show:");
        sb.append(z);
        if (z) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    public void setCustomBackgroundDrawable(Drawable drawable) {
        this.y.setBackground(drawable);
    }

    public void setCustomHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        layoutParams.height = qmg.a(getContext(), i);
        this.t.setLayoutParams(layoutParams);
    }

    public void setDataContent(CharSequence charSequence) {
        this.f5989n.setText(charSequence);
    }

    public void setDataContent2(String str) {
        this.p.setText(str);
    }

    public void setDataContent2Color(int i) {
        this.p.setTextColor(i);
    }

    public void setDataContentColor(int i) {
        this.f5989n.setTextColor(i);
    }

    public void setDataModel(String str) {
        this.i.setText(str);
        this.s.setVisibility(8);
        this.k.setVisibility(8);
        this.i.setVisibility(0);
        this.r.setVisibility(0);
        this.z.setVisibility(0);
        this.f5989n.setVisibility(0);
        this.o.setVisibility(0);
    }

    public void setDataNotice(String str) {
        this.o.setText(str);
    }

    public void setDataNoticeToTime(long j2) {
        e(j2, false);
    }

    public void setExtendStr(String str) {
        this.k.setVisibility(0);
        this.k.setText(str);
    }

    public void setIcon(int i) {
        this.v.setImageDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public HealthCommonCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = null;
        this.B = null;
        b();
    }

    public HealthCommonCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = null;
        this.B = null;
        b();
    }
}