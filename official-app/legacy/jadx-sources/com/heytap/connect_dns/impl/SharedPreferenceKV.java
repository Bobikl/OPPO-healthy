package com.heytap.connect_dns.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.connect.api.IKv;
import com.heytap.connect.cipher.AESUtil;
import com.heytap.connect.cipher.McsCipher;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/connect_dns/impl/SharedPreferenceKV;", "Lcom/heytap/connect/api/IKv;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "isSign", "", "put", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "default", ParserTag.TAG_GET, "(Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPreference$delegate", "Lkotlin/Lazy;", "getSharedPreference", "()Landroid/content/SharedPreferences;", "sharedPreference", "<init>", "(Landroid/content/Context;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class SharedPreferenceKV implements IKv {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: sharedPreference$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sharedPreference;

    public SharedPreferenceKV(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sharedPreference = LazyKt__LazyJVMKt.lazy(new Function0<SharedPreferences>() { // from class: com.heytap.connect_dns.impl.SharedPreferenceKV$sharedPreference$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return this.this$0.context.getApplicationContext().getSharedPreferences("TapConnectKv", 0);
            }
        });
    }

    private final SharedPreferences getSharedPreference() {
        return (SharedPreferences) this.sharedPreference.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.connect.api.IKv
    public <T> T get(@NotNull String key, T t, boolean isSign) {
        String strValueOf;
        int iShortValue;
        float fDoubleValue;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.context == null) {
            return t;
        }
        String strEncrypt = this.context.getPackageName() + '_' + key;
        if (isSign) {
            strEncrypt = McsCipher.encrypt(strEncrypt, 1);
            Intrinsics.checkNotNullExpressionValue(strEncrypt, "encrypt(newKey, KEY_AES_FIEXED)");
        }
        if (TextUtils.isEmpty(strEncrypt)) {
            return t;
        }
        SharedPreferences sharedPreference = getSharedPreference();
        try {
            if (!(t instanceof String)) {
                if (!(t instanceof Integer)) {
                    if (t instanceof Boolean) {
                        return (T) Boolean.valueOf(sharedPreference.getBoolean(strEncrypt, ((Boolean) t).booleanValue()));
                    }
                    if (t instanceof Float) {
                        fDoubleValue = ((Number) t).floatValue();
                    } else if (t instanceof Double) {
                        fDoubleValue = (float) ((Number) t).doubleValue();
                    } else {
                        if (t instanceof Long) {
                            return (T) Long.valueOf(sharedPreference.getLong(strEncrypt, ((Number) t).longValue()));
                        }
                        if (t instanceof Short) {
                            iShortValue = ((Number) t).shortValue();
                        } else {
                            strValueOf = String.valueOf(t);
                        }
                    }
                    return (T) Float.valueOf(sharedPreference.getFloat(strEncrypt, fDoubleValue));
                }
                iShortValue = ((Number) t).intValue();
                return (T) Integer.valueOf(sharedPreference.getInt(strEncrypt, iShortValue));
            }
            if (isSign) {
                byte[] bArrDecrypt = McsCipher.decrypt(AESUtil.toByte(sharedPreference.getString(strEncrypt, (String) t)), 1);
                Intrinsics.checkNotNullExpressionValue(bArrDecrypt, "decrypt(AESUtil.toByte(aesValue), KEY_AES_FIEXED)");
                return (T) new String(bArrDecrypt, Charsets.UTF_8);
            }
            strValueOf = (String) t;
            return (T) sharedPreference.getString(strEncrypt, strValueOf);
        } catch (Exception unused) {
            return t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.connect.api.IKv
    public <T> void put(@NotNull String key, T value, boolean isSign) {
        String string;
        int iShortValue;
        float fDoubleValue;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.context == null || value == 0) {
            return;
        }
        String strEncrypt = this.context.getPackageName() + '_' + key;
        if (isSign) {
            strEncrypt = McsCipher.encrypt(strEncrypt, 1);
            Intrinsics.checkNotNullExpressionValue(strEncrypt, "encrypt(newKey, KEY_AES_FIEXED)");
        }
        SharedPreferences.Editor editorEdit = getSharedPreference().edit();
        if (!(value instanceof String)) {
            if (!(value instanceof Integer)) {
                if (value instanceof Boolean) {
                    editorEdit.putBoolean(strEncrypt, ((Boolean) value).booleanValue());
                } else {
                    if (value instanceof Float) {
                        fDoubleValue = ((Number) value).floatValue();
                    } else if (value instanceof Double) {
                        fDoubleValue = (float) ((Number) value).doubleValue();
                    } else if (value instanceof Long) {
                        editorEdit.putLong(strEncrypt, ((Number) value).longValue());
                    } else if (value instanceof Short) {
                        iShortValue = ((Number) value).shortValue();
                    } else {
                        string = value.toString();
                    }
                    editorEdit.putFloat(strEncrypt, fDoubleValue);
                }
                editorEdit.apply();
            }
            iShortValue = ((Number) value).intValue();
            editorEdit.putInt(strEncrypt, iShortValue);
            editorEdit.apply();
        }
        string = (String) value;
        if (isSign) {
            string = McsCipher.encrypt(string, 1);
        }
        editorEdit.putString(strEncrypt, string);
        editorEdit.apply();
    }
}
