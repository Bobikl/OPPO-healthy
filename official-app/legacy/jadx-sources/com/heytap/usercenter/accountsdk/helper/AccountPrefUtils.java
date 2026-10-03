package com.heytap.usercenter.accountsdk.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.accountbase.a;
import com.accountbase.c;
import com.heytap.usercenter.accountsdk.model.BasicUserInfo;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.nearme.aidl.UserEntity;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class AccountPrefUtils {
    public static final String SP_NAME_ACCOUNT_USERINFO = "k_sp_account_userinfo";
    public static final String SP_NAME_USERCENTER_ACCOUNT = UCAccountXor8Provider.getSPNameUsercenterAccountXor8();
    private static final String TAG = "AccountPrefUtils";
    private static SharedPreferences.Editor mEditor;
    private static SharedPreferences mSp;

    public static void clearData(Context context) {
        getEditor(context).clear().apply();
        c.a().clearCache();
    }

    private static SharedPreferences.Editor getEditor(Context context) {
        if (mEditor == null) {
            mEditor = getPackageSharedPreferences(context).edit();
        }
        return mEditor;
    }

    public static String getNameByProvider(Context context) {
        UserEntity userEntity = getUserEntity(context, null);
        if (userEntity != null) {
            return userEntity.getUsername();
        }
        return null;
    }

    private static SharedPreferences getPackageSharedPreferences(Context context) {
        if (mSp == null) {
            mSp = context.getApplicationContext().getSharedPreferences(context.getApplicationContext().getPackageName() + "_suffix_usercenter_sharepreference", 0);
        }
        return mSp;
    }

    public static String getString(Context context, String str) {
        return getString(context, str, null);
    }

    public static String getTokenByProvider(Context context) {
        UserEntity userEntity = getUserEntity(context, null);
        if (userEntity != null) {
            return userEntity.getAuthToken();
        }
        return null;
    }

    public static UserEntity getUserEntity(Context context, UserEntity userEntity) {
        String string = getString(context, SP_NAME_USERCENTER_ACCOUNT, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return UserEntity.fromGson(string);
    }

    public static BasicUserInfo getUserInfo(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "key is null");
            return null;
        }
        String string = getString(context, Base64Helper.base64Encode(SP_NAME_ACCOUNT_USERINFO + str), null);
        if (TextUtils.isEmpty(string)) {
            Log.w(TAG, "getUserInfo is null");
            return null;
        }
        String strA = a.a(string, 8);
        if (TextUtils.isEmpty(strA)) {
            Log.w(TAG, "asciiJson decrypt is null");
        }
        return BasicUserInfo.fromJson(strA);
    }

    public static void saveUserEntity(Context context, UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }
        setString(context, SP_NAME_USERCENTER_ACCOUNT, UserEntity.toJson(userEntity));
    }

    public static void saveUserInfo(Context context, String str, BasicUserInfo basicUserInfo) {
        if (TextUtils.isEmpty(str) || basicUserInfo == null) {
            return;
        }
        String strBase64Encode = Base64Helper.base64Encode(SP_NAME_ACCOUNT_USERINFO + str);
        String json = basicUserInfo.toJson();
        if (TextUtils.isEmpty(json)) {
            Log.w(TAG, "saveUserInfo is null");
            return;
        }
        String strB = a.b(json, 8);
        if (TextUtils.isEmpty(strB)) {
            Log.w(TAG, "asciiJson encrypt is null");
        }
        setString(context, strBase64Encode, strB);
    }

    public static void setName(Context context, String str) {
        UserEntity userEntity = getUserEntity(context, null);
        if (userEntity != null) {
            userEntity.setUsername(str);
            saveUserEntity(context, userEntity);
        }
    }

    public static void setString(Context context, String str, String str2) {
        getEditor(context).putString(str, str2).apply();
    }

    public static String getString(Context context, String str, String str2) {
        if (context != null) {
            return getPackageSharedPreferences(context).getString(str, str2);
        }
        UCLogUtil.i(" param: context is null");
        return "";
    }
}
