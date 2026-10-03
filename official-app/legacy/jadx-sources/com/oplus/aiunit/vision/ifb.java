package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.heytap.health.wallet.location.LocationInfoEntity;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;

/* JADX INFO: loaded from: classes18.dex */
public class ifb {
    public c a;
    public AMapLocationClient b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f12513c;
    public AMapLocationListener d = new a();

    public class a implements AMapLocationListener {
        public a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public void onLocationChanged(AMapLocation aMapLocation) {
            LocationInfoEntity locationInfoEntity;
            ifb.this.a.removeMessages(1);
            if (ifb.this.e(aMapLocation)) {
                locationInfoEntity = new LocationInfoEntity();
                locationInfoEntity.setLatitude(aMapLocation.getLatitude());
                locationInfoEntity.setLongitude(aMapLocation.getLongitude());
                locationInfoEntity.setProvice(aMapLocation.getProvince());
                locationInfoEntity.setCity(aMapLocation.getCity());
                locationInfoEntity.setAddress(aMapLocation.getAddress().toString());
                locationInfoEntity.setCoorType(aMapLocation.getCoordType());
                locationInfoEntity.setAdCode(aMapLocation.getAdCode());
                locationInfoEntity.setCityCode(aMapLocation.getCityCode());
                locationInfoEntity.setCountry(aMapLocation.getCountry());
                locationInfoEntity.setCountryCode(aMapLocation.getCountry());
                locationInfoEntity.setDistrict(aMapLocation.getDistrict());
                locationInfoEntity.setStreet(aMapLocation.getStreet());
                t6b.b("", "location = " + drk.g(locationInfoEntity));
                n7a.INSTANCE.a(12, 6, v0j.a(String.valueOf(aMapLocation.getLongitude()), 7, 0) + "," + v0j.a(String.valueOf(aMapLocation.getLatitude()), 6, 0));
                ifb.this.i();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("location fail = ");
                sb.append(aMapLocation != null ? aMapLocation.getDescription() : AcBaseTraceHelper.VAL_FAIL);
                t6b.a(sb.toString());
                locationInfoEntity = null;
            }
            if (ifb.this.f12513c != null) {
                ifb.this.f12513c.a(locationInfoEntity);
            }
        }
    }

    public interface b {
        void a(LocationInfoEntity locationInfoEntity);
    }

    public static class c extends whl<ifb> {
        public c(ifb ifbVar) {
            super(ifbVar);
        }

        @Override // com.oplus.aiunit.vision.whl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Message message, @NonNull ifb ifbVar) {
            if (message.what != 1) {
                return;
            }
            ifbVar.d();
        }
    }

    public ifb(Context context) {
        try {
            this.b = new AMapLocationClient(context);
            AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
            aMapLocationClientOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
            aMapLocationClientOption.setNeedAddress(true);
            Long l2 = 3000L;
            aMapLocationClientOption.setInterval(l2.longValue());
            this.b.setLocationListener(this.d);
            this.b.setLocationOption(aMapLocationClientOption);
            this.a = new c(this);
        } catch (Exception e2) {
            t6b.d("BDMapLocationUtil", e2.toString());
        }
    }

    public void d() {
        i();
        b bVar = this.f12513c;
        if (bVar != null) {
            bVar.a(null);
        }
    }

    public final boolean e(AMapLocation aMapLocation) {
        return (aMapLocation == null || TextUtils.isEmpty(aMapLocation.getProvince()) || TextUtils.isEmpty(aMapLocation.getCity()) || aMapLocation.getLatitude() <= 0.0d || aMapLocation.getLongitude() <= 0.0d) ? false : true;
    }

    public void f(b bVar) {
        this.f12513c = bVar;
    }

    public void g() {
        if (this.b != null) {
            this.a.sendEmptyMessageDelayed(1, 3000L);
            this.b.stopLocation();
            this.b.startLocation();
        }
    }

    public void h(Context context) {
        g();
    }

    public void i() {
        AMapLocationClient aMapLocationClient = this.b;
        if (aMapLocationClient != null) {
            aMapLocationClient.unRegisterLocationListener(this.d);
            this.b.stopLocation();
        }
    }
}
