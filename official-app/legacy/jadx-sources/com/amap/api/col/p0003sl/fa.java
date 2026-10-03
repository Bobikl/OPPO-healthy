package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.health.R;
import com.oplus.aiunit.vision.kxm;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes12.dex */
public final class fa extends fb implements View.OnClickListener {
    public OfflineMapManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f729j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f730l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f731n;
    public int o;
    public String p;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            fa.this.dismiss();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public fa(Context context, OfflineMapManager offlineMapManager) {
        super(context);
        this.i = offlineMapManager;
    }

    @Override // com.amap.api.col.p0003sl.fb
    public final void a() {
        View viewD = kxm.d(getContext(), R.array.NXcolor_number_keyboard_letters);
        this.f729j = viewD;
        setContentView(viewD);
        this.f729j.setOnClickListener(new a());
        this.k = (TextView) this.f729j.findViewById(R.dimen.NXM0);
        TextView textView = (TextView) this.f729j.findViewById(R.dimen.NXM1);
        this.f730l = textView;
        textView.setText("暂停下载");
        this.m = (TextView) this.f729j.findViewById(R.dimen.NXM10);
        this.f731n = (TextView) this.f729j.findViewById(R.dimen.NXM11);
        this.f730l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.f731n.setOnClickListener(this);
    }

    public final void c(int i, String str) {
        this.k.setText(str);
        if (i == 0) {
            this.f730l.setText("暂停下载");
            this.f730l.setVisibility(0);
            this.m.setText("取消下载");
        }
        if (i == 2) {
            this.f730l.setVisibility(8);
            this.m.setText("取消下载");
        } else if (i == -1 || i == 101 || i == 102 || i == 103) {
            this.f730l.setText(LanUtils.CN.RESUME_DOWNLOAD);
            this.f730l.setVisibility(0);
        } else if (i == 3) {
            this.f730l.setVisibility(0);
            this.f730l.setText(LanUtils.CN.RESUME_DOWNLOAD);
            this.m.setText("取消下载");
        } else if (i == 4) {
            this.m.setText("删除");
            this.f730l.setVisibility(8);
        }
        this.o = i;
        this.p = str;
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public final void onClick(View view) {
        try {
            int id = view.getId();
            if (id != R.dimen.NXM1) {
                if (id == R.dimen.NXM10) {
                    if (!TextUtils.isEmpty(this.p)) {
                        this.i.remove(this.p);
                        dismiss();
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                        return;
                    }
                } else if (id == R.dimen.NXM11) {
                    dismiss();
                }
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
                return;
            }
            int i = this.o;
            if (i == 0) {
                this.f730l.setText(LanUtils.CN.RESUME_DOWNLOAD);
                this.i.pauseByName(this.p);
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.f730l.setText("暂停下载");
                this.i.downloadByCityName(this.p);
            }
            dismiss();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        } catch (Exception e2) {
            e2.printStackTrace();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }
}
