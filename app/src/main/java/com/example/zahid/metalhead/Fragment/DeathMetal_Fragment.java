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
public class DeathMetal_Fragment extends ListFragment implements AdapterView.OnItemClickListener {

    private static String death = "Death was an American death metal band from Orlando, Florida, founded in 1983 by guitarist and vocalist Chuck Schuldiner. Death is considered to be one of the most influential bands in heavy metal and a pioneering force in death metal. \n" +
            "Lead singer: Chuck Schuldiner\n" +
            "Members: Chuck Schuldiner, Scott Clendenin, Gene Hoglan, more\n" +
            "Associated acts: Control Denied, Voodoocult, Slaughter, Massacre, more\n" +
            "Record labels: Nuclear Blast, Relapse Records, Roadrunner Records, Combat Records, Relativity Records";
    private static String nile = "Nile is an American technical death metal band from Greenville, South Carolina, United States, formed in 1993. \n" +
            "Genres: Technical death metal►\n" +
            "Members: Karl Sanders, George Kollias, Dallas Toler-Wade, more\n" +
            "Record labels: Nuclear Blast, Relapse Records, Megaforce Records";
    private static String opeth = "Opeth is a Swedish heavy metal band from Stockholm, formed in 1990. Though the group has been through several personnel changes, singer, guitarist, and songwriter Mikael Åkerfeldt has remained Opeth's ... \n" +
            "Members: Mikael Åkerfeldt, Martín Méndez, Fredrik Åkesson, more\n" +
            "Associated acts: Bloodbath, Katatonia, Storm Corrosion\n" +
            "Genres: Technical death metal, Progressive metal, Progressive rock\n" +
            "Lead singers: Mikael Åkerfeldt (Since 1990), David Isberg (1990 – 1992)";
    private static String deicide = "Deicide is an American death metal band formed in 1987 by bassist and vocalist Glen Benton and drummer Steve Asheim. \n" +
            "Lead singer: Glen Benton\n" +
            "Albums: Legion, Once Upon the Cross, In the Minds of Evil, more\n" +
            "Associated acts: Obituary, Cannibal Corpse, Vital Remains, Adrift, Order of Ennead";
    private static String deathLok = "Dethklok is both a virtual band featured in the Adult Swim animated program Metalocalypse and a real band created to perform the band's melodic death metal music in live shows. Both bands were created by Brendon Small and Tommy Blacha. ►\n" +
            "Origin: United States of America (2006)\n" +
            "Record label: Williams Street Records\n" +
            "Albums: The Dethalbum, The Doomstar Requiem, Dethalbum III, more\n" +
            "Genres: Melodic death metal, Death metal";
    private static String amonAmarth = "Amon Amarth is a Swedish melodic death metal band from Tumba, founded in 1992. The band takes its name from the Sindarin name of Mount Doom, a volcano in J. R. R. Tolkien′s Middle-earth. \n" +
            "Genres: Melodic death metal\n" +
            "Origin: Tumba, Sweden (1992)\n" +
            "Members: Johan Hegg, Fredrik Andersson, Olavi Mikkonen, more";
    private static String lambOfGod = "Lamb of God is an American heavy metal band from Richmond, Virginia. Formed in 1994, the group consists of vocalist Randy Blythe, guitarists Mark Morton and Willie Adler, bassist John Campbell, and drummer Chris Adler. \n" +
            "Past members: Abe Spear\n" +
            "Origin: Richmond, Virginia, United States (1990)\n" +
            "Albums: VII: Sturm und Drang, Wrath, Resolution, Sacrament, more";
    private static String morbidAngel = "Morbid Angel is an American death metal band based in Tampa, Florida. UK music magazine Terrorizer ranked Morbid Angel's 1989 debut Altars of Madness first in its list \"Top 40 greatest death metal albums\". \n" +
            "Genres: Death metal\n" +
            "Lead singer: David Vincent\n" +
            "Members: David Vincent, Trey Azagthoth, Tim Yeung, Destructhor, more\n" +
            "Past members: David Vincent, Pete Sandoval, Tim Yeung, more";
    private static String cannibalCorpse = "Cannibal Corpse is an American death metal band from Buffalo, New York. Formed in December 1988, the band has released thirteen studio albums, two box sets, four video albums and one live album. \n" +
            "Genres: Death metal\n" +
            "Members: George Fisher, Alex Webster, Pat O'Brien, Paul Mazurkiewicz, Rob Barrett, Chris Barnes, Jack Owen, Bob Rusay\n" +
            "Lead singers: George Fisher (Since 1995), Chris Barnes (1988 – 1995)";
    private static String childreanOfBodom = "Children of Bodom is a melodic death metal band from Espoo, Finland. Formed in 1993, the group currently consists of Alexi Laiho, Janne Wirman, Henkka Seppälä, and Jaska Raatikainen. \n" +
            "Lead singer: Alexi Laiho\n" +
            "Members: Alexi Laiho, Roope Latvala, Janne Wirman, more\n" +
            "Genres: Melodic death metal, Power metal, Thrash metal, Symphonic black metal";
    private static String Carcass="Carcass are a British melodic death metal band from Liverpool, who formed in 1985 and disbanded in 1995. A reformation was enacted in 2007 without one of its original members, drummer Ken Owen, due to health reasons. \n" +
            "Lead singer: Jeffrey Walker\n" +
            "Members: Jeffrey Walker, Bill Steer, Ben Ash, Daniel Wilding, more\n" +
            "Associated acts: Napalm Death, Brujeria, Blackstar, Firebird, Arch Enemy\n";


