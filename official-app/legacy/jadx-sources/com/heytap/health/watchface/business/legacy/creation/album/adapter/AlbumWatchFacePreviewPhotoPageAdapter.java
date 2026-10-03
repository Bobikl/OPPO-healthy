package com.heytap.health.watchface.business.legacy.creation.album.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.wearable.support.watchface.common.utils.DensityUtil;
import com.oplus.aiunit.vision.d5a;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.kvi;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumWatchFacePreviewPhotoPageAdapter extends PagerAdapter {
    public List<ImageItem> a;
    public final Activity b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6869c;
    public final int d;

    public AlbumWatchFacePreviewPhotoPageAdapter(Activity activity, List<ImageItem> list, kvi kviVar) {
        this.b = activity;
        this.a = list;
        this.f6869c = DensityUtil.getScreenWidth(activity);
        this.d = DensityUtil.getScreenHeight(activity) - ejg.h();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<ImageItem> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ImageView imageView = new ImageView(this.b);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        d5a.j(this.b, this.a.get(i).mUriPath, imageView, this.f6869c, this.d);
        viewGroup.addView(imageView);
        return imageView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
