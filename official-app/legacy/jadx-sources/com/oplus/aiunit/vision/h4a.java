package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageFolder;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class h4a {
    public static final int MAX_SELECT_LIMIT = 10;
    public static final String TAG = "ImagePicker";
    public final List<ImageItem> a;
    public final List<ImageItem> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ImageItem> f11989c;
    public List<ImageFolder> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11990e;
    public int f;
    public int g;

    public static class a {
        public static final h4a a = new h4a();
    }

    public static h4a i() {
        return a.a;
    }

    public void a(ImageItem imageItem, boolean z) {
        if (z) {
            this.b.add(imageItem);
        } else {
            this.b.remove(imageItem);
        }
    }

    public void b() {
        List<ImageFolder> list = this.d;
        if (list != null) {
            list.clear();
            this.d = null;
        }
        this.a.clear();
        this.b.clear();
        this.f11989c.clear();
        this.f11990e = 0;
    }

    public void c() {
        this.a.clear();
    }

    public void d() {
        this.f11989c.clear();
    }

    public void e() {
        this.b.clear();
    }

    public List<ImageItem> f() {
        return this.a;
    }

    public ArrayList<ImageItem> g() {
        List<ImageFolder> list = this.d;
        if (list == null) {
            return null;
        }
        int size = list.size();
        int i = this.f11990e;
        if (size <= i) {
            return null;
        }
        return this.d.get(i).mImages;
    }

    public List<ImageItem> h() {
        return this.f11989c;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.b.size();
    }

    public List<ImageItem> l() {
        return this.b;
    }

    public int m() {
        return this.g;
    }

    public void n(List<ImageItem> list) {
        if (list != null) {
            this.a.clear();
            this.a.addAll(list);
        }
    }

    public void o(int i) {
        this.f11990e = i;
    }

    public void p(List<ImageItem> list) {
        if (list != null) {
            this.f11989c.clear();
            this.f11989c.addAll(list);
        }
    }

    public void q(List<ImageFolder> list) {
        this.d = list;
    }

    public void r(int i) {
        this.f = i;
    }

    public void s(List<ImageItem> list) {
        if (list != null) {
            this.b.clear();
            this.b.addAll(list);
        }
    }

    public void t(int i) {
        this.g = i;
    }

    public h4a() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.f11989c = new ArrayList();
        this.f11990e = 0;
        this.f = 10;
        this.g = 10;
    }
}
