package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.health.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class otm extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {
    public boolean[] a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jvm f15053c;
    public List<OfflineMapProvince> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<OfflineMapProvince> f15054e = new ArrayList();
    public lvm f;
    public OfflineMapManager g;

    public class a implements View.OnClickListener {
        public final /* synthetic */ OfflineMapCity i;

        public a(OfflineMapCity offlineMapCity) {
            this.i = offlineMapCity;
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            otm.this.f.j(this.i);
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public final class b {
        public jvm a;

        public b() {
        }
    }

    public otm(Context context, lvm lvmVar, OfflineMapManager offlineMapManager, List<OfflineMapProvince> list) {
        this.b = context;
        this.f = lvmVar;
        this.g = offlineMapManager;
        if (list != null && list.size() > 0) {
            this.d.clear();
            this.d.addAll(list);
            for (OfflineMapProvince offlineMapProvince : this.d) {
                if (offlineMapProvince != null && offlineMapProvince.getDownloadedCityList().size() > 0) {
                    this.f15054e.add(offlineMapProvince);
                }
            }
        }
        this.a = new boolean[this.f15054e.size()];
    }

    public final void b() {
        for (OfflineMapProvince offlineMapProvince : this.d) {
            if (offlineMapProvince.getDownloadedCityList().size() > 0 && !this.f15054e.contains(offlineMapProvince)) {
                this.f15054e.add(offlineMapProvince);
            }
        }
        this.a = new boolean[this.f15054e.size()];
        notifyDataSetChanged();
    }

    public final void c() {
        try {
            for (int size = this.f15054e.size(); size > 0; size--) {
                OfflineMapProvince offlineMapProvince = this.f15054e.get(size - 1);
                if (offlineMapProvince.getDownloadedCityList().size() == 0) {
                    this.f15054e.remove(offlineMapProvince);
                }
            }
            this.a = new boolean[this.f15054e.size()];
            notifyDataSetChanged();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return this.f15054e.get(i).getDownloadedCityList().get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        b bVar;
        if (view != null) {
            bVar = (b) view.getTag();
        } else {
            bVar = new b();
            jvm jvmVar = new jvm(this.b, this.g);
            this.f15053c = jvmVar;
            jvmVar.b(2);
            view = this.f15053c.a();
            bVar.a = this.f15053c;
            view.setTag(bVar);
        }
        OfflineMapProvince offlineMapProvince = this.f15054e.get(i);
        if (i2 < offlineMapProvince.getDownloadedCityList().size()) {
            OfflineMapCity offlineMapCity = offlineMapProvince.getDownloadedCityList().get(i2);
            bVar.a.d(offlineMapCity);
            view.setOnClickListener(new a(offlineMapCity));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return this.f15054e.get(i).getDownloadedCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f15054e.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.f15054e.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) kxm.d(this.b, R.array.NXcolor_theme_arrays_first_compat_theme3);
        }
        TextView textView = (TextView) view.findViewById(R.dimen.NXM6);
        ImageView imageView = (ImageView) view.findViewById(R.dimen.NXM7);
        textView.setText(this.f15054e.get(i).getProvinceName());
        if (this.a[i]) {
            imageView.setImageDrawable(kxm.b().getDrawable(R.animator.bus_shift_in_first_mask));
        } else {
            imageView.setImageDrawable(kxm.b().getDrawable(R.animator.bus_shift_in_front));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
    public final void onGroupCollapse(int i) {
        this.a[i] = false;
    }

    @Override // android.widget.ExpandableListView.OnGroupExpandListener
    public final void onGroupExpand(int i) {
        this.a[i] = true;
    }
}
