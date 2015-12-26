package com.example.zahid.metalhead.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.TypedArray;
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
public class BlackMetal_Fragment extends ListFragment  implements AdapterView.OnItemClickListener{


    private static String mayhem="Mayhem is a Norwegian black metal band formed in 1984 in Oslo, regarded as one of the pioneers of the Norwegian black metal scene. \n" +
            "Genres: Black metal\n" +
            "Members: Attila Csihar, Necrobutcher, Jan Axel Blomberg, Teloch, more\n" +
            "Record labels: Season of Mist, Deathlike Silence Productions, more ";
    private static  String venom="Venom are an English extreme metal band that formed in 1979 in Newcastle upon Tyne. Coming to prominence towards the end of the New Wave of British Heavy Metal, Venom's first two albums—Welcome to Hell .\n" +
            "Members: Conrad Thomas Lant, Jeffrey Dunn, Tony Dolan, more\n" +
            "Genres: Thrash metal, Black metal, Speed metal\n" +
            "Associated acts: Atomkraft, Cronos";
    private static  String burzum="Burzum is a musical project of Norwegian musician and writer Varg Vikernes. Vikernes began making music in 1988, but it was not until 1991 that he recorded his first demos as Burzum. \n" +
            "Origin: Bergen, Norway (1987)\n" +
            "Members: Varg Vikernes\n" +
            "Genres: Black metal, Dark ambient, Neo-Medieval music\n" +
            "Associated acts: Mayhem, Old Funeral, Darkthrone, Immortal, Thorns";
    private static String bathory="Bathory was an extreme metal band formed in Vällingby in 1983 and named after the infamous Hungarian countess, Elizabeth Báthory. The band's frontman and main songwriter was Quorthon. \n" +
            "Origin: Vällingby, Sweden (1983)\n" +
            "Members: Quorthon, Vvornth, Kothaar, Fredrick Hanoi\n" +
            "Genres: Black metal, Viking metal\n" +
            "Record labels: Black Mark Productions, Noise Records" ;
    private static  String emperor="Emperor was a Norwegian black metal band formed in 1991, regarded as highly influential by critics and emerging black metal bands. \n" +
            "Members: Ihsahn, Samoth, Faust, Tchort, Mortiis, Alver\n" +
            "Lead singers: Ihsahn, Samoth\n" +
            "Genres: Black metal, Symphonic black metal, Progressive metal\n" +
            "Past members: Alver, Tchort, Trym Torson";
    private static  String immortal="Immortal is a black metal band from Bergen, Norway, founded in 1990 by frontman and guitarist Abbath Doom Occulta and former guitarist Demonaz Doom Occulta. \n" +
            "Active until: 2015\n" +
            "Origin: Bergen, Norway (1990)\n" +
            "Albums: All Shall Fall, At the Heart of Winter, more\n" +
            "Associated acts: Old Funeral, Mayhem, Gorgoroth, Borknagar, I, Hypocrisy, Aura Noir, Abbath";
    private static String behemoth="Behemoth is a Polish blackened death metal band from Gdańsk, formed in 1991. They are considered to have played an important role in establishing the Polish extreme metal underground. \n" +
            "Lead singer: Adam Darski\n" +
            "Albums: Evangelion, The Satanist, Demigod, Satanica, more\n" +
            "Record labels: Nuclear Blast, Metal Blade Records, more";
    private static String gorgoroth="Gorgoroth is a Norwegian black metal band based in Bergen. Formed in 1992 by Infernus, the band is named after the dead plateau of evil and darkness in the land of Mordor from J. R. R. Tolkien's fantasy novel The Lord of the Rings. \n" +
            "Genres: Black metal\n" +
            "Film music credits: True Norwegian Black Metal\n" +
            "Albums: Instinctus Bestialis, Under the Sign of Hell, more\n" +
            "Record labels: Nuclear Blast, Regain Records, Season of Mist, more";
    private static String darkThrone="Darkthrone is an influential Norwegian metal band. They formed in 1986 as a death metal band under the name Black Death. \n" +
            "Origin: Kolbotn, Norway (1987)\n" +
            "Members: Fenriz, Nocturno Culto, Ivar Enger, Dag Nilsen\n" +
            "Associated acts: Dødheimsgard, Isengard, Neptune Towers, Sarke, Satyricon, Storm, Valhall\n" +
            "Record labels: Peaceville Records, Moonfog Productions";
    private static String dimmuBrggir="Dimmu Borgir is a Norwegian symphonic black metal band from Oslo, Norway, formed in 1993. The name is derived from Dimmuborgir, a volcanic formation in Iceland, the name of which means \"dark cities\" ..\n" +
            "Lead singer: Silenoz\n" +
            "Genres: Symphonic black metal\n" +
            "Members: Shagrath, Silenoz, Galder, Dariusz Brzozowski, more\n" +
            "Associated acts: Old Man's Child, Cradle of Filth, Ov Hell, more";
    private static String  satyricon ="Satyricon is a Norwegian black metal band, formed in 1991 in Oslo. Satyr and Frost have been the band's core members since 1993. The band's first three albums typify the Norwegian black metal style. \n" +
            "Genres: Black metal\n" +
            "Members: Sigurd Wongraven, Kjetil-Vidar Haraldstad, more\n" +
            "Associated acts: Zyklon-B, Emperor, Darkthrone, Dødheimsgard\n" +
            "Record labels: Moonfog Productions, Century Media Records, Roadrunner Records, EMI, Sony BMG";
    private static String  inquisition ="Inquisition is a metal band that formed in Cali, Colombia in 1988 and later relocated to Seattle, Washington. \n" +
            "Origin: Cali, Colombia (1988)\n" +
            "Members: Dagon, Carlos Arcila, Endhir Xo Kpurtos, John Santa, Incubus, Cesar Santa, Debandt\n" +
            "Record labels: Season of Mist, No Colours Records";
    private static String  celticfrost ="Celtic Frost /ˈkɛltɪk frɒst/ was a Swiss extreme metal band from Zürich. They are known for their heavy influence on extreme metal genres. The group was first active from 1984 to 1993, and re-formed in 2001. \n" +
            "Genres: Extreme metal\n" +
            "Origin: Zürich, Switzerland (1984)\n" +
            "Members: Thomas Gabriel Fischer, Martin Eric Ain, Reed St. Mark, more\n" +
            "Associated acts: Hellhammer, Kia Stevens";
    private static String  darkFuneral ="Dark Funeral is a Swedish black metal band from Stockholm Sweden, founded by guitarists Blackmoon and Lord Ahriman in 1993. They emerged during the second wave of black metal. \n" +
            "Genres: Black metal\n" +
            "Albums: The Secrets of the Black Arts, Attera Totus Sanctus, more\n" +
            "Past members: David Parland, Paul Mäkitalo, more";
    private static String  watin ="Watain are a Swedish black metal band from Uppsala, formed in 1998. The band's name is taken from a recording by the American black metal group Von. \n" +
            "Genres: Black metal\n" +
            "Members: Erik Danielsson, Pelle Forsberg, Håkan Jonsson\n" +
            "Associated acts: Dissection, Funeral Mist, Malign";
    private static String  mercyfull ="Mercyful Fate is a Danish heavy metal band from Copenhagen, formed in 1981 by vocalist King Diamond and guitarist Hank Shermann. \n" +
            "Albums: Don't Break the Oath, Melissa, In the Shadows, 9, Time, more\n" +
            "Genres: Heavy metal, Black metal\n" +
            "Past members: Timi Hansen, Kim Ruzz, Benny Petersen, Michael Denner, Snowy Shaw";




