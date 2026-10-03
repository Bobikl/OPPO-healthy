package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.autonavi.amap.mapcore.interfaces.IAMap;
import com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate;
import com.heytap.store.base.core.http.HttpUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class qdm implements IMapFragmentDelegate {
    public static volatile Context a;
    public static String g;
    public IAMap b;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AMapOptions f15763e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15762c = 0;
    public boolean f = true;

    public qdm(int i) {
        this.d = 0;
        this.d = i % 3;
        d();
    }

    public static void a() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 0; i < stackTrace.length; i++) {
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("TextureMapView")) {
                    z2 = true;
                }
                if (stackTrace[i].getClassName() != null && stackTrace[i].getClassName().endsWith("Fragment")) {
                    z = true;
                }
                if ("OnDestroyView".equalsIgnoreCase(stackTrace[i].getMethodName())) {
                    z3 = true;
                }
            }
            if (z && z2 && !z3) {
                e();
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        if (context != null) {
            a = context.getApplicationContext();
        }
    }

    public static void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 80; i++) {
                sb.append(HttpUtils.EQUAL_SIGN);
            }
            g = sb.toString();
        } catch (Throwable unused) {
        }
    }

    public static void e() {
        Log.i("errorLog", g);
        Log.i("errorLog", "OnDestroy 方法需要在OnDestroyView中调用");
        Log.i("errorLog", g);
    }

    public final void c(AMapOptions aMapOptions) throws RemoteException {
        if (aMapOptions == null || this.b == null) {
            return;
        }
        CameraPosition camera = aMapOptions.getCamera();
        if (camera != null) {
            this.b.moveCamera(CameraUpdateFactory.newCameraPosition(camera));
        }
        UiSettings aMapUiSettings = this.b.getAMapUiSettings();
        aMapUiSettings.setRotateGesturesEnabled(aMapOptions.getRotateGesturesEnabled());
        aMapUiSettings.setScrollGesturesEnabled(aMapOptions.getScrollGesturesEnabled());
        aMapUiSettings.setTiltGesturesEnabled(aMapOptions.getTiltGesturesEnabled());
        aMapUiSettings.setZoomControlsEnabled(aMapOptions.getZoomControlsEnabled());
        aMapUiSettings.setZoomGesturesEnabled(aMapOptions.getZoomGesturesEnabled());
        aMapUiSettings.setCompassEnabled(aMapOptions.getCompassEnabled());
        aMapUiSettings.setScaleControlsEnabled(aMapOptions.getScaleControlsEnabled());
        aMapUiSettings.setLogoPosition(aMapOptions.getLogoPosition());
        this.b.setMapType(aMapOptions.getMapType());
        this.b.setZOrderOnTop(aMapOptions.getZOrderOnTop());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final IAMap getMap() throws RemoteException {
        if (this.b == null) {
            if (a == null) {
                Log.w("MapFragmentDelegateImp", "Context 为 null 请在地图调用之前 使用 MapsInitializer.initialize(Context paramContext) 来设置Context");
                return null;
            }
            int i = a.getResources().getDisplayMetrics().densityDpi;
            if (i <= 120) {
                c9n.b = 0.5f;
            } else if (i <= 160) {
                c9n.b = 0.8f;
            } else if (i <= 240) {
                c9n.b = 0.87f;
            } else if (i <= 320) {
                c9n.b = 1.0f;
            } else if (i <= 480) {
                c9n.b = 1.5f;
            } else if (i <= 640) {
                c9n.b = 1.8f;
            } else {
                c9n.b = 0.9f;
            }
            int i2 = this.d;
            if (i2 == 0) {
                this.b = new com.amap.api.col.p0003sl.o(a, this.f).b();
            } else if (i2 == 1) {
                this.b = new com.amap.api.col.p0003sl.p(a, this.f).r();
            } else {
                this.b = new z5n(a).a();
            }
        }
        return this.b;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void loadWorldVectorMap(boolean z) {
        this.f = z;
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.loadWorldVectorMap(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws RemoteException {
        byte[] byteArray;
        if (a == null && layoutInflater != null) {
            setContext(layoutInflater.getContext().getApplicationContext());
        }
        try {
            IAMap map = getMap();
            this.b = map;
            map.setVisibilityEx(this.f15762c);
            if (this.f15763e == null && bundle != null && (byteArray = bundle.getByteArray("MAP_OPTIONS")) != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                this.f15763e = AMapOptions.CREATOR.createFromParcel(parcelObtain);
            }
            c(this.f15763e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.b.getView();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroy() throws RemoteException {
        a();
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.destroy();
            this.b = null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onDestroyView() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onInflate(Activity activity, AMapOptions aMapOptions, Bundle bundle) throws RemoteException {
        setContext(activity.getApplicationContext());
        this.f15763e = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onLowMemory() throws RemoteException {
        Log.d("onLowMemory", "onLowMemory run");
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onPause() throws RemoteException {
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.onActivityPause();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onResume() throws RemoteException {
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.onActivityResume();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        if (this.b != null) {
            if (this.f15763e == null) {
                this.f15763e = new AMapOptions();
            }
            try {
                Parcel parcelObtain = Parcel.obtain();
                AMapOptions aMapOptionsCamera = this.f15763e.camera(getMap().getCameraPosition());
                this.f15763e = aMapOptionsCamera;
                aMapOptionsCamera.writeToParcel(parcelObtain, 0);
                bundle.putByteArray("MAP_OPTIONS", parcelObtain.marshall());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setContext(Context context) {
        b(context);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setOptions(AMapOptions aMapOptions) {
        this.f15763e = aMapOptions;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setUseForNavi(boolean z) {
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.setUseForNavi(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMapFragmentDelegate
    public final void setVisibility(int i) {
        this.f15762c = i;
        IAMap iAMap = this.b;
        if (iAMap != null) {
            iAMap.setVisibilityEx(i);
        }
    }
}
