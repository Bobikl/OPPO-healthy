package com.sensorsdata.analytics.android.sdk.encrypt.biz;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener;
import com.sensorsdata.analytics.android.sdk.encrypt.SecreteKey;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAEventEncryptTools {
    private final SecretKeyManager mSecretKeyManager;
    private SecreteKey mSecreteKey;

    public SAEventEncryptTools(SAContextManager sAContextManager) {
        this.mSecretKeyManager = SecretKeyManager.getInstance(sAContextManager);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] gzipEventData(String str) throws Throwable {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        OutputStream outputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes());
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                    return byteArray;
                } catch (Exception e3) {
                    e = e3;
                    SALog.printStackTrace(e);
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception e4) {
                            SALog.printStackTrace(e4);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (Exception e5) {
                        SALog.printStackTrace(e5);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                outputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [T, org.json.JSONObject] */
    public <T> T encryptTrackData(T t) {
        try {
            if (this.mSecretKeyManager.isSecretKeyNull(this.mSecreteKey)) {
                SecreteKey secreteKeyLoadSecretKey = this.mSecretKeyManager.loadSecretKey();
                this.mSecreteKey = secreteKeyLoadSecretKey;
                if (this.mSecretKeyManager.isSecretKeyNull(secreteKeyLoadSecretKey)) {
                    return t;
                }
            }
            SAEncryptListener encryptListener = this.mSecretKeyManager.getEncryptListener(this.mSecreteKey);
            if (encryptListener == null) {
                return t;
            }
            String strSubstring = this.mSecreteKey.key;
            if (strSubstring.startsWith("EC:")) {
                strSubstring = strSubstring.substring(strSubstring.indexOf(":") + 1);
            }
            String strEncryptSymmetricKeyWithPublicKey = encryptListener.encryptSymmetricKeyWithPublicKey(strSubstring);
            if (TextUtils.isEmpty(strEncryptSymmetricKeyWithPublicKey)) {
                return t;
            }
            String strEncryptEvent = encryptListener.encryptEvent(gzipEventData(t.toString()));
            if (TextUtils.isEmpty(strEncryptEvent)) {
                return t;
            }
            ?? r2 = (T) new JSONObject();
            r2.put("ekey", strEncryptSymmetricKeyWithPublicKey);
            r2.put("pkv", this.mSecreteKey.version);
            r2.put("payloads", strEncryptEvent);
            return t instanceof String ? (T) r2.toString() : r2;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return t;
        }
    }

    public SAEncryptListener getEncryptListener() {
        try {
            if (this.mSecretKeyManager.isSecretKeyNull(this.mSecreteKey)) {
                SecreteKey secreteKeyLoadSecretKey = this.mSecretKeyManager.loadSecretKey();
                this.mSecreteKey = secreteKeyLoadSecretKey;
                if (this.mSecretKeyManager.isSecretKeyNull(secreteKeyLoadSecretKey)) {
                    return null;
                }
            }
            return this.mSecretKeyManager.getEncryptListener(this.mSecreteKey);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, org.json.JSONObject] */
    public <T> T encryptTrackData(T t, SecreteKey secreteKey) {
        SAEncryptListener encryptListener;
        try {
            if (this.mSecretKeyManager.isSecretKeyNull(secreteKey) || (encryptListener = this.mSecretKeyManager.getEncryptListener(secreteKey)) == null) {
                return t;
            }
            String strSubstring = secreteKey.key;
            if (strSubstring.startsWith("EC:")) {
                strSubstring = strSubstring.substring(strSubstring.indexOf(":") + 1);
            }
            String strEncryptSymmetricKeyWithPublicKey = encryptListener.encryptSymmetricKeyWithPublicKey(strSubstring);
            if (TextUtils.isEmpty(strEncryptSymmetricKeyWithPublicKey)) {
                return t;
            }
            String strEncryptEvent = encryptListener.encryptEvent(gzipEventData(t.toString()));
            if (TextUtils.isEmpty(strEncryptEvent)) {
                return t;
            }
            ?? r0 = (T) new JSONObject();
            r0.put("ekey", strEncryptSymmetricKeyWithPublicKey);
            r0.put("pkv", secreteKey.version);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(strEncryptEvent);
            r0.put("payloads", jSONArray);
            return t instanceof String ? (T) r0.toString() : r0;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return t;
        }
    }
}