    String[] menutitles;
    TypedArray menuIcons;
    CustomArrayAdapter adapter;
    private List<RowItem> rowItems;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.black_metal_layout, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitles = getResources().getStringArray(R.array.bandNames);
        menuIcons = getResources().obtainTypedArray(R.array.icons);

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

        if(clickedDetail.equalsIgnoreCase("Venom")) {
            arr.add(venom);

        }
        else if(clickedDetail.equalsIgnoreCase("Mayhem")){
            arr.add(mayhem);

        }
        else if(clickedDetail.equalsIgnoreCase("Burzum")){
            arr.add(burzum);

        }
        else if(clickedDetail.equalsIgnoreCase("Bathory")){
            arr.add(bathory);

        }
        else if(clickedDetail.equalsIgnoreCase("Emperor")){
            arr.add(emperor);

        }
        else if(clickedDetail.equalsIgnoreCase("Immortal")){
            arr.add(immortal);

        }
        else if(clickedDetail.equalsIgnoreCase("Behemoth")){
            arr.add(behemoth);

        }
        else if(clickedDetail.equalsIgnoreCase("Gorgoroth")){
            arr.add(gorgoroth);

        }
        else if(clickedDetail.equalsIgnoreCase("DarkThrone")){
            arr.add(darkThrone);

        }
        else if(clickedDetail.equalsIgnoreCase("Dimmu Borgir")){
            arr.add(dimmuBrggir);

        }
        else if(clickedDetail.equalsIgnoreCase("Satyricon")){
            arr.add(satyricon);

        }
        else if(clickedDetail.equalsIgnoreCase("Inquisition")){
            arr.add(inquisition);

        }
        else if(clickedDetail.equalsIgnoreCase("Celtic Frost")){
            arr.add(celticfrost);

        }
        else if(clickedDetail.equalsIgnoreCase("Watin")){
            arr.add(watin);

        }
        else if(clickedDetail.equalsIgnoreCase("Dark Funeral")){
            arr.add(darkFuneral);


        }
        else if(clickedDetail.equalsIgnoreCase("Mercyfull Fate")){
            arr.add(mercyfull);


        }
        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);
        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);



        startActivity(i);

    }



}
