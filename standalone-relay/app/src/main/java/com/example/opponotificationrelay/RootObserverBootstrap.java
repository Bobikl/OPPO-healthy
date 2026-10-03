package com.example.opponotificationrelay;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import java.lang.reflect.Field;
/** One-shot device ABI discovery; exits before the native observer is started. */
public final class RootObserverBootstrap {
    private RootObserverBootstrap() { }
    private static int constant(Class<?> c,String name) throws Exception {
        Field f=c.getDeclaredField(name);f.setAccessible(true);return f.getInt(null);
    }
    private static String intent(String pkg,String component) {
        Parcel p=Parcel.obtain();
        try {
            p.writeInt(1);new Intent().setComponent(new ComponentName(pkg,component)).writeToParcel(p,0);
            byte[] raw=p.marshall();if(raw.length>4096)throw new IllegalArgumentException("intent size");
            StringBuilder hex=new StringBuilder();
            for(byte b:raw) hex.append(String.format(java.util.Locale.ROOT,"%02x",b&255));
            return hex.toString();
        } finally {p.recycle();}
    }
    public static void main(String[] args) {
        try {
            if(android.os.Process.myUid()!=0 || android.os.Build.VERSION.SDK_INT<33)throw new IllegalArgumentException("platform");
            if(args.length<1 || args.length>2)throw new IllegalArgumentException("targets");
            Class<?> am=Class.forName("android.app.IActivityManager$Stub"),uid=Class.forName("android.app.IUidObserver$Stub");
            Class<?> activity=Class.forName("android.app.ActivityManager");
            int absent=constant(activity,"PROCESS_STATE_NONEXISTENT"),cached=constant(activity,"PROCESS_STATE_CACHED_EMPTY");
            StringBuilder out=new StringBuilder("--schema 1 --sdk ").append(android.os.Build.VERSION.SDK_INT);
            out.append(" --register ").append(constant(am,"TRANSACTION_registerUidObserverForUids"));
            out.append(" --unregister ").append(constant(am,"TRANSACTION_unregisterUidObserver"));
            out.append(" --query ").append(constant(am,"TRANSACTION_getUidProcessState"));
            out.append(" --peek ").append(constant(am,"TRANSACTION_peekService"));
            out.append(" --state ").append(constant(uid,"TRANSACTION_onUidStateChanged"));
            out.append(" --gone ").append(constant(uid,"TRANSACTION_onUidGone"));
            out.append(" --flags ").append(constant(activity,"UID_OBSERVER_PROCSTATE")|constant(activity,"UID_OBSERVER_GONE"));
            out.append(" --absent ").append(absent).append(" --cut ").append(cached==absent-1?cached:-1);
            for(String arg:args) {
                String[] pair=arg.split(":",-1);
                if(pair.length!=2 || !(pair[0].equals("com.heytap.health")||pair[0].equals("com.coloros.health")))throw new IllegalArgumentException("package");
                int id=Integer.parseInt(pair[1]);if(id<10000)throw new IllegalArgumentException("uid");
                out.append(" --target ").append(id);
                if(pair[0].equals("com.heytap.health"))out.append(" --intent ").append(intent(pair[0],"com.heytap.health.service.CompanionDeviceDaemonService"));
                out.append(" --intent ").append(intent(pair[0],"androidx.room.MultiInstanceInvalidationService"));
            }
            System.out.println(out);System.out.flush();System.exit(0);
        } catch(Exception e) {System.err.println("OAFBOOT1 ERROR ABI_DISCOVERY_FAILED");System.exit(2);}
    }
}
