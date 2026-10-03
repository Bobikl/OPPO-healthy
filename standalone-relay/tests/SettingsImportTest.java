package com.example.opponotificationrelay;

import java.util.*;
import static com.example.opponotificationrelay.SettingsImportPlan.Result.*;

public final class SettingsImportTest {
    static int n;
    static void check(boolean value,String why){n++;if(!value)throw new AssertionError(why);}
    interface Bad{void run();}
    static void rejects(Bad bad){boolean failed=false;try{bad.run();}catch(IllegalArgumentException e){failed=true;}check(failed,"reject invalid plan");}
    static Set<String> set(String...p){return new HashSet<>(Arrays.asList(p));}
    static OfficialSettingsPreview source(Map<String,Boolean> apps,OfficialSettingsPreview.Nap nap) {
        return new OfficialSettingsPreview(apps,apps==null?"UNREAD":null,nap,nap==null?"UNREAD":null,8,1,1);
    }
    static SettingsImportPlan.Local local(Set<String> apps,boolean on,int start,int end,int cid,int bits) {
        return new SettingsImportPlan.Local(apps,on,start,end,cid,bits);
    }
    static final class MemoryStore implements SettingsImportPlan.Store {
        SettingsImportPlan.Local value;int saves,restores;boolean failSave,failRestore,throwSave;
        MemoryStore(SettingsImportPlan.Local value){this.value=value;}
        public SettingsImportPlan.Local current(){return value;}
        public boolean save(SettingsImportPlan p){
            saves++;value=local(p.importApps?p.targetApps:value.apps,p.importNap?p.source.nap.enabled:value.enabled,
                p.importNap?p.source.nap.start:value.start,p.importNap?p.source.nap.end():value.end,value.cid,
                value.present|(p.importApps?1:0)|(p.importNap?14:0));
            if(throwSave)throw new IllegalStateException("disk failure after memory update");
            return !failSave;
        }
        public boolean restore(SettingsImportPlan p){
            restores++;value=local(p.importApps?p.before.apps:value.apps,p.importNap?p.before.enabled:value.enabled,
                p.importNap?p.before.start:value.start,p.importNap?p.before.end:value.end,value.cid,
                (value.present&~((p.importApps?1:0)|(p.importNap?14:0)))|(p.before.present&((p.importApps?1:0)|(p.importNap?14:0))));
            return !failRestore;
        }
    }
    public static void main(String[] args) {
        Map<String,Boolean> apps=new HashMap<>();apps.put("com.test.on",true);apps.put("com.test.off",false);apps.put("com.test.gone",true);
        OfficialSettingsPreview official=source(apps,new OfficialSettingsPreview.Nap(true,750,60));
        SettingsImportPlan.Local before=local(set("com.test.off","com.test.local",OfficialSettingsPreview.SELF),true,740,810,200,15);
        Set<String> installed=set("com.test.on","com.test.off","com.test.local",OfficialSettingsPreview.SELF);
        SettingsImportPlan both=new SettingsImportPlan(official,before,installed,true,true,100);
        check(both.added.equals(set("com.test.on"))&&both.removed.equals(set("com.test.off")),"two-way explicit app switches");
        check(both.targetApps.contains("com.test.local"),"missing official choice preserved");
        check(both.targetApps.contains(OfficialSettingsPreview.SELF),"own state never silently changed");
        check(!both.targetApps.contains("com.test.gone")&&both.skippedUninstalled==1,"uninstalled app cannot become enabled later");
        check(both.preservedMissing==1,"preserved missing count excludes self");
        check(both.napChanged()&&both.changes(),"ten-minute difference detected");
        MemoryStore store=new MemoryStore(before);
        check(both.apply(store,official,installed,101,false)==APPLIED && store.saves==1 && store.restores==0,"one group save");
        check(store.value.start==750&&store.value.end==810&&store.value.apps.equals(both.targetApps),"complete destination");
        check(both.apply(store,official,installed,102,false)==LOCAL_CHANGED&&store.saves==1,"stale confirm cannot apply twice");
        SettingsImportPlan same=new SettingsImportPlan(official,store.value,installed,true,true,200);
        check(same.apply(store,official,installed,200,false)==NO_CHANGE&&store.saves==1,"no-op avoids persistence");
        store=new MemoryStore(before);
        check(both.apply(store,official,installed,101,true)==CANCELLED&&store.saves==0,"cancel writes nothing");
        check(both.apply(store,official,installed,120101,false)==EXPIRED&&store.saves==0,"expired confirm writes nothing");
        check(both.apply(store,official,installed,99,false)==EXPIRED,"clock reversal invalidates");
        Set<String> changedInstall=new HashSet<>(installed);changedInstall.remove("com.test.on");
        check(both.apply(store,official,changedInstall,101,false)==SOURCE_CHANGED&&store.saves==0,"uninstall after review re-confirms");
        OfficialSettingsPreview changed=source(apps,new OfficialSettingsPreview.Nap(false,750,60));
        check(both.apply(store,changed,installed,101,false)==SOURCE_CHANGED,"official switch change cannot slip through");
        store.value=local(before.apps,true,745,810,200,15);
        check(both.apply(store,official,installed,101,false)==LOCAL_CHANGED&&store.saves==0,"local time edit preserved");
        store.value=local(before.apps,true,740,810,1,15);
        check(both.apply(store,official,installed,101,false)==LOCAL_CHANGED,"protocol race prevents enabled nap on CID1");
        store=new MemoryStore(before);store.failSave=true;
        check(both.apply(store,official,installed,101,false)==FAILED_RESTORED&&store.restores==1,"failed commit restores");
        check(store.value.apps.equals(before.apps)&&store.value.start==740&&store.value.enabled,"rollback repairs live memory too");
        store=new MemoryStore(before);store.throwSave=true;store.failRestore=true;
        check(both.apply(store,official,installed,101,false)==FAILED_UNCERTAIN,"failed rollback remains explicit");
        SettingsImportPlan napOnly=new SettingsImportPlan(official,before,installed,false,true,100);
        store=new MemoryStore(local(set("com.test.new"),true,740,810,200,15));
        check(napOnly.apply(store,official,installed,101,false)==APPLIED&&store.value.apps.equals(set("com.test.new")),"unselected app edit survives nap import");
        SettingsImportPlan appsOnly=new SettingsImportPlan(official,before,installed,true,false,100);
        store=new MemoryStore(local(before.apps,false,900,930,1,15));
        check(appsOnly.apply(store,changed,installed,101,false)==APPLIED&&!store.value.enabled&&store.value.start==900&&store.value.cid==1,
            "unselected nap/protocol edit survives list import");
        SettingsImportPlan.Local absent=local(set(),false,780,810,200,0);
        SettingsImportPlan absentPlan=new SettingsImportPlan(official,absent,installed,false,true,100);
        store=new MemoryStore(absent);store.failSave=true;
        check(absentPlan.apply(store,official,installed,101,false)==FAILED_RESTORED&&store.value.present==0,"rollback retains key absence");
        rejects(()->new SettingsImportPlan(official,before,installed,false,false,1));
        rejects(()->new SettingsImportPlan(source(null,official.nap),before,installed,true,false,1));
        rejects(()->new SettingsImportPlan(source(apps,null),before,installed,false,true,1));
        check(new SettingsImportPlan(source(null,official.nap),before,installed,false,true,1).napChanged(),"nap-only tolerates unread list");
        check(new SettingsImportPlan(source(apps,null),before,installed,true,false,1).changes(),"list-only tolerates unread nap");
        rejects(()->new SettingsImportPlan(source(apps,new OfficialSettingsPreview.Nap(true,1400,60)),before,installed,false,true,1));
        rejects(()->new SettingsImportPlan(official,local(before.apps,false,740,810,1,15),installed,false,true,1));
        check(!new SettingsImportPlan(source(apps,new OfficialSettingsPreview.Nap(false,750,60)),
            local(before.apps,false,740,810,1,15),installed,false,true,1).source.nap.enabled,"CID1 may import a disabled nap configuration");
        for(int scope=1;scope<=3;scope++)for(int on=0;on<2;on++)for(int target=0;target<2;target++){
            OfficialSettingsPreview value=source(apps,new OfficialSettingsPreview.Nap(target==1,750,60));
            SettingsImportPlan.Local initial=local(before.apps,on==1,740,810,200,15);
            SettingsImportPlan plan=new SettingsImportPlan(value,initial,installed,(scope&1)!=0,(scope&2)!=0,0);
            MemoryStore memory=new MemoryStore(initial);
            check(plan.apply(memory,value,installed,1,false)==APPLIED,"scope matrix applies");
            check(memory.value.apps.equals((scope&1)!=0?plan.targetApps:initial.apps),"scope matrix app preservation");
            check(memory.value.enabled==((scope&2)!=0?target==1:initial.enabled),"scope matrix switch preservation");
        }
        System.out.println("Settings import checks passed: "+n);
    }
}
