package com.example.opponotificationrelay;
import android.database.Cursor;import android.net.Uri;import org.json.*;import java.util.*;
/** Bounded read-only projection of public article metadata from the official cache. */
final class RootKnowledgeReader {
 static String safeUrl(String value){try{Uri u=Uri.parse(value);if(("https".equalsIgnoreCase(u.getScheme())||"http".equalsIgnoreCase(u.getScheme()))&&u.getHost()!=null&&u.getUserInfo()==null&&value.length()<=4096)return value;}catch(Exception ignored){}return "";}
 static JSONArray read(Object db)throws Exception{JSONArray out=new JSONArray();try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT name FROM sqlite_master WHERE type='table' AND name='DBSpaceInfo'",new String[0])){if(!c.moveToFirst())return out;}
  Set<String> seen=new HashSet<>();try(Cursor c=RootOfficialSettingsReader.query(db,"SELECT page_code,card_code,container_title,display_startTime,display_endTime,materielList FROM DBSpaceInfo WHERE page_code IN ('2005','2006','2007','2008','2011','2014','2021') ORDER BY priority DESC,_id DESC LIMIT 201",new String[0])){
   int count=0;while(c.moveToNext()&&++count<=200){String raw=c.getString(5);if(raw==null||raw.length()>200000)continue;JSONArray materials;try{materials=new JSONArray(raw);}catch(JSONException e){continue;}
    for(int i=0;i<Math.min(materials.length(),30)&&out.length()<120;i++){JSONObject m=materials.optJSONObject(i);if(m==null)continue;String title=m.optString("materielTitle","").trim(),description=m.optString("materielDesc",m.optString("materielSubTitle","")),url=safeUrl(m.optString("jumpUrl",""));if(title.isEmpty()||title.length()>200||description.length()>2000||url.isEmpty()||!seen.add(c.getString(0)+"|"+url))continue;
     out.put(new JSONArray().put(out.length()+1).put(c.getString(0)).put(c.isNull(1)?"":c.getString(1)).put(title).put(description).put(url).put(c.getLong(3)).put(c.getLong(4)));
    }
   }
  }return out;
 }
}
