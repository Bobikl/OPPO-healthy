package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class b61<T> extends BaseAdapter {
    public Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<T> f9618j = new ArrayList();
    public LayoutInflater k;

    public b61(Activity activity) {
        this.i = activity;
        this.k = LayoutInflater.from(activity);
    }

    public void a(List<T> list) {
        if (list != null) {
            this.f9618j.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void b(List<T> list) {
        this.f9618j.clear();
        if (list != null) {
            this.f9618j.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<T> list = this.f9618j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        List<T> list = this.f9618j;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }
}
