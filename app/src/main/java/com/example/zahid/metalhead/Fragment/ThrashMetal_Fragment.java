package com.example.zahid.metalhead.Fragment;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.zahid.metalhead.CustomArrayAdapter.CustomArrayAdapter;
import com.example.zahid.metalhead.DetailsActivity;
import com.example.zahid.metalhead.HelperClass.RowItem;
import com.example.zahid.metalhead.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZAHID on 11/2/2015.
 */
public class ThrashMetal_Fragment extends ListFragment  implements AdapterView.OnItemClickListener{

    private static String sodom="Sodom is a German thrash metal band from Gelsenkirchen, formed in 1981. Along with the bands Kreator, Destruction and Tankard, Sodom is considered one of the \"The Big Teutonic Four\" of Teutonic thrash metal. \n" +
            "Origin: Gelsenkirchen, Germany► (1981)\n" +
            "Members: Tom Angelripper, Bernd Kost, Markus Freiwald, more\n" +
            "Past members: Frank Testegen, Grave Violator, Michael Wulf, more";

    private static String slayer="Slayer is an American thrash metal band from Huntington Park, California, formed in 1981 by guitarists Jeff Hanneman and Kerry King. \n" +
            "Origin: Huntington Park, California, United States (1981)\n" +
            "Members: Kerry King, Tom Araya, Gary Holt, Paul Bostaph, Jeff Hanneman, Dave Lombardo, Jon Dette, Tony Scaglione\n" +
            "Associated acts: Metallica, Megadeth, Anthrax, Exodus, Testament, Cannibal Corpse";

    private static String exodus="Exodus is an American thrash metal band formed in 1979 in Richmond, California. Spanning a career of 36 years, Exodus has gone through numerous lineup changes, two extended hiatuses, and the deaths of two former band members. \n" +
            "Genres: Thrash metal\n" +
            "Members: Gary Holt, Steve Souza, Tom Hunting, Lee Altus, more\n" +
            "Associated acts: Heathen, Hatriot, Blind Illusion, Sepultura, more";

    private static String anthrax="Anthrax is an American thrash metal band from New York City, formed in 1981 by guitarist Scott Ian and bassist Dan Lilker. The group was considered one of the leaders of the thrash metal scene during the 1980s. \n" +
            "Genres: Thrash metal\n" +
            "Members: Scott Ian, Joey Belladonna, Charlie Benante, more";

    private static String kreator="Kreator is a German thrash metal band from Essen. Their style of music is similar to their compatriots Destruction, Sodom and Tankard, the other three major German thrash metal bands. \n" +
            "Genres: Thrash metal\n" +
            "Members: Mille Petrozza, Sami Yli-Sirniö, Jürgen Reil, more\n" +
            "Associated acts: Sodom, Destruction, Coroner";
    private static String metalica="Metallica is an American heavy metal band formed in Los Angeles, California. Metallica was formed in 1981 when vocalist/guitarist James Hetfield responded to an advertisement posted by drummer Lars Ulrich in a local newspaper. \n" +
            "Lead singer: James Hetfield\n" +
            "Origin: Los Angeles, California, United States (1981)\n" +
            "Members: James Hetfield, Lars Ulrich, Kirk Hammett, more";
    private static String megadeth="Megadeth is an American thrash metal band from Los Angeles, California. The group was formed in 1983 by guitarist Dave Mustaine and bassist David Ellefson, shortly after Mustaine's dismissal from Metallica. \n" +
            "Lead singer: Dave Mustaine\n" +
            "Members: Dave Mustaine, Kiko Loureiro, Marty Friedman, more\n" +
            "Associated acts: Metallica, MD.45, F5, Slayer, Eidolon, Jag Panzer, Nevermore, Angra, Lamb of God, Anthrax";
    private static String overkill="Overkill is an American thrash metal band, formed in 1980 in New Jersey. They have gone through many line-up changes, with singer Bobby \"Blitz\" Ellsworth and bassist D.D. Verni remaining from the original lineup. \n" +
            "Lead singer: Bobby Ellsworth\n" +
            "Associated acts: Anthrax\n" +
            "Members: Bobby Ellsworth, D. D. Verni, Dave Linsk, Derek Tailer, more";
    private static String sepultura="Sepultura is a Brazilian heavy metal band from Belo Horizonte. Formed in 1984 by brothers Max and Igor Cavalera, the band was a major force in the death metal, thrash metal and groove metal genres during ... \n" +
            "Members: Andreas Kisser, Derrick Green, Eloy Casagrande, more\n" +
            "Lead singers: Max Cavalera, Derrick Green, Wagner Lamounier\n" +
            "Associated acts: Sarcófago, Nailbomb, Soulfly, Cavalera Conspiracy, Udora, Les Tambours du Bronx";
    private static String motorhead="Motörhead are an English rock band formed in June 1975 by bassist, singer, and songwriter Ian Fraser Kilmister, professionally known by his stage name Lemmy, who has remained the sole constant member. \n" +
            "Lead singer: Lemmy\n" +
            "Albums: Bad Magic, Ace of Spades, Aftershock, Overkill, more\n" +
            "Past members: Larry Wallis, Lucas Fox, Phil Taylor, Eddie Clarke, Brian Robertson, Würzel, Pete Gill";
    private static String Annihilator="\n" +
            "Annihilator is a Canadian thrash metal band founded in 1984 by vocalist, guitarist, bassist, songwriter, engineer, producer, mixer, mastering engineer Jeff Waters and former vocalist John Bates. \n" +
            "Genres: Thrash metal\n" +
            "Associated acts: Big John Bates\n" +
            "Members: Jeff Waters, Dave Padden, Mike Mangini, Coburn Pharr, more";
    private static String DeathAngel="\n" +
            "Death Angel is an American thrash metal band from Concord, California, initially active from 1982 to 1991 and again since 2001. Death Angel has released seven studio albums, two demo tapes, one box set and two live albums. \n" +
            "Lead singer: Mark Osegueda\n" +
            "Genres: Thrash metal\n" +
            "Members: Rob Cavestany, Mark Osegueda, Ted Aguilar, more\n" +
            "Past members: Gus Pepa, Andy Galeon, Chris Kontos, Sammy Diosdado";
    private static String Destruction="Destruction is a German thrash metal band. They are considered one of the \"The Big Four\" of the German thrash metal scene, the others being Kreator, Sodom and Tankard. \n" +
            "Lead singer: Marcel Schirmer\n" +
            "Origin: Weil am Rhein, Germany (1983)\n" +
            "Genres: Thrash metal\n" +
            "Members: Marcel Schirmer, Wawrzyniec Dramowicz, more";
    private static String Coroner="Coroner is a Swiss thrash metal band from Zürich. They garnered relatively little attention outside of Europe. Formed in 1983, the band broke up in 1996, but reformed 14 years later. \n" +
            "Origin: Zürich, Switzerland (1985)\n" +
            "Members: Tommy Vetterli, Ron Broder, Marky Edelmann\n" +
            "Associated acts: Kreator, Celtic Frost, Apollyon Sun\n" +
            "Genres: Thrash metal, Progressive metal, Avant-garde metal";
    private static String MachineHead="\n" +
            "Machine Head is an American heavy metal band from Oakland, California. Formed on October 12, 1991, the group was founded by vocalist and guitarist Robb Flynn and bassist Adam Duce. \n" +
            "Lead singer: Robb Flynn\n" +
            "Members: Robb Flynn, Phil Demmel, Dave McClain, Adam Duce, more\n" +
            "Past members: Logan Mader, Adam Duce, Tony Costanza, Chris Kontos, Walter Ryan, Ahrue Luster";
    private static String DarkAngel="Dark Angel is an American thrash metal band from Los Angeles, California. Their over-the-top style earned them the nickname \"the L.A. Caffeine Machine\". \n" +
            "Genres: Thrash metal\n" +
            "Origin: Downey, California, United States (1983)\n" +
            "Members: Gene Hoglan, Ron Rinehart, Eric Meyer, Jim Durkin, more\n" +
            "Record labels: Combat Records, Relativity Records";
    private static String Evile="Evile are an English thrash metal band from Huddersfield, formed in 2004. The band's debut album, Enter the Grave, was produced by Flemming Rasmussen at Sweet Silence Studios in Copenhagen, Denmark and ... \n" +
            "Genres: Thrash metal\n" +
            "Members: Ol Drake, Matt Drake, Ben Carter\n" +
            "Past members: Mike Alexander, Ol Drake";



