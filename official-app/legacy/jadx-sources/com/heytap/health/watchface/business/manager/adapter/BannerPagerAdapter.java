package com.heytap.health.watchface.business.manager.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.heytap.health.watchface.business.view.RoundImageView;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.oplus.aiunit.vision.d5a;
import com.oplus.aiunit.vision.ejg;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BannerPagerAdapter extends PagerAdapter {
    public Context a;
    public List<WatchFaceHomeCard.Banner> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f6970c;
    public int d;

    public interface a {
        void a(WatchFaceHomeCard.Banner banner);
    }

    public BannerPagerAdapter(Context context, List<WatchFaceHomeCard.Banner> list) {
        this.d = 0;
        this.a = context;
        this.b = list;
        this.d = list != null ? list.size() : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WatchFaceHomeCard.Banner banner, View view) {
        a aVar = this.f6970c;
        if (aVar != null) {
            aVar.a(banner);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        int i = this.d;
        if (i <= 1) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        RoundImageView roundImageView = new RoundImageView(this.a);
        roundImageView.setBorderWidth(0.0f);
        roundImageView.setCornerRadius(ejg.a(this.a, 18.0f));
        roundImageView.setForceDarkAllowed(false);
        roundImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        final WatchFaceHomeCard.Banner banner = this.b.get(i % this.d);
        d5a.t(roundImageView, banner.getImage().getUrl());
        roundImageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vx0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.b(banner, view);
            }
        });
        viewGroup.addView(roundImageView);
        return roundImageView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void setOnClickListener(a aVar) {
        this.f6970c = aVar;
    }
}
