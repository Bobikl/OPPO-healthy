package com.example.opponotificationrelay;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.*;

/** 一个Editor提交用户批准的范围；不写官方文件，不改配对/运行/协议等其他设置。 */
public final class SettingsImportStore {
    private SettingsImportStore(){}
    private static final String[] KEYS={"selected_apps","nap_quiet_enabled","nap_quiet_start","nap_quiet_end"};
    public static SettingsImportPlan.Local snapshot(Context c){return snapshot(RelayConfig.getPrefs(c));}
    @SuppressWarnings("unchecked")
    static SettingsImportPlan.Local snapshot(SharedPreferences prefs) {
        synchronized(RelayConfig.class) {
            Map<String,?> all=prefs.getAll();
            int present=0;for(int i=0;i<KEYS.length;i++)if(all.containsKey(KEYS[i]))present|=1<<i;
            Set<String> apps=all.containsKey(KEYS[0])?(Set<String>)all.get(KEYS[0]):Collections.emptySet();
            boolean enabled=all.containsKey(KEYS[1])?(Boolean)all.get(KEYS[1]):false;
            int start=all.containsKey(KEYS[2])?(Integer)all.get(KEYS[2]):780;
            int end=all.containsKey(KEYS[3])?(Integer)all.get(KEYS[3]):810;
            int cid=all.containsKey("protocol_cid")?(Integer)all.get("protocol_cid"):200;
            return new SettingsImportPlan.Local(apps,enabled,start,end,cid,present);
        }
    }
    public static SettingsImportPlan.Result apply(Context c,SettingsImportPlan plan,OfficialSettingsPreview fresh,
                                                   Set<String> installed,long now) {
        SettingsImportPlan.Result result=applyToPreferences(RelayConfig.getPrefs(c),plan,fresh,installed,now,
            Thread.currentThread().isInterrupted());
        if(result==SettingsImportPlan.Result.APPLIED && !plan.before.apps.equals(plan.targetApps)) {
            try{RfcommWearTransport.getInstance(c).syncNotificationSettings();}
            catch(RuntimeException e){FileLogger.w("SettingsImport","设置已保存；本次通知开关刷新未完成，等待下次通道同步");}
        }
        FileLogger.i("SettingsImport","result="+result+" apps="+plan.importApps+" nap="+plan.importNap+
            " added="+plan.added.size()+" removed="+plan.removed.size());
        return result;
    }
    /** The adapter is separate from transport notification so persistence can be verified in isolation. */
    static SettingsImportPlan.Result applyToPreferences(SharedPreferences prefs,SettingsImportPlan plan,
            OfficialSettingsPreview fresh,Set<String> installed,long now,boolean cancelled) {
        synchronized(RelayConfig.class) {
            return plan.apply(new SettingsImportPlan.Store() {
                public SettingsImportPlan.Local current(){return snapshot(prefs);}
                public boolean save(SettingsImportPlan p) {
                    SharedPreferences.Editor editor=prefs.edit();
                    if(p.importApps)editor.putStringSet(KEYS[0],new HashSet<>(p.targetApps));
                    if(p.importNap)editor.putBoolean(KEYS[1],p.source.nap.enabled)
                        .putInt(KEYS[2],p.source.nap.start).putInt(KEYS[3],p.source.nap.end());
                    return editor.commit();
                }
                public boolean restore(SettingsImportPlan p) {
                    SharedPreferences.Editor editor=prefs.edit();
                    if(p.importApps) {
                        if((p.before.present&1)==0)editor.remove(KEYS[0]);
                        else editor.putStringSet(KEYS[0],new HashSet<>(p.before.apps));
                    }
                    if(p.importNap) {
                        if((p.before.present&2)==0)editor.remove(KEYS[1]);else editor.putBoolean(KEYS[1],p.before.enabled);
                        if((p.before.present&4)==0)editor.remove(KEYS[2]);else editor.putInt(KEYS[2],p.before.start);
                        if((p.before.present&8)==0)editor.remove(KEYS[3]);else editor.putInt(KEYS[3],p.before.end);
                    }
                    return editor.commit();
                }
            },fresh,installed,now,cancelled);
        }
    }
}
