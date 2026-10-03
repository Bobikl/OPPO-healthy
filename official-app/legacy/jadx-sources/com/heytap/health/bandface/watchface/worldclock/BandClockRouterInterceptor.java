package com.heytap.health.bandface.watchface.worldclock;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.heytap.health.bandface.R$string;
import com.heytap.health.base.download.resource.DownloadConfig;
import com.heytap.health.base.download.resource.ResourceBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.dj4;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.s06;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.y0k;
import com.oplus.aiunit.vision.y26;
import com.oplus.aiunit.vision.z26;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Interceptor(name = "BandClockRouterInterceptor", priority = 6)
public class BandClockRouterInterceptor implements IInterceptor {

    public class a implements z26 {
        public final /* synthetic */ InterceptorCallback i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Postcard f3140j;

        public a(InterceptorCallback interceptorCallback, Postcard postcard) {
            this.i = interceptorCallback;
            this.f3140j = postcard;
        }

        @Override // com.oplus.aiunit.vision.z26
        public boolean G2(int i, ResourceBean resourceBean) {
            return !TextUtils.equals(resourceBean.getResPackageMd5(), v9g.x("sp_name_band_city").D(e36.RESOURCE_LX_BAND_CITY_DB));
        }

        @Override // com.oplus.aiunit.vision.j36
        public void P2(float f) {
        }

        @Override // com.oplus.aiunit.vision.z26
        @NonNull
        public DownloadConfig config() {
            return new DownloadConfig(true, e36.RESOURCE_LX_BAND_CITY_DB, this.f3140j.getContext().getString(R$string.band_face_city_download_tip));
        }

        @Override // com.oplus.aiunit.vision.z26
        public void e5() {
            this.i.onInterrupt(new Throwable("onUseless"));
        }

        @Override // com.oplus.aiunit.vision.j36
        public void onFail(String str) {
            this.i.onInterrupt(new Throwable(str));
            y0k.i(this.f3140j.getContext().getString(com.heytap.health.base.R$string.lib_base_network_error_common));
        }

        @Override // com.oplus.aiunit.vision.j36
        public void y3(List<ResourceBean> list, boolean z) {
            v9g.x("sp_name_band_city").U(e36.RESOURCE_LX_BAND_CITY_DB, list.get(0).getResPackageMd5());
            if (z) {
                this.i.onContinue(this.f3140j);
            } else {
                this.i.onInterrupt(new Throwable("action cancel"));
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.alibaba.android.arouter.facade.template.IInterceptor
    public void process(Postcard postcard, InterceptorCallback interceptorCallback) {
        if (!TextUtils.equals(postcard.getPath(), "/bandfaceapi/band_city")) {
            a7b.m("BandClockRouter", "[process] --> not band face city");
            interceptorCallback.onContinue(postcard);
            return;
        }
        if (s06.b()) {
            a7b.m("BandClockRouter", "[process] --> double");
            interceptorCallback.onInterrupt(new Throwable("double click"));
            return;
        }
        if (gl4.managerApi.getCurrentConnectId() == null) {
            y0k.i(postcard.getContext().getString(com.heytap.health.base.R$string.lib_base_disconnect_error_tips));
            a7b.m("BandClockRouter", "device is is null");
            interceptorCallback.onInterrupt(new Throwable("device is is null"));
            return;
        }
        HashMap map = new HashMap();
        map.put("os", 1);
        map.put("deviceType", 0);
        map.put(e36.PARAM_FIRMWARE_ID, "A");
        map.put(e36.PARAM_FIRMWARE_VERSION, "OW20W3_11.A.01_0430_202108152021");
        map.put("materialType", e36.RESOURCE_LX_BAND_CITY_DB);
        e36.g().f(new a(interceptorCallback, postcard), new y26(dj4.DB_PATH, dj4.DB_NAME, false, map));
    }
}
