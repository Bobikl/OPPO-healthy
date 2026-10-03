package com.example.opponotificationrelay;

import java.util.*;

/** 导入计划及冲突判定；只管理用户勾选的范围，缺失官方记录保持原选择。 */
public final class SettingsImportPlan {
    public static final class Local {
        public final Set<String> apps;public final boolean enabled;
        public final int start,end,cid,present;
        public Local(Set<String> apps,boolean enabled,int start,int end,int cid,int present) {
            this.apps=Collections.unmodifiableSet(new TreeSet<>(apps));this.enabled=enabled;
            this.start=start;this.end=end;this.cid=cid;this.present=present;
        }
    }
    public final OfficialSettingsPreview source;
    public final Local before;
    public final boolean importApps,importNap;
    public final Set<String> targetApps,added,removed;
    public final int preservedMissing,skippedUninstalled;
    public final long reviewedAt;
    public SettingsImportPlan(OfficialSettingsPreview source,Local before,Set<String> installed,
                              boolean apps,boolean nap,long now) {
        if(!apps&&!nap)throw new IllegalArgumentException("NO_SCOPE");
        if(source==null || (apps&&source.apps==null)||(nap&&source.nap==null))throw new IllegalArgumentException("SOURCE_UNREAD");
        if(nap && !source.nap.sameDay())throw new IllegalArgumentException("NAP_CROSS_DAY");
        if(nap && source.nap.enabled && before.cid!=200)throw new IllegalArgumentException("NAP_PROTOCOL");
        this.source=source;this.before=before;this.importApps=apps;this.importNap=nap;this.reviewedAt=now;
        TreeSet<String> target=new TreeSet<>(before.apps);int missing=0,uninstalled=0;
        if(apps) {
            for(Map.Entry<String,Boolean> e:source.apps.entrySet()) {
                String pkg=e.getKey();
                if(OfficialSettingsPreview.SELF.equals(pkg))continue;
                if(!installed.contains(pkg)){uninstalled++;continue;}
                if(e.getValue())target.add(pkg);else target.remove(pkg);
            }
            for(String pkg:before.apps)if(!OfficialSettingsPreview.SELF.equals(pkg) && !source.apps.containsKey(pkg))missing++;
        }
        targetApps=Collections.unmodifiableSet(target);
        TreeSet<String> add=new TreeSet<>(target);add.removeAll(before.apps);added=Collections.unmodifiableSet(add);
        TreeSet<String> remove=new TreeSet<>(before.apps);remove.removeAll(target);removed=Collections.unmodifiableSet(remove);
        preservedMissing=missing;skippedUninstalled=uninstalled;
    }
    public boolean napChanged(){return importNap&&!source.nap.matches(before.enabled,before.start,before.end);}
    public boolean changes(){return !added.isEmpty()||!removed.isEmpty()||napChanged();}
    public boolean localMatches(Local current) {
        if(importApps && (!before.apps.equals(current.apps) || ((before.present^current.present)&1)!=0))return false;
        return !importNap || (before.enabled==current.enabled && before.start==current.start && before.end==current.end &&
            before.cid==current.cid && ((before.present^current.present)&14)==0);
    }
    public boolean freshMatches(OfficialSettingsPreview fresh,Set<String> installed) {
        if(fresh==null || (importApps && !Objects.equals(source.apps,fresh.apps)))return false;
        if(importNap && (fresh.nap==null || source.nap.enabled!=fresh.nap.enabled ||
            source.nap.start!=fresh.nap.start || source.nap.duration!=fresh.nap.duration))return false;
        SettingsImportPlan updated=new SettingsImportPlan(fresh,before,installed,importApps,importNap,reviewedAt);
        return targetApps.equals(updated.targetApps) && skippedUninstalled==updated.skippedUninstalled;
    }
    public boolean expired(long now){return now<reviewedAt || now-reviewedAt>120000;}
    public enum Result { APPLIED, NO_CHANGE, LOCAL_CHANGED, SOURCE_CHANGED, EXPIRED, CANCELLED, FAILED_RESTORED, FAILED_UNCERTAIN }
    public interface Store {
        Local current();
        boolean save(SettingsImportPlan plan);
        boolean restore(SettingsImportPlan plan);
    }
    /** Caller holds the same lock as local setters throughout this operation. */
    public Result apply(Store store,OfficialSettingsPreview fresh,Set<String> installed,long now,boolean cancelled) {
        if(cancelled)return Result.CANCELLED;
        if(expired(now))return Result.EXPIRED;
        if(!localMatches(store.current()))return Result.LOCAL_CHANGED;
        if(!freshMatches(fresh,installed))return Result.SOURCE_CHANGED;
        if(!changes())return Result.NO_CHANGE;
        try {
            if(store.save(this))return Result.APPLIED;
        } catch(RuntimeException ignored) { }
        // commit(false) may already have updated in-memory preferences. Restore the selected keys too.
        try{return store.restore(this)?Result.FAILED_RESTORED:Result.FAILED_UNCERTAIN;}
        catch(RuntimeException ignored){return Result.FAILED_UNCERTAIN;}
    }
}
