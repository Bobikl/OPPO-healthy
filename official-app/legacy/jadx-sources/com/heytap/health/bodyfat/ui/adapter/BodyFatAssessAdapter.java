package com.heytap.health.bodyfat.ui.adapter;

import android.widget.TextView;
import com.heytap.databaseengine.model.weight.WeightLabel;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.bodyfat.R$id;
import com.heytap.health.bodyfat.R$layout;
import com.oplus.aiunit.vision.c12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class BodyFatAssessAdapter extends BaseRecyclerAdapter<WeightLabel> {
    public BodyFatAssessAdapter() {
        super(new ArrayList(), R$layout.health_body_fat_assess_item);
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(BaseViewHolder baseViewHolder, int i) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_name);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_numerical);
        TextView textView3 = (TextView) baseViewHolder.getView(R$id.tv_unit);
        TextView textView4 = (TextView) baseViewHolder.getView(R$id.tv_result);
        WeightLabel weightLabel = (WeightLabel) this.i.get(i);
        textView.setText(weightLabel.getLabel());
        textView2.setText(l(weightLabel.getLabelValue()));
        textView3.setText(weightLabel.getLabelUnit());
        textView4.setText(weightLabel.getLabelLevelName());
        c12.b(textView4, weightLabel.getLabelLevelName(), false);
    }

    public final String l(double d) {
        return ((double) Math.round(d)) - d == 0.0d ? String.valueOf((long) d) : String.valueOf(d);
    }

    public final List<WeightLabel> m(List<WeightLabel> list) {
        HashMap map = new HashMap();
        for (WeightLabel weightLabel : list) {
            if (weightLabel.getLabel() != null) {
                String label = weightLabel.getLabel();
                label.hashCode();
                switch (label) {
                    case "BMI":
                        map.put(0, weightLabel);
                        break;
                    case "骨量":
                        map.put(10, weightLabel);
                        break;
                    case "体脂率":
                        map.put(1, weightLabel);
                        break;
                    case "水分率":
                        map.put(9, weightLabel);
                        break;
                    case "肌肉率":
                        map.put(6, weightLabel);
                        break;
                    case "肌肉量":
                        map.put(7, weightLabel);
                        break;
                    case "脂肪量":
                        map.put(3, weightLabel);
                        break;
                    case "蛋白质":
                        map.put(11, weightLabel);
                        break;
                    case "骨骼肌":
                        map.put(8, weightLabel);
                        break;
                    case "基础代谢量":
                        map.put(12, weightLabel);
                        break;
                    case "去脂体重":
                        map.put(5, weightLabel);
                        break;
                    case "身体年龄":
                        map.put(2, weightLabel);
                        break;
                    case "内脏脂肪等级":
                        map.put(4, weightLabel);
                        break;
                    default:
                        map.put(13, weightLabel);
                        break;
                }
            }
        }
        return new ArrayList(map.values());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(List<WeightLabel> list) {
        this.i.clear();
        this.i.addAll(m(list));
        notifyDataSetChanged();
    }
}
