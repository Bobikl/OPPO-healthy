package com.heytap.sporthealth.fit.weiget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import com.coui.appcompat.seekbar.COUISeekBar;
import com.heytap.sporthealth.fit.R$id;
import com.heytap.sporthealth.fit.R$layout;
import com.oplus.aiunit.vision.jfk;
import com.oplus.aiunit.vision.jr9;
import com.oplus.aiunit.vision.rg7;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class JMediaController extends FrameLayout implements jr9, PlayPause.a {
    public final COUISeekBar.l A;
    public MediaController.MediaPlayerControl i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f7785j;
    public ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f7786l;
    public COUISeekBar m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7787n;
    public boolean o;
    public StringBuilder p;
    public Formatter q;
    public ToolsLayout r;
    public PlayPause s;
    public COUISeekBar.l t;
    public TextView u;
    public TextView v;
    public Activity w;
    public boolean x;
    public final Runnable y;
    public final Runnable z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iQ = JMediaController.this.q();
            if (!JMediaController.this.o && JMediaController.this.f7787n && JMediaController.this.i.isPlaying()) {
                JMediaController jMediaController = JMediaController.this;
                jMediaController.postDelayed(jMediaController.z, 1000 - (iQ % 1000));
            }
        }
    }

    public class b implements COUISeekBar.l {
        public b() {
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void J6(COUISeekBar cOUISeekBar) {
            JMediaController.this.i.pause();
            JMediaController.this.c(3600000);
            if (JMediaController.this.t != null) {
                JMediaController.this.t.J6(cOUISeekBar);
            }
            JMediaController.this.o = true;
            JMediaController jMediaController = JMediaController.this;
            jMediaController.removeCallbacks(jMediaController.z);
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void N4(COUISeekBar cOUISeekBar, int i, boolean z) {
            if (z) {
                JMediaController jMediaController = JMediaController.this;
                jMediaController.removeCallbacks(jMediaController.z);
                if (JMediaController.this.t != null) {
                    JMediaController.this.t.N4(cOUISeekBar, i, z);
                }
                int duration = (int) ((((long) JMediaController.this.i.getDuration()) * ((long) i)) / 1000);
                JMediaController.this.i.seekTo(duration);
                if (JMediaController.this.v != null) {
                    JMediaController.this.v.setText(JMediaController.this.s(duration));
                }
            }
        }

        @Override // com.coui.appcompat.seekbar.COUISeekBar.l
        public void u4(COUISeekBar cOUISeekBar) {
            JMediaController.this.i.start();
            JMediaController.this.o = false;
            JMediaController.this.q();
            JMediaController.this.b();
            JMediaController.this.c(3000);
            JMediaController jMediaController = JMediaController.this;
            jMediaController.post(jMediaController.z);
            if (JMediaController.this.t != null) {
                JMediaController.this.t.u4(cOUISeekBar);
            }
        }
    }

    public JMediaController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new Runnable() { // from class: com.oplus.aiunit.vision.zha
            @Override // java.lang.Runnable
            public final void run() {
                this.i.hide();
            }
        };
        this.z = new a();
        this.A = new b();
        this.f7785j = context;
        this.w = rg7.g(this);
    }

    @Override // com.heytap.sporthealth.fit.weiget.PlayPause.a
    public void a(boolean z) {
        if (z) {
            this.i.start();
        } else {
            this.i.pause();
        }
        c(3000);
    }

    @Override // com.oplus.aiunit.vision.jr9
    public void b() {
        if (this.f7786l == null) {
            return;
        }
        if (this.i.isPlaying()) {
            this.s.b();
        } else {
            this.s.a();
        }
    }

    public void c(int i) {
        if (!this.f7787n && this.k != null) {
            r(true);
            this.r.setVisibility(0);
            this.f7787n = true;
        }
        b();
        post(this.z);
        removeCallbacks(this.y);
        if (i != 0) {
            postDelayed(this.y, i);
        }
    }

    @Override // com.oplus.aiunit.vision.jr9
    public void hide() {
        if (this.k != null && this.f7787n) {
            this.r.setVisibility(8);
            jfk.b(this.w);
            this.f7787n = false;
        }
    }

    public boolean isShowing() {
        return this.f7787n;
    }

    public <T extends View> T m(int i) {
        return (T) this.f7786l.findViewById(i);
    }

    public void n() {
        if (this.k == null) {
            return;
        }
        this.r.setVisibilityByTag("toolbar");
        jfk.b(this.w);
        this.f7787n = false;
    }

    public final void o(View view) {
        COUISeekBar cOUISeekBar = (COUISeekBar) view.findViewById(R$id.sbar_media_progress);
        this.m = cOUISeekBar;
        cOUISeekBar.setMax(1000);
        this.m.setOnSeekBarChangeListener(this.A);
        this.r = (ToolsLayout) view.findViewById(R$id.tool_layout);
        PlayPause playPause = (PlayPause) view.findViewById(R$id.play_pause);
        this.s = playPause;
        playPause.c(this);
        this.u = (TextView) m(R$id.fit_tools_video_totaltime);
        this.v = (TextView) m(R$id.fit_tools_video_progresstime);
        this.p = new StringBuilder();
        this.q = new Formatter(this.p, Locale.getDefault());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.z);
        removeCallbacks(this.y);
        removeAllViews();
    }

    public View p() {
        View viewInflate = ((LayoutInflater) this.f7785j.getSystemService("layout_inflater")).inflate(R$layout.train_media_controller, (ViewGroup) this, false);
        this.f7786l = viewInflate;
        o(viewInflate);
        return this.f7786l;
    }

    public final int q() {
        return r(false);
    }

    public final int r(boolean z) {
        MediaController.MediaPlayerControl mediaPlayerControl = this.i;
        if (mediaPlayerControl == null || this.o) {
            return 0;
        }
        int currentPosition = mediaPlayerControl.getCurrentPosition();
        int duration = this.i.getDuration();
        COUISeekBar cOUISeekBar = this.m;
        if (cOUISeekBar != null && duration > 0) {
            long j2 = (((long) currentPosition) * 1000) / ((long) duration);
            if (z || j2 > cOUISeekBar.getProgress() || ((long) this.m.getProgress()) - j2 > this.m.getMax() / 4) {
                this.m.setProgress((int) j2);
            }
        }
        TextView textView = this.u;
        if (textView != null) {
            textView.setText(s(duration));
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setText(s(currentPosition) + " ");
        }
        return currentPosition;
    }

    public final String s(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        this.p.setLength(0);
        return i5 > 0 ? this.q.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)).toString() : this.q.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3)).toString();
    }

    @Override // com.oplus.aiunit.vision.jr9
    public void setAnchorView(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        addView(p(), layoutParams);
        if (this.k == null) {
            viewGroup.addView(this, -1, -1);
            this.k = viewGroup;
        }
    }

    @Override // com.oplus.aiunit.vision.jr9
    public void setMediaPlayer(MediaController.MediaPlayerControl mediaPlayerControl) {
        this.i = mediaPlayerControl;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(s(mediaPlayerControl.getDuration()));
        }
        b();
    }

    public void setOnVideoProgressChangeListener(COUISeekBar.l lVar) {
        this.t = lVar;
    }

    public void setWithLinkageWithWatch(boolean z) {
        this.x = z;
    }

    @Override // com.oplus.aiunit.vision.jr9
    public void show() {
        c(3000);
    }

    public JMediaController(Context context) {
        this(context, null);
    }
}
