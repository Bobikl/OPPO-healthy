package org.greenrobot.eventbus.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import com.oplus.aiunit.vision.sr6;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment {
    public sr6 i;

    @Override // android.app.Fragment
    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    @Override // android.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        this.i.r(this);
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    @Override // android.app.Fragment
    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        throw null;
    }

    @Override // android.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @Override // android.app.Fragment
    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }
}
