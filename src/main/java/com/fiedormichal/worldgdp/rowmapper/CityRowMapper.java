package com.fiedormichal.worldgdp.rowmapper;

import com.fiedormichal.worldgdp.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRowMapper implements RowMapper<City> {
    @Override
    public City mapRow(ResultSet resultSet, int i) throws SQLException {
        City city = new City();
        city.setCountryCode(resultSet.getString("country_code"));
        city.setDistrict(resultSet.getString("district"));
        city.setId(resultSet.getLong("id"));
        city.setName(resultSet.getString("name"));
        city.setPopulation(resultSet.getLong("population"));
        return city;
    }
}
