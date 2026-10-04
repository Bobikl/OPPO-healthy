package com.example.opponotificationrelay;
import android.content.*;
import android.database.Cursor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import org.json.*;

/** Fixed-build DTO/SQL mapping; unknown wire fields remain in the durable raw record. */
final class CloudStream {
    final JSONObject definition,mapping,wireTypes;
    final JSONArray fields,keys;
    final String id,title,table,version,pull,push,category;
    CloudStream(JSONObject d)throws Exception {
        definition=d;mapping=d.getJSONObject("mapping");fields=d.getJSONArray("fields");keys=d.getJSONArray("keys");
        wireTypes=d.getJSONObject("wireTypes");id=d.getString("id");title=d.getString("title");table=d.getString("table");
        version=d.getString("version");pull=d.getString("pull");push=d.getString("push");category=d.getString("category");
    }
    static String asset(Context context,String path)throws Exception {
        try(InputStream in=context.getApplicationContext().getAssets().open(path);ByteArrayOutputStream out=new ByteArrayOutputStream()){
            byte[] b=new byte[8192];int n;while((n=in.read(b))!=-1){if(out.size()+n>4*1024*1024)throw new IOException("CLOUD_ASSET_LIMIT");out.write(b,0,n);}
            return out.toString(StandardCharsets.UTF_8.name());
        }
    }
    static List<CloudStream> all(Context c)throws Exception {
        JSONArray array=new JSONArray(asset(c,"cloud-streams.json"));List<CloudStream> result=new ArrayList<>();
        for(int i=0;i<array.length();i++)result.add(new CloudStream(array.getJSONObject(i)));return result;
    }
    String field(String column)throws Exception {Iterator<String> i=mapping.keys();while(i.hasNext()){String f=i.next();if(mapping.getString(f).equals(column))return f;}return null;}
    JSONArray expanded(JSONArray source)throws Exception {
        JSONObject group=definition.optJSONObject("group");if(group==null)return source;
        JSONArray result=new JSONArray();
        for(int i=0;i<source.length();i++){
            JSONObject parent=source.getJSONObject(i);String array=group.getString("array");
            JSONArray children=parent.optJSONArray(array);if(children==null)throw new IOException("CLOUD_GROUP_SHAPE");
            if(children.length()>20000-result.length())throw new IOException("CLOUD_RECORD_LIMIT");
            for(int j=0;j<children.length();j++){
                JSONObject row=new JSONObject(parent.toString());row.remove(array);
                JSONObject child=children.getJSONObject(j);
                Iterator<String> names=child.keys();while(names.hasNext()){String name=names.next();row.put(name,child.get(name));}
                JSONObject rename=group.optJSONObject("rename");
                if(rename!=null){names=rename.keys();while(names.hasNext()){String name=names.next();if(child.has(name))row.put(rename.getString(name),child.get(name));}}
                JSONObject offsets=group.optJSONObject("offsets");
                if(offsets!=null){
                    long base=parent.getLong("startTimestamp");names=offsets.keys();
                    while(names.hasNext()){String name=names.next();row.put(offsets.getString(name),Math.addExact(base,child.getLong(name)));}
                }
                JSONObject fixed=group.optJSONObject("fixed");
                if(fixed!=null){names=fixed.keys();while(names.hasNext()){String name=names.next();row.put(name,fixed.get(name));}}
                result.put(row);
            }
        }
        return result;
    }
    JSONObject decoded(JSONObject original,String account,CloudCrypto crypto)throws Exception {
        JSONObject row=new JSONObject(original.toString());String owner=row.optString("ssoid");
        if(!owner.isEmpty()&&!account.equals(owner))throw new IOException("CLOUD_ACCOUNT_MISMATCH");
        for(String key:new String[]{"deviceUniqueId","dataClient"})if(row.has(key)&&!row.isNull(key))row.put(key,crypto.client(row.getString(key),false));
        return row;
    }
    ContentValues values(JSONObject row,String account,boolean defaults)throws Exception {
        for(int i=0;i<keys.length();i++){
            String column=keys.getString(i);if(column.equals("ssoid")||id.equals("hrv")&&column.equals("hrv_type"))continue;
            String field=field(column);if(field==null||!row.has(field)||row.isNull(field))throw new IOException("CLOUD_IDENTITY_MISSING");
        }
        ContentValues out=new ContentValues();
        if(defaults)for(int i=0;i<fields.length();i++){
            JSONObject f=fields.getJSONObject(i);String col=f.getString("column"),type=f.getString("type");
            if(f.optBoolean("auto"))continue;
            if(f.optBoolean("required")){if(type.length()==1)out.put(col,0);else out.put(col,"");}
        }
        Iterator<String> names=mapping.keys();while(names.hasNext()){
            String name=names.next();if(!row.has(name))continue;
            String column=mapping.getString(name);Object v=row.get(name);
            if(v==JSONObject.NULL){
                boolean primitive=false,requiredText=false;
                for(int i=0;i<fields.length();i++){JSONObject f=fields.getJSONObject(i);if(f.getString("column").equals(column)&&f.optBoolean("required")){primitive=f.getString("type").length()==1;requiredText=f.getString("type").equals("Ljava/lang/String;");}}
                // Gson leaves Java primitive fields at their constructor value for JSON null.
                // The raw record retains null; only the official-schema projection uses its primitive default.
                if(primitive){if(defaults)out.put(column,0);}else if(requiredText){if(defaults)out.put(column,"");}else out.putNull(column);
            }
            else if(v instanceof Boolean)out.put(column,(Boolean)v?1:0);
            else if(v instanceof Integer||v instanceof Long)out.put(column,((Number)v).longValue());
            else if(v instanceof Number)out.put(column,((Number)v).doubleValue());
            else out.put(column,v.toString());
        }
        out.put("ssoid",account);if(has("sync_status"))out.put("sync_status",1);
        if(has("updated"))out.put("updated",0);
        // HRV cloud format has a single type; the official converter leaves hrvType at 0.
        if(id.equals("hrv"))out.put("hrv_type",0);
        return out;
    }
    boolean has(String col)throws Exception {for(int i=0;i<fields.length();i++)if(fields.getJSONObject(i).getString("column").equals(col))return true;return false;}
    String identity(ContentValues row)throws Exception {
        JSONArray key=new JSONArray();for(int i=0;i<keys.length();i++){
            String col=keys.getString(i);Object value=row.get(col);
            if(value==null)throw new IOException("CLOUD_IDENTITY_MISSING");
            key.put(value);
        }
        return HealthArchive.hash(key.toString().getBytes(StandardCharsets.UTF_8));
    }
    String where()throws Exception {List<String> parts=new ArrayList<>();for(int i=0;i<keys.length();i++)parts.add(OfficialHistoryStore.q(keys.getString(i))+" IS ?");return String.join(" AND ",parts);}
    String[] arguments(ContentValues row)throws Exception {String[] args=new String[keys.length()];for(int i=0;i<args.length;i++)args[i]=row.getAsString(keys.getString(i));return args;}
    long modified(JSONObject row){return row.optLong("modifiedTimestamp",row.optLong("modifiedTime",0));}
    String modifiedColumn()throws Exception {return has("modified_timestamp")?"modified_timestamp":has("modified_time")?"modified_time":"";}
    JSONObject fromCursor(Cursor row)throws Exception {
        JSONObject out=new JSONObject();Iterator<String> names=mapping.keys();while(names.hasNext()){
            String name=names.next(),column=mapping.getString(name);int pos=row.getColumnIndex(column);
            if(pos<0)throw new IOException("CLOUD_SCHEMA_CHANGED");
            if(row.isNull(pos))continue;
            String type=wireTypes.optString(name);
            if(type.equals("Z")||type.equals("Ljava/lang/Boolean;"))out.put(name,row.getLong(pos)!=0);
            else if(type.equals("D")||type.equals("F")||type.equals("Ljava/lang/Float;")||type.equals("Ljava/lang/Double;"))out.put(name,row.getDouble(pos));
            else if(type.length()==1||type.equals("Ljava/lang/Integer;")||type.equals("Ljava/lang/Long;"))out.put(name,row.getLong(pos));
            else if(type.equals("Ljava/util/List;")){String value=row.getString(pos);if(!value.isEmpty())out.put(name,new JSONArray(value));}
            else out.put(name,row.getString(pos));
        }
        JSONObject defaults=definition.optJSONObject("defaults");
        if(defaults!=null){Iterator<String> it=defaults.keys();while(it.hasNext()){String n=it.next();if(!out.has(n))out.put(n,defaults.get(n));}}
        return out;
    }
    JSONObject encoded(JSONObject original,CloudCrypto crypto)throws Exception {
        JSONObject row=new JSONObject(original.toString());
        for(String key:new String[]{"deviceUniqueId","dataClient"})if(row.has(key)&&!row.isNull(key))row.put(key,crypto.client(row.getString(key),true));
        return row;
    }
    JSONObject uploadRow(JSONObject original,CloudCrypto crypto)throws Exception {
        JSONObject group=definition.optJSONObject("group");
        if(group==null){
            JSONObject out=new JSONObject();Iterator<String> names=mapping.keys();
            while(names.hasNext()){String name=names.next();if(original.has(name))out.put(name,original.get(name));}
            return encoded(out,crypto);
        }
        JSONObject parent=new JSONObject(),child=new JSONObject();
        for(String name:new String[]{"dataClient","clientModel"})if(original.has(name))parent.put(name,original.get(name));
        JSONObject rename=group.optJSONObject("rename"),offsets=group.optJSONObject("offsets");
        Set<String> converted=new HashSet<>();
        if(rename!=null){Iterator<String> names=rename.keys();while(names.hasNext()){String wire=names.next(),local=rename.getString(wire);converted.add(local);if(original.has(local))child.put(wire,original.get(local));}}
        if(offsets!=null){
            String start=offsets.getString("startTimeOffset");long base=original.getLong(start);
            parent.put("startTimestamp",base);long end=base;
            Iterator<String> names=offsets.keys();while(names.hasNext()){String wire=names.next(),local=offsets.getString(wire);long value=original.getLong(local);converted.add(local);long offset=Math.subtractExact(value,base);if(offset<Integer.MIN_VALUE||offset>Integer.MAX_VALUE)throw new IOException("CLOUD_OFFSET_RANGE");child.put(wire,offset);end=Math.max(end,value);}
            parent.put("endTimestamp",end);
        }
        String[] permitted=id.equals("mental")?new String[]{"type","stress","stressState","display"}:
            id.equals("wrist")?new String[]{"confidence","status"}:
            id.equals("sunshine")?new String[]{"lightIntensity","sunBathing","display"}:
            new String[]{"date","totalDuration","targetDuration","vitaminD","avgVD","goalComplete"};
        for(String name:permitted)if(original.has(name))child.put(name,original.get(name));
        parent.put(group.getString("array"),new JSONArray().put(child));
        return encoded(parent,crypto);
    }
    Object uploadRequest(JSONObject row,CloudCrypto crypto)throws Exception {
        JSONArray rows=new JSONArray().put(uploadRow(row,crypto));String wrapper=definition.optString("wrapper");
        return wrapper.isEmpty()?rows:new JSONObject().put(wrapper,rows);
    }
    JSONObject versionRequest(long cursor)throws Exception {return new JSONObject().put(definition.getString("versionField"),cursor).put("queryFlag",0);}
    JSONObject pullRequest(long version)throws Exception {
        return definition.optBoolean("range")?new JSONObject().put("startModifiedTimestamp",version-1).put("endModifiedTimestamp",version+1):
            new JSONObject().put(definition.getString("pullField"),version);
    }
    JSONArray records(Object body)throws Exception {
        if(body instanceof JSONArray)return (JSONArray)body;
        if(!(body instanceof JSONObject))throw new IOException("CLOUD_RESPONSE_SHAPE");
        JSONObject page=(JSONObject)body;
        if(page.optInt("hasMore",0)!=0)throw new IOException("CLOUD_ENTITY_PAGE_INCOMPLETE");
        if(page.has("dataList"))return page.getJSONArray("dataList");
        if(page.has("resultList"))return page.getJSONArray("resultList");
        throw new IOException("CLOUD_RESPONSE_SHAPE");
    }
}
