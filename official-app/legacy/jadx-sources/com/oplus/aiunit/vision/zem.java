package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amap.api.maps.AMap;
import com.amap.api.maps.InfoWindowParams;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;

/* JADX INFO: loaded from: classes12.dex */
public final class zem {
    public View d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f19395e;
    public TextView f;
    public Context h;
    public IInfoWindowAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IInfoWindowAction f19396j;
    public BaseOverlay k;
    public AMap.InfoWindowAdapter a = null;
    public AMap.CommonInfoWindowAdapter b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19394c = true;
    public Drawable g = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AMap.InfoWindowAdapter f19397l = new a();
    public AMap.CommonInfoWindowAdapter m = new b();

    public class a implements AMap.InfoWindowAdapter {
        public a() {
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoContents(Marker marker) {
            return null;
        }

        @Override // com.amap.api.maps.AMap.InfoWindowAdapter
        public final View getInfoWindow(Marker marker) {
            try {
                if (zem.this.g == null) {
                    zem zemVar = zem.this;
                    zemVar.g = brm.c(zemVar.h, "infowindow_bg.9.png");
                }
                if (zem.this.d == null) {
                    zem.this.d = new LinearLayout(zem.this.h);
                    zem.this.d.setBackground(zem.this.g);
                    zem.this.f19395e = new TextView(zem.this.h);
                    zem.this.f19395e.setText(marker.getTitle());
                    zem.this.f19395e.setTextColor(-16777216);
                    zem.this.f = new TextView(zem.this.h);
                    zem.this.f.setTextColor(-16777216);
                    zem.this.f.setText(marker.getSnippet());
                    ((LinearLayout) zem.this.d).setOrientation(1);
                    ((LinearLayout) zem.this.d).addView(zem.this.f19395e);
                    ((LinearLayout) zem.this.d).addView(zem.this.f);
                }
            } catch (Throwable th) {
                c2n.r(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
            }
            return zem.this.d;
        }
    }

    public class b implements AMap.CommonInfoWindowAdapter {
        public InfoWindowParams a = null;

        public b() {
        }

        @Override // com.amap.api.maps.AMap.CommonInfoWindowAdapter
        public final InfoWindowParams getInfoWindowParams(BasePointOverlay basePointOverlay) {
            try {
                if (this.a == null) {
                    this.a = new InfoWindowParams();
                    if (zem.this.g == null) {
                        zem zemVar = zem.this;
                        zemVar.g = brm.c(zemVar.h, "infowindow_bg.9.png");
                    }
                    zem.this.d = new LinearLayout(zem.this.h);
                    zem.this.d.setBackground(zem.this.g);
                    zem.this.f19395e = new TextView(zem.this.h);
                    zem.this.f19395e.setText("标题");
                    zem.this.f19395e.setTextColor(-16777216);
                    zem.this.f = new TextView(zem.this.h);
                    zem.this.f.setTextColor(-16777216);
                    zem.this.f.setText("内容");
                    ((LinearLayout) zem.this.d).setOrientation(1);
                    ((LinearLayout) zem.this.d).addView(zem.this.f19395e);
                    ((LinearLayout) zem.this.d).addView(zem.this.f);
                    this.a.setInfoWindowType(2);
                    this.a.setInfoWindow(zem.this.d);
                }
                return this.a;
            } catch (Throwable th) {
                c2n.r(th, "InfoWindowDelegate", "showInfoWindow decodeDrawableFromAsset");
                th.printStackTrace();
                return null;
            }
        }
    }

    public zem(Context context) {
        this.h = context;
    }

    public static void g(View view, BasePointOverlay basePointOverlay) {
        if (view == null || basePointOverlay == null || basePointOverlay.getPosition() == null || !arm.g()) {
            return;
        }
        String strZ = xsm.Z(view);
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        arm.a().c(basePointOverlay.getPosition(), strZ, "");
    }

    public static boolean t(AMap.InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter == null) {
            return true;
        }
        Marker marker = new Marker(null, null, new MarkerOptions(), "check");
        return infoWindowAdapter.getInfoWindow(marker) == null && infoWindowAdapter.getInfoContents(marker) == null;
    }

    public final View c(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            View infoWindow = infoWindowAdapter.getInfoWindow((Marker) basePointOverlay);
            g(infoWindow, basePointOverlay);
            return infoWindow;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoWindow2 = infoWindowParams.getInfoWindow();
            g(infoWindow2, basePointOverlay);
            return infoWindow2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoWindow();
        }
        return null;
    }

