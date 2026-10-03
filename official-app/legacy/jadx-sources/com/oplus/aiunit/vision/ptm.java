package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.health.R;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class ptm extends BaseExpandableListAdapter implements ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener {
    public boolean[] a;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<OfflineMapProvince> f15494c;
    public OfflineMapManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f15495e;

    public final class a {
        public jvm a;

        public a() {
        }
    }

    public ptm(List<OfflineMapProvince> list, OfflineMapManager offlineMapManager, Context context) {
        this.f15494c = list;
        this.d = offlineMapManager;
        this.f15495e = context;
        this.a = new boolean[list.size()];
    }

    public final void a() {
        this.b = -1;
        notifyDataSetChanged();
    }

    public final boolean b(int i) {
        return (i == 0 || i == getGroupCount() - 1) ? false : true;
    }

    public final void c() {
        this.b = 0;
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVar;
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            aVar = new a();
            jvm jvmVar = new jvm(this.f15495e, this.d);
            jvmVar.b(1);
            View viewA = jvmVar.a();
            aVar.a = jvmVar;
            viewA.setTag(aVar);
            view = viewA;
        }
        aVar.a.d(this.f15494c.get(i).getCityList().get(i2));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return b(i) ? this.f15494c.get(i).getCityList().size() : this.f15494c.get(i).getCityList().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.f15494c.get(i).getProvinceName();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        int i = this.b;
        return i == -1 ? this.f15494c.size() : i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (RelativeLayout) kxm.d(this.f15495e, R.array.NXcolor_theme_arrays_first_compat_theme3);
        }
        TextView textView = (TextView) view.findViewById(R.dimen.NXM6);
        ImageView imageView = (ImageView) view.findViewById(R.dimen.NXM7);
        textView.setText(this.f15494c.get(i).getProvinceName());
        if (this.a[i]) {
            imageView.setImageDrawable(kxm.b().getDrawable(R.animator.bus_shift_in_first_mask));
        } else {
            imageView.setImageDrawable(kxm.b().getDrawable(R.animator.bus_shift_in_front));
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return true;
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
