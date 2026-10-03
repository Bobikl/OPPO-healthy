package com.example.opponotificationrelay;

import java.io.IOException;
import java.time.*;
import java.util.*;

/** Daily totals on the wire are steps, active kcal, workout minutes and move counts. */
public final class DailyActivityData {
    public final int timestamp,steps,calories,minutes,moves;
    public final int stepGoal,calorieGoal,minuteGoal,moveGoal;
    public final long savedAt;
    public DailyActivityData(int timestamp,int steps,int calories,int minutes,int moves,int sg,int cg,int mg,int ag,long savedAt){
        this.timestamp=timestamp;this.steps=steps;this.calories=calories;this.minutes=minutes;this.moves=moves;
        stepGoal=sg;calorieGoal=cg;minuteGoal=mg;moveGoal=ag;this.savedAt=savedAt;
    }
    public static DailyActivityData parse(HealthProto.Node row,Map<HealthSetting,Integer> goals,long savedAt)throws IOException{
        return new DailyActivityData(row.number(1,0),row.number(3,0),row.number(2,0),row.number(6,0),row.number(7,0),
            goal(goals,HealthSetting.STEP),goal(goals,HealthSetting.CALORIE),goal(goals,HealthSetting.EXERCISE),goal(goals,HealthSetting.ACTIVITY),savedAt);
    }
    // OWW251 firmware extension: fields 12..15, enabled only after agreement with live CID 197 goals.
    static int[] wireGoals(HealthProto.Node row)throws IOException{
        HealthSetting[] keys={HealthSetting.STEP,HealthSetting.CALORIE,HealthSetting.EXERCISE,HealthSetting.ACTIVITY};int[] values=new int[4];
        for(int i=0;i<4;i++){if(!row.has(12+i))return null;values[i]=row.number(12+i,0);if(!keys[i].valid(values[i]))return null;}return values;
    }
    static boolean wireGoalsMatch(HealthProto.Node row,Map<HealthSetting,Integer> current)throws IOException{
        int[] wire=wireGoals(row);if(wire==null)return false;HealthSetting[] keys={HealthSetting.STEP,HealthSetting.CALORIE,HealthSetting.EXERCISE,HealthSetting.ACTIVITY};
        for(int i=0;i<4;i++)if(!Integer.valueOf(wire[i]).equals(current.get(keys[i])))return false;return true;
    }
    static DailyActivityData parse(HealthProto.Node row,Map<HealthSetting,Integer> goals,long savedAt,boolean verifiedWireGoals)throws IOException{
        int[] wire=verifiedWireGoals?wireGoals(row):null;if(wire==null)return parse(row,goals,savedAt);
        return new DailyActivityData(row.number(1,0),row.number(3,0),row.number(2,0),row.number(6,0),row.number(7,0),wire[0],wire[1],wire[2],wire[3],savedAt);
    }
    private static int goal(Map<HealthSetting,Integer> goals,HealthSetting key){Integer n=goals.get(key);return n==null||n<=0?-1:n;}
    public static String day(int seconds){return Instant.ofEpochSecond(seconds).atZone(ZoneId.systemDefault()).toLocalDate().toString();}
    public float progress(int index){int[] n={steps,calories,minutes,moves},g={stepGoal,calorieGoal,minuteGoal,moveGoal};return g[index]>0?Math.max(0,Math.min(1,n[index]/(float)g[index])):0;}
}