package org.greenrobot.eventbus.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.oplus.aiunit.vision.sr6;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes11.dex */
public class ErrorDialogManager$SupportManagerFragment extends Fragment {
    public sr6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20748l;

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        this.k.r(this);
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        if (!this.f20748l) {
            throw null;
        }
        this.f20748l = false;
        FragmentTrackHelper.trackFragmentResume(this);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }
}
