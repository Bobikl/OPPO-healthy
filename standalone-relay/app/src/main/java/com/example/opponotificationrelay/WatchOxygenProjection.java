package com.example.opponotificationrelay;
import java.io.IOException;
import java.util.*;
/** CID 85 encodes seconds in bits 2..7 and saturation minus 69 in bits 3..7. */
final class WatchOxygenProjection {
    static TreeMap<Long,Integer> minute(long minute,HealthProto.Node row)throws IOException {
        byte[] offsets=row.bytes(2),values=row.bytes(3);if(offsets==null||values==null||offsets.length!=values.length)throw new IOException("SYNC_OXYGEN_SHAPE");
        TreeMap<Long,Integer> out=new TreeMap<>();for(int i=0;i<values.length;i++){int packed=(values[i]&255)>>>3;if(packed==0)continue;int seconds=(offsets[i]&255)>>>2,value=packed+69;if(seconds>59)throw new IOException("SYNC_OXYGEN_TIME");if(value>100)continue;out.put(minute+seconds*1000L,value);}return out;
    }
}
