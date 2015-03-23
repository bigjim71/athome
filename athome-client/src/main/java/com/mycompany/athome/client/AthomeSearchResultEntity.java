/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.athome.client;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author fh231
 */

@Getter
@Setter
@ToString(of = {"id"})
@EqualsAndHashCode(of = {"id"})
@XmlRootElement(name = "result-row")
public class AthomeSearchResultEntity {
    
    /*
    

       private int surface = 162;
       private String search_new_homes_region = "";
       private String agency_color = "#ff4608";
       private String city_cp = "Helmsange";
       private boolean highlight = false;
       private boolean cave = true;
       private String auto_city = "Helmsange";
       private String group_region = "";
       private int carparks = 0;
       private String city = "Helmsange";
       private boolean bbc = false;
       private boolean elevator = false;
       private String immotype_fr = "Maison de village";
       private int rooms = 10;
       private int parent_id = 0;
       private boolean fp = true;
       private String transaction_immotype = "buy|house";
       private int bedrooms = 6;
       private double prixM2Calculated = 4629.6294;
       private String search_new_homes = "";
       private String transaction_immotype_region = "buy|house|Centre";
       private int status_banner = 0;
       private String auto_region = "Centre";
       private String region_city = "Centre|Helmsange";
       private String city_and_district = "Helmsange|nodistrict";
       private String immotype_en = "Country House";
       private String transaction_region = "buy|Centre";
       private boolean delivery = false;
       private String agency_reference = "Helmsange";
       private String region = "Centre";
       private String agency_city = "Luxembourg-Gasperich";
       private int mandate = 0;
       private double ground = 4.73;
       private double lng = 6.1348736;
       private int transaction = 0;
       private String building_end = "";
       private boolean build = false;
       private String area_city = "Walferdange|Helmsange";
       private String country_city_cp = "Luxembourg|Helmsange";
       private String immotype_de = "Mehrfamilienhaus";
       private boolean brand_booster = false;
       private int energy_class = 78;
       private String site = "athomelu";
       private boolean delivery_empty = true;
       private String region_area = "Centre|Walferdange";
       private String transaction_immotype_region_area_city_zone = "buy|house|Centre|Walferdange|Helmsange|";
       private String search_builds = "";
       private String transaction_region_area = "buy|Centre|Walferdange";
       private String agency_text_color = "#FFFFFF";
       private String auto_city_and_district = "Helmsange|nodistrict";
       private boolean garden = true;
       private int customer_id = 68001;
       private String zone = "";
       private int terrace_surface = 0;
       private String location = "Helmsange";
       private int bathrooms = 1;
       private int defiscalisation_law = 0;
       private int ground_contract = 2;
       private int balcony_surface = 0;
       private boolean show_number = true;
       private String inserted = "2015-02-26T13:53:02Z";
       private String description = "House Invest pru00e9sente u00e0 la vente cette maison de village de 162 m2 habitable avec 6 chambres u00e0 coucher sur un terrain de 4.73 ares.nnAVIS AUX INVESTISSEURS: possibilitu00e9 de ru00e9aliser un projet ru00e9sidentiel sur ce terrainnnLa maison se compose:nSous-sol partiel:nPetite cavennRez-de-chaussu00e9e:n1 hall d'entru00e9en1 cuisine u00e9quipu00e9e avec accu00e8s jardin et terrassen1 salonn1 salle u00e0 mangern1 du00e9gagementn1 salle de bains complu00e8te,          avec baignoire d'angle et douchen1 chaufferie nnu00c9tage 1:n6 chambres en enfiladennu00c9tage 2:nGrenier amu00e9nageablennDisponibilitu00e9 u00e0 convenirnnVotre personne de contact est Mr Rogowski Yves,         disponible au 00352 26 36 26 94 ou par mail: info@house-invest.lu";
       private int photos_count = 10;
       private boolean accessibility = false;
       private String transaction_immotype_region_area = "buy|house|Centre|Walferdange";
       private int show_site = 0;
       private String auto_zone = "";
       private String status = "active";
       private String photo_url = "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String agency_name = "House Invest Immobiliu00e8re Su00e0rl";
       private String modified = "2015-02-26T13:56:32Z";
       private String transaction_region_area_city = "buy|Centre|Walferdange|Helmsange";
       private String country = "lu";
       private String building_start = "";
       private String immotype_group = "h";
       private String search_new_flats_region = "";
       private String offer_name = "";
       private String auto_district_name = "nodistrict|Helmsange";
       private String id = "3618510";
       private String auto_city_cp = "Helmsange";
       private String area = "Walferdange";
       private boolean premiere = false;
       private int entreprise_id = 2303;
       private String transaction_immotype_region_area_city = "buy|house|Centre|Walferdange|Helmsange";
       private double lat = 49.6597023;
       private boolean profile = false;
       private String search_new_flats = "";
       private int immotype = 34;
       private String auto_area = "Walferdange";
//       private String photos_url = ["/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212",
//                   private String /ec/63/73/3ee35a25e98685727665a12327b64c9dd43698fd.jpg?v=12121212",
//                   private String /ec/63/73/05d8777fae1e0a270f93b13174de9eab23f50e4b.jpg?v=12121212",
//                   private String /ec/63/73/d9e22a4a30a24b8c5f8530ecd3bc4558c02df8a4.jpg?v=12121212"
//                   private String /ec/63/73/a2718d72978123a557372705ff6dd41528dd82d7.jpg?v=12121212";
//                   private String /ec/63/73/45424d78bb32ffcf7c43363f288f150a5a0888ec.jpg?v=12121212";
//                   private String /ec/63/73/2be3e10888ea96956885301d2ae7ec66fe13de15.jpg?v=12121212";
//                   private String /ec/63/73/2d61e8b2ba0f621a5c216535c24bfd70d808b9bf.jpg?v=12121212";
//                   private String /ec/63/73/e6b38ff383f9413d2dccf2c7616b2205a45660a9.jpg?v=12121212";
//                   private String /ec/63/73/851d066725dcb2354ea88b2eeaa7140b60565724.jpg?v=12121212"];
       
       private String[] photos_url;
       private boolean premium = false;
       private String agency = "houseinvest_athome";
       private String agency_logo = "http://i1.static.athome.eu/logoagences/1388736004_houseinvest.jpg";
       private boolean photos = true;
       private boolean terrace_balcony = true;
       private boolean furnished = false;
       private String district_name = "nodistrict|Helmsange";
       private int garages = 0;
       private boolean pro = false;
       private boolean garage_carpark = false;
       private String search_builds_region = "";
       private int price = 750000;
       private int min_price = 750000;
       private boolean show_price = true;
       private int max_price = 750000;
       private int num_offer = 0;
       private boolean has_elevator = false;
       private int min_rooms = 0;
       private int max_bedrooms = 0;
       private boolean has_garden = false;
       private String postal_code = "";
       private String delivery_date = "1970-01-01T00:00:00Z";
       private int has_energy_class = 0;
       private int min_bedrooms = 0;
       private String district_zipcodes = "";
       private boolean has_bbc = false;
       private boolean private_ = false;
       private boolean has_cave = false;
       private boolean has_terrace_balcony = false;
       private int profile_order = 0;
       private boolean has_garage_carpark = false;
       private int max_rooms = 0;
       private int score = 2;
       
//       private String url = {"fr = "http://www.athome.lu/vente/maison/centre/walferdange/helmsange/3618510";
//               private String en = "http://www.athome.lu/buy/house/centre/walferdange/helmsange/3618510";
//               private String de = "http://www.athome.lu/kaufen/haus/centre/walferdange/helmsange/3618510"};
       private AthomeSearchResultLangHolder url;
       
//       private String tr_transaction = {"fr = "Vente";
//                           private String en = "Buy";
//                           private String de = "Kaufen"};
       private AthomeSearchResultLangHolder tr_transaction;    
       
//       private String tr_immotype = {"fr = "Maison de village";
//                       private String en = "Country House";
//                       private String de = "Mehrfamilienhaus"};
       private AthomeSearchResultLangHolder tr_immotype; 
       
//       private String photos_url_thumb2 = ["http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/3ee35a25e98685727665a12327b64c9dd43698fd.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/05d8777fae1e0a270f93b13174de9eab23f50e4b.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/d9e22a4a30a24b8c5f8530ecd3bc4558c02df8a4.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/a2718d72978123a557372705ff6dd41528dd82d7.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/45424d78bb32ffcf7c43363f288f150a5a0888ec.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/2be3e10888ea96956885301d2ae7ec66fe13de15.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/2d61e8b2ba0f621a5c216535c24bfd70d808b9bf.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/e6b38ff383f9413d2dccf2c7616b2205a45660a9.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/851d066725dcb2354ea88b2eeaa7140b60565724.jpg?v=12121212"];
                           
       private String[] photos_url_thumb2;
       
       private String image = "http://i1.static.athome.eu/images/annonces2/image_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String thumb = "http://i1.static.athome.eu/images/annonces2/thumb_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String thumb2 = "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private int youtube = 0;
       private int plan = 0;
       private boolean logo_option = true;    
    
    */
    
