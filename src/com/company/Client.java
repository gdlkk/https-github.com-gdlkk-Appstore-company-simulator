package com.company;

public enum Client {
    ClientEasy("Krzysztof Ibisz Code", 0.30,0.0,0.20,100.0,0.0),
    ClientNorm("Ricky LaFleur", 0.0,0.0,0.0, 0.0,0.50),
    ClientScmbg("Jim Lahey [*]", 0.30,0.05,0.0,0.0,0.0);

    public String clientName;
    public Double paymentDelayChance7d;
    public Double paymentDelayChance1m;
    public Double dodgePenaltyChance7d;
    public Double dodgePenaltyChance1m;
    public Double loseProjectChance;

    public String getClientName() {
        return clientName;
    }

    public Double getPaymentDelayChance7d() {
        return paymentDelayChance7d;
    }

    public Double getPaymentDelayChance1m() {
        return paymentDelayChance1m;
    }

    public Double getDodgePenaltyChance7d() {
        return dodgePenaltyChance7d;
    }

    public Double getDodgePenaltyChance1m() {
        return dodgePenaltyChance1m;
    }

    public Double getLoseProjectChance() {
        return loseProjectChance;
    }

    Client(String clientName, Double paymentDelayChance7d, Double paymentDelayChance1m , Double dodgePenaltyChance7d, Double dodgePenaltyChance1m, Double loseProjectChance) {
        this.clientName = clientName;
        this.paymentDelayChance7d = paymentDelayChance7d;
        this.paymentDelayChance1m = paymentDelayChance1m;
        this.dodgePenaltyChance7d = dodgePenaltyChance7d;
        this.dodgePenaltyChance1m = dodgePenaltyChance1m;
        this.loseProjectChance = loseProjectChance;
    }
}
