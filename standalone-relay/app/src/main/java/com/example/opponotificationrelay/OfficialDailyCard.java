package com.example.opponotificationrelay;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.*;
import android.view.*;
import android.widget.*;
import com.heytap.health.core.widget.charts.HealthBarChart;
import java.time.LocalDate;
/** Inflates the unmodified original card XML; only cache values and navigation are adapted. */
final class OfficialDailyCard {
    static View create(Context host,HealthMetricsData data,LocalDate date,int metric,int amount,int goal,Runnable open) {
        Context c=OfficialUiResources.wrap(host);
        String[] layouts={"step","calories","time","active"};
        View card=LayoutInflater.from(c).inflate(OfficialUiResources.id(c,"layout","health_daily_"+layouts[metric]+"_item"),null,false);
        String[] amounts={"step","consumption","exercise_time","sport_times"};
        TextView value=card.findViewById(OfficialUiResources.id(c,"id","tv_daily_detail_"+amounts[metric]));
        TextView title=card.findViewById(OfficialUiResources.id(c,"id","tv_daily_detail_"+amounts[metric]+"_title"));
        title.setTextColor(0xffdddddd);value.setTextColor(0xffa6a6a6);
        String[] strings={"step","consumption","exercise_time","sport_times"};
        String label=amount>=0&&goal>0?c.getString(OfficialUiResources.id(c,"string","health_daily_detail_"+strings[metric]),amount,goal):"— / —";
        SpannableString styled=new SpannableString(label);int slash=label.indexOf('/');if(slash<0)slash=label.length();
        styled.setSpan(new ForegroundColorSpan(c.getColor(OfficialUiResources.id(c,"color","lib_base_colorBlack"))),0,slash,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styled.setSpan(new AbsoluteSizeSpan(Math.round(26*c.getResources().getDisplayMetrics().scaledDensity)),0,slash,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        styled.setSpan(new StyleSpan(Typeface.NORMAL),0,slash,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);value.setText(styled);
        String[] charts={"step","consumption","exercise_time","sport_active"};
        HealthBarChart chart=card.findViewById(OfficialUiResources.id(c,"id","view_daily_detail_"+charts[metric]+"_chart"));
        ActivityHistogram.bind(chart,data,date,metric);
        if(open!=null){title.setOnClickListener(v->open.run());value.setOnClickListener(v->open.run());String arrow=metric==0?"iv_step_arrow_right":"iv_consumption_arrow_right";ImageView image=card.findViewById(OfficialUiResources.id(c,"id",arrow));image.setImageDrawable(c.getDrawable(OfficialUiResources.id(c,"drawable","lib_base_right_arrow")));image.setOnClickListener(v->open.run());image.setContentDescription(title.getText()+"，查看详情");}
        return card;
    }
}