    private static String Suffocation="Suffocation is an American death metal band that was formed in 1988 in Centereach, Long Island, New York, United States. \n" +
            "Genres: Technical death metal\n" +
            "Members: Frank Mullen, Terrance Hobbs, Kevin Talley, more\n" +
            "Past members: Doug Cerrito, Josh Barohn, Chris Richards, Doug Bohn, Mike Smith, Dave Culross\n";
    private static String Vader="Vader is a Polish death metal band from Olsztyn. Formed in 1983, the group was founded by then-bassist Piotr \"Peter\" Wiwczarek and guitarist Zbigniew \"Vika\" Wróblewski. \n" +
            "Genres: Death metal\n" +
            "Origin: Olsztyn, Poland (1986)\n" +
            "Members: Piotr Wiwczarek, Marek Pajak, Tomasz Halicki, more\n" +
            "Associated acts: Sweet Noise, Vesania, Dies Irae, Decapitated, Behemoth";
    private static String BoltThrower="Bolt Thrower are a British death metal band from Coventry, England. They formed in 1986 and released their first album with Vinyl Solution in 1988. \n" +
            "Genres: Death metal\n" +
            "Origin: Coventry, United Kingdom (1986)\n" +
            "Albums: Honour – Valour – Pride, War Master, Realm of Chaos, more\n" +
            "Record labels: Earache Records, Metal Blade Records, Vinyl Solution, Combat Records, Relativity Records";
    private static String Decapitated="Decapitated is a Polish death metal band formed in Krosno in 1996. The group comprises guitarist, founder and composer Waclaw \"Vogg\" Kieltyka, vocalist Rafal Piotrowski, bassist Pawel Pasek, and drummer Michal Lysejko. \n" +
            "Genres: Technical death metal\n" +
            "Origin: Krosno, Poland (1996)\n" +
            "Members: Waclaw Kieltyka, Pawel Jaroszewicz, more\n" +
            "Past members: Witold Kieltyka, Marcin Rygiel, Wojciech Wasowicz, Adrian Kowanek, Filip Halucha, Kerim Lechner\n";
    private static String DyingFetus="Dying Fetus is an American death metal band originally from Upper Marlboro, Maryland. Formed in 1991, the group is known for their consistently hook-laden song structures, characterized by blast beats, \n" +
            "Record label: Relapse Records\n" +
            "Origin: Greater Upper Marlboro, Maryland, United States (1991)\n" +
            "Members: Trey Williams, Sean Beasley, John Gallagher, Kevin Talley, Jason Netherton, Sparky Voyles, Derek Boyer, Bruce Greig\n" +
            "Genres: Technical death metal, Death metal\n";

