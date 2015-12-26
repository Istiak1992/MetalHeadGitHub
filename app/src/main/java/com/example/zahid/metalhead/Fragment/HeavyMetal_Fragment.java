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
public class HeavyMetal_Fragment extends ListFragment implements AdapterView.OnItemClickListener{

    private static String dio="Dio was an American heavy metal band formed in 1982 and led by vocalist Ronnie James Dio, after he left Black Sabbath with intentions to form a new band with fellow former Black Sabbath member, drummer Vinny Appice. \n" +
            "Lead singer: Ronnie James Dio\n" +
            "Albums: Holy Diver, The Last in Line, Sacred Heart, Dream Evil, more\n" +
            "Genres: Heavy metal, Doom metal\n" +
            "Associated acts: Black Sabbath, Rainbow, Elf, Heaven & Hell, Whitesnake, Rough Cutt";
    private static String korn="Korn is an American nu metal band from Bakersfield, California, formed in 1993. The band's current lineup includes founding members Jonathan Davis, James \"Munky\" Shaffer, Brian \"Head\" Welch, and Reginald ... \n" +
            "Lead singer: Jonathan Davis\n" +
            "Past members: David Silveria\n" +
            "Albums: The Paradigm Shift, Follow the Leader, Issues, more";
    private static String slipKnot="Slipknot is an American heavy metal band from Des Moines, Iowa. Formed in September 1995, the group was founded by percussionist Shawn Crahan and bassist Paul Gray. \n" +
            "Albums: .5: The Gray Chapter, Iowa, Vol. 3:, All Hope Is Gone, more\n" +
            "Lead singers: Corey Taylor (Since 1997), Anders Colsefni (1995 – 1997)\n" +
            "Past members: Anders Colsefni, Donnie Steele, Josh Brainard, Paul Gray, Greg Welts, Brandon Darner, Joey Jordison";
    private static String anvil="Anvil are a Canadian heavy metal band from Toronto, Ontario, formed in 1978. The band consists of Steve \"Lips\" Kudlow, Robb Reiner and Chris Robertson. \n" +
            "Lead singer: Steve \"Lips\" Kudlow\n" +
            "Members: Steve \"Lips\" Kudlow, Robb Reiner, Sal Italiano, more\n" +
            "Past members: Ivan Hurd, Sebastian Marino, Ian Dickson, Dave Allison, Mike Duncan, Glenn Five, Sal Italiano";
    private static String godsmack="Godsmack is an American alternative metal band from Lawrence, Massachusetts, formed in 1995. The band is composed of founder, frontman and songwriter Sully Erna, guitarist Tony Rombola, bassist Robbie Merrill, and drummer Shannon Larkin. \n" +
            "Lead singer: Sully Erna\n" +
            "Origin: Lawrence, Massachusetts, United States (1996)\n" +
            "Albums: Awake, 1000hp, Faceless, Live, Godsmack, IV, more";
    private static String ironMaiden="Iron Maiden are an English heavy metal band formed in Leyton, east London, in 1975 by bassist and primary songwriter Steve Harris. \n" +
            "Origin: Leyton, London, United Kingdom (1975)\n" +
            "Members: Bruce Dickinson, Steve Harris, Nicko McBrain, more\n" +
            "Lead singers: Bruce Dickinson, Paul Di'Anno, Blaze Bayley, Paul Day, Dennis Wilcock";
    private static String queensryche="Queensrÿche /ˈkwiːnzraɪk/ is an American heavy metal band formed in 1982 in Bellevue, Washington out of the local band The Mob. The band has released 14 studio albums, one EP and several DVDs, and continues to tour and record. Wikipedia\n" +
            "Members: Todd La Torre, Michael Wilton, Scott Rockenfield, more\n" +
            "Lead singers: Geoff Tate (1982 – 2012), Todd La Torre (Since 2012)\n" +
            "Past members: Chris DeGarmo, Geoff Tate, Kelly Gray, Mike Stone";
    private static String judasPriest="Judas Priest is a British heavy metal band formed in Birmingham, England, in 1970. The band has sold over 45 million albums to date. MTV ranked them the second greatest metal band of all time. \n" +
            "Origin: Birmingham, United Kingdom (1969)\n" +
            "Albums: Painkiller, British Steel, Redeemer of Souls, more\n" +
            "Lead singers: Rob Halford, Tim \"Ripper\" Owens, Al Atkins";
    private static String kingDiamond="King Diamond is a Danish heavy metal band formed in 1985 by vocalist King Diamond, guitarists Andy LaRocque and Michael Denner, bassist Timi Hansen and drummer Mikkey Dee. \n" +
            "Genres: Heavy metal\n" +
            "Members: King Diamond, Andy LaRocque, Mikkey Dee, Hal Patino, more\n" +
            "Past members: Hal Patino, Michael Denner, Timi Hansen, more";
    private static String aliceCooper="Alice Cooper was an American rock band led by Vincent Furnier, who later changed his legal name to Alice Cooper. The band was famous for their elaborate, theatrical shock rock stage shows. \n" +
            "Origin: Phoenix, Arizona, United States (1965)\n" +
            "Albums: Love It to Death, Billion Dollar Babies, Killer, School's Out, more\n" +
            "Past members: Alice Cooper, Glen Buxton, Michael Owen Bruce, Dennis Dunaway, Neal Smith";
    private static String Ghost="Ghost is a Swedish heavy metal band that was formed in Linköping in 2008. In 2010, they released a 3-track demo followed by a 7\" vinyl titled \"Elizabeth,\" and later their debut full-length album Opus Eponymous. \n" +
            "Origin: Linköping, Sweden (2008)\n" +
            "Members: Papa Emeritus II, Papa Emeritus, Nameless Ghoul Fire, more\n" +
            "Genres: Heavy metal, Doom metal";
    private static String DreamTheater="Dream Theater is an American and Canadian progressive metal and progressive rock band formed in 1985 under the name Majesty by John Petrucci, John Myung, and Mike Portnoy while they attended Berklee College of Music in Massachusetts. \n" +
            "Members: John Petrucci, James LaBrie, Mike Mangini, more\n" +
            "Lead singers: James LaBrie (Since 1991), Charlie Dominici (1987 – 1990), Chris Collins (1987)\n" +
            "Past members: Mike Portnoy, Kevin Moore, Chris Collins, Charlie Dominici, Derek Sherinian";
    private static String GunsNRoses="Guns N' Roses is an American hard rock band from Los Angeles formed in 1985. The classic lineup, as signed to Geffen Records in 1986, consisted of vocalist Axl Rose, lead guitarist Slash, rhythm guitarist ... \n" +
            "Lead singer: Axl Rose\n" +
            "Albums: Appetite for Destruction, Use Your Illusion I, more\n" +
            "Past members: Izzy Stradlin, Tracii Guns, Ole Beich, Rob Gardner, more";
    private static String Manowar="Manowar is an American heavy metal band from New York. Formed in 1980, the group is known for lyrics based on fantasy and mythology. The band is also known for a loud and bombastic sound. \n" +
            "Lead singer: Eric Adams\n" +
            "Members: Joey DeMaio, Eric Adams, Karl Logan, Donnie Hamzik, more\n" +
            "Genres: Heavy metal, Power metal, Speed metal, Symphonic metal";
    private static String Halloween="Halloween is a heavy metal band from Detroit, Michigan. Wikipedia\n" +
            "Origin: Detroit, Michigan, United States\n" +
            "Members: Rick Craig, Brian Thomas, George Neal, Rob Brug, more\n" +
            "Past members: Donny Allen, Billy Adams, Jason Rossvannes, more";
    private static String AcidWitch="Acid Witch is an American heavy metal band formed in Detroit, Michigan, in 2007. They released their first album, Witchtanic Hellucinations, in 2008 on Razorback Records. The band then released two EPs, Witch House in 2009 and Midnight Mass in 2010. \n" +
            "Active from: 2007\n" +
            "Members: Slasher Dave, Lasse Pyykkö, Shagrat, Mike Tuff";
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

