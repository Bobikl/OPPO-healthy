package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.device_settings.impl.R;
import com.heytap.sporthealth.blib.basic.ui.BasicStateActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/device_settings/sporthealth/SHSettingMainActivity")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainUI;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicStateActivity;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainVm;", "Lcom/heytap/health/base/track/NxTrackHelper$c;", "", "u7", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingMainFragment;", "w7", "", "X4", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "o", "I", "v7", "()I", "setPage_type", "(I)V", "page_type", "<init>", "()V", "Companion", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SHSettingMainUI extends BasicStateActivity<SHSettingMainVm> implements NxTrackHelper.c {
    public static final int PAGE_ALL = 0;
    public static final int PAGE_DAILY_ACTIVITY = 1;
    public static final int PAGE_HEART_GUARD = 3;
    public static final int PAGE_MENSTRUAL_CYCLE = 6;
    public static final int PAGE_PHYSICAL_MENTAL_HEALTH = 4;
    public static final int PAGE_SECURITY_GUARD = 2;
    public static final int PAGE_SLEEP = 7;
    public static final int PAGE_SPO2 = 5;
    public static final int PAGE_SPORT = 8;

    @NotNull
    public static final String PAGE_TYPE = "SHSettingMainUI_page_type";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int page_type;
    public static final int $stable = 8;

    @NotNull
    public String X4() {
        return "settings.watch.sporthealthsettings2.ui.SHSettingMainActivity";
    }

    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super/*com.heytap.health.base.base.BaseViewSizeControl*/.handleContentView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.page_type = getIntent().getIntExtra(PAGE_TYPE, 0);
        super.onCreate(savedInstanceState);
    }

    public int u7() {
        switch (this.page_type) {
            case 0:
                return R.string.settings_sport_health_setting;
            case 1:
                return R.string.settings_activity;
            case 2:
                return R.string.settings_security_guard;
            case 3:
                return R.string.device_settings_heart_rate;
            case 4:
                return ((SHSettingMainVm) r7()).b0().e() ? R.string.settings_physical_mental_health_auto_monitor : R.string.settings_stress;
            case 5:
                return R.string.settings_spo2;
            case 6:
                return R.string.settings_menstrual_cycle;
            case 7:
                return R.string.settings_sleep;
            case 8:
                return R.string.settings_sports;
            default:
                return R.string.settings_sport_health_setting;
        }
    }

    /* JADX INFO: renamed from: v7, reason: from getter */
    public final int getPage_type() {
        return this.page_type;
    }

    @NotNull
    /* JADX INFO: renamed from: w7, reason: merged with bridge method [inline-methods] */
    public SHSettingMainFragment t7() {
        return new SHSettingMainFragment();
    }
}