package tamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Urmareste rezultatele echipei de fotbal CFR CLUJ incepand cu editia fotbalistica 2004-2005 !!");
        String EditiileDeFotbal[] = {"2004-2005", "2005-2006", "2006-2007", "2007-2008", "2008-2009", "2009-2010", "2010-2011",
        "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020",
        "2020-2021", "2021-2022", "2022-2023"};

        String CompetitiiEditia2004_2005[] = {"DIVIZIA A 2004-2005", "CUPA ROMANIEI 2004-2005", "UEFA INTERTOTO CUP 2005"};
        String CompetitiiEditia2005_2006[] = {"DIVIZIA A 2005-2006", "CUPA ROMANIEI 2005-2006"};
        String CompetitiiEditia2006_2007[] = {"LIGA I 2006-2007", "CUPA ROMANIEI 2006-2007"};
        String CompetitiiEditia2007_2008[] = {"LIGA I 2007-2008", "CUPA ROMANIEI 2007-2008", "UEFA CUP 2007-2008"};
        String CompetitiiEditia2008_2009[] = {"LIGA I 2008-2009", "CUPA ROMANIEI 2008-2009", "SUPERCUPA ROMANIEI 2009", "UEFA CHAMPIONS LEAGUE 2008-2009"};
        String CompetitiiEditia2009_2010[] = {"LIGA I 2009-2010", "CUPA ROMANIEI 2009-2010", "SUPERCUPA ROMANIEI 2010", "UEFA EUROPA LEAGUE 2009-2010"};
        String CompetitiiEditia2010_2011[] = {"LIGA I 2010-2011", "CUPA ROMANIEI 2010-2011", "UEFA CHAMPIONS LEAGUE 2010-2011"};
        String CompetitiiEditia2011_2012[] = {"LIGA I 2011-2012", "CUPA ROMANIEI 2011-2012", "SUPERCUPA ROMANIEI 2012"};
        String CompetitiiEditia2012_2013[] = {"LIGA I 2012-2013", "CUPA ROMANIEI 2012-2013", "UEFA CHAMPIONS LEAGUE 2012-2013", "UEFA EUROPA LEAGUE 2012-2013"};
        String CompetitiiEditia2013_2014[] = {"LIGA I 2013-2014", "CUPA ROMANIEI 2013-2014"};
        String CompetitiiEditia2014_2015[] = {"LIGA I 2014-2015", "CUPA ROMANIEI 2014-2015", "CUPA LIGII ROMANIEI 2014-2015", "UEFA EUROPA LEAGUE 2014-2015"};
        String CompetitiiEditia2015_2016[] = {"LIGA I 2015-2016", "LIGA I PLAY-OUT 2015-2016", "CUPA ROMANIEI 2015-2016", "CUPA LIGII ROMANIEI 2015-2016", "SUPERCUPA ROMANIEI 2016"};
        String CompetitiiEditia2016_2017[] = {"LIGA I 2016-2017", "LIGA I PLAY-OFF 2016-2017", "CUPA ROMANIEI 2016-2017", "CUPA LIGII ROMANIEI 2016-2017"};
        String CompetitiiEditia2017_2018[] = {"LIGA I 2017-2018", "LIGA I PLAY-OFF 2017-2018", "CUPA ROMANIEI 2017-2018", "SUPERCUPA ROMANIEI 2018"};
        String CompetitiiEditia2018_2019[] = {"LIGA I 2018-2019", "LIGA I PLAY-OFF 2018-2019", "CUPA ROMANIEI 2018-2019", "SUPERCUPA ROMANIEI 2019", "UEFA CHAMPIONS LEAGUE 2018-2019", "UEFA EUROPA LEAGUE 2018-2019"};
        String CompetitiiEditia2019_2020[] = {"LIGA I 2019-2020", "LIGA I PLAY-OFF 2019-2020", "CUPA ROMANIEI 2019-2020", "SUPERCUPA ROMANIEI 2020", "UEFA CHAMPIONS LEAGUE 2019-2020", "UEFA EUROPA LEAGUE 2019-2020"};
        String CompetitiiEditia2020_2021[] = {"LIGA I 2020-2021", "LIGA I PLAY-OFF 2020-2021", "CUPA ROMANIEI 2020-2021", "SUPERCUPA ROMANIEI 2021", "UEFA CHAMPIONS LEAGUE 2020-2021", "UEFA EUROPA LEAGUE 2020-2021"};
        String CompetitiiEditia2021_2022[] = {"LIGA I 2021-2022", "LIGA I PLAY-OFF 2021-2022", "CUPA ROMANIEI 2021-2022", "SUPERCUPA ROMANIEI 2022", "UEFA CHAMPIONS LEAGUE 2021-2022", "UEFA EUROPA LEAGUE 2021-2022", "UEFA EUROPA CONFERENCE LEAGUE 2021-2022"};
        String CompetitiiEditia2022_2023[] = {"LIGA I 2022-2023", "LIGA I PLAY-OFF 2022-2023", "CUPA ROMANIEI 2022-2023", "UEFA CHAMPIONS LEAGUE 2022-2023", "UEFA EUROPA CONFERENCE LEAGUE 2022-2023"};

        String EchipeDiviziaA2004_2005[] = {"POLITEHNICA Timisoara DA04-05", "GLORIA Bistrita DA04-05", "RAPID Bucuresti DA04-05",
                "APULLUM Alba Iulia DA04-05", "DINAMO Bucuresti DA04-05", "UNIVERSITATEA Craiova DA04-05", "ARGES Pitesti DA04-05", "FARUL Constanta DA04-05",
                "SPORTUL STUDENTESC Bucuresti DA04-05", "POLITEHNICA Iasi DA04-05", "STEAUA Bucuresti DA04-05", "OTELUL Galati DA04-05", "NATIONAL Bucuresti DA04-05",
                "FCM Bacau DA04-05", "FC Brasov DA04-05"};
        String EchipeDiviziaA2005_2006[] = {"SPORTUL STUDENTESC Bucuresti DA05-06", "JIUL Petrosani DA05-06", "Vaslui DA05-06", "ARGES Pitesti DA05-06",
                "NATIONAL Bucuresti DA05-06", "POLITEHNICA Timisoara DA05-06", "OTELUL Galati DA05-06", "PANDURII LIGNITUL Targu Jiu DA05-06", "DINAMO Bucuresti DA05-06",
                "POLITEHNICA Iasi DA05-06", "FCM Bacau DA05-06", "STEAUA Bucuresti DA05-06", "RAPID Bucuresti DA05-06", "GLORIA Bistrita DA05-06", "FARUL Constanta DA05-06"};
        String EchipeLigaI2006_2007[] = {"OTELUL Galati LI06-07", "UNIREA Urziceni LI06-07", "CEAHLAUL Piatra Neamt LI06-07", "PANDURII LIGNITUL Targu Jiu LI06-07",
                "JIUL Petrosani LI06-07", "POLITEHNICA Timisoara LI06-07", "UNIVERSITATEA Craiova LI06-07", "UTA Arad LI06-07", "Vaslui LI06-07", "STEAUA Bucuresti LI06-07",
                "ARGES Pitesti LI06-07", "RAPID Bucuresti LI06-07", "DINAMO Bucuresti LI06-07", "GLORIA Bistrita LI06-07", "POLITEHNICA Iasi LI06-07", "FARUL Constanta LI06-07"};
        String EchipeLigaI2007_2008[] = {"OTELUL Galati LI07-08", "POLITEHNICA 1921 STIINTA Timisoara LI07-08", "UNIVERSITATEA Craiova LI07-08", "STEAUA Bucuresti LI07-08",
                "GLORIA Buzau LI07-08", "CEAHLAUL Piatra Neamt LI07-08", "FARUL Constanta LI07-08", "POLITEHNICA Iasi LI07-08", "DINAMO 1948 Bucuresti LI07-08",
                "PANDURII LIGNITUL Targu Jiu LI07-08", "UNIREA Urziceni LI07-08", "RAPID Bucuresti LI07-08", "UTA Arad LI07-08", "Vaslui LI07-08", "DACIA Mioveni LI07-08",
                "GLORIA 1922 Bistrita LI07-08", "UNIVERSITATEA Cluj LI07-08"};
        String EchipeLigaI2008_2009[] = {"CS Otopeni LI08-09", "GLORIA Buzau LI08-09", "RAPID Bucuresti LI08-09", "UNIVERSITATEA Craiova LI08-09", "Vaslui LI08-09", "POLITEHNICA Iasi LI08-09",
                "GLORIA 1922 Bistrita LI08-09", "FARUL Constanta LI08-09", "STEAUA Bucuresti LI08-09", "OTELUL Galati LI08-09", "DINAMO 1948 Bucuresti LI08-09", "FC Timisoara LI08-09", "UNIREA Urziceni LI08-09",
                "Brasov LI08-09", "ARGES Pitesti LI08-09", "PANDURII LIGNITUL Targu Jiu LI08-09", "GAZ METAN Medias LI08-09"};
        String EchipeLigaI2009_2010[] = {"UNIREA Urziceni LI09-10", "STEAUA Bucuresti LI09-10", "OTELUL Galati LI09-10", "DINAMO 1948 Bucuresti LI09-10", "GAZ METAN Medias LI09-10", "PANDURII LIGNITUL Targu Jiu LI09-10",
                "Brasov LI09-10", "GLORIA 1922 Bistrita LI09-10", "POLITEHNICA Iasi LI09-10", "RAPID Bucuresti LI09-10", "FC Timisoara LI09-10", "UNIREA Alba Iulia LI09-10", "ASTRA Ploiesti LI09-10", "Vaslui LI09-10",
                "UNIVERSITATEA Craiova LI09-10", "INTERNATIONAL Curtea de Arges LI09-10", "CEAHLAUL Piatra Neamt LI09-10"};
        String EchipeLigaI2010_2011[] = {"UNIVERSITATEA Craiova LI10-11", "VICTORIA Branesti LI10-11", "FC Timisoara LI10-11", "ASTRA Ploiesti LI10-11", "SPORTUL STUDENTESC Bucuresti LI10-11", "PANDURII LIGNITUL Targu Jiu LI10-11",
                "RAPID Bucuresti LI10-11", "Targu Mures LI10-11", "UNIVERSITATEA Cluj LI10-11", "Brasov LI10-11", "Vaslui LI10-11", "UNIREA Urziceni LI10-11", "OTELUL Galati LI10-11", "DINAMO 1948 Bucuresti LI10-11",
                "GLORIA 1922 Bistrita LI10-11", "GAZ METAN Medias LI10-11", "STEAUA Bucuresti LI10-11"};
        String EchipeLigaI2011_2012[] = {"ASTRA Ploiesti LI11-12", "Targu Mures LI11-12", "GAZ METAN Medias LI11-12", "PANDURII LIGNITUL Targu Jiu LI11-12", "SPORTUL STUDENTESC Bucuresti LI11-12", "OTELUL Galati LI11-12",
                "Vaslui LI11-12", "RAPID Bucuresti LI11-12", "PETROLUL Ploiesti LI11-12", "CONCORDIA Chiajna LI11-12", "CEAHLAUL Piatra Neamt LI11-12", "Brasov LI11-12", "DINAMO 1948 Bucuresti LI11-12", "UNIVERSITATEA Cluj LI11-12",
                "VOINTA Sibiu LI11-12", "CS Mioveni LI11-12", "STEAUA Bucuresti LI11-12"};
        String EchipeLigaI2012_2013[] = {"GAZ METAN Medias LI12-13", "CEAHLAUL Piatra Neamt LI12-13", "Vaslui LI12-13", "OTELUL Galati LI12-13", "MUNICIPAL STUDENTESC Iasi LI12-13", "RAPID Bucuresti LI12-13", "RAPID Bucuresti LI12-13",
                "PETROLUL Ploiesti LI12-13", "DINAMO 1948 Bucuresti LI12-13", "PANDURII LIGNITUL Targu Jiu LI12-13", "GLORIA 1922 Bistrita LI12-13", "STEAUA Bucuresti LI12-13", "VIITORUL Constanta LI12-13", "TURNU Severin LI12-13",
                "Brasov LI12-13", "CONCORDIA Chiajna LI12-13", "ASTRA Giurgiu LI12-13", "UNIVERSITATEA Cluj LI12-13"};
        String EchipeLigaI2013_2014[] = {"FC Botosani LI13-14", "POLI Timisoara LI13-14", "Vaslui LI13-14", "VIITORUL Constanta LI13-14", "STEAUA Bucuresti LI13-14", "CORONA 2010 Brasov LI13-14", "UNIVERSITATEA Cluj LI13-14",
                "PANDURII LIGNITUL Targu Jiu LI13-14", "PETROLUL Ploiesti LI13-14", "OTELUL Galati LI13-14", "CEAHLAUL Piatra Neamt LI13-14", "ASTRA Giurgiu LI13-14", "CONCORDIA Chiajna LI13-14", "DINAMO 1948 Bucuresti LI13-14",
                "Brasov LI13-14", "GAZ METAN Medias LI13-14", "SAGEATA Navodari LI13-14"};
        String EchipeLigaI2014_2015[] = {"CEAHLAUL Piatra Neamt LI14-15", "PANDURII LIGNITUL Targu Jiu LI14-15", "STEAUA Bucuresti LI14-15", "FC VIITORUL LI14-15", "GAZ METAN Medias LI14-15", "PETROLUL Ploiesti LI14-15",
                "ASTRA Giurgiu LI14-15", "OTELUL Galati LI14-15", "UNIVERSITATEA Cluj LI14-15", "ASA Targu Mures LI14-15", "DINAMO 1948 Bucuresti LI14-15", "CONCORDIA Chiajna LI14-15", "Brasov LI14-15", "FC Botosani LI14-15",
                "MUNICIPAL STUDENTESC Iasi LI14-15", "RAPID Bucuresti LI14-15", "UNIVERSITATEA Craiova 1948 LI14-15"};
        String EchipeLigaI2015_2016[] = {"FC VIITORUL Constanta LI15-16", "ACS POLI Timisoara LI15-16", "FC STEAUA Bucuresti LI15-16", "FC Voluntari LI15-16", "CS MUNICIPAL STUDENTESC Iasi LI15-16", "FC PETROLUL Ploiesti LI15-16",
                "CS PANDURII LIGNITUL Targu Jiu LI15-16", "CS CONCORDIA Chiajna LI15-16", "FC BOTOSANI LI15-16", "FC DINAMO 1948 Bucuresti LI15-16", "AFC ASTRA Giurgiu LI15-16", "ASA Targu Mures LI15-16", "CS UNIVERSITATEA Craiova 1948 LI15-16"};
        String EchipeLigaI2015_2016Play_Out[] = {"CS MUNICIPAL STUDENTESC Iasi LIPOUT15-16", "ACS POLI Timisoara LIPOUT15-16", "FC PETROLUL Ploiesti LIPOUT15-16", "FC Voluntari LIPOUT15-16", "CS CONCORDIA Chiajna LIPOUT15-16",
                "CS UNIVERSITATEA Craiova 1948 LIPOUT15-16", "FC Botosani LIPOUT15-16"};
        String EchipeLigaI2016_2017[] = {"CS CONCORDIA Chiajna LI16-17", "FC Botosani LI16-17", "FC DINAMO 1948 Bucuresti LI16-17", "CS PANDURII LIGNITUL Targu Jiu LI16-17", "AFC ASTRA Giurgiu LI16-17", "ACS POLI Timisoara LI16-17",
                "CS UNIVERSITATEA Craiova 1948 LI16-17", "FC Voluntari LI16-17", "FC STEAUA Bucuresti LI16-17", "CS GAZ METAN Medias LI16-17", "ASA Targu Mures LI16-17", "CS MUNICIPAL POLITEHNICA Iasi LI16-17", "FC VIITORUL Constanta LI16-17"};
        String EchipeLigaI2016_2017Play_Off[] = {"FC STEAUA Bucuresti LIPOFF16-17", "AFC ASTRA Giurgiu LIPOFF16-17", "CS UNIVERSITATEA Craiova 1948 LIPOFF16-17", "FC DINAMO 1948 Bucuresti LIPOFF16-17", "FC VIITORUL Constanta LIPOFF16-17"};
        String EchipeLigaI2017_2018[] = {"FC Botosani LI17-18", "FC VIITORUL Constanta LI17-18", "CS GAZ METAN Medias LI17-18", "CS MUNICIPAL POLITEHNICA Iasi LI17-18", "FC DINAMO 1948 Bucuresti LI17-18", "ACS SEPSI OSK Sfantu Gheorghe LI17-18",
                "FC Voluntari LI17-18", "ACS POLI Timisoara LI17-18", "CS UNIVERSITATEA Craiova 1948 LI17-18", "CS CONCORDIA Chiajna LI17-18", "FC FCSB Bucuresti LI17-18", "AFC ASTRA Giurgiu LI17-18", "CS JUVENTUS Bucuresti LI17-18"};
        String EchipeLigaI2017_2018Play_Off[] = {"CS MUNICIPAL POLITEHNICA Iasi LIPOFF17-18", "FC FCSB Bucuresti LIPOFF17-18", "CS UNIVERSITATEA Craiova 1948 LIPOFF17-18", "AFC ASTRA Giurgiu LIPOFF17-18", "FC VIITORUL Constanta LIPOFF17-18"};
        String EchipeLigaI2018_2019[] = {"FC Botosani LI18-19", "FC DUNAREA Calarasi LI18-19", "CS CONCORDIA Chiajna LI18-19", "FC Voluntari LI18-19", "FC DINAMO 1948 Bucuresti LI18-19", "CS GAZ METAN Medias LI18-19", "FC VIITORUL Constanta LI18-19",
                "FC FCSB Bucuresti LI18-19", "AFC HERMANNSTADT LI18-19", "CS UNIVERSITATEA Craiova 1948 LI18-19", "AFC ASTRA Giurgiu LI18-19", "FC POLITEHNICA Iasi LI18-19", "ACS SEPSI OSK Sfantu Gheorghe LI18-19"};
        String EchipeLigaI2018_2019Play_Off[] = {"ACS SEPSI OSK Sfantu Gheorghe LIPOFF18-19", "FC VIITORUL Constanta LIPOFF18-19", "AFC ASTRA Giurgiu LIPOFF18-19", "CS UNIVERSITATEA Craiova 1948 LIPOFF18-19", "FC FCSB Bucuresti LIPOFF18-19"};
        String EchipeLigaI2019_2020[] = {"FC POLITEHNICA Iasi LI19-20", "FC ACADEMICA Clinceni LI19-20", "FC DINAMO 1948 Bucuresti LI19-20", "AFC CHINDIA Targoviste LI19-20", "AFC HERMANNSTADT LI19-20", "ACS SEPSI OSK Sfantu Gheorghe LI19-20",
                "FC Botosani LI19-20", "AFC ASTRA Giurgiu LI19-20", "FC Voluntari LI19-20", "FC FCSB Bucuresti LI19-20", "CS GAZ METAN Medias LI19-20", "FC VIITORUL Constanta LI19-20", "CS UNIVERSITATEA Craiova 1948 LI19-20"};
        String EchipeLigaI2019_2020Play_Off[] = {"AFC ASTRA Giurgiu LIPOFF19-20", "CS GAZ METAN Medias LIPOFF19-20", "FC FCSB Bucuresti LIPOFF19-20", "FC Botosani LIPOFF19-20", "CS UNIVERSITATEA Craiova 1948 LIPOFF19-20"};
        String EchipeLigaI2020_2021[] = {"FC ACADEMICA Clinceni LI20-21", "ACS SEPSI OSK Sfantu Gheorghe LI20-21", "AFC HERMANNSTADT LI20-21", "AFC ASTRA Giurgiu LI20-21", "AFC CHINDIA Tirgoviste LI20-21", "FC VIITORUL Constanta LI20-21",
                "FC Botosani LI20-21", "FC Voluntari LI20-21", "CS GAZ METAN Medias LI20-21", "ACS CAMPIONII FC ARGES Pitesti LI20-21", "FC UTA Arad LI20-21", "FC POLITEHNICA Iasi LI20-21", "FC FCSB Bucuresti LI20-21",
                "FC DINAMO 1948 Bucuresti LI20-21", "CS UNIVERSITATEA Craiova 1948 LI20-21"};
        String EchipeLigaI2020_2021Play_Off[] = {"FC ACADEMICA Clinceni LIPOFF20-21", "ACS SEPSI OSK Sfantu Gheorghe LIPOFF20-21", "CS UNIVERSITATEA Craiova 1948 LIPOFF20-21", "FC Botosani LIPOFF20-21", "FC FCSB Bucuresti LIPOFF20-21"};
        String EchipeLigaI2021_2022[] = {"FC UNIVERSITATEA Craiova 1948 LI21-22", "FC ACADEMICA Clinceni LI21-22", "AFC CHINDIA Tirgoviste LI21-22", "CS Mioveni LI21-22", "FCV FARUL Constanta LI21-22", "ACS CAMPIONII FC ARGES Pitesti LI21-22",
                "FC FCSB Bucuresti LI21-22", "FC Botosani LI21-22", "CS UNIVERSITATEA Craiova 1948 LI21-22", "FC UTA Arad LI21-22", "CS GAZ METAN Medias LI21-22", "FC RAPID 1923 Bucuresti LI21-22", "ACS SEPSI OSK Sfantu Gheorghe LI21-22",
                "FC Voluntari LI21-22", "FC DINAMO 1948 Bucuresti LI21-22"};
        String EchipeLigaI2021_2022Play_Off[] = {"FC Voluntari LIPOFF21-22", "FCV FARUL Constanta LIPOFF21-22", "ACS CAMPIONII FC ARGES Pitesti LIPOFF21-22", "CS UNIVERSITATEA Craiova 1948 LIPOFF21-22", "FC FCSB Bucuresti LIPOFF21-22"};
        String EchipeLigaI2022_2023[] = {"FC RAPID 1923 Bucuresti LI22-23", "FC UNIVERSITATEA Craiova 1948 LI22-23", "CS Mioveni LI22-23", "AFC CHINDIA Tirgoviste LI22-23", "FC Botosani LI22-23", "AFC HERMANNSTADT LI22-23",
                "FCV FARUL Constanta LI22-23", "FC Voluntari LI22-23", "FC FCSB Bucuresti LI22-23", "CS UNIVERSITATEA Craiova 1948 LI22-23", "ACS CAMPIONII FC ARGES Pitesti LI22-23", "FC PETROLUL Ploiesti LI22-23", "FC UTA Arad LI22-23",
                "ACS SEPSI OSK Sfantu Gheorghe LI22-23", "FC UNIVERSITATEA Cluj LI22-23"};
        String EchipeLigaI2022_2023Play_Off[] = {};

        String EchipeCupaRomaniei2004_2005[] = {"PANDURII LIGNITUL Targu Jiu CR04-05", "FARUL Constanta CR04-05"};
        String EchipeCupaRomaniei2005_2006[] = {"UNIVERSITATEA Craiova CR05-06"};
        String EchipeCupaRomaniei2006_2007[] = {"SOMESUL Satu Mare CR06-07", "POLITEHNICA Timisoara CR06-07"};
        String EchipeCupaRomaniei2007_2008[] = {"FC Sacele CR07-08", "CS JIUL Petrosani CR07-08", "FC Brasov CR07-08", "CS DACIA Mioveni CR07-08", "FC UNIREA Urziceni CR07-08"};
        String EchipeCupaRomaniei2008_2009[] = {"CFM UNIVERSITATEA Cluj CR08-09", "FC SPORTUL STUDENTESC Bucuresti CR08-09", "CS PANDURII LIGNITUL Targu Jiu CR08-09", "FC Vaslui CR08-09", "FC Timisoara CR08-09"};
        String EchipeCupaRomaniei2009_2010[] = {"FCM DUNAREA Galati CR09-10", "CS GAZ METAN CFR Craiova CR09-10", "FC UNIVERSITATEA Craiova CR09-10", "FC DINAMO 1948 Bucuresti CR09-10", "FC Vaslui CR09-10"};
        String EchipeCupaRomaniei2010_2011[] = {"CS ACU Arad CR10-11", "FCM Targu Mures CR10-11", "ACF GLORIA 1922 Bistrita CR10-11"};
        String EchipeCupaRomaniei2011_2012[] = {"FC ASTRA Ploiesti CR11-12"};
        String EchipeCupaRomaniei2012_2013[] = {"ACS Berceni CR12-13", "FC Botosani CR12-13", "FC DINAMO 1948 Bucuresti CR12-13", "AFC ASTRA Giurgiu CR12-13", "FC PETROLUL Ploiesti CR12-13"};
        String EchipeCupaRomaniei2013_2014[] = {"FC Brasov CR13-14"};
        String EchipeCupaRomaniei2014_2015[] = {"CS VIITORUL Axintele CR14-15", "FC RAPID Bucuresti CR14-15", "CS Mioveni CR14-15", "FC UNIVERSITATEA Cluj CR14-15"};
        String EchipeCupaRomaniei2015_2016[] = {"CS Balotesti CR15-16", "FC VIITORUL II Constanta CR15-16", "CS MUNICIPAL STUDENTESC Iasi CR15-16", "ASA Targu Mures CR15-16", "FC DINAMO 1948 Bucuresti CR15-16"};
        String EchipeCupaRomaniei2016_2017[] = {"CSM Ramnicu Valcea CR16-17", "CS MUNICIPAL POLITEHNICA Iasi CR16-17", "ACS POLI Timisoara CR16-17"};
        String EchipeCupaRomaniei2017_2018[] = {"FC Botosani CR17-18"};
        String EchipeCupaRomaniei2018_2019[] = {"AFC CHINDIA Tirgoviste CR18-19", "CS GAZ METAN Medias CR18-19", "ACS SEPSI OSK Sfantu Gheorghe CR18-19", "AFC ASTRA Giurgiu CR18-19"};
        String EchipeCupaRomaniei2019_2020[] = {"FC Botosani CR19-20"};
        String EchipeCupaRomaniei2020_2021[] = {"FC POLITEHNICA Iasi CR20-21"};
        String EchipeCupaRomaniei2021_2022[] = {"CS UNIVERSITATEA Craiova 1948 CR21-22"};
        String EchipeCupaRomaniei2022_2023[] = {};

        String EchipeCupaLigiiRomaniei2014_2015[] = {"MUNICIPAL STUDENTESC Iasi CLR14-15"};
        String EchipeCupaLigiiRomaniei2015_2016[] = {"MUNICIPAL STUDENTESC Iasi CLR15-16", "FC DINAMO 1948 Bucuresti CLR15-16"};
        String EchipeCupaLigiiRomaniei2016_2017[] = {"CS UNIVERSITATEA Craiova 1948 CLR16-17", "ASA Targu Mures CLR16-17"};

        String EchipeSupercupaRomaniei2009[] = {"FC UNIREA Urziceni SCR09"};
        String EchipeSupercupaRomaniei2010[] = {"FC UNIREA Urziceni SCR10"};
        String EchipeSupercupaRomaniei2012[] = {"FC DINAMO 1948 Bucuresti SCR12"};
        String EchipeSupercupaRomaniei2016[] = {"AFC ASTRA Giurgiu SCR16"};
        String EchipeSupercupaRomaniei2018[] = {"CS UNIVERSITATEA Craiova 1948 SCR18"};
        String EchipeSupercupaRomaniei2019[] = {"FC VIITORUL Constanta SCR19"};
        String EchipeSupercupaRomaniei2020[] = {"FC FCSB Bucuresti SCR20"};
        String EchipeSupercupaRomaniei2021[] = {"CS UNIVERSITATEA Craiova 1948 SCR21"};
        String EchipeSupercupaRomaniei2022[] = {"ACS SEPSI OSK Sfantu Gheorghe SCR22"};

        String EchipeUefaIntertotoCup2005[] = {"VETRA Vilnius IC05", "ATHLETIC Bilbao IC05", "SAINT-ETIENNE IC05",
                "ZALGIRIS Vilnius IC05", "RC Lens IC05"};
        String EchipeUefaCup2007_2008[] = {"ANORTHOSIS Famagusta FC UC07-08"};
        String EchipeUefaChampionsLeague2008_2009[] = {"AS Roma UCL08-09", "CHELSEA FC UCL08-09", "FC GIRONDINS DE Bordeaux UCL08-09"};
        String EchipeUefaEuropaLeague2009_2010[] = {"FK Sarajevo UEL09-10", "FC København UEL09-10", "PSV Eindhoven UEL09-10", "AC SPARTA Prague UEL09-10"};
        String EchipeUefaChampionsLeague2010_2011[] = {"FC Basel UCL10-11", "AS Roma UCL10-11", "FC BAYERN München UCL10-11"};
        String EchipeUefaChampionsLeague2012_2013[] = {"FC SLOVAN Liberec UCL12-13", "FC Basel UCL12-13", "SC Braga UCL12-13", "Manchester UNITED FC UCL12-13", "GALATASARAY SK UCL12-13"};
        String EchipeUefaEuropaLeague2012_2013[] = {"FC INTERNAZIONALE Milano UEL12-13"};
        String EchipeUefaEuropaLeague2014_2015[] = {"FK Jagodina UEL14-15", "FC DINAMO Minsk UEL14-15"};
        String EchipeUefaChampionsLeague2018_2019[] = {"Malmö FF UCL18-19"};
        String EchipeUefaEuropaLeague2018_2019[] = {"FC Alashkert UEL18-19", "F91 Dudelange UEL18-19"};
        String EchipeUefaChampionsLeague2019_2020[] = {"FC Astana UCL19-20", "MACCABI Tel Aviv FC UCL19-20", "CELTIC FC UCL19-20", "SK SLAVIA Praha UCL19-20"};
        String EchipeUefaEuropaLeague2019_2020[] = {"SS LAZIO Roma UEL19-20", "CELTIC FC UEL19-20", "STADE Rennais FC UEL19-20", "SEVILLA FC UEL19-20"};
        String EchipeUefaChampionsLeague2020_2021[] = {"Floriana FC UCL20-21", "GNK DINAMO Zagreb UCL20-21"};
        String EchipeUefaEuropaLeague2020_2021[] = {"Djurgårdens IF Fotboll UEL20-21", "KuPS KUOPION PALLOSEURA UEL20-21", "AS Roma UEL20-21", "BSC YOUNG BOYS UEL20-21", "PFC CSKA Sofia UEL20-21"};
        String EchipeUefaChampionsLeague2021_2022[] = {"FK BORAC Banja Luka UCL21-22", "Lincoln RED IMPS FC UCL21-22", "BSC YOUNG BOYS UCL21-22"};
        String EchipeUefaEuropaLeague2021_2022[] = {"FK CRVENA ZVEZDA UEL21-22"};
        String EchipeUefaEuropaConferenceLeague2021_2022[] = {"AZ Alkmaar Zaanstreek UECL21-22", "FK Jablonec UECL21-22", "Randers FC UECL21-22"};
        String EchipeUefaChampionsLeague2022_2023[] = {"FC PYUNIK Yerevan UCL22-23"};
        String EchipeUefaEuropaConferenceLeague2022_2023[] = {"INTER CLUB d'Escaldes UECL22-23", "FK SHAKHTSYOR Salihorsk UECL22-23"};

        for (int i = 0; i < EditiileDeFotbal.length; i++) {
            System.out.println(EditiileDeFotbal[i]);
        }
        System.out.println("Alege editia fotbalistica dorita !");

        Scanner inputObject = new Scanner(System.in);
        String editia = inputObject.nextLine();

        System.out.println("Alege competitia dorita !");

        if (editia.equals(EditiileDeFotbal[0])) {
            for (int i = 0; i < CompetitiiEditia2004_2005.length; i++) {
                System.out.println(CompetitiiEditia2004_2005[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[1])) {
            for (int i = 0; i < CompetitiiEditia2005_2006.length; i++) {
                System.out.println(CompetitiiEditia2005_2006[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[2])) {
            for (int i = 0; i < CompetitiiEditia2006_2007.length; i++) {
                System.out.println(CompetitiiEditia2006_2007[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[3])) {
            for (int i = 0; i < CompetitiiEditia2007_2008.length; i++) {
                System.out.println(CompetitiiEditia2007_2008[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[4])) {
            for (int i = 0; i < CompetitiiEditia2008_2009.length; i++) {
                System.out.println(CompetitiiEditia2008_2009[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[5])) {
            for (int i = 0; i < CompetitiiEditia2009_2010.length; i++) {
                System.out.println(CompetitiiEditia2009_2010[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[6])) {
            for (int i = 0; i < CompetitiiEditia2010_2011.length; i++) {
                System.out.println(CompetitiiEditia2010_2011[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[7])) {
            for (int i = 0; i < CompetitiiEditia2011_2012.length; i++) {
                System.out.println(CompetitiiEditia2011_2012[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[8])) {
            for (int i = 0; i < CompetitiiEditia2012_2013.length; i++) {
                System.out.println(CompetitiiEditia2012_2013[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[9])) {
            for (int i = 0; i < CompetitiiEditia2013_2014.length; i++) {
                System.out.println(CompetitiiEditia2013_2014[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[10])) {
            for (int i = 0; i < CompetitiiEditia2014_2015.length; i++) {
                System.out.println(CompetitiiEditia2014_2015[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[11])) {
            for (int i = 0; i < CompetitiiEditia2015_2016.length; i++) {
                System.out.println(CompetitiiEditia2015_2016[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[12])) {
            for (int i = 0; i < CompetitiiEditia2016_2017.length; i++) {
                System.out.println(CompetitiiEditia2016_2017[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[13])) {
            for (int i = 0; i < CompetitiiEditia2017_2018.length; i++) {
                System.out.println(CompetitiiEditia2017_2018[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[14])) {
            for (int i = 0; i < CompetitiiEditia2018_2019.length; i++) {
                System.out.println(CompetitiiEditia2018_2019[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[15])) {
            for (int i = 0; i < CompetitiiEditia2019_2020.length; i++) {
                System.out.println(CompetitiiEditia2019_2020[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[16])) {
            for (int i = 0; i < CompetitiiEditia2020_2021.length; i++) {
                System.out.println(CompetitiiEditia2020_2021[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[17])) {
            for (int i = 0; i < CompetitiiEditia2021_2022.length; i++) {
                System.out.println(CompetitiiEditia2021_2022[i]);
            }
        }

        if (editia.equals(EditiileDeFotbal[18])) {
            for (int i = 0; i < CompetitiiEditia2022_2023.length; i++) {
                System.out.println(CompetitiiEditia2022_2023[i]);
            }
        }








        String competitia = inputObject.nextLine();

        System.out.println("Alege echipa dorita pentru a vedea rezultatele contra CFR CLUJ !");

        if (competitia.equals(CompetitiiEditia2004_2005[0])) {
            for (int i = 0; i < EchipeDiviziaA2004_2005.length; i++) {
                System.out.println(EchipeDiviziaA2004_2005[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2004_2005[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2004_2005.length; i++) {
                System.out.println(EchipeCupaRomaniei2004_2005[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2004_2005[2])) {
            for (int i = 0; i < EchipeUefaIntertotoCup2005.length; i++) {
                System.out.println(EchipeUefaIntertotoCup2005[i]);
            }
        }

        if (competitia.equals(CompetitiiEditia2005_2006[0])) {
            for (int i = 0; i < EchipeDiviziaA2005_2006.length; i++) {
                System.out.println(EchipeDiviziaA2005_2006[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2005_2006[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2005_2006.length; i++) {
                System.out.println(EchipeCupaRomaniei2005_2006[i]);
            }
        }


        if (competitia.equals(CompetitiiEditia2006_2007[0])) {
            for (int i = 0; i < EchipeLigaI2006_2007.length; i++) {
                System.out.println(EchipeLigaI2006_2007[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2006_2007[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2006_2007.length; i++) {
                System.out.println(EchipeCupaRomaniei2006_2007[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2007_2008[0])) {
            for (int i = 0; i < EchipeLigaI2007_2008.length; i++) {
                System.out.println(EchipeLigaI2007_2008[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2007_2008[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2007_2008.length; i++) {
                System.out.println(EchipeCupaRomaniei2007_2008[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2007_2008[2])) {
            for (int i = 0; i < EchipeUefaCup2007_2008.length; i++) {
                System.out.println(EchipeUefaCup2007_2008[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2008_2009[0])) {
            for (int i = 0; i < EchipeLigaI2008_2009.length; i++) {
                System.out.println(EchipeLigaI2008_2009[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2008_2009[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2008_2009.length; i++) {
                System.out.println(EchipeCupaRomaniei2008_2009[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2008_2009[2])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2009.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2009[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2008_2009[3])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2008_2009.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2008_2009[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2009_2010[0])) {
            for (int i = 0; i < EchipeLigaI2009_2010.length; i++) {
                System.out.println(EchipeLigaI2009_2010[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2009_2010[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2009_2010.length; i++) {
                System.out.println(EchipeCupaRomaniei2009_2010[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2009_2010[2])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2010.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2010[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2009_2010[3])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2009_2010.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2009_2010[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2010_2011[0])) {
            for (int i = 0; i < EchipeLigaI2010_2011.length; i++) {
                System.out.println(EchipeLigaI2010_2011[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2010_2011[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2010_2011.length; i++) {
                System.out.println(EchipeCupaRomaniei2010_2011[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2010_2011[2])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2010_2011.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2010_2011[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2011_2012[0])) {
            for (int i = 0; i < EchipeLigaI2011_2012.length; i++) {
                System.out.println(EchipeLigaI2011_2012[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2011_2012[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2011_2012.length; i++) {
                System.out.println(EchipeCupaRomaniei2011_2012[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2011_2012[2])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2012.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2012[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2012_2013[0])) {
            for (int i = 0; i < EchipeLigaI2012_2013.length; i++) {
                System.out.println(EchipeLigaI2012_2013[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2012_2013[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2012_2013.length; i++) {
                System.out.println(EchipeCupaRomaniei2012_2013[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2012_2013[2])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2012_2013.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2012_2013[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2012_2013[3])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2012_2013.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2012_2013[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2013_2014[0])) {
            for (int i = 0; i < EchipeLigaI2013_2014.length; i++) {
                System.out.println(EchipeLigaI2013_2014[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2013_2014[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2013_2014.length; i++) {
                System.out.println(EchipeCupaRomaniei2013_2014[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2014_2015[0])) {
            for (int i = 0; i < EchipeLigaI2014_2015.length; i++) {
                System.out.println(EchipeLigaI2014_2015[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2014_2015[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2014_2015.length; i++) {
                System.out.println(EchipeCupaRomaniei2014_2015[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2014_2015[2])) {
            for (int i = 0; i < EchipeCupaLigiiRomaniei2014_2015.length; i++) {
                System.out.println(EchipeCupaLigiiRomaniei2014_2015[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2014_2015[3])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2014_2015.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2014_2015[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2015_2016[0])) {
            for (int i = 0; i < EchipeLigaI2015_2016.length; i++) {
                System.out.println(EchipeLigaI2015_2016[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2015_2016[1])) {
            for (int i = 0; i < EchipeLigaI2015_2016Play_Out.length; i++) {
                System.out.println(EchipeLigaI2015_2016Play_Out[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2015_2016[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2015_2016.length; i++) {
                System.out.println(EchipeCupaRomaniei2015_2016[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2015_2016[3])) {
            for (int i = 0; i < EchipeCupaLigiiRomaniei2015_2016.length; i++) {
                System.out.println(EchipeCupaLigiiRomaniei2015_2016[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2015_2016[4])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2016.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2016[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2016_2017[0])) {
            for (int i = 0; i < EchipeLigaI2016_2017.length; i++) {
                System.out.println(EchipeLigaI2016_2017[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2016_2017[1])) {
            for (int i = 0; i < EchipeLigaI2016_2017Play_Off.length; i++) {
                System.out.println(EchipeLigaI2016_2017Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2016_2017[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2016_2017.length; i++) {
                System.out.println(EchipeCupaRomaniei2016_2017[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2016_2017[3])) {
            for (int i = 0; i < EchipeCupaLigiiRomaniei2016_2017.length; i++) {
                System.out.println(EchipeCupaLigiiRomaniei2016_2017[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2017_2018[0])) {
            for (int i = 0; i < EchipeLigaI2017_2018.length; i++) {
                System.out.println(EchipeLigaI2017_2018[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2017_2018[1])) {
            for (int i = 0; i < EchipeLigaI2017_2018Play_Off.length; i++) {
                System.out.println(EchipeLigaI2017_2018Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2017_2018[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2017_2018.length; i++) {
                System.out.println(EchipeCupaRomaniei2017_2018[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2017_2018[3])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2018.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2018[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[0])) {
            for (int i = 0; i < EchipeLigaI2018_2019.length; i++) {
                System.out.println(EchipeLigaI2018_2019[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[1])) {
            for (int i = 0; i < EchipeLigaI2018_2019Play_Off.length; i++) {
                System.out.println(EchipeLigaI2018_2019Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2018_2019.length; i++) {
                System.out.println(EchipeCupaRomaniei2018_2019[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[3])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2019.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2019[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[4])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2018_2019.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2018_2019[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2018_2019[5])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2018_2019.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2018_2019[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[0])) {
            for (int i = 0; i < EchipeLigaI2019_2020.length; i++) {
                System.out.println(EchipeLigaI2019_2020[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[1])) {
            for (int i = 0; i < EchipeLigaI2019_2020Play_Off.length; i++) {
                System.out.println(EchipeLigaI2019_2020Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2019_2020.length; i++) {
                System.out.println(EchipeCupaRomaniei2019_2020[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[3])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2020.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2020[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[4])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2019_2020.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2019_2020[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2019_2020[5])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2019_2020.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2019_2020[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[0])) {
            for (int i = 0; i < EchipeLigaI2020_2021.length; i++) {
                System.out.println(EchipeLigaI2020_2021[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[1])) {
            for (int i = 0; i < EchipeLigaI2020_2021Play_Off.length; i++) {
                System.out.println(EchipeLigaI2020_2021Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2020_2021.length; i++) {
                System.out.println(EchipeCupaRomaniei2020_2021[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[3])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2021.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2021[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[4])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2020_2021.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2020_2021[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2020_2021[5])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2020_2021.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2020_2021[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[0])) {
            for (int i = 0; i < EchipeLigaI2021_2022.length; i++) {
                System.out.println(EchipeLigaI2021_2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[1])) {
            for (int i = 0; i < EchipeLigaI2021_2022Play_Off.length; i++) {
                System.out.println(EchipeLigaI2021_2022Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2021_2022.length; i++) {
                System.out.println(EchipeCupaRomaniei2021_2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[3])) {
            for (int i = 0; i < EchipeSupercupaRomaniei2022.length; i++) {
                System.out.println(EchipeSupercupaRomaniei2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[4])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2021_2022.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2021_2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[5])) {
            for (int i = 0; i < EchipeUefaEuropaLeague2021_2022.length; i++) {
                System.out.println(EchipeUefaEuropaLeague2021_2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2021_2022[6])) {
            for (int i = 0; i < EchipeUefaEuropaConferenceLeague2021_2022.length; i++) {
                System.out.println(EchipeUefaEuropaConferenceLeague2021_2022[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2022_2023[0])) {
            for (int i = 0; i < EchipeLigaI2022_2023.length; i++) {
                System.out.println(EchipeLigaI2022_2023[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2022_2023[1])) {
            for (int i = 0; i < EchipeLigaI2022_2023Play_Off.length; i++) {
                System.out.println(EchipeLigaI2022_2023Play_Off[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2022_2023[2])) {
            for (int i = 0; i < EchipeCupaRomaniei2022_2023.length; i++) {
                System.out.println(EchipeCupaRomaniei2022_2023[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2022_2023[3])) {
            for (int i = 0; i < EchipeUefaChampionsLeague2022_2023.length; i++) {
                System.out.println(EchipeUefaChampionsLeague2022_2023[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2022_2023[4])) {
            for (int i = 0; i < EchipeUefaEuropaConferenceLeague2022_2023.length; i++) {
                System.out.println(EchipeUefaEuropaConferenceLeague2022_2023[i]);
            }
        }
















        System.out.println("Introduce echipa aleasa !");

        String echipaAleasa = inputObject.nextLine();
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 1) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 2) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[1])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 3) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 4) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[2])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 5) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 6) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[3])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 7) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 8) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[4])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 9) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 10) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[5])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 11) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 12) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[6])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 13) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 14) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[7])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 15) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 16) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[8])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 17) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 18) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[9])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 19) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 20) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[10])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 21) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 22) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[11])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 23) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 24) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[12])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 25) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 26) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[13])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 27) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 28) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[14])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 29) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 30) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeCupaRomaniei2004_2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 31) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeCupaRomaniei2004_2005[1])) {
            try {
                int numaratorCupa = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorCupa++;
                    if (numaratorCupa == 32) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 33) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 34) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 35) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[1])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 36) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 37) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 38) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[2])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 39) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 40) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 41) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[3])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 42) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 43) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 44) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[4])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 45) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 46) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 47) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2005_2006[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\cfr\\CFRproject\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 48) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 49) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
    }
}

