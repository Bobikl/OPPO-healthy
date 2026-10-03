package com.platform.usercenter.account.mba.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcelable;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.Serializable;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes9.dex */
public class MbaIntentWrapper {
    private static final String TAG = "IntentWrapper";
    public Intent mIntent;

    public MbaIntentWrapper(Intent intent) {
        this.mIntent = intent;
    }

    public static Intent create(Intent intent) {
        return new Intent(intent);
    }

    public static Intent parseUriSecurity(Context context, String str, int i) throws URISyntaxException {
        Intent uri = Intent.parseUri(str, i);
        uri.setComponent(null);
        uri.setSelector(null);
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(uri, 0);
        if (resolveInfoResolveActivity != null) {
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            if (activityInfo.exported && activityInfo.permission == null) {
                return uri;
            }
        }
        UCLogUtil.e(TAG, "parseUriSecurity intent = null");
        return null;
    }

    public boolean getBooleanExtra(String str, boolean z) {
        try {
            return this.mIntent.getBooleanExtra(str, z);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return z;
        }
    }

    public Bundle getBundleExtra(String str) {
        try {
            return this.mIntent.getBundleExtra(str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public double getDoubleExtra(String str, double d) {
        try {
            return this.mIntent.getDoubleExtra(str, d);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return d;
        }
    }

    public Object getExtra(String str) {
        try {
            return this.mIntent.getExtras().get(str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public Bundle getExtras() {
        try {
            return this.mIntent.getExtras();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public float getFloatExtra(String str, float f) {
        try {
            return this.mIntent.getFloatExtra(str, f);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return f;
        }
    }

    public int getIntExtra(String str, int i) {
        try {
            return this.mIntent.getIntExtra(str, i);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return i;
        }
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public <T extends Parcelable> T getParcelableExtra(String str) {
        try {
            return (T) this.mIntent.getParcelableExtra(str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public Serializable getSerializableExtra(String str) {
        try {
            return this.mIntent.getSerializableExtra(str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public String getStringExtra(String str) {
        try {
            return this.mIntent.getStringExtra(str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return "";
        }
    }
}
