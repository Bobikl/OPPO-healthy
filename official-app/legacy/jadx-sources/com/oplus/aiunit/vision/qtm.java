package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.heytap.health.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class qtm extends BaseAdapter {
    public List<OfflineMapCity> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OfflineMapManager f15938j;
    public Activity k;

    public class a implements View.OnClickListener {
        public final /* synthetic */ b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ OfflineMapCity f15939j;

        public a(b bVar, OfflineMapCity offlineMapCity) {
            this.i = bVar;
            this.f15939j = offlineMapCity;
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            this.i.d.setVisibility(8);
            this.i.f15940c.setVisibility(0);
            this.i.f15940c.setText("下载中");
            try {
                qtm.this.f15938j.downloadByCityName(this.f15939j.getCity());
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            } catch (AMapException e2) {
                e2.printStackTrace();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        }
    }

    public final class b {
        public TextView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f15940c;
        public ImageView d;

        public b() {
        }
    }

    public qtm(OfflineMapManager offlineMapManager, OfflineMapActivity offlineMapActivity) {
        this.f15938j = offlineMapManager;
        this.k = offlineMapActivity;
    }

    public final void b(List<OfflineMapCity> list) {
        this.i = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.i.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.i.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ed A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fa, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x004e, B:19:0x00aa, B:21:0x00ae, B:22:0x00b9, B:23:0x00c6, B:24:0x00d3, B:25:0x00e0, B:26:0x00ed, B:5:0x0048), top: B:31:0x0000 }] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        try {
            OfflineMapCity offlineMapCity = this.i.get(i);
            if (view == null) {
                bVar = new b();
                view = kxm.d(this.k, R.array.NXcolor_solor_mounth);
                bVar.a = (TextView) view.findViewById(R.dimen.NXM12);
                bVar.b = (TextView) view.findViewById(R.dimen.NXM4);
                bVar.f15940c = (TextView) view.findViewById(R.dimen.NXM2);
                bVar.d = (ImageView) view.findViewById(R.dimen.NXM3);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bVar.d.setOnClickListener(new a(bVar, offlineMapCity));
            bVar.f15940c.setVisibility(0);
            bVar.a.setText(offlineMapCity.getCity());
            double size = ((double) ((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d))) / 100.0d;
            bVar.b.setText(String.valueOf(size) + " M");
            int state = offlineMapCity.getState();
            if (state == -1) {
                bVar.d.setVisibility(8);
                bVar.f15940c.setText("下载失败");
            } else if (state == 0 || state == 1) {
                bVar.d.setVisibility(8);
                bVar.f15940c.setText("下载中");
            } else if (state == 2) {
                bVar.d.setVisibility(8);
                bVar.f15940c.setText("等待下载");
            } else if (state == 3) {
                bVar.d.setVisibility(8);
                bVar.f15940c.setText("暂停中");
            } else if (state == 4) {
                bVar.d.setVisibility(8);
                bVar.f15940c.setText("已下载");
            } else if (state != 6) {
                switch (state) {
                    case 101:
                    case 102:
                    case 103:
                        bVar.d.setVisibility(8);
                        bVar.f15940c.setText("下载失败");
                        break;
                    default:
                        break;
                }
            } else {
                bVar.d.setVisibility(0);
                bVar.f15940c.setVisibility(8);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return view;
    }
}
