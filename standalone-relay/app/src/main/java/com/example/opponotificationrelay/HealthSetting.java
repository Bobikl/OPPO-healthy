package com.example.opponotificationrelay;

/** Official 6.6.7 watch setting ranges, not recommended medical thresholds. */
public enum HealthSetting {
    STEP(0,"步数目标","每日步数",1,0,1,172,2000,20000,1000,"步"),
    CALORIE(0,"活动消耗目标","每日活动消耗",2,0,1,173,100,2000,100,"千卡"),
    EXERCISE(0,"锻炼时长目标","每日锻炼时长",3,0,1,174,5,60,5,"分钟"),
    ACTIVITY(0,"活动次数目标","每日活动次数",4,0,1,175,3,12,1,"次"),
    SEDENTARY(0,"久坐提醒","提醒起身活动",5,1,1,176),
    LUNCH(0,"午休时段免打扰","久坐提醒在午休时段暂停",5,2,1,176),
    RESUME(0,"活动后继续提醒","恢复活动提醒",5,3,1,177),
    GOAL_NOTICE(0,"目标达成提醒","达到每日活动目标时提醒",6,0,1,178),
    DAILY_REPORT(0,"每日活动报告","查看每天的活动完成情况",7,0,1,178),
    WEEKLY_REPORT(0,"每周活动报告","查看一周的活动完成情况",8,0,1,178),
    HEART_AUTO(1,"自动监测心率","由手表持续监测心率",10,0,1,180),
    HEART_TYPE(1,"监测方式","选择心率自动监测方式",10,0,2,180,3,4,1,""),
    QUIET(1,"静息心率预警","静息心率超过设置的范围时提醒",11,0,1,181),
    QUIET_HIGH(1,"静息心率过高","预警上限",11,0,2,181,100,150,10,"次/分钟"),
    QUIET_LOW(1,"静息心率过低","预警下限",11,0,3,181,40,50,1,"次/分钟"),
    SPORT(1,"运动心率预警","运动心率超过设置的上限时提醒",12,0,1,182),
    SPORT_HIGH(1,"运动心率上限","运动心率预警阈值",12,0,2,182,100,220,1,"次/分钟"),
    IRREGULAR(1,"心律不齐提醒","手表支持时自动监测并提醒",13,0,1,183),
    OXYGEN(2,"全天血氧监测","自动监测血氧饱和度",15,0,1,186),
    OXYGEN_WARN(2,"低血氧提醒","血氧低于设定值时提醒",16,0,1,187),
    OXYGEN_LOW(2,"低血氧阈值","选择提醒阈值",16,0,2,187,80,90,5,"%"),
    MIND(3,"身心状态自动监测","由手表自动监测身心状态",14,1,1,184),
    MIND_NOTICE(3,"身心状态提醒","手表根据监测结果发出提醒",14,2,1,185),
    APNEA(4,"睡眠呼吸暂停监测","睡眠时监测呼吸情况",17,0,1,188),
    BREATH(4,"睡眠呼吸率监测","监测睡眠时的呼吸率",18,0,1,189),
    REM(4,"快速眼动睡眠监测","监测快速眼动睡眠阶段",19,0,1,190);

    public static final String[] CATEGORIES={"每日活动","心率","血氧","身心状态","睡眠"};
    public final int category,group,child,field,cid,min,max,step;
    public final String label,hint,unit;
    public final boolean toggle;
    HealthSetting(int category,String label,String hint,int group,int child,int field,int cid){this(category,label,hint,group,child,field,cid,0,1,1,"");}
    HealthSetting(int category,String label,String hint,int group,int child,int field,int cid,int min,int max,int step,String unit){
        this.category=category;this.label=label;this.hint=hint;this.group=group;this.child=child;this.field=field;this.cid=cid;this.min=min;this.max=max;this.step=step;this.unit=unit;toggle=min==0 && max==1;
    }
    public boolean valid(int value){return value>=min && value<=max && (value-min)%step==0;}
    public String display(int value){if(toggle)return value==1?"已开启":"已关闭";if(this==HEART_TYPE)return value==3?"智能监测":value==4?"实时监测":"模式 "+value;return value+(unit.equals("%")?"":" ")+unit;}
    public HealthSetting parent(){switch(this){case LUNCH:return SEDENTARY;case HEART_TYPE:return HEART_AUTO;case QUIET_HIGH:case QUIET_LOW:return QUIET;case SPORT_HIGH:return SPORT;case OXYGEN_WARN:return OXYGEN;case OXYGEN_LOW:return OXYGEN_WARN;case MIND_NOTICE:return MIND;default:return null;}}
}