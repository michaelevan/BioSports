package com.dicoding.picodiploma.biosports;

import java.util.ArrayList;

public class SportsData {
    private static String[] sportsNames = {
            "Lionel Messi",
            "Connor McGregor",
            "LeBron James",
            "Rafael Nadal",
            "Maria Sharapova",
            "Marc Marquez",
            "Neymar Jr",
            "Serena Williams",
            "Valentino Rossi",
            "Cristiano Ronaldo",
            "Floyd Mayweather",
            "Lewis Hamilton"
    };

    private static String[] sportsDetails = {
            "Lionel Andrés Messi Cuccittini (Spanish pronunciation: [ljoˈnel anˈdɾez ˈmesi] born 24 June 1987) is an Argentine professional footballer who plays as a forward and captains both Spanish club Barcelona and the Argentina national team. Often considered the best player in the world and widely regarded as the greatest player of all time, Messi has won a record six Ballon d'Or awards,[note 2] and a record six European Golden Shoes. He has spent his entire professional career with Barcelona, where he has won a club-record 34 trophies, including ten La Liga titles, four UEFA Champions League titles and six Copas del Rey. A prolific goalscorer and a creative playmaker, Messi holds the records for most goals in La Liga (441), a La Liga and European league season (50), most hat-tricks in La Liga (36) and the UEFA Champions League (8), and most assists in La Liga (181) and the Copa América (12). He has scored over 700 senior career goals for club and country.\n" +
                    "\n" +
                    "Born and raised in central Argentina, Messi relocated to Spain to join Barcelona at age 13, for whom he made his competitive debut aged 17 in October 2004. He established himself as an integral player for the club within the next three years, and in his first uninterrupted season in 2008–09 he helped Barcelona achieve the first treble in Spanish football; that year, aged 22, Messi won his first Ballon d'Or. Three successful seasons followed, with Messi winning four consecutive Ballons d'Or, making him the first player to win the award four times and in a row.[9] During the 2011–12 season, he set the La Liga and European records for most goals scored in a single season, while establishing himself as Barcelona's all-time top scorer. The following two seasons, Messi finished second for the Ballon d'Or behind Cristiano Ronaldo (his perceived career rival), before regaining his best form during the 2014–15 campaign, becoming the all-time top scorer in La Liga and leading Barcelona to a historic second treble, after which he was awarded a fifth Ballon d'Or in 2015. Messi assumed the captaincy of Barcelona in 2018, and in 2019 he secured a record sixth Ballon d'Or.",
            "Conor Anthony McGregor (Irish: Conchúr Antóin Mac Gréagóir; born 14 July 1988) is an Irish retired professional mixed martial artist and boxer. He is a former Ultimate Fighting Championship (UFC) featherweight and lightweight champion.[10] As of June 10, 2020, he is #8 in the UFC men's pound-for-pound rankings and #4 in the UFC lightweight rankings.[11]\n" +
                    "\n" +
                    "McGregor is a former Cage Warriors featherweight and lightweight champion. In 2015, at UFC 194, he defeated José Aldo for the UFC Featherweight Championship via knockout 13 seconds into the first round, which is the fastest victory in UFC title fight history.[12] Upon defeating Eddie Alvarez for the UFC Lightweight Championship at UFC 205, McGregor became the first fighter in UFC history to hold titles in two weight divisions simultaneously.[13]\n" +
                    "\n" +
                    "In his debut boxing match, he was defeated by Floyd Mayweather Jr.[14] He is the biggest pay-per-view (PPV) draw in MMA history, having headlined five out of the six highest-selling UFC pay-per-view events.[15] His headline bout with Khabib Nurmagomedov at UFC 229 drew 2.4 million PPV buys, the most ever for an MMA event.[16] His boxing match with Mayweather drew 4.3 million PPV buys in North America, the second most in history",
            "LeBron Raymone James Sr. (/ləˈbrɒn/; born December 30, 1984) is an American professional basketball player for the Los Angeles Lakers of the National Basketball Association (NBA). He is widely considered to be one of the greatest basketball players in NBA history. Discussions ranking him as the greatest basketball player of all time have often been subject to significant debate, with frequent comparisons to Michael Jordan.[1] James's teams have played in eight consecutive NBA Finals (2011–2018 seasons) between the Miami Heat and Cleveland Cavaliers. His accomplishments include three NBA championships, four NBA Most Valuable Player (MVP) Awards, three Finals MVP Awards, and two Olympic gold medals. James holds the all-time record for playoffs points, is third in all-time points, and eighth in all-time assists. James was selected to the All-NBA First Team twelve times (all-time record), made the All-Defensive First Team five times, and has played in sixteen All-Star Games, in which he was selected All-Star MVP three times.\n" +
                    "\n" +
                    "James played basketball for St. Vincent–St. Mary High School in his hometown of Akron, Ohio, where he was heavily touted by the national media as a future NBA superstar. A prep-to-pro, he joined Cleveland in 2003 as the first overall draft pick. Named the 2003–04 NBA Rookie of the Year, he soon established himself as one of the league's premier players, winning the NBA MVP Award in 2009 and 2010. After failing to win a championship with Cleveland, James left in 2010 to sign as a free agent with Miami. This move was announced in an ESPN special titled The Decision, and is one of the most controversial free agent decisions in American sports history.",
            "Rafael \"Rafa\" Nadal Parera (Catalan: [rəf(ə)ˈɛl nəˈðal pəˈɾeɾə], Spanish: [rafaˈel naˈðal paˈɾeɾa]; born 3 June 1986) is a Spanish professional tennis player currently ranked world No. 2 in men's singles tennis by the Association of Tennis Professionals (ATP).[3]\n" +
                    "\n" +
                    "Nadal has won 19 Grand Slam singles titles, the second-most in history for a male player, as well as a record 35 ATP Tour Masters 1000 titles, 21 ATP Tour 500 titles and the 2008 Olympic gold medal in singles. In addition, Nadal has held the world No. 1 ranking for a total of 209 weeks, including being the year-end No. 1 five times.[3] In majors, Nadal has won a record twelve French Open titles, four US Open titles, two Wimbledon titles and one Australian Open title, and won at least one Grand Slam every year for a record ten consecutive years (2005–2014). Nadal has won 85 career titles overall, including the most outdoor titles in the Open Era (83) and a record 59 titles on clay. With 81 consecutive wins on clay, Nadal holds the record for the longest single-surface win streak in the Open Era.\n" +
                    "\n" +
                    "Nadal has been involved in five Davis Cup titles with Spain, and currently has a 29-win streak and 29–1 record in singles matches at the event. In 2010, at the age of 24, he became the seventh male player and the youngest of five in the Open Era to achieve the singles Career Grand Slam. Nadal is the second male player after Andre Agassi to complete the singles Career Golden Slam, as well as the second male player after Mats Wilander to have won at least two Grand Slams on all three surfaces (grass, hard court and clay). He has received the tour Sportsmanship Award three times and has been named the ATP Player of the Year five times and the ITF World Champion four times. In 2011, Nadal was named the Laureus World Sportsman of the Year.",
            "Maria Yuryevna Sharapova (Russian: Мари́я Ю́рьевна Шара́пова, IPA: [mɐˈrʲijə ˈjʉrʲjɪvnə ʂɐˈrapəvə] (About this soundlisten); born 19 April 1987) is a Russian former professional tennis player. Although she played under the banner of Russia with the Women's Tennis Association (WTA), she has lived in and been a United States permanent resident since 1994.[4] Sharapova competed on the WTA tour from 2001 to 2020 and had been ranked world No. 1 in singles by the WTA on five separate occasions, for a total of 21 weeks. She is one of ten women, and the only Russian, to hold the career Grand Slam. She is also an Olympic medalist, having won a silver medal in women's singles at the 2012 Summer Olympics in London. Sharapova achieved a rare level of longevity in tennis, with several tennis pundits and former players calling Sharapova one of tennis's best competitors.[5]\n" +
                    "\n" +
                    "Sharapova became the world No. 1 for the first time on 22 August 2005, at the age of 18, becoming the first Russian female tennis player to top the singles rankings, and last held the ranking for a fifth time for four weeks from 11 June 2012, to 8 July 2012.[6][7] She won five Grand Slam titles — two at the French Open and one each at the Australian Open, Wimbledon, and the US Open, winning 36 titles in total, including the year-ending WTA Finals in her debut in 2004. She also won three doubles titles",
            "Marc Márquez Alentà (born 17 February 1993) is a Spanish Grand Prix motorcycle road racer and one of the most successful motorcycle racers of all time with eight Grand Prix world championships to his name - six of which are in the premier MotoGP class. Márquez races for Honda's factory team since his MotoGP debut in 2013. He is nicknamed the 'Ant of Cervera' worldwide and 'el tro de Cervera' in his hometown, meaning the 'Thunder of Cervera'. He is one of four riders to have won world championship titles in three different categories, after Mike Hailwood, Phil Read and Valentino Rossi.\n" +
                    "\n" +
                    "Born in Cervera, Catalonia, Spain, Márquez became the second Catalan rider after Àlex Crivillé and the third Spaniard after Crivillé and Jorge Lorenzo to win the premier class title, and is to date the most successful Catalan and Spanish rider in the top category.",
            "Neymar da Silva Santos Júnior (Brazilian Portuguese: [nejˈmaʁ dɐ ˈsiwvɐ ˈsɐ̃tus ˈʒũɲoʁ]; born 5 February 1992), commonly known as Neymar Jr. or simply Neymar, is a Brazilian professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and the Brazil national team. He is widely considered as one of the best players in the world.\n" +
                    "\n" +
                    "Neymar came into prominence at Santos, where he made his professional debut aged 17. He helped the club win two successive Campeonato Paulista championships, a Copa do Brasil, and the 2011 Copa Libertadores; the latter being Santos' first since 1963. Neymar was twice named the South American Footballer of the Year, in 2011 and 2012, and soon relocated to Europe to join Barcelona. As part of Barcelona's attacking trio with Lionel Messi and Luis Suárez, he won the continental treble of La Liga, the Copa del Rey, and the UEFA Champions League, and finished third for the FIFA Ballon d'Or in 2015 for his performances. He then attained a domestic double in the 2015–16 season. In 2017, Neymar transferred from Barcelona to Paris Saint-Germain in a move worth €222 million, making him the most expensive player ever.[note 1] In France, Neymar won three league titles, a Coupe de France, and a Coupe de la Ligue, which included a domestic treble and being voted Ligue 1 Player of the Year, in his debut season.",
            "Serena Jameka Williams (born September 26, 1981[1]) is an American professional tennis player and former world No. 1 in women's single tennis. She has won 23 Grand Slam singles titles, the most by any player in the Open Era, and the second-most of all time behind Margaret Court (24). The Women's Tennis Association (WTA) ranked her world No. 1 in singles on eight separate occasions between 2002 and 2017. She reached the No. 1 ranking for the first time on July 8, 2002. On her sixth occasion, she held the ranking for 186 consecutive weeks, tying the record set by Steffi Graf. In total, she has been No. 1 for 319 weeks, which ranks third in the Open Era among female players behind Graf and Martina Navratilova.\n" +
                    "\n" +
                    "Williams holds the most Grand Slam titles in singles, doubles, and mixed doubles combined among active players. Her 39 Grand Slam titles put her joint-third on the all-time list and second in the Open Era: 23 in singles, 14 in women's doubles, and two in mixed doubles. She is the most recent female player to have held all four Grand Slam singles titles simultaneously (2002–03 and 2014–15) and the third player to achieve this twice, after Rod Laver and Graf. She is also the most recent player to have won a Grand Slam title on each surface (hard, clay and grass) in one calendar year (2015). She is also, together with her older sister Venus, the most recent player to have held all four Grand Slam women's doubles titles simultaneously (2009–10).",
            "Rossi is widely considered to be the greatest motorcycle racer of all time, with nine Grand Prix World Championships to his name – seven of which are in the premier class. Rossi is also the only road racer to have competed in 400 or more Grands Prix.[1] He has ridden with number 46 his entire career, also when being the title defender.\n" +
                    "\n" +
                    "After graduating to the premier class in 2000, Rossi won the 500cc World Championship and 8 Hours of Suzuka with Honda in 2001, the MotoGP World Championships (also with Honda) in 2002 and 2003 and continued his streak of back-to-back championships by winning the 2004 and 2005 titles after leaving Honda to join Yamaha. All of those titles were won in a dominant manner, being decided before the final round on all occasions. He lost the 2006 title with a crash in the final round at Valencia, ceding the title to his former Honda teammate Nicky Hayden. In 2007 Rossi and Yamaha were of no match to a dominant Casey Stoner on a Ducati, and Rossi ultimately finished a then career-low third overall.",
            "Cristiano Ronaldo dos Santos Aveiro GOIH ComM (European Portuguese: [kɾiʃˈtjɐnu ʁɔˈnaɫdu]; born 5 February 1985) is a Portuguese professional footballer who plays as a forward for Serie A club Juventus and captains the Portugal national team. Often considered the best player in the world and widely regarded as one of the greatest players of all time,[note 3] Ronaldo has won five Ballons d'Or[note 4] and four European Golden Shoes, both of which are records for a European player. He has won 29 major trophies in his career, including six league titles, five UEFA Champions Leagues, one UEFA European Championship, and one UEFA Nations League title. A prolific goalscorer, Ronaldo holds the records for the most goals scored in the UEFA Champions League (128) and for the most hat-tricks in recorded history (56). He is one of the few recorded players to have made over 1,000 professional career appearances and has scored over 700 senior career goals for club and country.[11]\n" +
                    "\n" +
                    "Born and raised in Madeira, Ronaldo began his senior club career playing for Sporting CP, before signing with Manchester United in 2003, aged 18. After winning the FA Cup in his first season, he helped United win three successive Premier League titles, the UEFA Champions League, and the FIFA Club World Cup; at age 23, he won his first Ballon d'Or. In 2009, Ronaldo was the subject of the then-most expensive association football transfer when signed for Real Madrid in a transfer worth €94 million (£80 million). There, Ronaldo won 15 trophies, including two La Liga titles, two Copas del Rey, and four UEFA Champions League titles, and became the club's all-time top goalscorer. After joining Madrid, Ronaldo finished runner-up for the Ballon d'Or three times, behind Lionel Messi—his perceived career rival—before winning back-to-back Ballons d'Or from 2013–2014 and again from 2016–2017. After winning a third consecutive Champions League title in 2018, Ronaldo became the first player to win the trophy five times. In 2018, he signed for Juventus in a transfer worth an initial €100 million (£88 million), the highest ever paid by an Italian club and the highest ever paid for a player over 30 years old. He won the Serie A in his debut season with the club.",
            "Floyd Joy Mayweather Jr. (born Floyd Joy Sinclair; February 24, 1977) is an American professional boxing promoter and former professional boxer. He competed between 1996 and 2015, and made a one-fight comeback in 2017. During his career he won fifteen major world titles including The Ring in five weight classes, the lineal championship in four weight classes (twice at welterweight), and retired with an undefeated record. As an amateur, Mayweather won a bronze medal in the featherweight division at the 1996 Olympics, three U.S. Golden Gloves championships (at light flyweight, flyweight, and featherweight), and the U.S. national championship at featherweight.\n" +
                    "\n" +
                    "Mayweather was named \"Fighter of the Decade\" for the 2010s by the Boxing Writers Association of America (BWAA), a two-time winner of The Ring magazine's Fighter of the Year award (1998 and 2007), a three-time winner of the BWAA Fighter of the Year award (2007, 2013, and 2015), and a six-time winner of the Best Fighter ESPY Award (2007–2010, 2012–2014).[1][2] In 2016, Mayweather was ranked by ESPN as the greatest boxer, pound for pound, of the last 25 years.[3] He remains BoxRec's number one fighter of all time, pound for pound, as well as the greatest welterweight of his era.[4][5] Many sporting news and boxing websites, including The Ring, Sports Illustrated, ESPN, BoxRec, Fox Sports, and Yahoo! Sports, ranked Mayweather as the best pound for pound boxer in the world twice in a span of ten years.[6][7][8][9][10][11] In 2020, Mayweather was ranked second on Ranker's list of best boxers of the 21st century.",
            "Lewis Carl Davidson Hamilton MBE HonFREng (born 7 January 1985) is a British racing driver who races in Formula One for the Mercedes-AMG Petronas Formula One Team. A six-time Formula One World Champion, he is widely regarded as one of the greatest drivers in the history of the sport, and considered by some to be the greatest of all time.[note 2] He won his first World Drivers' Championship with McLaren in 2008, before moving to Mercedes in 2013, with whom he has won a further five titles. One of the most successful drivers in the history of the sport, Hamilton's six World Championship titles is the second-most of all time, as is his tally of 84 race victories and 151 podium finishes. He currently holds the records for the all-time most career points (3443), the all-time most pole positions (88), the most grand slams in a season (3) and the most points in a season (413).[note 3]\n" +
                    "\n" +
                    "Born and raised in Stevenage, Hertfordshire, Hamilton enjoyed a successful ascent up the racing ladder and was signed to the McLaren young driver programme in 1998. This later resulted in a Formula One drive with McLaren in 2007, making Hamilton the first and only black driver to race in the sport.[note 4] That season, Hamilton set numerous records as he finished runner-up to Kimi Räikkönen by one point. The following season, he won his maiden title in dramatic fashion—making a crucial overtake on the last corner of the last lap in the last race of the season—to become the then-youngest Formula One World Champion in history. After four more years with McLaren without finishing higher than fourth in the drivers' standings, Hamilton signed with Mercedes in 2013, reuniting with his childhood karting teammate, Nico Rosberg."
    };

    private static int[] sportsImages = {
            R.drawable.messi,
            R.drawable.connor,
            R.drawable.lebron,
            R.drawable.nadal,
            R.drawable.maria,
            R.drawable.marc,
            R.drawable.neymar,
            R.drawable.serena,
            R.drawable.rossi,
            R.drawable.ronaldo,
            R.drawable.floyd,
            R.drawable.lewis,
    };

    private static int[] Images = {
            R.drawable.messi1,
            R.drawable.connor1,
            R.drawable.lebron1,
            R.drawable.nadal1,
            R.drawable.maria1,
            R.drawable.marc1,
            R.drawable.neymar1,
            R.drawable.serena1,
            R.drawable.rossi1,
            R.drawable.ronaldo1,
            R.drawable.floyd1,
            R.drawable.lewis1,
    };

    static ArrayList<Sports> getListData() {
        ArrayList<Sports> list = new ArrayList<>();
        for (int position = 0; position < sportsNames.length; position++) {
            Sports sports = new Sports();
            sports.setName(sportsNames[position]);
            sports.setDetail(sportsDetails[position]);
            sports.setPhoto(sportsImages[position]);
            sports.setPhotos(Images[position]);
            list.add(sports);
        }
        return list;
    }
}
