import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static String delcity(String cityname){
        ArrayList<String> cities = new ArrayList<>();

        // Добавляем строки в список
        cities.add("Срочно! Уже слышали, что происходит в городах России?\n");
        cities.add("Пока не стало поздно, ищи свой город — ПОДПИШИСЬ И ЧИТАЙ!\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-108370333#page=66d8719e36e8f50f8f22c6a3 (Волгоград)\n");
        cities.add("@https://vk.com/app5898182_-42216800#page=66d87240e2ef5310ee119a92 (Воронеж)\n");
        cities.add("@https://vk.com/app5898182_-166495553#page=66d87cca868fb2441b656b03 (Краснодар)\n");
        cities.add("@https://vk.com/app5898182_-37641202#page=66e1a73c1e632c2bbd621502 (Пермь)\n");
        cities.add("@https://vk.com/app5898182_-35055247#page=66e1a747c59520404971c1f2 (Ростов-на-Дону)\n");
        cities.add("@https://vk.com/app5898182_-68307720#page=66e1a759c7f9d4031240aca2 (Самара)\n");
        cities.add("@https://vk.com/app5898182_-64757184#page=66e1b1d7567c19296b1fdb52 (Тюмень)\n");
        cities.add("@https://vk.com/app5898182_-103780817#page=66e1b212be89cb0a35092b02 (Уфа)\n");
        cities.add("@https://vk.com/app5898182_-71816172#page=66e1b254466d4210fb6d0592 (Челябинск)\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-152806294#page=66d86e82c28ffd24a26ebea2 (Владивосток)\n");
        cities.add("@https://vk.com/app5898182_-148221335#page=66ed8c2b2f17b233fb6379f2 (Донецк)\n");
        cities.add("@https://vk.com/app5898182_-50981357#page=66d874cd46c3855e97404622 (Ижевск)\n");
        cities.add("@https://vk.com/app5898182_-76427401#page=66d8768c892d9e5639088a82 (Иркутск)\n");
        cities.add("@https://vk.com/app5898182_-158759786#page=66e1a3dcc1e9376181719c72 (Новокузнецк)\n");
        cities.add("@https://vk.com/app5898182_-104820653#page=66ed8c2f85d6ec1ccd330c92 (Псков)\n");
        cities.add("@https://vk.com/app5898182_-77532039#page=66e1a74da74f1658bc7ab543 (Рязань ЧП)\n");
        cities.add("@https://vk.com/app5898182_-134100941#page=66e1a753798f5163664a7c02 (Рязань)\n");
        cities.add("@https://vk.com/app5898182_-80260851#page=66e1b0cddd5d1817593202b3 (Севастополь)\n");
        cities.add("@https://vk.com/app5898182_-3983097#page=66e1b201c8cee119932e4453 (Ульяновск)\n");
        cities.add("@https://vk.com/app5898182_-141464804#page=66e1b22d7720bb3966178903 (Хабаровск)\n");
        cities.add("@https://vk.com/app5898182_-106172610#page=66e1b28ac2fc7306a715da82 (Ярославль)\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-138456139#page=66d84b6a8fffe75b0e7e3612 (Астрахань)\n");
        cities.add("@https://vk.com/app5898182_-116289313#page=66d879c08a24694423372e12 (Киров)\n");
        cities.add("@https://vk.com/app5898182_-76933324#page=66e198a96acb874f9a6e8d82 (Курск)\n");
        cities.add("@https://vk.com/app5898182_-129012690#page=66e199c6b77db059011e8824 (Липецк)\n");
        cities.add("@https://vk.com/app5898182_-124356825#page=66e1a2618f512d4b74625962 (Магнитогорск)\n");
        cities.add("@https://vk.com/app5898182_-171771788#page=66e1a736a74f1658bc7ab542 (Пенза)\n");
        cities.add("@https://vk.com/app5898182_-78154863#page=66e1b127eaf36166992e44d3 (Сочи)\n");
        cities.add("@https://vk.com/app5898182_-296496#page=66e1b16606b0ba24fa0707a5 (Сургут)\n");
        cities.add("@https://vk.com/app5898182_-51172224#page=66e1b198b97e674525410725 (Тверь)\n");
        cities.add("@https://vk.com/app5898182_-43132090#page=66e1b1be6d0a4b53294697b3 (Тула)\n");
        cities.add("@https://vk.com/app5898182_-151692221#page=66e1b1efc3d32d65d9078242 (Улан-Удэ)\n");
        cities.add("@https://vk.com/app5898182_-147623306#page=66e1b2404b79fc220954ec02 (Ханты-Мансийск)\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-62731197#page=66d86bf2776c2417c0699f42 (Белгород)\n");
        cities.add("@https://vk.com/app5898182_-117303573#page=66d86dc957e94317c26d0bf2 (Брянск)\n");
        cities.add("@https://vk.com/app5898182_-144391221#page=66d873c82da04d093f5743e2 (Иваново)\n");
        cities.add("@https://vk.com/app5898182_-41161928#page=66d87928480bd0608573c612 (Калуга)\n");
        cities.add("@https://vk.com/app5898182_-148867254#page=66e1962616e7d26e751afe12 (Курган)\n");
        cities.add("@https://vk.com/app5898182_-120961647#page=66e1a38c0a989664ea0eaef2 (Нижний Тагил)\n");
        cities.add("@https://vk.com/app5898182_-182023105#page=66e1a75f798f5163664a7c03 (Саранск)\n");
        cities.add("@https://vk.com/app5898182_-18068935#page=66e1b0f86ae610527669e4f2 (Симферополь)\n");
        cities.add("@https://vk.com/app5898182_-168772953#page=66e1b10abd87bb79392468c3 (Смоленск)\n");
        cities.add("@https://vk.com/app5898182_-130349854#page=66e1b266862956146a00c032 (Чита)\n");
        cities.add("@https://vk.com/app5898182_-46134421#page=66e1b2766396fb71586d3ca2 (Якутск)\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-99865819#page=66fbdf8f6a1a827a3f20e982 (Владикавказ)\n");
        cities.add("@https://vk.com/app5898182_-41588942#page=66d8776ea4e7fe6b403c7c83 (Йошкар-Ола)\n");
        cities.add("@https://vk.com/app5898182_-9288126#page=66d87c3344603446ba62ed82 (Кострома)\n");
        cities.add("@https://vk.com/app5898182_-155341746#page=66e1a346033e3831f878c353 (Нижневартовск)\n");
        cities.add("@https://vk.com/app5898182_-189672099#page=66e1a48fd7d5733c676f32b2 (Новороссийск)\n");
        cities.add("@https://vk.com/app5898182_-93039544#page=66e1a7424b20fb7969796942 (Петрозаводск)\n");
        cities.add("@https://vk.com/app5898182_-138014729#page=66e1b13f27b7e0030f34a2a3 (Старый Оскол)\n");
        cities.add("@https://vk.com/app5898182_-120806396#page=66e1b152f16c357d71466862 (Стерлитамак)\n");
        cities.add("@https://vk.com/app5898182_-90447552#page=66e1b1770f5a3d44bc022e22 (Сыктывкар)\n");
        cities.add("@https://vk.com/app5898182_-160449670#page=66e1b1875c7d5e1ae57c4812 (Тамбов)\n");
        cities.add("\n");
        cities.add("@https://vk.com/app5898182_-166495629#page=66d87805c7319d2d1d769fd2 (Казань ЧП)\n");
        cities.add("@https://vk.com/app5898182_-192250730#page=66d878a8bc5f2865806d6c42 (Калининград)\n");
        cities.add("@https://vk.com/app5898182_-115990808#page=66e1a2b4f112af54b21c8522 (Нефтеюганск)\n");
        cities.add("@https://vk.com/app5898182_-132463798#page=66e1a4d91d901b202d0f5983 (Новочеркасск)\n");
        cities.add("@https://vk.com/app5898182_-89760765#page=66e1a518f112af54b21c8523 (Новый Уренгой)\n");
        cities.add("@https://vk.com/app5898182_-69097635#page=66e1a730f30d4d7b406e2432 (Обнинск)\n");
        cities.add("@https://vk.com/app5898182_-176348913#page=66e1b0e16d0a4b53294697b2 (Северодвинск)\n");
        cities.add("@https://vk.com/app5898182_-174291782#page=66e1b1aba85dd37a4e792a52 (Тобольск)\n");


        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.contains(cityname)) {
                iterator.remove();
            }
        }

        String citys = "";
        for (String city : cities) {
            citys = citys + city;
        }
        return citys;
    }

    public static String getcityname(int UrlNum){
        ArrayList<String> citiesname = new ArrayList<>();

        // Добавляем строки в список
        citiesname.add("Волгоград");
        citiesname.add("Воронеж");
        citiesname.add("Краснодар");
        citiesname.add("Пермь");
        citiesname.add("Ростов-на-Дону");
        citiesname.add("Самара");
        citiesname.add("Тюмень");
        citiesname.add("Уфа");
        citiesname.add("Челябинск");
        citiesname.add("Владивосток");
        citiesname.add("Донецк");
        citiesname.add("Ижевск");
        citiesname.add("Иркутск");
        citiesname.add("Новокузнецк");
        citiesname.add("Псков");
        citiesname.add("Рязань ЧП");
        citiesname.add("Рязань");
        citiesname.add("Севастополь");
        citiesname.add("Ульяновск");
        citiesname.add("Хабаровск");
        citiesname.add("Ярославль");
        citiesname.add("Астрахань");
        citiesname.add("Киров");
        citiesname.add("Курск");
        citiesname.add("Липецк");
        citiesname.add("Магнитогорск");
        citiesname.add("Пенза");
        citiesname.add("Сочи");
        citiesname.add("Сургут");
        citiesname.add("Тверь");
        citiesname.add("Тула");
        citiesname.add("Улан-Удэ");
        citiesname.add("Ханты-Мансийск");
        citiesname.add("Белгород");
        citiesname.add("Брянск");
        citiesname.add("Иваново");
        citiesname.add("Калуга");
        citiesname.add("Курган");
        citiesname.add("Нижний Тагил");
        citiesname.add("Саранск");
        citiesname.add("Симферополь");
        citiesname.add("Смоленск");
        citiesname.add("Чита");
        citiesname.add("Якутск");
        citiesname.add("Владикавказ");
        citiesname.add("Йошкар-Ола");
        citiesname.add("Кострома");
        citiesname.add("Нижневартовск");
        citiesname.add("Новороссийск");
        citiesname.add("Петрозаводск");
        citiesname.add("Старый Оскол");
        citiesname.add("Стерлитамак");
        citiesname.add("Сыктывкар");
        citiesname.add("Тамбов");
        citiesname.add("Казань ЧП)");
        citiesname.add("Калининград");
        citiesname.add("Нефтеюганск");
        citiesname.add("Новочеркасск");
        citiesname.add("Новый Уренгой");
        citiesname.add("Обнинск");
        citiesname.add("Северодвинск");
        citiesname.add("Тобольск");
        return citiesname.get(UrlNum);
    }


    public static void main(String[] args) {

        List<String> urls = List.of(
                "https://vk.com/volgograd",
                "https://vk.com/interesnyi_voronezh",
                "https://vk.com/krasnodar__tm",
                "https://vk.com/typical.perm",
                "https://vk.com/rostov_na_donu",
                "https://vk.com/atypical_samara",
                "https://vk.com/chp_tyumeni",
                "https://vk.com/chp_v_ufe",
                "https://vk.com/chp_chelyabinsk_74",
                "https://vk.com/chp_vladivostok",
                "https://vk.com/donetsk_detka",
                "https://vk.com/chp_izhevsk",
                "https://vk.com/chp_irkutska",
                "https://vk.com/chp_novokuznetsk",
                "https://vk.com/typical_pskov",
                "https://vk.com/rzn_tut",
                "https://vk.com/ryazan_chp",
                "https://vk.com/we_love_sevastopol",
                "https://vk.com/podslushano.ulyanovsk",
                "https://vk.com/chp_khabarovsk",
                "https://vk.com/public106172610",
                "https://vk.com/chp_astrakhani",
                "https://vk.com/podslushano_v_kirove",
                "https://vk.com/netip_kursk",
                "https://vk.com/tipichnyi_lipetsk",
                "https://vk.com/typical.magnitogorsk",
                "https://vk.com/chp.penza",
                "https://vk.com/chp_dtp_sochi",
                "https://vk.com/t_surgut",
                "https://vk.com/chp_tveri",
                "https://vk.com/tula_chp_dtp",
                "https://vk.com/chp_ulan_ude",
                "https://vk.com/chp_khanty_mansiysk",
                "https://vk.com/chp_belgorod",
                "https://vk.com/chp_bryansk",
                "https://vk.com/tipichnoe_ivanovo",
                "https://vk.com/tipichnaya_kaluga",
                "https://vk.com/kurgan_detka",
                "https://vk.com/public120961647",
                "https://vk.com/t_saransk",
                "https://vk.com/atypical_simferopol",
                "https://vk.com/chp_smolensk",
                "https://vk.com/chp_chita",
                "https://vk.com/podslushano_v_yakutske",
                "https://vk.com/podslushano_vladikavkaz",
                "https://vk.com/interesnaya_yoshkar_ola",
                "https://vk.com/public9288126",
                "https://vk.com/chp_nizhnevartovsk_86",
                "https://vk.com/ntpchn_nvrsk",
                "https://vk.com/public93039544",
                "https://vk.com/oskol_online",
                "https://vk.com/sterlitamak_detka",
                "https://vk.com/typical.syktyvkar",
                "https://vk.com/typical.tambov",
                "https://vk.com/kazan_chp_dtp",
                "https://vk.com/chp_kaliningrad",
                "https://vk.com/atypical_nefteyugansk",
                "https://vk.com/chp_novocherkassk",
                "https://vk.com/chp_new_urengoy",
                "https://vk.com/public69097635",
                "https://vk.com/nash_severodvinsk",
                "https://vk.com/atypical_tobolsk"
        );

        System.out.println(delcity(getcityname(59)));



    }


}