    String[] menutitles;
    TypedArray menuIcons;
    CustomArrayAdapter adapter;
    private List<RowItem> rowItems;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.heavy_metal_layout, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.bandNamesThrash);
        menuIcons = getResources().obtainTypedArray(R.array.iconsThrash);

        rowItems = new ArrayList<RowItem>();

        for (int i = 0; i < menutitles.length; i++) {
            RowItem items = new RowItem(menutitles[i], menuIcons.getResourceId(
                    i, -1));

            rowItems.add(items);
        }

        adapter = new CustomArrayAdapter(getActivity(), rowItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), menutitles[position], Toast.LENGTH_SHORT)
                .show();




        ArrayList<String> arr=new ArrayList<String>();
        String clickedDetail=menutitles[position];
        if(clickedDetail.equalsIgnoreCase("Sodom")) {
            arr.add(sodom);
        }
        else if(clickedDetail.equalsIgnoreCase("Slayer")){
            arr.add(slayer);

        }
        else if(clickedDetail.equalsIgnoreCase("Exodus")){
            arr.add(exodus);

        }
        else if(clickedDetail.equalsIgnoreCase("Anthrax")){
            arr.add(anthrax);

        }
        else if(clickedDetail.equalsIgnoreCase("Kreator")){
            arr.add(kreator);

        }
        else if(clickedDetail.equalsIgnoreCase("Metalica")){
            arr.add(metalica);

        }
        else if(clickedDetail.equalsIgnoreCase("Megadeth")){
            arr.add(megadeth);

        }
        else if(clickedDetail.equalsIgnoreCase("OverKill")){
            arr.add(overkill);

        }
        else if(clickedDetail.equalsIgnoreCase("Sepultura")){
            arr.add(sepultura);

        }
        else if(clickedDetail.equalsIgnoreCase("Motorhead")){
            arr.add(motorhead);

        }
        else if(clickedDetail.equalsIgnoreCase("Annihilator")){
            arr.add(Annihilator);

        }
        else if(clickedDetail.equalsIgnoreCase("Death Angel")){
            arr.add(DeathAngel);

        }
        else if(clickedDetail.equalsIgnoreCase("Destruction")){
            arr.add(Destruction);

        }
        else if(clickedDetail.equalsIgnoreCase("Coroner")){
            arr.add(Coroner);

        }
        else if(clickedDetail.equalsIgnoreCase("Machine Head")){
            arr.add(MachineHead);

        }
        else if(clickedDetail.equalsIgnoreCase("Dark Angel")){
            arr.add(DarkAngel);

        }
        else if(clickedDetail.equalsIgnoreCase("Evile")){
            arr.add(Evile);

        }
        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);

        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);
        startActivity(i);

    }
}


