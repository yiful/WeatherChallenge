package com.yiful.weatherchallenge.model;

import java.util.List;

/**
 * Created by Yifu on 12/12/2017.
 */

public class ForecastWeather {
    /**
     * cod : 200
     * message : 0.1713
     * cnt : 40
     * list : [{"dt":1513112400,"main":{"temp":267.08,"temp_min":267.08,"temp_max":267.431,"pressure":1007.31,"sea_level":1031.12,"grnd_level":1007.31,"humidity":100,"temp_kf":-0.35},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":8.22,"deg":305.5},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2017-12-12 21:00:00"},{"dt":1513123200,"main":{"temp":266.49,"temp_min":266.49,"temp_max":266.754,"pressure":1007.5,"sea_level":1031.47,"grnd_level":1007.5,"humidity":100,"temp_kf":-0.26},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":7.82,"deg":306.504},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-13 00:00:00"},{"dt":1513134000,"main":{"temp":266.06,"temp_min":266.06,"temp_max":266.238,"pressure":1006.78,"sea_level":1030.85,"grnd_level":1006.78,"humidity":100,"temp_kf":-0.18},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":6.83,"deg":306.503},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-13 03:00:00"},{"dt":1513144800,"main":{"temp":265.6,"temp_min":265.6,"temp_max":265.689,"pressure":1005.15,"sea_level":1029.18,"grnd_level":1005.15,"humidity":100,"temp_kf":-0.09},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":12},"wind":{"speed":5.35,"deg":300.001},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-13 06:00:00"},{"dt":1513155600,"main":{"temp":265.118,"temp_min":265.118,"temp_max":265.118,"pressure":1003.48,"sea_level":1027.58,"grnd_level":1003.48,"humidity":100,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02n"}],"clouds":{"all":20},"wind":{"speed":3.37,"deg":280},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-13 09:00:00"},{"dt":1513166400,"main":{"temp":265.402,"temp_min":265.402,"temp_max":265.402,"pressure":1001.85,"sea_level":1025.86,"grnd_level":1001.85,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":68},"wind":{"speed":3.25,"deg":214.002},"rain":{},"snow":{"3h":0.08525},"sys":{"pod":"n"},"dt_txt":"2017-12-13 12:00:00"},{"dt":1513177200,"main":{"temp":267.791,"temp_min":267.791,"temp_max":267.791,"pressure":999.67,"sea_level":1023.41,"grnd_level":999.67,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":92},"wind":{"speed":5.17,"deg":175.003},"rain":{},"snow":{"3h":0.93875},"sys":{"pod":"d"},"dt_txt":"2017-12-13 15:00:00"},{"dt":1513188000,"main":{"temp":270.622,"temp_min":270.622,"temp_max":270.622,"pressure":994.98,"sea_level":1018.42,"grnd_level":994.98,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":92},"wind":{"speed":7.21,"deg":158.502},"rain":{},"snow":{"3h":1.475},"sys":{"pod":"d"},"dt_txt":"2017-12-13 18:00:00"},{"dt":1513198800,"main":{"temp":272.064,"temp_min":272.064,"temp_max":272.064,"pressure":991.68,"sea_level":1014.93,"grnd_level":991.68,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":92},"wind":{"speed":6.55,"deg":169.002},"rain":{},"snow":{"3h":0.56},"sys":{"pod":"d"},"dt_txt":"2017-12-13 21:00:00"},{"dt":1513209600,"main":{"temp":272.162,"temp_min":272.162,"temp_max":272.162,"pressure":991.58,"sea_level":1015.01,"grnd_level":991.58,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":88},"wind":{"speed":1.29,"deg":229.5},"rain":{},"snow":{"3h":0.485},"sys":{"pod":"n"},"dt_txt":"2017-12-14 00:00:00"},{"dt":1513220400,"main":{"temp":271.941,"temp_min":271.941,"temp_max":271.941,"pressure":993.8,"sea_level":1017.51,"grnd_level":993.8,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":88},"wind":{"speed":6.11,"deg":335.5},"rain":{},"snow":{"3h":0.8925},"sys":{"pod":"n"},"dt_txt":"2017-12-14 03:00:00"},{"dt":1513231200,"main":{"temp":272.934,"temp_min":272.934,"temp_max":272.934,"pressure":997.33,"sea_level":1021.05,"grnd_level":997.33,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":36},"wind":{"speed":7.44,"deg":40.5003},"rain":{},"snow":{"3h":0.6},"sys":{"pod":"n"},"dt_txt":"2017-12-14 06:00:00"},{"dt":1513242000,"main":{"temp":272.588,"temp_min":272.588,"temp_max":272.588,"pressure":1000.66,"sea_level":1024.52,"grnd_level":1000.66,"humidity":100,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":64},"wind":{"speed":6.43,"deg":34.0004},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-14 09:00:00"},{"dt":1513252800,"main":{"temp":271.871,"temp_min":271.871,"temp_max":271.871,"pressure":1002.65,"sea_level":1026.74,"grnd_level":1002.65,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":76},"wind":{"speed":4.58,"deg":28.5021},"rain":{},"snow":{"3h":0.0024999999999995},"sys":{"pod":"n"},"dt_txt":"2017-12-14 12:00:00"},{"dt":1513263600,"main":{"temp":271.584,"temp_min":271.584,"temp_max":271.584,"pressure":1004.27,"sea_level":1028.25,"grnd_level":1004.27,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":80},"wind":{"speed":1.34,"deg":12.0013},"rain":{},"snow":{"3h":0.0325},"sys":{"pod":"d"},"dt_txt":"2017-12-14 15:00:00"},{"dt":1513274400,"main":{"temp":270.959,"temp_min":270.959,"temp_max":270.959,"pressure":1004.35,"sea_level":1028.04,"grnd_level":1004.35,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":88},"wind":{"speed":3.91,"deg":213},"rain":{},"snow":{"3h":0.53},"sys":{"pod":"d"},"dt_txt":"2017-12-14 18:00:00"},{"dt":1513285200,"main":{"temp":271.506,"temp_min":271.506,"temp_max":271.506,"pressure":1003.52,"sea_level":1027.17,"grnd_level":1003.52,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":80},"wind":{"speed":4.32,"deg":241.501},"rain":{},"snow":{"3h":1.205},"sys":{"pod":"d"},"dt_txt":"2017-12-14 21:00:00"},{"dt":1513296000,"main":{"temp":270.876,"temp_min":270.876,"temp_max":270.876,"pressure":1003.73,"sea_level":1027.41,"grnd_level":1003.73,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":80},"wind":{"speed":6.16,"deg":271.003},"rain":{},"snow":{"3h":0.255},"sys":{"pod":"n"},"dt_txt":"2017-12-15 00:00:00"},{"dt":1513306800,"main":{"temp":270.452,"temp_min":270.452,"temp_max":270.452,"pressure":1003.19,"sea_level":1027.04,"grnd_level":1003.19,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":48},"wind":{"speed":6.77,"deg":281},"rain":{},"snow":{"3h":0.035},"sys":{"pod":"n"},"dt_txt":"2017-12-15 03:00:00"},{"dt":1513317600,"main":{"temp":269.526,"temp_min":269.526,"temp_max":269.526,"pressure":1002.47,"sea_level":1026.3,"grnd_level":1002.47,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":12},"wind":{"speed":6.46,"deg":293.501},"rain":{},"snow":{"3h":0.0025000000000004},"sys":{"pod":"n"},"dt_txt":"2017-12-15 06:00:00"},{"dt":1513328400,"main":{"temp":268.201,"temp_min":268.201,"temp_max":268.201,"pressure":1001.6,"sea_level":1025.54,"grnd_level":1001.6,"humidity":100,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":32},"wind":{"speed":5.81,"deg":284.001},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-15 09:00:00"},{"dt":1513339200,"main":{"temp":267.382,"temp_min":267.382,"temp_max":267.382,"pressure":1000.89,"sea_level":1024.76,"grnd_level":1000.89,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":68},"wind":{"speed":5.81,"deg":282.5},"rain":{},"snow":{"3h":0.012499999999999},"sys":{"pod":"n"},"dt_txt":"2017-12-15 12:00:00"},{"dt":1513350000,"main":{"temp":267.935,"temp_min":267.935,"temp_max":267.935,"pressure":1000.37,"sea_level":1024.08,"grnd_level":1000.37,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":80},"wind":{"speed":6.31,"deg":278.503},"rain":{},"snow":{"3h":0.13},"sys":{"pod":"d"},"dt_txt":"2017-12-15 15:00:00"},{"dt":1513360800,"main":{"temp":268.934,"temp_min":268.934,"temp_max":268.934,"pressure":999.11,"sea_level":1022.61,"grnd_level":999.11,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13d"}],"clouds":{"all":80},"wind":{"speed":6.61,"deg":281.002},"rain":{},"snow":{"3h":0.1825},"sys":{"pod":"d"},"dt_txt":"2017-12-15 18:00:00"},{"dt":1513371600,"main":{"temp":269.052,"temp_min":269.052,"temp_max":269.052,"pressure":998.8,"sea_level":1022.31,"grnd_level":998.8,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":36},"wind":{"speed":7.15,"deg":292.001},"rain":{},"snow":{"3h":0.0225},"sys":{"pod":"d"},"dt_txt":"2017-12-15 21:00:00"},{"dt":1513382400,"main":{"temp":267.837,"temp_min":267.837,"temp_max":267.837,"pressure":1001.22,"sea_level":1024.83,"grnd_level":1001.22,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":32},"wind":{"speed":9.53,"deg":302.504},"rain":{},"snow":{"3h":0.010000000000001},"sys":{"pod":"n"},"dt_txt":"2017-12-16 00:00:00"},{"dt":1513393200,"main":{"temp":267.475,"temp_min":267.475,"temp_max":267.475,"pressure":1002.84,"sea_level":1026.73,"grnd_level":1002.84,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":64},"wind":{"speed":11.02,"deg":309.001},"rain":{},"snow":{"3h":0.035},"sys":{"pod":"n"},"dt_txt":"2017-12-16 03:00:00"},{"dt":1513404000,"main":{"temp":267.278,"temp_min":267.278,"temp_max":267.278,"pressure":1004.84,"sea_level":1028.78,"grnd_level":1004.84,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":12},"wind":{"speed":10.62,"deg":313.505},"rain":{},"snow":{"3h":0.0099999999999998},"sys":{"pod":"n"},"dt_txt":"2017-12-16 06:00:00"},{"dt":1513414800,"main":{"temp":265.1,"temp_min":265.1,"temp_max":265.1,"pressure":1007.87,"sea_level":1032.05,"grnd_level":1007.87,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":9,"deg":311.505},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-16 09:00:00"},{"dt":1513425600,"main":{"temp":263.647,"temp_min":263.647,"temp_max":263.647,"pressure":1010.62,"sea_level":1035.02,"grnd_level":1010.62,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02n"}],"clouds":{"all":8},"wind":{"speed":7.47,"deg":310.502},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-16 12:00:00"},{"dt":1513436400,"main":{"temp":263.382,"temp_min":263.382,"temp_max":263.382,"pressure":1012.94,"sea_level":1037.38,"grnd_level":1012.94,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}],"clouds":{"all":8},"wind":{"speed":5.66,"deg":307.501},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2017-12-16 15:00:00"},{"dt":1513447200,"main":{"temp":264.368,"temp_min":264.368,"temp_max":264.368,"pressure":1014.07,"sea_level":1038.09,"grnd_level":1014.07,"humidity":100,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":56},"wind":{"speed":4,"deg":271.001},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2017-12-16 18:00:00"},{"dt":1513458000,"main":{"temp":265.012,"temp_min":265.012,"temp_max":265.012,"pressure":1012.69,"sea_level":1036.66,"grnd_level":1012.69,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"clouds":{"all":64},"wind":{"speed":3,"deg":216.003},"rain":{},"snow":{"3h":0.0049999999999999},"sys":{"pod":"d"},"dt_txt":"2017-12-16 21:00:00"},{"dt":1513468800,"main":{"temp":265.696,"temp_min":265.696,"temp_max":265.696,"pressure":1012.14,"sea_level":1036.2,"grnd_level":1012.14,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":88},"wind":{"speed":4.75,"deg":191.001},"rain":{},"snow":{"3h":0.305},"sys":{"pod":"n"},"dt_txt":"2017-12-17 00:00:00"},{"dt":1513479600,"main":{"temp":267.185,"temp_min":267.185,"temp_max":267.185,"pressure":1011.78,"sea_level":1035.87,"grnd_level":1011.78,"humidity":100,"temp_kf":0},"weather":[{"id":600,"main":"Snow","description":"light snow","icon":"13n"}],"clouds":{"all":88},"wind":{"speed":6.41,"deg":185.501},"rain":{},"snow":{"3h":0.32},"sys":{"pod":"n"},"dt_txt":"2017-12-17 03:00:00"},{"dt":1513490400,"main":{"temp":268.801,"temp_min":268.801,"temp_max":268.801,"pressure":1009.58,"sea_level":1033.61,"grnd_level":1009.58,"humidity":100,"temp_kf":0},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01n"}],"clouds":{"all":88},"wind":{"speed":7.36,"deg":181.5},"rain":{},"snow":{"3h":0.02},"sys":{"pod":"n"},"dt_txt":"2017-12-17 06:00:00"},{"dt":1513501200,"main":{"temp":270.588,"temp_min":270.588,"temp_max":270.588,"pressure":1006.77,"sea_level":1030.67,"grnd_level":1006.77,"humidity":100,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":80},"wind":{"speed":8.06,"deg":189.509},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-17 09:00:00"},{"dt":1513512000,"main":{"temp":271.384,"temp_min":271.384,"temp_max":271.384,"pressure":1004.21,"sea_level":1028.07,"grnd_level":1004.21,"humidity":100,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":92},"wind":{"speed":7.11,"deg":191},"rain":{},"snow":{},"sys":{"pod":"n"},"dt_txt":"2017-12-17 12:00:00"},{"dt":1513522800,"main":{"temp":273.705,"temp_min":273.705,"temp_max":273.705,"pressure":1002.09,"sea_level":1025.84,"grnd_level":1002.09,"humidity":100,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":88},"wind":{"speed":6.55,"deg":202.501},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2017-12-17 15:00:00"},{"dt":1513533600,"main":{"temp":277.177,"temp_min":277.177,"temp_max":277.177,"pressure":999.88,"sea_level":1023.12,"grnd_level":999.88,"humidity":100,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":80},"wind":{"speed":4.96,"deg":236.503},"rain":{},"snow":{},"sys":{"pod":"d"},"dt_txt":"2017-12-17 18:00:00"}]
     * city : {"id":4887398,"name":"Chicago","coord":{"lat":41.85,"lon":-87.6501},"country":"US"}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 4887398
         * name : Chicago
         * coord : {"lat":41.85,"lon":-87.6501}
         * country : US
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static class CoordBean {
            /**
             * lat : 41.85
             * lon : -87.6501
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1513112400
         * main : {"temp":267.08,"temp_min":267.08,"temp_max":267.431,"pressure":1007.31,"sea_level":1031.12,"grnd_level":1007.31,"humidity":100,"temp_kf":-0.35}
         * weather : [{"id":800,"main":"Clear","description":"clear sky","icon":"02d"}]
         * clouds : {"all":8}
         * wind : {"speed":8.22,"deg":305.5}
         * rain : {}
         * snow : {}
         * sys : {"pod":"d"}
         * dt_txt : 2017-12-12 21:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SnowBean snow;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public RainBean getRain() {
            return rain;
        }

        public void setRain(RainBean rain) {
            this.rain = rain;
        }

        public SnowBean getSnow() {
            return snow;
        }

        public void setSnow(SnowBean snow) {
            this.snow = snow;
        }

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 267.08
             * temp_min : 267.08
             * temp_max : 267.431
             * pressure : 1007.31
             * sea_level : 1031.12
             * grnd_level : 1007.31
             * humidity : 100
             * temp_kf : -0.35
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
            }

            public double getTemp_min() {
                return temp_min;
            }

            public void setTemp_min(double temp_min) {
                this.temp_min = temp_min;
            }

            public double getTemp_max() {
                return temp_max;
            }

            public void setTemp_max(double temp_max) {
                this.temp_max = temp_max;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
            }
        }

        public static class CloudsBean {
            /**
             * all : 8
             */

            private int all;

            public int getAll() {
                return all;
            }

            public void setAll(int all) {
                this.all = all;
            }
        }

        public static class WindBean {
            /**
             * speed : 8.22
             * deg : 305.5
             */

            private double speed;
            private double deg;

            public double getSpeed() {
                return speed;
            }

            public void setSpeed(double speed) {
                this.speed = speed;
            }

            public double getDeg() {
                return deg;
            }

            public void setDeg(double deg) {
                this.deg = deg;
            }
        }

        public static class RainBean {
        }

        public static class SnowBean {
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 800
             * main : Clear
             * description : clear sky
             * icon : 02d
             */

            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}
