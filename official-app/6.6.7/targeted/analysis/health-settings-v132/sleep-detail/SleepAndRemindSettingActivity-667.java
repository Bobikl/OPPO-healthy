package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_settings.impl.R;
import com.heytap.sporthealth.blib.basic.ui.BasicStateActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/device_settings/watch/SleepModelSettingActivity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingActivity;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicStateActivity;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAndRemindSettingViewModel;", "", "u7", "Landroidx/fragment/app/Fragment;", "t7", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepAndRemindSettingActivity extends BasicStateActivity<SleepAndRemindSettingViewModel> {
    public static final int $stable = 0;

    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super/*com.heytap.health.base.base.BaseViewSizeControl*/.handleContentView(view);
    }

    @NotNull
    public Fragment t7() {
        return new WatchSleepModeSettingFragment();
    }

    public int u7() {
        return R.string.device_settings_title_rest;
    }
}