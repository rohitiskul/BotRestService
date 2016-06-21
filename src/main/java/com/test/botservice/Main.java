package com.test.botservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Rohit on 6/16/2016.
 */
@SpringBootApplication
public class Main {

    public static final String json = "{\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"slot\": \"5:30 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"57616388c0133aee48599043\",\n" +
            "          \"fb_id\": \"954017248029496\",\n" +
            "          \"name\": \"Belly Dance Regular Classes\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c0.25.200.200/p200x200/13428378_910038142457664_2299206225420064852_n.jpg?oh=ff4aa194a770572de1ee851717d0ba68&oe=57CE6E01\",\n" +
            "          \"description\": \"Belly Dance Regular Classes with Shiraz Irani Starting at the Pod from this week every Tuesdays and Thursdays. Class Timings : Tuesdays : 10:30 am - 11:30 am , Thursdays : 5:30 pm - 6:30 pm\",\n" +
            "          \"venue\": \"The Learning Pod\",\n" +
            "          \"startTime\": 1466078400000,\n" +
            "          \"endTime\": 1466082000000,\n" +
            "          \"address\": \"1st floor, raviraj cru mall, kondhwa- bibewadi road, Pune, India, 411037\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/954017248029496\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.46652,\n" +
            "            \"longitude\": 73.8767\n" +
            "          },\n" +
            "          \"distance\": \"10 km\",\n" +
            "          \"fbAttendingCount\": 0\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466078400000\n" +
            "    },\n" +
            "    {\n" +
            "      \"slot\": \"7:00 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"57603cecc0133aee4859902a\",\n" +
            "          \"fb_id\": \"589382451231442\",\n" +
            "          \"name\": \"Dhanak Preview at Lost The Plot Rooftop Cinema\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c262.0.200.200/p200x200/13315808_687837598021776_5517661379266820437_n.jpg?oh=7fe741f964dcfcbc683851c2818f2e57&oe=5808853A\",\n" +
            "          \"description\": \"Lost The Plot is proud to be associated as the official Rooftop Cinema partner for Nagesh Kukunoor's upcoming film Dhanak. Two exclusive previews of the film will be held at our Open-Air Rooftop venue, with the Director & cast in attendance. Don't miss the chance to watch Dhanak a day before the entire world, in the presence of its cast & crew, with the lovely monsoon breeze for company!\\n\\nA tale filled with travel and adventure, Dhanak premiered at the 65th Berlin International Film Festival where it won a number of awards including the Crystal Bear Grand Prix for Best Children's Film. It also aired to much applause at the International Film Festival LA & the TIFF Kids International Film Festival.\\n\\nDhanak tells the story of Pari who has promised her blind little brother Chotu that she'll help get his eyesight back before he turns 10. When she spots her favorite star Shah Rukh Khan on the poster for an eye-donation drive, she sets off with Chotu on a magical journey through Rajasthan where they encounter a series of colourful characters.\\n\\nLost The Plot is Pune's only Rooftop Cinema & lounge. We screen Classics, World Cinema & Independent films. Our venue is open to a starry sky, the retro ambience is cosy & each person receives high-quality wireless headphones for sound. Taste our delicious finger food & movie-themed cocktails & have them delivered to your seat!\",\n" +
            "          \"venue\": \"Lost The Plot\",\n" +
            "          \"startTime\": 1466083800000,\n" +
            "          \"endTime\": 1466101740000,\n" +
            "          \"address\": \"Pune, India, 411007\",\n" +
            "          \"ticketUri\": \"https://in.bookmyshow.com/events/dhanak-preview-at-lost-the-plot-rooftop-cinema/ET00042360\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/589382451231442\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.554712630203,\n" +
            "            \"longitude\": 73.804803318784\n" +
            "          },\n" +
            "          \"distance\": \"11 km\",\n" +
            "          \"fbAttendingCount\": 38\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466083800000\n" +
            "    },\n" +
            "    {\n" +
            "      \"slot\": \"7:30 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"57603cecc0133aee48599029\",\n" +
            "          \"fb_id\": \"1596353800694099\",\n" +
            "          \"name\": \"Beware the English Pride\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c88.0.200.200/p200x200/13346828_993829013999918_1099324924000197459_n.jpg?oh=e327feadd113753137404d3f983c297c&oe=580A999F\",\n" +
            "          \"description\": \"'Ah, England have done it again' \\n\\nThey may have the most popular league in the world. \\nBut The English have never lived upto reputation. \\n\\nGerrard, Lampard, Terry, Beckham etc all went missing where it mattered most. \\nNow will this second 'Golden Generation' be any different? \\nThere's quality everywhere. \\nSturridge, Barkely, Alli, Sterling, Smalling, Rooney and co have the team to be the first English Champions of the continent. \\n\\nAnd they kick off this quest for the Holy Grail against their tiny neighbours, long suffering in their shadow. For they now have a wizard amongst them. A wizard who can 'Bale' them out anytime. \\n\\nNothing so worthwhile is ever easy.\",\n" +
            "          \"venue\": \"Replay Sports Bar\",\n" +
            "          \"startTime\": 1466085600000,\n" +
            "          \"endTime\": 1466094600000,\n" +
            "          \"address\": \"Saffron Hotels, Prime Rose Mall, 76/3, Baner, Pune, Pune, India, 411045\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/1596353800694099\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.561365214756,\n" +
            "            \"longitude\": 73.785879559883\n" +
            "          },\n" +
            "          \"distance\": \"13 km\",\n" +
            "          \"fbAttendingCount\": 2\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466085600000\n" +
            "    },\n" +
            "    {\n" +
            "      \"slot\": \"8:00 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"57616388c0133aee48599044\",\n" +
            "          \"fb_id\": \"259998111026123\",\n" +
            "          \"name\": \"212 Live Sessions Featuring Blackwings\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c102.0.200.200/p200x200/13442288_1575086226125642_664325169861589136_n.jpg?oh=a67216aa04eddff83f113ab92f60ea5a&oe=580DA050\",\n" +
            "          \"description\": \"Pune, brace yourself! 212 All Day Cafe & Bar brings you an evening of Blues and Rock featuring city-based ensemble, BLACKWINGS. Formed in 1994, the outfit plays a variety of genres inspired by artists like Buddy Guy, BB King, Eric Clapton and Deep Purple.  Band members Jameer on Vocals, Miq on the Guitar, Vinay on Bass, Bish on keyboard & Prasenjit on drums believe in playing covers in their own experimental style, making music a more fun concept and a hit amongst all age groups.\\n\\nDon’t make any other plans this Thursday because your favorite Thursday night destination 212 All Day also has a Flat 50% Off from 4PM to 9PM on Alcohol ideal for the early start, board games and a popular Food Menu. Here’s to some great mid-week action with BLACKWINGS!\\nBeer from Rs 90.\\n\\n\\nEvent Details:\\nEnjoy Flat 50% Off on Alcohol from 4PM to 9PM and Board Games. Beer from Rs 90. \\n\\nVenue: 212 All Day Café & Bar, G-53, Ground Floor, Phoenix Marketcity, Viman Nagar Road, Pune.\\n\\nDay: Thursday, 16th June, 2016\\n\\nTime: 8:00 PM onwards | Flat 50% Off on Alcohol 4PM – 9PM\\n\\nFor reservations +91 20 3095 0689 /  6689 0689\",\n" +
            "          \"venue\": \"212 All Day Cafe & Bar Pune\",\n" +
            "          \"startTime\": 1466087400000,\n" +
            "          \"endTime\": 1466101500000,\n" +
            "          \"address\": \"G-53, Phoenix Marketcity, Viman Nagar, Pune, India, 411011\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/259998111026123\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.561893855,\n" +
            "            \"longitude\": 73.916940316471\n" +
            "          },\n" +
            "          \"distance\": \"3 km\",\n" +
            "          \"fbAttendingCount\": 17\n" +
            "        },\n" +
            "        {\n" +
            "          \"_id\": \"57603cecc0133aee48599028\",\n" +
            "          \"fb_id\": \"874972885979943\",\n" +
            "          \"name\": \"Grand Launch !\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c170.0.200.200/p200x200/13417500_175903639479495_7295987962944531586_n.png?oh=d86671782b6d82452da5767c8e6b36db&oe=580DB9A1\",\n" +
            "          \"description\": \"Come celebrate Peace, Freedom and Love with a little Hippiness!\",\n" +
            "          \"venue\": \"Hippie at Heart\",\n" +
            "          \"startTime\": 1466087400000,\n" +
            "          \"endTime\": 1466098200000,\n" +
            "          \"address\": \"1995 Sushila Apartment Ghole Rd Opp FC college gate 2 Shivaji Nagar, Pune, India, 411005\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/874972885979943\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.52466586234,\n" +
            "            \"longitude\": 73.84187400341\n" +
            "          },\n" +
            "          \"distance\": \"7 km\",\n" +
            "          \"fbAttendingCount\": 59\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466087400000\n" +
            "    },\n" +
            "    {\n" +
            "      \"slot\": \"8:30 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"576053dc490d92fe6c7b7057\",\n" +
            "          \"fb_id\": \"1750077035211442\",\n" +
            "          \"name\": \"Porcupine Tree Tribute by Fake Plastic Friends\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/c166.0.200.200/p200x200/13346702_10153535422046759_3021382866941203555_n.jpg?oh=dbeec38aaf73ae4d0148be46c68eaacc&oe=57C32022\",\n" +
            "          \"description\": \"Fake Plastic Friends rocked the stage with their tribute to Porcupine Tree at Hard Rock Cafe Andheri last month. This time it's for all you guys in Pune!\",\n" +
            "          \"venue\": \"Hard Rock Cafe Pune\",\n" +
            "          \"startTime\": 1466089200000,\n" +
            "          \"address\": \"Pune, Maharashtra, undefined, 411036\",\n" +
            "          \"ticketUri\": \"http://bit.ly/1UsbqWp\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/1750077035211442\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.538566889274,\n" +
            "            \"longitude\": 73.912649521647\n" +
            "          },\n" +
            "          \"distance\": \"1 km\",\n" +
            "          \"fbAttendingCount\": 16\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466089200000\n" +
            "    },\n" +
            "    {\n" +
            "      \"slot\": \"9:00 pm\",\n" +
            "      \"data\": [\n" +
            "        {\n" +
            "          \"_id\": \"57603cecc0133aee48599025\",\n" +
            "          \"fb_id\": \"1218536544825667\",\n" +
            "          \"name\": \"BASSTonic feat. Moon Roots Project\",\n" +
            "          \"thumbnail\": \"https://scontent.xx.fbcdn.net/v/t1.0-0/q81/c256.0.200.200/p200x200/13442374_1030671677025924_438890413569883329_n.jpg?oh=b94001299304e85c5a866277732bf963&oe=57C4AABD\",\n" +
            "          \"description\": \"Swiggers!\\n\\nWe are back with another installation of our ‘Basstonic Nights’ and this time we have Pune’s very own Moon Roots Project spinning some Nu Disco tunes!\\n\\nMoon Roots Project is a hunt by two siblings for their love of sound.\\n\\nConstantly evolving their in house production this duo tailors each and every sound they play into their own fabric. \\n\\n#BASSTonic #UndergroundBar #Swig\",\n" +
            "          \"venue\": \"Swig Bar & Eatery\",\n" +
            "          \"startTime\": 1466091000000,\n" +
            "          \"endTime\": 1466101800000,\n" +
            "          \"address\": \"North Main Road, Koregaon Park, Pune, India, 411001\",\n" +
            "          \"fbUrl\": \"https://www.facebook.com/events/1218536544825667\",\n" +
            "          \"coordinates\": {\n" +
            "            \"latitude\": 18.539953497082,\n" +
            "            \"longitude\": 73.89446550293\n" +
            "          },\n" +
            "          \"distance\": \"2 km\",\n" +
            "          \"fbAttendingCount\": 10\n" +
            "        }\n" +
            "      ],\n" +
            "      \"timestamp\": 1466091000000\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    public static ObjectMapper mapper;

    public static void main(String[] args) {
        System.out.println("Running bot rest service");
        mapper = new ObjectMapper();
        SpringApplication.run(Main.class, args);
    }
}