    private static String Gorguts="Gorguts is a Canadian technical death metal band from Sherbrooke, Quebec. The band was formed in 1989; its only constant member has been Luc Lemay. \n" +
            "Genres: Technical death metal\n" +
            "Origin: Sherbrooke, Canada (1989)\n" +
            "Members: Luc Lemay, Colin Marston, Kevin Hufnagel, more\n" +
            "Associated acts: Dysrhythmia, Origin, Behold... The Arctopus, Martyr, Negativa\n";
    private static String Disgorge="Disgorge is a death metal band from San Diego, California, formed in 1992. Wikipedia\n" +
            "Genres: Death metal\n" +
            "Origin: San Diego, California, United States (1992)\n" +
            "Record labels: Unique Leader Records, Crash Music Inc.\n";
    private static String Necrophagist="Necrophagist is a German technical death metal band, founded and fronted by guitarist and vocalist Muhammed Suiçmez. The band is known for its rapid and technical compositions. \n" +
            "Genres: Technical death metal\n" +
            "Origin: Gaggenau, Germany (1992)\n" +
            "Albums: Epitaph, Onset of Putrefaction\n" +
            "Record labels: Relapse Records, Willowtip Records\n";
    private static String Devourment="Devourment is an American death metal band from Dallas, Texas. Formed in 1995, the band has split up and reformed three times and Brad Fincher is the only original member. \n" +
            "Origin: Dallas, Texas, United States (1995)\n" +
            "Genres: Death metal\n" +
            "Record label: Relapse Records\n" +
            "Members: Mike Majewski, Ruben Rosas, Eric Park, Chris Andrews\n" +
            "\n";
    private static String DarkTranquillity="Dark Tranquillity is a Swedish melodic death metal band from Gothenburg. They are one of the longest-standing bands from the original Gothenburg metal scene. \n" +
            "Genres: Melodic death metal\n" +
            "Members: Mikael Stanne, Niklas Sundin, Martin Henriksson, more\n" +
            "Associated acts: Lucyfire, Solution .45, Theatre of Tragedy, Dimension Zero, Soilwork, All Ends, HammerFall, In Flames\n" +
            "Record labels: Century Media Records, Osmose Productions, Spinefarm Records\n";
    private static String Obituary="Obituary is an American death metal band formed in October 1984 in Tampa, Florida, United States, under the name Executioner, then changed the name's spelling to Xecutioner before finally changing their name to Obituary in 1988. Wikipedia\n" +
            "Genres: Death metal\n" +
            "Members: John Tardy, Trevor Peres, Donald Tardy, Terry Butler, more\n" +
            "Record labels: Roadrunner Records, Relapse Records, Candlelight Records\n";

    String[] menutitlesdeth;
    TypedArray menuIconsdeath;
    CustomArrayAdapter adapter;
    private List<RowItem> rowItemsDeath;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.death_metal_layout, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        menutitlesdeth = getResources().getStringArray(R.array.death);
        menuIconsdeath = getResources().obtainTypedArray(R.array.deathIcons);

        rowItemsDeath = new ArrayList<RowItem>();

        for (int i = 0; i < menutitlesdeth.length; i++) {
            RowItem itemsdeath = new RowItem(menutitlesdeth[i], menuIconsdeath.getResourceId(
                    i, -1));

            rowItemsDeath.add(itemsdeath);
        }

