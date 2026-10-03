package j$.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class DesugarLocalDate {
    public static final LocalDate EPOCH = LocalDate.of(1970, 1, 1);

    public static LocalDate ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, com.oplus.instant.router.Instant.HOST_INSTANT);
        Objects.requireNonNull(zoneId, "zone");
        return LocalDate.ofEpochDay(Math.floorDiv(instant.getEpochSecond() + ((long) zoneId.getRules().getOffset(instant).getTotalSeconds()), 86400L));
    }
}
