package com.example.opponotificationrelay;
import java.time.*;
import org.json.*;
import java.io.IOException;

/** Conversions match the pinned 6.6.7 ActivityDataRepository and heart-rate repository. */
final class CloudNativeProjection {
    static JSONObject project(String stream,String account,String device,long seconds,long received,byte[] body,String zone,String model)throws Exception {
        if(!model.equals("OWW251"))return null;
        HealthProto.Node raw=HealthProto.parse(body);long stamp=Math.multiplyExact(seconds,1000);
        JSONObject out=new JSONObject().put("ssoid",account).put("deviceUniqueId",device).put("display",1);
        switch(stream){
            case "heart":
                int bpm=raw.number(2,0);if(bpm<=0||bpm>300)return null;
                return out.put("dataCreatedTimestamp",stamp).put("heartRateValue",bpm).put("heartRateType",raw.number(4,0)).put("reliability",raw.number(3,0));
            case "activity-detail":
                return out.put("startTimestamp",stamp).put("endTimestamp",Math.addExact(stamp,60000))
                    .put("calories",Math.multiplyExact((long)raw.number(2,0),1000)).put("distance",raw.number(3,0))
                    .put("altitudeOffset",raw.number(4,0)).put("sportMode",raw.number(5,0)).put("workout",raw.number(6,0)==0?0:1)
                    .put("steps",raw.number(7,0)).put("timezone",ZoneId.of(zone).getId());
            case "activity-stat":
                LocalDate day=Instant.ofEpochMilli(stamp).atZone(ZoneId.of(zone)).toLocalDate();
                return out.put("date",Integer.parseInt(day.toString().replace("-",""))).put("sportMode",-3)
                    .put("startTimestamp",day.atTime(LocalTime.MIN).atZone(ZoneId.of(zone)).toInstant().toEpochMilli())
                    .put("endTimestamp",day.atTime(LocalTime.MAX).atZone(ZoneId.of(zone)).toInstant().toEpochMilli())
                    .put("totalSteps",raw.number(3,0)).put("totalDistance",raw.number(4,0))
                    .put("totalCalories",Math.multiplyExact((long)raw.number(2,0),1000))
                    .put("totalAltitudeOffset",Math.multiplyExact(raw.number(5,0),30)).put("totalWorkoutMinutes",raw.number(6,0))
                    .put("totalMoveAboutTimes",raw.number(7,0)).put("totalStaticCal",Math.multiplyExact((long)raw.number(8,0),1000))
                    .put("sedentaryCounts",raw.number(9,0)).put("sedentaryTime",raw.number(10,0)).put("updateTimestamp",received);
            default:return null;
        }
    }
}
