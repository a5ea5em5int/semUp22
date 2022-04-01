package com.napier.sem;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    static App app;

    @BeforeAll
    static void init() {
        app = new App();

    }

    @Test
    void DisplayTestNull() {
        app.display(null);
    }

    @Test
    void CitiesBtPopTestNull() throws SQLException {
        // ArrayList<CapitalCityReport> cities =app.getCitiesBtPop();
        app.displayCapitalCity(null);

    }

    @Test
    void CitiesBtPopCityNull() throws SQLException {
        System.out.println("****************************************&\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
       // ArrayList<CapitalCityReport> cities = app.getCitiesBtPop();
       // cities.add(null);
       // app.displayCapitalCity(cities);

    }

    //getCitiesBtPop



    }
