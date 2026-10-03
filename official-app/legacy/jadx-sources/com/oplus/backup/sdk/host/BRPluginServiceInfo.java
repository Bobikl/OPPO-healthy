package com.oplus.backup.sdk.host;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.backup.sdk.common.utils.BRLog;

/* JADX INFO: loaded from: classes19.dex */
public class BRPluginServiceInfo {
    private static final String GROUP_ID = "groupID";
    private static final String ICON_RES_ID = "backup_icon_resId";
    private static final String IS_CMCC_USE = "isCmccUse";
    private static final String IS_OVERSEA_USE = "isOverseaUse";
    private static final String IS_THIRD_SUPPORT = "isThirdSupport";
    private static final String NAME_RES_ID = "backup_name_resId";
    private static final String ORIGINAL_ID = "originalID";
    public static final String PARAMS = "params";
    private static final String PARENT_ID = "parentID";
    private static final String PRIORITY = "priority";
    private static final String SINGLE_THREAD = "singleThread";
    private static final String TAG = "BRPluginServiceInfo";
    private static final String THREAD_ID = "threadID";
    private static final String UI_GROUP = "uiGroup";
    private static final String UNIQUE_ID = "uniqueID";
    private static final String VERSION = "version";
    private String mClassName;
    private Intent mIntent;
    private boolean mIsCmccUse;
    private boolean mIsOverseaUse;
    private boolean mIsSingleThread;
    private boolean mIsThirdSupport;
    private Bundle mMetaData;
    private String mOriginalID;
    private String mPackageName;
    private Bundle mParams;
    private String mParentID;
    private int mPriority;
    private int mThreadID = -1;
    private int mUIGroup = -1;
    private String mUniqueID;
    private int mVersion;

    private String getString(String str, Bundle bundle) {
        String strValueOf;
        try {
            strValueOf = String.valueOf(bundle.getInt(str));
        } catch (Exception unused) {
            strValueOf = null;
        }
        if (strValueOf != null) {
            return strValueOf;
        }
        try {
            return bundle.getString(str);
        } catch (Exception unused2) {
            return strValueOf;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof BRPluginServiceInfo) && hashCode() == ((BRPluginServiceInfo) obj).hashCode();
    }

    public String getClassName() {
        return this.mClassName;
    }

    public Drawable getIcon(Context context) {
        int identifier;
        String str = this.mPackageName;
        Drawable drawable = null;
        if (str == null) {
            return null;
        }
        try {
            Context contextCreatePackageContext = context.createPackageContext(str, 3);
            Bundle bundle = this.mMetaData;
            if (bundle != null) {
                identifier = contextCreatePackageContext.getResources().getIdentifier(bundle.getString(ICON_RES_ID), ResourcesUtil.ResourceType.DRAWABLE, this.mPackageName);
            } else {
                identifier = -1;
            }
            if (identifier != -1) {
                drawable = contextCreatePackageContext.getDrawable(identifier);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            BRLog.e(TAG, "getIcon, e =" + e2.getMessage());
        } catch (Resources.NotFoundException unused) {
            BRLog.w(TAG, "getIcon failed:" + this.mUniqueID);
        }
        if (drawable != null) {
            return drawable;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = new ApplicationInfo();
        try {
            applicationInfo = packageManager.getApplicationInfo(this.mPackageName, 0);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Drawable drawableLoadIcon = applicationInfo.loadIcon(packageManager);
        BRLog.d(TAG, "getApplicationLabel icon:" + drawableLoadIcon);
        return drawableLoadIcon;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public Bundle getMetaData() {
        return this.mMetaData;
    }

    public String getName(Context context) {
        String string = null;
        if (this.mPackageName == null) {
            return null;
        }
        try {
            Bundle bundle = this.mMetaData;
            if (bundle != null) {
                string = bundle.getString(NAME_RES_ID);
                BRLog.d(TAG, "getBRPluginServiceInfos nameValue:");
            }
        } catch (Resources.NotFoundException unused) {
            BRLog.w(TAG, "getBRPluginServiceInfos name failed:" + this.mUniqueID);
        }
        if (string != null) {
            return string;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = new ApplicationInfo();
        try {
            applicationInfo = packageManager.getApplicationInfo(this.mPackageName, 0);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        String str = (String) packageManager.getApplicationLabel(applicationInfo);
        BRLog.d(TAG, "getApplicationLabel name:");
        return str;
    }

    public String getOriginalID() {
        return this.mOriginalID;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public Bundle getParams() {
        return this.mParams;
    }

    public String getParentID() {
        return this.mParentID;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int getThreadID() {
        return this.mThreadID;
    }

    public int getUIGroup() {
        return this.mUIGroup;
    }

    public String getUniqueID() {
        return this.mUniqueID;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        String str = this.mUniqueID;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    public boolean isCmccUse() {
        return this.mIsCmccUse;
    }

    public boolean isOverseaUse() {
        return this.mIsOverseaUse;
    }

    public boolean isParent() {
        return TextUtils.isEmpty(this.mParentID) || "0".equals(this.mParentID);
    }

    public boolean isSingleThread() {
        return this.mIsSingleThread;
    }

    public boolean isThirdSupport() {
        return this.mIsThirdSupport;
    }

    public void setClass(String str, String str2) {
        this.mPackageName = str;
        this.mClassName = str2;
        Intent intent = new Intent();
        this.mIntent = intent;
        intent.setClassName(str, str2);
    }

    public void setCmccUse(boolean z) {
        this.mIsCmccUse = z;
    }

    public void setMetaData(Bundle bundle) {
        this.mMetaData = bundle;
        if (bundle != null) {
            this.mUniqueID = getString("uniqueID", bundle);
            this.mThreadID = bundle.getInt(THREAD_ID, -1);
            this.mOriginalID = getString(ORIGINAL_ID, bundle);
            this.mIsSingleThread = bundle.getBoolean(SINGLE_THREAD, false);
            this.mIsThirdSupport = bundle.getBoolean(IS_THIRD_SUPPORT, false);
            this.mIsCmccUse = bundle.getBoolean(IS_CMCC_USE, false);
            this.mIsOverseaUse = bundle.getBoolean(IS_OVERSEA_USE, false);
            this.mUIGroup = bundle.getInt(UI_GROUP, -1);
            this.mPriority = bundle.getInt("priority", -1);
            this.mVersion = bundle.getInt("version", 0);
            this.mParentID = getString(PARENT_ID, bundle);
            if (isParent()) {
                this.mParentID = getString(GROUP_ID, bundle);
            }
        }
    }

    public void setOriginalID(String str) {
        this.mOriginalID = str;
    }

    public void setOverseaUse(boolean z) {
        this.mIsOverseaUse = z;
    }

    public void setParams(Bundle bundle) {
        this.mParams = bundle;
    }

    public void setParentID(String str) {
        this.mParentID = str;
    }

    public void setPriority(int i) {
        this.mPriority = i;
    }

    public void setSingleThread(boolean z) {
        this.mIsSingleThread = z;
    }

    public void setThirdSupport(boolean z) {
        this.mIsThirdSupport = z;
    }

    public void setThreadID(int i) {
        this.mThreadID = i;
    }

    public void setUIGroup(int i) {
        this.mUIGroup = i;
    }

    public void setVersion(int i) {
        this.mVersion = i;
    }

    public String toString() {
        return "[BRPluginServiceInfo:" + getUniqueID() + ", " + getOriginalID() + ", " + getThreadID() + ", " + getVersion() + ", " + getParentID() + "]";
    }
}
