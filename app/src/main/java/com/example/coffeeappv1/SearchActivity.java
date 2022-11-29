package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>(Arrays.asList("Barbary Coast Blend",
                "Bourbon Pecan",
                "Breakfast Blend",
                "Cappuccino Fudge",
                "Caramel Nut Fudge",
                "Chocolate Macadamia Nut",
                "Chocolate Raspberry Cream",
                "Cinnamon Bun",
                "Cinnamon Frangelico",
                "Cinnamon Nut Sugar Cookie",
                "Colombia French",
                "Colombia Reserve",
                "Colombia Reserve Dark",
                "Competition Blend",
                "Costa Rica La Estrella, Direct Trade",
                "Dark Chocolate Truffle",
                "Decaffeinated Colombia",
                "Decaffeinated Colombia/French",
                "Decaffeinated Espresso Roast / Espresso Perfection",
                "Decaffeinated European Royale",
                "Decaffeinated French Roast Classic",
                "Decaffeinated Moka Java Ethiopian",
                "Decaffeinated Hazelnut",
                "Decaffeinated Vanilla Nut Cream",
                "Espresso Classico",
                "Espresso Nuovo",
                "Ethiopia Mystic Lion (Natural)",
                "Ethiopia Moka",
                "European Royale",
                "French Roast Classic",
                "French Roast Dark Italian",
                "French Vanilla",
                "Guatemala Antigua, Direct Trade",
                "Guatemala Antigua Dark, Direct Trade",
                "Hawaiian Golden Blend",
                "Hawaiian Kona Fancy",
                "Hazelnut",
                "Heritage Blend",
                "Hot Buttered Rum",
                "House Blend",
                "Irish Shamrock Cream",
                "Island Blend",
                "Italian Roast Classic",
                "Jamaica Blue Mountain",
                "Kahlua Cream",
                "Kenya AA+",
                "Majestic Blend",
                "Midnight Royale",
                "Moka Java Ethiopian",
                "Moka Java Dark",
                "Organic Balthazar Blend",
                "Organic Costa Rica, Direct Trade",
                "Organic Costa Rica Las Lajas Honey Miel",
                "Organic Espresso Maranello",
                "Organic Fair Trade French Roast",
                "Organic French Roast",
                "Organic Gorilla Vanilla",
                "Organic Hawaiian",
                "Organic Italian Roast",
                "Organic Mexico",
                "Organic Fair Trade Millennium Joe",
                "Organic Oak Street Blend",
                "Organic Peru",
                "Organic Fair Trade Rendezvous Brew",
                "Organic Road Warrior Blend",
                "Organic Sumatra Dark",
                "Organic WP Decaf Dark Roast",
                "Organic WP Decaf Italian Roast",
                "Organic WP Decaf Mexico",
                "Organic WP Decaf Fair Trade French Roast",
                "Panama La Esmeralda Geisha, Direct Trade Auction Lot",
                "President's Private Blend",
                "Riviera French",
                "Sumatra Mandheling",
                "Vanilla Macadamia Nut",
                "Vanilla Nut Cream",
                "Vienna Dark",
                "Westside Blend"));

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String clickedItem = ((String)parent.getItemAtPosition(position));

            switch(clickedItem){
                case "Barbary Coast Blend": startActivity(new Intent(SearchActivity.this, BarbaryCoastBlendActivity.class)); break;
                case "Bourbon Pecan": startActivity(new Intent(SearchActivity.this, BourbonPecanActivity.class)); break;
                case "Breakfast Blend": startActivity(new Intent(SearchActivity.this, BreakfastBlendActivity.class)); break;
                case "Cappuccino Fudge": startActivity(new Intent(SearchActivity.this, CappuccinoFudgeActivity.class)); break;
                case "Caramel Nut Fudge": startActivity(new Intent(SearchActivity.this, CaramelNutFudgeActivity.class)); break;
                case "Chocolate Macadamia Nut": startActivity(new Intent(SearchActivity.this, ChocolateMacadamiaNutActivity.class)); break;
                case "Chocolate Raspberry Cream": startActivity(new Intent(SearchActivity.this, ChocolateRasberryCreamActivity.class)); break;
                case "Cinnamon Bun": startActivity(new Intent(SearchActivity.this, CinnamonBunActivity.class)); break;
                case "Cinnamon Frangelico": startActivity(new Intent(SearchActivity.this, CinnamonFragelicoActivity.class)); break;
                case "Cinnamon Nut Sugar Cookie": startActivity(new Intent(SearchActivity.this, CinnamonNutSugarCookieActivity.class)); break;
                case "Colombia French": startActivity(new Intent(SearchActivity.this, ColombiaFrenchActivity.class)); break;
                case "Colombia Reserve": startActivity(new Intent(SearchActivity.this, ColombiaReserveActivity.class)); break;
                case "Colombia Reserve Dark": startActivity(new Intent(SearchActivity.this, ColombiaReserveDarkActivity.class)); break;
                case "Competition Blend": startActivity(new Intent(SearchActivity.this, CompetitionBlendActivity.class)); break;
                case "Costa Rica La Estrella, Direct Trade": startActivity(new Intent(SearchActivity.this, CostaRicaLaEstrellaActivity.class)); break;
                case "Dark Chocolate Truffle": startActivity(new Intent(SearchActivity.this, DarkChocolateTruffleActivity.class)); break;
                case "Decaffeinated Colombia": startActivity(new Intent(SearchActivity.this, DecaffeinatedColombiaActivity.class)); break;
                case "Decaffeinated Colombia/French": startActivity(new Intent(SearchActivity.this, DecaffeinatedColombianFrenchActivity.class)); break;
                case "Decaffeinated Espresso Roast / Espresso Perfection": startActivity(new Intent(SearchActivity.this, DecaffeinatedEspressoRoastActivity.class)); break;
                case "Decaffeinated European Royale": startActivity(new Intent(SearchActivity.this, DecaffeinatedEuropeanRoyale.class)); break;
                case "Decaffeinated French Roast Classic": startActivity(new Intent(SearchActivity.this, DecaffeinatedFrenchRoastClassicActivity.class)); break;
                case "Decaffeinated Moka Java Ethiopian": startActivity(new Intent(SearchActivity.this, DecaffeinatedMokaJavaEthiopianActivity.class)); break;
                case "Decaffeinated Hazelnut": startActivity(new Intent(SearchActivity.this, DecaffeinatedHazelnutActivity.class)); break;
                case "Decaffeinated Vanilla Nut Cream": startActivity(new Intent(SearchActivity.this, DecaffeinatedVanillaNutCreamActivity.class)); break;
                case "Espresso Classico": startActivity(new Intent(SearchActivity.this, EspressoClassicoActivity.class)); break;
                case "Espresso Nuovo": startActivity(new Intent(SearchActivity.this, EspressoNuovoActivity.class)); break;
                case "Ethiopia Mystic Lion (Natural)": startActivity(new Intent(SearchActivity.this, EthiopiaMysticLionActivity.class)); break;
                case "Ethiopia Moka": startActivity(new Intent(SearchActivity.this, EthiopiaMokaActivity.class)); break;
                case "European Royale": startActivity(new Intent(SearchActivity.this, EuropeanRoyaleActivity.class)); break;
                case "French Roast Classic": startActivity(new Intent(SearchActivity.this, FrenchRoastClassicActivity.class)); break;
                case "French Roast Dark Italian": startActivity(new Intent(SearchActivity.this, FrenchRoastDarkItalianActivity.class)); break;
                case "French Vanilla": startActivity(new Intent(SearchActivity.this, FrenchVanillaActivity.class)); break;
                case "Guatemala Antigua, Direct Trade": startActivity(new Intent(SearchActivity.this, GuatemalaAntiguaActivity.class)); break;
                case "Guatemala Antigua Dark, Direct Trade": startActivity(new Intent(SearchActivity.this, GuatemalaAntiguaDarkActivity.class)); break;
                case "Hawaiian Golden Blend": startActivity(new Intent(SearchActivity.this, HawaiianGoldenBlendActivity.class)); break;
                case "Hawaiian Kona Fancy": startActivity(new Intent(SearchActivity.this, HawaiianKonaFancyActivity.class)); break;
                case "Hazelnut": startActivity(new Intent(SearchActivity.this, HazelnutActivity.class)); break;
                case "Heritage Blend": startActivity(new Intent(SearchActivity.this, HeritageBlendActivity.class)); break;
                case "Hot Buttered Rum": startActivity(new Intent(SearchActivity.this, HotButteredRumActivity.class)); break;
                case "House Blend": startActivity(new Intent(SearchActivity.this, HouseBlendActivity.class)); break;
                case "Irish Shamrock Cream": startActivity(new Intent(SearchActivity.this, IrishShamrockCreamActivity.class)); break;
                case "Island Blend": startActivity(new Intent(SearchActivity.this, IslandBlendActivity.class)); break;
                case "Italian Roast Classic": startActivity(new Intent(SearchActivity.this, ItalianRoastClassicActivity.class)); break;
                case "Jamaica Blue Mountain": startActivity(new Intent(SearchActivity.this, JamaicaBlueMountainFancyActivity.class)); break;
                case "Kahlua Cream": startActivity(new Intent(SearchActivity.this, KahluaCreamActivity.class)); break;
                case "Kenya AA+": startActivity(new Intent(SearchActivity.this, KenyaAAActivity.class)); break;
                case "Majestic Blend": startActivity(new Intent(SearchActivity.this, MajesticBlendActivity.class)); break;
                case "Midnight Royale": startActivity(new Intent(SearchActivity.this, MidnightRoyaleActivity.class)); break;
                case "Moka Java Ethiopian": startActivity(new Intent(SearchActivity.this, MokaJavaEthiopianActivity.class)); break;
                case "Moka Java Dark": startActivity(new Intent(SearchActivity.this, MokaJavaDarkActivity.class)); break;
                case "Organic Balthazar Blend": startActivity(new Intent(SearchActivity.this, OrganicBalthazarBlendActivity.class)); break;
                case "Organic Costa Rica, Direct Trade": startActivity(new Intent(SearchActivity.this, OrganicCostaRicaActivity.class)); break;
                case "Organic Costa Rica Las Lajas Honey Miel": startActivity(new Intent(SearchActivity.this, OrganicCostaRicaLasLajasHoneyMielActivity.class)); break;
                case "Organic Espresso Maranello": startActivity(new Intent(SearchActivity.this, OrganicEspressoMaranelloActivity.class)); break;
                case "Organic Fair Trade French Roast": startActivity(new Intent(SearchActivity.this, OrganicFairTradeFrenchRoastActivity.class)); break;
                case "Organic French Roast": startActivity(new Intent(SearchActivity.this, OrganicFrenchRoastActivity.class)); break;
                case "Organic Gorilla Vanilla": startActivity(new Intent(SearchActivity.this, OrganicGorillaVanillaActivity.class)); break;
                case "Organic Hawaiian": startActivity(new Intent(SearchActivity.this, OrganicHawaiianActivity.class)); break;
                case "Organic Italian Roast": startActivity(new Intent(SearchActivity.this, OrganicItalianRoastActivity.class)); break;
                case "Organic Mexico": startActivity(new Intent(SearchActivity.this, OrganicMexicoActivity.class)); break;
                case "Organic Fair Trade Millennium Joe": startActivity(new Intent(SearchActivity.this, OrganicFairTradeMillenniumJoeActivity.class)); break;
                case "Organic Oak Street Blend": startActivity(new Intent(SearchActivity.this, OrganicOakStreetBlendActivity.class)); break;
                case "Organic Peru": startActivity(new Intent(SearchActivity.this, OrganicPeruActivity.class)); break;
                case "Organic Fair Trade Rendezvous Brew": startActivity(new Intent(SearchActivity.this, OrganicFairTradeRendezvousBrewActivity.class)); break;
                case "Organic Road Warrior Blend": startActivity(new Intent(SearchActivity.this, OrganicRoadWarriorBlendActivity.class)); break;
                case "Organic Sumatra Dark": startActivity(new Intent(SearchActivity.this, OrganicSumatraDarkActivity.class)); break;
                case "Organic WP Decaf Dark Roast": startActivity(new Intent(SearchActivity.this, OrganicWPDecafDarkRoastActivity.class)); break;
                case "Organic WP Decaf Italian Roast": startActivity(new Intent(SearchActivity.this, OrganicWPDecafItalianRoastActivity.class)); break;
                case "Organic WP Decaf Mexico": startActivity(new Intent(SearchActivity.this, OrganicWPDecafMexicoActivity.class)); break;
                case "Organic WP Decaf Fair Trade French Roast": startActivity(new Intent(SearchActivity.this, OrganicWPDecafFairTradeFrenchRoastActivity.class)); break;
                case "Panama La Esmeralda Geisha, Direct Trade Auction Lot": startActivity(new Intent(SearchActivity.this, PanamaLaEsmeraldaGeishaActivity.class)); break;
                case "President's Private Blend": startActivity(new Intent(SearchActivity.this, PresidentsPrivateBlendActivity.class)); break;
                case "Riviera French": startActivity(new Intent(SearchActivity.this, RivieraFrenchActivity.class)); break;
                case "Sumatra Mandheling": startActivity(new Intent(SearchActivity.this, SumatraMandhelingActivity.class)); break;
                case "Vanilla Macadamia Nut": startActivity(new Intent(SearchActivity.this, VanillaMacadamiaNutActivity.class)); break;
                case "Vanilla Nut Cream": startActivity(new Intent(SearchActivity.this, VanillaNutCreamActivity.class)); break;
                case "Vienna Dark": startActivity(new Intent(SearchActivity.this, ViennaDarkActivity.class)); break;
                case "Westside Blend": startActivity(new Intent(SearchActivity.this, WestsideBlendActivity.class)); break;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                arrayAdapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}