package guru.qa.data;

import java.io.Serializable;

import static guru.qa.data.Country.RU;
import static guru.qa.data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {
    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