       private int surface; //162;
       private String search_new_homes_region; //"";
       private String agency_color; //"#ff4608";
       private String city_cp; //"Helmsange";
       private boolean highlight; //false;
       private boolean cave; //true;
       private String auto_city; //"Helmsange";
       private String group_region; //"";
       private int carparks; //0;
       private String city; //"Helmsange";
       private boolean bbc; //false;
       private boolean elevator; //false;
       private String immotype_fr; //"Maison de village";
       private int rooms; //10;
       private int parent_id; //0;
       private boolean fp; //true;
       private String transaction_immotype; //"buy|house";
       private int bedrooms; //6;
       private double prixM2Calculated; //4629.6294;
       private String search_new_homes; //"";
       private String transaction_immotype_region; //"buy|house|Centre";
       private int status_banner; //0;
       private String auto_region; //"Centre";
       private String region_city; //"Centre|Helmsange";
       private String city_and_district; //"Helmsange|nodistrict";
       private String immotype_en; //"Country House";
       private String transaction_region; //"buy|Centre";
       private boolean delivery; //false;
       private String agency_reference; //"Helmsange";
       private String region; //"Centre";
       private String agency_city; //"Luxembourg-Gasperich";
       private int mandate; //0;
       private double ground; //4.73;
       private double lng; //6.1348736;
       private int transaction; //0;
       private String building_end; //"";
       private boolean build; //false;
       private String area_city; //"Walferdange|Helmsange";
       private String country_city_cp; //"Luxembourg|Helmsange";
       private String immotype_de; //"Mehrfamilienhaus";
       private boolean brand_booster; //false;
       private int energy_class; //78;
       private String site; //"athomelu";
       private boolean delivery_empty; //true;
       private String region_area; //"Centre|Walferdange";
       private String transaction_immotype_region_area_city_zone; //"buy|house|Centre|Walferdange|Helmsange|";
       private String search_builds; //"";
       private String transaction_region_area; //"buy|Centre|Walferdange";
       private String agency_text_color; //"#FFFFFF";
       private String auto_city_and_district; //"Helmsange|nodistrict";
       private boolean garden; //true;
       private int customer_id; //68001;
       private String zone; //"";
       private int terrace_surface; //0;
       private String location; //"Helmsange";
       private int bathrooms; //1;
       private int defiscalisation_law; //0;
       private int ground_contract; //2;
       private int balcony_surface; //0;
       private boolean show_number; //true;
       private String inserted; //"2015-02-26T13:53:02Z";
       private String description; //"House Invest pru00e9sente u00e0 la vente cette maison de village de 162 m2 habitable avec 6 chambres u00e0 coucher sur un terrain de 4.73 ares.nnAVIS AUX INVESTISSEURS: possibilitu00e9 de ru00e9aliser un projet ru00e9sidentiel sur ce terrainnnLa maison se compose:nSous-sol partiel:nPetite cavennRez-de-chaussu00e9e:n1 hall d'entru00e9en1 cuisine u00e9quipu00e9e avec accu00e8s jardin et terrassen1 salonn1 salle u00e0 mangern1 du00e9gagementn1 salle de bains complu00e8te,          avec baignoire d'angle et douchen1 chaufferie nnu00c9tage 1:n6 chambres en enfiladennu00c9tage 2:nGrenier amu00e9nageablennDisponibilitu00e9 u00e0 convenirnnVotre personne de contact est Mr Rogowski Yves,         disponible au 00352 26 36 26 94 ou par mail: info@house-invest.lu";
       private int photos_count; //10;
       private boolean accessibility; //false;
       private String transaction_immotype_region_area; //"buy|house|Centre|Walferdange";
       private int show_site; //0;
       private String auto_zone; //"";
       private String status; //"active";
       private String photo_url; //"http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String agency_name; //"House Invest Immobiliu00e8re Su00e0rl";
       private String modified; //"2015-02-26T13:56:32Z";
       private String transaction_region_area_city; //"buy|Centre|Walferdange|Helmsange";
       private String country; //"lu";
       private String building_start; //"";
       private String immotype_group; //"h";
       private String search_new_flats_region; //"";
       private String offer_name; //"";
       private String auto_district_name; //"nodistrict|Helmsange";
       private String id; //"3618510";
       private String auto_city_cp; //"Helmsange";
       private String area; //"Walferdange";
       private boolean premiere; //false;
       private int entreprise_id; //2303;
       private String transaction_immotype_region_area_city; //"buy|house|Centre|Walferdange|Helmsange";
       private double lat; //49.6597023;
       private boolean profile; //false;
       private String search_new_flats; //"";
       private int immotype; //34;
       private String auto_area; //"Walferdange";
//       private String photos_url; //["/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212",
//                   private String /ec/63/73/3ee35a25e98685727665a12327b64c9dd43698fd.jpg?v=12121212",
//                   private String /ec/63/73/05d8777fae1e0a270f93b13174de9eab23f50e4b.jpg?v=12121212",
//                   private String /ec/63/73/d9e22a4a30a24b8c5f8530ecd3bc4558c02df8a4.jpg?v=12121212"
//                   private String /ec/63/73/a2718d72978123a557372705ff6dd41528dd82d7.jpg?v=12121212";
//                   private String /ec/63/73/45424d78bb32ffcf7c43363f288f150a5a0888ec.jpg?v=12121212";
//                   private String /ec/63/73/2be3e10888ea96956885301d2ae7ec66fe13de15.jpg?v=12121212";
//                   private String /ec/63/73/2d61e8b2ba0f621a5c216535c24bfd70d808b9bf.jpg?v=12121212";
//                   private String /ec/63/73/e6b38ff383f9413d2dccf2c7616b2205a45660a9.jpg?v=12121212";
//                   private String /ec/63/73/851d066725dcb2354ea88b2eeaa7140b60565724.jpg?v=12121212"];
       
