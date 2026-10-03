package com.sensorsdata.analytics.android.sdk.encrypt.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.encrypt.AESSecretManager;
import com.sensorsdata.analytics.android.sdk.encrypt.R;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import com.sensorsdata.analytics.android.sdk.encrypt.SecreteKey;
import com.sensorsdata.analytics.android.sdk.encrypt.biz.SAEventEncryptTools;
import com.sensorsdata.analytics.android.sdk.encrypt.biz.SecretKeyManager;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class SAEncryptAPIImpl implements SAEncryptAPI {
    private static final String TAG = "SA.EncryptAPIImpl";
    private SAContextManager mSAContextManager;
    private SecretKeyManager mSecretKeyManager;
    private SAEventEncryptTools mSensorsDataEncrypt;

    public SAEncryptAPIImpl(SAContextManager sAContextManager) {
        try {
            this.mSAContextManager = sAContextManager;
            SAConfigOptions sAConfigOptions = sAContextManager.getInternalConfigs().saConfigOptions;
            if (sAConfigOptions.isEnableEncrypt() || sAConfigOptions.isTransportEncrypt()) {
                this.mSensorsDataEncrypt = new SAEventEncryptTools(sAContextManager);
                this.mSecretKeyManager = SecretKeyManager.getInstance(sAContextManager);
                AESSecretManager.getInstance().initSecretKey(sAContextManager.getContext());
            } else if (sAConfigOptions.getAdvertConfig() != null && sAConfigOptions.getAdvertConfig().secreteKey != null) {
                this.mSensorsDataEncrypt = new SAEventEncryptTools(sAContextManager);
            }
            if (sAConfigOptions.getStorePlugins() == null || sAConfigOptions.getStorePlugins().isEmpty()) {
                return;
            }
            AESSecretManager.getInstance().initSecretKey(sAContextManager.getContext());
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public String decryptAES(String str) {
        return AESSecretManager.getInstance().decryptAES(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public String encryptAES(String str) {
        return AESSecretManager.getInstance().encryptAES(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public <T> T encryptEventData(T t) {
        return (T) this.mSensorsDataEncrypt.encryptTrackData(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        try {
            if (Modules.Encrypt.METHOD_ENCRYPT_AES.equals(str)) {
                return (T) encryptAES((String) objArr[0]);
            }
            if (Modules.Encrypt.METHOD_DECRYPT_AES.equals(str)) {
                return (T) decryptAES((String) objArr[0]);
            }
            if (Modules.Encrypt.METHOD_VERIFY_SECRET_KEY.equals(str)) {
                return (T) verifySecretKey((Uri) objArr[0]);
            }
            if (Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA.equals(str)) {
                return (T) encryptEventData(objArr[0]);
            }
            if (Modules.Encrypt.METHOD_ENCRYPT_EVENT_DATA_WITH_KEY.equals(str)) {
                return (T) encryptEventData(objArr[0], (SecreteKey) objArr[1]);
            }
            if (Modules.Encrypt.METHOD_STORE_SECRET_KEY.equals(str)) {
                storeSecretKey((String) objArr[0]);
                return null;
            }
            if (Modules.Encrypt.METHOD_LOAD_SECRET_KEY.equals(str)) {
                return (T) loadSecretKey();
            }
            if (Modules.Encrypt.METHOD_VERIFY_SUPPORT_TRANSPORT.equals(str)) {
                return (T) this.mSecretKeyManager.isSupportTransportEncrypt();
            }
            if (Modules.Encrypt.METHOD_STORE_EVENT.equals(str)) {
                SAEncryptListener encryptListener = this.mSensorsDataEncrypt.getEncryptListener();
                if (encryptListener instanceof AbsSAEncrypt) {
                    return (T) ((AbsSAEncrypt) encryptListener).encryptEventRecord((String) objArr[0]);
                }
                return null;
            }
            if (!Modules.Encrypt.METHOD_LOAD_EVENT.equals(str)) {
                return null;
            }
            SAEncryptListener encryptListener2 = this.mSensorsDataEncrypt.getEncryptListener();
            if (encryptListener2 instanceof AbsSAEncrypt) {
                return (T) ((AbsSAEncrypt) encryptListener2).decryptEventRecord((String) objArr[0]);
            }
            return null;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public String loadSecretKey() {
        try {
            SecreteKey secreteKeyLoadSecretKey = this.mSecretKeyManager.loadSecretKey();
            return this.mSecretKeyManager.getEncryptListener(secreteKeyLoadSecretKey) == null ? "" : secreteKeyLoadSecretKey.toString();
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public void storeSecretKey(String str) {
        SecretKeyManager.getInstance(this.mSAContextManager).storeSecretKey(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public String verifySecretKey(Uri uri) {
        String queryParameter = uri.getQueryParameter("v");
        String strDecode = Uri.decode(uri.getQueryParameter("key"));
        String strDecode2 = Uri.decode(uri.getQueryParameter("symmetricEncryptType"));
        String strDecode3 = Uri.decode(uri.getQueryParameter("asymmetricEncryptType"));
        SALog.i(TAG, "Encrypt, version = " + queryParameter + ", key = " + strDecode + ", symmetricEncryptType = " + strDecode2 + ", asymmetricEncryptType = " + strDecode3);
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(strDecode)) {
            return SADisplayUtil.getStringResource(this.mSAContextManager.getContext(), R.string.sensors_analytics_encrypt_fail);
        }
        SecretKeyManager secretKeyManager = this.mSecretKeyManager;
        return secretKeyManager != null ? secretKeyManager.checkPublicSecretKey(this.mSAContextManager.getContext(), queryParameter, strDecode, strDecode2, strDecode3) : SADisplayUtil.getStringResource(this.mSAContextManager.getContext(), R.string.sensors_analytics_encrypt_disable);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.SAEncryptAPI
    public <T> T encryptEventData(T t, SecreteKey secreteKey) {
        SAEventEncryptTools sAEventEncryptTools = this.mSensorsDataEncrypt;
        return sAEventEncryptTools == null ? t : (T) sAEventEncryptTools.encryptTrackData(t, secreteKey);
    }
}
