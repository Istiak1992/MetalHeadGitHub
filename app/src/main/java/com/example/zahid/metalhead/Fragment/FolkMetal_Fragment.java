package com.example.zahid.metalhead.Fragment;

import android.app.Fragment;
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
public class FolkMetal_Fragment extends ListFragment implements AdapterView.OnItemClickListener{

    private static String arkona="Arkona is a Russian pagan metal band. Their lyrics are heavily influenced by Russian folklore and Slavic mythology, and their music incorporates several traditional Russian musical instruments. Wikipedia►\n" +
            "Record label: Napalm Records\n" +
            "Members: Маша \"Scream\", Алексей \"Лесьяр\" Агафонов, Lazar, Wład Sokołow, Kniaz\n" +
            "Genres: Pagan metal, Folk metal";

    private static String turisas="Turisas is a Finnish metal band from Hämeenlinna. They were founded in 1997 by Mathias Nygård and Jussi Wickström, and named after an ancient Finnish God of war. Wikipedia\n" +
            "Origin: Hämeenlinna, Finland (1997)\n" +
            "Members: Mathias Nygård, Olli Vänskä, Jussi Wickström, more\n" +
            "Genres: Folk metal, Power metal, Symphonic metal, Viking metal";

    private static String suidakra="Suidakra is a melodic death metal band from Germany. During their fourteen-year career, they have performed over 200 live shows for several European and Russian tours, as well as a North American tour. Wikipedia►\n" +
            "Origin: Düsseldorf, Germany (1994)\n" +
            "Genres: Melodic death metal, Folk metal, Celtic metal\n" +
            "Members: Arkadius Antonik, Marcel Schönen, Lars Wehner, more\n" +
            "Record labels: AFM Records, Century Media Records";

    private static String amorphis="Amorphis is a Finnish heavy metal band founded by Jan Rechberger, Tomi Koivusaari, and Esa Holopainen in 1990. Wikipedia\n" +
            "Members: Tomi Joutsen, Esa Holopainen, Tomi Koivusaari, more\n" +
            "Lead singers: Tomi Joutsen (Since 2005), Pasi Koskinen (1996 – 2004)\n" +
            "Record labels: Nuclear Blast, Relapse Records, Virgin Records";

    private static String agalloch="Agalloch is an American metal band formed in 1995 in Portland, Oregon, led by vocalist/guitarist/drummer John Haughm. Wikipedia\n" +
            "Members: John Haughm, Don Anderson, Aesop Dekker, Jason William Walton\n" +
            "Genres: Folk metal, Black metal, Doom metal, Progressive metal, Post-rock, Post-metal, Neofolk\n" +
            "Record labels: Profound Lore Records, The End Records, Vendlus Records";

    private static String ensiferum="Ensiferum is a Finnish folk metal band from Helsinki. The members of the band label themselves as \"melodic folk metal.\" Wikipedia\n" +
            "Members: Petri Lindroos, Emmi Silvennoinen, Jari Mäenpää, more\n" +
            "Associated acts: Wintersun, Arthemesia, Cadacross, Chthonic, Norther, Waltari, Sinergy, Rapture, Turisas\n" +
            "Genres: Folk metal, Melodic death metal, Viking metal";

    private static String eluveitie="Eluveitie is a Swiss folk metal band from Winterthur, Zurich, founded by Chrigel Glanzmann. The band was formed in 2002 and their first EP, Vên, was released in 2003. Wikipedia\n" +
            "Origin: Winterthur, Switzerland (2002)\n" +
            "Albums: Origins, Helvetios, Evocation I: The Arcane Dominion, more\n" +
            "Genres: Folk metal, Melodic death metal, Celtic metal, Pagan metal";