    public final BaseOverlay f(MotionEvent motionEvent) {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY == null || !iInfoWindowActionY.onInfoWindowTap(motionEvent)) {
            return null;
        }
        return this.k;
    }

    public final synchronized void h(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) {
        this.b = commonInfoWindowAdapter;
        this.a = null;
        if (commonInfoWindowAdapter == null) {
            this.b = this.m;
            this.f19394c = true;
        } else {
            this.f19394c = false;
        }
        IInfoWindowAction iInfoWindowAction = this.f19396j;
        if (iInfoWindowAction != null) {
            iInfoWindowAction.hideInfoWindow();
        }
        IInfoWindowAction iInfoWindowAction2 = this.i;
        if (iInfoWindowAction2 != null) {
            iInfoWindowAction2.hideInfoWindow();
        }
    }

    public final synchronized void i(AMap.InfoWindowAdapter infoWindowAdapter) {
        this.a = infoWindowAdapter;
        this.b = null;
        if (t(infoWindowAdapter)) {
            this.a = this.f19397l;
            this.f19394c = true;
        } else {
            this.f19394c = false;
        }
        IInfoWindowAction iInfoWindowAction = this.f19396j;
        if (iInfoWindowAction != null) {
            iInfoWindowAction.hideInfoWindow();
        }
        IInfoWindowAction iInfoWindowAction2 = this.i;
        if (iInfoWindowAction2 != null) {
            iInfoWindowAction2.hideInfoWindow();
        }
    }

    public final void j(BaseOverlay baseOverlay) throws RemoteException {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY == null || !(baseOverlay instanceof BasePointOverlay)) {
            return;
        }
        iInfoWindowActionY.showInfoWindow((BasePointOverlay) baseOverlay);
        this.k = baseOverlay;
    }

    public final void k(BaseOverlayImp baseOverlayImp) throws RemoteException {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.showInfoWindow(baseOverlayImp);
        }
    }

    public final void l(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            this.i = iInfoWindowAction;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.setInfoWindowAdapterManager(this);
            }
        }
    }

    public final void m(String str, String str2) {
        TextView textView = this.f19395e;
        if (textView != null) {
            textView.requestLayout();
            this.f19395e.setText(str);
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            textView2.requestLayout();
            this.f.setText(str2);
        }
        View view = this.d;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final synchronized boolean n() {
        return this.f19394c;
    }

    public final View o(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            View infoContents = infoWindowAdapter.getInfoContents((Marker) basePointOverlay);
            g(infoContents, basePointOverlay);
            return infoContents;
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter != null && (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) != null) {
            View infoContents2 = infoWindowParams.getInfoContents();
            g(infoContents2, basePointOverlay);
            return infoContents2;
        }
        InfoWindowParams infoWindowParams2 = this.m.getInfoWindowParams(basePointOverlay);
        if (infoWindowParams2 != null) {
            return infoWindowParams2.getInfoContents();
        }
        return null;
    }

    public final void r() {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.redrawInfoWindow();
        }
    }

    public final void s(IInfoWindowAction iInfoWindowAction) {
        synchronized (this) {
            this.f19396j = iInfoWindowAction;
            if (iInfoWindowAction != null) {
                iInfoWindowAction.setInfoWindowAdapterManager(this);
            }
        }
    }

    public final long u(BasePointOverlay basePointOverlay) {
        InfoWindowParams infoWindowParams;
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null && (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter)) {
            return ((AMap.ImageInfoWindowAdapter) infoWindowAdapter).getInfoWindowUpdateTime();
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter == null || (infoWindowParams = commonInfoWindowAdapter.getInfoWindowParams(basePointOverlay)) == null) {
            return 0L;
        }
        return infoWindowParams.getInfoWindowUpdateTime();
    }

    public final void w() {
        IInfoWindowAction iInfoWindowActionY = y();
        if (iInfoWindowActionY != null) {
            iInfoWindowActionY.hideInfoWindow();
        }
    }

    public final synchronized IInfoWindowAction y() {
        AMap.InfoWindowAdapter infoWindowAdapter = this.a;
        if (infoWindowAdapter != null) {
            if (infoWindowAdapter instanceof AMap.ImageInfoWindowAdapter) {
                return this.f19396j;
            }
            if (infoWindowAdapter instanceof AMap.MultiPositionInfoWindowAdapter) {
                return this.f19396j;
            }
        }
        AMap.CommonInfoWindowAdapter commonInfoWindowAdapter = this.b;
        if (commonInfoWindowAdapter == null || commonInfoWindowAdapter.getInfoWindowParams(null).getInfoWindowType() != 1) {
            return this.i;
        }
        return this.f19396j;
    }
}
