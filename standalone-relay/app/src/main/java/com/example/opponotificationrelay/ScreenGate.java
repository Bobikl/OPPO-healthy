package com.example.opponotificationrelay;

import android.content.Context;
import android.os.PowerManager;
import android.app.KeyguardManager;

/** Query only when a selected notification arrives/is about to send; no timer or wakelock. */
public final class ScreenGate {
    private ScreenGate() { }
    public static boolean usingPhone(Context c) {
        PowerManager power=c.getSystemService(PowerManager.class);
        KeyguardManager keyguard=c.getSystemService(KeyguardManager.class);
        return ScreenForwardPolicy.usingPhone(power!=null && power.isInteractive(),keyguard==null || keyguard.isKeyguardLocked());
    }
    public static boolean blocks(Context c,boolean removed,boolean ownStatus) {
        boolean enabled=RelayConfig.suppressWhileScreenOn(c);
        if(!enabled || removed || ownStatus) return false;
        return ScreenForwardPolicy.block(enabled,usingPhone(c),removed,ownStatus);
    }
}
