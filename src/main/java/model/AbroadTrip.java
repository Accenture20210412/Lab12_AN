package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class AbroadTrip extends Trip{
    private BigDecimal insurance;

    public AbroadTrip(LocalDate startOfTrip, LocalDate endOfTrip, String destiny, BigDecimal price, BigDecimal insurance) {
        super(startOfTrip, endOfTrip, destiny, price);
        this.insurance = insurance;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(insurance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbroadTrip that = (AbroadTrip) o;
        return Objects.equals(insurance, that.insurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insurance);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", include insurence (" + this.insurance +"$)";
    }
}
