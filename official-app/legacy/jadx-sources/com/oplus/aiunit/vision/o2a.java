package com.oplus.aiunit.vision;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o2a extends ProxySelector {
    public static final List<Proxy> d = Arrays.asList(Proxy.NO_PROXY);
    public final ProxySelector a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14745c;

    public o2a(ProxySelector proxySelector, String str, int i) {
        this.a = (ProxySelector) voe.d(proxySelector);
        this.b = (String) voe.d(str);
        this.f14745c = i;
    }

    public static void a(String str, int i) {
        ProxySelector.setDefault(new o2a(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.b.equals(uri.getHost()) && this.f14745c == uri.getPort() ? d : this.a.select(uri);
    }
}
