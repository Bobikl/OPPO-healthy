package com.example.opponotificationrelay;
import java.io.*;import java.nio.charset.StandardCharsets;import java.util.*;

public final class SettingsPreviewTest {
    static int n;
    static void check(boolean b,String message){n++;if(!b)throw new AssertionError(message);}
    interface Bad {void run()throws Exception;}
    static void rejects(Bad bad)throws Exception{boolean failed=false;try{bad.run();}catch(Exception e){failed=true;}check(failed,"must reject");}
    static OfficialSettingsPreview snapshot(Map<String,Boolean> apps){return new OfficialSettingsPreview(apps,null,new OfficialSettingsPreview.Nap(true,750,60),null,8,1,1);}
    static InputStream input(String s){return new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));}
    public static void main(String[] args)throws Exception {
        Map<String,Boolean> apps=new HashMap<>();apps.put("com.test.enabled",true);apps.put("com.test.off",false);
        OfficialSettingsPreview p=snapshot(apps);apps.clear();
        check(p.apps.size()==2,"immutable source copy");
        rejects(()->p.apps.put("com.test.mutation",true));
        Set<String> selected=new HashSet<>(Arrays.asList("com.test.enabled",OfficialSettingsPreview.SELF));
        check(p.differences(selected).isEmpty(),"matching list ignores self");
        selected.add("com.test.missing");
        List<OfficialSettingsPreview.Difference> diffs=p.differences(selected);
        check(diffs.size()==1 && diffs.get(0).official==null && diffs.get(0).local,"missing is unknown, never off");
        selected.remove("com.test.enabled");selected.add("com.test.off");
        diffs=p.differences(selected);
        check(diffs.size()==3,"union catches both directions plus absent");
        check(p.enabledApps()==1,"enabled count");
        check(!OfficialSettingsPreview.ordinary("main_switch") && !OfficialSettingsPreview.ordinary("sms"),"functional keys excluded");
        check(!OfficialSettingsPreview.ordinary("com.test\ninjection") && !OfficialSettingsPreview.ordinary(null),"unsafe names rejected");
        rejects(()->snapshot(Collections.singletonMap(OfficialSettingsPreview.SELF,true)));
        rejects(()->snapshot(Collections.singletonMap("main_switch",true)));
        rejects(()->new OfficialSettingsPreview(null,null,p.nap,null,0,0,0));
        OfficialSettingsPreview unread=new OfficialSettingsPreview(null,"UNREAD",null,"UNREAD",0,0,1);
        check(unread.apps==null && unread.nap==null && unread.differences(selected).isEmpty(),"unknown retains unread status");
        OfficialSettingsPreview partial=new OfficialSettingsPreview(p.apps,null,null,"KEY_UNAVAILABLE",8,1,1);
        check(partial.apps.size()==2 && partial.nap==null,"partial failure retains independent list");
        check(p.nap.matches(true,750,810),"nap equivalent start/end");
        check(!p.nap.matches(true,740,810),"ten-minute difference preserved");
        check(!p.nap.matches(false,750,810),"switch difference preserved");
        OfficialSettingsPreview.Nap midnight=new OfficialSettingsPreview.Nap(true,1380,60);
        check(!midnight.sameDay() && midnight.end()==0,"midnight not silently converted to same-day");
        OfficialSettingsPreview.Nap cross=new OfficialSettingsPreview.Nap(true,1400,90);
        check(!cross.sameDay() && cross.end()==50,"cross-day explicit");
        for(int[] invalid:new int[][]{{-1,30},{1440,30},{750,0},{750,1440}})rejects(()->new OfficialSettingsPreview.Nap(true,invalid[0],invalid[1]));
        String result=SettingsPreviewProtocol.PREFIX+"{\"schema\":1}\n"+SettingsPreviewProtocol.END+"\n";
        check("{\"schema\":1}".equals(SettingsPreviewProtocol.read(input("platform noise\n"+result))),"ignores bounded platform noise");
        InputStream noEof=new InputStream(){byte[] bytes=result.getBytes(StandardCharsets.UTF_8);int i;
            public int read()throws IOException{if(i==bytes.length)throw new IOException("EOF not permitted");return bytes[i++];}
            public int read(byte[] b,int off,int len)throws IOException{if(i==bytes.length)throw new IOException("EOF not permitted");int size=Math.min(len,bytes.length-i);System.arraycopy(bytes,i,b,off,size);i+=size;return size;}};
        check(SettingsPreviewProtocol.read(noEof).contains("schema"),"complete marker does not depend on su EOF");
        rejects(()->SettingsPreviewProtocol.read(input(SettingsPreviewProtocol.END+"\n")));
        rejects(()->SettingsPreviewProtocol.read(input(SettingsPreviewProtocol.PREFIX+"{}\n")));
        rejects(()->SettingsPreviewProtocol.read(input(SettingsPreviewProtocol.PREFIX+"{}\n"+result)));
        rejects(()->SettingsPreviewProtocol.read(new ByteArrayInputStream(new byte[SettingsPreviewProtocol.MAX_LINE+1])));
        byte[] noise=new byte[SettingsPreviewProtocol.MAX_TOTAL+1];Arrays.fill(noise,(byte)'\n');
        rejects(()->SettingsPreviewProtocol.read(new ByteArrayInputStream(noise)));
        check(SettingsPreviewProtocol.quote("abc'$(false)").equals("'abc'\\''$(false)'"),"quote keeps substitutions literal");
        rejects(()->SettingsPreviewProtocol.quote("line\nbreak"));rejects(()->SettingsPreviewProtocol.quote("zero\0byte"));
        System.out.println("Settings preview checks passed: "+n);
    }
}
