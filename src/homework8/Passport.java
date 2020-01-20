package homework8;

import java.util.Date;
import java.util.Objects;

public class Passport {
    private String id;
    private Date effectiveAt;
    private String fio;

    public Passport(String id, Date effectiveAt, String fio){
        this.id = id;
        this.effectiveAt = effectiveAt;
        this.fio = fio;
    }





    @Override
    public String toString() {
        return "Passport{" +
                "id='" + id + '\'' +
                ", effectiveAt=" + effectiveAt +
                ", fio='" + fio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(id, passport.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
