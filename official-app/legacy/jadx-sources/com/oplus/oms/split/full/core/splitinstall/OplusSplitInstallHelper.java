package com.oplus.oms.split.full.core.splitinstall;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.oplus.aiunit.vision.d7i;
import com.oplus.aiunit.vision.q7i;
import com.oplus.aiunit.vision.w7i;
import com.oplus.oms.split.full.splitload.SplitCompatResourcesException;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class OplusSplitInstallHelper {
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public static void loadLibrary(Context context, String str) {
        if (q7i.b(context, str)) {
            return;
        }
        try {
            w7i.a(SplitInstallHelper.a, "loadLibrary system, lib: %s", str);
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e2) {
            try {
                w7i.a(SplitInstallHelper.a, "loadLibrary application, lib: %s", str);
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (new File(str2).exists()) {
                    System.load(str2);
                } else {
                    w7i.c(SplitInstallHelper.a, "loadLibrary failed, lib: %s", str);
                    throw e2;
                }
            } catch (UnsatisfiedLinkError e3) {
                w7i.c(SplitInstallHelper.a, "loadLibrary error, lib: %s, msg: %s", str, e3.getMessage());
                throw e3;
            }
        }
    }

    public static void loadResources(Activity activity, Resources resources) {
        try {
            d7i.b(activity, resources);
        } catch (SplitCompatResourcesException e2) {
            throw new RuntimeException("Failed to load activity resources", e2);
        }
    }

    public static void loadResources(Service service) {
        try {
            d7i.b(service, service.getBaseContext().getResources());
        } catch (SplitCompatResourcesException e2) {
            throw new RuntimeException("Failed to load service resources", e2);
        }
    }

    public static void loadResources(BroadcastReceiver broadcastReceiver, Context context) {
        if (context.getClass().getSimpleName().equals("ReceiverRestrictedContext")) {
            try {
                d7i.b(((ContextWrapper) context).getBaseContext(), context.getResources());
            } catch (SplitCompatResourcesException e2) {
                throw new RuntimeException("Failed to load receiver resources", e2);
            }
        }
    }
}
