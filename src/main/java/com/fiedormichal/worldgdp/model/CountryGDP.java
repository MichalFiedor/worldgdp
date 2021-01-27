package com.fiedormichal.worldgdp.model;

import com.mysql.cj.result.DoubleValueFactory;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CountryGDP {
    private Short year;
    private Double value;
}
