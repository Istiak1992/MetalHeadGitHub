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
public class DoomMetal_Fragment extends ListFragment implements AdapterView.OnItemClickListener{

    private static  String funeral="Funeral are a Norwegian funeral doom band formed in 1991 by Thomas Angell and Anders Eek; soon afterward, Einar Frederiksen joined as bassist and songwriter and Christian Loos joined as guitarist. \n" +
            "Origin: Norway (1991)\n" +
            "Members: Hanne Hukkelberg\n" +
            "Genres: Doom metal, Death-doom, Gothic metal\n" +
            "Record labels: Arctic Serenades, Indie Recordings, Tabu Records";
    private static  String katatonia="Katatonia is a Swedish heavy metal band formed in Stockholm in 1991 by Jonas Renkse and Anders Nyström. \n" +
            "Origin: Stockholm, Sweden (1991)\n" +
            "Members: Jonas Renkse, Anders Nyström, Niklas Sandin, more\n" +
            "Associated acts: Bloodbath, Opeth, October Tide";
    private static  String pentagram="Pentagram is an American heavy metal band from Alexandria, Virginia, most famous as one of the pioneers of heavy metal, and the subgenre of doom metal in particular. \n" +
            "Albums: Relentless, Curious Volume, more\n" +
            "Genres: Heavy metal, Doom metal\n" +
            "Record labels: Peaceville Records, Metal Blade Records, Relapse Records, Season of Mist, Black Widow Records";
    private static  String candleMass="Candlemass is an influential Swedish doom metal band established in Stockholm 1984 by bassist, songwriter and bandleader Leif Edling and drummer Matz Ekström. \n" +
            "Genres: Doom metal\n" +
            "Members: Leif Edling, Mats Levén, Mats Björkman, Jan Lindh, more\n" +
            "Lead singers: Messiah Marcolin, Mats Levén, Robert Lowe, Thomas Vikström, Johan Längqvist, Björn Flodkvist";
    private static  String saintVitus="Saint Vitus is an American doom metal band from Los Angeles, formed in 1979. They consist of founding members Dave Chandler and Mark Adams, alongside sporadic singer Scott Weinrich and recently added drummer Henry Vasquez. \n" +
            "Members: Scott Weinrich, Dave Chandler, Henry Vasquez, Mark Adams, Scott Reagers, Armando Acosta, Christian Lindersson\n" +
            "Lead singers: Scott Weinrich, Scott Reagers, Christian Lindersson\n" +
            "Genres: Doom metal, Heavy metal\n" +
            "Past members: Armando Acosta, Scott Reagers";
    private static  String blackSabbath="Black Sabbath are an English rock band, formed in Birmingham in 1968, by guitarist and main songwriter Tony Iommi, bassist and main lyricist Geezer Butler, singer Ozzy Osbourne, and drummer Bill Ward. \n" +
            "Lead singer: Ozzy Osbourne►\n" +
            "Origin: Aston, United Kingdom (1968)\n" +
            "Albums: Paranoid, 13, Black Sabbath, Master of Reality, more";
    private static  String paradiseLost="Paradise Lost are a doom metal band that formed in 1988 in Halifax, England and are considered by some to be one of the pioneers of the doom metal genre. \n" +
            "Origin: Halifax, United Kingdom (1988)\n" +
            "Members: Nick Holmes, Gregor Mackintosh, Adrian Erlandsson, more\n" +
            "Record labels: Century Media Records, Peaceville Records, more";
    private static  String myDyingBrides="My Dying Bride are an English doom metal band formed in Bradford, England in 1990. To date, My Dying Bride have released twelve full-length studio albums, three EPs, one demo, one box set, four compilation ... \n" +
            "Record label: Peaceville Records\n" +
            "Members: Aaron Stainthorpe, Lena Abé, Andrew Craighan, more\n" +
            "Genres: Doom metal, Death-doom, Gothic metal\n" +
            "Past members: Martin Powell, Bill Law, Shaun Steels, more";
    private static  String typeONegative="Type O Negative was an American gothic/doom metal band formed in Brooklyn, New York City in 1989. Their lyrical emphasis on themes of romance, depression, and death resulted in the nickname \"The Drab Four\". \n" +
            "Lead singer: Peter Steele\n" +
            "Albums: October Rust, Bloody Kisses, Slow, Deep and Hard, more\n" +
            "Past members: Peter Steele, Kenny Hickey, Josh Silver, Sal Abruscato, Johnny Kelly\n" +
            "Genres: Gothic metal, Doom metal";
    private static  String electricWizard="Electric Wizard are an English doom metal band from Dorset, England. The band formed in 1993 and have recorded eight full length albums, two of which are now considered to be genre landmarks: Come My Fanatics... and Dopethrone. \n" +
            "Lead singer: Jus Oborn\n" +
            "Members: Liz Buckingham, Jus Oborn, Simon Poole, more\n" +
            "Genres: Doom metal, Sludge metal, Stoner rock\n" +
            "Past members: Mark Greening, Tim Bagshaw, Justin Greaves, Glenn Charman, Simon Poole";
    private static  String cathedral="Cathedral were a doom metal band from Coventry, England. The group gained attention upon release of its debut album, Forest of Equilibrium, which is considered a classic of the genre. \n" +
            "Origin: Coventry, United Kingdom (1989)\n" +
            "Members: Lee Dorrian, Garry \"Gaz\" Jennings, Leo Smee, more\n" +
            "Genres: Doom metal, Stoner rock, Heavy metal\n" +
            "Record labels: Rise Above Records, Earache Records, more";
    private static  String SwallowtheSun="Swallow the Sun is a Finnish melodic death/doom metal band. With their first three albums, they played a more traditional style of death/doom metal, but with the release of the EP Plague of Butterflies ... \n" +
            "Origin: Jyväskylä, Finland (2001)\n" +
            "Members: Mikko Kotamäki, Juha Raivio, Kai Hahto, Markus Jämsen, Aleksi Munter, Matti Honkonen, Pasi Pasanen\n" +
            "Genres: Death-doom, Melodic death metal, Progressive metal\n" +
            "Record labels: Century Media Records, Spinefarm Records, Firebox Records\n";
    private static  String ReverendBizarre="Reverend Bizarre was a doom metal band from Finland. They played slow and heavy traditional doom with dramatic vocals, following in the footsteps of bands such as Saint Vitus, Pentagram and Black Sabbath. \n" +
            "Genres: Doom metal\n" +
            "Origin: Lohja, Finland (1995)\n" +
            "Record label: Spinefarm Records\n" +
            "Members: Albert Witchfinder, Peter Vicar, Earl of Void, Juha-Petteri Lundqvist";
    private static  String Draconian="Draconian is a metal band from Säffle, Sweden formed in 1994. \n" +
            "Associated acts: DOOM:VS\n" +
            "Record label: Napalm Records\n" +
            "Origin: Säffle, Sweden (1995)\n" +
            "Members: Heike Langhans, DOOM:VS, Lisa Johansson, more";
 private static  String WitchfinderGeneral="Witchfinder General were a doom metal band from Stourbridge, England. They were part of the New Wave of British Heavy Metal scene and have been cited as a major influence on the doom metal genre. \n" +
            "Origin: Stourbridge, United Kingdom (1979)\n" +
            "Albums: Death Penalty, Buried Amongst the Ruins, Live '83, Friends of Hell, Resurrected, Soviet Invasion\n" +
            "Members: Zeeb Parkes, Phil Cope, Gary Martin, Steve Kinsell, more\n" +
            "Genres: Heavy metal, Doom metal\n" +
            "Past members: Gary Martin, Dermot Redmond, Rod Hawkes, more";
    private static  String Skepticism="Skepticism is a funeral doom metal band from Finland. Formed in 1991, they are regarded as one of the pioneers of the genre. \n" +
            "Origin: Riihimäki, Finland (1991)\n" +
            "Members: Jani Kekarainen, Matti Tilaeus, Lasse Pelkonen, Eero Pöyry, Tobias Kellgren\n";

