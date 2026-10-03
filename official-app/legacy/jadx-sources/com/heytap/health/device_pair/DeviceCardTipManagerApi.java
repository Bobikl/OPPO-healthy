package com.heytap.health.device_pair;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.c8l;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/device_pair/DeviceCardTipManagerApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "r", "r0", "Landroid/app/Activity;", "activity", "", "w7", "v4", "Landroidx/lifecycle/LiveData;", "", c8l.KEY_B, "q", "R", "state", "M8", "o6", "Companion", "a", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface DeviceCardTipManagerApi extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int KEEP_ALIVE_STATE_DEFAULT = 0;
    public static final int KEEP_ALIVE_STATE_SHOW_GUIDE = 2;

    /* JADX INFO: renamed from: com.heytap.health.device_pair.DeviceCardTipManagerApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/health/device_pair/DeviceCardTipManagerApi$a;", "", "", "KEEP_ALIVE_STATE_DEFAULT", "I", "KEEP_ALIVE_STATE_SHOW_GUIDE", "<init>", "()V", "device_pair_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int KEEP_ALIVE_STATE_DEFAULT = 0;
        public static final int KEEP_ALIVE_STATE_SHOW_GUIDE = 2;
        public static final /* synthetic */ Companion a = new Companion();
    }

    @NotNull
    LiveData<Integer> B();

    void M8(int state);

    int R();

    void o6(@NotNull Activity activity);

    boolean q();

    boolean r();

    boolean r0();

    void v4();

    void w7(@NotNull Activity activity);
}
