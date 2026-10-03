package com.heytap.accessory.base;

import com.heytap.accessory.Config;
import com.heytap.accessory.authcode.AuthenticationManager;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.misc.utils.PlatformUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String a = a.class.getSimpleName() + " - SLPTrack";

    public static String a(int i) {
        if (i == 0) {
            return "OPERATION_FIND_PEER";
        }
        if (i == 1) {
            return "OPERATION_SYNC_CAPABILITY";
        }
        if (i != 2) {
            return i != 3 ? "unknown operation" : "OPERATION_TRANSPORT";
        }
        return "OPERATION_REQUEST_CONNECTION";
    }

    public static boolean a(com.heytap.accessory.base.bean.b bVar) {
        if (com.heytap.accessory.base.bean.c.a().b()) {
            return true;
        }
        if (bVar != null) {
            return bVar.M();
        }
        com.heytap.accessory.base.logging.a.e(a, "check isDormant failed, accessory is null... ");
        return false;
    }

    public static boolean a(int i, long j, String str, String str2) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null) {
            com.heytap.accessory.base.logging.a.e(a, "not GetThrough, remote accessory is null,accessoryId:" + j);
            return false;
        }
        FrameworkServiceDescription frameworkServiceDescriptionB = com.heytap.accessory.sdp.service.b.g().b(str);
        if (frameworkServiceDescriptionB == null) {
            com.heytap.accessory.base.logging.a.e(a, str + " not GetThrough, local description is null... ");
            return false;
        }
        FrameworkServiceDescription frameworkServiceDescriptionB2 = bVarA.b(str2);
        if (frameworkServiceDescriptionB2 == null) {
            com.heytap.accessory.base.logging.a.e(a, str2 + " not GetThrough, remote description is null... ");
            return false;
        }
        return a(i, bVarA, frameworkServiceDescriptionB, frameworkServiceDescriptionB2);
    }

    public static boolean a(int i, com.heytap.accessory.base.bean.b bVar, FrameworkServiceDescription frameworkServiceDescription, FrameworkServiceDescription frameworkServiceDescription2) {
        if (!a(bVar)) {
            com.heytap.accessory.base.logging.a.a(a, a(i) + " GetThrough: device not dormant");
            return true;
        }
        try {
            boolean zCheckPermission = AuthenticationManager.checkPermission(PlatformUtils.getContext(), frameworkServiceDescription.d(), Config.Permission.AWAKENABLE, false);
            if (zCheckPermission && frameworkServiceDescription2.e() == 1 && frameworkServiceDescription.e() == 1) {
                com.heytap.accessory.base.logging.a.a(a, a(i) + " GetThrough: device dormant, but awakenAuth and ProfileAwakenable is enable; profile:" + frameworkServiceDescription2.m());
                return true;
            }
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("profile:");
            sb.append(frameworkServiceDescription2.m());
            sb.append(a(i));
            sb.append(" not GetThrough:  awakenAuth:");
            sb.append(zCheckPermission);
            sb.append(" local Awakenable:");
            sb.append(frameworkServiceDescription.e() == 1);
            sb.append(" remote Awakenable:");
            sb.append(frameworkServiceDescription2.e() == 1);
            com.heytap.accessory.base.logging.a.e(str, sb.toString());
            return false;
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(a, "canGetThrough AuthFailureException", e);
            return false;
        }
    }
}
