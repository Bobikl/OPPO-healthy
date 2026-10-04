package com.example.opponotificationrelay;
import android.content.Context;
import java.util.*;
/** Stable local tile identities; preserve known positions and append newly supported cards. */
final class HomeCardOrder {
 static final int[] DEFAULT={0,1,3,2,4,5,6,7,8,9,10};
 static final String PREFS="health_home_cards",KEY="order";
 static List<Integer> normalize(String encoded){
  LinkedHashSet<Integer> ids=new LinkedHashSet<>();
  if(encoded!=null&&encoded.length()<1024)for(String part:encoded.split(","))try{int id=Integer.parseInt(part.trim());if(id>=0&&id<=10)ids.add(id);}catch(NumberFormatException ignored){}
  for(int id:DEFAULT)ids.add(id);return new ArrayList<>(ids);
 }
 static List<Integer> load(Context c){return normalize(c.getSharedPreferences(PREFS,0).getString(KEY,""));}
 static String encode(List<Integer> order){StringBuilder out=new StringBuilder();for(int id:order){if(out.length()>0)out.append(',');out.append(id);}return out.toString();}
 static boolean save(Context c,List<Integer> order){return c.getSharedPreferences(PREFS,0).edit().putString(KEY,encode(normalize(encode(order)))).commit();}
 static String title(int id){return new String[]{"健康趋势","心率","睡眠","血氧","手腕温度","身心状态","放松","日照","体重","血糖","睡眠呼吸暂停"}[id];}
}