        adapter = new CustomArrayAdapter(getActivity(), rowItemsDeath);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), menutitlesdeth[position], Toast.LENGTH_SHORT)
                .show();

        ArrayList<String> arr = new ArrayList<String>();
        String clickedDetail = menutitlesdeth[position];
        if (clickedDetail.equalsIgnoreCase("Death")) {
            arr.add(death);
        } else if (clickedDetail.equalsIgnoreCase("Nile")) {
            arr.add(nile);

        } else if (clickedDetail.equalsIgnoreCase("Opeth")) {
            arr.add(opeth);

        } else if (clickedDetail.equalsIgnoreCase("Deicide")) {
            arr.add(deicide);

        } else if (clickedDetail.equalsIgnoreCase("Deathlok")) {
            arr.add(deathLok);

        } else if (clickedDetail.equalsIgnoreCase("Amon Amarth")) {
            arr.add(amonAmarth);

        } else if (clickedDetail.equalsIgnoreCase("Lamb Of God")) {
            arr.add(lambOfGod);

        } else if (clickedDetail.equalsIgnoreCase( "Morbid Angel")) {
            arr.add(morbidAngel);

        } else if (clickedDetail.equalsIgnoreCase( "Cannibal Corpse")) {
            arr.add(cannibalCorpse);

        }
        else if (clickedDetail.equalsIgnoreCase("Children Of Bodom")) {
            arr.add(childreanOfBodom);

        }
        else if (clickedDetail.equalsIgnoreCase("Carcass")) {
            arr.add(Carcass);

        }
        else if (clickedDetail.equalsIgnoreCase("Suffocation")) {
            arr.add(Suffocation);

        }
        else if (clickedDetail.equalsIgnoreCase("Vader")) {
            arr.add(Vader);

        }

        else if (clickedDetail.equalsIgnoreCase("Bolt Thrower")) {
            arr.add(BoltThrower);

        }

        else if (clickedDetail.equalsIgnoreCase("Decapitated")) {
            arr.add(Decapitated);

        }

        else if (clickedDetail.equalsIgnoreCase("Dying Fetus")) {
            arr.add(DyingFetus);

        }

        else if (clickedDetail.equalsIgnoreCase("Gorguts")) {
            arr.add(Gorguts);

        }

        else if (clickedDetail.equalsIgnoreCase("Disgorge")) {
            arr.add(Disgorge);

        }

        else if (clickedDetail.equalsIgnoreCase("Necrophagist")) {
            arr.add(Necrophagist);

        }

        else if (clickedDetail.equalsIgnoreCase("Devourment")) {
            arr.add(Devourment);

        }

        else if (clickedDetail.equalsIgnoreCase("Dark Tranquillity")) {
            arr.add(DarkTranquillity);

        }

        else if (clickedDetail.equalsIgnoreCase("Obituary")) {
            arr.add(Obituary);

        }




        else {
        }
        Intent i = new Intent(getActivity(), DetailsActivity.class);
        i.putExtra("BandName", clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);


        startActivity(i);





/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
                numbers_text);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String clickedDetail = (String)l.getItemAtPosition(position);



        ArrayList<String> arr=new ArrayList<String>();
        if(clickedDetail=="Death") {
            arr.add(death);
        }
        else if(clickedDetail=="Nile"){
            arr.add(nile);

        }
        else if(clickedDetail=="Opeth"){
            arr.add(opeth);

        }
        else if(clickedDetail=="Deicide"){
            arr.add(deicide);

        }
        else if(clickedDetail=="Deathlok"){
            arr.add(deathLok);

        }
        else if(clickedDetail=="Amon Amarth"){
            arr.add(amonAmarth);

        }
        else if(clickedDetail=="Lamb Of God"){
            arr.add(lambOfGod);

        }
        else if(clickedDetail=="Morbid Angel"){
            arr.add(morbidAngel);

        }
        else if(clickedDetail=="Cannibal Corpse"){
            arr.add(cannibalCorpse);

        }
        else if(clickedDetail=="Children Of Bodom"){
            arr.add(childreanOfBodom);

        }
        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);

        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo",arr);
        startActivity(i);



    }*/
    }

}