    private static String finntroll="Finntroll is a folk metal band from Helsinki, Finland. They combine elements of black metal and folk metal. Finntroll's lyrics are mostly in Swedish, the only exception being the song \"Madon Laulu\" on Visor Om Slutet. Wikipedia\n" +
            "Members: Mathias Lillmåns, Samuli Ponsimaa, Henri Sorvali, more\n" +
            "Genres: Folk metal, Black metal\n" +
            "Associated acts: Korpiklaani, Shape of Despair, Moonsorrow, Barathrum, Turisas";

    private static String wintersun="Wintersun is a metal band from Helsinki, Finland and was originally created by guitarist, keyboardist, bassist, songwriter and vocalist Jari Mäenpää as a side project to folk metal band Ensiferum, for whom he was lead singer and guitarist. Wikipedia\n" +
            "Past members: Oliver Fokin\n" +
            "Record label: Nuclear Blast\n" +
            "Albums: Time I, Wintersun, Winter Madness, Wintersun: Tour Edition\n" +
            "Genres: Black metal, Melodic death metal, Power metal, Folk metal";

    private static String equilibrium="Equilibrium is a German folk metal band. The band's music combines elements of folk music, power metal, black metal and symphonic metal with various other influences. Their riffs reflect traditional Germanic melodies. Wikipedia\n" +
            "Origin: Munich, Germany (2001)\n" +
            "Record label: Nuclear Blast\n" +
            "Members: René Berthiaume, Robert Dahn, Tuval Refaeli, more\n" +
            "Genres: Folk metal, Viking metal, Symphonic black metal";
    private  static  String Tyr="Týr is a Faroese heavy metal band. Their subject matter revolves almost entirely around Viking lore, mythology, and history, taking their name from the Norse god of law and justice. Wikipedia\n" +
            "Origin: Tórshavn, Faroe Islands (1998)\n" +
            "Members: Heri Joensen, Gunnar H. Thomsen, Terji Skibenæs, Pól Arni Holm, Kári Streymoy\n" +
            "Genres: Heavy metal, Folk metal, Progressive metal, Viking metal\n" +
            "Past members: Pól Arni Holm, Kári Streymoy";
    private  static  String Dalriada="Dalriada is a folk metal band from Sopron, Hungary that was formed in 1998 as Echo of Dalriada, but shortened their name to Dalriada in late 2006. Wikipedia\n" +
            "Origin: Sopron, Hungary (1998)\n" +
            "Genres: Folk metal\n" +
            "Members: Laura Binder, Tadeusz Rieckmann, more";
    private  static  String Korpiklaani="Korpiklaani is a folk metal band from Finland who were formerly known as Shaman. \n" +
            "Genres: Folk metal\n" +
            "Members: Jonne Järvelä, Tuomas Rounakari, Jarkko Aaltonen, more\n" +
            "Associated acts: Falchion, Finntroll";
    private  static String Falkenbach="Falkenbach is a Viking metal group from Germany that is signed to Prophecy Productions. The name means \"Falconbrook\" in German. The one permanent member is Vratyas Vakyas. \n" +
            "Origin: Germany (1989)\n" +
            "Members: Vratyas Vakyas\n" +
            "Genres: Viking metal, Folk metal, Black metal\n" +
            "Record labels: Napalm Records, Prophecy Productions";
    private  static String Cruachan="\n" +
            "Cruachan is a Folk Metal band from Dublin, Ireland that has been active since the 1990s. They have been acclaimed as having \"gone the greatest lengths of anyone in their attempts to expand\" the genre of folk metal. \n" +
            "Origin: Dublin, Republic of Ireland (1992)\n" +
            "Genres: Folk metal, Celtic metal, Black metal\n" +
            "Members: Keith Fay, Karen Gilligan, John O' Fathaigh, more\n" +
            "Record labels: Hammerheart Records, Candlelight Records, AFM Records";
    private  static String Heidevolk="Heidevolk is a pagan folk metal band from the Netherlands. The lyrical themes of their music are inspired by nature, the history of Gelderland, and the history of Germanic mythology. All of their lyrics are in Dutch.\n" +
            "Genres: Pagan metal, Viking metal, Folk metal\n" +
            "Members: Reamon Bomenbreker, Mark Splintervuyscht, more\n" +
            "Associated acts: Týr, Slechtvalk, Thronar, Arkona\n";
    private  static String OrphanedLand="Orphaned Land is an Israeli progressive metal/folk metal band, formed in 1991 under the name Resurrection, that combines Jewish, Arabic, and other West Asian influences. \n" +
            "\n" +
            "Origin: Petah Tikva, Israel (1991)\n" +
            "Members: Kobi Farhi, Yossi Sassi, Chen Balbus, Matan Shmuely, Uri Zelcha, Avi Diamond, Matti Svatizky, Eden Rabin, Sandman\n" +
            "Past members: Matti Svatizky, Eran Asias, Eden Rabin, Avi Diamond, Yossi Sassi\n";
    private  static String Thyrfing="Thyrfing is a viking metal band from Sweden. The band is named after the royal sword Tyrfing from Norse mythology. \n" +
            "Genres: Viking metal\n" +
            "Origin: Stockholm, Sweden (1995)\n" +
            "Members: Patrik Lindgren, Thomas Väänänen, Peter Löf, Kimmy Sjölund, Joakim Kristensson, Henrik Svegsjö, Jens Rydén\n";
    private  static String Trollfest="Trollfest are a Norwegian folk metal band. The band released their first full-length album, Willkommen Folk Tell Drekka Fest, on the Solistitium Records label on 15 March 2005. \n" +
            "Lead singer: Jostein Austvik\n" +
            "Origin: Oslo, Norway (2003)\n" +
            "Members: Jostein Austvik, John Espen Sagstad, Eirik Renton, more\n";

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

