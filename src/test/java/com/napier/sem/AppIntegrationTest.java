package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.SQLException;
import java.util.ArrayList;
import com.napier.sem.App;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 0);

    }
    @Test
    void capitalCityTest() throws SQLException {

        ArrayList<CapitalCityReport> cp = app.getCitiesBtPop();
        CapitalCityReport cpr=null ;
        for (CapitalCityReport ci: cp)
        {
            if (  ci.getName().equals("Shanghai"))
            {
                cpr = ci;
                break;
            }

        }
        //Shanghai	China	9696300
        assertEquals("Shanghai",cpr.getName());
        assertEquals("China",cpr.getCountry());
        assertEquals("9696300",cpr.getPopulation());

    }
}
