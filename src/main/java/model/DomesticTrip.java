package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class DomesticTrip extends Trip{
    private BigDecimal selfAproachDiscount;

    public DomesticTrip(LocalDate startOfTrip, LocalDate endOfTrip, String destiny, BigDecimal price, BigDecimal selfAproachDiscount) {
        super(startOfTrip, endOfTrip, destiny, price);
        this.selfAproachDiscount = selfAproachDiscount;
    }

    public BigDecimal getSelfAproachDiscount() {
        return selfAproachDiscount;
    }

    public void setSelfAproachDiscount(BigDecimal selfAproachDiscount) {
        this.selfAproachDiscount = selfAproachDiscount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", include discount (" + this.selfAproachDiscount + "$)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DomesticTrip that = (DomesticTrip) o;
        return Objects.equals(selfAproachDiscount, that.selfAproachDiscount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), selfAproachDiscount);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().subtract(selfAproachDiscount);
    }
}
