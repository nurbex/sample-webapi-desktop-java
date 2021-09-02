package com.tradestation.webapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountSettings {
    public AccountSettings(){}
    public AccountSettings(String cryptoEnabled, String enrolledInRegTProgram, String requiresBuyingPowerWarning) {
        CryptoEnabled = cryptoEnabled;
        EnrolledInRegTProgram = enrolledInRegTProgram;
        RequiresBuyingPowerWarning = requiresBuyingPowerWarning;
    }

    private String CryptoEnabled;
    private String EnrolledInRegTProgram;
    private String RequiresBuyingPowerWarning;

    public String getCryptoEnabled() {
        return CryptoEnabled;
    }
    @JsonProperty("CryptoEnabled")
    public void setCryptoEnabled(String cryptoEnabled) {
        CryptoEnabled = cryptoEnabled;
    }

    public String getEnrolledInRegTProgram() {
        return EnrolledInRegTProgram;
    }
    @JsonProperty("EnrolledInRegTProgram")
    public void setEnrolledInRegTProgram(String enrolledInRegTProgram) {
        EnrolledInRegTProgram = enrolledInRegTProgram;
    }

    public String getRequiresBuyingPowerWarning() {
        return RequiresBuyingPowerWarning;
    }
    @JsonProperty("RequiresBuyingPowerWarning")
    public void setRequiresBuyingPowerWarning(String requiresBuyingPowerWarning) {
        RequiresBuyingPowerWarning = requiresBuyingPowerWarning;
    }
}