       private String[] photos_url;
       private boolean premium; //false;
       private String agency; //"houseinvest_athome";
       private String agency_logo; //"http://i1.static.athome.eu/logoagences/1388736004_houseinvest.jpg";
       private boolean photos; //true;
       private boolean terrace_balcony; //true;
       private boolean furnished; //false;
       private String district_name; //"nodistrict|Helmsange";
       private int garages; //0;
       private boolean pro; //false;
       private boolean garage_carpark; //false;
       private String search_builds_region; //"";
       private int price; //750000;
       private int min_price; //750000;
       private boolean show_price; //true;
       private int max_price; //750000;
       private int num_offer; //0;
       private boolean has_elevator; //false;
       private int min_rooms; //0;
       private int max_bedrooms; //0;
       private boolean has_garden; //false;
       private String postal_code; //"";
       private String delivery_date; //"1970-01-01T00:00:00Z";
       private int has_energy_class; //0;
       private int min_bedrooms; //0;
       private String district_zipcodes; //"";
       private boolean has_bbc; //false;
       private boolean private_; //false;
       private boolean has_cave; //false;
       private boolean has_terrace_balcony; //false;
       private int profile_order; //0;
       private boolean has_garage_carpark; //false;
       private int max_rooms; //0;
       private int score; //2;
       
//       private String url; //{"fr; //"http://www.athome.lu/vente/maison/centre/walferdange/helmsange/3618510";
//               private String en; //"http://www.athome.lu/buy/house/centre/walferdange/helmsange/3618510";
//               private String de; //"http://www.athome.lu/kaufen/haus/centre/walferdange/helmsange/3618510"};
       private AthomeSearchResultLangHolder url;
       
//       private String tr_transaction; //{"fr; //"Vente";
//                           private String en; //"Buy";
//                           private String de; //"Kaufen"};
       private AthomeSearchResultLangHolder tr_transaction;    
       
//       private String tr_immotype; //{"fr; //"Maison de village";
//                       private String en; //"Country House";
//                       private String de; //"Mehrfamilienhaus"};
       private AthomeSearchResultLangHolder tr_immotype; 
       
//       private String photos_url_thumb2; //["http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/3ee35a25e98685727665a12327b64c9dd43698fd.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/05d8777fae1e0a270f93b13174de9eab23f50e4b.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/d9e22a4a30a24b8c5f8530ecd3bc4558c02df8a4.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/a2718d72978123a557372705ff6dd41528dd82d7.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/45424d78bb32ffcf7c43363f288f150a5a0888ec.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/2be3e10888ea96956885301d2ae7ec66fe13de15.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/2d61e8b2ba0f621a5c216535c24bfd70d808b9bf.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/e6b38ff383f9413d2dccf2c7616b2205a45660a9.jpg?v=12121212";
//                           "http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/851d066725dcb2354ea88b2eeaa7140b60565724.jpg?v=12121212"];
                           
       private String[] photos_url_thumb2;
       
       private String image; //"http://i1.static.athome.eu/images/annonces2/image_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String thumb; //"http://i1.static.athome.eu/images/annonces2/thumb_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private String thumb2; //"http://i1.static.athome.eu/images/annonces2/thumb2_/ec/63/73/5329432a91484303b8f9cc816919b344266e6993.jpg?v=12121212";
       private int youtube; //0;
       private int plan; //0;
       private boolean logo_option; //true;
    
}
