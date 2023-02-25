package com.example.practicagooglemapsapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity
        extends AppCompatActivity 
        implements OnMapReadyCallback, GoogleMap.OnMapClickListener
{
    public GoogleMap Mapa;
    public TextView Datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Mapa = googleMap;
        Mapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        Mapa.getUiSettings().setZoomControlsEnabled(true);

        CameraUpdate camUpd1 =
            CameraUpdateFactory
                .newLatLngZoom(new LatLng(-1.024267389863566, -79.46621960993701), 15);
        //
        LatLng CHINISSESFOODEXPRESS = new LatLng(-1.0242929847081381, -79.46703649905092);
        Mapa.addMarker(new MarkerOptions().position(CHINISSESFOODEXPRESS).title("CHINISSES FOOD EXPRESS").snippet(String.valueOf(Datos)).icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)).anchor(0.1f,0.1f));

        LatLng SANANTONIO = new LatLng(-1.023203577288594, -79.46571976799041);
        Mapa.addMarker(new MarkerOptions().position(SANANTONIO).title("SAN ANTONIO (Café-Restaurant)").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng PIQUEOS = new LatLng(-1.0275373328926727, -79.46795136583404);
        Mapa.addMarker(new MarkerOptions().position(PIQUEOS).title("Piqueos y algo +").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng CHIFLEPAPIPOLLO = new LatLng(-1.027709014982549, -79.4699157485532);
        Mapa.addMarker(new MarkerOptions().position(CHIFLEPAPIPOLLO).title("Chifle Papipollo El Sabroson").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng FOSTER = new LatLng(-1.0293394869590857, -79.46949631783541);
        Mapa.addMarker(new MarkerOptions().position(FOSTER).title("Restaurant Foster").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng KFC = new LatLng(-1.0295454112544167, -79.46864520818968);
        Mapa.addMarker(new MarkerOptions().position(KFC).title("KFC - Quevedo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));


        LatLng SUPERPINCHO = new LatLng(-1.032464196089297, -79.47079995669313);
        Mapa.addMarker(new MarkerOptions().position(SUPERPINCHO).title("Super Pincho").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng LOSMOROS = new LatLng(-1.023203577288594, -79.46571976799041);
        Mapa.addMarker(new MarkerOptions().position(LOSMOROS).title("Los Moros").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng RESTAURANTDCARLOS = new LatLng(-1.029265372620842, -79.4684874589593);
        Mapa.addMarker(new MarkerOptions().position(PIQUEOS).title("RESTAURANT D CARLOS").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng AROMACOFFEE = new LatLng(-1.0328025933355522, -79.46684119094303);
        Mapa.addMarker(new MarkerOptions().position(AROMACOFFEE).title("Aroma Coffee Lounge").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng TIPITAPA = new LatLng(-1.0257635198753026, -79.46262313416064);
        Mapa.addMarker(new MarkerOptions().position(TIPITAPA).title("Tipitapa").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng FOODGOOD = new LatLng(-1.0224867044853387, -79.46089342752803);
        Mapa.addMarker(new MarkerOptions().position(FOODGOOD).title("Food Good").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));


        LatLng ELBOMBOLI = new LatLng(-1.0399275407608615, -79.46789269275033);
        Mapa.addMarker(new MarkerOptions().position(ELBOMBOLI).title("EL BOMBOLÍ").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng CASAMONTIEL = new LatLng(-1.0323756753779003, -79.46291451260221);
        Mapa.addMarker(new MarkerOptions().position(CASAMONTIEL).title("La Casade Montiel").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng JUANDIEGO = new LatLng(-1.024652158138716, -79.46188454429571);
        Mapa.addMarker(new MarkerOptions().position(JUANDIEGO).title("Parrilla Juan Diego").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng PAPASPRIMO = new LatLng(-1.021047843712603, -79.4606829146048);
        Mapa.addMarker(new MarkerOptions().position(PAPASPRIMO).title("Papas El Primo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng SPORTFISH  = new LatLng(-1.0343923684625904, -79.46368698883211);
        Mapa.addMarker(new MarkerOptions().position(SPORTFISH).title("Cevichería Sport Fish").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng PAPANELSON  = new LatLng(-1.0224867044853387, -79.46089342752803);
        Mapa.addMarker(new MarkerOptions().position(PAPANELSON).title("Papá Nelson - Costillas Asadas").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));


        LatLng LASMARUCHAS = new LatLng(-1.026924359701129, -79.46275258838617);
        Mapa.addMarker(new MarkerOptions().position(LASMARUCHAS).title("ASADERO \"LAS MARUCHAS\"").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng ELCHATO = new LatLng(-1.0277903170766984, -79.4628067194272);
        Mapa.addMarker(new MarkerOptions().position(LOSMOROS).title("Asadero El Chato").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng CHIFARAYMOND = new LatLng(-1.029265372620842, -79.4684874589593);
        Mapa.addMarker(new MarkerOptions().position(CHIFARAYMOND).title("Chifa Raymond").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng ZONALIGHT = new LatLng(-1.0190766102252649, -79.46935657510299);
        Mapa.addMarker(new MarkerOptions().position(ZONALIGHT).title("ZONA LIGHT, RESTAURANT VEGETARIANO, QUEVEDO.").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

            LatLng BOCADOSYALGOMAS = new LatLng(-1.0171101596756997, -79.46805743011784);
        Mapa.addMarker(new MarkerOptions().position(BOCADOSYALGOMAS).title("Bocados & algo mas").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng PIQUEYPASE = new LatLng(-1.015077776176928, -79.46701798602881);
        Mapa.addMarker(new MarkerOptions().position(PIQUEYPASE).title("PIQUE Y PASE").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));


        LatLng DELICIASDELOLIMPO = new LatLng(-1.0143251245552953, -79.46644383963586);
        Mapa.addMarker(new MarkerOptions().position(DELICIASDELOLIMPO).title("Cafe Restaurante Las Delicias Del Olimpo").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng SWETLAND = new LatLng(-1.0323756753779003, -79.46291451260221);
        Mapa.addMarker(new MarkerOptions().position(SWETLAND).title("Sweet Land").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng GORDOGLENN = new LatLng(-1.0145164766790888, -79.46715833292487);
        Mapa.addMarker(new MarkerOptions().position(GORDOGLENN).title("Gordo Glenn").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng MARBELLA = new LatLng(-1.012921875301878, -79.46681384508909);
        Mapa.addMarker(new MarkerOptions().position(MARBELLA).title("Mar' Bella").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng PICUDOBLANCO  = new LatLng(-1.0355775974808004, -79.47114192172303);
        Mapa.addMarker(new MarkerOptions().position(PICUDOBLANCO).title("Cevichería El Picudo Blanco Internacional").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng MOROSYASADOS  = new LatLng(-1.0365430348451965, -79.46830950888014);
        Mapa.addMarker(new MarkerOptions().position(PAPANELSON).title("La Tuka Moros y Asados").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng ASADEROROSITAS  = new LatLng(-1.0311446256072119, -79.46289049113501);
        Mapa.addMarker(new MarkerOptions().position(ASADEROROSITAS).title("Asadero las Rositas").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));

        LatLng RESTAURANTETENTACIONES = new LatLng(-1.0164373483976246, -79.47178930464217);
        Mapa.addMarker(new MarkerOptions().position(RESTAURANTETENTACIONES).title("RESTAURANTE TENTACIONES").snippet("Restaurante").icon(BitmapDescriptorFactory.fromResource(R.mipmap.iconfood2)));


        Mapa.moveCamera(camUpd1);
        Mapa.setOnMapClickListener(this);
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {

        //LatLng punto = new LatLng(latLng.latitude, latLng.longitude);
        //Mapa.addMarker(new MarkerOptions().position(latLng).title("Punto Agregado"));

        CircleOptions Circulo =new CircleOptions();
        Circulo.center(latLng);
        Circulo.radius(1500);
        Mapa.addCircle(Circulo);
    }

    public String detalle = "https://maps.googleapis.com/maps/api/place/details/json?fields=name%2Crating%2Cformatted_phone_number&place_id=ChIJN1t_tDeuEmsRUsoyG83frY4&key=AIzaSyB5MkIB5lNnQH1kC1tZ3ATeEsv7z66moKs";

    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
            (Request.Method.GET, detalle, null, new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {
                    Datos.setText("Response: " + response.toString());
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    Datos.setText("No vale :c");
                }
            });

}