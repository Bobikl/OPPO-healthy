package com.heytap.health.device_settings.setting;

import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\t"}, d2 = {"Lcom/heytap/health/device_settings/setting/OpenNotifyServiceApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroidx/appcompat/app/AppCompatActivity;", "appCompatActivity", "Lcom/heytap/health/device_settings/setting/OpenNotifyServiceApi$b;", "callback", "", "V1", "b", "device_settings_release"}, k = 1, mv = {1, 8, 0})
public interface OpenNotifyServiceApi extends IProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(OpenNotifyServiceApi openNotifyServiceApi, AppCompatActivity appCompatActivity, b bVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openNotifyService");
            }
            if ((i & 2) != 0) {
                bVar = null;
            }
            openNotifyServiceApi.V1(appCompatActivity, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/device_settings/setting/OpenNotifyServiceApi$b;", "", "", "a", "device_settings_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a();
    }

    void V1(@NotNull AppCompatActivity appCompatActivity, @Nullable b callback);
}
