package com.heytap.sporthealth.fit.weiget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.coui.appcompat.progressbar.COUIHorizontalProgressBar;
import com.heytap.health.ui.R$color;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import com.heytap.sporthealth.fit.R$drawable;
import com.heytap.sporthealth.fit.R$id;
import com.heytap.sporthealth.fit.R$layout;
import com.oplus.aiunit.vision.sk2;

/* JADX INFO: loaded from: classes2.dex */
public class VoiceChangeUI extends LinearLayout {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7795j;
    public ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public COUIHorizontalProgressBar f7796l;

    public VoiceChangeUI(Context context) {
        super(context);
    }

    public void a(float f) {
        this.f7796l.setProgress((int) (f * 100.0f));
    }

    public void b() {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.fit_icon_lightness);
        }
    }

    public void c() {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setImageResource(R$drawable.fit_icon_voice);
        }
    }

    public final void d() {
        this.k = (ImageView) findViewById(R$id.fit_confit_icon);
        this.f7796l = (COUIHorizontalProgressBar) findViewById(R$id.progress_bar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.clipPath(sk2.a().b(0.0f, 0.0f, this.i, this.f7795j, MultiStateLayout.g(7.0f)));
        super.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), R$layout.fit_view_adjust_video_config, this);
        d();
        setBackgroundColor(ContextCompat.getColor(getContext(), R$color.fit_gray_4d));
        setOrientation(0);
        setGravity(17);
        setPadding(MultiStateLayout.g(8.0f), MultiStateLayout.g(8.0f), MultiStateLayout.g(8.0f), MultiStateLayout.g(8.0f));
        setForceDarkAllowed(false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.i = i;
        this.f7795j = i2;
        super.onSizeChanged(i, i2, i3, i4);
    }

    public VoiceChangeUI(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChangeUI(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
