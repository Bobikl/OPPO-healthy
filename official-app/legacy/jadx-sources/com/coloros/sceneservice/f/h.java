package com.coloros.sceneservice.f;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import com.coloros.sceneservice.SceneSDKInit;

/* JADX INFO: loaded from: classes13.dex */
public class h {
    public static final String Pb = "1";
    public static final String Qb = "scene_service_statement_state";
    public static final String TAG = "SettingInterface";

    public static void a(Activity activity, int i) {
        if (j()) {
            com.coloros.sceneservice.m.f.d(TAG, "SceneService have privacy ");
            return;
        }
        if (com.coloros.sceneservice.m.a.r()) {
            com.coloros.sceneservice.m.f.d(TAG, "send broadcase to sceneservice ");
            Intent intent = new Intent(com.coloros.sceneservice.m.b.Pc);
            intent.setPackage("com.coloros.sceneservice");
            activity.sendBroadcast(intent, "oppo.permission.OPPO_COMPONENT_SAFE");
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("coloros.intent.action.SCENE_SERVICE_STATEMENT");
        intent2.setPackage("com.coloros.sceneservice");
        intent2.setFlags(67108864);
        intent2.putExtra(com.coloros.sceneservice.m.b.Rc, activity.getComponentName());
        try {
            activity.startActivityForResult(intent2, i);
        } catch (Exception e2) {
            com.coloros.sceneservice.m.f.e(TAG, e2.getMessage());
        }
    }

    public static void authorizeStatementState() {
        if (com.coloros.sceneservice.m.a.r()) {
            com.coloros.sceneservice.m.f.d(TAG, "send broadcase to sceneservice ");
            Intent intent = new Intent(com.coloros.sceneservice.m.b.Pc);
            intent.setPackage("com.coloros.sceneservice");
            SceneSDKInit.getContext().sendBroadcast(intent, "oppo.permission.OPPO_COMPONENT_SAFE");
        }
    }

    public static String c(String str) {
        String string = null;
        try {
            Cursor cursorQuery = com.coloros.sceneservice.b.a.query(com.coloros.sceneservice.e.d.URI, new String[]{"key", "value"}, "key=?", new String[]{str}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(1);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th4) {
            com.coloros.sceneservice.m.f.e(TAG, "getKeyValue: throwable = " + th4);
        }
        return string;
    }

    public static boolean j() {
        try {
            return "1".equals(c(Qb));
        } catch (Exception e2) {
            com.coloros.sceneservice.m.f.e(TAG, "" + e2);
            return true;
        }
    }
}
