package com.heytap.sporthealth.fit.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.sporthealth.fit.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public class PlayPause extends AppCompatImageView implements View.OnClickListener {
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7791j;

    public interface a {
        void a(boolean z);
    }

    public PlayPause(Context context) {
        super(context);
        this.f7791j = true;
    }

    public void a() {
        setImageResource(R$drawable.fit_ic_play);
        this.f7791j = false;
    }

    public void b() {
        setImageResource(R$drawable.fit_ic_pause);
        this.f7791j = true;
    }

    public PlayPause c(a aVar) {
        this.i = aVar;
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f7791j) {
            a();
        } else {
            b();
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.f7791j);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        setImageResource(R$drawable.fit_ic_pause);
    }

    public PlayPause(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7791j = true;
    }
}
