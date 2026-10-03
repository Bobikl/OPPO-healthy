package com.heytap.service.accountsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Keep;
import com.nearme.aidl.UserEntity;
import com.oplus.aiunit.vision.mek;
import com.oplus.aiunit.vision.nvg;
import com.oplus.aiunit.vision.rm0;
import com.oplus.aiunit.vision.uvg;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountService {
    private static volatile CallInfoAgent callInfoAgent;

    public static void forcReqSwitchAccount(Context context, Handler handler, String str) {
        if (!hasServicePackage(context)) {
            sendNoPackageMessage(handler);
        } else if (getUCServiceVersionCode(context) < 230) {
            sendLowVersionSDK(handler);
        } else {
            getInstance(context).q();
            getInstance(context).w(handler, str);
        }
    }

    private static void forceReqCheckPwd(Context context, Handler handler) {
        if (!hasServicePackage(context)) {
            sendNoPackageMessage(handler);
        } else {
            getInstance(context).q();
            getInstance(context).t(handler);
        }
    }

    private static void forceReqReSignin(Context context, Handler handler) {
        if (!hasServicePackage(context)) {
            sendNoPackageMessage(handler);
        } else {
            getInstance(context).q();
            getInstance(context).u(handler);
        }
    }

    private static void forceReqToken(Context context, Handler handler) {
        if (!hasServicePackage(context)) {
            sendNoPackageMessage(handler);
        } else {
            getInstance(context).q();
            getInstance(context).x(handler);
        }
    }

    private static CallInfoAgent getInstance(Context context) {
        if (callInfoAgent == null) {
            synchronized (AccountService.class) {
                if (callInfoAgent == null) {
                    callInfoAgent = new CallInfoAgent(context);
                }
            }
        }
        return callInfoAgent;
    }

    public static String getKekeNameByUserName(Context context, String str) {
        if (getUCServiceVersionCode(context) < 230) {
            return "";
        }
        try {
            Context contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
            return contextCreatePackageContext != null ? contextCreatePackageContext.getSharedPreferences("KEKE_NAME_RECORD_INFO", 4).getString(str, "") : "";
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static String getNameByProvider(Context context) {
        if (hasServicePackage(context)) {
            return rm0.a(context);
        }
        if (hasOldCenterPackage(context)) {
            return rm0.c(context);
        }
        return null;
    }

    private static String getTokenByProvider(Context context) {
        if (hasServicePackage(context)) {
            return rm0.d(context);
        }
        if (hasOldCenterPackage(context)) {
            return rm0.f(context);
        }
        return null;
    }

    public static int getUCServiceVersionCode(Context context) {
        try {
            return nvg.a(context, uvg.k());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getUserCenterVersionCode(Context context) {
        try {
            int iA = nvg.a(context, uvg.h());
            return iA > 0 ? iA : nvg.a(context, uvg.j());
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean hasOldCenterPackage(Context context) {
        int iA;
        try {
            iA = nvg.a(context, uvg.j());
        } catch (Exception e2) {
            e2.printStackTrace();
            iA = 0;
        }
        return iA < 130 && iA > 110;
    }

    public static boolean hasServiceAPK(Context context) {
        return hasServicePackage(context);
    }

    private static boolean hasServicePackage(Context context) {
        return nvg.a(context, uvg.k()) > 0;
    }

    public static void initAgent() {
        callInfoAgent = null;
    }

    public static boolean isLogin(Context context) {
        if (hasServicePackage(context)) {
            return rm0.i(context);
        }
        if (hasOldCenterPackage(context)) {
            return rm0.h(context);
        }
        return false;
    }

    public static void jumpToFuc(Context context, String str) {
        if (getUserCenterVersionCode(context) < 230 || getUCServiceVersionCode(context) < 230) {
            if (isLogin(context)) {
                Intent intent = new Intent(mek.l());
                intent.setFlags(536870912);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    context.startActivity(intent);
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            return;
        }
        if (isLogin(context, str)) {
            Intent intent2 = new Intent(mek.k());
            intent2.putExtra("AccountName", getNameByProvider(context, str));
            intent2.setFlags(536870912);
            if (!(context instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            try {
                context.startActivity(intent2);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    private static void reqCheckPwd(Context context, Handler handler) {
        if (hasServicePackage(context)) {
            getInstance(context).t(handler);
        } else {
            sendNoPackageMessage(handler);
        }
    }

    private static void reqReSignin(Context context, Handler handler) {
        if (hasServicePackage(context)) {
            getInstance(context).u(handler);
        } else {
            sendNoPackageMessage(handler);
        }
    }

    public static void reqSwitchAccount(Context context, Handler handler, String str) {
        if (!hasServicePackage(context)) {
            sendNoPackageMessage(handler);
        } else if (getUCServiceVersionCode(context) >= 230) {
            getInstance(context).w(handler, str);
        } else {
            sendLowVersionSDK(handler);
        }
    }

    private static void reqToken(Context context, Handler handler) {
        if (hasServicePackage(context)) {
            getInstance(context).x(handler);
        } else {
            sendNoPackageMessage(handler);
        }
    }

    private static void sendLowVersionSDK(Handler handler) {
        Message message = new Message();
        message.obj = new UserEntity(30003041, "UCService Version Too Low!", "", "");
        handler.sendMessage(message);
    }

    private static void sendNoPackageMessage(Handler handler) {
        Message message = new Message();
        message.obj = new UserEntity(30003042, "Account number is zero!", "", "");
        handler.sendMessage(message);
    }

    private static void sendNoneAccount(Handler handler) {
        Message message = new Message();
        message.obj = new UserEntity(30003042, "Account number is zero!", "", "");
        handler.sendMessage(message);
    }

    public static void reqReSignin(Context context, Handler handler, String str) {
        if (hasServicePackage(context)) {
            if (getUCServiceVersionCode(context) >= 230) {
                getInstance(context).v(handler, str);
                return;
            } else {
                reqReSignin(context, handler);
                return;
            }
        }
        sendNoPackageMessage(handler);
    }

    public static void reqToken(Context context, Handler handler, String str) {
        if (hasServicePackage(context)) {
            if (getUCServiceVersionCode(context) >= 230) {
                getInstance(context).y(handler, str);
                return;
            } else {
                reqToken(context, handler);
                return;
            }
        }
        sendNoPackageMessage(handler);
    }

    public static void forceReqReSignin(Context context, Handler handler, String str) {
        if (hasServicePackage(context)) {
            if (getUCServiceVersionCode(context) >= 230) {
                getInstance(context).q();
                getInstance(context).v(handler, str);
                return;
            } else {
                forceReqReSignin(context, handler);
                return;
            }
        }
        sendNoPackageMessage(handler);
    }

    public static void forceReqToken(Context context, Handler handler, String str) {
        if (hasServicePackage(context)) {
            if (getUCServiceVersionCode(context) >= 230) {
                getInstance(context).q();
                getInstance(context).y(handler, str);
                return;
            } else {
                forceReqToken(context, handler);
                return;
            }
        }
        sendNoPackageMessage(handler);
    }

    public static String getNameByProvider(Context context, String str) {
        if (getUCServiceVersionCode(context) >= 230) {
            return rm0.b(context, str);
        }
        return getNameByProvider(context);
    }

    public static String getTokenByProvider(Context context, String str) {
        if (getUCServiceVersionCode(context) >= 230) {
            return rm0.e(context, str);
        }
        return getTokenByProvider(context);
    }

    public static boolean isLogin(Context context, String str) {
        if (getUCServiceVersionCode(context) >= 230) {
            return rm0.j(context, str);
        }
        return isLogin(context);
    }
}
