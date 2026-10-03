package com.afollestad.assent;

import android.annotation.SuppressLint;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b$\b\u0087\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/afollestad/assent/Permission;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", LanConstants.OPERATOR_UNKNOWN, "READ_CALENDAR", "WRITE_CALENDAR", "CAMERA", "READ_CONTACTS", "WRITE_CONTACTS", "GET_ACCOUNTS", "ACCESS_FINE_LOCATION", "ACCESS_COARSE_LOCATION", "ACCESS_BACKGROUND_LOCATION", "RECORD_AUDIO", "READ_PHONE_STATE", "CALL_PHONE", "READ_CALL_LOG", "WRITE_CALL_LOG", "ADD_VOICEMAIL", "USE_SIP", "BODY_SENSORS", "SEND_SMS", "RECEIVE_SMS", "READ_SMS", "RECEIVE_WAP_PUSH", "RECEIVE_MMS", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE", "SYSTEM_ALERT_WINDOW", "PROCESS_OUTGOING_CALLS", "core"}, k = 1, mv = {1, 4, 0})
@SuppressLint({"InlinedApi"})
public enum Permission {
    UNKNOWN(""),
    READ_CALENDAR("android.permission.READ_CALENDAR"),
    WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
    CAMERA("android.permission.CAMERA"),
    READ_CONTACTS("android.permission.READ_CONTACTS"),
    WRITE_CONTACTS("android.permission.WRITE_CONTACTS"),
    GET_ACCOUNTS("android.permission.GET_ACCOUNTS"),
    ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    ACCESS_BACKGROUND_LOCATION("android.permission.ACCESS_BACKGROUND_LOCATION"),
    RECORD_AUDIO("android.permission.RECORD_AUDIO"),
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
    CALL_PHONE("android.permission.CALL_PHONE"),
    READ_CALL_LOG("android.permission.READ_CALL_LOG"),
    WRITE_CALL_LOG("android.permission.WRITE_CALL_LOG"),
    ADD_VOICEMAIL("com.android.voicemail.permission.ADD_VOICEMAIL"),
    USE_SIP("android.permission.USE_SIP"),
    BODY_SENSORS("android.permission.BODY_SENSORS"),
    SEND_SMS("android.permission.SEND_SMS"),
    RECEIVE_SMS("android.permission.RECEIVE_SMS"),
    READ_SMS("android.permission.READ_SMS"),
    RECEIVE_WAP_PUSH("android.permission.RECEIVE_WAP_PUSH"),
    RECEIVE_MMS("android.permission.RECEIVE_MMS"),
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    WRITE_EXTERNAL_STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
    SYSTEM_ALERT_WINDOW("android.permission.SYSTEM_ALERT_WINDOW"),
    PROCESS_OUTGOING_CALLS("android.permission.PROCESS_OUTGOING_CALLS");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: com.afollestad.assent.Permission$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/afollestad/assent/Permission$a;", "", "", ResourcesUtil.ResourceType.RAW, "Lcom/afollestad/assent/Permission;", "a", "<init>", "()V", "core"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002b  */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        @JvmStatic
        @NotNull
        public final Permission a(@NotNull String raw) {
            Intrinsics.checkParameterIsNotNull(raw, "raw");
            Permission permission = null;
            Permission permission2 = null;
            boolean z = false;
            for (Permission permission3 : Permission.values()) {
                if (Intrinsics.areEqual(permission3.getValue(), raw)) {
                    if (z) {
                        if (permission != null) {
                            return permission;
                        }
                        return Permission.UNKNOWN;
                    }
                    z = true;
                    permission2 = permission3;
                }
            }
            if (z) {
                permission = permission2;
            }
            if (permission != null) {
                return permission;
            }
            return Permission.UNKNOWN;
        }
    }

    Permission(String str) {
        this.value = str;
    }

    @JvmStatic
    @NotNull
    public static final Permission parse(@NotNull String str) {
        return INSTANCE.a(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
