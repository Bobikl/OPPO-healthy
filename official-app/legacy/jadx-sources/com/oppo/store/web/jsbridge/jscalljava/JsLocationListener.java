package com.oppo.store.web.jsbridge.jscalljava;

import com.heytap.store.platform.location.base.entity.LocationInfo;
import com.heytap.store.platform.location.base.listener.LocationListener;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/oppo/store/web/jsbridge/jscalljava/JsLocationListener;", "Lcom/heytap/store/platform/location/base/listener/LocationListener;", "Lcom/heytap/store/platform/location/base/entity/LocationInfo;", "jsCallbackMethodName", "", "mHeyTapJSInterfaceManager", "Lcom/oppo/store/web/jsbridge/jscalljava/HeyTapJSInterfaceManager;", "(Ljava/lang/String;Lcom/oppo/store/web/jsbridge/jscalljava/HeyTapJSInterfaceManager;)V", "getJsCallbackMethodName", "()Ljava/lang/String;", "sf", "Ljava/lang/ref/SoftReference;", "getSf", "()Ljava/lang/ref/SoftReference;", "onFailed", "", "code", "", "message", "onSuccess", UTraceSQLiteHelperKt.COL_INFO, "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsLocationListener implements LocationListener<LocationInfo> {

    @Nullable
    private final String jsCallbackMethodName;

    @NotNull
    private final SoftReference<HeyTapJSInterfaceManager> sf;

    public JsLocationListener(@Nullable String str, @NotNull HeyTapJSInterfaceManager mHeyTapJSInterfaceManager) {
        Intrinsics.checkNotNullParameter(mHeyTapJSInterfaceManager, "mHeyTapJSInterfaceManager");
        this.jsCallbackMethodName = str;
        this.sf = new SoftReference<>(mHeyTapJSInterfaceManager);
    }

    @Nullable
    public final String getJsCallbackMethodName() {
        return this.jsCallbackMethodName;
    }

    @NotNull
    public final SoftReference<HeyTapJSInterfaceManager> getSf() {
        return this.sf;
    }

    @Override // com.heytap.store.platform.location.base.listener.LocationListener
    public void onFailed(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.heytap.store.platform.location.base.listener.LocationListener
    public void onSuccess(@Nullable LocationInfo info) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 0);
            jSONObject.put("lat", info != null ? Double.valueOf(info.getLatitude()) : null);
            jSONObject.put("lng", info != null ? Double.valueOf(info.getLongitude()) : null);
            HeyTapJSInterfaceManager heyTapJSInterfaceManager = this.sf.get();
            if (heyTapJSInterfaceManager != null) {
                heyTapJSInterfaceManager.invokeJavaScriptCallback(this.jsCallbackMethodName, 0, "", jSONObject);
            }
        } catch (JSONException e2) {
            HeyTapJSInterfaceManager heyTapJSInterfaceManager2 = this.sf.get();
            if (heyTapJSInterfaceManager2 != null) {
                heyTapJSInterfaceManager2.invokeJavaScriptCallback(this.jsCallbackMethodName, 1, e2.getMessage());
            }
        }
    }
}
