package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageFolder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class v3a extends BaseAdapter {
    public final Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f17692j;
    public List<ImageFolder> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17693l = 0;

    public static class a {
        public ImageView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f17694c;
        public CheckedTextView d;

        public a(View view) {
            this.a = (ImageView) view.findViewById(R$id.iv_cover);
            this.b = (TextView) view.findViewById(R$id.tv_folder_name);
            this.f17694c = (TextView) view.findViewById(R$id.tv_image_count);
            this.d = (CheckedTextView) view.findViewById(R$id.iv_folder_check);
            view.setTag(this);
        }
    }

    public v3a(Activity activity, List<ImageFolder> list) {
        this.i = activity;
        this.k = list;
        this.f17692j = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImageFolder getItem(int i) {
        return this.k.get(i);
    }

    public int b() {
        return this.f17693l;
    }

    public void c(List<ImageFolder> list) {
        if (list == null || list.size() <= 0) {
            List<ImageFolder> list2 = this.k;
            if (list2 != null) {
                list2.clear();
            }
        } else {
            this.k = list;
        }
        notifyDataSetChanged();
    }

    public void d(int i) {
        if (this.f17693l == i) {
            return;
        }
        this.f17693l = i;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<ImageFolder> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.f17692j.inflate(R$layout.watch_face_adapter_folder_image_item, viewGroup, false);
            aVar = new a(view);
        } else {
            aVar = (a) view.getTag();
        }
        ImageFolder item = getItem(i);
        aVar.b.setText(item.mName);
        aVar.f17694c.setText(String.valueOf(item.mImages.size()));
        a78.d(this.i, item.mCover.mUriPath, aVar.a, 500);
        aVar.d.setChecked(this.f17693l == i);
        return view;
    }
}