    private static  String SolitudeAeturnus="Solitude Aeturnus is an American epic doom metal band that was started in spring 1987 as Solitude, in Arlington, Texas. Their vocalist, Robert Lowe, was also the singer for the influential doom metal band Candlemass between 2007 and 2012. \n" +
            "Lead singer: Robert Lowe\n" +
            "Origin: Arlington, Texas, United States (1987)\n" +
            "Genres: Doom metal\n" +
            "Members: Robert Lowe, John Perez, Count Lyle, Edgar Rivera, Kris Gabehardt\n";


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

        menutitles = getResources().getStringArray(R.array.bandNamesDoom);
        menuIcons = getResources().obtainTypedArray(R.array.iconsDoom);

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
        if(clickedDetail.equalsIgnoreCase("Funeral")) {
            arr.add(funeral);
        }
        else if(clickedDetail.equalsIgnoreCase("Katatonia")){
            arr.add(katatonia);

        }
        else if(clickedDetail.equalsIgnoreCase("Pentagram")){
            arr.add(pentagram);

        }
        else if(clickedDetail.equalsIgnoreCase("Candlemass")){
            arr.add(candleMass);

        }
        else if(clickedDetail.equalsIgnoreCase("Saint Vitus")){
            arr.add(saintVitus);

        }
        else if(clickedDetail.equalsIgnoreCase("Black Sabbath")){
            arr.add(blackSabbath);

        }
        else if(clickedDetail.equalsIgnoreCase("Paradise Lost")){
            arr.add(paradiseLost);

        }
        else if(clickedDetail.equalsIgnoreCase("My Dying Bride")){
            arr.add(myDyingBrides);

        }
        else if(clickedDetail.equalsIgnoreCase("Type O Negative")){
            arr.add(typeONegative);

        }
        else if(clickedDetail.equalsIgnoreCase("Electric Wizard")){
            arr.add(electricWizard);

        }
        else if(clickedDetail.equalsIgnoreCase("Cathedral")){
            arr.add(cathedral);

        }
        else if(clickedDetail.equalsIgnoreCase("Swallow The Sun")){
            arr.add(SwallowtheSun);

        }
        else if(clickedDetail.equalsIgnoreCase("Reverend Bizarre")){
            arr.add(ReverendBizarre);

        }
        else if(clickedDetail.equalsIgnoreCase("Draconian")){
            arr.add(Draconian);

        }
        else if(clickedDetail.equalsIgnoreCase("Witchfinder General")){
            arr.add(WitchfinderGeneral);

        }
        else if(clickedDetail.equalsIgnoreCase("Skepticism")){
            arr.add(Skepticism);

        }
        else if(clickedDetail.equalsIgnoreCase("Solitude Aeturnus")){
            arr.add(SolitudeAeturnus);

        }


        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);

        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);
        startActivity(i);



    }
}