        menutitles = getResources().getStringArray(R.array.bandNamesFolk);
        menuIcons = getResources().obtainTypedArray(R.array.iconsFolk);

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
        if(clickedDetail.equalsIgnoreCase("Arkona")) {
            arr.add(arkona);
        }
        else if(clickedDetail.equalsIgnoreCase("Turisas")){
            arr.add(turisas);

        }
        else if(clickedDetail.equalsIgnoreCase("Suidakra")){
            arr.add(suidakra);

        }
        else if(clickedDetail.equalsIgnoreCase("Amorphis")){
            arr.add(amorphis);

        }
        else if(clickedDetail.equalsIgnoreCase("Agalloch")){
            arr.add(agalloch);

        }
        else if(clickedDetail.equalsIgnoreCase("Ensiferum")){
            arr.add(ensiferum);

        }
        else if(clickedDetail.equalsIgnoreCase("Eluveitie")){
            arr.add(eluveitie);

        }
        else if(clickedDetail.equalsIgnoreCase("Finntroll")){
            arr.add(finntroll);

        }
        else if(clickedDetail.equalsIgnoreCase("Wintersun")){
            arr.add(wintersun);

        }
        else if(clickedDetail.equalsIgnoreCase("Equilibrium")){
            arr.add(equilibrium);

        }
        else if(clickedDetail.equalsIgnoreCase("Týr")){
            arr.add(Tyr);

        }
        else if(clickedDetail.equalsIgnoreCase("Dalriada")){
            arr.add(Dalriada);

        }
        else if(clickedDetail.equalsIgnoreCase("Korpiklaani")){
            arr.add(Korpiklaani);

        }
        else if(clickedDetail.equalsIgnoreCase("Falkenbach")){
            arr.add(Falkenbach);

        }
        else if(clickedDetail.equalsIgnoreCase("Cruachan")){
            arr.add(Cruachan);

        }
        else if(clickedDetail.equalsIgnoreCase("Heidevolk")){
            arr.add(Heidevolk);

        }
        else if(clickedDetail.equalsIgnoreCase("Orphaned Land")){
            arr.add(OrphanedLand);

        }
        else if(clickedDetail.equalsIgnoreCase("Thyrfing")){
            arr.add(Thyrfing);

        }

        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);

        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);
        startActivity(i);

    }
}

