package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.DownloadProgressView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.health.R;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes12.dex */
public final class jvm implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f13049j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f13050l;
    public ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f13051n;
    public OfflineMapManager o;
    public OfflineMapCity p;
    public View s;
    public DownloadProgressView t;
    public int i = 0;
    public boolean q = false;
    public Handler r = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                jvm.this.c(message.arg1, message.arg2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public jvm(Context context, OfflineMapManager offlineMapManager) {
        this.f13049j = context;
        f();
        this.o = offlineMapManager;
    }

    public final View a() {
        return this.s;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void c(int i, int i2) throws Exception {
        if (this.i != 2 || i2 <= 3 || i2 >= 100) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
            this.t.setProgress(i2);
        }
        if (i == -1) {
            k();
            return;
        }
        if (i == 0) {
            if (this.i != 1) {
                o();
                return;
            }
            this.m.setVisibility(8);
            this.f13051n.setText("下载中");
            this.f13051n.setTextColor(Color.parseColor("#4287ff"));
            return;
        }
        if (i == 1) {
            n();
            return;
        }
        if (i == 2) {
            j();
            return;
        }
        if (i == 3) {
            l();
            return;
        }
        if (i == 4) {
            m();
            return;
        }
        if (i == 6) {
            h();
        } else {
            if (i == 7) {
                i();
                return;
            }
            switch (i) {
                case 101:
                case 102:
                case 103:
                    k();
                    break;
            }
        }
    }

    public final void d(OfflineMapCity offlineMapCity) {
        if (offlineMapCity != null) {
            this.p = offlineMapCity;
            this.k.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            if (size == 0.0d) {
                this.f13050l.setVisibility(8);
                this.m.setVisibility(8);
                return;
            }
            this.f13050l.setText(String.valueOf(size) + " M");
            g(this.p.getState(), this.p.getcompleteCode());
        }
    }

    public final void f() {
        View viewD = kxm.d(this.f13049j, R.array.NXcolor_solor_mounth);
        this.s = viewD;
        this.t = (DownloadProgressView) viewD.findViewById(R.dimen.NXM5);
        this.k = (TextView) this.s.findViewById(R.dimen.NXM12);
        this.f13050l = (TextView) this.s.findViewById(R.dimen.NXM4);
        this.m = (ImageView) this.s.findViewById(R.dimen.NXM3);
        this.f13051n = (TextView) this.s.findViewById(R.dimen.NXM2);
        this.m.setOnClickListener(this);
    }

    public final void g(int i, int i2) {
        OfflineMapCity offlineMapCity = this.p;
        if (offlineMapCity != null) {
            offlineMapCity.setState(i);
            this.p.setCompleteCode(i2);
        }
        Message message = new Message();
        message.arg1 = i;
        message.arg2 = i2;
        this.r.sendMessage(message);
    }

    public final void h() {
        this.f13051n.setVisibility(8);
        this.m.setVisibility(0);
        this.m.setImageResource(R.animator.bus_shift_in_end);
    }

    public final void i() {
        this.f13051n.setVisibility(0);
        this.m.setVisibility(0);
        this.m.setImageResource(R.animator.bus_shift_in_end);
        this.f13051n.setText("已下载-有更新");
    }

    public final void j() {
        if (this.i == 1) {
            this.m.setVisibility(8);
            this.f13051n.setVisibility(0);
            this.f13051n.setText("等待中");
            this.f13051n.setTextColor(Color.parseColor("#4287ff"));
            return;
        }
        this.f13051n.setVisibility(0);
        this.m.setVisibility(8);
        this.f13051n.setTextColor(Color.parseColor("#4287ff"));
        this.f13051n.setText("等待中");
    }

    public final void k() {
        this.f13051n.setVisibility(0);
        this.m.setVisibility(8);
        this.f13051n.setTextColor(SupportMenu.CATEGORY_MASK);
        this.f13051n.setText("下载出现异常");
    }

    public final void l() {
        this.f13051n.setVisibility(0);
        this.m.setVisibility(8);
        this.f13051n.setTextColor(BannerConfig.INDICATOR_SELECTED_COLOR);
        this.f13051n.setText(LanUtils.CN.PAUSE);
    }

    public final void m() {
        this.f13051n.setVisibility(0);
        this.m.setVisibility(8);
        this.f13051n.setText("已下载");
        this.f13051n.setTextColor(Color.parseColor("#898989"));
    }

    public final void n() {
        if (this.i == 1) {
            return;
        }
        this.f13051n.setVisibility(0);
        this.m.setVisibility(8);
        this.f13051n.setText("解压中");
        this.f13051n.setTextColor(Color.parseColor("#898989"));
    }

    public final void o() {
        if (this.p == null) {
            return;
        }
        this.f13051n.setVisibility(0);
        this.f13051n.setText("下载中");
        this.m.setVisibility(8);
        this.f13051n.setTextColor(Color.parseColor("#4287ff"));
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public final void onClick(View view) {
        try {
            if (!xsm.j0(this.f13049j)) {
                Toast.makeText(this.f13049j, "无网络连接", 0).show();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
                return;
            }
            OfflineMapCity offlineMapCity = this.p;
            if (offlineMapCity != null) {
                int state = offlineMapCity.getState();
                this.p.getcompleteCode();
                if (state == 0) {
                    p();
                    l();
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    return;
                } else if (state == 1 || state == 4) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    return;
                } else {
                    if (q()) {
                        j();
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                        return;
                    }
                    k();
                }
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        } catch (Exception e2) {
            e2.printStackTrace();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public final synchronized void p() {
        this.o.pause();
        this.o.restart();
    }

    public final synchronized boolean q() {
        try {
            this.o.downloadByCityName(this.p.getCity());
        } catch (AMapException e2) {
            e2.printStackTrace();
            Toast.makeText(this.f13049j, e2.getErrorMessage(), 0).show();
            return false;
        }
        return true;
    }
}
