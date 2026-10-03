package com.coui.appcompat.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUICompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {

    @NonNull
    public final List<ViewPager2.OnPageChangeCallback> i;

    public COUICompositeOnPageChangeCallback(int i) {
        this.i = new ArrayList(i);
    }

    public void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.i.add(onPageChangeCallback);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, @Px int i2) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        try {
            Iterator<ViewPager2.OnPageChangeCallback> it = this.i.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void removeOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.i.remove(onPageChangeCallback);
    }

    public final void throwCallbackListModifiedWhileInUse(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
