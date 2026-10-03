package com.heytap.health.device_pair.view;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watchpair.view.WatchView;
import com.oplus.aiunit.vision.a1a;
import com.oplus.aiunit.vision.b1a;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/device_pair/view/IWatchViewService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "model", "Lcom/oplus/aiunit/vision/a1a;", "M2", "Lcom/oplus/aiunit/vision/b1a;", "Qa", "Lcom/heytap/health/watchpair/view/WatchView;", "watchView", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfo", "", "X8", "Companion", "a", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface IWatchViewService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_PATH = "/device_pair/IWatchViewService";

    /* JADX INFO: renamed from: com.heytap.health.device_pair.view.IWatchViewService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/device_pair/view/IWatchViewService$a;", "", "", "SERVICE_PATH", "Ljava/lang/String;", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_PATH = "/device_pair/IWatchViewService";
        public static final /* synthetic */ Companion a = new Companion();
    }

    @NotNull
    a1a M2(@NotNull String model);

    @NotNull
    b1a Qa();

    void X8(@NotNull WatchView watchView, @NotNull UserDeviceInfo userDeviceInfo);
}