        menutitles = getResources().getStringArray(R.array.bandNamesHeavy);
        menuIcons = getResources().obtainTypedArray(R.array.iconsHeavy);

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

        if(clickedDetail.equalsIgnoreCase("Dio")) {
            arr.add(dio);
        }
        else if(clickedDetail.equalsIgnoreCase("Korn")){
            arr.add(korn);

        }
        else if(clickedDetail.equalsIgnoreCase("Anvil")){
            arr.add(anvil);

        }
        else if(clickedDetail.equalsIgnoreCase("SlipKnot")){
            arr.add(slipKnot);

        }
        else if(clickedDetail.equalsIgnoreCase("Godsmack")){
            arr.add(godsmack);

        }
        else if(clickedDetail.equalsIgnoreCase("Iron Maiden")){
            arr.add(ironMaiden);

        }
        else if(clickedDetail.equalsIgnoreCase("Queensryche")){
            arr.add(queensryche);

        }
        else if(clickedDetail.equalsIgnoreCase("Judas Priest")){
            arr.add(judasPriest);

        }
        else if(clickedDetail.equalsIgnoreCase("King Diamond")){
            arr.add(kingDiamond);

        }
        else if(clickedDetail.equalsIgnoreCase("Alice Cooper")){
            arr.add(aliceCooper);

        }
        else if(clickedDetail.equalsIgnoreCase("Ghost")){
            arr.add(Ghost);

        }
        else if(clickedDetail.equalsIgnoreCase("Dream Theater")){
            arr.add(DreamTheater);

        }
        else if(clickedDetail.equalsIgnoreCase("Guns N Roses")){
            arr.add(GunsNRoses);

        }
        else if(clickedDetail.equalsIgnoreCase("Manowar")){
            arr.add(Manowar);

        }
        else if(clickedDetail.equalsIgnoreCase("Halloween")){
            arr.add(Halloween);

        }
        else if(clickedDetail.equalsIgnoreCase("Acid Witch")){
            arr.add(AcidWitch);

        }
        else {}



        Intent i = new Intent(getActivity(), DetailsActivity.class);

        i.putExtra("BandName",clickedDetail);
        i.putStringArrayListExtra("BandInfo", arr);
        startActivity(i);


    }
}