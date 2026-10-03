package com.oplus.pay.opensdk.web.ui;

import android.R;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.nearme.game_sdk_pluginagent.AppCompatPluginActivity;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.rri;
import com.oplus.pay.opensdk.web.R$color;
import com.oplus.pay.opensdk.web.R$style;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PluginDialogFragment extends DialogFragment {
    public Fragment j = null;

    public class a implements Runnable {
        public final /* synthetic */ AppCompatPluginActivity i;

        public a(AppCompatPluginActivity appCompatPluginActivity) {
            this.i = appCompatPluginActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.i.isFinishing() || this.i.isDestroyed()) {
                hrl.b("PluginDialogFragment#activity.isFinishing isDestroyed");
                this.i.finish();
                return;
            }
            FragmentManager supportFragmentManager = this.i.getSupportFragmentManager();
            if (supportFragmentManager.isDestroyed() || supportFragmentManager.isStateSaved()) {
                hrl.b("PluginDialogFragment#activity.supportFragmentManager isDestroyed or isStateSaved");
                this.i.finish();
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("PluginDialogFragment");
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            PluginDialogFragment.this.show(fragmentTransactionBeginTransaction, "PluginDialogFragment");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Z(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            Fragment fragment = this.j;
            if (fragment instanceof PluginPayWebContainerFragment) {
                boolean zGoBack = ((PluginPayWebContainerFragment) fragment).goBack();
                hrl.a("onKey#$goBack: " + zGoBack);
                if (zGoBack) {
                    return true;
                }
                ((PluginPayWebContainerFragment) this.j).notifyH5AboutBack();
                hrl.a("onKey#$goBack:notifyH5AboutBack ");
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.voe
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onViewCreated$0();
                }
            }, 150L);
        }
        return false;
    }

    public static PluginDialogFragment a0(Bundle bundle) {
        PluginDialogFragment pluginDialogFragment = new PluginDialogFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("arguments", bundle);
        pluginDialogFragment.setArguments(bundle2);
        return pluginDialogFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0() {
        try {
            hrl.a("onKey#$dismissAllowingStateLoss ");
            dismissAllowingStateLoss();
        } catch (Throwable th) {
            hrl.b("dismissAllowingStateLoss" + th.getMessage());
        }
    }

    public final void Y() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            rri.b(activity, !rri.a(activity));
        }
    }

    public final void b0() {
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        Object systemService = requireContext().getSystemService("uimode");
        if (systemService instanceof UiModeManager) {
            boolean z = ((UiModeManager) systemService).getNightMode() == 2;
            if (getDialog().getWindow().getDecorView() instanceof ViewGroup) {
                getDialog().getWindow().addFlags(SauAarConstants.I);
                getDialog().getWindow().getDecorView().setSystemUiVisibility(getDialog().getWindow().getDecorView().getSystemUiVisibility() | (z ? 16 : 8192));
            }
        }
    }

    public final void c0() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        View decorView = window.getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(getDialog().getWindow().getDecorView().getSystemUiVisibility() | 1024);
        }
        int i = R$color.opay_pay_sdk_web_color_transparent_background_light;
        window.setBackgroundDrawableResource(i);
        window.setNavigationBarColor(ContextCompat.getColor(requireContext(), i));
        window.setStatusBarColor(ContextCompat.getColor(requireContext(), i));
    }

    public void d0(AppCompatPluginActivity appCompatPluginActivity) {
        if (appCompatPluginActivity != null) {
            try {
                if (appCompatPluginActivity.getWindow() != null) {
                    appCompatPluginActivity.getWindow().getDecorView().postDelayed(new a(appCompatPluginActivity), 100L);
                }
            } catch (Throwable th) {
                hrl.b("PluginDialogFragment#showDialogFragment#" + th);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R$style.OplusPayWebSDk_Theme_Fullscreendialog);
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(12);
        }
        this.j = PluginPayWebContainerFragment.Z(getArguments() != null ? getArguments().getBundle("arguments") : null);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.content);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroy() {
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(-1);
        }
    }

    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super/*androidx.fragment.app.Fragment*/.onHiddenChanged(z);
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    @SensorsDataInstrumented
    public void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    @SensorsDataInstrumented
    public void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        Y();
        FragmentTrackHelper.trackFragmentResume(this);
    }

    public void onStart() {
        super.onStart();
        try {
            c0();
        } catch (Throwable th) {
            hrl.b("setWindow" + th.getMessage());
        }
    }

    @SensorsDataInstrumented
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        b0();
        if (this.j != null) {
            getChildFragmentManager().beginTransaction().replace(R.id.content, this.j).commitNowAllowingStateLoss();
        }
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.oplus.aiunit.vision.uoe
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return this.i.Z(dialogInterface, i, keyEvent);
                }
            });
        }
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super/*androidx.fragment.app.Fragment*/.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }
}
