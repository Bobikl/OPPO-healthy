package com.oplus.usercenter.ui;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.annotation.Keep;
import com.oplus.usercenter.util.AcLaunchMarketUtil;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.platform.usercenter.account.ams.ui.R;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class AcUpgradeGuideActivity extends Activity {
    public static final String DATA_BUTTON_CONTENT = "data_button_content";
    public static final String DATA_BUTTON_JUMP_LINK = "data_button_jump_link";
    public static final String DATA_BUTTON_OVERSEA_JUMP_LINK = "data_button_oversea_jump_link";
    public static final String DATA_MAIN_TITLE = "data_main_title";
    public static final String DATA_SUB_TITLE = "data_sub_title";
    public static final String DATA_UPGRADE_CONTENT = "data_upgrade_content";
    private static final int NORMAL_SCREE_WIDTH_MAX_SIZE = 360;
    public static final String TAG = "AcUpgradeGuideActivity";

    private String getIntentData(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        return TextUtils.isEmpty(stringExtra) ? "" : stringExtra;
    }

    private void initToolbar() {
        ((Toolbar) findViewById(R.id.id_toolbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.cl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$initToolbar$0(view);
            }
        });
    }

    private void initUI() {
        final Intent intent = getIntent();
        ((TextView) findViewById(R.id.text_main_title)).setText(getIntentData(intent, DATA_MAIN_TITLE));
        ((TextView) findViewById(R.id.text_subtitle)).setText(getIntentData(intent, DATA_SUB_TITLE));
        ((TextView) findViewById(R.id.text_upgrade_content)).setText(getIntentData(intent, DATA_UPGRADE_CONTENT));
        Button button = (Button) findViewById(R.id.id_upgrade_button);
        button.setText(getIntentData(intent, DATA_BUTTON_CONTENT));
        button.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.al
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.lambda$initUI$1(view, motionEvent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$initUI$2(intent, view);
            }
        });
    }

    private boolean isNight() {
        try {
            return ((UiModeManager) getApplicationContext().getSystemService("uimode")).getNightMode() == 2;
        } catch (Exception e) {
            Log.d(TAG, "isNight error  = " + e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$initToolbar$0(View view) {
        onBackPressed();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initUI$1(View view, MotionEvent motionEvent) {
        if (view.getAnimation() != null && !view.getAnimation().hasEnded()) {
            view.getAnimation().cancel();
            return false;
        }
        if (motionEvent.getAction() == 0) {
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ac_idsdkui_anim_upgrade_btn_press));
        } else if (motionEvent.getAction() == 1) {
            view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ac_idsdkui_anim_upgrade_btn_unpress));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$initUI$2(Intent intent, View view) {
        if (AcLaunchMarketUtil.intentToMarketApp(getApplicationContext(), getIntentData(intent, DATA_BUTTON_JUMP_LINK), getIntentData(intent, DATA_BUTTON_OVERSEA_JUMP_LINK), 50000L)) {
            onBackPressed();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private void setLayoutDirection() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int iPx2dip = px2dip(displayMetrics.widthPixels);
            int iPx2dip2 = px2dip(displayMetrics.heightPixels);
            boolean z = false;
            int i = 1;
            if (getResources().getConfiguration().orientation == 1) {
                if (iPx2dip <= NORMAL_SCREE_WIDTH_MAX_SIZE) {
                    z = true;
                }
            } else if (iPx2dip2 <= NORMAL_SCREE_WIDTH_MAX_SIZE) {
                z = true;
            }
            if (!z) {
                i = -1;
            }
            setRequestedOrientation(i);
            Log.d(TAG, "setLayoutDirection , isSmallScreee = " + z + ", width = " + iPx2dip + ", height = " + iPx2dip2);
        } catch (Exception e) {
            Log.d(TAG, "setLayoutDirection error  = " + e);
        }
    }

    private void setStatusAndNavigationBarColor() {
        Window window = getWindow();
        Resources resources = getResources();
        int i = R.color.ac_idsdkui_color_background;
        window.setNavigationBarColor(resources.getColor(i));
        window.addFlags(SauAarConstants.I);
        window.setStatusBarColor(getColor(i));
        if (isNight()) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(8192);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutDirection();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ac_idsdk_activity_guide_upgrade);
        initUI();
        initToolbar();
        setStatusAndNavigationBarColor();
        setLayoutDirection();
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    public int px2dip(float f) {
        return (int) ((f / getResources().getDisplayMetrics().density) + 0.5f);
    }
}
