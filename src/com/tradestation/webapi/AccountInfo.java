package com.tradestation.webapi;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jjelinek@tradestation.com
 */
public class AccountInfo {
    private String Alias;
    private String AltId;
    private String DisplayName;
    private int Key;
    private String Name;
    private char Type;
    private String TypeDescription;
    private String CanDayTrade;
    private String ClearingID;
    private String Currency;
    private String DayTradingQualified;
    private String IsStockLocateEligible;
    private String OptionApprovalLevel;
    private String PatternDayTrader;
    private AccountSettings Settings;
    private String Status;
    private String StatusDescription;

    public String getAlias() {
        return Alias;
    }

    @JsonProperty("Alias")
    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getAltId() {
        return AltId;
    }

    @JsonProperty("AltId")
    public void setAltId(String altId) {
        AltId = altId;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    @JsonProperty("DisplayName")
    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public int getKey() {
        return Key;
    }

    @JsonProperty("Key")
    public void setKey(int key) {
        Key = key;
    }

    public String getName() {
        return Name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        Name = name;
    }

    public char getType() {
        return Type;
    }

    @JsonProperty("Type")
    public void setType(char type) {
        Type = type;
    }

    public String getTypeDescription() {
        return TypeDescription;
    }

    @JsonProperty("TypeDescription")
    public void setTypeDescription(String typeDescription) {
        TypeDescription = typeDescription;
    }

    public String getCanDayTrade() {
        return CanDayTrade;
    }
    @JsonProperty("CanDayTrade")
    public void setCanDayTrade(String canDayTrade) {
        CanDayTrade = canDayTrade;
    }

    public String getClearingID() {
        return ClearingID;
    }
    @JsonProperty("ClearingID")
    public void setClearingID(String clearingID) {
        ClearingID = clearingID;
    }

    public String getCurrency() {
        return Currency;
    }
    @JsonProperty("Currency")
    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getDayTradingQualified() {
        return DayTradingQualified;
    }
    @JsonProperty("DayTradingQualified")
    public void setDayTradingQualified(String dayTradingQualified) {
        DayTradingQualified = dayTradingQualified;
    }

    public String getIsStockLocateEligible() {
        return IsStockLocateEligible;
    }
    @JsonProperty("IsStockLocateEligible")
    public void setIsStockLocateEligible(String isStockLocateEligible) {
        IsStockLocateEligible = isStockLocateEligible;
    }

    public String getOptionApprovalLevel() {
        return OptionApprovalLevel;
    }
    @JsonProperty("OptionApprovalLevel")
    public void setOptionApprovalLevel(String optionApprovalLevel) {
        OptionApprovalLevel = optionApprovalLevel;
    }

    public String getPatternDayTrader() {
        return PatternDayTrader;
    }
    @JsonProperty("PatternDayTrader")
    public void setPatternDayTrader(String patternDayTrader) {
        PatternDayTrader = patternDayTrader;
    }

    public AccountSettings getSettings() {
        return Settings;
    }
    @JsonProperty("Settings")
    public void setSettings(AccountSettings settings) {
        Settings = settings;
    }

    public String getStatus() {
        return Status;
    }
    @JsonProperty("Status")
    public void setStatus(String status) {
        Status = status;
    }

    public String getStatusDescription() {
        return StatusDescription;
    }
    @JsonProperty("StatusDescription")
    public void setStatusDescription(String statusDescription) {
        StatusDescription = statusDescription;
    }
}
