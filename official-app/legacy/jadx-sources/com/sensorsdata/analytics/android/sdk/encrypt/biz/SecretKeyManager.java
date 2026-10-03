package com.sensorsdata.analytics.android.sdk.encrypt.biz;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.usm;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.encrypt.IPersistentSecretKey;
import com.sensorsdata.analytics.android.sdk.encrypt.R;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import com.sensorsdata.analytics.android.sdk.encrypt.SecreteKey;
import com.sensorsdata.analytics.android.sdk.encrypt.encryptor.SAECEncrypt;
import com.sensorsdata.analytics.android.sdk.encrypt.encryptor.SARSAEncrypt;
import com.sensorsdata.analytics.android.sdk.encrypt.utils.EncryptUtils;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SecretKeyManager {
    private static SecretKeyManager INSTANCE = null;
    private static final int KEY_VERSION_DEFAULT = 0;
    private static final String SP_SECRET_KEY = "secret_key";
    private static final String SP_SUPPORT_TRANSPORT_ENCRYPT = "supportTransportEncrypt";
    private static final String TAG = "SA.SecretKeyManager";
    private final List<SAEncryptListener> mListeners;
    private final IPersistentSecretKey mPersistentSecretKey;
    private final SAConfigOptions mSAConfigOptions;

    private SecretKeyManager(SAContextManager sAContextManager) {
        this.mSAConfigOptions = sAContextManager.getInternalConfigs().saConfigOptions;
        this.mPersistentSecretKey = sAContextManager.getInternalConfigs().saConfigOptions.getPersistentSecretKey();
        List<SAEncryptListener> encryptors = sAContextManager.getInternalConfigs().saConfigOptions.getEncryptors();
        this.mListeners = encryptors;
        encryptors.add(new SARSAEncrypt());
        if (EncryptUtils.isECEncrypt()) {
            encryptors.add(new SAECEncrypt());
        }
    }

    private String disposeECPublicKey(String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith("EC:")) ? str : str.substring(str.indexOf(":") + 1);
    }

    public static SecretKeyManager getInstance(SAContextManager sAContextManager) {
        if (INSTANCE == null) {
            INSTANCE = new SecretKeyManager(sAContextManager);
        }
        return INSTANCE;
    }

    private boolean isEncryptorTypeNull(SAEncryptListener sAEncryptListener) {
        return TextUtils.isEmpty(sAEncryptListener.asymmetricEncryptType()) || TextUtils.isEmpty(sAEncryptListener.symmetricEncryptType());
    }

    private boolean isMatchEncryptType(SAEncryptListener sAEncryptListener, SecreteKey secreteKey) {
        return (sAEncryptListener == null || isSecretKeyNull(secreteKey) || isEncryptorTypeNull(sAEncryptListener) || !sAEncryptListener.asymmetricEncryptType().equals(secreteKey.asymmetricEncryptType) || !sAEncryptListener.symmetricEncryptType().equals(secreteKey.symmetricEncryptType)) ? false : true;
    }

    private void parseSecreteKey(JSONObject jSONObject, SecreteKey secreteKey) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("key_ec") && EncryptUtils.isECEncrypt()) {
                    String strOptString = jSONObject.optString("key_ec");
                    if (!TextUtils.isEmpty(strOptString)) {
                        jSONObject = new JSONObject(strOptString);
                    }
                }
                secreteKey.key = jSONObject.optString(usm.o);
                secreteKey.symmetricEncryptType = "AES";
                if (jSONObject.has("type")) {
                    String strOptString2 = jSONObject.optString("type");
                    secreteKey.key = strOptString2 + ":" + secreteKey.key;
                    secreteKey.asymmetricEncryptType = strOptString2;
                } else {
                    secreteKey.asymmetricEncryptType = "RSA";
                }
                secreteKey.version = jSONObject.optInt("pkv");
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    private SecreteKey readAppKey() {
        String str;
        int i;
        String str2;
        String str3;
        SecreteKey secreteKeyLoadSecretKey = this.mPersistentSecretKey.loadSecretKey();
        if (secreteKeyLoadSecretKey != null) {
            str = secreteKeyLoadSecretKey.key;
            i = secreteKeyLoadSecretKey.version;
            str3 = secreteKeyLoadSecretKey.symmetricEncryptType;
            str2 = secreteKeyLoadSecretKey.asymmetricEncryptType;
        } else {
            str = "";
            i = 0;
            str2 = "";
            str3 = str2;
        }
        SALog.i(TAG, "readAppKey [key = " + str + " ,v = " + i + " ,symmetricEncryptType = " + str3 + " ,asymmetricEncryptType = " + str2 + "]");
        return new SecreteKey(str, i, str3, str2);
    }

    private SecreteKey readLocalKey() throws JSONException {
        String strOptString;
        String strOptString2;
        String str = "";
        String string = SAStoreManager.getInstance().getString(SP_SECRET_KEY, "");
        int iOptInt = 0;
        if (TextUtils.isEmpty(string)) {
            strOptString = "";
            strOptString2 = strOptString;
        } else {
            JSONObject jSONObject = new JSONObject(string);
            String strOptString3 = jSONObject.optString("key", "");
            iOptInt = jSONObject.optInt("version", 0);
            strOptString2 = jSONObject.optString("symmetricEncryptType", "");
            str = strOptString3;
            strOptString = jSONObject.optString("asymmetricEncryptType", "");
        }
        SALog.i(TAG, "readLocalKey [key = " + str + " ,v = " + iOptInt + " ,symmetricEncryptType = " + strOptString2 + " ,asymmetricEncryptType = " + strOptString + "]");
        return new SecreteKey(str, iOptInt, strOptString2, strOptString);
    }

    public String checkPublicSecretKey(Context context, String str, String str2, String str3, String str4) {
        try {
            SecreteKey secreteKeyLoadSecretKey = loadSecretKey();
            if (secreteKeyLoadSecretKey != null && !TextUtils.isEmpty(secreteKeyLoadSecretKey.key)) {
                if (!str.equals(secreteKeyLoadSecretKey.version + "") || !disposeECPublicKey(str2).equals(disposeECPublicKey(secreteKeyLoadSecretKey.key))) {
                    return String.format(SADisplayUtil.getStringResource(context, R.string.sensors_analytics_encrypt_verify_fail_version), str, Integer.valueOf(secreteKeyLoadSecretKey.version));
                }
                if (str3 != null && str4 != null && (!str3.equals(secreteKeyLoadSecretKey.symmetricEncryptType) || !str4.equals(secreteKeyLoadSecretKey.asymmetricEncryptType))) {
                    return String.format(SADisplayUtil.getStringResource(context, R.string.sensors_analytics_encrypt_verify_fail_type), str3, str4, secreteKeyLoadSecretKey.symmetricEncryptType, secreteKeyLoadSecretKey.asymmetricEncryptType);
                }
                return SADisplayUtil.getStringResource(context, R.string.sensors_analytics_encrypt_pass);
            }
            return SADisplayUtil.getStringResource(context, R.string.sensors_analytics_encrypt_key_null);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public SAEncryptListener getEncryptListener(SecreteKey secreteKey) {
        if (isSecretKeyNull(secreteKey)) {
            return null;
        }
        for (SAEncryptListener sAEncryptListener : this.mListeners) {
            if (isMatchEncryptType(sAEncryptListener, secreteKey)) {
                return sAEncryptListener;
            }
        }
        return null;
    }

    public boolean isSecretKeyNull(SecreteKey secreteKey) {
        return secreteKey == null || TextUtils.isEmpty(secreteKey.key) || secreteKey.version == 0;
    }

    public Boolean isSupportTransportEncrypt() {
        if (SAStoreManager.getInstance().isExists("supportTransportEncrypt")) {
            return Boolean.valueOf(SAStoreManager.getInstance().getBool("supportTransportEncrypt", false));
        }
        return null;
    }

    public SecreteKey loadSecretKey() throws JSONException {
        return this.mPersistentSecretKey != null ? readAppKey() : readLocalKey();
    }

    public void storeSecretKey(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.mSAConfigOptions.isEnableEncrypt() || this.mSAConfigOptions.isTransportEncrypt()) {
                jSONObject = new JSONObject(jSONObject.optString("configs"));
                SecreteKey secreteKey = new SecreteKey("", -1, "", "");
                List<SAEncryptListener> encryptors = this.mSAConfigOptions.getEncryptors();
                if (encryptors != null && !encryptors.isEmpty()) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("key_v2");
                    if (jSONObjectOptJSONObject != null) {
                        String[] strArrSplit = jSONObjectOptJSONObject.optString("type").split("\\+");
                        if (strArrSplit.length == 2) {
                            String str2 = strArrSplit[0];
                            String str3 = strArrSplit[1];
                            for (SAEncryptListener sAEncryptListener : encryptors) {
                                if (str2.equals(sAEncryptListener.asymmetricEncryptType()) && str3.equals(sAEncryptListener.symmetricEncryptType())) {
                                    secreteKey.key = jSONObjectOptJSONObject.optString(usm.o);
                                    secreteKey.version = jSONObjectOptJSONObject.optInt("pkv");
                                    secreteKey.asymmetricEncryptType = str2;
                                    secreteKey.symmetricEncryptType = str3;
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(secreteKey.key)) {
                        parseSecreteKey(jSONObject.optJSONObject("key"), secreteKey);
                    }
                }
                storeSecretKey(secreteKey);
            }
            if (jSONObject.has("supportTransportEncrypt")) {
                SAStoreManager.getInstance().setBool("supportTransportEncrypt", jSONObject.optBoolean("supportTransportEncrypt"));
            } else {
                SAStoreManager.getInstance().setBool("supportTransportEncrypt", false);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void storeSecretKey(SecreteKey secreteKey) {
        try {
            SALog.i(TAG, "[saveSecretKey] publicKey = " + secreteKey.toString());
            if (getEncryptListener(secreteKey) != null) {
                IPersistentSecretKey iPersistentSecretKey = this.mPersistentSecretKey;
                if (iPersistentSecretKey != null) {
                    iPersistentSecretKey.saveSecretKey(secreteKey);
                    SAStoreManager.getInstance().setString(SP_SECRET_KEY, "");
                } else {
                    SAStoreManager.getInstance().setString(SP_SECRET_KEY, secreteKey.toString());
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
