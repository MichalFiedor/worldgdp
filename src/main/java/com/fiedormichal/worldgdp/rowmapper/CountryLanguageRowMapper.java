package com.fiedormichal.worldgdp.rowmapper;

import com.fiedormichal.worldgdp.model.CountryLanguage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryLanguageRowMapper implements RowMapper<CountryLanguage> {
    @Override
    public CountryLanguage mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        CountryLanguage countryLanguage = new CountryLanguage();
        countryLanguage.setCountryCode(resultSet.getString("countrycode"));
        countryLanguage.setIsOfficial(resultSet.getString("isofficial"));
        countryLanguage.setLanguage(resultSet.getString("language"));
        countryLanguage.setPercentage(resultSet.getDouble("percentage"));
        return countryLanguage;
    }
}
