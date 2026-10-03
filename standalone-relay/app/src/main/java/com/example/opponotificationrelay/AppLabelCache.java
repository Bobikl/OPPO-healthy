package com.example.opponotificationrelay;
import android.content.*;
import android.content.pm.*;
import android.os.Build;
import android.util.LruCache;

/** Cache only bounded names, never package Resources, Drawable or Activity. */
public final class AppLabelCache {
    private static final LruCache<String,String> names=new LruCache<>(64);
    private static boolean installed;
    private static long revision;
    private AppLabelCache() {}
    public static synchronized void install(Context c) {
        if(installed) return;installed=true;
        Context app=c.getApplicationContext();
        BroadcastReceiver changes=new BroadcastReceiver() {
            @Override public void onReceive(Context context,Intent intent) {
                String pkg=intent.getData()==null?null:intent.getData().getSchemeSpecificPart();
                synchronized(AppLabelCache.class) {revision++;if(pkg==null)names.evictAll();else names.remove(pkg);}
                AppIconStore.invalidate(pkg);
            }
        };
        IntentFilter packages=new IntentFilter();
        packages.addAction(Intent.ACTION_PACKAGE_ADDED);packages.addAction(Intent.ACTION_PACKAGE_REMOVED);
        packages.addAction(Intent.ACTION_PACKAGE_REPLACED);packages.addAction(Intent.ACTION_PACKAGE_CHANGED);packages.addDataScheme("package");
        IntentFilter locale=new IntentFilter(Intent.ACTION_LOCALE_CHANGED);
        try {
            if(Build.VERSION.SDK_INT>=33) {app.registerReceiver(changes,packages,Context.RECEIVER_NOT_EXPORTED);app.registerReceiver(changes,locale,Context.RECEIVER_NOT_EXPORTED);}
            else {app.registerReceiver(changes,packages);app.registerReceiver(changes,locale);}
        } catch(RuntimeException e){FileLogger.w("ResourceCache","应用资源变更监听不可用，图标保留限时失效");}
    }
    public static String get(Context c,String pkg) {
        install(c);final long token;
        synchronized(AppLabelCache.class) {String old=names.get(pkg);if(old!=null)return old;token=revision;}
        String label=pkg;
        try {
            PackageManager pm=c.getPackageManager();
            label=MessageBudget.text(pm.getApplicationLabel(pm.getApplicationInfo(pkg,0)),MessageBudget.MAX_LABEL_BYTES);
        } catch(PackageManager.NameNotFoundException ignored) {}
        synchronized(AppLabelCache.class) {if(token==revision)names.put(pkg,label);}
        return label;
    }
    public static synchronized void clear() {revision++;names.evictAll();}
}
