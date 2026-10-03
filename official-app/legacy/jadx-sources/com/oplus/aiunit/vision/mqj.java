package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.heytap.health.telecom.TelecomApiProvider;
import com.heytap.health.telecom.aidl.ITelecomSync;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class mqj {
    public static void a(List<String> list) {
        a7b.f("TelHealth.TelecomPermUtils", "onPermGranted() called with: perms = [" + list + "]");
        if (list.contains("android.permission.READ_PHONE_STATE") || list.contains("android.permission.READ_CALL_LOG") || list.contains("android.permission.CALL_PHONE") || list.contains("android.permission.ANSWER_PHONE_CALLS")) {
            try {
                ITelecomSync iTelecomSyncE = TelecomApiProvider.e();
                if (iTelecomSyncE != null) {
                    iTelecomSyncE.onAction(1);
                }
            } catch (RemoteException e2) {
                a7b.f("TelHealth.TelecomPermUtils", "onPermGranted() error" + e2.getMessage());
            }
        }
    }

    public static void b() {
        a7b.f("TelHealth.TelecomPermUtils", "onPermGrantedByPair: ");
        try {
            ITelecomSync iTelecomSyncE = TelecomApiProvider.e();
            if (iTelecomSyncE != null) {
                iTelecomSyncE.onAction(1);
            }
        } catch (RemoteException e2) {
            a7b.f("TelHealth.TelecomPermUtils", "onPermGrantedByPair() error" + e2.getMessage());
        }
    }

    public static void c(List<String> list) {
        a7b.f("TelHealth.TelecomPermUtils", "onPermissionDenied() called with: perms = [" + list + "]");
        if (list.contains("android.permission.READ_PHONE_STATE") || list.contains("android.permission.READ_CALL_LOG")) {
            try {
                ITelecomSync iTelecomSyncE = TelecomApiProvider.e();
                if (iTelecomSyncE != null) {
                    iTelecomSyncE.onAction(3);
                }
            } catch (RemoteException e2) {
                a7b.f("TelHealth.TelecomPermUtils", "onPermissionDenied() error" + e2.getMessage());
            }
        }
    }
}
