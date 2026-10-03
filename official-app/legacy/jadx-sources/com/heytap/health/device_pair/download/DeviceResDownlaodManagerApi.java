package com.heytap.health.device_pair.download;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.utils.AsyncResultCoroutine;
import com.oplus.aiunit.vision.urf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/device_pair/download/DeviceResDownlaodManagerApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/oplus/aiunit/vision/urf;", "downloadType", "Lcom/heytap/health/base/utils/AsyncResultCoroutine;", "", "O9", "", "", "types", "", "h4", "Companion", "a", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface DeviceResDownlaodManagerApi extends IProvider {

    @NotNull
    public static final String ADB_TAG = "OpenDownloadType";

    @NotNull
    public static final String ADB_TAG_TIME = "CHANGE_RESDOWNLOAD_TIME";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_DOWNLOAD_MANAGER = "/device_pair/DeviceResDownloadManagerImpl";

    /* JADX INFO: renamed from: com.heytap.health.device_pair.download.DeviceResDownlaodManagerApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/heytap/health/device_pair/download/DeviceResDownlaodManagerApi$a;", "", "", "SERVICE_DOWNLOAD_MANAGER", "Ljava/lang/String;", "ADB_TAG", "ADB_TAG_TIME", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String ADB_TAG = "OpenDownloadType";

        @NotNull
        public static final String ADB_TAG_TIME = "CHANGE_RESDOWNLOAD_TIME";

        @NotNull
        public static final String SERVICE_DOWNLOAD_MANAGER = "/device_pair/DeviceResDownloadManagerImpl";
        public static final /* synthetic */ Companion a = new Companion();
    }

    @NotNull
    AsyncResultCoroutine<Boolean> O9(@NotNull urf downloadType);

    void h4(@NotNull List<Integer> types);
}
