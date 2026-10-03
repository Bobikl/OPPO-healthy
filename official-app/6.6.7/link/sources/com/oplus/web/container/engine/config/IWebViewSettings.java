package com.oplus.web.container.engine.config;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IWebViewSettings {

    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS,
        TEXT_AUTOSIZING
    }

    public enum ZoomDensity {
        FAR,
        MEDIUM,
        CLOSE
    }

    void a(boolean z);

    void b(ZoomDensity zoomDensity);

    void c(String str);

    String d();

    void e(LayoutAlgorithm layoutAlgorithm);

    void f(int i);

    void g(boolean z);

    void h(boolean z);

    void i(boolean z);

    void j(boolean z);

    void k(String str);

    void l(boolean z);

    void m(boolean z);

    void n(boolean z);

    void o(int i);

    void p(boolean z);

    void q(boolean z);

    void r(boolean z);

    void removeAllViews();

    void s(boolean z);

    void setForceDarkAllowed(boolean z);

    void t();

    void u(boolean z);

    void v(boolean z);

    void w(boolean z);

    void x(boolean z);
}
