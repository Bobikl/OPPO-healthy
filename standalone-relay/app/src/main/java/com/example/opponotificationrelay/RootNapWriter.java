package com.example.opponotificationrelay;

import android.database.Cursor;
import android.os.SystemClock;
import java.io.*;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.*;

/** 只读数据库快照 + 官方云保存接口；没有 SQL UPDATE/INSERT 路径。 */
final class RootNapWriter {
    static NapWritePolicy.State snapshot(Object db,String account,byte[] key)throws Exception {
        String[] names=RootOfficialSettingsReader.NAP;
        Map<String,String[]> rows=new TreeMap<>();
        try(Cursor c=RootOfficialSettingsReader.query(db,
            "SELECT _id,preference_key,preference_value,module,sync_status,create_time,modified_time FROM DBUserPreference WHERE ssoid=? AND preference_key IN (?,?,?) LIMIT 7",
            new String[]{account,names[0],names[1],names[2]})) {
            while(c.moveToNext()) {
                String name=c.getString(1),value=c.getString(2);
                if(!Arrays.asList(names).contains(name) || rows.containsKey(name))throw new IOException("NAP_DUPLICATE");
                boolean valid=value!=null && (names[0].equals(name)?value.matches("[01]"):
                    names[1].equals(name)?value.matches("(?:[01][0-9]|2[0-3]):[0-5][0-9]"):
                    value.matches("[0-9]{1,4}")&&Integer.parseInt(value)>0&&Integer.parseInt(value)<1440);
                if(!valid)throw new IOException("NAP_INVALID");
                String[] fields=new String[7];
                for(int i=0;i<7;i++)fields[i]=c.isNull(i)?null:c.getString(i);
                if(c.isNull(0)||c.isNull(4)||c.isNull(5)||c.isNull(6))throw new IOException("NAP_METADATA");
                rows.put(name,fields);
            }
        }
        if(rows.size()!=3)throw new IOException("NAP_INCOMPLETE");
        ByteArrayOutputStream buffer=new ByteArrayOutputStream();
        try(DataOutputStream out=new DataOutputStream(buffer)) {
            out.writeUTF("oppo-nap-revision-v1-db66");out.writeUTF(account);
            for(String[] row:rows.values())for(String value:row) {
                out.writeBoolean(value!=null);if(value!=null)out.writeUTF(value);
            }
        }
        byte[] raw=buffer.toByteArray(),digest;
        try {
            Mac mac=Mac.getInstance("HmacSHA256");mac.init(new SecretKeySpec(key,"HmacSHA256"));digest=mac.doFinal(raw);
        } finally {Arrays.fill(raw,(byte)0);}
        StringBuilder token=new StringBuilder();for(byte b:digest)token.append(String.format(Locale.ROOT,"%02x",b&255));
        Arrays.fill(digest,(byte)0);
        String time=rows.get(names[1])[2];int start=Integer.parseInt(time.substring(0,2))*60+Integer.parseInt(time.substring(3));
        OfficialSettingsPreview.Nap nap=new OfficialSettingsPreview.Nap("1".equals(rows.get(names[0])[2]),start,
            Integer.parseInt(rows.get(names[2])[2]),token.toString());
        return new NapWritePolicy.State(nap,nap.revision);
    }
    static JSONObject json(NapWritePolicy.State state)throws Exception {
        OfficialSettingsPreview.Nap n=state.nap;
        return new JSONObject().put("status","OK").put("enabled",n.enabled).put("start",n.start).put("duration",n.duration).put("revision",state.revision);
    }
    static void accountUnchanged(byte[] key,String expected)throws Exception {
        Map<String,byte[]> values=RootOfficialSettingsReader.mmkv("health_share_preference",key,Collections.singleton("user_ssoid_encode"));
        try {
            if(!Objects.equals(expected,MmkvSnapshot.string(values,"user_ssoid_encode")))throw new IOException("ACCOUNT_CHANGED");
        } finally {RootOfficialSettingsReader.snapshots.remove(values);MmkvSnapshot.wipe(values);}
    }
    static JSONObject save(Object db,String account,byte[] key,byte[] mmkvKey,String encoded,JSONObject request)throws Exception {
        if(request.length()!=6 || !"NAP_SAVE".equals(request.getString("operation")))throw new IOException("WRITE_ARGUMENT");
        String revision=request.getString("revision");
        if(!revision.matches("[a-f0-9]{64}"))throw new IOException("WRITE_ARGUMENT");
        int start=request.getInt("start"),end=request.getInt("end");
        if(start<0 || end>=1440 || start>=end)throw new IOException("NAP_RANGE");
        NapWritePolicy.State target=new NapWritePolicy.State(new OfficialSettingsPreview.Nap(request.getBoolean("enabled"),start,end-start),revision);
        NapWritePolicy.Port port=new NapWritePolicy.Port() {
            OfficialNapBridge bridge;
            public NapWritePolicy.State read()throws Exception {
                accountUnchanged(mmkvKey,encoded);
                NapWritePolicy.State state=snapshot(db,account,key);
                accountUnchanged(mmkvKey,encoded);
                return state;
            }
            public void prepare()throws Exception {bridge=OfficialNapBridge.connect(RootOfficialSettingsReader.uid);}
            public NapWritePolicy.Ack send(int field,String value)throws Exception {
                accountUnchanged(mmkvKey,encoded);
                return bridge.send(account,RootOfficialSettingsReader.NAP[field],value);
            }
            public long now(){return SystemClock.elapsedRealtime();}
            public void pause()throws Exception{Thread.sleep(250);}
        };
        NapWritePolicy.Result result=NapWritePolicy.run(port,revision,target,request.getLong("expires"));
        return new JSONObject().put("status",result.status.name()).put("code",result.code).put("attempted",result.attempted)
            .put("confirmed",result.confirmed).put("matching",result.matching);
    }
}
