package com.example.opponotificationrelay;
import android.content.Context;
import android.widget.ImageView;
/** Official lib_base_ic_last / lib_base_ic_next vectors include their circle and exact chevron. */
final class HealthDateArrow extends ImageView {
    HealthDateArrow(Context c,boolean forward){super(c);setFocusable(true);setScaleType(ScaleType.FIT_CENTER);setImageResource(forward?R.drawable.official_date_next:R.drawable.official_date_previous);setForceDarkAllowed(false);}
}
