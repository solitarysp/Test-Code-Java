package com.thanh;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class Main {
    // Country Data.
    public static final String DATABASE_COUNTRY_PATH = "C:\\Users\\Admin\\Desktop\\GeoLite2-Country.mmdb";

    // City Data.
    public static final String DATABASE_CITY_PATH = "C:\\LeThanh\\MayTinh\\project\\Test-Code-Java\\libraries\\geoip2\\config\\GeoLite2-City.mmdb";


    public static void main(String[] args) throws IOException, GeoIp2Exception {
        // Một đối tượng File trỏ tới GeoLite2 Database của bạn.
        Long time = System.currentTimeMillis();
        File dbFile = new File(Main.DATABASE_CITY_PATH);

        // Tạo ra một đối tượng đọc Database.
        // nó có thể tái sử dụng trong các lần tra cứu.
        DatabaseReader reader = new DatabaseReader.Builder(dbFile).build();


        // Một địa chỉ IP
        InetAddress ipAddress = InetAddress.getByName("50.30.27.66");


        // Thông tin định vị thành phố ứng với địa chỉ IP.
        CityResponse response = reader.city(ipAddress);
        System.out.println(System.currentTimeMillis() - time);

        // Thông tin quốc gia
        Country country = response.getCountry();
        System.out.println("Country IsoCode: " + country.getIsoCode()); // 'US'
        System.out.println("Country Name: " + country.getName()); // 'United States'
        System.out.println(country.getNames().get("zh-CN")); // '美国'

        Subdivision subdivision = response.getMostSpecificSubdivision();
        System.out.println("Subdivision Name: " + subdivision.getName()); // 'Minnesota'
        System.out.println("Subdivision IsoCode: " + subdivision.getIsoCode()); // 'MN'

        // Thông tin Thành phố
        City city = response.getCity();
        System.out.println("City Name: " + city.getName()); // 'Minneapolis'

        // Thông tin bưu chính (Postal).
        Postal postal = response.getPostal();
        System.out.println(postal.getCode()); // '55455'

        // Vị trí địa lý.
        Location location = response.getLocation();

        // Vĩ độ
        System.out.println("Latitude: " + location.getLatitude()); // 44.9733

        // Kinh độ
        System.out.println("Longitude: " + location.getLongitude()); // -93.2323
        System.out.println("d");
    }
}
