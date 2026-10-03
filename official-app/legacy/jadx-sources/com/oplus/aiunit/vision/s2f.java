package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class s2f {
    public List<a> a;
    public List<b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentProvider f16452c;

    public interface a {
        void a(Uri uri);

        void b(Uri uri);
    }

    public interface b {
        void a(ProviderInfo providerInfo);

        void onCreate();
    }

    public static class c {
        public static s2f a = new s2f();
    }

    public static s2f a() {
        return c.a;
    }

    public void addOnCallingListener(a aVar) {
        if (this.a.contains(aVar)) {
            return;
        }
        this.a.add(aVar);
    }

    public void addOnLifeCycleListener(b bVar) {
        if (this.b.contains(bVar)) {
            return;
        }
        this.b.add(bVar);
    }

    public void b(ProviderInfo providerInfo) {
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(providerInfo);
        }
    }

    public void c() {
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onCreate();
        }
    }

    public void d(Uri uri) {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(uri);
        }
    }

    public void e(Uri uri) {
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(uri);
        }
    }

    public void f(ContentProvider contentProvider) {
        this.f16452c = (ContentProvider) woe.b(contentProvider);
    }

    public void removeOnCallingListener(a aVar) {
        if (this.a.contains(aVar)) {
            this.a.remove(aVar);
        }
    }

    public void removeOnLifeCycleListener(b bVar) {
        if (this.b.contains(bVar)) {
            this.b.remove(bVar);
        }
    }

    public s2f() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
